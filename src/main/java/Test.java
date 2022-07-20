/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author chanakarnkingkaew
 */
class Animal {
    
    
    public void m1(Object o){
    
        System.out.println("o");
    }
    
    public void m1(String s){
    
        System.out.println("s");
    }
    
//    public void m1(StringBuffer sb) {
//    
//    System.out.println("sb");
//    
//    }
    
}
public class Test {
    
    
    public static void main(String[] args) {
        
        Animal a = new Animal();
        
        a.m1(new Object()); // o
        a.m1("Oak"); // s
        a.m1(null); // ?
           
        
    }
    
}

