import java.util.Scanner;

public class baitap7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Mời bạn nhập vào số nguyên dương n:");
        int n = Integer.parseInt(scanner.nextLine());
        int tong = 0;
        int i = 1;
        // While
       /* while (i <= n) {
            if (i % 2 == 0) {
                tong = tong + i;
            }
            i++;
        }
            System.out.println(" Tổng các số nguyên dương chắn là\t" + tong);*/


        //Dùng vòng lặp do while
        do{
            if (i % 2 == 0) {
                tong = tong + i;
            }
            i++;
        }
        while(i<=n);
        System.out.println(" Tổng các số nguyên dương chắn trong dãy là: \t" + tong);









        }
    }

