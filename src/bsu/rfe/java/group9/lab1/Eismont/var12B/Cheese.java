package bsu.rfe.java.group9.lab1.Eismont.var12B;

public class Cheese extends Food
{
    private Double calories = null;
    public Cheese()
    {
        super("Сыр");
    }
    public void consume()
    {
        System.out.println(this + " съеден");
    }
    public Double calculateCalories()
    {
        if(this.name == "Сыр")
        {
            calories = 400.0;
            return calories;
        }
        else
            return 0.0;
    }
}
