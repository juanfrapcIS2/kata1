/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package holamundo;

import java.util.Date;

/**
 *
 * @author usuario
 */
public class HolaMundo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Hello World");
        System.out.println("I'm going to destroy humanity");// TODO code application logic here
        System.out.println("Cause I'm a evil Java program");
        
        Person p1;
        p1 = new Person("Mariponsio", "de Chaar", new Date(64,7,3));
        System.out.println(p1.getAge());    
    }
}
