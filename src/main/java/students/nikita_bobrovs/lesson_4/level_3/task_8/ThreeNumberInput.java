package students.nikita_bobrovs.lesson_4.level_3.task_8;

import java.util.Scanner;

class ThreeNumberInput {
    int a, b, c;

    void equality() {
        if (a == b && a == c) {
            System.out.println("All number are equal");}
        else if (a != b && a != c && b != c) {
            System.out.println("All numbers are different");}
        else {
            System.out.println("Neither all are equal or different");
        }
    }
    void order(){
        if (a < b && b < c){
            System.out.println("Increasing");}
        else if (a > b && b > c){
            System.out.println("Decreasing");}
        else
            System.out.println("Neither increasing or decreasing order");
    }
    int maxNum (){
        return Math.max(a, Math.max(b , c));
    }

}

class ThreeNumberInputDemo {
    public static void main(String[] args) {
        System.out.println("Enter three round numbers");
        Scanner scan = new Scanner(System.in);
        ThreeNumberInput demo = new ThreeNumberInput();
        demo.a = scan.nextInt();
        demo.b = scan.nextInt();
        demo.c = scan.nextInt();
        //Task 8
        System.out.println("*Equal or Different*");
        demo.equality();
        System.out.println();
        //Task 9
        System.out.println("*Increasing or Decreasing order*");
        demo.order();
        System.out.println();
        //Task 10
        System.out.println("*Biggest number is*");
        System.out.println(demo.maxNum());
    }

}
