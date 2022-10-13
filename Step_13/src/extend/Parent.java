package extend;

public class Parent {

    String name ;



    Parent()
    {
        System.out.println("Parent 생성");
    }

    String getName(){
        return name;
    }

    void render()
    {
        System.out.println(name);
    }

    void render(String str)
    {

        System.out.println("입력한 값은 " + str + "이고, 기본 값은 " + name + "입니다.");
    }

}
