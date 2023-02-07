package com.driver;

public class Main {
  public class A {
    public String meth() {
      return "Invoking method from class A";
    }
  }

  public class B extends A{
    public String meth() {
      return "Method is overridden in Extendend class B";
    }
  }
  public static void main(String[] args) {
    A obj = new A();
    obj.meth();
    
    B obj2 = new B();
    obj2.meth();
  }
}
