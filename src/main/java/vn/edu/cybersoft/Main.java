package vn.edu.cybersoft;

import java.util.InputMismatchException;

public class Main {
    public static void main(String[] args) {
        try {
            Number n1 = new Number();

        } catch (Exception e) {
            if (e instanceof InputMismatchException) {
                System.out.println("Du lieu nhap vao khong hop le");
            }
        }
    }

    public static void nhap(){

    }
}