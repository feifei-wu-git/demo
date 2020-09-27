package extendfield;

public class Child extends Parent{
    int numC = 15;
    int num = 150;
    public void methodC(){
        //因为子类中有num ,所以这里用的就是本类的num
        System.out.println(num);
    }
}
