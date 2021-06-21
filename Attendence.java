package com.program;

public class Attendence extends EmpWage {


    public void attendance() {
        double empCheck = Utility.getRandomInt();
        System.out.println(empCheck);
        int n =Utility.getRandomInt();
        System.out.println(n);
        int FullDayHr=8;
        int PartTimeHr=4;
        int WagePerHr=20;
        switch(n) {
            case 1:
                System.out.println("present FullDayHr Emp");
                System.out.println(WagePerHr * FullDayHr);
                break;
            case 2:
                System.out.println("present PartTime Emp");
                System.out.println(WagePerHr * PartTimeHr);
                break;
            default:
                System.out.println("absent. ");
        }
    }
}