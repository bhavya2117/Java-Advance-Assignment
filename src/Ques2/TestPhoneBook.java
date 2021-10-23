package Ques2;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class TestPhoneBook {
    public static void main(String... args) {
        Map<String, String> map = new HashMap<>();
        Scanner sc = new Scanner(System.in);
        int input;
        do {
            System.out.println("Press 1 to Add new phone book entry\n" + "Press 2 to Search a Phone Number" + "\n" + "Press 3 to Quit.\n");
            input = sc.nextInt();
            if (input == 1) {
                System.out.println("Enter Name");
                String name = sc.next();
                System.out.println("Enter phone number");
                String number = sc.next();
                map.put(name, number);
            } else if (input == 2) {
                System.out.println("Enter contact name");
                String searchName = sc.next();

                if (map.containsKey(searchName)) {
                    System.out.println(map.get(searchName));
                } else {
                    System.out.println("Name does not exist");
                }
            }
        }
        while (input != 3);
    }
}

