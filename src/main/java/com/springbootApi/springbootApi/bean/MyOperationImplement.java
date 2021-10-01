package com.springbootApi.springbootApi.bean;

public class MyOperationImplement implements MyOperation{
    @Override
    public int suma(int number) {
        return number + number;
    }
}
