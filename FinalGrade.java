import java.util.Scanner;

public class FinalGrade {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите оценку за экзамен");
        int exam = scanner.nextInt();
        System.out.println("Введите количество завершённых проектов");
        int projects = scanner.nextInt();
        System.out.println(finalGrade(exam, projects));
    }
    public static int finalGrade(int exam, int projects) {
        int grade;
        if(exam>90 || projects>10) {
            grade = 100;
        }
        else if(exam>75 & projects>=5) {
            grade = 90;
        }
        else if(exam>50 & projects>=2){
            grade = 75;
        }
        else {
            grade = 0;
        }
        return grade;
    }
}
