package com.irwin13.wi.reader;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class HtmlReader implements SourceReader {

    @Override
    public String getContent(String filePath) throws IOException {
        String html = new String(Files.readAllBytes(Paths.get(filePath)));
        Document doc = Jsoup.parse(html);
        String content = doc.body().text();
        return content;
    }
    
}
