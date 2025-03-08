public class RedheadDuck extends Duck
{
    public RedheadDuck()
    {
        qb = new Quack();
        sb = new SwimWithLegs();
        fb = new Fly();
    }

    @Override
    public void display()
    {
        System.out.println("I am a Red head Duck !!");
    }
}