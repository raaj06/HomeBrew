package jodaTimeConcept;


import java.time.*;


public class Joda {

    public static void main(String[] args) {

        LocalTime time = LocalTime.now();
        LocalDate date = LocalDate.now();
        LocalDateTime li = LocalDateTime.now();

        System.out.println(time);
        System.out.println(date);
        System.out.println(li);
    }
}
