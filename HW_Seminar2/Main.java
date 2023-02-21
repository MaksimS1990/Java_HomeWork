package HW_Seminar2;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        /* Scanner scanner = new Scanner(System.in);
         System.out.print("Введите первую запись: ");
         StringBuilder first = new StringBuilder(scanner.nextLine());
         System.out.println(first);
         
         System.out.print("Введите вторую запись: ");
         StringBuilder second = new StringBuilder(scanner.nextLine());
         System.out.println(second);
         
         if (first.toString().contains(second.toString())) {
             System.out.println("Совпадают!");
         }
         else {
                 System.out.println("Не совпадают!");
         }
        */

        try (Scanner scanner1 = new Scanner(System.in)) {
            System.out.print("Введите первую запись: ");
            StringBuilder first1 = new StringBuilder(scanner1.nextLine());
            System.out.println(first1);

            System.out.print("Введите вторую запись: ");
            StringBuilder second2 = new StringBuilder(scanner1.nextLine());
            System.out.println(second2.reverse());                            //можем разворачивать только одну строку

            if (first1.toString().contains(second2.toString())) {
                System.out.println("Совпадают!");
            }
            else {
                    System.out.println("Не совпадают!");
            }
        }
        

        /* StringBuilder digit1 = new StringBuilder();

        StringBuilder digit2 = new StringBuilder();

        digit1.append("3");
        System.out.println(digit1);

        digit2.append("56");
        System.out.println(digit2);

        digit1.append(" + ");
        System.out.println(digit1);

        digit1.append(digit2);
        System.out.println(digit1);

        digit1.append(" = 59");
        System.out.println(digit1);
        */


        /* digit1.append("3");
        System.out.println(digit1);

        digit2.append("56");
        System.out.println(digit2);

        digit1.append(" - ");
        System.out.println(digit1);

        digit1.append(digit2);
        System.out.println(digit1);

        digit1.append(" = -53");
        System.out.println(digit1);
        */ 


        /* digit1.append("3");
        System.out.println(digit1);

        digit2.append("56");
        System.out.println(digit2);

        digit1.append(" * ");
        System.out.println(digit1);

        digit1.append(digit2);
        System.out.println(digit1);

        digit1.append(" = 168");
        System.out.println(digit1);
        */

        /* digit1.insert(6, " равно ");
        digit1.deleteCharAt(14);
        digit1.deleteCharAt(14);
        digit1.deleteCharAt(13);
        System.out.println(digit1);
        */

        /* digit1.replace(7, 8, "равно");
        System.out.println(digit1);
        */

        }
}