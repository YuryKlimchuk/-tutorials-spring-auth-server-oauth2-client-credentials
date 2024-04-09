package com.hydroyura.tutorials.springauthserver.sharedlibs;

public class Author {

    private String firstname, lastname;


    public Author() {}


    public String getFirstname() {
        return firstname;
    }

    public Author setFirstname(String firstname) {
        this.firstname = firstname;
        return this;
    }

    public String getLastname() {
        return lastname;
    }

    public Author setLastname(String lastname) {
        this.lastname = lastname;
        return this;
    }

}
