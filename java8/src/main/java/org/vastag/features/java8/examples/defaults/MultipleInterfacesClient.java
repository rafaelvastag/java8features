package org.vastag.features.java8.examples.defaults;

public class MultipleInterfacesClient implements Interface1, Interface2, Interface3, Interface4 {

    public static void main(String[] args) {
        var client = new MultipleInterfacesClient();
        client.methodA();
        client.methodB();
        client.methodC();
    }

    @Override
    public void methodA() {
        Interface1.super.methodA();
    }

    @Override
    public void methodB() {
        System.out.println("Inside of override implementation in : " + this.getClass());
    }
}
