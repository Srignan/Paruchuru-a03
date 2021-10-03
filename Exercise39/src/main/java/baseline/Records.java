/*
 *  UCF COP3330 Fall 2021 Assignment 39 Solution
 *  Copyright 2021 Srignan Paruchuru
 */

package baseline;

import java.util.*;
public class Records {

        /*
        private final ArrayList<Map<String, String>> data = new ArrayList<>();
        public void makeDatabase(){
            Map<String, String> employee1 = new HashMap<>();
            employee1.put("Firstname","John");
            employee1.put("Lastname","Johnson");
            employee1.put("Position","Manager");
            employee1.put("Separation Date","2016-12-31");
            data.add(employee1);
            Repeat for each employee.
         */
        private final ArrayList<Map<String, String>> data = new ArrayList<>();
        public void makeDatabase(){
            Map<String, String> employee1 = new HashMap<>();
            employee1.put("Firstname","John");
            employee1.put("Lastname","Johnson");
            employee1.put("Position","Manager");
            employee1.put("Separation Date","2016-12-31");

            Map<String, String> employee2 = new HashMap<>();
            employee2.put("Firstname","Tou");
            employee2.put("Lastname","Xiong");
            employee2.put("Position","Software Engineer");
            employee2.put("Separation Date","2016-10-05");

            Map<String, String> employee3 = new HashMap<>();
            employee3.put("Firstname","Michaela");
            employee3.put("Lastname","Michaelson");
            employee3.put("Position","District Manager");
            employee3.put("Separation Date","2015-12-19");

            Map<String, String> employee4 = new HashMap<>();
            employee4.put("Firstname","Jake");
            employee4.put("Lastname","Jacobson");
            employee4.put("Position","Programmer");
            employee4.put("Separation Date","");

            Map<String, String> employee5 = new HashMap<>();
            employee5.put("Firstname","Jacquelyn");
            employee5.put("Lastname","Jackson");
            employee5.put("Position","DBA");
            employee5.put("Separation Date","");

            Map<String, String> employee6 = new HashMap<>();
            employee6.put("Firstname","Sally");
            employee6.put("Lastname","Webber");
            employee6.put("Position","Web Developer");
            employee6.put("Separation Date","2015-12-18");

            data.add(employee1);
            data.add(employee2);
            data.add(employee3);
            data.add(employee4);
            data.add(employee5);
            data.add(employee6);
        }

        /*
        public String[] orderByLastName()
            StringBuilder result = new StringBuilder();
            for (Map<String, String> tool : data) {
                result.append(tool.get "last name".append " ")
            }
            String [] order == result.toString().split (" ")
            Arrays.sort(order);
            return order
         */
        public String[] orderByLastName(){
            StringBuilder result = new StringBuilder();
            for (Map<String, String> tool : data) {
                result.append(tool.get("Lastname")).append(" ");
            }

            String[] order= result.toString().split(" ");
            Arrays.sort(order);
            return order;
        }
        /*
        StringBuilder result = new StringBuilder("Name                | Position          | Separation Date\n--------------------|-------------------|----------------\n");
        String sortedNames = orderByLastName
        for (String sortedName : sortedNames) {
            for (Map<String, String> tool : data) {
            String check  tool.get("Lastname"
         if (sortedName. equals(check)) {
         string name = Map tool. get "First name" + map tool.get last name
         break;
         print result
         */

    public void printByLastName(){
            StringBuilder result = new StringBuilder("Name                | Position          | Separation Date\n--------------------|-------------------|----------------\n");

            String[] sortedNames = orderByLastName();
            for (String sortedName : sortedNames) {
                for (Map<String, String> tool : data) {
                    String check = tool.get("Lastname");
                    if (sortedName.equals(check)) {
                        String name = ((Map) tool).get("Firstname") + " " + ((Map) tool).get("Lastname");
                        String format = String.format("%-20s|", name) + String.format("%-19s|", ((Map) tool).get("Position")) + String.format("%-20s", ((Map) tool).get("Separation Date")) + "\n";
                        result.append(format);
                        break;
                    }
                }
            }
            System.out.print(result);
        }
    }

