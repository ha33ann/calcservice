package com.example.demo;

public class mathService {
    public int addition(){
        int sum = 5+5;
        return sum;
    }
    private String addDescription(){
        return "Metoden /add [GET] adderar två tal ";
    }
    public int subtraction(){
        int sum = 10-5;
        return sum;
    }
    private String subDescription(){
        return "Metoden /subtraction [GET] subtraherar två tal";
    }
    public int multiplication(){
        int sum = 10*5;
        return sum;
    }
    private String multiDescription(){
        return "Metoden /multi [GET] multiplicerar två tal";
    }
    public int division(){
        int sum = 10/5;
        return sum;
    }
    private String divDescription(){
        return "Metoden /divi [GET] dividerar två tal";
    }
    public String Description(){
        return addDescription() + "\r\n" 
        + subDescription() + "\r\n" 
        + multiDescription() + "\r\n" 
        + divDescription() + "\r\n";
    }
}
