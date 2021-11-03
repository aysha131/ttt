/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab1exercies1;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

/**
 *
 * @author Reem
 */


public class LAB1Exercies1 {

    /**
     * @param args the command line arguments
     */
    //global visibility 
    static double[] tempReadings = new double[30];

    public static void main(String[] args) throws FileNotFoundException {
        Scanner inFile = new Scanner(new FileReader("Temp"));
        int i = 0;
        while (inFile.hasNext()) {
            tempReadings[i] = inFile.nextDouble();
            i++;

        }

        for (int j = 0; j < tempReadings.length; j++) {
            tempReadings[j] = Math.round(tempReadings[j]);
        }

        System.out.println("The details for the month is: ");
        info(0, 30);
        System.out.println("The details for the 1sh week is: ");
        info(0, 7);
        System.out.println("The details for the 2nd week is: ");
        info(7, 14);
        System.out.println("The details for the 3rd week is: ");
        info(14, 22);
        System.out.println("The details for the 4th week is: ");
        info(22, 30);
        
        

    }

    public static void info(int start, int end) {
        double total = 0;
        double average;
        double min = tempReadings[start];
        double max = tempReadings[start];
        for (int i = start; i < end; i++) {
            total = total + tempReadings[i];
            if (tempReadings[i] < min) 
                min = tempReadings[i];
            
            if (tempReadings[i] > max) 
                max = tempReadings[i];
            }
 average = total / (end - start);
        System.out.println("The avarage of the tempreture is : " + average);
        System.out.println("The max tempreture is : "+max);
         System.out.println("The min tempreture is : "+min);
        }
       
       
    }
        

