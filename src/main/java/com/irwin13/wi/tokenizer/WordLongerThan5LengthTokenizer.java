package com.irwin13.wi.tokenizer;

public class WordLongerThan5LengthTokenizer extends WordTokenizer {

    public WordLongerThan5LengthTokenizer(String content) {
        super(content);
    }

    @Override
    public boolean validWord(String word) {
        if (word == null || word.isEmpty()) {
            return false;
        }
        return word.length() > 5;
    }
}
