package Example;

public class Student extends Object {

    Student(String name){
        super(name);
    }

    public void render()
    {
        System.out.println(super.index + ". [" + super.name + "] " + super.age + " " + super._class );
        System.out.println(super.name);
    }

}
