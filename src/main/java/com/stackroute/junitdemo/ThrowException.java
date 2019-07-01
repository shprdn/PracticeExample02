package com.stackroute.junitdemo;

public class ThrowException {
    public String check(){
        String result="";
        try
        {
            throw new Exception("Exception");
        }
        catch (Exception e)
        {
            result = e.getMessage();
            result=result + "\ncatch statement\n";
        }
        finally {
            result = result + "finally";
        }
        return result;
    }
}
