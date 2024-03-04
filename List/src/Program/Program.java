package Program;

import entities.Employee;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int lastId = 0;
        System.out.print("How many employees will be registered? ");
        int registeredEmployees = sc.nextInt();
        Employee[] employee = new Employee[registeredEmployees];
        List <Integer> idList = new ArrayList<>();
        List <String> nameList = new ArrayList<>();
        List <Double> salaryList = new ArrayList<>();

        for (int i=0; i<registeredEmployees; i++) {
            System.out.printf("Employee #%d:%n", i+1);
            System.out.print("Id: ");
            idList.add(sc.nextInt());
            while (lastId == idList.get(i)) {
                System.out.print("Insert another id: ");
                idList.add(i, sc.nextInt());
            }
            lastId = idList.get(i);
            System.out.print("Name: ");
            sc.nextLine();
            nameList.add(sc.nextLine());
            System.out.print("Salary: ");
            salaryList.add(sc.nextDouble());
            int id = idList.get(i);
            String name = nameList.get(i);
            double salary = salaryList.get(i);
            employee[i] = new Employee(id, name, salary);
            System.out.println();
        }

        System.out.print("Enther the employee id that will have salary increase: ");
        int employeeId = sc.nextInt();
        Integer findId = idList.stream().filter(x -> x == employeeId).findFirst().orElse(null);

        if (findId != null) {
            int indexOfId = idList.indexOf(findId);
            System.out.print("Enther the percentage: ");
            employee[indexOfId].increaseSalary(sc.nextDouble());
        } else {
            System.out.println("This id does not exist!");
        }

        System.out.println();
        System.out.println("List of employees:");
        for (Employee value : employee) {
            System.out.println(value);
        }
    }
}
