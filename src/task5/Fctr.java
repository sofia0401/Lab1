package task5;

import java.util.Scanner;

public class Fctr {
    int f;

    void Factorial(int n) {
        f = 1;
        while (n > 0) {
            f = f * n;
            n--;
        }
        System.out.println(f);
    }

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        Fctr p=new Fctr();
        p.Factorial(n);

    }
}
