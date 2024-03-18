package ref;

public class InitMain {
    public static void main(String[] args) {
        InitData data = new InitData();
        System.out.println("data.value1 = " + data.value1); // 멤버변수 int 자동으로 0으로 초기화
        System.out.println("data.value2 = " + data.value2);
    }
}
