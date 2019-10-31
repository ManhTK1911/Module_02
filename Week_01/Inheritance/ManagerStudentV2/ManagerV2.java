package Week_01.Inheritance.ManagerStudentV2;

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


    public double getAvgMark() {
        double avg = 0;
        for (StudentV2 s : MainV2.studentsList) {
            avg += s.getMark();
        }
        return avg /= MainV2.studentsList.length;
    }


    public void deleteStudent(int id) {
        int index = 0;
        for (int i = 0; i < MainV2.studentsList.length; i++) {
            if (MainV2.studentsList[i].getId() == id) {
                index = i;
                break;
            }
        }
        StudentV2[] newList = new StudentV2[MainV2.studentsList.length - 1];
        for (int i = 0; i < index; i++) {
            newList[i] = MainV2.studentsList[i];
        }
        for (int i = index; i < MainV2.studentsList.length - 1; i++) {
            newList[i] = MainV2.studentsList[i + 1];
        }
        MainV2.studentsList = newList;
    }

    public void addStudent(StudentV2 std) {
        StudentV2[] newList = new StudentV2[MainV2.studentsList.length + 1];
        for (int i = 0; i < MainV2.studentsList.length; i++) {
            newList[i] = MainV2.studentsList[i];
        }
        newList[newList.length - 1] = std;
        MainV2.studentsList = newList;
    }
}
