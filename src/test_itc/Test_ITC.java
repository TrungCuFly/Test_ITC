package test_itc;

import java.util.Scanner;

public class Test_ITC {

    private int[] M;
    private int n;
    private final Scanner sc = new Scanner(System.in);

    public void inputArray() {
        System.out.print("Nhập số phần tử mảng: ");
        n = Integer.parseInt(sc.nextLine());
        M = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.print("M[" + i + "] = ");
            M[i] = Integer.parseInt(sc.nextLine());
        }
    }

    public void outputArray() {
        for (int i = 0; i < n; i++) {
            System.out.print(M[i] + "\t");
        }
        System.out.println("");
    }

    public int searchMin() {
        int min = M[0];
        for (int i = 0; i < n; i++) {
            if (M[i] < min) {
                min = M[i];
            }
        }
        return min;
    }

    public void showMin() {
        for (int i = 0; i < n; i++) {
            if (M[i] == searchMin()) {
                System.out.print(M[i] + " ở vị trí " + i);
            }
        }
    }

    public boolean isPrime(int n) {
        if (n <= 1) {
            return false;
        }
        for (int i = 2; i < n; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

    public void showPrime() {
        for (int i = 0; i < n; i++) {
            if (isPrime(M[i])) {
                System.out.print(M[i] + "\t");
            }
        }
    }

    public void showPrimeWhereBigerThan23() {
        for (int i = 0; i < n; i++) {
            if (isPrime(M[i]) && M[i] > 23) {
                System.out.print(i + "\t");
            }
        }
    }

    public int showFirstNegative() {

        for (int i = 0; i < n; i++) {
            if (M[i] < 0) {
                return i;
            }
        }
        return -1;
    }

    public int searchMinNegative() {
        int min = M[0];
        for (int i = 0; i < n; i++) {
            if (M[i] < 0 && M[i] < min) {
                min = M[i];
            }
        }
        return min;
    }

    public void showMaxNegative() {

        for (int i = 0; i < n; i++) {
            if (M[i] == searchMinNegative()) {
                System.out.print(i + "\t");
            }
        }

    }

    public int showFirstPositiveNumber() {

        for (int i = 0; i < n; i++) {
            if (M[i] > 0) {
                return i;
            }
        }
        return -1;
    }

    public int searchMinPositiveNumber() {
        int min = M[0];
        for (int i = 0; i < n; i++) {
            if (M[i] < min && M[i] > 0) {
                min = M[i];
            }
        }
        return min;
    }

    public void showMinPositiveNumber() {
        for (int i = 0; i < n; i++) {
            if (M[i] == searchMinPositiveNumber()) {
                System.out.print(M[i] + " ở vị trí " + i);
            }
        }
    }

    public boolean isBoiThree(int n) {
        if (n < 0) {
            return false;
        }
        if (n % 3 == 0) {
            return true;
        }

        return false;
    }

    public void showBoiThree() {
        for (int i = 0; i < n; i++) {
            if (isBoiThree(M[i])) {
                System.out.print(M[i] + "\t");
            }
        }
        System.out.println("");
    }

    public boolean isBoiFive(int n) {
        if (n < 0) {
            return false;
        }
        if (n % 5 == 0) {
            return true;
        }

        return false;
    }

    public void showBoiFive() {
        for (int i = 0; i < n; i++) {
            if (isBoiFive(M[i])) {
                System.out.print(M[i] + "\t");
            }
        }
        System.out.println("");
    }

    public int showLastEven() {

        for (int i = n - 1; i >= 0; i--) {
            if (M[i] % 2 == 0) {
                return M[i];
            }
        }
        return -1;
    }

    public int searchMaxOdd() {
        int max = -1;
        for (int i = 0; i < n; i++) {
            if (M[i] > max && M[i] % 2 != 0) {
                max = M[i];
            }
        }
        return max;
    }

    public void showLastOdd() {
        if (searchMaxOdd() == -1) {
            System.out.println("-1");
            return;
        }

        for (int i = 0; i < n; i++) {
            if (M[i] == searchMaxOdd()) {
                System.out.print(M[i] + "\t");
            }
        }

    }

//BÀI 85
    public int indexMin85() {
        int min = M[0];
        for (int i = 0; i < n; i++) {
            if (M[i] < min) {
                min = i;
            }
        }
        return min;
    }

    public int indexMax85() {
        int max = M[0];
        for (int i = 0; i < n; i++) {
            if (M[i] > max) {
                max = i;
            }
        }
        return max;
    }

    public void changeIndexBetweenMaxAndMin() {

        int vtmax = indexMax85();
        int vtmin = indexMin85();

        int tmp = M[vtmax];
        M[vtmax] = M[vtmin];
        M[vtmin] = tmp;

        outputArray();

    }

    public void output1ToX() {

        System.out.print("Nhập giới hạn x = ");
        int x = Integer.parseInt(sc.nextLine());

        for (int i = 0; i < n; i++) {
            if (M[i] <= x && M[i] >= 1) {
                System.out.print(M[i] + "\t");
            }
        }

    }
}
