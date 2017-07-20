package com.ciberdix.th.services;


import com.ciberdix.th.model.Greeting;
import org.springframework.web.multipart.MultipartFile;

/**
 * Created by vlaro on 20/07/2017.
 */
public interface AlfrescoService {
    public Greeting saveFileAlfresco(MultipartFile file);
}