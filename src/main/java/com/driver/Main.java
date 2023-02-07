package com.driver;

class A {
  public String meth() {
    return "Invoking method from class A";
  }
}

class B extends A{
  public String meth() {
    return "Method is overridden in Extendend class B";
  }
}

public class Main {
  public static void main(String[] args) {
    A obj = new A();
    System.out.println(obj.meth());
    B obj2 = new B();
    System.out.print(obj2.meth());
  }
}
