import java.util.Scanner;

public class ConstructorDiverDemo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Accepting user input for name
        System.out.print("Enter name: ");
        String name = scanner.nextLine();

        // Accepting user input for age
        System.out.print("Enter age: ");
        int age = scanner.nextInt();

        // Creating an object of ConstructorDemo with user input
        ConstructorDemo demo = new ConstructorDemo(name, age);

        // Printing the values
        System.out.println("Name: " + demo.getName());
        System.out.println("Age: " + demo.getAge());

        scanner.close();
    }
}
