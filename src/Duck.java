abstract public class Duck
{
    QuackBehaviour qb;
    SwimBehaviour sb;
    FlyBehaviour fb;

    public void setQuackBehaviour(QuackBehaviour qb)
    {
        this.qb = qb;
    }

    public void setSwimBehaviour(SwimBehaviour sb)
    {
        this.sb=sb;
    }

    public void setFlyBehaviour(FlyBehaviour fb)
    {
        this.fb = fb;
    }

    abstract public void display();

    public void performQuack()
    {
        qb.quack();
    }

    public void performSwim()
    {
        sb.swim();
    }

    public void performFly()
    {
        fb.flies();
    }
}