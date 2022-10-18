package Calculater;

import java.util.Scanner;

public class Calculator extends Calc {

    private int num;

    public void input(){
        Scanner in = new Scanner(System.in);
        System.out.println("(1) +, (2) -, (3) *, (4) / (번호를 선택하세요)");
        num = in.nextInt();
        System.out.println("첫번째 입력");
        f = in.nextInt();
        System.out.println("두번째 입력");
        s = in.nextInt();
    }

    public void output(){
        switch(num){
            case 1:
                System.out.println("두 수의 합은 " + add(f, s));
                break;
            case 2:
                System.out.println("두 수의 차는 " + sub(f, s));
                break;
            case 3:
                System.out.println("두 수의 곱은 " + mul(f, s));
                break;
            case 4:
                System.out.println("두 수의 나눗셈은 " + div(f, s));
                break;
            default:
                System.out.println("연산자를 잘못 선택");
        }

    }
}
