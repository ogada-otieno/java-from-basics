package scan;

import java.util.Scanner;

public class Scan {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            String name = sc.nextLine();
            System.out.println("Hello, " + name + ". Howdie?");
        }
    }
}
