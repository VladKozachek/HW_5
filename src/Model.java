import java.util.Random;

public class Model {
    static int RAND_MIN=0;
    static int RAND_MAX=100;
    private Random random = new Random();
    private int num;

    public int rand(int min, int max){  //метод возвращает случайное число в указаном дипазоне
        RAND_MAX=max;
        RAND_MIN=min;
        num = min + random.nextInt((max+1) - min);
        return num;
    }
    public int rand(){  //метод возвращает случайное число от 0 до 100
        num = random.nextInt(RAND_MAX);
        return num;
    }


}
