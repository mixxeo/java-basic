package oop1;

public class MusicPlayer {
    // 음악 플레이어라는 개념을 객체로 온전히 만드는 것.
    // 이것을 어떻게 사용할지는 분리해서 생각한다. => 객체 지향

    // 캡슐화
    // 속성과 기능을 하나로 묶어서 필요한 기능을 메서드를 통해 외부에 제공하는 것.
    // 변경 사항이 있을 때는, 캡슐 내부만 수정하면 되는 구조.

    int volume;
    boolean isOn;

    void on() {
        isOn = true;
        System.out.println("음악 플레이어를 시작합니다.");
    }

    void volumeUp() {
        volume++;
        System.out.println("음악 플레이어 볼륨: " + volume);
    }

    void off() {
        isOn = false;
        System.out.println("음악 플레이어를 종료합니다");
    }

    void volumeDown() {
        volume--;
        System.out.println("음악 플레이어 볼륨: " + volume);
    }

    void showStatus() {
        System.out.println("음악 플레이어 상태 확인");
        if (isOn) {
            System.out.println("음악 플레이어 ON, 볼륨; " + volume);
        } else {
            System.out.println("음악 플레이어 OFF");
        }
    }
}
