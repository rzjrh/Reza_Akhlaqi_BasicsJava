
package basicsJava;

//we have to import the Arraylist for Making an array in arrayOddNumbers question
import java.util.ArrayList;

public class BasicJava {

//print from 1 to 255. Using for loop
 public void PrintTo255(){
    for (int i = 1; i <= 255; i++) {
        System.out.print(","+i);
        }
    System.out.println("");

    }
    
 //print the odd numbers from 1 to 256 
 public void PrintOdd (){
   for (int i=0; i<256; i++)
       if (i%2 == 1){
           System.out.print("," + i);
       }
    System.out.println("");
 }
 
 //summation from 0 to 255
 public void PrintSum (){
        int sum = 0;
        for (int i = 1; i <= 255; i++) {
            sum = sum + i;
            System.out.println("New number: " + i + " Sum: " + sum + "");
            }
 }
 
 
 
  //method that would iterate through each member of the array and print each value 
 public void InterateArray (int[] arr){
		for (int x: arr) {
			System.out.print(","+ x);
		}
 }
 
 
 
 //a method that takes any array and prints the maximum value in the array
 //declare variable arr in array[], initiate with zero value. 
 //use for loop to declate temp vaue x and then if statement to print maximum 
 // x:arr => every value in the array
 public void FindMax (int [] arr){
    int max = arr[0];
    for (int x: arr) {
        if (x > max) {
            max = x;
        }
    }
    System.out.println(max);
     
 }
 
 
  //print the average of the array values 
 public void GetAvg (int [] arr){
     int sum = 0;
     for (int x: arr) {
         sum += x;
     }
 System.out.println(sum/arr.length);
 }
 
 
 
//Print an array with odd numbers from 1 to 255
// This <Integer> makes it generic 
// ArrayList implements the List of Array (part of import.java.ArrayList)
public ArrayList < Integer > OddNumArr() {
		ArrayList < Integer > arr = new ArrayList <  > ();
		for (int i = 1; i <= 255; i++) {
			if (i % 2 != 0) {
				arr.add(i);
			}
		}
		return arr;
	}
 

//take an array and returns the number of values in that array whose value is greater than a given value y
//method signature (int, int)
// (int x: array) means every vaalue (x) in the array 
public int GTY(int[] array, int y) {
    int count = 0;
    for (int x: array) {
            if (x > y) {
                    count++;
            }
    }
    return count;
} 



//Square the Values in the array
// use Arrays.toString in tester class
public int[] SqV(int[] arr) {
    for (int i = 0; i < arr.length; i++) {
            arr[i] = arr[i] * arr[i];
    }
    return  (arr);
}
 


//No Negative Number- Zero instead of negative number
public int[] NoNeg(int[] x) {
    for (int i = 0; i < x.length; i++) {
        if (x[i] < 0) {
            x[i] = 0;
        }
    }
    return x;
}

 
 //Print Maximum Minimum and Average value of an array
 public double[] MaxMinAvg(int[] arr) {
    double Max = arr[0];
    double Min = arr[0];
    double sum = arr[0];
    for (int i = 1; i < arr.length; i++) {
        if (arr[i] > Max) {
            Max = arr[i];
        }
        if (arr[i] < Min) {
            Min = arr[i];
        }
        sum += arr[i];
    }
    double[] result = {
            Max,
            Min,
            sum / arr.length
    };
    System.out.println ("The Max value is: " +Max);
    System.out.println ("The Min value is: " +Min);
    System.out.println ("The Avg value is: " +sum/arr.length);
    System.out.println ("and the expected array is: ");
    return result;
}
 
 
 //Shifting the Values in the Array
 // the last value in the array is (x.length - 1)
public int[] ShiftV(int[] x) {
    for (int i = 0; i < x.length - 1; i++) {
        x[i] = x[i + 1];
    }
    x[x.length - 1] = 0;
    return x;
    }

 
 
 //end
}