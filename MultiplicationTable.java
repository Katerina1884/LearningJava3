import java.util.Scanner;

public class MultiplicationTable {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите количество примеров ");
        int n = scanner.nextInt();
        int a = 1;
        int b = 10;
        double trueAnswer = 0;

        for(int w = 1; w<=n; w++) {
            int number1 =0;
            int number2 =0;
            for (int x = 0; x <= n; x++) {
                number1 = a + (int) (Math.random() * b); //убрать 2 цикла
            }

            for (int y = 0; y <= n; y++) {
                number2 = a + (int) (Math.random() * b);
            }

            System.out.println(number1 + " * " + number2 + " = ");
            System.out.println("Введите ответ ");
            int answerStudent = scanner.nextInt();
            if(answerStudent == number1*number2) {
                trueAnswer++;
            }
        }
        double result = (trueAnswer/n)*100;
        if(result>90) {
            System.out.println("Ваша оценка 5"); // вынести в функцию
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

