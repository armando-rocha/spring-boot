package com.springbootApi.springbootApi.bean;

public class MyBeanImplement implements MyBean{
    @Override
    public void print() {
        System.out.println("Hola desde mi implementacion propia del bean");;
    }
}
