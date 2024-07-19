package com.apjfsa;

public class DemoStringBuilder {

    public static void main(String[] args) {
        // Create a StringBuilder with "shiva shankar"
        StringBuilder str = new StringBuilder("shiva shankar");
        System.out.println(str);

        // Append "vara prasad" to the existing string
        str.append(" vara prasad");

        System.out.println(str);

        // Get the length of the StringBuilder
        System.out.println("Length of the StringBuilder: " + str.length());

        // Find the index of the character 'a' in the StringBuilder
        System.out.println("Index of 'a': " + str.indexOf("a"));

        // Convert the StringBuilder to a regular string
        String s = str.toString();
        System.out.println("Converted to a regular string: " + s);

        // Create a StringBuffer from the original StringBuilder
        StringBuffer str1 = new StringBuffer(str);
        System.out.println("StringBuffer from StringBuilder: " + str1);

        //capacity of the StringBuffer
        System.out.println("Capacity of the StringBuffer: " + str1.capacity());

        // Delete the character at index 5 in the StringBuffer
        System.out.println("Deleted character at index 5: " + str1.deleteCharAt(5));

        // Get the character at index 7 in the StringBuffer
        System.out.println("Character at index 7: " + str1.charAt(7));

        // Find the last occurrence of string 
        System.out.println("Last index of '" + s + "': " + str1.lastIndexOf(s));
    }
}
