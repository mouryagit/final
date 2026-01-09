package com.project.main;

public class stringBuilder {
    public static void main(String[] args) {
        //Creating String Builder
        StringBuilder sb = new StringBuilder("I am");
        System.out.println(sb);
        //Appending to the String Builder
        sb.append(" Mourya ");
        System.out.println(sb);
        //Inserting in to String Builder
        sb.insert(5, "D." );
        System.out.println(sb);
        //Deleting from the String Buffer
        sb.delete(5 , 7 );
        System.out.println(sb);

    }
}
