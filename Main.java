import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Type 1 for dog. Type 2 for cat.");
        Animal animal;
        int n = scanner.nextInt();
        if(n == 1){
            animal = new Dog();
        } else if (n == 2){
            animal = new Cat();
        } else {
            animal = new Animal();
        }
        animal.speak();
    }
}