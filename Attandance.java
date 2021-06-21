package com.program;

public class Attendence extends EmpWage {

    public static void attendance(){
        int IS_FULL_TIME=1;
        double empCheck = Utility.getRandomDouble();
        System.out.println(empCheck);

        if(empCheck == IS_FULL_TIME )
        {
            System.out.println("Employee is Present. ");
        }
        else
        {
            System.out.println("Employee is Absent. ");
        }

    }

}
