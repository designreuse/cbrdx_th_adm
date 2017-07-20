package com.ciberdix.th.services;

import org.springframework.core.io.ByteArrayResource;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.util.LinkedMultiValueMap;
import org.springframework.util.MultiValueMap;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.multipart.MultipartFile;
import com.ciberdix.th.model.Greeting;

import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.concurrent.atomic.AtomicLong;

/**
 * Created by vlaro on 20/07/2017.
 */
public class AlfrescoServiceImpl implements AlfrescoService {

    private static final String template = "Hello, %s!";
    private final AtomicLong counter = new AtomicLong();

    public Greeting saveFileAlfresco(MultipartFile file){
        RestTemplate restTemplate = new RestTemplate();
        URI uri = null;
        try {
            uri = new URI("http://localhost:8081/uploadFile");
        } catch (URISyntaxException e) {
            System.out.println("URI is a malformed URL");
        }

        HttpHeaders headers = new HttpHeaders();
        headers.setContentType(MediaType.MULTIPART_FORM_DATA);

        MultiValueMap<String, Object> map = new LinkedMultiValueMap<String, Object>();


        map.add("name", file.getOriginalFilename());
        map.add("filename", file.getOriginalFilename());
        ByteArrayResource contentsAsResource = null;
        try {
            contentsAsResource = new ByteArrayResource(file.getBytes()){
                @Override
                public String getFilename(){
                    return file.getOriginalFilename();
                }
            };
        } catch (IOException e) {
            e.printStackTrace();
        }
        map.add("file", contentsAsResource);
        map.add("dirpath","/test/crezcamos");
        HttpEntity<?> requestEntity = new HttpEntity<Object>(map, headers);

        String result = restTemplate.postForObject(uri, requestEntity, String.class);
        return new Greeting(counter.incrementAndGet(),
                String.format(template, result + ":" +file.getOriginalFilename()));

    }
}