package june14;
import java.util.*;

class A {
    public void foo() {
        System.out.println("A's foo");
    }
}

class B extends A {
    public void foo() {
        System.out.println("B's foo");
    }
    
    public void bar() {
        System.out.println("B's bar");
    }
}

public class Listcheck {
    public static void main(String[] args) {
        A obj = new B();
       
    }
}