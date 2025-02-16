import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int age;
        System.out.print("Enter your age: ");
        age = input.nextInt();
        if(age >= 21){
            System.out.println("You get a wristband");
        }
    }
}