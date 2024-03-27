package com.irwin13.wi.tokenizer;

import com.irwin13.wi.reader.SourceReader;
import com.irwin13.wi.reader.TxtReader;
import org.junit.Assert;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class TxtLongerThan5Test {

    private static final Logger LOGGER = LoggerFactory.getLogger(TxtLongerThan5Test.class);

    @Test
    public void txtFileWithWordLongerThan5ShouldCount31() throws Exception {
        SourceReader reader = new TxtReader();
        String content = reader.getContent("lorem.txt");
        WordTokenizer tokenizer = new WordLongerThan5LengthTokenizer(content);
        int wordCount = tokenizer.getWordCount();
        LOGGER.debug("wordList = {}", tokenizer.getWordList());
        Assert.assertEquals(31, wordCount);

    }
}
