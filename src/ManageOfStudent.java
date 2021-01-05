import java.io.*;
import java.util.*;

public class ManageOfStudent implements Serializable {
    List<Student> studentList = new ArrayList<>();
    Scanner sc = new Scanner(System.in);

    public void addNew() {
        Student student = new Student();
        student.setInformation();
        studentList.add(student);
    }

    public void editById() {
        System.out.println("Mời bạn nhập mã sinh viên cần kiểm tra");
        String studentId = sc.nextLine();
        boolean testStudentId = false;
        for (int i = 0; i < studentList.size(); i++) {
            Student student = studentList.get(i);
            testStudentId = student.getStudentId().equalsIgnoreCase(studentId);
            if (testStudentId) {
                student.editInformation();
                return;
            }
        }
        if (!testStudentId) {
            System.err.println("Not Exits");
        }
    }

    public void deleteById() {
        System.out.println("Mời bạn nhập mã sinh viên cần kiểm tra");
        String studentId = sc.nextLine();
        boolean testStudentId = false;
        for (int i = 0; i < studentList.size(); i++) {
            Student student = studentList.get(i);
            testStudentId = student.getStudentId().equalsIgnoreCase(studentId);
            if (testStudentId) {
                studentList.remove(i);
                return;
            }
        }
        if (!testStudentId) {
            System.err.println("Not Exits");
        }
    }

    public void sortByGpa() {
        Collections.sort(studentList, (o1, o2) -> {
            if (o1.getGpa() < o2.getGpa()) return -1;
            return 1;
        });
        System.out.println(studentList);
    }

    public void sortByName() {
        Collections.sort(studentList, (o1, o2) -> {
            return o1.getName().compareTo(o2.getName());
        });
        showAll();
    }

    public void showAll() {
        for (int i = 0; i < studentList.size(); i++) {
            System.out.println(studentList.get(i));
        }
    }

    public void save() {
        FileOutputStream fos = null;
        ObjectOutputStream oos = null;
        try {
            fos = new FileOutputStream("student.dat");
            oos = new ObjectOutputStream(fos);
            oos.writeObject(studentList);
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                fos.close();
                oos.close();
            } catch (Exception e) {
            }
        }
    }

    public void read() {
        FileInputStream fis = null;
        ObjectInputStream ois = null;
        try {
            fis = new FileInputStream("student.dat");
            ois = new ObjectInputStream(fis);
            studentList = (List<Student>) ois.readObject();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                fis.close();
                ois.close();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        showAll();
    }
}

