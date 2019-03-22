package lab4;

/**
 * Class that represents Student
 */
public class Student implements Comparable<Student>{
    private String name;
    private String surname;
    private String groupSpecialization; //IO, IV
    private int groupNumber; //81-83
    private double averageMark;

    /**
     * Constructor of the class Student
     * @param name name of the student
     * @param surname
     * @param groupSpecialization
     * @param groupNumber
     * @param averageMark
     */
    public Student(String name, String surname,
                   String groupSpecialization,
                   int groupNumber, double averageMark) {
        this.name = name;
        this.surname = surname;
        this.groupSpecialization = groupSpecialization;
        this.groupNumber = groupNumber;
        this.averageMark = averageMark;
    }


    /**
     *
     * @return name of the student
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getGroupSpecialization() {
        return groupSpecialization;
    }

    public void setGroupSpecialization(String groupSpecialization) {
        this.groupSpecialization = groupSpecialization;
    }

    public int getGroupNumber() {
        return groupNumber;
    }

    public void setGroupNumber(int groupNumber) {
        this.groupNumber = groupNumber;
    }

    public double getAverageMark() {
        return averageMark;
    }

    public void setAverageMark(double averageMark) {
        this.averageMark = averageMark;
    }

    @Override
    public int compareTo(Student o) {
        int nameComparingResult = name.compareTo(o.name);

        // boolean ? if true : if false
        return nameComparingResult != 0
                ? nameComparingResult
                : o.surname.compareTo(surname);
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", groupSpecialization='" + groupSpecialization + '\'' +
                ", groupNumber=" + groupNumber +
                ", averageMark=" + averageMark +
                '}';
    }
}
