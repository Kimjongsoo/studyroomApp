package com.example.studyroom;

public class ManageContents {
    private String strDate;
    private String strContents;

    public ManageContents(String strDate, String strContents){
        this.strDate = strDate;
        this.strContents = strContents;
    }
    public String getDate(){
        return this.strDate;
    }
    public String getContents(){
        return this.strContents;
    }
}
