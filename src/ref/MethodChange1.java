package ref;

public class MethodChange1 {
    public static void main(String[] args) {
        // 자바는 항상(기본형, 참조형 모두) 변수의 값을 <복사>해서 대입한다.
        int a = 10;
        System.out.println("메서드 호출 전: a = " + a); // 10

        changePrimitive(a); // int x = a(10);
        System.out.println("메서드 호출 후: a = " + a); // 10
    }

    public static void changePrimitive(int x) {
        x = 20;
    }
}
