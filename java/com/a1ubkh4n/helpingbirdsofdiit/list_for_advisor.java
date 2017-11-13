package com.a1ubkh4n.helpingbirdsofdiit;

/**
 * Created by Md.Aiub Khan on 08-Feb-17.
 */

public class list_for_advisor {
    private String mName2;
    private String mMbl2;
    private String mBatch2;
    private String mResidence2;
    private String mExperience2;
    private int mImageResourceId2 = NO_IMAGE_PROVIDED;

    private static final int NO_IMAGE_PROVIDED = -1;


    public list_for_advisor (String name2, String mbl2,String batch2, String residence2, String experience2) {
        mName2 = name2;
        mMbl2 = mbl2;
        mBatch2 = batch2;
        mResidence2 = residence2;
        mExperience2 = experience2;

    }

    public list_for_advisor (String name2, String mbl2, String batch2, String residence2, String experience2,int imageId2) {
        mName2 = name2;
        mMbl2 = mbl2;
        mBatch2 = batch2;
        mResidence2 = residence2;
        mExperience2 = experience2;
        mImageResourceId2 = imageId2;
    }

    public String getName2() {
        return mName2;
    }


    public String getmbl2() {
        return mMbl2;
    }

    public String getBatch2() {
        return mBatch2;
    }

    public String getResidence2() {
        return mResidence2;
    }

    public String getExperience2() {
        return mExperience2;
    }

    public int getImageResourceId2() {
        return mImageResourceId2;
    }

    public boolean hasImage2() {
        return mImageResourceId2 != NO_IMAGE_PROVIDED;
    }
}

