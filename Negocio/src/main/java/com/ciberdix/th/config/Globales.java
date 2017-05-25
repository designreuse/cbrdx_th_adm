package com.ciberdix.th.config;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class Globales {

    Properties prop = new Properties();
    InputStream input = null;
    private String url = null;

    public Globales() {
        try {
            input = getClass().getClassLoader().getResourceAsStream("application.yml");
            prop.load(input);
            setUrl(prop.getProperty("url")+":"+prop.getProperty("domain.port"));
        } catch (IOException ex) {
            ex.printStackTrace();
        } finally {
            if (input != null) {
                try {
                    input.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    public String getUrl() {
        return url;
    }

    public final void setUrl(String url) {
        this.url = url;
    }
}
