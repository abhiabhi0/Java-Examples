package com.programmercave.strings;

//Sting vs StringBuilder vs StringBuffer
public class stringBuilderBuffer {
    // Method 1
    // Concatenates to String
    public static void concat1(String s1)
    {
        s1 = s1 + "forgeeks";
    }
 
    // Method 2
    // Concatenates to StringBuilder
    public static void concat2(StringBuilder s2)
    {
        s2.append("forgeeks");
    }
 
    // Method 3
    // Concatenates to StringBuffer
    public static void concat3(StringBuffer s3)
    {
        s3.append("forgeeks");
    }
}
