import java.util.Scanner;

public class DollarExchangeRate {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите курс доллара в рублях ");
        int n = scanner.nextInt();
        for(int i = 1; i<=100; i++) {
            System.out.println(i+ "$ - " +i*n + " - " +(i*n)/20);
        }
    }
}
