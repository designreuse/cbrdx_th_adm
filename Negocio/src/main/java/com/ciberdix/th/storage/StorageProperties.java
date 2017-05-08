package com.ciberdix.th.storage;

import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * Created by robertochajin on 5/05/17.
 */
@ConfigurationProperties("storage")
public class StorageProperties {

    /**
     * Folder location for storing files
     */
    private String location = "upload-dir";

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

}
