package com.project.main;

public class stringBuffer {
    public static void main (String[] args){
        //Creating the string builder
        StringBuilder Sb = new StringBuilder("Hello");
        //Apending to the string builder
        Sb.append(", World!");
        System.out.println(Sb);
        //Inserting into the String Builder
        Sb.insert(5 , "java");
        System.out.println(Sb);
        //Deleting from the String Builder
        Sb.delete(5 , 10);
        System.out.println(Sb);
    }
}
