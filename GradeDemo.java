import java.util.Arrays;
import java.util.Scanner;

public class GradeDemo {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        double grade[] = new double[10];
        for(int i = 0; i <10; i++){
            grade[i]= input.nextDouble();
            }
        AverageGrade grade1 = new AverageGrade();
        grade1.setAverageGrade(grade);
        MaxGrade grade2 = new MaxGrade();
        grade2.setMaxGrade(grade);
        System.out.println("The ten grades provided are: " + Arrays.toString(grade));
        System.out.println("The average of the grades is: " + grade1.getAverageGrade());
        System.out.println("The maximum grade achieved is: " + grade2.getMaxGrade());
    }

}
