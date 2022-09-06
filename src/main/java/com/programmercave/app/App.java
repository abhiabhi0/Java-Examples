package com.programmercave.app;

import com.programmercave.OOPs.Car; 
import com.programmercave.OOPs.Maruti; 

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        //---------------------------------------
        // Maruti m = new Car();
        // m.Drive();
        /**
         *  incompatible types: com.programmercave.OOPs.Car 
         * cannot be converted to com.programmercave.OOPs.Maruti
         **/
        //------------------------------------------

        Car c = new Maruti();
        c.Drive(); //child class method is called
        //base class method will be called if Drive is not declared in Maruti
    }
}
