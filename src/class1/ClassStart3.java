package class1;

public class ClassStart3 {
    public static void main(String[] args) {
        Student student1;
        student1 = new Student();
        student1.name = "학생1";
        student1.age = 19;
        student1.grade = 96;

        Student student2 = new Student();
        student2.name = "학생2";
        student2.age = 18;
        student2.grade = 88;

        System.out.println("이름: " + student1.name + " 나이: " + student1.age + " 성적: " + student1.grade);
        System.out.println("이름: " + student2.name + " 나이: " + student2.age + " 성적: " + student2.grade);

        // class는 사용자 정의 타입이고, 이 설계도가 바로 클래스 정의이다.
        // 클래스를 가지고 실제 메모리에 만들어진 실체를 객체(인스턴스)라고 한다.
    }
}
