package com.irwin13.wi.tokenizer;

import java.util.LinkedList;
import java.util.List;
import java.util.StringTokenizer;

public abstract class WordTokenizer {

    private List<String> wordList = new LinkedList<>();

    abstract boolean validWord(String word);

    public WordTokenizer(String content) {
        StringTokenizer tokenizer = new StringTokenizer(content, " \t\n\r\f,.");
        while (tokenizer.hasMoreElements()) {
            String word = tokenizer.nextToken();
            if (validWord(word)) {
                wordList.add(word);
            }
        }
    }

    public int getWordCount() {
        return wordList.size();
    }

    public List<String> getWordList() {
        return wordList;
    }
}
