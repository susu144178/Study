package Extend;

public class ExtendMain {

    public static void main(String[] args) {

        // ** 상속 관계에서만 사용이 가능하다.
        Parent p = new Child();

        // ** 부모 클래스에서 호출 가능한 함수가 없을 경우에
        //    자식 클래스에 재정의 된 함수가 있다고 하더라도 호출 되지 않는다.
        p.walk();

        Child c = (Child) p;
        c.eat();


        // ** 에러 코드
        Parent p1 = new Parent();

        Child c1 = (Child) p1;
        c1.run();


    }
}
