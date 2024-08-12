import java.util.Scanner;

public class baitap8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Mời bạn nhập vào một sô nguyên:");
        String no = "N";
        String yes = "Y";
        int tong = 0;
        int n = Integer.parseInt(scanner.nextLine());
        tong=tong+n;
        System.out.println("Bạn có muốn tiếp tục nhập Y/N");
        String answer = scanner.nextLine();

        while (answer.equals(yes)) {
            System.out.println("Mời bạn nhập vào một sô nguyên:");
            n = Integer.parseInt(scanner.nextLine());
            tong=tong+n;
            System.out.println("Bạn có muốn tiếp tục nhập Y/N");
            answer = scanner.nextLine();
//            if (answer.equals(no)) {
//                break;
//            }
        }

        while (answer.equals(no)) {
//                tong = tong + n;
            break;
        }

        System.out.println("Tổng:" + tong);

        }
    }

