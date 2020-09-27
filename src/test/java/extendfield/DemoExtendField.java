package extendfield;

/**
 * 在父子类的继承关系中，如果成员变量重名，则创建子类对象时，有两种方式：
 * 直接通过子类对象访问成员变量：
 * 等号左边是谁，就用谁，没有就向上（父类）找
 *
 * 间接通过成员方法访问成员变量:
 * 该方法属于谁，就优先用谁
 *
 * 父类只能用父类的成员变量，子类如果有成员变量就用自己的，如果没有就向上找，用父类的成员变量。
 */

public class DemoExtendField {
    public static void main(String args[]){
        Parent parent = new Parent();//创建父类对象
        System.out.println(parent.numP);//只能使用父类的东西，
        System.out.println("=================");
        System.out.println(parent.num);

        Child child = new Child();
        System.out.println(child.numP);
        System.out.println(child.numC);
        System.out.println("=================");
        //等号左边是谁，就用谁
        System.out.println(child.num);//优先用子类的成员变量

        parent.methodP();

        child.methodC();
        child.methodP();


    }
}
