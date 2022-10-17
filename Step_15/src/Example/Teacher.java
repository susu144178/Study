package Example;

public class Teacher extends Object {

    Teacher(String name){
        super(name);
    }

    public void render()
    {
        System.out.println(super.index + ". [" + super.name + "] " + super.age + " " + super._class );
        System.out.println(super.name);
    }
}
