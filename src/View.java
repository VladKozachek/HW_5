import java.util.InputMismatchException;
import java.util.Scanner;

public class View {
    Model model = new Model();
    private int number;
    private boolean t = false;
    Scanner sc = new Scanner(System.in);

    public void showMenu() {
        System.out.println("Выберите игру:");
        System.out.println("1- игра по умолчанию(от 0 до 100)");
        System.out.println("2- игра с Вашими параметрами");
    }

    public int secretNumber() {
        while (t == false) {
            try {
                int count = sc.nextInt();
                switch (count) {
                    case 1:
                        number = model.rand();
                        System.out.println("Число загаданно! Попробуйте отгадать!");
                        t = true;
                        break;
                    case 2:
                        System.out.println("Введите диапазон ");
                        int min = sc.nextInt();
                        int max = sc.nextInt();
                        number = model.rand(min, max);
                        System.out.println("Число загаданно! Попробуйте отгадать!");
                        t = true;
                        break;
                }
            } catch (InputMismatchException e) {
                System.out.println("Не правильный ввод");
                System.out.println("Введите еще раз :");
                sc = new Scanner(System.in);
            }
        }

        return number;
    }


}
