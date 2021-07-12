package com.example.chatting_app;
public class chat {
    private String mVersionName;
    private String mVersionNumber;
    private int mImageResourceId;
    public chat(String vName, String vNumber, int imageResourceId)
    {
        mVersionName = vName;
        mVersionNumber = vNumber;
        mImageResourceId = imageResourceId;
    }
    public String getVersionName() {
        return mVersionName;
    }
    public String getVersionNumber() {
        return mVersionNumber;
    }
    public int getImageResourceId() {
        return mImageResourceId;
    }
}