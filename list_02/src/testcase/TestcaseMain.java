package testcase;

public class TestcaseMain {
    public static void main(String[] args) {
        ObjectA a = new ObjectA();

        System.out.println(a.getObjectB().getName());
        System.out.println(a.getObjectB().getAge());
    }
}
