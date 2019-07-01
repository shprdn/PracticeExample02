package com.stackroute.junitdemo;

public class RemoveVowel {
    public static String remove(String[] name) {
        int i, j, t = 0, k = 0;
        //    String[] list= new String[name.length];
        String temp = "";
        for (i = 0; i < name.length; i++) {
           /* temp = "";
            for (j=0;j<name[i].length();j++)
            {
                if(name[i].charAt(j)=='a' || name[j].charAt(j)=='e' || name[j].charAt(j)=='i' || name[j].charAt(j)=='o' || name[j].charAt(j)=='u')
                {
                    continue;
                }
                else {
                    temp += Character.toString(name[i].charAt(j));
                }
            }
            list[i] = temp;
        }
        System.out.println(list);
        return list;

            */
            //  name[i].replaceAll("a|e|i|o|u", "");
            temp = temp + "Place Name without Vowels:" + i + name[i].replaceAll("a|e|i|o|u", "")+"\n";
        }
        return temp;
    }
}