package com.codeworx.entity;

/**
 * Created by gwokudasam on 10-Dec-16.
 */
public class User {
    private String firstName;
    private String lastName;
    private String emailAddress;

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }

    public String getFirstName() {

        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getEmailAddress() {
        return emailAddress;
    }
}
