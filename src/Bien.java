import java.util.Scanner;

public class Bien {
    public static void main(String[] args) {
        System.out.println("Bai 1 : Khai bao 1 bien kieu int, in ra so do");
        int a = 10;
        System.out.println(a);

        //bai 2
        Scanner scanner = new Scanner(System.in);//cai de nhap
        System.out.println("bai 2 : nhap 1 bien kieu int, in ra so 20");
        int b = scanner.nextInt();
        System.out.println(b);

        //bai3
        System.out.println("Bai 3 : Nhap vao 2 bien kieu float, in ra tong, tich, hieu, thuong, so du cua 2 so do");
        float c = scanner.nextFloat();
        float d = scanner.nextFloat();
        System.out.println("Tong la :"+(c+d));
        System.out.println("Tich la :"+(c*d));
        System.out.println("Hieu la :"+(c-d));
        System.out.println("Thuong la :"+(c/d));
    }
}
