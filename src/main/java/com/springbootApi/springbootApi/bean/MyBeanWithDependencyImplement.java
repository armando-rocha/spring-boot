package com.springbootApi.springbootApi.bean;

public class MyBeanWithDependencyImplement implements MyBeanWithDependency{
    private MyOperation myOperation;

    public MyBeanWithDependencyImplement(MyOperation myOperation) {
    this.myOperation = myOperation;
    }

    @Override
    public void printWithDependency() {
        int numero = 12;
        System.out.println(myOperation.suma(numero));
        System.out.println("Hola desde mi BEAN con dependencia");

    }
}
