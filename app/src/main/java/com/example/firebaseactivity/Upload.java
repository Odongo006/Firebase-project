package com.example.firebaseactivity;

import android.widget.EditText;
import android.widget.ImageView;

public class Upload {
    private  String mProfile;
    private String enterName;
    private int enterPhoneNumber;
    private String enterEmailAddress;


    public Upload() {

        //empty constructor needed//
    }

    public Upload(String mProfile, String enterName, int enterPhoneNumber, String enterEmailAddress) {
        this.mProfile = mProfile;
        this.enterName = enterName;
        this.enterPhoneNumber = enterPhoneNumber;
        this.enterEmailAddress = enterEmailAddress;
    }

    public String getmProfile() {
        return mProfile;
    }

    public String getEnterName() {
        return enterName;
    }

    public int getEnterPhoneNumber() {
        return enterPhoneNumber;
    }

    public String getEnterEmailAddress() {
        return enterEmailAddress;
    }

    public void setmProfile(String mProfile) {
        this.mProfile = mProfile;
    }

    public void setEnterName(String enterName) {
        this.enterName = enterName;
    }

    public void setEnterPhoneNumber(int enterPhoneNumber) {
        this.enterPhoneNumber = enterPhoneNumber;
    }

    public void setEnterEmailAddress(String enterEmailAddress) {
        this.enterEmailAddress = enterEmailAddress;
    }

}
