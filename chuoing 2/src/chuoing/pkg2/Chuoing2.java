/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chuoing.pkg2;

/**
 *
 * @author 12-45-5-9-2020
 */
public class Chuoing2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        boolean kieuBool = true;
        // 0 hoặc 1,
        // 
        System.out.println(kieuBool);
        
        Student s1 = new Student();
        s1.value = 5;
        
        Student s2 = s1;
        
        s2.value = 10;
        
        System.out.println(s1.value);
        
       
    }
    
    static class Student{
        int value;
    }
            
    
}
