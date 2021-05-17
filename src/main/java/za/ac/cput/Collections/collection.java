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
                LinkedList<String> student = new LinkedList<String>();
                Scanner sc = new Scanner(System.in);

                String a,b;

                a = sc.nextLine();
                b = sc.nextLine();


                System.out.println(student);
                System.out.println("Add name");
                student.add(a);
                System.out.println(student);
                System.out.println("Remove name");
                student.remove(b);
                System.out.println(student);
                System.out.println("Find name");





                //Set
                int one;

                Set<Integer> set = new HashSet<Integer>();

                one = sc.nextInt();
                b = sc.nextLine();


                System.out.println(set);
                System.out.println("Add Number");
                set.add(one = sc.nextInt());
                System.out.println(set);
                System.out.println("Remove name");
                set.remove(one = sc.nextInt());
                System.out.println(set);
                System.out.println("Find name");






                //Map
                String x,y;

                HashMap<String, String> cities = new HashMap<String, String>();

                x = sc.nextLine();
                y = sc.nextLine();

                System.out.println("Insert Country and City");
                cities.put(x = sc.nextLine(),y = sc.nextLine());
                System.out.println(cities);
                System.out.println("Remove Country and City");
                cities.remove(x = sc.nextLine());
                System.out.println(cities);
                System.out.println("Find Country and City");
                cities.get(x = sc.nextLine());



        }


}
