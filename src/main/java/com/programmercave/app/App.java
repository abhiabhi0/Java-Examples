package com.programmercave.app;

import com.programmercave.OOPs.Car; 
import com.programmercave.OOPs.Maruti; 
import com.programmercave.strings.*;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        //############ OOPS ###################
        //---------------------------------------
        // Maruti m = new Car();
        // m.Drive();
        /**
         *  incompatible types: com.programmercave.OOPs.Car 
         * cannot be converted to com.programmercave.OOPs.Maruti
         **/
        //------------------------------------------

        //--------------------------------------------------
        // Car c = new Maruti();
        // c.Drive(); //child class method is called
        // //base class method will be called if Drive is not declared in Maruti
        //-----------------------------------------------------
        //########################################### 

        //###########   Strings  ###################

        //String vs String Buffer vs String Builder

        // String 1
        String s1 = "Geeks";
 
        // Calling above defined method
        stringBuilderBuffer.concat1(s1);
 
        // s1 is not changed
        System.out.println("String: " + s1);
 
        // String 1
        StringBuilder s2 = new StringBuilder("Geeks");
 
        // Calling above defined method
        stringBuilderBuffer.concat2(s2);
 
        // s2 is changed
        System.out.println("StringBuilder: " + s2);
 
        // String 3
        StringBuffer s3 = new StringBuffer("Geeks");
 
        // Calling above defined method
        stringBuilderBuffer.concat3(s3);
 
        // s3 is changed
        System.out.println("StringBuffer: " + s3);

        //###########################################
    }
}
