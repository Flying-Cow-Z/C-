import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();//总课程数
        int[]a = new int[n];
        for (int i = 0; i < n; i++) {
           a[i] = sc.nextInt();//相应课程的学分
        }
        int []b = new int[n];
        for (int i = 0; i < n; i++) {
           b[i] = sc.nextInt();//相应课程的实际得分
        }

//总评绩点=所有学科绩点之和/所有课程学分之和
        double score = 0.0;
        double gpa = 0.0;

        for (int i = 0; i < n; i++) {
            gpa += fun(b[i])*a[i];
            score += a[i];
        }

        double avg = gpa/score;
        System.out.printf("%.2f",avg);

    }

    private static double fun(int i) {
        double grade = 0;
        if(i>=90 && i<=100){
            grade = 4.0;
        }else if(i>=85 && i<=89){
            grade = 3.7;
        }else if(i>=82 && i<=84){
            grade = 3.3;
        }else if(i>=78 && i<=81){
            grade = 3.0;
        }else if(i>=75 && i<=77){
            grade = 2.7;
        }else if(i>=72 && i<=74){
            grade = 2.3;
        }else if (i>=68 && i<=71){
            grade = 2.0;
        }else if (i>=64 && i<=67){
            grade = 1.5;
        }else if (i>=60 && i<=63){
            grade = 1.0;
        }else{
            grade = 0.0;
        }
        return grade;
    }
}
