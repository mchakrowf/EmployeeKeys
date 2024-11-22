
//Mohamed Chakrowf Print Keys and their values.

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.TreeMap;

public class Main {

    public static void main(String[] args) {

        //Setting values here so I don't have to place them repeatedly
        final double e1 = 478.33;

        final double e2 = 375.23;

        final double e3 = 500.25;

        final double e4 = 290.63;

        final double e5 = 405.00;

        final double e6 = 595.94;

        final double e7 = 659.34;

        final double e8 = 363.04;

        //Hash Maps randomly place keys and values
        HashMap<String, Double> employee1 = new HashMap<>();

        System.out.println("Report 1");

        employee1.put("Employee 1", e1);

        employee1.put("Employee 2", e2);

        employee1.put("Employee 3", e3);

        employee1.put("Employee 4", e4);

        employee1.put("Employee 5", e5);

        employee1.put("Employee 6", e6);

        employee1.put("Employee 7", e7);

        employee1.put("Employee 8", e8);

        for (String name : employee1.keySet()) {

            System.out.println(name + ": " + employee1.get(name));
        }

        System.out.println();

        //Linked Hash Maps print keys and values in the order you place them
        LinkedHashMap<String, Double> employee2 = new LinkedHashMap<>();

        System.out.println("Report 2");

        employee2.put("Employee 3", e3);

        employee2.put("Employee 5", e5);

        employee2.put("Employee 2", e2);

        employee2.put("Employee 7", e7);

        employee2.put("Employee 4", e4);

        employee2.put("Employee 6", e6);

        employee2.put("Employee 8", e8);

        employee2.put("Employee 1", e1);

        for (String name : employee2.keySet()) {

            System.out.println(name + ": " + employee2.get(name));
        }

        System.out.println();

        //Tree Maps sort keys and values in natural order
        TreeMap<String, Double> employee3 = new TreeMap<>();

        System.out.println("Report 3");

        employee3.put("Employee 5", e5);

        employee3.put("Employee 6", e6);

        employee3.put("Employee 7", e7);

        employee3.put("Employee 8", e8);

        employee3.put("Employee 1", e1);

        employee3.put("Employee 2", e2);

        employee3.put("Employee 3", e3);

        employee3.put("Employee 4", e4);

        for (String name : employee3.keySet()) {

            System.out.println(name + ": " + employee3.get(name));
        }

    }
}
