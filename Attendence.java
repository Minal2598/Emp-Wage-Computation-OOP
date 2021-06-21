package com.program;

public class Attendence extends EmpWage {


    public void attendance(){
        int IS_FULL_TIME=1;
        int IS_PART_TIME=2;
        int WAGE_PER_HRS=20;
        int fullDayHr=8;
        int partTimeHr=4;
        int dailyEmpWage=0;

        double empCheck = Utility.getRandomDouble();
        System.out.println(empCheck);

        if(empCheck ==IS_FULL_TIME)
        {
            System.out.println("Employee is Present");
            dailyEmpWage = WAGE_PER_HRS * fullDayHr;

        }
        else if(empCheck == IS_PART_TIME)
        {
            System.out.println("Employee is Present. ");
            dailyEmpWage = WAGE_PER_HRS * partTimeHr;

        }else {
            System.out.println("Employee is Abscent. ");

        }

        System.out.println("Daily Wage of Employee::"+dailyEmpWage);

    }


}
