import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Controller {
    View view=new View();
    Model model;
    Scanner sc = new Scanner(System.in);
    ArrayList<Integer> nums = new ArrayList<>();  //лист для записи статистики

    public Controller(Model model) {
        this.model = model;
    }

    public void startGame() {
        view.showMenu();
        int secretNumber = view.secretNumber();
        boolean test = false;
        int num;
        while (test == false) {
            try {
                System.out.println("Введите число :");
                num = sc.nextInt();
                if (num >= model.RAND_MIN && num <= model.RAND_MAX) {
                    nums.add(num);
                    if (secretNumber == num) {
                        test = true;
                        System.out.println("Число угадали!");
                    } else {
                        if (num < secretNumber) {
                            System.out.println("Не угадали, загаданое число больше");
                        } else {
                            System.out.println("Не угадали,загаданое число меньше");
                        }
                        test = false;
                    }
                } else {
                    System.out.println("Не правильный ввод");
                }
            }
            catch (InputMismatchException e){
                System.out.println("Не правильный ввод");
               sc=new Scanner(System.in);
            }
        }
    }
    public void statisctic(){
        System.out.println("Статичстика. Все вводимые значения : ");
        for (Integer i:nums){
            System.out.print(i+" ");
        }
    }

}
