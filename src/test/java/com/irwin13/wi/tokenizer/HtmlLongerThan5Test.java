package com.irwin13.wi.tokenizer;

import com.irwin13.wi.reader.HtmlReader;
import com.irwin13.wi.reader.SourceReader;
import com.irwin13.wi.reader.TxtReader;
import org.junit.Assert;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class HtmlLongerThan5Test {

    private static final Logger LOGGER = LoggerFactory.getLogger(HtmlLongerThan5Test.class);

    @Test
    public void htmlFileWithWordLongerThan5ShouldCount131() throws Exception {
        SourceReader reader = new HtmlReader();
        String content = reader.getContent("essay.html");
        WordTokenizer tokenizer = new WordLongerThan5LengthTokenizer(content);
        int wordCount = tokenizer.getWordCount();
        LOGGER.debug("wordList = {}", tokenizer.getWordList());
        Assert.assertEquals(131, wordCount);

    }
}
