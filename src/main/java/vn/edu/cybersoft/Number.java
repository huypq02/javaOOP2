package vn.edu.cybersoft;

import vn.edu.cybersoft.pkg.utils;

import java.util.List;
import java.util.Objects;


public class Number {
    private List<Integer> numberArr;
    private List<Double> dNumberArr;
    private double tienGui;
    private double laiSuat;
    private int thangGui;

    // 1. tinh tong cac phan tu le trong mang
    public int sumOddNumber(List<Integer> arr) {
        int sum = 0;
        for (int i = 0; i < arr.size(); i++) {
            if (utils.isOdd(arr.get(i))) {
                sum += arr.get(i);
            }
        }
        return sum;
    }

    // 2. dem so lan xuat hien cua 1 phan tu trong mang
    public int countNumber(List<Double> arr, double x) {
        int count = 0;
        for (int i = 0; i < arr.size(); i++) {
            if (arr.get(i) == x) {
                count++;
            }
        }
        return count;
    }

    // 3. xoa 1 phan tu khoi cac mang so nguyen
    public void removeNumber(List<Integer> arr, int x) {
        for (int i = 0; i < arr.size(); i++) {
            if (arr.get(i) == x) {
                arr.remove(i);
            }
        }
    }

    // 4.1 dem so luong so am
    public int countNegative(List<Double> arr, double x) {
        int count = 0;
        for (int i = 0; i < arr.size(); i++) {
            if (utils.isNegative(arr.get(i))) {
                count++;
            }
        }
        return count;
    }
    // 4.2 dem so luong so duong
    public int countPositive(List<Double> arr, double x) {
        int count = 0;
        for (int i = 0; i < arr.size(); i++) {
            if (utils.isPositive(arr.get(i))) {
                count++;
            }
        }
        return count;
    }
    // 4.3 dem so luong so 0 or tai su dung lai 2. dem so lan xuat hien cua 1 phan tu trong mang
    public int countZero(List<Double> arr, double x) {
        int count = 0;
        for (int i = 0; i < arr.size(); i++) {
            if (utils.isZero(arr.get(i))) {
                count++;
            }
        }
        return count;
    }

    // 5.1 them gia tri
    public void addNumber(List<Double> arr, double x) {
        arr.add(x);
    }
    // 5.2 xoa gia tri, su dung lai 3. xoa 1 phan tu khoi cac mang so nguyen
    public void removeNumber(List<Double> arr, double x) {
        for (int i = 0; i < arr.size(); i++) {
            if (arr.get(i) == x) {
                arr.remove(i);
            }
        }
    }
    // 5.3 cap nhat gia tri
    public void updateNumber(List<Double> arr, double x, double y) {
        for (int i = 0; i < arr.size(); i++) {
            if (arr.get(i) == x) {
                arr.set(i, y);
            }
        }
    }


    // 6 tinh lai suat don gian voi cong thuc A = P(1 + rt),
    // trong do P la so tien goc, r la lai suat, t la thoi gian
    public double simpleInterest(double P, double r, double t) {
        return P * (1 + r * t);
    }


    // 7 viet chuong trinh in bang nhan tu 1 den 10
    public int multiplicationTable(int n) {
        for (int i = 1; i <= 10; i++) {
            System.out.println(n + " x " + i + " = " + n * i);
        }
        return 0;
    }

    // 8 viet chuong trinh xoa cac phan tu trung lap trong mang cac so nguyen
    public void removeDuplicated(List<Integer> arr){
        for (int i = 0; i < arr.size(); i ++){
            for (int j = i+1; j < arr.size(); j++){
                if (Objects.equals(arr.get(i), arr.get(j))){
                    arr.remove(j);
                }
            }
        }
        System.out.println("Mang con lai sau khi xoa trung lap: " + arr);
    }

    // 9 viet chuong trinh dem so luong phan trong mang lon hon mot gia tri cho truoc
    public int countGreaterThan(List<Double> arr, double x){
        int count = 0;
        for (int i = 0; i < arr.size(); i++){
            if (arr.get(i) > x){
                count++;
            }
        }
        return count;
    }

    // 10 viet chuong trinh tinh tong cac so nguyen to nho n trong mang cho truoc
    public int sumPrimeNumber(List<Integer> arr, int n){
        int sum = 0;
        for (int i = 0; i < arr.size(); i++){
            if (utils.isPrime(arr.get(i)) && arr.get(i) < n){
                sum += arr.get(i);
            }
        }
        return sum;
    }

    ///---------------------------------------------------------
    // getter and setter
    public List<Integer> getNumberArr() {
        return numberArr;
    }

    public void setNumberArr(List<Integer> numberArr) {
        this.numberArr = numberArr;
    }

    public List<Double> getdNumberArr() {
        return dNumberArr;
    }

    public void setdNumberArr(List<Double> dNumberArr) {
        this.dNumberArr = dNumberArr;
    }

    public double getTienGui() {
        return tienGui;
    }

    public void setTienGui(double tienGui) {
        this.tienGui = tienGui;
    }

    public int getThangGui() {
        return thangGui;
    }

    public void setThangGui(int thangGui) {
        this.thangGui = thangGui;
    }

    public double getLaiSuat() {
        return laiSuat;
    }

    public void setLaiSuat(double laiSuat) {
        this.laiSuat = laiSuat;
    }
}
