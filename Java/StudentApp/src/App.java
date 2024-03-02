import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import Domain.Student;
import Domain.StudentGroup;

public class App {
    public static void main(String[] args) throws Exception {

        // Создаем студентов
        Student s1 = new Student("Иван", 25);
        Student s2 = new Student("Игорь", 23);
        Student s3 = new Student("Иван", 22);
        Student s4 = new Student("Игорь",  23);
        Student s5 = new Student("Даша",  23);
        Student s6 = new Student("Лена",  23);
        Student s7 = new Student("Маша",  21);
        Student s8 = new Student("Юрий",  22);
        Student s9 = new Student("Саша",  23);


        // Создаем списки студентов
        List<Student> listStud1 = new ArrayList<Student>();
        listStud1.add(s1);
        listStud1.add(s2);
        listStud1.add(s8);

        List<Student> listStud2 = new ArrayList<Student>();
        listStud2.add(s3);
        listStud2.add(s4);
        listStud2.add(s7);
        listStud2.add(s9);

        List<Student> listStud3 = new ArrayList<Student>();
        listStud3.add(s5);
        listStud3.add(s6);

        // Создаем группы студентов
        StudentGroup group4580 = new StudentGroup(listStud1, 4580);
        StudentGroup group4590 = new StudentGroup(listStud2, 4590);
        StudentGroup group4600 = new StudentGroup(listStud3, 4600);

        // Создаем поток студентов
        List<StudentGroup> studentGroups = new ArrayList<>();
        studentGroups.add(group4590);
        studentGroups.add(group4580);
        studentGroups.add(group4600);

        // Сортируем группы студентов по количеству студентов в группе
        Collections.sort(studentGroups);

        // Выводим отсортированные группы студентов в консоль

        for (StudentGroup group : studentGroups) {
                System.out.println("Группа №" + group.getIdGroup());
            for (Student std : group.getGroup()) {
                System.out.println(std);
            }
            System.out.println("=========================================================");
        }

    }
}
