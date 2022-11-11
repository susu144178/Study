package TestcaseA;

public class ObjectB {

    private ObjectA nodeA = null;
    private String name;

    String getName()
    {
        return this.name = name;
    }

    void setName(String name)
    {
        this.name = name;
    }

    public ObjectA getNode()
    {
        if(nodeA == null)
            nodeA = new ObjectA("A");
        return nodeA;
    }

    public ObjectB() {}

    public ObjectB(String name)
    {
        this.name = name;
    }
}
