package com.company;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x;
        x = sc.nextInt();
        palindrome(x);
    }

    static int palindrome(int x){
        int y,sum=0,temp;
        temp=x;
            while (x!=0) {
                y = x % 10;
                sum = sum * 10 + y;
                x = x / 10;
            }

                if(temp==sum)
                    System.out.println("palindrome");
                else
                    System.out.println("palindrome emes");
            return sum;
    }
    }

