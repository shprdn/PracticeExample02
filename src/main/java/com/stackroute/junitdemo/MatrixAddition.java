package com.stackroute.junitdemo;

public class MatrixAddition {
    public String addition(int row, int col, int[][] firstArray, int[][] secondArray){
        int i,j;
        String s="";
        int[][] sum = new int[row][col];
       // int [][] sum;
        for (i=0;i<row;i++)
        {
            for (j=0;j<col;j++)
            {
                sum[i][j] =sum[i][j]+ firstArray[i][j] + secondArray[i][j];
                s = s + sum[i][j]+" ";
            }
            s=s+"\n";
        }
        System.out.println(s);
        return s.trim();
    }
}
