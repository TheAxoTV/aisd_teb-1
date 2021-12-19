package myPackage.dataStructure;

import myPackage.exercise.Employee;

import java.util.HashMap;
import java.util.Map;

public class MapStuff {

    public static void mapMethod(){
        Employee grazyna = new Employee("Grażyna",45,0,20);
        Employee jan = new Employee("Jan",45,0,18);
        Employee maria = new Employee("Maria",51,1,27);
        Employee maria2 = new Employee("Maria",24,1,3);
        Employee zbyszek = new Employee("Zbigniew",42,0,18);
        Employee felicja = new Employee("Felicja",60,1,37);
        Employee adam = new Employee("Adam",30,0,3);
        Employee adam2 = new Employee("Adam",49,0,18);
        Employee ola = new Employee("Aleksandra",28,1,4);


        //Map<key,value>
        Map<String, Employee> employeePhoneNumberMap = new HashMap<>();
        employeePhoneNumberMap.put("698 875 412",grazyna);
        employeePhoneNumberMap.put("857 478 632",adam2);
        employeePhoneNumberMap.put("654 543 213", maria);

//        System.out.println("Key set:");
//        for (String key : employeePhoneNumberMap.keySet()){
//            System.out.println(key);
//        }
//
//        System.out.println("Values:");
//        for (Employee value : employeePhoneNumberMap.values()){
//            System.out.println(value);
//        }

        System.out.println("Entry set:");
        for (Map.Entry<String, Employee> stringEmployeeEntry : employeePhoneNumberMap.entrySet()){
            System.out.println("Key: "+ stringEmployeeEntry.getKey() + " Value: " + stringEmployeeEntry.getValue());
        }


    }
}
