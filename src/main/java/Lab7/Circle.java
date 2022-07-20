/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Lab7;

/**
 *
 * @author chanakarnkingkaew
 */
public class Circle extends Shape {

    protected double radius;
    
    public Circle () {
    
    }
    
    public Circle(double radius) {
    
        this.radius = radius;
    
    }
    
    public Circle (double radius, String color, boolean filled ) {
    
        super(color, filled);
        this.radius = radius;
    }
    
    // Accessor
    public double getRadius () {
    
    return radius;
    }
    
    // Mutator
    public void setRadius (double radius) {
    
        this.radius = radius;
    }
    
    @Override
    public double getArea() {
        
        return Math.PI*Math.pow(radius, 2);
    }

    @Override
    public double getPerimeter() {
    
        return 2*Math.PI*radius;
    }
    
    @Override
    public String toString() {
    
    
        return "A Circle with radius="+ radius +", which is a subclass of " +super.toString() ;
    }
    
    
    
    
    
}
