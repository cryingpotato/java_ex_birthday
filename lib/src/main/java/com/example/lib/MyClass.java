package com.example.lib;

public class MyClass {
    public  static  void main(String[] avrg) {
        java.util.Scanner scanner= new
                java.util.Scanner(System.in);

        System.out.println("birthday Year:");
        int inp1=scanner.nextInt();

        System.out.println("birthday Month:");
        int inp2=scanner.nextInt();

        System.out.println("birthday Day:");
        int inp3=scanner.nextInt();

        System.out.println("Your birthday:"+inp1+" "+inp2+" "+inp3);
    }
}
