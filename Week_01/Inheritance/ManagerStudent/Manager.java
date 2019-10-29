package ManagerStudent;

public class Manager {
    int id;
    String name;

    public Manager() {
    }

    public Manager(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setMark(Student student, double newMark) {
        student.setMark(newMark);
    }

    public double caculateAvgMark(Student[] students) {
        double sumMark = 0;
        for (int i = 0; i < students.length; i++) {
            sumMark += students[i].getMark();
        }
        return sumMark / students.length;
    }
}
