import java.util.Scanner; 

 

public class Biggest { 

    public static void main(String[] args) { 

       // The line `Scanner scanner = new Scanner(System.in); creates a new `Scanner` object named 

       // `scanner` that is used to read input from the user. `System.in` represents the standard input 

       // stream, which is typically the keyboard. 

        Scanner scanner = new Scanner(System.in); 

 

         

       // This code prompts the user to enter the size of the array and then reads the input from the 

       // user using the `Scanner` object. The entered value is stored in the variable `size`. 

        System.out.print("Enter the size of the array: "); 

        int size = scanner.nextInt(); 

 

         

       // The line `int[] array = new int[size];` is creating a new array of integers named `array` 

       // with a size specified by the variable `size`. The size of the array is determined by the 

       // value entered by the user. 

        int[] array = new int[size]; 

 

         

        // This code block is prompting the user to enter the elements of the array. 

        System.out.println("Enter " + size + " elements:"); 

        for (int i = 0; i < size; i++) { 

            array[i] = scanner.nextInt(); 

        } 

 

         

        // This code block is finding the largest element in the array. 

        int largestElement = array[0]; 

        for (int i = 1; i < size; i++) { 

            if (array[i] > largestElement) { 

                largestElement = array[i]; 

            } 

        } 

 

         

        // The line `System.out.println("The largest element in the array is: " + largestElement);` is 

        // printing the message "The largest element in the array is: " followed by the value of the 

        // variable `largestElement`. This line of code is used to display the result to the user, 

        // showing them the largest element in the array. 

        System.out.println("The largest element in the array is: " + largestElement); 

 

         

       // The line `scanner.close();` is used to close the `Scanner` object. This is done to release 

       // any system resources associated with the `Scanner` object and to prevent any potential 

       // resource leaks. It is good practice to close the `Scanner` object when it is no longer 

       // needed. 

        scanner.close(); 

    } 

} 

 