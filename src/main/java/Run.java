import java.util.Random;

public class Run {
    public static void main(String[] args) throws LoggerHW.LessThanSixException {
        LoggerHW loggerHW = new LoggerHW();

        //Random
        Random random = new Random();
        int i = random.nextInt(10);

        //Logger method
        loggerHW.isItLessThanSix(i);

    }
}
