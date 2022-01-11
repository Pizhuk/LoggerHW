import org.apache.log4j.Logger;

public class LoggerHW {
    private Logger logger = Logger.getLogger(LoggerHW.class);
    private static String MESSAGE_SUCCESS = "Приложение успешно запущено";
    private static String MESSAGE_EXCEPTION = "Сгенерированное число - ";

    public boolean isItLessThanSix(int num) throws LessThanSixException {
        if (num <= 5) {
            logger.error(new LessThanSixException(MESSAGE_EXCEPTION+num));
            return true;
        }
        else {
            logger.info(MESSAGE_SUCCESS);
            return false;
        }
    }

    class LessThanSixException extends Exception{
        public LessThanSixException(String message){
            super(message);
        }
    }
}
