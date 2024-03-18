package ref;

public class VarChange2 {
    public static void main(String[] args) {
        Data dataA = new Data();
        dataA.value = 10;
        Data dataB = dataA; // dataA가 참조하는 인스턴스를 복제하는 것이 아니라, dataA에 들어있는 값(참조값)을 복사해서 저장
        // dataA와 dataB는 동일한 인스턴스를 참조하게 된다.

        System.out.println("dataA의 참조값 = " + dataA); //30f39991
        System.out.println("dataB의 참조값 = " + dataB); //30f39991

        System.out.println("dataA.value = " + dataA.value); // 10;
        System.out.println("dataB.value = " + dataB.value); // 10;

        dataA.value = 20; // dataA 변경 -> dataB가 참조하는 값도 변경됨
        System.out.println("변경 dataA.value = 20");
        System.out.println("dataA.value = " + dataA.value); // 20;
        System.out.println("dataB.value = " + dataB.value); // 20;

        dataB.value = 30; // dataB 변경 -> dataA가 참조하는 값도 변경됨
        System.out.println("변경 dataB.value = 30");
        System.out.println("dataA.value = " + dataA.value); // 30;
        System.out.println("dataB.value = " + dataB.value); // 30;

    }
}
