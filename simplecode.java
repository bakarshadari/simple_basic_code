package com.company;

import java.util.*;

public class Main {

    public static void main(String[] args) {
	// write your code here
        //creating variable
       int sum;
       // scaner is used to get user input 
        Scanner input = new Scanner(System.in);
        //telling user what she/he do
        System.out.println("enter number 1");
        //take from use to enter number 1
        int num1 = input.nextInt();
        System.out.println(input.nextLine());
        //telling user what she/he do
        System.out.println("enter number 2 ");
        //take from use to enter number 2
        int num2 = input.nextInt();
        //add the two input numbers that user enters
        sum = num1+num2;
        //display the sum
        System.out.println("the total of "+ num1 +"\t"+"+"+ num2 +"\t"+""+"is"+"\n"+ sum);
        /// using if condition 
        // create float salary variable
        float salaray = 234443;
        // use if condition to ensure if the salaray >10000
        if (salaray  > 10000){
            // if the condition true add salary 2000
            salaray+=2000;
            //display the salary 
            System.out.println("the  salaray is greater then 10000 soo your salaray is add 2000 and equal"+"\t"+salaray);
        }
        // else condition means what happen if the first condition doesn't work
        else {
            //add salary 1000
            salaray=+ 1000;
            // display the salary 

            System.out.println("the salaray is less then 10000 soo your salaray is add 1000 and equal"+salaray);
        }
      //while loop code
      // for display the kind of loop which is while loop
        System.out.println("while loop");
      // initialization
        int i = 1 ;
        // while loop syntax while(condition)
        while (i<10) {
            // display 1 to 9 becoase 10 is last one not include
            System.out.println(i);
            // incrementing
            i++;
        }
        // display kind of loop which is for loop
        System.out.println("for loop ");
        /* for loop syntax  for (initialization; condition; increment/decrement */
        for(int l =1 ;l<10 ; l++){
            // displaying l
            System.out.println(l);
        }
        // displaying the kind of loop
        System.out.println("do loop");
        //initialization
        int m = 1;
        // do loop syntax this loop will enter the body then others
        do {
            // displaying m
            System.out.println(m);
            // increment/ decrement
            m++;
            // while condition
        }while (m<10);
        // user input number then we display the range
        // Scanner is called above and we can call one time
        // display what user do first
        System.out.println("Enter number to get range");
        // take the number from the user
        int N = input.nextInt();
        //use loop to itrate the range from 1 to N
        for(int num =1;num<N;num++){
            //display the range form user 1 to N
            System.out.println("your range is "+num);
        }
        // find the largest number
         int n1 =input.nextInt();
        int n2 = input.nextInt();
        int n3 = input.nextInt();
        int max = n1;
        if(n2 >max){
            max = n2;
            if(n3 >max){
              max =n3;
                System.out.print("the maximun number is:"+max);

            }
            // other way
            int maximum = Math.max(n3,Math.max(n1,n2));
            System.out.println("maximum number is "+maximum);
        }
      // input string
        char ch = input.next().trim().charAt(0);
        //usr will input the index he /she want
        int index = input.nextInt();

       // user wil input string he/she want
       String word = input.next();
       //display index of string for string may be hellow and index may be 4 so output wil be o
       System.out.println(word.charAt(index));



 }
 // fabanaci numbers


}



