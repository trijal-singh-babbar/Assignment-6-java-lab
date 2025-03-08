public class RubberDuck extends Duck
{
    public RubberDuck()
    {
        qb = new Squeak();
        sb = new Floating();
        fb = new NotFly();
    }
    @Override
    public void display()
    {
        System.out.println("I am Rubber Duck !!");
    }
}
