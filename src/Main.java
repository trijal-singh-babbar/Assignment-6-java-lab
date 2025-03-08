public class Main
{
    public static void main(String args[])
    {
        RubberDuck rb = new RubberDuck();
        MallardDuck md = new MallardDuck();
        RedheadDuck rd = new RedheadDuck();
        DecoyDuck dd = new DecoyDuck();
        System.out.println("-----------------");
        md.display();
        md.performQuack();
        md.performSwim();
        md.performFly();
        System.out.println("------------------");
        System.out.println("-----------------");
        rb.display();
        rb.performQuack();
        rb.performSwim();
        rb.performFly();
        System.out.println("------------------");
        System.out.println("-----------------");
        rd.display();
        rd.performQuack();
        rd.performSwim();
        rd.performFly();
        System.out.println("------------------");
        System.out.println("-----------------");
        dd.display();
        dd.performQuack();
        dd.performSwim();
        dd.performFly();
        System.out.println("------------------");
    }
}
