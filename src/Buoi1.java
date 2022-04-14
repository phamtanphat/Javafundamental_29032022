import java.util.Scanner;

public class Buoi1 {

    // method , function ==  Phương thức
    public static void main(String[] args) {

//         1 Kiểu dữ liệu
//
//         Có 2 nhóm
//         Kiểu nguyên thủy (primitives) : Không cung cấp chức năng để xử lý dữ liệu
//             String (chuỗi) => "Nguyễn Văn tèo"
//             char (ký tự) => 'a'
//             int (số nguyên) , double lớn hơn int
//             float (số thực) ,
//             boolean(Kiểu đúng hoặc sai)
//         Kiểu đối tượng (object) : Các phương thức hỗ trợ xử lý dữ liệu
//             Tạo ra một đối tượng Person có thuộc tính name , age
//
//         2 Biến
//        String name = "Phạm Tấn Phát";
//        int age = 28;
//        float height = 1.75f;
//        String favorite = "Basketball";
//        double phone = 0352408366d;
//        String address = "Lý Thường Kiệt , Quận 10";
//        boolean isMale = false;

//        3 Toán tử
//        int a = 5;
//        a = a + 1;
//        a += 1;
//        int b = a++;
        // Nếu dùng a++
        // Biểu thức 1 : lấy giá trị a gán cho thằng bên tay trái
        // Biểu thức 2 : tăng a lên 1 đơn vị
        // Nếu dùng ++a thì ngược lại
        // Phương thức in ra trong hệ thống
        // ctrl + p : xem tham số truyền vào
//        System.out.println(b);

//        int a = 5;
//        int b = 6;
//        int result = a++ - b-- + --a + b-- - --b + a-- - b--;
//        // 5 - b-- + --a + b-- - --b + a-- - b--; a = 6 , b = 6
//        // 5 - 6 + --a + b-- - --b + a-- - b--; a = 6 , b = 5
//        // 5 - 6 + 5 + b-- - --b + a-- - b--; a = 5 , b = 5
//        // 5 - 6 + 5 + 5 - --b + a-- - b--; a = 5 , b = 4
//        // 5 - 6 + 5 + 5 - 3 + a-- - b--; a = 5 , b = 3
//        // 5 - 6 + 5 + 5 - 3 + 5 - b--; a = 4 , b = 3
//        // 5 - 6 + 5 + 5 - 3 + 5 - 3 ; a = 4 , b = 2
//        // result = 8 ,a = 4 , b = 2
//
//        // in
//        // a : ketqua cua a
//        // b : ketqua cua b
//        // result : ketqua cua result
//
//        // Xử lý sâu chuỗi
//        // Toán tử + nếu sử dụng cho chuỗi nó sẽ mang ý nghĩa  là phép nối chuỗi
//        int age = 20;
//         "Age : " + age => Chuỗi
//        System.out.println("A : " + a);
//        System.out.println("B : " + b);
//        System.out.println("Result : " + result);

//        4 Câu điều kiện
//        Nhiều trường hợp xảy ra
//        int month = 5;
//        if( month == 1){
//            //statement
//            System.out.println();
//            System.out.println();
//        } else if(month == 2){
//
//        }else {
//
//        }
//
//        boolean isMale = false;
//        // Chỉ có 2 trường hợp
//        if (isMale == true){
//        // nếu trường hợp là true sẽ viết code dưới đây
//        }else{
//        // nếu khác trường hợp true sẽ viết code dưới đây
//
//        }
        // Toán tử so sánh
        // == : so sánh bằng
        // < : so sánh bé hơn
        // > : so sánh lớn hơn
        // <= : so sánh bé hơn hoặc bằng
        // >= :so sánh lớn hơn hoặc bằng
        // && : so sánh và (And)
        // || : so sánh hoặc (or)

        // So sánh a
        // Nếu a > 0 : 1;
        // Nếu a == 0 ; 0;
        // Nếu a < 0 ; -1;

//        int a = -5;
//
//        if (a > 0){
//            System.out.println("1");
//        }else if(a == 0){
//            System.out.println("0");
//        }else {
//            System.out.println("-1");
//        }

//        5 Câu điều kiện switch case

//        int month = 5;
//        switch (month) {
//            case 1:
//            case 2:
//            case 3:
//                System.out.println("Phần mềm xuất kết quả");
//                System.out.println("Quý 1");
//                break;
//            case 4:
//            case 5:
//            case 6:
//                System.out.println("Phần mềm xuất kết quả");
//                System.out.println("Quý 2");
//                break;
//            default:
//                System.out.println("Phần mềm xuất kết quả");
//                System.out.println("Giá trị nhập vào không chính xác");
//                break;
//        }

//        Scanner scanner = new Scanner(System.in);
//        System.out.print("Mời bạn nhập chiều cao(kg) : ");
//        String height = scanner.nextLine();
//
//        System.out.print("Mời bạn nhập cân nặng(m) : ");
//        String weight = scanner.nextLine();
//
//
//        // chuyển kiểu dữ liệu
//        // convert type
//        float numHeight = Float.parseFloat(height);
//        float numWeight = Float.parseFloat(weight);
//
//        // tính bmi
//
//        float bmi = numWeight / (numHeight * numHeight);
//
//        String outPut = "";
//        if (bmi < 16){
//            outPut = "Gầy chế độ 3";
//        }else if (bmi < 17){
//            outPut = "Gầy chế độ 2";
//        }else if (bmi < 18.5){
//            outPut = "Gầy chế độ 1";
//        }else if (bmi < 25){
//            outPut = "Bình thường";
//        }else if (bmi < 30){
//            outPut = "Thừa cân";
//        }else if (bmi < 35){
//            outPut = "Béo phì độ 1";
//        }else if (bmi < 40){
//            outPut = "Béo phì độ 2";
//        }else {
//            outPut = "Béo phì độ 3";
//        }
//        System.out.println("Xuất chỉ số cơ thể : " + bmi);
//        System.out.println("Bạn đang " + outPut);

        // Tính năm nhuận

        // Mảng (Array) : được lưu trữ ở 1 nơi và không thể thay đổi kích thước được
        // Cách 1 : Khởi tạo mảng nhưng chỉ biết kích thước

        // Array integer
        // 1
        // int[] arrStudents = new int[100];

        // 2
//        String[] arrStudents = {"Tèo","Tí","Tủn"};

        // Lấy dữ liệu từ mảng
//        arrStudents[0] = "Hoa";
//        System.out.println("Phần tử 1 : " + arrStudents[0]);

        // 6 Vòng lặp for

//        for (int i = 0 ; i <= 10 ; i++){
//            System.out.println(i);
//        }

        // Sử dụng vòng lặp chạy từ 1 - 100
        // In ra số chẳn
//        for (int i = 100 ; i >= 1 ; i--){
//            if(i % 2 == 0){
//                System.out.println(i);
//            }
//        }

//        String[] arrNames = {"Toan", "Hoa", "Ngoc", "Lan", "Tuan", "Tien", "Thai", "Vu", "Son"};
//
//        for (int i = 0; i < arrNames.length; i++) {
//            if (arrNames[i] == "Hoa"){
//                return;
//            }
//            System.out.println(arrNames[i]);
//        }
//        System.out.println("Tiếp tục chạy");

        // Tính số nguyên tố

//        Scanner scanner = new Scanner(System.in);
//        System.out.print("Nhập vào con số bất kỳ : ");
//
//        int number = scanner.nextInt();
//
//        if (number < 2){
//            System.out.println("Không phải là số nguyên tố");
//            return;
//        }
//
//        for (int i = 2; i < number ; i++) {
//            if (number % i == 0){
//                System.out.println("Không phải là số nguyên tố");
//                return;
//            }
//        }
//        System.out.println("Số " + number + " là số nguyên tố");

        // 7 Vòng lặp while

//        int a = 5;
//
//        do {
//            System.out.println("Xử lý");
//        }while (a > 5);

        // 5 tính chất
        // Tính đóng gói
        // Tính đa hình
        // Tính trườu tượng
        // Tính kế thừa
        // Quan hệ hash - A
        // class và object


        // Truyền tham trị chỉ dùng cho kiểu nguyên thủy
//        int a = 5;
//        int b = 10;
//
//        a = b;
//
//        b = 15;
//        System.out.println("A " + a);
//        System.out.println("B " + b);

        //Truyền tham chiếu chỉ thấy khi sử dụng cho kiểu đối tượng
//        Animal meo1 = new Animal("Mi mi",1.2f);
//        meo1.showInfo();

        // Tính đóng gói : phạm vi hoạt động - access modifier
        // public
        // private
        // protected

//        Animal meo1 = new Animal("Mi mi",1.2f);
//        meo1.showInfo();

//        Cat cat = new Cat("Mi mi" , 1.2f);
//        cat.showInfo();

//        show("Hello");

        PizzaStore.orderPizza(new PizzaCheese("Pizza cheese"));


    }
    // Cách viết method , function
    // 1 : Phạm vi hoạt động (Access modifier)
    // 2 : Giá trị trả về
    // 3 : Tên
    // 4 : Tham số truyền vào

//    public void tinhTong(int a, int b) {
//        System.out.println(a + b);
//    }

    // nạp chồng phương thức : overload
//    public static void show(String message){
//        System.out.println(message);
//    }
//
//    public static void show(int message){
//        System.out.println(message);
//    }

}
