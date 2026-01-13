package com.project.main;

public class equalTo {
    public static void main(String args[]){

        String s1 = "kohli";
        String s2 = "kohli";
        String s3 = new String("kohli");

        System.out.println(s1 == s2);
        System.out.println(s1 == s3);
        System.out.println(s1.equals(s3)); //this method only checks
                                          // for the values content but not the refences.
        }
}
