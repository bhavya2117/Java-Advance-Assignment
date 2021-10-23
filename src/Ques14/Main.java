package Ques14;

import java.util.Scanner;
import java.util.Vector;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Vector<String> obj = new Vector<>();
        int a;
        do {
            System.out.println("\nPress 1 to enter first name and surname\n");
            System.out.println("Press 2 to display total name\n");
            System.out.println("Press 3 to Exit");
            a = sc.nextInt();
            if (a == 1) {
                System.out.println("Enter first name: ");
                String b = sc.next();
                Name.firstName = b;
                System.out.println("Enter last name: ");
                String c = sc.next();
                Name.surName = c;
                obj.add(Name.firstName + " " + Name.surName);
            } else if (a == 2) {
                System.out.println(obj);
            }
        } while (a != 3);
    }
}
