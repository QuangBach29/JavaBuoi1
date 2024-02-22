import java.util.Scanner;

public class BaiNhapTen {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);//Để nhập
        System.out.println("nhap vao ten :");//in ra
        String ten = scanner.nextLine();//nhập vào và lưu tạm ở tên
        System.out.println(ten);//in ra
    }
}
