package com.firstchat.chat.zodiac;

/**
 * Created by AkshayeJH on 13/07/17.
 */

public class Friends {

    public String date;
    public String name;

    public Friends(){

    }

    public Friends(String date,String name) {
        this.date = date;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }
}
