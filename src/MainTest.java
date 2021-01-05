import java.util.Scanner;

public class MainTest {
    static ManageOfStudent manageOfStudent = new ManageOfStudent();
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        int choice;
        do {
            menuShow();
            choice = Integer.parseInt(sc.nextLine());
            switch (choice) {
                case 1:
                    System.out.println("nhập số lượng sinh viên muốn thêm vào");
                    int amount = Integer.parseInt(sc.nextLine());
                    for (int i = 0; i < amount; i++) {
                        manageOfStudent.addNew();
                    }
                    break;
                case 2:
                    manageOfStudent.editById();
                    break;
                case 3:
                    manageOfStudent.deleteById();
                    break;
                case 4:
                    manageOfStudent.sortByGpa();
                    break;
                case 5:
                    manageOfStudent.sortByName();
                    break;
                case 6:
                    manageOfStudent.showAll();
                    break;
                case 7:
                    manageOfStudent.save();
                    break;
                case 8:
                    manageOfStudent.read();
                    break;
                case 9:
                    System.err.println("Exits program");
                    break;
            }
        }while (choice!=9);
    }

    private static void menuShow() {
        System.out.println("1. Thêm sinh viên");
        System.out.println("2. Sửa thông tin sinh viên theo id");
        System.out.println("3. Xóa sinh viên theo id");
        System.out.println("4. Sắp xếp sinh viên theo gpa");
        System.out.println("5. Sắp xếp sinh viên theo tên");
        System.out.println("6. Hiển thị tất cả sinh viên");
        System.out.println("7. Lưu thông tin sinh viên");
        System.out.println("8. Đọc thông tin sinh viên đã lưu");
        System.out.println("9.Thoát chương trình");
        System.out.println("Mời bạn nhập lựa trọn");
    }
}
