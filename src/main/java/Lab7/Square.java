/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Lab7;

/**
 *
 * @author chanakarnkingkaew
 */
public class Square extends Rectangle { /// สี่เหลี่ยมจตุรัส แปลว่า ด้านเท่ากันทุกด้าน
    
    
    // Constructor
    
    public Square () {
        super(0,0);
    }
    public Square (double side) { // side = ด้าน 
    
        super(side, side);
    }
    
    public Square (double side, String color, boolean filled){
        
        super(side, side, color, filled);
    }
    
    // Accessor Method (get)
    
    public double getSide () {
    
        return super.length;
    }
    
    // Mutator 
    
    public void setSide(double side){
        
        super.setLength(side);
        super.setWidth(side);
    }
    
    @Override
    public void setWidth(double width) {
    
        super.setLength(width);
        super.setWidth(width);
    }
    
    @Override
    public void setLength(double length) {
        super.setLength(length);
        super.setWidth(length);
    
    }
    
    @Override
    public String toString() { // แสดงค่าข้อมูลใน object ตามรูปแบบที่เราต้องการ
    
        return "A Square with side="+ super.getLength() +", which is a subclass of " + super.toString();
    }
    
    
}
