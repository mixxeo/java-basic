package ref;

public class MethodChange2 {
    public static void main(String[] args) {
        Data dataA = new Data();
        dataA.value = 10;
        System.out.println("메서드 호출 전: dataA.value = " + dataA.value); // 10
        System.out.println(dataA);
        System.out.println();

        changeReference(dataA); //Data dataX = dataA;(참조값)
        System.out.println("메서드 호출 후: dataA.value = " + dataA.value); // 20
    }

    static void changeReference(Data dataX) {
        System.out.println(dataX);
        dataX.value = 20; // main의 dataA와 동일한 객체를 잠조하고있음
    }
}
