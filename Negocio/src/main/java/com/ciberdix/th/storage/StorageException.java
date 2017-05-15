package com.ciberdix.th.storage;

/**
 * Created by robertochajin on 5/05/17.
 */
public class StorageException extends RuntimeException {

    public StorageException(String message) {
        super(message);
    }

    public StorageException(String message, Throwable cause) {
        super(message, cause);
    }
}
