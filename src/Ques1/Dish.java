package Ques1;

public class Dish {
    int dishID;
    String dishName, creationTime;

    public Dish(int dishID, String creationTime, String dishName) {
        super();
        this.creationTime = creationTime;
        this.dishName = dishName;
        this.dishID = dishID;
    }


    public String toString() {
        return "DishId=" + dishID +
                ", DishName='" + dishName + '\'' +
                ", CreationTime=" + creationTime ;
    }
}

