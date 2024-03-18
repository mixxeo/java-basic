package ref;

public class VarChange1 {
    public static void main(String[] args) {
        // 대원칙: 자바는 대입을 할 때, 항상 소스의 값을 읽고 복사한 값을 저장한다.

        int a = 10;
        int b = a;
        System.out.println("a = " + a); // 10
        System.out.println("b = " + b); // 10

        a = 20; // a변경
        System.out.println("a = " + a); // 20
        System.out.println("b = " + b); // 10

        b = 30; // b변경
        System.out.println("a = " + a); // 20
        System.out.println("b = " + b); // 30
    }
}
