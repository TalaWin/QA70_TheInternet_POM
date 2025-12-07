package com.theinternet.tests.utils;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public final class FileHelper {

    private FileHelper() {
    }


    public static String getResourceAbsolutePath(String fileName) {
        return getResourcePath(fileName)
                .toAbsolutePath()
                .toString();
    }


    public static Path getResourcePath(String fileName) {
        return Paths.get("src", "test", "resources", fileName);
    }


    public static boolean resourceExists(String fileName) {
        return Files.exists(getResourcePath(fileName));
    }
}
