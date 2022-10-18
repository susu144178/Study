package Management;

public class ManagementMain {

    public static void main(String[] args) {

        Member member = new Member();
        member.setAge(32);
        member.setUserName("홍길동");

        String name = member.getUserName();
        int age = member.getAge();

        Group group = new Group();
        group.set_class("정보");
        group.setSubject("주제");

        String _class = group.get_class();
        String subject = group.getSubject();

        System.out.println(subject + " : " + _class);
        System.out.println(name + " : " + age);
    }
}
