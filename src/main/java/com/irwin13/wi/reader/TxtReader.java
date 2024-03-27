package com.irwin13.wi.reader;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class TxtReader implements SourceReader {

    @Override
    public String getContent(String filePath) throws IOException {
        return new String(Files.readAllBytes(Paths.get(filePath)));
    }

}
