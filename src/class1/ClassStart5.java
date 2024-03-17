package class1;

public class ClassStart5 {
    public static void main(String[] args) {
        Student student1;
        student1 = new Student(); // x001
        student1.name = "학생1";
        student1.age = 19;
        student1.grade = 96;

        Student student2 = new Student(); // x002
        student2.name = "학생2";
        student2.age = 18;
        student2.grade = 88;

        Student[] students = new Student[]{ student1, student2 };
        for (int i = 0; i < students.length ; i++) {
            Student student = students[i];
            System.out.println("이름: " + student.name + " 나이: " + student.age + " 성적: " + student.grade);
        }
        // 동일한 코드 - forEach
        for (Student s: students) {
            System.out.println("이름: " + s.name + " 나이: " + s.age + " 성적: " + s.grade);
        }
    }
}
