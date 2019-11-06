package org.sla;

public class MathExamples {

    public static void main(String[] args) {
        // There are 8 primitive types in Java.
        // To find out range of values that can be stored in each type
        //     read https://en.wikibooks.org/wiki/Java_Programming/Primitive_Types
        byte myByte = 127;                      // integer: 1 byte  =  8 bits
        short myShort = 32767;                  // integer: 2 bytes = 16 bits
        int myInt = 2147483647;                 // integer: 4 bytes = 32 bits
        long myLong = 9223372036854775807L;     // integer: 8 bytes = 64 bits
        float myFloat = 123.456789f;            // decimal: 4 bytes = 32 bits
        double myDouble = 1234567890.12345678901234567890; // decimal: 8 bytes = 64 bits
        char myChar = 'a';  // single text character: 2 bytes = 16 bits
        boolean myBoolean = false; // true or false
        // If a variable or field is NOT one of these 8 types, then it must be an Object.
        String myString1 = "a"; // NOTE: this is not the same as the char 'a'

        String myAlgebra1String = "2(1.3) + 5 = ";
        int m = 2;
        float x = 1.3f;
        int b = 5;
        double y = (m * x) + b;
        System.out.println(myAlgebra1String + y);

        String myGeometryString = "tan(45 degrees or pi/4) = ";
        double angle = Math.PI;
        double tangent = Math.tan(angle/4);
        System.out.println(myGeometryString + tangent + "because opposite and adjacent are equal in 45-45-90 triangles.");

        String myAlgebra2String1 = "(11)^2 = ";
        String myAlgebra2String2 = "square root of ";
        x = 11;
        int exponent = 2;
        y = Math.pow(x, exponent);
        double newX = Math.sqrt(y);
        System.out.println(myAlgebra2String1 + y + " because " + myAlgebra2String2 + y + " is " + newX);

        String myPreCalcString1 = "log(1000) = ";
        String myPreCalcString2 = "10^";
        int result = 1000;
        double exponent2 = Math.log10(result);
        double result2 = Math.pow(10, exponent2);
        System.out.println(myPreCalcString1 + exponent2 + " because " + myPreCalcString2 + exponent2 + " = " + result2);
    }
}
