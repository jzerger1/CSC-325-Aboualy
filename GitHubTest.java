/* This is a test for the CSC 325 Repository, as I am new to GitHub and need some practice using it. */

import java.util.Random;
import java.util.Scanner;

public class GitHubTest {
    public static void main (String[] args) {
        //Opening remarks
        System.out.println("ATTENTION. ATTENTION. THIS IS ONLY A TEST.");
        System.out.println("Please stand by while I write some Java code. I have not used this programming language in a while.\n");

        //Adding two variables together and printing the result.
        Random rand = new Random();
        int x = rand.nextInt(50);
        int y = rand.nextInt(50);
        int z = x + y;
        System.out.println("The sum of " + x + " and " + y + " is " + z + ".\n");

        //Sorting an array
        Scanner scnr = new Scanner(System.in);

        System.out.print("How many items are in your array? ");
        int quantity = scnr.nextInt();

        int[] sort = new int[quantity];

        for (int i = 0; i < quantity; i++) {
            System.out.print("Please enter an item in your array: ");
            sort[i] = scnr.nextInt();
        }

        System.out.print("Here is the array you entered: ");
        for (int i = 0; i < quantity - 1; i++) {
            System.out.print(sort[i] + ", ");
        }
        System.out.println(sort[quantity - 1]);

        for (int i = 0; i < quantity; i++)
        {
            for (int j = i + 1; j < quantity; j++) {
                if (sort[j] < sort[i]) {
                    int placeholder = sort[i];
                    sort[i] = sort[j];
                    sort[j] = placeholder;
                }
            }
        }

        System.out.print("Here is the array again in ascending order: ");
        for (int i = 0; i < quantity - 1; i++) {
            System.out.print(sort[i] + ", ");
        }
        System.out.println(sort[quantity - 1]);

        //Calculate the perimeter, area, and diagonal of a rectangle
        System.out.print("\nWhat is the length of the rectangle? ");
        double height = scnr.nextDouble();

        System.out.print("What is the width of the rectangle? ");
        double width = scnr.nextDouble();

        double perimeter = 2 * height + 2 * width;
        double area = height * width;
        double diagonal = Math.sqrt((height * height) + (width * width));
        System.out.println("The perimeter is " + perimeter + " units, the area is " + area + " square units, and the length of each diagonal is " + diagonal + " units.\n");

        //And finally, a number guessing game;
        int answer = rand.nextInt(100) + 1;
        int userGuess = 0;
        int guessCount = 0;

        System.out.print("I'm thinking of a number between 1 and 100. What is it? ");
        userGuess = scnr.nextInt();

        while (userGuess != answer) {
            if (userGuess > answer) {
                guessCount++;
                System.out.print(userGuess + " is too high. Please guess again. ");
                userGuess = scnr.nextInt();
            }
            else if (userGuess < answer) {
                guessCount++;
                System.out.print(userGuess + " is too low. Please guess again. ");
                userGuess = scnr.nextInt();
            }
        }
        guessCount++;
        System.out.println("Correct! You guessed " + answer + " correctly in " + guessCount + " tries.");
    }
}