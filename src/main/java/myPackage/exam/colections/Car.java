package myPackage.exam.colections;


public class Car implements Comparable<Car> {
    boolean isExclusive;
    int yearOfProduction;
    int levelOfEquipment;
    int id;
    double value;

    public Car(boolean isExclusive, int yearOfProduction, int levelOfEquipment, int id, double value) {
        this.isExclusive = isExclusive;
        this.yearOfProduction = yearOfProduction;
        this.levelOfEquipment = levelOfEquipment;
        this.id = id;
        this.value = value;
    }

    public boolean getExclusive() {
        return this.isExclusive;
    }

    public Integer getYear() {
        return this.yearOfProduction;
    }

    public Integer getLevel() {
        return levelOfEquipment;
    }

    public Integer getId() {
        return this.id;
    }

    public double getValue() {
        return this.value;
    }

    public int compareTo(Car o) {
        return 0;
    }

    public String toString() {
        return "isExclusive: " + this.isExclusive + "" + "yearofProduction: " + this.yearOfProduction + "" + "levelofEquipment: " +this.levelOfEquipment + "" + "id: " + this.id + "" + "value: "+this.value;
    }

    public Object getLevelOfEquipment() {
        return  levelOfEquipment;
    }
}
