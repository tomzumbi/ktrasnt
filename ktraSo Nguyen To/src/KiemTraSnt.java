import java.util.Scanner;

public class KiemTraSnt {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("kiem tra so nguyen to");
        int a = scanner.nextInt();
        int dem = 0;
        for (int i = 1; i <= a; i++) {
            if (a % i == 0){
                dem ++;
            }
        }
        if (dem == 2){
            System.out.println(a + "la so nguyen to");
        }else {
            System.out.println("khong phai");
        }
    }
}
