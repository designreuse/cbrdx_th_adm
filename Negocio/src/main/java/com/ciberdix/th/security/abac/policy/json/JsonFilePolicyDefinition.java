package com.ciberdix.th.security.abac.policy.json;

import java.io.File;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URISyntaxException;
import java.net.URL;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.List;

import javax.annotation.PostConstruct;

import com.ciberdix.th.security.abac.policy.PolicyDefinition;
import com.ciberdix.th.security.abac.policy.PolicyRule;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.expression.Expression;
import org.springframework.stereotype.Component;

import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.module.SimpleModule;

/**
 * Created by robertochajin on 21/04/17.
 */
@Component("jsonFilePolicyDefinition")
public class JsonFilePolicyDefinition implements PolicyDefinition {

    private static Logger logger = LoggerFactory.getLogger(JsonFilePolicyDefinition.class);

    private static String DEFAULT_POLICY_FILE_NAME = "default-policy.json";

    @Value("${policy.json.filePath}")
    private String policyFilePath;

    @Value("${domain.url}")
    private String domainUrl;

    private List<PolicyRule> rules;

    @Override
    public List<PolicyRule> getAllPolicyRules() {
        return rules;
    }

    @Override
    public List<PolicyRule> obtenerReglas() throws MalformedURLException, URISyntaxException {
        ObjectMapper mapper = new ObjectMapper();
        SimpleModule module = new SimpleModule();
        module.addDeserializer(Expression.class, new SpelDeserializer());
        mapper.registerModule(module);

        URL jsonUrl = new URL(domainUrl + "/api/policyRules").toURI().toURL();

        try {
            PolicyRule[] rulesArray = null;

            rulesArray = mapper.readValue(jsonUrl, PolicyRule[].class);

            this.rules = (rulesArray != null ? Arrays.asList(rulesArray) : null);
            //logger.info("Politicas cargadas nuevamente.");
        } catch (JsonMappingException e) {
            logger.error("An error occurred while parsing the policy file.", e);
        } catch (IOException e) {
            logger.error("An error occurred while reading the policy file.", e);
        }

        return this.rules;
    }
}