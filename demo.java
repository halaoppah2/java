import java.util.Scanner;

public class demo {

    public static void main(String[] args){

        //display

        System.out.println("My nane is Oppah, please be guided");
        System.out.println("I want to be the best");
        System.out.println("Java is interesting");
        System.out.println(5);
        System.out.println(5 + 8);
        System.out.println("This is multiplication: " + 5 * 8);

        //variable

        String name = "Oppah";
        String lname = "Enoch";
        System.out.println(name + " " + lname); 
        System.out.println("Hello " + name + ", how are you doing? " + name); 

        //casting

        int age = 12;
        double age1 = age;

        System.out.println(age);
        System.out.println(age1);

        //user input
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter your name: ");
        String gname = scanner.nextLine();

        System.out.println("Enter your age");

        int age3 = scanner.nextInt();

        System.out.println("Hello, " + gname + "! You are " + age3 + " years old.");

        scanner.close();

    }
}