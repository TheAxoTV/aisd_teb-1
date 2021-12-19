package myPackage.exercise;

import java.util.Objects;

//        //------------------------------------- FIFOpriority Employee--------------------------------
//
//        Employee grazyna = new Employee("Grażyna",45,0);
//        Employee jan = new Employee("Jan",45,0);
//        Employee maria = new Employee("Maria",51,1);
//        Employee maria2 = new Employee("Maria",24,1);
//        Employee zbyszek = new Employee("Zbigniew",42,0);
//        Employee felicja = new Employee("Felicja",60,1);
//        Employee adam = new Employee("Adam",30,0);
//        Employee adam2 = new Employee("Adam",49,0);
//        Employee ola = new Employee("Aleksandra",28,1);
//
//        List<Employee> employeeList = new LinkedList<>(Arrays.asList(jan, maria2,zbyszek,felicja,adam,ola, maria, adam2));

//Collections.sort(employeeList);

//        employeeList.sort(new Comparator<Employee>() {
//            @Override
//            public int compare(Employee employee, Employee otherEmployee) {
//                return employee.compareTo(otherEmployee);
//            }
//        });

//        employeeList.sort((employee, otherEmployee) -> employee.compareTo(otherEmployee));

//        for (Employee emp: employeeList){
//            System.out.println(emp);
//        }

public class Employee implements Comparable<Employee> {
    String name;
    Integer age;
    Integer gender;//1 = woman, 0 = man
    Integer seniority;

    public Employee(String name, Integer age, Integer gender, Integer seniority) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.seniority = seniority;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Employee)) return false;
        Employee employee = (Employee) o;
        return seniority.equals(employee.seniority);
    }

    @Override
    public int hashCode() {
        return Objects.hash(seniority);
    }

    //        @Override
//    public boolean equals(Object o) {
//        if (this == o) return true;
//        if (o == null || getClass() != o.getClass()) return false;
//        Employee employee = (Employee) o;
//        return name.equals(employee.name) &&
//                age.equals(employee.age) &&
//                gender.equals(employee.gender);
//    }
//
//    @Override
//    public int hashCode() {
//        return Objects.hash(name, age, gender);
//    }

    @Override
    public int compareTo(Employee otherEmployee) {
//        return this.getAge().compareTo(employee.getAge()); //wiek rosnąco
//        return employee.getAge().compareTo(this.getAge()); //wiek malejąco, zmieniona kolejność porównań


//        int result = this.getName().compareTo(employee.getName()); // po imieniu "jak w słowniku" a następnie po wieku malejąco
//        if(result == 0) {
//            return employee.getAge().compareTo(this.getAge());
//        }
//        return result;

        int result = otherEmployee.getGender().compareTo(this.getGender());
        if(result == 0) {
            int result2 = otherEmployee.getName().compareTo(this.getName());
            if (result2 == 0){
                return otherEmployee.getAge().compareTo(this.getAge());
            }
            return result2;
        }
        return result;


    }//end of compareTo

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Integer getGender() {
        return gender;
    }

    public void setGender(int gender) {
        this.gender = gender;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", gender=" + gender +
                ", seniority=" + seniority +
                '}';
    }
}
