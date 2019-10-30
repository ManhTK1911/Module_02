package ManagerStudent;

public class Main {
    public static void main(String[] args) {
        Manager kieuAnh = new Manager();
        Student student1 = new Student(1, "TKM", 5);
        Student student2 = new Student(2, "HTT", 8);
        Student student3 = new Student(3, "THY", 9);
        Student student4 = new Student(4, "TKH", 6);
        Student student5 = new Student(5, "DTH", 8);
        Student[] students = {student1, student2, student3, student4, student5};

        System.out.println(student1.getMark());
        kieuAnh.setMark(student1, 9);
        double avg = kieuAnh.caculateAvgMark(students);
        System.out.println(student1.getMark());
        System.out.println(avg);
    }
}
