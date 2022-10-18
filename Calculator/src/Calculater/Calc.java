package Calculater;

public class Calc {
    public int f;
    public int s;

    public int add(int f, int s){
        this.f = f;
        this.s = s;
        return f + s;
    }

    public int sub(int f, int s){
        this.f = f;
        this.s = s;
        return f - s;
    }

    public int mul(int f, int s){
        this.f = f;
        this.s = s;
        return f * s;
    }

    public double div(int f, int s){
        this.f = f;
        this.s = s;
        return (double)f / s;
    }




}
