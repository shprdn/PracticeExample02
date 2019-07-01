package com.stackroute.junitdemo;
import java.util.Arrays;
public class ConsecutiveNumbers {
    public static String checkSeries(int[] num)
    {
        int i=0;
        Arrays.sort(num);
        for (i=0;i<num.length-1;i++)
        {
            if (num[i]==num[i+1]-1)
                continue;
         /* else if(num[i]==num[i+1]+1)
                continue;

          */
            else
                return "non consecutive numbers";
        }
        return "consecutive numbers";

    }
}
