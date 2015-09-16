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
public class Person {
    private final String name;
    private final String surname;
    private final Date birthdate;

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public Date getBirthdate() {
        return birthdate;
    }
    
    public String getFullName(){
        return name + " " + surname;
    }
    
    public int getAge(){
        Date today = new Date();
        return (int) ((today.getTime() - birthdate.getTime())/(1000*60*60*24*365.25));
    }

    public Person(String name, String surname, Date birthdate) {
        this.name = name;
        this.surname = surname;
        this.birthdate = birthdate;
    }
}
