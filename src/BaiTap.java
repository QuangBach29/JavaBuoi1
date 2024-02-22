public class BaiTap {
    public static void main(String[] args) {
//        Khai báo mảng số thực: 1.2, 2, 3, 5, 6.2
//                - Tìm max
//                - Tính tổng
//                - Tính tích

        float[] mangSoThuc = {1.2f,2f,3f,5f,6.2f};
        float max = mangSoThuc[0];
        for (int i = 0; i < mangSoThuc.length; i++) {
            if (mangSoThuc[i]>max){
                max = mangSoThuc[i];
            }
        }

        float tong = 0;
        for (float soThuc : mangSoThuc){
            tong += soThuc;
        }

        float tich = 1;
        for (float soThuc : mangSoThuc){
            tich *= soThuc;
        }
        System.out.println(max);
        System.out.println(tong);
        System.out.println(tich);

    }
}
