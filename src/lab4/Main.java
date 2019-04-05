package lab4;

import lab5.Punctuation;

import java.util.Arrays;
import java.util.Comparator;

public class Main {
    public static void main(String[] args) {
        Student[] students = new Student[3];
        students[0] = new Student("Тетяна", "Дьяченко",
                "IV", 81, 100);
        students[1] = new Student("Олексій", "Самутін",
                "IO", 82, 100);
        students[2] = new Student("Тетяна", "Самутіна",
                "IV", 81, 100);
//        System.out.println(students[0].compareTo(students[1]));
//        Arrays.sort(students);
//        Arrays.sort(students, new ComparatorByName());
        /*Arrays.sort(students, new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                return o1.getName().compareTo(o2.getName());
            }
        });*/
        /*Arrays.sort(students, (o1, o2) ->
                o1.getName().compareTo(o2.getName()));*/
        Arrays.sort(students, Comparator.comparing(Student::getName));

        for (Student student : students) {
            System.out.println(student/*.toString()*/);
        }
        System.out.println("+++++++++++++");
        Arrays.sort(students, new ComparatorBySurname().reversed());
        /*Arrays.sort(students, Comparator.comparing(Student::getName)
                .thenComparing(Student::getSurname, Comparator.reverseOrder()));*/
        /*Arrays.sort(students, Comparator.comparing(Student::getName)
                .thenComparing(Student::getSurname).reversed());*/
//        System.out.println(Arrays.toString(students));
        for (Student student : students) {
            System.out.println(student/*.toString()*/);
        }
        /*students[0].setName();
        students[0].setGroupNumber();
        students[0].setGroupSpecialization("IO");
        students[0].setAverageMark(100);
        students[0].setSurname();*/
//        System.out.println(students[0].getName());
        System.out.println("Done!");
    }
}
