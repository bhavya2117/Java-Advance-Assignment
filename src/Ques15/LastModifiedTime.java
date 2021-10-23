//Q15. Write a Java program to get the last modified time of a file.

package Ques15;

import java.io.File;
import java.util.Date;

public class LastModifiedTime {
    public static void main(String[] args) {
        File obj = new File("src/Ques15/hello.txt");
        Date obj2 = new Date(obj.lastModified());
        System.out.println("\nThe file was last modified on: " + obj2 + "\n");
    }
}
