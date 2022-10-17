package Example;

public class ExtendMain {

    public static void main(String[] args) {

        // ** abstract 를 사용한 클래스는 스스로를 생성하는것이 불가능.
        // Object o = new Object();

        // ** 상속관계에 있는 클래스를 할당하여 사용한다.
        /*
        Object[] objects = new Object[2];

        objects[0] = new Student("홍길동");
        objects[1] = new Teacher("임꺽정");

        objects[0].render();
        objects[1].render();
        */




        //========================================
        /*
        Object[] objects = new Object[5];

        int index = 0;

        objects[index] = new Teacher();
        objects[index].index = index;
        objects[index].name = "고길동";
        objects[index].age = 26;
        objects[index]._class = "K_강의실";
        ++index;

        objects[index] = new Student();
        objects[index].index = index;
        objects[index].name = "홍길동";
        objects[index].age = 26;
        objects[index]._class = "K_강의실";
        ++index;

        objects[index] = new Student();
        objects[index].index = index;
        objects[index].name = "임꺽정";
        objects[index].age = 26;
        objects[index]._class = "K_강의실";
        ++index;

        objects[index] = new Student();
        objects[index].index = index;
        objects[index].name = "이몽룡";
        objects[index].age = 26;
        objects[index]._class = "K_강의실";
        ++index;

        objects[index] = new Student();
        objects[index].index = index;
        objects[index].name = "김선우";
        objects[index].age = 26;
        objects[index]._class = "K_강의실";
        ++index;

        for(int i = 0; i < objects.length; ++i)
            objects[i].render();

        Teacher tch = new Teacher();
        Student[] stds = new Student[4];
        */




        /*
        Object std1 = new Student();

        std1.index = 1;
        std1.name = "홍길동";
        std1.age = 26;
        std1._class = "K_강의실";

        Object tch = new Teacher();

        tch.index = 0;
        tch.name = "고길동";
        tch.age = 26;
        tch._class = "K_강의실";

        tch.render();
        std1.render();
        */
    }
}
