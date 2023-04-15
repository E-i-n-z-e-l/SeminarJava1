import java.util.Scanner;
public class TaskJava1 {
    public static void main(String[] args) { // ctrl+alt+m Можно прямо в классе создать следующий метод
            Scanner myScanner = new Scanner(System.in);
            System.out.println("Введите ваше имя: ");
            String name = myScanner.nextLine();
            System.out.printf("Привет, %s%n", name);
    }
}
