/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/* 
 * File:   Employee.cpp
 * Author: 12-45-5-9-2020
 * 
 * Created on May 21, 2021, 2:13 PM
 */

#include "Employee.h"

Employee::Employee() {
}

Employee::Employee(const Employee& orig) {
}

Employee::~Employee() {
}

void Employee::setName(char* name){
    this->name = name;
}