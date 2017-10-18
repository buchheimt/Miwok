package com.example.android.miwok;

/**
 * {@link Word} represents a vocabulary word with a default translation and a Miwok translation
 */

public class Word {

    private String mDefaultWord;
    private String mMiwokWord;
    private int mAudioResourceId;
    private int mImageResourceId = NO_IMAGE;

    private static final int NO_IMAGE = -1;

    /**
     * Create a new Word object.
     *
     * @param defaultTranslation is the word in a language that the user is already familiar with
     *                           (such as English)
     * @param miwokTranslation is the word in the Miwok language
     * @param audioResourceId is the associated audio file
     */
    public Word(String defaultWord, String miwokWord, int audioResourceId) {
        mDefaultWord = defaultWord;
        mMiwokWord = miwokWord;
        mAudioResourceId = audioResourceId;
    }

    /**
     * Create a new Word object.
     *
     * @param defaultTranslation is the word in a language that the user is already familiar with
     *                           (such as English)
     * @param miwokTranslation is the word in the Miwok language
     * @param imageResourceId is the associated image
     * @param audioResourceId is the associated audio file
     */
    public Word(String defaultWord, String miwokWord, int imageResourceId, int audioResourceId) {
        mDefaultWord = defaultWord;
        mMiwokWord = miwokWord;
        mImageResourceId = imageResourceId;
        mAudioResourceId = audioResourceId;
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

    /*
     * Return the image resource id associated with the word
     */
    public int getImageResourceId() {
        return mImageResourceId;
    }

    public int getAudioResourceId() {
        return mAudioResourceId;
    }

    public boolean hasImage() {
        return mImageResourceId != NO_IMAGE;
    }
}
