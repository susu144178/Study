package InterfaceEx;

import Example.Student;
import Example.Teacher;

public class ExampleMain {
    public static void main(String[] args) {
        Interface.inter = new Object();
        inter.render();

        System.out.println("a > ParntA : " + (inter instanceof Interface));
    }
}
