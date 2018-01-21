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
public class Zoo {
    
    public static void main (String args[]) {
        Animal animal1 = new Animal(12, "M", 23);
        animal1.eat();
                
        Bird bird1 = new Bird();
        bird1.fly();
        
    }
}
