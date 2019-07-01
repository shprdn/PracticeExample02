package com.stackroute.junitdemo;

public class Exception_Demo {
    public String multiple(Integer arrSize){
      //  String s=null;
       // int[] arr = {1,2,3,4,5};
       // int n=-4;
        try
        {
            int[] myArray = new int[arrSize];
            System.out.println(myArray[arrSize+1]);
            return "the array is" +myArray;

        }
        catch (NullPointerException e)
        {
            return("NullPointerException Caught");
        }
        catch (IndexOutOfBoundsException e)
        {
            return("IndexOutOfBoundException caught");
        }
        catch (NegativeArraySizeException e)
        {
           return("NegativeArraySizeException caught");
        }

    }
}
