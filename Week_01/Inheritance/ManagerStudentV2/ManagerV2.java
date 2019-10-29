package ManagerStudentV2;

public class ManagerV2 {
    int id;
    int index = 0;
    String fullName;
    String address;
    String phoneNumber;

    public ManagerV2() {
    }

    public ManagerV2(int id, String fullName, String address, String phoneNumber) {
        this.id = id;
        this.fullName = fullName;
        this.address = address;
        this.phoneNumber = phoneNumber;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public void setMarkStudent(StudentV2 student, double newMark) {
        student.setMark(newMark);
    }

    public void addStudent(StudentV2 student, StudentV2[] studentList) {
        studentList[index] = student;
        index++;
    }

    public void deleteStudent(int id, StudentV2[] studentList) {
        for (int i = id; i < studentList.length; i++) {
            studentList[i] = studentList[i + 1];
        }
    }
//    int index = 0;
//        for (int i = 0; i < size; i++) {
//        if (input[i] != dValue) {
//            arr[index] = input[i];
//            index++;
//        }
//    }

    public double getAvgMark(StudentV2[] studentList) {
        double sumMark = 0;
        for (int i = 0; i < studentList.length; i++) {
            sumMark += studentList[i].getMark();
        }
        return sumMark / studentList.length;
    }

}
