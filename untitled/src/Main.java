import  java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
    int side_1,side_2;
        Scanner my_input=new Scanner(System.in);

        System.out.println("Please enter the first side\n\n");
        side_1=my_input.nextInt();
        System.out.println("\nPlease enter second side\n");
        side_2=my_input.nextInt();

        double side3 = Math.sqrt(side_1*side_1+side_2*side_2);// a * a + b * b;
        System.out.println("\n\tHipotenus is "+side3);

        double sum=side3+side_1+side_2;

        double uForArea=sum/2.0;

        double Area=uForArea*(uForArea-side3)*(uForArea-side_1)*(uForArea-side_2);

        System.out.println("\n\n\tArea of triangle is "+Math.sqrt(Area)+" ***");

    }

}