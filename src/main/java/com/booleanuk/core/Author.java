package com.booleanuk.core;

public class Author {
    String name;
    String contactInfo;
    String website;

    public Author(String name, String contactInfo, String website){
        this.name = name;
        this.contactInfo = contactInfo;
        this.website = website;
    }

    public String getName(){
        return this.name;
    }

    public String getContactInfo(){
        return this.contactInfo;
    }

    public String getWebsite(){
        return this.website;
    }
}
