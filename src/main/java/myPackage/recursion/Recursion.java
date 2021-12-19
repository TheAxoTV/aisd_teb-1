package myPackage.recursion;

public class Recursion {

    //i=3*silnia(2)*silnia(1)
    //3*2*1
    private static void drukujLiczby(int n) {
        if (n == 0){// warunek zakończenia rekurencji
            System.out.println(n);
        } else {
            System.out.println(n);//działanie na obecnej wartości
            drukujLiczby(n-1);//kolejne wywołanie, ze zmienionym parametrem
        }
    }

    private static void drukujLiczbyNieparzyste(int n) {
        if (n == 1){
            System.out.println(n);
        } else {
            if (n%2 == 1){//wyswietlamy tylko konkretne wartości, tutaj nieparzyste
                System.out.println(n);
            }
            drukujLiczbyNieparzyste(n-1);
        }
    }

    private static void drukujLiczbyOdDo(int odLiczby, int doLiczby){

        if (odLiczby == doLiczby){
            System.out.println(doLiczby);;
        } else{
            System.out.println(odLiczby);
            drukujLiczbyOdDo(odLiczby+1,doLiczby);
        }
    }

    private static int silnia(int i) {
        if (i < 2) { // tak samo zadziała if( i == 1); warunek zakończenia rekurencji,
            return 1;
        }
        return i*silnia(i-1);//używamy aktualnej wartości parametru "i" oraz wywołujemy kolejny raz tą samą funkcję, w której jesteśmy, ze zmienionym "i"
    }


    //---------------------------REKURENCJA------------------------
    // n! = n * (n-1) * (n-2) * ... * 1
    //3! = 3*2*1
    //5! = 5*4*3*2*1

//        int silnia = silnia(5);
//        System.out.println(silnia);
//        int arraySize = 10;
//        List<Integer> list = new ArrayList<>();
//        for (int i=0; i<arraySize ; i++){
//            list.add(i);
//        }
//
//        for (int i=0; i<list.size();i++ ){
//            System.out.println(list.get(i));
//        }


}