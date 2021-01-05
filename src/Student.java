import java.io.Serializable;
import java.util.Scanner;

public class Student implements Serializable {
    private String  name;
    private String studentId;
    private int age;
    private String address;
    private double gpa;

    public Student() {
    }

    public Student(String name, String studentId, int age, String address, double gpa) {
        this.name = name;
        this.studentId = studentId;
        this.age = age;
        this.address = address;
        this.gpa = gpa;
    }
    public String getStudentId(){
        return studentId;
    }

    public String getName() {
        return name;
    }

    public double getGpa() {
        return gpa;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setStudentId(String studentId) {
        this.studentId = studentId;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setGpa(double gpa) {
        this.gpa = gpa;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", studentId='" + studentId + '\'' +
                ", age=" + age +
                ", address='" + address + '\'' +
                ", gpa=" + gpa +
                '}';
    }
    public void setInformation() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập mã sinh viên");
        studentId = sc.nextLine();
        editInformation();
        System.out.println("_________________________________________");
    }

    public void editInformation() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập tên");
        name = sc.nextLine();
        System.out.println("Nhập tuổi");
        age = Integer.parseInt(sc.nextLine());
        System.out.println("Nhập địa chỉ");
        address = sc.nextLine();
        System.out.println("Nhập điểm trung bình");
        gpa = Double.parseDouble(sc.nextLine());
    }
}
