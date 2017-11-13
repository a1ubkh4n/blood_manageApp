package com.a1ubkh4n.helpingbirdsofdiit;

/**
 * Created by Md.Aiub Khan on 08-Feb-17.
 */

public class list {
        private String mName;
        private String mMbl;
        private String mBatch;
        private String mResidence;
        private String mExperience;
        private int mImageResourceId = NO_IMAGE_PROVIDED;

        private static final int NO_IMAGE_PROVIDED = -1;


        public list (String name, String mbl, String batch, String residence, String experience) {
            mName = name;
            mMbl = mbl;
            mBatch = batch;
            mResidence = residence;
            mExperience = experience;

        }

        public list (String name, String mbl, String batch, String residence, String experience,int imageId) {
            mName = name;
            mMbl = mbl;
            mBatch = batch;
            mResidence = residence;
            mExperience = experience;
            mImageResourceId = imageId;
        }

        public String getName() {
            return mName;
        }


        public String getmbl() {
            return mMbl;
        }

        public String getBatch() {
            return mBatch;
        }

        public String getResidence () {
        return mResidence;
    }

        public String getExperience() {
        return mExperience;
    }

        public int getImageResourceId() {
            return mImageResourceId;
        }

        public boolean hasImage() {
            return mImageResourceId != NO_IMAGE_PROVIDED;
        }
}

