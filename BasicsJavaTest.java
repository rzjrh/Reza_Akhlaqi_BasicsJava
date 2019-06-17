
package basicsJava;

import java.util.Arrays;


public class BasicsJavaTest {

    public static void main(String[] args) {
//create new object from the "BasicJava" class and call it ResultPrint
BasicJava ResultPrint = new BasicJava();

//Variables
int[] arr1 = {1,2,5,8,-3,2,11,10,7};      //InterateArray
int[] arr2 = {3,2,-1,-9,7,5,1,0,8};       // to find max
int[] arr3 = {4,5,6,-2,11,14,-8,9};       //for average
int[] arr4 = {0,4,6,5,8,11,2,3,-2,11};    //greater than Y
int[] arr5 = {-2,1,3,22,0,8,16,-3,4};     //Square the Values
int[] arr6 = {1,5,-2,-3,2,4,-8,11,5,4};   //No Negative
int[] arr7 = {11,2,5,-8,10,7,6,4,-3,8};   //MAx Min Avg
int[] arr8 = {5, 10, 7, -2, 0};           //Shift Array one to front



System.out.println("Print from 1 to 255");
ResultPrint.PrintTo255();
System.out.println("");

System.out.println("Print all Odd numbers from 1 to 255");
ResultPrint.PrintOdd();
System.out.println("");

System.out.println("Print summation from 0 to 255");
ResultPrint.PrintSum();
System.out.println("");

System.out.println("Print each value in the array");
ResultPrint.InterateArray(arr1);
System.out.println("");

System.out.println("Print the Maximum value in the Array");
ResultPrint.FindMax(arr2);
System.out.println("");

System.out.println("Print the average of the values in the array:");
ResultPrint.GetAvg(arr3);
System.out.println("");

System.out.println("Print an array with odd numbers from 1 to 255:");
System.out.println(ResultPrint.OddNumArr());
System.out.println("");

System.out.println("Print how many values in the array greater than Y:");
System.out.println(ResultPrint.GTY(arr4,6));;
System.out.println("");

System.out.println("Square the Values in the array");
System.out.println(Arrays.toString(ResultPrint.SqV(arr5)));
System.out.println("");

System.out.println("Print Zero instead of negative numbers in array");
System.out.println(Arrays.toString(ResultPrint.NoNeg(arr6)));
System.out.println("");

System.out.println("Print Maximum Minimum and Average value of an array all in one array");
System.out.println(Arrays.toString(ResultPrint.MaxMinAvg(arr7)));
System.out.println("");

System.out.println("shifts each number by one to the front");
System.out.println(Arrays.toString(ResultPrint.ShiftV(arr8)));

    }    
}
