package com.example.mvvm.model;

public class HelloModel {

    private final String [] labels = {"Hello", "Hi", "Welcome"};

    public String pickRandomLabel() { return labels[randomIndex()];}

    private int randomIndex() { return (int)(Math.random() * labels.length);}
}
