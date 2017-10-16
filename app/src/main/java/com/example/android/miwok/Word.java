package com.example.android.miwok;

/**
 * {@link Word} represents a vocabulary word with a default translation and a Miwok translation
 */

public class Word {

    private String mDefaultWord;
    private String mMiwokWord;

    public Word(String defaultWord, String miwokWord) {
        mMiwokWord = miwokWord;
        mDefaultWord = defaultWord;
    }

    /*
     * Return the default translation of the word
     */
    public String getDefaultWord() {
        return mDefaultWord;
    }

    /*
     * Return the miwok translation of the word
     */
    public String getMiwokWord() {
        return mMiwokWord;
    }
}
