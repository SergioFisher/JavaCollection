package za.ac.cput.Collections;/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Sergio
 */
import static java.awt.AWTEventMulticaster.add;
import java.util.*;


public class collection {

        public static void main(String[] args) {


                //List
                String a,b;
                LinkedList<String> student = new LinkedList<String>();
                student.add("Jon");
                student.add("Rob");
                student.add("Stanley");
                student.add("Coby");

                Scanner sc = new Scanner(System.in);







                System.out.println(student);
                System.out.println("Add name");
                student.add(a = sc.nextLine());
                System.out.println(student);
                System.out.println("Remove name");
                student.remove(b = sc.nextLine());
                System.out.println(student);
                System.out.println("Find name Jon");
                student.get(0);





                //Set
                int one;

                Set<Integer> set = new HashSet<Integer>();
                set.add(34);
                set.add(3);
                set.add(9);


                System.out.println(set);
                System.out.println("Add Number");
                set.add(one = sc.nextInt());
                System.out.println(set);
                System.out.println("Remove number");
                set.remove(one = sc.nextInt());
                System.out.println(set);
                System.out.println("Find number");
                set.size();






                //Map
                String x,y;

                HashMap<String, String> cities = new HashMap<String, String>();
                cities.put("Australia","Sydney");
                cities.put("USA","Chicago");
                cities.put("USA","Texas");

                System.out.println("Insert Country and City");
                cities.put(x = sc.nextLine(),y = sc.nextLine());
                System.out.println(cities);
                System.out.println("Remove Country and City");
                cities.remove(x = sc.nextLine(),y = sc.nextLine());
                System.out.println(cities);
                System.out.println("Find Country and City");
                System.out.println(cities.get(x = sc.nextLine()));



        }


}
