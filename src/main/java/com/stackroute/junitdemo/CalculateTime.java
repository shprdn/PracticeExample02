
package com.stackroute.junitdemo;
import java.util.Calendar;
import java.time.*;
import java.util.*;
import java.text.*;
public class CalculateTime {
    public static String time()
    {
        String s="";
        Calendar c = Calendar.getInstance();

// Set the calendar to monday of the current week
        c.set(Calendar.DAY_OF_WEEK, Calendar.MONDAY);

// Print dates of the current week starting on Monday
        DateFormat df = new SimpleDateFormat("EEE dd/MM/yyyy");
        s = s +df.format(c.getTime());
        for (int i = 0; i < 6; i++) {
            c.add(Calendar.DATE, 1);
        }
        s =s +(df.format(c.getTime()));
        return s;
    }
}

