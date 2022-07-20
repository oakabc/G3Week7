/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author chanakarnkingkaew
 */
class A {

    public void method() {

        System.out.println("Invoke from A");

    }
}

class B extends A {

    @Override
    public void method() {

        System.out.println("Invoke from B");

    }

}

public class Binding {

    public static void main(String[] args) {
        A a = new A ();
        a.method();
        A b = new B ();
        b.method();

    }

}
