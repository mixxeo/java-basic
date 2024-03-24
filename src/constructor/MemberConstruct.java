package constructor;

public class MemberConstruct {
    String name;
    int age;
    int grade;

    MemberConstruct(String name, int age, int grade) {
        System.out.println("생성자 호출 name, age, grade");
        this.name = name;
        this.age = age;
        this.grade = grade;
    }

    // overloading
    MemberConstruct(String name, int age) {
        // this()를 통한 생성자 호출은, 생성자 안에서만 가능하고 생성자 코드의 첫줄에만 사용할 수 있다.
        this(name, age, 50);
        System.out.println("생성자 호출: name, age");
//        this.name = name;
//        this.age = age;
//        this.grade = 50;
    }
}
