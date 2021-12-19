package myPackage.dataStructure;

import myPackage.exercise.Employee;

import java.util.*;

public class SetStuff {
    public static void setMethod(){
        Employee jan = new Employee("Jan",45,0,18);
        Employee maria = new Employee("Maria",51,1,27);
        Employee maria2 = new Employee("Maria",24,1,3);
        Employee zbyszek = new Employee("Zbigniew",42,0,18);
        Employee felicja = new Employee("Felicja",60,1,37);
        Employee adam = new Employee("Adam",30,0,3);
        Employee adam2 = new Employee("Adam",49,0,18);
        Employee ola = new Employee("Aleksandra",28,1,4);

        List<Employee> employeeList = new LinkedList<>(Arrays.asList(jan, maria2,zbyszek,felicja,adam,ola, maria, adam2));

//        for (Employee emp: employeeList){
//            System.out.println(emp);
//        }

        Set<Employee> employeeSet = new HashSet<>();
        //employeeSet.addAll(employeeList);
        employeeSet.add(jan);
        employeeSet.add(zbyszek);//Is zbyszek included in set?
        System.out.println("Set 1: "+employeeSet);
        System.out.println("Does set contains adam ? "+employeeSet.contains(adam));
        System.out.println("Does set contains zbyszek ? "+employeeSet.contains(zbyszek));// because of hashCode of Employee class
        employeeSet.remove(jan);
        System.out.println("Set 2: "+employeeSet);
        employeeSet.add(zbyszek);
        System.out.println("Set 3: "+employeeSet);

        //System.out.println("Liczba elementów w list:" + employeeList.size());
//        System.out.println("Liczba elementów w set:" + employeeSet.size());
//        for (Employee employee : employeeSet){
//            System.out.println(employee);
//        }
    }
}
