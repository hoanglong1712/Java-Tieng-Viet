/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package newpackage;

/**
 *
 * @author 12-45-5-9-2020
 */
public class Employee {
    private final String name;
    protected int age;

    public Employee() {
        this.name = "ten gi cung duoc";
    }
    
    

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        
        
        if (obj instanceof Employee) {
            Employee e = (Employee) obj;
            return e.age == this.age;
        }        
        
        return false;
    }
    
    
}
