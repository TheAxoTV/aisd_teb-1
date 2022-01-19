package myPackage.exam.recursion;

import java.util.Scanner;

public class Task1 {

    public Task1() {
    }

    public static void main(String[] args) {
        printPyramid(numberOfPyramidLevels());
    }

    public static int numberOfPyramidLevels() {
        System.out.printf("State how many levels the pyramid is to consist of: ");
        Scanner n = new Scanner(System.in);
        int lvlNumber = Integer.parseInt(n.nextLine());
        return lvlNumber;
    }

    public static void printPyramid(int lvlNumber) {
        for(int i = 1; i <= lvlNumber; ++i) {
            for(int j = 1; j <= i; ++j) {
                System.out.print(3);
            }

            System.out.println();
        }

    }
}
