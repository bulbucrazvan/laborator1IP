package com.company;

public  abstract class Animal {
    String type, name;
    public abstract void wake();
    public String getType(){
        return type;
    }
    public String getName(){
        return name;
    }
}
