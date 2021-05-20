/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/* 
 * File:   main.c
 * Author: 12-45-5-9-2020
 *
 * Created on May 20, 2021, 1:54 PM
 */

#include <stdio.h>
#include <stdlib.h>

struct sinhvien{
    int tuoi;
    char ten[];
    int khoa;
};

struct sinhvien * taoSinhVIene(){
    struct sinhvien * sv = malloc(sizeof(struct sinhvien));
    char e;
    
    return sv;
}

/*
 * 
 */
int main(int argc, char** argv) {
    
    struct sinhvien * sv = taoSinhVIene();
    
    return (EXIT_SUCCESS);
}

