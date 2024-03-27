package com.irwin13.wi.tokenizer;

public class WordStartWithUpperCaseTokenizer extends WordTokenizer {

    public WordStartWithUpperCaseTokenizer(String content) {
        super(content);
    }

    @Override
    public boolean validWord(String word) {
        if (word == null || word.isEmpty()) {
            return false;
        }
        return Character.isUpperCase(word.charAt(0));
    }
}
