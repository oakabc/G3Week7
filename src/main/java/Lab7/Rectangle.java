/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Lab7;

/**
 *
 * @author chanakarnkingkaew
 */
public class Rectangle extends Shape {
    
    
    // Instance variable (object)
    protected double width; // ความกว้าง
    protected double length; // ความยาว
    
    // Constructor
    
    public Rectangle () {
        width = 0.0;
        length = 0.0;
    }
    
    public Rectangle (double width, double length) {
    
        this.width = width;
        this.length = length;
    
    }
    
    public Rectangle (double width, double length, String color, boolean filled) {
    
        super(color, filled);
        this.width = width;
        this.length = length;
    
    }
    
    // Mutator Method (set)
    
    public void setWidth(double width) {
    
        this.width = width;
    }
    
    public void setLength (double length) {
    
        this.length = length;
    }
    
    // Accessor Method (get)
    
    public double getWidth() {
    
        return width;
    }
    
    public double getLength() {
        return length;
    }
    
    @Override
    public double getArea() {
    
        return width*length;
    }

    @Override
    public double getPerimeter() {
     
        return (width+length)*2;
    }
    
    @Override
    public String toString() {
    
        return "A Rectangle with width="+ width +" and length=" + length+ ", which is a subclass of " + super.toString();
    
    }
    
    
}
