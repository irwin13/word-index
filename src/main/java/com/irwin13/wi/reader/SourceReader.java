package com.irwin13.wi.reader;

import java.io.IOException;

public interface SourceReader {

    String getContent(String filePath) throws IOException;

}
