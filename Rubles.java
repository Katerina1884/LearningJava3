import java.util.Scanner;

public class Rubles {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите сумму");
        int summa = scanner.nextInt();
        int x = summa%10;
        if (summa%100>=11&&summa%100<=14)
        {
            System.out.println(summa+ " рублей");
        }
        else if(x == 1){
            System.out.println(summa + " рубль");
        }
        else if(x == 2 || x==3 || x ==4){
            System.out.println(summa + " рубля");
        }
        else {
            System.out.println(summa + " рублей");
        }


    }
}
