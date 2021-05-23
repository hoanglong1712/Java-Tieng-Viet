/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication89;

import newpackage.Employee;

/**
 *
 * @author 12-45-5-9-2020
 */
public class JavaApplication89 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Employee employee = new Employee();

        employee.setAge(10);
        System.out.println(employee.getAge());
    
    }
}

class Boss extends Employee{
    public int getBossAge(){
        return this.age;
    }
}


