/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package human;

/**
 *
 * @author rio197
 */
public class Earth {
    
    public static void main (String args[]) {
        Human tom;
        
        tom = new Human();
        tom.age = 5;
        tom.eyeColor = "brown";
        tom.heightInInches = 72;
        tom.name = "Tom Zsabo";
        
        tom.speak();
        
        Human joe = new Human();
        
        joe.age = 36;
        joe.eyeColor  = "Green";
        joe.name = "Joe Greensilk";
        joe.heightInInches = 68;
        
        joe.speak();
    }
}
