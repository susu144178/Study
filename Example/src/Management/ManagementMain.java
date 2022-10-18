package Management;

public class ManagementMain {

    public static void main(String[] args) {

        Member member = new Member();
        member.setAge(32);
        member.setUserName("홍길동");

        String name = member.getUserName();
        int age = member.getAge();

        Group group = new Group();
        group.set_class("K");
        group.setSubject("KK");
        








        System.out.println(name + " : " + age);
    }
}
