package com.finepointmobile.rxjavaandroidapp;

/**
 * Created by danielmalone on 8/2/17.
 */

public class Todo {

    private String mFirstName;
    private String mLastName;
    private String mEmail;

    public Todo(String firstName, String lastName, String email) {
        mFirstName = firstName;
        mLastName = lastName;
        mEmail = email;
    }

    public String getFirstName() {
        return mFirstName;
    }

    public void setFirstName(String firstName) {
        mFirstName = firstName;
    }

    public String getLastName() {
        return mLastName;
    }

    public void setLastName(String lastName) {
        mLastName = lastName;
    }

    public String getEmail() {
        return mEmail;
    }

    public void setEmail(String email) {
        mEmail = email;
    }
}
