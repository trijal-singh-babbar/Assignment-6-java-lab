public class MallardDuck extends Duck
{
    public MallardDuck()
    {
        qb = new Quack();
        sb = new SwimWithLegs();
        fb = new Fly();
    }
    @Override
    public void display()
    {
        System.out.println("I am Mallard Duck...");
    }
}