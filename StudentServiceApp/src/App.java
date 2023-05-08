import java.net.NoRouteToHostException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

import StudentDomen.Student;
import StudentDomen.StudentGroup;
import StudentDomen.StudentStream;
import StudentDomen.User;

public class App {
    public static void main(String[] args) throws Exception {
        User u1 = new User("Сергей","Иванов",25);
        Student s1 = new Student("Сергей", "Иванов", 22, (long)101);
        Student s2 = new Student("Андрей", "Сидоров", 22, (long)111);
        Student s3 = new Student("Иван", "Петров", 22, (long)121);
        Student s4 = new Student("Игорь", "Иванов", 23, (long)301);
        Student s5 = new Student("Даша", "Цветкова", 23, (long)171);
        Student s6 = new Student("Лена", "Незабудкина", 23, (long)104);
        Student s7 = new Student("Александр", "Иванов", 22, (long)201);
        Student s8 = new Student("Михаил", "Сидоров", 22, (long)211);
        Student s9 = new Student("Петр", "Петров", 22, (long)221);
        Student s10 = new Student("Андрей", "Беляков", 23, (long)401);
        Student s11 = new Student("Ольга", "Королева", 23, (long)271);
        Student s12 = new Student("Светлана", "Царева", 23, (long)204);
        Student s13 = new Student("Оксана", "Прутова", 23, (long)504);

        /**
         * Создаем списки групп студентов
         */
        List<Student> listStud1 = new ArrayList<Student>();
        listStud1.add(s1);
        listStud1.add(s2);
        listStud1.add(s3);
        listStud1.add(s13);
        List<Student> listStud2 = new ArrayList<Student>();
        listStud2.add(s4);
        listStud2.add(s5);
        listStud2.add(s6);
        List<Student> listStud3 = new ArrayList<Student>();
        listStud3.add(s7);
        listStud3.add(s8);
        listStud3.add(s9);
        List<Student> listStud4 = new ArrayList<Student>();
        listStud4.add(s10);
        listStud4.add(s11);
        listStud4.add(s12);

        List<StudentGroup> listGroup = new ArrayList<StudentGroup>();
        listGroup.add(new StudentGroup(listStud1, 1));
        listGroup.add(new StudentGroup(listStud2, 4));
        listGroup.add(new StudentGroup(listStud3, 3));
        listGroup.add(new StudentGroup(listStud4, 2));
        /**
        * Выыод студентов на потоках
        */
        StudentStream stream = new StudentStream(listGroup);
        Collections.sort(stream.getStreams());                  // сортировка курсов по номеру
        for (StudentGroup group :stream.getStreams()) {         // проходимся по каждой группе в каждом курсе
            System.out.println("Stream:" + group.getStream() ); // выводим номер курса
           
            for (Student student : group.getStudents()) {       // проходимся по каждому студенту в группе
                System.out.println(student);                    // выводим группу и студента в ней
            }
        }
    }
}