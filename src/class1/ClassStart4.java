package class1;

public class ClassStart4 {
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

        // 자바에서 대입은 항상 변수에 들어 있는 값을 복사한다.
        // 변수에는 인스턴스 자체가 들어있는게 아니라, 인스턴스의 참조값이 들어있다. 따라서 인스턴스가 아니라 참조값이 대입되는 것.
        Student[] students = new Student[2]; // 배열 생성 x005
        students[0] = student1; // x001
        students[1] = student2; // x002

        System.out.println("이름: " + students[0].name + " 나이: " + students[0].age + " 성적: " + students[0].grade);
        System.out.println("이름: " + students[1].name + " 나이: " + students[1].age + " 성적: " + students[1].grade);

    }
}
