package extend;

public class Child extends Parent {

    int age;

    Child()
    {
        System.out.println("Child 생성");
    }

    int getAge(){
        return age;
    }



    void render()
    {
        // ** 멤버 변수와 똑같은 이름의 지역변수를 선언.
        int age = 100;

        // ** super 키워드를 사용하여 부모클래스에 있는 변수에 접근 가능.
        // ** age 앞에 this. 를 붙혀주지 않는다면 지역변수를 사용하게 된다.
        System.out.println(super.name + " : " + this.age);
    }

    // ** 오버로딩 : 같은 클래스 안에서 동일한 이름으로 재정의. (파라미터의 갯수, 형태)
    // ** 오버라이딩 : 상속 관계에서의 재정의.

    void render(int num)
    {

        System.out.println("입력한 값은 " + num + "이고 정수 입니다.");
    }

    void render(String str)
    {

        System.out.println("입력한 값은 " + str + "이고 문자열 입니다.");
    }
}
