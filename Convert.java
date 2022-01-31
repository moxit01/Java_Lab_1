//This file is created by Moxit Shah(A00253719) from Cambrian College for his Java assignment.This file contains the metric conversion.
//File created: 31 JAN 2022.

import java.util.Scanner;

public class Convert{

    public static void main(String[] args) {
        // Try and catch block for handling the errors.

       try{ 
        System.out.println("Enter a Value to convert:");

        //Scanner for the user input.
        Scanner obj = new Scanner(System.in);
        float value = obj.nextFloat();
        String metric = obj.next();

        //Changed metric user input to lowercase to take all input in lowercase.  
        String metric_L = metric.toLowerCase();

            //switch case for the input.
            switch(metric_L){
                case "km":
                    System.out.println(value*0.62 + " mile");
                    break;
                case "mi":
                    System.out.println(value*1.61 + " km");
                    break;
                case "cm":
                    System.out.println(value*0.39 + " in");
                    break;
                case "in":
                    System.out.println(value*2.54 + " cm");
                    break;
                case "kg":
                    System.out.println(value*2.2 + " lb");
                    break; 
                case "lb":
                    System.out.println(value*0.45 + " kg");
                    break; 
                default:  
                    System.out.println("Enter proper measures");       

             }


       }catch(Exception e){
        System.out.println("Please input value and then the metric with proper measures");
        }//this catch block gives print line if there is error in user input.

    


    }

}