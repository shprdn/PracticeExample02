package com.stackroute.junitdemo;

public class StudentMarks {
    public static String checkGrade(int numOfStudents, int [] stuGrades)
    {
        int i=0;
        for (i=0;i<numOfStudents;i++)
        {
            if(stuGrades[i]>0 && stuGrades[i]<=100)
                return "grade is in the range of 0-100";
            else
                return "error";
        }
        if (stuGrades==null)
            return "null";
        return "";
    }
}
