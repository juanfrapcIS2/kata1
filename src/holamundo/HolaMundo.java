/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package holamundo;

import java.util.Calendar;
//import java.util.Date;
import java.util.GregorianCalendar;

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
        System.out.println("Cause I'm an evil Java program");
        
        Person p1;
        Calendar f1;
        f1 = GregorianCalendar.getInstance();
        f1.set(1964,7,3);
        System.out.println("");
        p1 = new Person("Mariponsio", "de Chaar", f1);
        System.out.println(p1.getAge());    
    }
}
