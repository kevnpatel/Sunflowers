// package com.company;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        int amountOfSunflowers = s.nextInt();

        int[][] table = new int[amountOfSunflowers][amountOfSunflowers];
        int[][] newtable = new int[amountOfSunflowers][amountOfSunflowers];
        int[] tempArray = new int[amountOfSunflowers];
        int[] temp2Array = new int[amountOfSunflowers];

        int lowestNumber;

        int rotates = 0;

        // Create the table

        for (int i = 0; i < amountOfSunflowers; i++){

            // For the y
            // temp = s.nextLine();

            for (int j = 0; j < amountOfSunflowers; j++){

                // for the x
                table[i][j] = s.nextInt();

            }
        }

        // temp first number

        lowestNumber = table[0][0];

        // find the lowest number

        for (int i = 0; i < amountOfSunflowers; i++) {

            for (int j = 0; j < amountOfSunflowers; j++) {

                if (lowestNumber > table[i][j]){
                    lowestNumber = table[i][j];
                }
            }
        }
        // System.out.println(lowestNumber);


        for (int i = 0; i < amountOfSunflowers; i++){

            tempArray[i] = newtable[0][i];

        }

        while (lowestNumber != tempArray[0]){

            // Rotate
            for (int i = 0; i < amountOfSunflowers; i++) {

                for (int j = 0; j < amountOfSunflowers; j++) {

                    newtable[i][j] = table[(amountOfSunflowers - 1) - (j)][i];

                }
            }

            rotates++;

            // Make table the new table
            for (int i = 0; i < amountOfSunflowers; i++) {

                for (int j = 0; j < amountOfSunflowers; j++) {

                    table[i][j] = newtable[i][j];

                }
            }

//            System.out.println(lowestNumber);
            tempArray[0] = newtable[0][0];
//
//            System.out.println(tempArray[0]);

        }

        // Print final table
        for (int i = 0; i < amountOfSunflowers; i++) {

            for (int j = 0; j < amountOfSunflowers; j++) {

                System.out.print(newtable[i][j]);

            }
            System.out.println();
        }

    }
}
