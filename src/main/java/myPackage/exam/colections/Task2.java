package myPackage.exam.colections;

import java.util.List;

public class Task2 {
    //przynajmniej 10 elementów, pokrywająca większość przypadków i umożliwiająca po wyświetlonych danych ocenić działanie programu
    private static List<Car> carList; //todo ma być posortowana po roczniku, auta nowesze jako pierwsze a starsze później, i stale utzymywać porządek

    public static List<Car> getCarList(){ //TIP singleton
        //zwraca aktualny stan listy aut
        //todo
        return null;
    }

    public static void printSortedCars() {
        //Wypisz na konsolę listę aut (listę należy zrobić samodzielnie, przygotowanie DOBRYCH danych testowych jest cześcią zadania)
        //lista ma być posotrowana po atrybutach w następującej kolejności:
        //- auta ekskluzywne mają znajdować się na początku listy
        //- auta najnowsze, o najwyższym roku produkcji, mają być wyświetlane przed autami starszymi
        //- auta o wyższym poziomie wyposażenia mają być przed autami o niższym poziomie wyposażenia
        //- auta droższe mają być wyświetlane przed tańszymi
    }

    public static void printCarsToValueAndLevelOfEquipment(double maxValue, int levelOfEquipment){
        //Kontekst biznesowy: klient wchodzi na stronę salonu samochodów używanych i chce zobaczyć auta do pewnej kwoty "maxValue"
        // oraz mające konkretny poziom wyposażenia np: poziom 2 = auto ma klimatyzację, a poziom 1 auto klimatyzacji nie ma itp
        //ZADANIE: wyfiltruj a następnie wypisz auta od najtańszego do najdroższego z listy aut
        //todo tutaj wykonaj zadanie
    }

    public static void addCarsToList() {
        //todo
    }

    public static void removeCarFromList() {
        //todo
    }

    public static void printCarListAfterSomeModification(){
        //dodaj 2-3 nowe auta do listy
        //usuń z listy 1-2 auta
        // wyświetl listę
    }

}
