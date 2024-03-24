package constructor;

public class MemberThis {
    String nameField;

    void InitMember(String nameParameter) {
        // this 생략가능
        this.nameField = nameParameter;
    }
}
