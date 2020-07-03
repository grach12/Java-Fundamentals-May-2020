import java.awt.print.Pageable;
import java.util.Scanner;

public class Demo {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int max = Math.max(3,6);
        System.out.println(max);

int max2 = getMax(5,3);
        System.out.println(max2);

//        printStudent("Pesho", 20, 5.20);
//        printStudent("Gosho", 22, 5.66);
//        printStudent("Tosho", 23, 5.21);
//    }
//    public static void printStudent(String name, int age, double grade) {
//        System.out.printf("Student: %s; Age: %d, Grade: %.2f\n",
//                name, age, grade);
    }

    public  static int getMax(int a, int b){
        int max = a;
        if (a<b){
            max=b;
        }
        return max; //връща резултат, void не връща резултат
    }
}
