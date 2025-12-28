import java.util.ArrayList;
import java.util.Collections;

public class ComparableTorDemo {

    public static void main(String[] args) {

        ArrayList<Integer> marks = new ArrayList<>();

        marks.add(12);
        marks.add(2);
        marks.add(30);
        marks.add(3);
        marks.add(9);

        System.out.println("Integer Class Marks = "+marks);
        System.out.println();

        Collections.sort(marks);
        System.out.println("After Sorting"+ marks);


        ArrayList<Employee> emps = new ArrayList<>();
        emps.add(new Employee("Durgesh","123",101));
        emps.add(new Employee("Abhit","456",11));
        emps.add(new Employee("Bhavesh","789",121));
        emps.add(new Employee("Rajesh","852",12));

        System.out.println();
        System.out.println("List of Employees");
        emps.forEach(s-> System.out.println(s.toString()));


        System.out.println();
        System.out.println("After sorting employees based on \"employeeId\" using Comparable Interface");
        Collections.sort(emps);
        emps.forEach(s-> System.out.println(s.toString()));


        System.out.println();
        System.out.println("After sorting employees based on \"employeeId\" using Comparator Interface");
        Collections.sort(emps,new IdComparator());
        emps.forEach(s-> System.out.println(s.toString()));


        System.out.println();
        System.out.println("After sorting employees based on \"Names\" using Comparator Interface");
        Collections.sort(emps,new NameComparator());
        emps.forEach(s-> System.out.println(s.toString()));


        System.out.println();
        System.out.println("After sorting employees based on \"Phone Number\" using Comparator Interface");
        Collections.sort(emps,new PhoneComparator());
        emps.forEach(s-> System.out.println(s.toString()));


    }

}
