public class DecoyDuck extends Duck
{
    public DecoyDuck()
    {
        qb = new Silent();
        sb = new Sink();
        fb = new NotFly();
    }
    @Override
    public void display()
    {
        System.out.println("I am a Decoy Duck...");
    }
}