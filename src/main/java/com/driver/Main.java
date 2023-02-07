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
    obj.meth();
    
    B obj2 = new B();
    obj2.meth();
  }
}
