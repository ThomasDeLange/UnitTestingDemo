package nl.avans;

import java.time.LocalDate;
import java.time.Period;

public class Person {
    private String postalCode;
    private LocalDate birthdate;

    public Person() {

    }

    public boolean setPostalCode(String postalCode) {
        if(postalCode.matches("[1-9][0-9]{3} *[A-Za-z]{2}")){
            this.postalCode=postalCode;
            return true;
        }
        return false;
    }

    public void setBirthday(LocalDate birthdate) {
        this.birthdate = birthdate;
    }

    public int getAge() {
        return Period.between(birthdate, LocalDate.now()).getYears();
    }

    public int getDaysUntilBirthday() {
        return Period.between(LocalDate.of(LocalDate.now().getYear(),this.birthdate.getMonth(),this.birthdate.getDayOfMonth()), LocalDate.now()).getDays();
    }
}
