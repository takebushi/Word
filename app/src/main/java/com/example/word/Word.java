package com.example.word;

public class Word {

    int resId;
    String name;

    Word(int resId,String name){
        this.resId =resId;
        this.name = name;
    }

    public String getName(){
        return this.name;
    }
}
