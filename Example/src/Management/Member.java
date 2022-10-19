package Management;

public class Member extends Parent{

    int age;
    String userName;
    Group group; // has - a 관계


    public Group getGroup() { return group; }
    public void setGroup(Group group) { this.group = group; }

    public int getAge(){ return this.age; }
    public void setAge(int age){ this.age = age; }

    public String getUserName(){ return userName; }
    public void setUserName(String userName){ this.userName = userName; }
}
