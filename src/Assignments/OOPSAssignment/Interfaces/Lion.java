package Assignments.OOPSAssignment.Interfaces;

import inheritance.Stu_details;
import inheritance.Student;

import java.io.Serializable;
import java.lang.Math;

public final class Lion {

    public static void main(String[] arg) {

         int a = 1000;
        int b = 10;
        int div;

        try{
            if ( a/b != 10) throw new BankException("Some exception occured");
        } catch (BankException e) {
            System.out.println(e.getMessage());
        }
    }
}

