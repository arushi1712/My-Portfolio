package My_Portfolio;

import java.util.ArrayList;
import java.util.Scanner;

// This Calculator java program uses interface, ArrayLists, method calls, switch cases and asking for repetitive user input to demonstrate basic functions of a calculator

public class Calculator
{
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args)
    {
        Addition a = new Addition();
        Subtraction s = new Subtraction();
        Multiplication m = new Multiplication();
        Division d = new Division();
        Modulus x = new Modulus();
        while (true)
        {

            System.out.println("Menu :");
            System.out.println("1. Addition");
            System.out.println("2. Subtraction");
            System.out.println("3. Multiplication");
            System.out.println("4. Division");
            System.out.println("5. Modulus");
            System.out.println("0. Clear the screen ");
            System.out.println("-1. Exit the calculator");

            System.out.println("Enter your choice");                                //input user choice
            int choice = sc.nextInt();

            switch (choice)
            {
                case 1 -> {
                    System.out.println("You've chosen the Addition function");
                    System.out.println("How many numbers would you like to input?");
                    int count = sc.nextInt();
                    ArrayList<Double> array = returnArrayList(count);

                    a.operation(array);                                            // calling the addition function

                }
                case 2 -> {
                    System.out.println("You've chosen the Subtraction function");
                    System.out.println("Enter the two numbers");
                    //int count = sc.nextInt();
                    ArrayList<Double> array = returnArrayList(2);

                    s.operation(array);                                          // calling the subtraction function

                }
                case 3 -> {
                    System.out.println("You've chosen the Multiplication function");
                    System.out.println("How many numbers would you like to input?");
                    int count = sc.nextInt();
                    ArrayList<Double> array = returnArrayList(count);

                    m.operation(array);                                       // calling the multiplication function

                }
                case 4 -> {
                    System.out.println("You've chosen the Division function");
                    //int count = sc.nextInt();
                    System.out.println("Enter the two numbers");
                    ArrayList<Double> array = returnArrayList(2);

                    d.operation(array);                                      // calling the division function

                }
                case 5 -> {
                    System.out.println("You've chosen the Modulus function");
                    System.out.println("Enter the two numbers");
                    ArrayList<Double> array = returnArrayList(2);

                    x.operation(array);                                        // calling the modulus function

                }
                case 0 -> System.out.println("Clearing the screen");

                case -1 -> {
                    System.out.println("Exiting the calculator");
                    sc.close();
                    return;
                }
                default -> System.out.println("Invalid entry. Try again");
            }
        }
    }
    public static ArrayList<Double> returnArrayList(int count)
    {
        ArrayList <Double> array = new ArrayList<>(count);          //declaring a new ArrayList
        System.out.println("Enter the numbers");
        int i = 0;
        while(i<count)
        {
            array.add(sc.nextDouble());
            i++;
        }
        return array;                                               // returning the array list containing input elements
    }
}
interface calculator_function
{
    void operation(ArrayList<Double> arr);
}
class Addition implements calculator_function
{
    public void operation(ArrayList<Double> arr)      // function to perform addition
    {
        double sum = 0;
        System.out.print("Sum of entered numbers = ");
        for(int i = 0; i<arr.size();i++)               // length of ArrayList is found by function "ArrayList_name.size()"
        {
            sum+= arr.get(i);                           // to get individual elements from an ArrayList, "ArrayList_name.get(i)" syntax is used
        }
        System.out.println(sum);
    }
}
class Subtraction implements calculator_function        // function to perform subtraction
{
    public void operation(ArrayList<Double> arr)
    {
        double result = 0;
        for(int i = 0; (i<arr.size()-1);i++)
        {
            result = (arr.get(i) - arr.get(i+1));
        }
        System.out.println("Subtraction of the two numbers is = " + result);
    }
}
class Multiplication implements  calculator_function        // function to perform multiplication
{
    public void operation(ArrayList<Double> arr )
    {
        double result = 1;
        for(int i = 0; i<arr.size();i++)
        {
            result*= arr.get(i);
        }
        System.out.println("Multiplication of the numbers is = " + result);
    }
}
class Division implements calculator_function       // function to perform division
{
    public void operation(ArrayList<Double> arr)
    {
        double result = 0;
        for(int i = 0; i< (arr.size()-1);i++)
        {
            result = (arr.get(i) / arr.get(i+1));
        }
        System.out.println("Division of the two numbers is = " + result);

    }
}
class Modulus implements calculator_function       // function to perform modulus operation
{
    public void operation(ArrayList<Double> arr)
    {
        double result;
        for(int i = 0; i< (arr.size()-1);i++)
        {
            double num1 = arr.get(i);
            double num2 = arr.get(i+1);
            //result = ( num1 % num2);
            System.out.println("Modulus of the two numbers is = " + (num1 % num2));
            return;
        }


    }
}