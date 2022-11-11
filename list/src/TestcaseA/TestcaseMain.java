package TestcaseA;

public class TestcaseMain {

    public static void main(String[] args) {

        ObjectA objA = new ObjectA();
        ObjectB objB = new ObjectB();

        System.out.println(objA.getName());
        System.out.println(objA.getNode().getName());

        System.out.println(objB.getName());
        System.out.println(objB.getNode().getName());
    }
}
