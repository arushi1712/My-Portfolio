package My;

import java.util.Scanner;

class Students
{
    public  String roll_number;
    public  String name;
    public  int age;
    public  String address;

    Students(String roll_number, String name, int age, String address)      // Students class constructor where each students details will get assigned at particular index in array
    {
        this.roll_number = roll_number;
        this.name = name;
        this.age = age;
        this.address = address;
    }

    public String getRollNumber()
    {
        return roll_number;
    }

    @Override
    public String toString()
    {
        return "Roll Number : " + roll_number + ", Name : " + name + ", Age : " + age + ", Address : " + address ;
    }
}
public class Student_Details
{
    public static Students[] arr = new Students[5];        // declaring a Students class type array to store student details
    public static int count = 0;                           // this is the count of no. of students in the array at a given time & will act as the ARRAY INDEX in adding details
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        while(true)
        {
            System.out.println("Your options are :");
            System.out.println("1. Add student details");
            System.out.println("2. Remove student details");
            System.out.println("3. Fetch student details");
            System.out.println("4. Exit the application");

            System.out.println("Enter your choice");
            int choice = sc.nextInt();

            switch(choice)
            {
                case 1: {
                            addDetails(sc);
                            break;
                         }
                case 2: {
                            removeDetails(sc);
                            break;
                        }
                case 3: {
                            fetchDetails(sc);
                            break;
                        }
                case 4: {
                            System.out.println("Exiting the Application");
                            sc.close();
                            return;                                 // if the user enters choice = 4, control will jump out of the while loop and the whole program will end
                        }
                default: {
                            System.out.println("Invalid request. Please try again");
                             break;
                        }
            }
        }
    }
    public static void addDetails(Scanner sc)
    {
        if(count>=arr.length)
        {
            System.out.println("The list is already full");
            return;
        }

        System.out.println("Enter student roll number");
        String roll_number = sc.next();
        System.out.println("Enter student name");
        String name = sc.next();
        System.out.println("Enter student age");
        int age = sc.nextInt();
        System.out.println("Enter the student address");
        String address = sc.next();

        arr[count++] = new Students(roll_number, name, age, address);     // constructor call during object creation that will pass student details and will get added
        System.out.println("Student details added successfully");
                                                            // since 1 more student added
        System.out.println();
    }

    public static void removeDetails(Scanner sc)
    {
        System.out.println("Enter the student roll number to be removed");
        String roll_number = sc.next();

        for(int i = 0; i<arr.length; i++)
        {
            if(arr[i] != null && arr[i].getRollNumber().equals(roll_number))       // NOTE: this condition checks if the Students class roll no. is equal to the roll number entered by user.
            {
                arr[i] = null;
                System.out.println("Student removed successfully");
                return;
            }
        }
        System.out.println("Student not found.");       // this message will get printed only when the roll number isn't found in list and for loop failed
    }
   // Students obj = new Students();
    public static void fetchDetails(Scanner sc)
    {
        System.out.println("Enter student roll number");
        String roll_number = sc.next();

        for(int i = 0; i< arr.length; i++)
        {
            Students student = arr[i];      // object/variable created that contains all details of a particular student at index 'i' of array 'students'
            // this 'student' object will have instance variables like roll no., name, age & address for each different student
            if (student != null && student.getRollNumber().equals(roll_number))
            {
                System.out.println("Student details - \n " + student.toString());
                return;
            }
        }
        System.out.println("Student doesn't exist. Try again.");
    }
}

