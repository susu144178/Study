package mega;

public class Member
{
    private String id;
    private String userName;
    private Integer age;

    //public void initialize();
    //public void progress();
    //public void render();
    //public void release();

    public String getId() { return  id; }
    public void setId(String id) { this.id = id; }

    public String getUserName() { return  userName; }
    public void setUserName(String userName) { this.userName = userName; }

    public Integer getAge(/*매개변수*/) { return age; }
    public void setAge(Integer age) { this.age = age; }
}

package mega;

public class MemberMain{

    //private Member m;
    //private Member m2;

    public static void main(String[] args)
    {
        //=========================================
        // [메모리구조 확인 !!]
        //=========================================
        Member m = new Member();
        Member m2 = new Member();

        if(m == m2)
            System.out.println("같다");
        else
            System.out.println("다르다");

        //===========================================
        //===========================================

        String str1 = "홍길동";
        String str2 = "홍길동";

        if(str1 == str2)
            System.out.println("같다");
        else
            System.out.println("다르다");

        //============================================
        // [객체를 배열로 사용]
        //============================================
        {
            //Member mArray1;
            //Member mArray2;
            //Member mArray3;
            //Member mArray4;
            //Member mArray5;

            Member[] mArray = new Member[5];

            mArray[0] = new Member();
            mArray[0].setId("Key1");

            mArray[1] = new Member();
            mArray[1].setId("Key2");

            mArray[2] = new Member();
            mArray[2].setId("Key3");

            mArray[3] = new Member();
            mArray[3].setId("Key4");

            mArray[4] = new Member();
            mArray[4].setId("Key5");

            for(Member element : mArray)
            {
                String str = element.getId();
                System.out.println(str);
            }


        }
    }
}











public class Main {
    public static void main(String[] args) {

    }
}