package testcase;

public class ObjectA {

    private ObjectB objectB;

    public ObjectB getObjectB(){ return objectB; }

    public ObjectA() { objectB = new ObjectB("홍길동", 34); }
}
