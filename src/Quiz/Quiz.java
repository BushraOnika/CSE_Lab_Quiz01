package Quiz;

import java.util.Scanner;

class Bushra{
    int age;
    double cgpa;

}

public class Quiz {
    public static void main(String[] args) {
    Bushra Bush = new Bushra();
        Scanner sc = new Scanner(System.in);
        System.out.println("ENTER THE AGE : ");
        Bush.age=sc.nextInt();
        System.out.println("Enter the cgpa : ");
        Bush.cgpa = sc.nextDouble();

        System.out.println("Age : "+Bush.age);
        System.out.println("Cgpa: "+Bush.cgpa);



    }
}
