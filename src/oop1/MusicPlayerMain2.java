package oop1;

public class MusicPlayerMain2 {
    public static void main(String[] args) {
        // 데이터와 기능이 분리되어있음. but 데이터와 데이터를 사용하는 기능이 매우 밀접하게 연관되어 있음
        MusicPlayerData data = new MusicPlayerData();

        // 메서드 이름을 통해 코드를 더 쉽게 이해할 수 있다
        on(data);
        volumeUp(data);
        volumeUp(data);
        volumeDown(data);
        showStatus(data);
        off(data);
    }

    static void on(MusicPlayerData data) {
        data.isOn = true;
        System.out.println("음악 플레이어를 시작합니다.");
    }

    static void off(MusicPlayerData data) {
        data.isOn = false;
        System.out.println("음악 플레이어를 종료합니다");
    }

    static void volumeUp(MusicPlayerData data) {
        data.volume++;
        System.out.println("음악 플레이어 볼륨: " + data.volume);
    }
    static void volumeDown(MusicPlayerData data) {
        data.volume--;
        System.out.println("음악 플레이어 볼륨: " + data.volume);
    }

    static void showStatus(MusicPlayerData data) {
        System.out.println("음악 플레이어 상태 확인");
        if (data.isOn) {
            System.out.println("음악 플레이어 ON, 볼륨; " + data.volume);
        } else {
            System.out.println("음악 플레이어 OFF");
        }
    }
}
