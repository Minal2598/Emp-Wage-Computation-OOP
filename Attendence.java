package com.program;

public class Attendence extends EmpWage {


    public  void attendance(){
        int IS_FULL_TIME=1;

        int WAGE_PER_HRS=20;
        int fullDayHr=8;

        int dailyEmpWage=0;
        double empCheck = Utility.getRandomDouble();
        System.out.println(empCheck);

        if(empCheck == IS_FULL_TIME )
        {
            System.out.println("Employee is Present.");
            dailyEmpWage = WAGE_PER_HRS*fullDayHr;
        }
        else
        {
            System.out.println("Employee is Absent.");
        }
        System.out.println("Daily Employee Wage::"+ dailyEmpWage);

    }
}
