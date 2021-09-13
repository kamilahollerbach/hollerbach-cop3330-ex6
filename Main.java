/*
         *  UCF COP3330 Fall 2021 Assignment 1 Solution
         *  Copyright 2021 Kamila Hollerbach
         */

package com.company;
import java.util.Scanner;

import java.util.*;

        public class Main {


            public static void main(String[] args) {

                int currentAge;
                int retirementAge;
                Scanner sc = new Scanner(System.in);

                System.out.print("What is your current age? ");
                currentAge = sc.nextInt();
                System.out.print("At what age would you like to retire? ");
                retirementAge = sc.nextInt();

                RetirementCal(currentAge,retirementAge);
            }
        }


