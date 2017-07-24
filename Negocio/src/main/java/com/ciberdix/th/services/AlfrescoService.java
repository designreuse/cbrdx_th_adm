package com.ciberdix.th.services;


import com.ciberdix.th.model.Greeting;
import org.springframework.core.io.ByteArrayResource;
import org.springframework.util.MultiValueMap;
import org.springframework.web.multipart.MultipartFile;

/**
 * Created by vlaro on 20/07/2017.
 */
public interface AlfrescoService {
    public String saveFileAlfresco(MultipartFile file, MultiValueMap<String, String> rawHeaders);
    public String getFileInfoAlfresco(String IdFile);
    public String deleteFileInfoAlfresco(String IdFile);
    public ByteArrayResource getFileContent(String IdFile);
}