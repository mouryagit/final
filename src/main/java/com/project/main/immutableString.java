package com.project.main;

public class immutableString {
    public static void main(String[] args){
        String originalString = "java";
        System.out.println(originalString);
        String modifiedString = originalString.concat("Programming");
        System.out.println(modifiedString);
        System.out.println(originalString);
        originalString.toUpperCase();
        System.out.println(originalString);
        // correct way to use the result of a  String Operation
        String upperCaseString = originalString.toUpperCase();
        System.out.println(upperCaseString);
        System.out.println(originalString);

    }
}
