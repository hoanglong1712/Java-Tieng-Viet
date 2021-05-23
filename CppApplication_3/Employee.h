/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/* 
 * File:   Employee.h
 * Author: 12-45-5-9-2020
 *
 * Created on May 21, 2021, 2:13 PM
 */

#ifndef EMPLOYEE_H
#define EMPLOYEE_H

class Employee {
public:
    Employee();
    Employee(const Employee& orig);
    virtual ~Employee();
    void setAge(int age){
        this->age = age;
    };
    
    void setName(char * name);
private:
    int age;
    char * name;
};

#endif /* EMPLOYEE_H */

