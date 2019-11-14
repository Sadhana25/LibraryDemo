package com.activa.one.mylibrary;

public class CustomMath {
    public static int plus(int a,int b){
        return a+b;
    }
    public static int minus(int a,int b){
        return a-b;
    } public static int times(int a,int b){
        return a*b;
    } public static float div(int a,int b){
        if(b==0){
            throw new IllegalArgumentException("Divide by zero");

        }
        else
        return a+b;
    }
}
