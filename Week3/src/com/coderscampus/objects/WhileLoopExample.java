package com.coderscampus.objects;

import java.util.Calendar;
import java.util.Date;

public class WhileLoopExample {

    void whileLoopExample1 () {

        //while (boolean expression here) {

        int i = 0;
        while (i < 10) {
            System.out.println(i);
            i++;
        }

        System.out.println("While loop completed");
    }

    void whileLoopExample2 () {
//        Calendar cal = Calendar.getInstance();
//        cal.set(Calendar.YEAR, 2019);
//        cal.set(Calendar.MONTH, Calendar.NOVEMBER);
//        cal.set(Calendar.DAY_OF_MONTH, 19);
//        Date dateRepresentation = cal.getTime();
//        System.out.println(dateRepresentation);

        Date now = new Date();
        Date stopNow = new Date(119, 10, 19, 21, 14, 00);
        System.out.println(now);
        System.out.println(stopNow);

        int i = 0;
        while (now.before(stopNow)) {
            i++;
            System.out.println(i + ": " + now);
            now = new Date();

        }

    }

}
