package constructor;

public class MemberInit {
    String name;
    int age;
    int grade;

    void initMember(String name, int age, int grade) {
        // 매개변수의 이름과 인스턴스의 멤버변수의 이름이 같다.
        // 코드블럭 내에서 매개변수가 우선순위를 가진다.
        // name = name; => 둘 다 매개변수를 의미함.

        // this: 인스턴스 자신의 참조값(생략 가능)
        this.name = name;
        this.age = age;
        this.grade = grade;
    }
}
