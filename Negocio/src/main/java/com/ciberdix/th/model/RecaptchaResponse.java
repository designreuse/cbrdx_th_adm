package com.ciberdix.th.model;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Collection;

/**
 * Created by robertochajin on 20/04/17.
 */
public class RecaptchaResponse {
    @JsonProperty("success")
    private boolean success;

    @JsonProperty("error-codes")
    private Collection<String> errorCodes;

    public RecaptchaResponse() {
        this.success = false;
    }

    public boolean isSuccess() {
        return success;
    }

    public void setSuccess(boolean success) {
        this.success = success;
    }

    public Collection<String> getErrorCodes() {
        return errorCodes;
    }

    public void setErrorCodes(Collection<String> errorCodes) {
        this.errorCodes = errorCodes;
    }
}
