package com.irwin13.wi;

import com.irwin13.wi.reader.HtmlReader;
import com.irwin13.wi.reader.TxtReader;
import com.irwin13.wi.tokenizer.WordLongerThan5LengthTokenizer;
import com.irwin13.wi.tokenizer.WordStartWithUpperCaseTokenizer;
import com.irwin13.wi.tokenizer.WordTokenizer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class App {

    private static final Logger LOGGER = LoggerFactory.getLogger(App.class);

    public static void main(String[] args) throws Exception {
        LOGGER.info("word-index app starting ...");

        if (args.length == 0) {
            LOGGER.error("Invalid argument. Please provide at least one file input");
            System.exit(0);
        }

        for (int i = 0; i < args.length; i++) {
            String filePath = args[i];
            LOGGER.info("======= Processing file '{}' =======", filePath);
            String content;
            if (filePath.endsWith("html") || filePath.endsWith("htm")) {
                content = new HtmlReader().getContent(filePath);
            } else {
                // default to txt file
                content = new TxtReader().getContent(filePath);
            }

            WordTokenizer upper = new WordStartWithUpperCaseTokenizer(content);
            LOGGER.info("File = '{}' has {} words that start with upper case letter",
                    filePath, upper.getWordCount());

            WordTokenizer longerThan5 = new WordLongerThan5LengthTokenizer(content);
            LOGGER.info("File = '{}' list of words that are longer than 5 characters = {}",
                    filePath, longerThan5.getWordList());

            LOGGER.info("======= Finished processing file '{}' =======", filePath);

        }

        LOGGER.info("word-index app finished");
    }
}
