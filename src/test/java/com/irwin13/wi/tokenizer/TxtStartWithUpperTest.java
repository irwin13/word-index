package com.irwin13.wi.tokenizer;

import com.irwin13.wi.reader.SourceReader;
import com.irwin13.wi.reader.TxtReader;
import org.junit.Assert;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class TxtStartWithUpperTest {

    private static final Logger LOGGER = LoggerFactory.getLogger(TxtStartWithUpperTest.class);

    @Test
    public void txtFileWithWordStartWithUpperShouldCount13() throws Exception {
        SourceReader reader = new TxtReader();
        String content = reader.getContent("lorem.txt");
        WordTokenizer tokenizer = new WordStartWithUpperCaseTokenizer(content);
        int wordCount = tokenizer.getWordCount();
        LOGGER.debug("wordList = {}", tokenizer.getWordList());
        Assert.assertEquals(13, wordCount);

    }
}
