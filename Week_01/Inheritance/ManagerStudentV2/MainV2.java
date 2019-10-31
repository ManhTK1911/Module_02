package Week_01.Inheritance.ManagerStudentV2;

public class MainV2 {
    public static StudentV2[] studentsList = new StudentV2[1];

    public static void main(String[] args) {
        ManagerV2 kieuAnh = new ManagerV2();
        studentsList[0] = new StudentV2(1, "TKM", "YT", "0349586158", 8);
        kieuAnh.addStudent(new StudentV2(2, "HTT", "QL", "0349586158", 9));
        kieuAnh.addStudent(new StudentV2(3, "THY", "YT", "0349586158", 10));
        kieuAnh.addStudent(new StudentV2(4, "TKH", "YT", "0349586158", 10));
        kieuAnh.addStudent(new StudentV2(5, "DTH", "YT", "0349586158", 10));

        System.out.println("Number of Student: " + studentsList.length);
        System.out.println("Average Score: " + kieuAnh.getAvgMark());
        kieuAnh.deleteStudent(3);
        System.out.println("Number of Student after Delete: " + studentsList.length);
        System.out.println("Average Score: " + kieuAnh.getAvgMark());

    }
}
