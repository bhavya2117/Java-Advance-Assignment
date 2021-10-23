//Q1.  Write a java program as per the below given specification:
//
//i) Design a Dish class having dishID, dishName, creationTime as the attributes. To initialize the attributes of the class and create a parameterized constructor. Also override the toString() method to print the object's details on the console.
//ii) Design a Menu class having menuList as an attribute which is a static ArrayList. Load the menuList with a Dish object comprising some sample dishes using a static block.
//iii) Design a Restaurant class comprising the main method. It should give a menu driven interface to a user as follows:
//Press 1 to display Dishes.
//Press 2 to search Dish.
//iv) On the click of 1 all the dishes offered by the restaurant should be displayed to a user.
//v) On the click of 2 it prompts the user to enter the dishID, if the ID entered matches with the dish, its details should be printed on the console.

package Ques1;

import java.util.Scanner;

public class Restaurant {
    public static void main(String[] args) {
        System.out.println("Press 1 to display Dishes.\n");
        System.out.println("Press 2 to search Dish.\n");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        if (a == 1) {
            System.out.println(Menu.menuList);
        } else if (a == 2) {
            System.out.println("enter the dishID");
            int b = sc.nextInt();
            for (int i = 0; i < Menu.menuList.size(); i++) {
                if (b == Menu.menuList.get(i).dishID) {
                    System.out.println(Menu.menuList.get(i));
                }
            }
        }
    }
}

