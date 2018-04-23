import java.util.Random;

public class Model {
    int randMin = 0;
    int randMax = 100;
    private Random random = new Random();
    private int num;

    public int rand(int min, int max) {  //метод возвращает случайное число в указаном дипазоне
        randMax = max;
        randMin = min;
        num = min + random.nextInt((max + 1) - min);
        return num;
    }

    public int rand() {  //метод возвращает случайное число от 0 до 100
        num = random.nextInt(randMax);
        return num;
    }


}
