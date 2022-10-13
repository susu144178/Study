package extend;

public class ExtendMain {
    public static void main(String[] args) {

        /*
        Parent p = new Parent();
        p.str1 = "홍길동";
        p.str2 = "임꺽정";
        p.str3 = "이몽룡";

        //p.renderHong();
        //p.renderLee();
        //p.renderLim();
        */

        Child c = new Child();

        c.name = "홍길동";
        c.age = 26;

        c.render(10);
        c.render("임꺽정");
        //System.out.println(c.name + " : " + c.age);
    }
}
