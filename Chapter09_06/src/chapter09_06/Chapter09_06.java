/*
     
Chapter 9 Programming excercise 06
Riky Hernandez
9/29/21
Description: Design a stopwatch class, code a program that measures the excution time of sortin 100000 random numbers in miliseconds
─▄▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▄
█░░░█░░░░░░░░░░▄▄░██░█
█░▀▀█▀▀░▄▀░▄▀░░▀▀░▄▄░█
█░░░▀░░░▄▄▄▄▄░░██░▀▀░█
─▀▄▄▄▄▄▀─────▀▄▄▄▄▄▄▀
         
*/

package chapter09_06;

import java.util.Random;

public class Chapter09_06 {
    
public static void selectionSort(int[] list) {
        for (int i = 0; i < list.length; i++) {             //using the selection sort method used in chapter 7
            int currentMin = list[i]; 
            int currentMinIndex = i;

            for (int j = i + 1; j < list.length; j++) {         //sorting from small to biggest value
                if (currentMin > list[j]) {
                    currentMin = list[j];
                    currentMinIndex = j;
                }
            }   

            if (currentMinIndex != i) {
                list[currentMinIndex] = list[i];
                list[i] = currentMin;
            }
        }
    }
   
    public static void main(String[] args) {
     
                Random random;                      //using the random class
               random = new Random();
        int[] numbers = new int[100000];            //generating 100000 random numbers
        
        for(int i = 0; i < numbers.length; i++) {       
            numbers[i] = random.nextInt(10000);
        }

        StopWatch stopWatch = new StopWatch();      //using the stop watch 
        
        stopWatch.start();                          //using the stop watch time starting
        selectionSort(numbers);                               //sorting the numbers using the selection sort method
        stopWatch.stop();                                                   //stopin once the numbers are sorted

        System.out.println("Sorting 100,000 numbers took " + stopWatch.getElapsedTime() + " milliseconds");
    }
}                                                                                               //printin the time it took the numbers to be sorted in milisecounds 
        
    