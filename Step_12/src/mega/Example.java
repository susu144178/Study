package mega;

import mega.example.test.MegaExampleTest;

public class Example {

    MegaExampleTest test;

    String name;
    int age;


    Example()
    {
        name = "";
        age = 0;
        // ** 생성자.
        // ** 클래스가 생성됨과 동시에 (생성직후)호출된다.
    }


    Example(String name, int age)
    {
        // ** 복사 생성자.
        this.age = age;
        this.name = name;

        // ** 사용자가 호출한 시점에 호출된다.

    }

    void output()
    {
        System.out.println(name + ": " + age);
    }
}
