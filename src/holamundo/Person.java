/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package holamundo;

import java.util.Calendar;
import java.util.GregorianCalendar;
//import java.util.Date;

/**
 *
 * @author usuario
 */
public class Person {
    private final String name;
    private final String surname;
    private final Calendar birthdate;
    private static long MILLESECON_PER_YEAR = (long) (1000*60*60*24*365.25);

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public Calendar getBirthdate() {
        return birthdate;
    }
    
    public String getFullName(){
        return name + " " + surname;
    }
    
    public int getAge(){
        Calendar today = GregorianCalendar.getInstance();
        return (int) (getMillis(today.getTimeInMillis() - birthdate.getTimeInMillis()));
    }
    
    private long getMillis(long milli){
        return milli/MILLESECON_PER_YEAR;
    }
    public Person(String name, String surname, Calendar birthdate) {
        this.name = name;
        this.surname = surname;
        this.birthdate = birthdate;
    }
}
