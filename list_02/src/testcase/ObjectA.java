package testcase;

public class ObjectA {

    private String id;
    private ObjectB objectB;
    private String name;

    public String getId() { return id; }
    public void setId(String id) { this.id = id; }

    public ObjectB getObjectB(){ return objectB; }
    public void setObjectB(ObjectB objectB) { this.objectB = objectB; }

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public ObjectA() { }
    public ObjectA(String idA, String nameA, String idB, String nameB, int age) {
        this.id = idA;
        this.name = nameA;
        this.objectB = new ObjectB(idB, nameB, age);
    }
}
