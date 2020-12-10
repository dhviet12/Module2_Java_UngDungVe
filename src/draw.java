import java.util.Scanner;

public class draw {
    public static void main(String[] args) {
        System.out.println("Menu");
        System.out.println("1. Draw the triangle");
        System.out.println("2. Draw the square");
        System.out.println("3. Draw the rectangle");
        System.out.println("0. Exit");
        System.out.println("Enter your choice: ");
        Scanner input = new Scanner(System.in);
        int choice = input.nextInt();
            switch (choice){
                case 0:
                    System.exit(0);
                    break;
                case 1:
                    System.out.println("Draw the triangle");
                    for (int i = 0; i < 6; i++) {
                        for (int j = 0; j < i; j++) {
                            System.out.print("*");
                        }
                        System.out.println("");
                    }
                    break;
                case 2:
                    System.out.println("Draw the square");
                    for (int i = 0; i < 4; i++) {
                        System.out.println("********");
                    }
                    break;
                case 3:
                    System.out.println("Draw the rectangle");
                    for (int i = 0; i < 3; i++) {
                        System.out.println("*************");
                    }
                    break;

        }
    }
}
