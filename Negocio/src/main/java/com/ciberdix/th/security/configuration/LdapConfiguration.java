package com.ciberdix.th.security.configuration;

import com.ciberdix.th.config.Globales;
import com.ciberdix.th.controllers.UtilitiesController;
import com.ciberdix.th.model.Constantes;
import org.springframework.web.client.RestTemplate;

import java.util.Arrays;
import java.util.List;

public class LdapConfiguration {
    Globales globales = new Globales();
    private String serviceUrl = globales.getUrl();

    private String constantServiceUrl = serviceUrl + "/api/constantes/";
    private String uldap = "";
    private String ldaps = "";
    private String ldape = "";
    private boolean ldapEnable = false;
    private boolean startEnable = false;
    private boolean endEnable = true;
    private String ldapc = "";

    public LdapConfiguration() {
        RestTemplate restTemplate = new RestTemplate();
        List<Constantes> constantes = Arrays.asList(restTemplate.getForObject(constantServiceUrl, Constantes[].class));
        for (Constantes c : constantes) {
            if (c.getConstante().compareTo("LDAP") == 0) {
                if (c.getValor().compareTo("0") == 0) {
                    ldapEnable = false;
                } else {
                    ldapEnable = true;
                }
            }
            if (c.getConstante().compareTo("ULDAP") == 0) {
                uldap = c.getValor();
            }
            if (c.getConstante().compareTo("DOMI") == 0) {
                if (c.getValor().compareTo("0") == 0) {
                    startEnable = true;
                    endEnable = false;
                } else {
                    startEnable = false;
                    endEnable = true;
                }
            }
            if (c.getConstante().compareTo("LDAPS") == 0) {
                ldaps = c.getValor();
            }
            if (c.getConstante().compareTo("LDAPE") == 0) {
                ldape = c.getValor();
            }
            if (c.getConstante().compareTo("LDAPC") == 0) {
                ldapc = c.getValor();
            }
        }
    }

    public String getUldap() {
        return uldap;
    }

    public void setUldap(String uldap) {
        this.uldap = uldap;
    }

    public String getLdaps() {
        return ldaps;
    }

    public void setLdaps(String ldaps) {
        this.ldaps = ldaps;
    }

    public String getLdape() {
        return ldape;
    }

    public void setLdape(String ldape) {
        this.ldape = ldape;
    }

    public boolean isLdapEnable() {
        return ldapEnable;
    }

    public void setLdapEnable(boolean ldapEnable) {
        this.ldapEnable = ldapEnable;
    }

    public boolean isStartEnable() {
        return startEnable;
    }

    public void setStartEnable(boolean startEnable) {
        this.startEnable = startEnable;
    }

    public boolean isEndEnable() {
        return endEnable;
    }

    public void setEndEnable(boolean endEnable) {
        this.endEnable = endEnable;
    }

    public String getLdapc() {
        return ldapc;
    }

    public void setLdapc(String ldapc) {
        this.ldapc = ldapc;
    }
}
