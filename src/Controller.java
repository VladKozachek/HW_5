import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Controller {
    View view = new View();
    Model model;
    Scanner sc = new Scanner(System.in);
    ArrayList<Integer> nums = new ArrayList<>();  //лист для записи статистики
    int num;
    int secretNumber;
    boolean check = false;

    public Controller(Model model) {

        this.model = model;
    }

    public void startGame() {
        view.showMenu();
        secretNumber = view.secretNumber();

        while (check == false) {
            try {
                System.out.println("Введите число :");
                num = sc.nextInt();
                if (num >= model.randMin && num <= model.randMax) { // проверка, чтобы число не било больше диапазона
                    nums.add(num);  //записываем числа в лист для истории
                    checkGuessed();
                } else {
                    System.out.println("Не правильный ввод");
                }
            } catch (InputMismatchException e) {
                System.out.println("Не правильный ввод");
                sc = new Scanner(System.in);
            }
        }
    }

    public void statisctic() {
        System.out.println("Статистика. Все вводимые значения : ");
        for (Integer i : nums) {
            System.out.print(i + " ");
        }
    }

    public void messageMoreLess() {

        if (num < secretNumber) {
            System.out.println("Не угадали, загаданое число больше");
        } else {
            System.out.println("Не угадали,загаданое число меньше");
        }

    }

    public void checkGuessed() {
        if (secretNumber == num) {
            check = true;
            System.out.println("Число угадали!");
        } else {
            messageMoreLess();
            check = false;
        }
    }


}
