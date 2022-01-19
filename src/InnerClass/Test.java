package InnerClass;

class Outer{
    int x = 10;
    class Inner{
        int y= 20;
        void innerDisplay(){
            System.out.println("Value of X "+x);
            System.out.println("Value of Y "+y);
        }
    }
    void outerDisplay(){
        Inner i = new Inner();
        i.innerDisplay();
        System.out.println("inner y value "+i.y);
    }
}

public class Test {
    public static void main(String[] args) {
        Outer o = new Outer() ;
        o.outerDisplay();
        Outer.Inner i = new Outer().new Inner();
        i.innerDisplay();

    }
}
