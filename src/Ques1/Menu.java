package Ques1;

import java.util.ArrayList;

public class Menu extends Dish {
    static final ArrayList<Dish> menuList = new ArrayList<Dish>();
    static Dish obj1 = new Dish(100, " 30 min ", " Shahi Paneer\n");
    static Dish obj2 = new Dish(101, " 20 min ", " Chole Bhature\n");
    static Dish obj3 = new Dish(102, " 25 min ", " Masala Dosa\n");

    static {
        menuList.add(obj1);
        menuList.add(obj2);
        menuList.add(obj3);
    }

    public Menu(int dishID, String creationTime, String dishName) {
        super(dishID, creationTime, dishName);
    }
}



