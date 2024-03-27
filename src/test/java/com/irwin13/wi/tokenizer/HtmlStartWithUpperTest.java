package com.irwin13.wi.tokenizer;

import com.irwin13.wi.reader.HtmlReader;
import com.irwin13.wi.reader.SourceReader;
import org.junit.Assert;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class HtmlStartWithUpperTest {

    private static final Logger LOGGER = LoggerFactory.getLogger(HtmlStartWithUpperTest.class);

    @Test
    public void htmlFileWithWordStartWithUpperShouldCount47() throws Exception {
        SourceReader reader = new HtmlReader();
        String content = reader.getContent("essay.html");
        WordTokenizer tokenizer = new WordStartWithUpperCaseTokenizer(content);
        int wordCount = tokenizer.getWordCount();
        LOGGER.debug("wordList = {}", tokenizer.getWordList());
        Assert.assertEquals(47, wordCount);

    }
}
