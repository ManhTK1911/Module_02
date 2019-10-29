package ManagerStudentV2;

public class MainV2 {
    public static void main(String[] args) {
        ManagerV2 kieuAnh = new ManagerV2();
        StudentV2 student1 = new StudentV2(1,"TKM", "YT", "0349586158", 8  );
        StudentV2 student2 = new StudentV2(2,"HTT", "QL", "0349586158", 9  );
        StudentV2 student3 = new StudentV2(3,"THY", "YT", "0349586158", 10  );
        StudentV2 student4 = new StudentV2(4,"TKH", "YT", "0349586158", 10  );
        StudentV2 student5 = new StudentV2(5,"DTH", "YT", "0349586158", 10  );
        StudentV2[] studentList = new StudentV2[5];
        kieuAnh.addStudent(student1, studentList);
        kieuAnh.addStudent(student2, studentList);
        kieuAnh.addStudent(student3, studentList);
        kieuAnh.addStudent(student4, studentList);
        kieuAnh.addStudent(student5, studentList);

        System.out.println();

        System.out.println("\n" + kieuAnh.getAvgMark(studentList));




    }
}
