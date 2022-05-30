package tasks;
import java.util.ArrayList;
import java.util.Arrays;

public class TaskMethods {

    //Example:
    //Check the maximum size of integer in a list
    public int checkMax(int[] list){
        int max = list[0];
        for(int i=0;i<list.length;i++){
        if(list[i]>max){
            max = list[i];
        }
    }
        return max;
    }



    
    //Convert hours into seconds
    public int hoursToSec(int hours){
      int seconds = hours * 60 * 60;
        System.out.println(seconds);
      return seconds;
    }
    

    //Check if 2 numbers are equal
    public boolean areNumsEqual(int x, int y){
        if(x == y){
            return true;
        }
        else{
            return false;
        }
    }

    //calculate the area of a rectangle based on length of sides
    public double countArea(double side1, double side2){
       return side1 * side2;
       
    }
 
    //calculate the area of a right-angled triangle(Suorakulmainen kolmio)
    public double calculateTriangle(double length, double height){
        return length * height / 2;
    }

    //check if numbers remainder is 0 when the argument is 5 (example: 6%5 = 1 so the remainder of 6 when the argument is 5 would be 1)
    public boolean checkRemainder(int n){
        if(n%5 == 0){
            return true;
        }
        else{
            return false;
        }
    }

    //count the area of a circle based on the radius (hint: you need to define pi, pi in java = Math.PI)
    public double countCircleArea(double radius){
        return Math.PI * (radius*radius);
    }

    //Make a method that returns the sum of integers in an arraylist
    public int sumOfValue(ArrayList<Integer> list){
        int sum = 0;
        int sizeOfArray = list.size();
         for(int i=0; i<sizeOfArray; i++){
            sum = sum + list.get(i);
         }
        return sum;
    }

    //The method parameters take in a list and an integer. Check if the list contains the integer.
    public boolean checkIfListHasValue(int[] list, int n){
         for(int i=0; i<list.length; i++){
             if(list[i] == n){
                return true;
             }
         }
         return false;
    }

    //Make a method that checks if the input number is odd or even
    public boolean oddOrEven(int n){
    if (n % 2 == 0){
        System.out.println("even");
        return false;
    }
    else{
        System.out.println("odd");
        return true;
    }
    }
   /*
    //Bonus: Make a method that returns the average of grades in the list
    public double getAverage(double[] list){

    }
    
    //Bonus 2: Create a method that convert Fahrenheit to Celsius and Celsius to Fahrenheit
             //The method takes in a String that is either "Celcius" or "Fahrenheit" and based on the input it makes the conversion.
             //hint: google "Celcius to Fahrenheit formula"
    
    public double celsiusToFahrenheit(String s, double value){
    
    }
    
    //Bonus 3: Make a method that takes in 2 integers and swap their value inside the method.
    //Example input(2,4)->output(4,2)
      public void(int a,int b){
    
    }
    */


}
