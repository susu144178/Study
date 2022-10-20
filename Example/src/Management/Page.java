package Management;

public class Page {

    public void setData()
    {
        // ** 멤버 객체를 생성한다.
        Member member = new Member();

        // ** 생성한 멤버 객체에 필드값을 셋팅한다.
        member.setAge(32);
        member.setUserName("홍길동");

        {
            // ** 멤버 객체와 has-a 관계인 Group class 를 생성한다.
            Group group = new Group();

            // ** 생성된 클래스의 필드값을 셋팅한다.
            group.set_class("K");
            group.setSubject("Java");

            // ** 값이 셋팅된 클래스를 멤버 클래스에 맵핑한다.
            member.setGroup(group);
        }

        Singleton.getInstance().setMember(member);
    }


}
