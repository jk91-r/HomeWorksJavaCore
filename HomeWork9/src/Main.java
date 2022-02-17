import java.util.*;
import java.util.stream.Collectors;
import static java.util.Arrays.asList;

public class Main {

    public static void main(String[] args) {
        Course course = new Course("Python");
        Course course1 = new Course("Java");
        Course course2 = new Course("Git");
        Course course3 = new Course("SQL");
        Course course4 = new Course("DataScience");
        Course course5 = new Course("Agile");

	    Student student = new Student("Vadim", asList(course,course1));
        Student student1 = new Student("Vasiliy", asList(course1,course2,course4));
        Student student2 = new Student("Petr", asList(course,course3,course4));
        Student student3 = new Student("Oleg", asList(course,course3,course4));
        Student student4 = new Student("Irina", asList(course5,course3));
        Student student5 = new Student("Valentina", asList(course,course1));
        Student student6 = new Student("Olga", asList(course5,course1,course3,course4));

        List<Student> arrayStudents = asList(student,student1, student2, student3, student4, student5, student6);
            System.out.println(arrayStudents);

        List<List<Course>> uniqueCourse =
                arrayStudents.stream()
                             .map(s -> s.getAllCourses())
                             .distinct()
                             .collect(Collectors.toList());
            System.out.println(uniqueCourse);


        List<String> curiousStudents =
                 arrayStudents.stream()
                              .sorted((o1,o2) -> o2.getAllCourses().size() - o1.getAllCourses().size())
                              .map(s -> s.getName())
                              .limit(3)
                              .collect(Collectors.toList());
            System.out.println(curiousStudents);


        List<String> visitCourse =
                arrayStudents.stream()
                             .filter(s -> s.toString().contains("Java"))
                             .map(s -> s.getName())
                             .collect(Collectors.toList());
            System.out.println(visitCourse);

    }
}
