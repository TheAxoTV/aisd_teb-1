package myPackage.exam.colections;

import java.util.*;

public class Task2 {
    static Car BMW = new Car(true, 2005, 2, 1, 22000.0D);
    static Car AUDI = new Car(false, 2020, 1, 2, 604900.0D);
    static Car MERCEDES_BENZ = new Car(true, 2015, 3, 3, 75000.0D);
    static Car BMW_2 = new Car(true, 2003, 2, 4, 150000.0D);
    static Car FERRARI = new Car(true, 2020, 3, 5, 1230000.0D);
    static Car KIA = new Car(false, 2008, 2, 6, 13000.0D);
    static Car FORD = new Car(false, 2011, 2, 7, 8599.99D);
    static Car MCLAREN = new Car(true, 2018, 3, 8, 1700000.0D);
    static Car SKODA = new Car(false, 2001, 1, 9, 14000.0D);
    static Car DACIA = new Car(false, 1998, 1, 10, 6000.0D);

    private static final List<Car> carlist = new LinkedList(Arrays.asList(BMW, AUDI, MERCEDES_BENZ, BMW_2, FERRARI, KIA, FORD, MCLAREN, SKODA, DACIA));


    public static Car getCarList() {
        System.out.println("Lista: ");
        for (Car car : carlist){
            //return car;
            //System.out.println(car);
        }
        printCarListAfterSomeModification(carlist);
        printsortedCars();
        //return toString();
        //return null;
        return null;
    }

    public static void printsortedCars() {

        //Collections.sort(carlist);
        //System.out.println();
        //System.out.println("Dzień dobry");
        //printCarListAfterSomeModification(carlist);
        //System.out.println(carlist.size());
        //Wypisz na konsolę listę aut (listę należy zrobić samodzielnie, przygotowanie DOBRYCH danych testowych jest cześcią zadania)
        //lista ma być posotrowana po atrybutach w następującej kolejności:
        //- auta ekskluzywne mają znajdować się na początku listy
        //- auta najnowsze, o najwyższym roku produkcji, mają być wyświetlane przed autami starszymi
        //- auta o wyższym poziomie wyposażenia mają być przed autami o niższym poziomie wyposażenia
        //- auta droższe mają być wyświetlane przed tańszymi
    }

    public static void printCarsToValueAndLevelOfEquipment(Double maxValue, Integer levelOfEquipment) {
        //Kontekst biznesowy: klient wchodzi na stronę salonu samochodów używanych i chce zobaczyć auta do pewnej kwoty "maxValue"
        // oraz mające konkretny poziom wyposażenia np: poziom 2 = auto ma klimatyzację, a poziom 1 auto klimatyzacji nie ma itp
        //ZADANIE: wyfiltruj a następnie wypisz auta od najtańszego do najdroższego z listy aut
        //todo tutaj wykonaj zadanie
        getCarList();
        List<Car> carListFilter = new LinkedList<>();
        for (Car Car : carlist) {
            if(Car.getValue() <= maxValue && Objects.equals(Car.getLevel(), levelOfEquipment)){
                carListFilter.add(Car);
            }
        }
        Collections.reverse(carListFilter);
        printCarListAfterSomeModification(carListFilter);
        System.out.println("Fillter maxValue: " + maxValue + "" + "Fillter lvlEquipment: " + levelOfEquipment);
    }

    public static void addCardToList() {
    }

    public static void removeCarFromList() {
        //todo
    }

    public static void printCarListAfterSomeModification(List<Car> carlist) {

        for (Car car : carlist){
            System.out.println(car);
        }
        //dodaj 2-3 nowe auta do listy
        //usuń z listy 1-2 auta
        // wyświetl listę
    }

    public static void main(String[] args) {

        //getCarList();
        System.out.println("Enter maxValue: ");
        Scanner UserInputValue = new Scanner(System.in);

        double m = UserInputValue.nextDouble();

        System.out.println();
        //printCarsToValueAndLevelOfEquipment();

        System.out.println("Enter levelOfEquipment: ");
        Scanner UserInputlevelOfEquipment = new Scanner(System.in);

        int l = UserInputlevelOfEquipment.nextInt();

        System.out.println();
        //printCarsToValueAndLevelOfEquipment(levelOfEquipment);

    }
}
