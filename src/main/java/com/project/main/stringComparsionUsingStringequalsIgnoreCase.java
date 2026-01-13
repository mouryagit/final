package com.project.main;

public class stringComparsionUsingStringequalsIgnoreCase {
    public static void main(String args[]){
        String s1 ="Ram";
        String s2 ="RAm";
        boolean equalsResult = s1.equals(s2);
        System.out.println("usingEquals method: " + equalsResult);

        boolean equalsIgnorecaseResult = s1.equalsIgnoreCase(s2);
        System.out.println("using EqualsIgnorecaseMethod :" + equalsIgnorecaseResult);

    }
}
