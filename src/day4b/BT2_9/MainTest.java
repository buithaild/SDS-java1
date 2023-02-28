package day4b.BT2_9;

import day4b.BT2_6.MyPoint;

public class MainTest {

    public static void main(String[] args)
    {
        MyTriangle t1 = new MyTriangle(1,1,  3,5,  6,2);
        MyTriangle t2 = new MyTriangle(new MyPoint(2,1), new MyPoint(3,5), new MyPoint(6,2));

        System.out.println("Triangle "+ t1 +" is "+ t1.printType() +" va co chu vi =  "+t1.getPerimeter());
        System.out.println("Triangle "+ t2 +" is "+ t2.printType() +" va co chu vi =  "+t2.getPerimeter());
    }
}
