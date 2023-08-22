import java.util.Random;
import java.util.Scanner;

public class MultiplicationTable {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите количество примеров ");
        int n = scanner.nextInt();
        int trueAnswer = 0;

        for(int i = 1; i<=n; i++) {
            int number1 = generateNumber();
            int number2 = generateNumber();
            System.out.println(number1 + " * " + number2 + " = ");
            System.out.println("Введите ответ ");
            int answerStudent = scanner.nextInt();
            if (answerStudent == number1 * number2) {
                trueAnswer++;
            }
        }
        printResult(trueAnswer, n);
    }
    static int generateNumber() {
        Random random = new Random();
        return random.nextInt(10);
    }
    public static void printResult(int trueAnswer, int n){ //передавать процент, должна вернуть оценку, а не выводить на экран
        double result = ((double) trueAnswer/n)*100;
        if(result>90) {
            System.out.println("Ваша оценка 5");
        }
        else if(result<90 && result>75) {
            System.out.println("Ваша оценка 4");
        }
        else if(result<75 && result>60) {
            System.out.println("Ваша оценка 3");
        }
        else{
            System.out.println("Ваша оценка 2");
        }
    }
}

