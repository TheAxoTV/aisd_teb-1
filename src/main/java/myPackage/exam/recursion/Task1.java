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


//Wypisz na konsolę, piramidę, wypisywać będziemy cyfrę 3 w formie string lub int, tj w pierwszej lini jedna cyfra 3, w drugiej lini dwie trójki, w trzeciej lini 3 cyfry itd
//przykład wypisań na konsoli
//3
//33
//333
//3333
//itd
//Aż do liczby wierszy (poziomów piramidy), podanej jako parametr do funkcji przykład, printPyramid(int lvlNumber) {...}
//TIP podziel problem na mniejsze części, rezultatem nie musi być jedna funkcja, ale funkcjonalność, tj jak wywołam jedną funkcję to wyświetli mi się piramida,
//Uwaga, piramida może być wypisana jako "odwrócona" na konsolę tj dla numberOfPyramidLevels=3 ->
//333
//33
//3
