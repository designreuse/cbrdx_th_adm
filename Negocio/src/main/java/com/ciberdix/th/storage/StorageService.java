package com.ciberdix.th.storage;

import org.springframework.core.io.Resource;
import org.springframework.web.multipart.MultipartFile;

import java.nio.file.Path;
import java.util.stream.Stream;

/**
 * Created by robertochajin on 5/05/17.
 */
public interface StorageService {

    void init();

    String store(MultipartFile file);

    String store(MultipartFile file, String route);

    Stream<Path> loadAll();

    Path load(String filename);

    Resource loadAsResource(String filename);

    void deleteAll();

}
