package com.example.foodrecipe;

public class data_holder {
    String FullName, EmailAddress, Password;

    public data_holder(String FullName, String EmailAddress, String Password){
        this.FullName = FullName;
        this.EmailAddress = EmailAddress;
        this.Password = Password;
    }

    public String getFullName() {
        return FullName;
    }

    public void setFullName(String fullName) {
        FullName = fullName;
    }

    public String getEmailAddress() {
        return EmailAddress;
    }

    public void setEmailAddress(String emailAddress) {
        EmailAddress = emailAddress;
    }

    public String getPassword() {
        return Password;
    }

    public void setPassword(String password) {
        Password = password;
    }
}


