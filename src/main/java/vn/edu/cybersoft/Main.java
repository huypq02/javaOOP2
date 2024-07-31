package vn.edu.cybersoft;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try {
//            Number n1 = new Number();
//            nhapSoNguyen(n1);
//            System.out.println("Tong cac phan tu le trong mang: " + n1.sumOddNumber(n1.getNumberArr()));
//
//            System.out.println("-------------------------");
//            Number n2 = new Number();
//            nhapSo(n2);
//            double x = nhapX();
//            System.out.println("So lan xuat hien cua " + x + " trong mang: " + n2.countNumber(n2.getdNumberArr(), x));
//
//            System.out.println("-------------------------");
//            Number n3 = new Number();
//            nhapSoNguyen(n3);
//            System.out.println("Nhap phan tu can xoa: ");
//            int remove = nhapN();
//            n3.removeNumber(n3.getNumberArr(), remove);
//            System.out.println("Mang sau khi xoa " + remove + ": " + n3.getNumberArr());
//
//            System.out.println("-------------------------");
//            Number n4 = new Number();
//            nhapSo(n4);
//            double x2 = nhapX();
//            System.out.println("So luong so am trong mang: " + n4.countNegative(n4.getdNumberArr(), x2));
//            System.out.println("So luong so duong trong mang: " + n4.countPositive(n4.getdNumberArr(), x2));
//            System.out.println("So luong so 0 trong mang: " + n4.countNumber(n4.getdNumberArr(), 0));
//
//            System.out.println("-------------------------");
//            Number n5 = new Number();
//            nhapSo(n5);
//            themXoaSuaMang(n5);
//            System.out.println("Mang sau khi them/xoa/sua: " + n5.getdNumberArr());
//
//            System.out.println("-------------------------");
//            Number n6 = new Number();
//            nhapChuongTrinhLaiSuat(n6);
//            System.out.println("So tien nhan duoc sau " + n6.getThangGui() + " thang la: "
//                    + n6.simpleInterest(n6.getTienGui(), n6.getLaiSuat(), n6.getThangGui()));

            System.out.println("-------------------------");
            Number n7 = new Number();
            int x3 = nhapN();
            System.out.println("Bang cuu chuong cua " + x3 + ": ");
            n7.multiplicationTable(x3);

            System.out.println("-------------------------");
            Number n8 = new Number();
            nhapSoNguyen(n8);
            n8.removeDuplicated(n8.getNumberArr());

            System.out.println("-------------------------");
            Number n9 = new Number();
            nhapSo(n9);
            double x4 = nhapX();
            System.out.println("So luong phan tu trong mang lon hon gia tri x cho truoc: "
                    + n9.countGreaterThan(n9.getdNumberArr(), x4));

            System.out.println("-------------------------");
            Number n10 = new Number();
            nhapSoNguyen(n10);
            int n = nhapN();
            System.out.println("Tong cac so nguyen to nho hon " + n + " la: " + n10.sumPrimeNumber(n10.getNumberArr(), n));


        } catch (Exception e) {
            if (e instanceof InputMismatchException) {
                System.out.println("Du lieu nhap vao khong hop le");
            }
        }
    }

    public static int nhapN() {
        System.out.println("Nhap n: ");
        Scanner sc = new Scanner(System.in);
        return sc.nextInt();
    }


    public static void nhapChuongTrinhLaiSuat(Number num) {
        System.out.println("Nhap so tien gui: ");
        Scanner sc = new Scanner(System.in);
        double tienGui = sc.nextDouble();
        System.out.println("Nhap so thang gui: ");
        int thangGui = sc.nextInt();
        System.out.println("Nhap lai suat: ");
        double laiSuat = sc.nextDouble();
        num.setTienGui(tienGui);
        num.setThangGui(thangGui);
        num.setLaiSuat(laiSuat);
    }

    public static void nhapSoNguyen(Number num) {
        System.out.println("Nhap so phan tu cua mang: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if (n <= 0) {
            System.out.println("So phan tu cua mang phai lon hon 0");
            return;
        }
        List<Integer> arr = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            System.out.println("Nhap phan tu thu " + i + ": ");
            arr.add(sc.nextInt());
        }
        num.setNumberArr(arr);
    }

    public static void nhapSo(Number num) {
        System.out.println("Nhap so phan tu cua mang: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if (n <= 0) {
            System.out.println("So phan tu cua mang phai lon hon 0");
            return;
        }
        List<Double> arr = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            System.out.println("Nhap phan tu thu " + i + ": ");
            arr.add(sc.nextDouble());
        }
        num.setdNumberArr(arr);
    }

    public static double nhapX() {
        System.out.println("Nhap x: ");
        Scanner sc = new Scanner(System.in);
        return sc.nextDouble();
    }

    public static void themXoaSuaMang(Number num) {
        System.out.println("1. Them phan tu vao mang");
        System.out.println("2. Xoa phan tu khoi mang");
        System.out.println("3. Sua phan tu trong mang");
        System.out.println("4. Thoat");
        System.out.println("Chon chuc nang: ");
        Scanner sc = new Scanner(System.in);
        int choice = sc.nextInt();
        List<Double> arr = num.getdNumberArr();
        switch (choice) {
            case 1:
                num.addNumber(arr, nhapX());
                break;
            case 2:
                num.removeNumber(arr, nhapX());
                break;
            case 3:
                num.updateNumber(arr, nhapX(), nhapX());
                break;
            case 4:
                break;
            default:
                System.out.println("Chuc nang khong hop le");
        }
    }
}