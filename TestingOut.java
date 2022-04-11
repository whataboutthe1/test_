//import java.lang.Math.*;

public class TestingOut
{
    public static void main(String args[])
    {
        Bug fly = new Bug(2, "josh");
        System.out.println(fly.getWings());
        System.out.println(fly.getNameBug());
    }
}

class Bug
{
    private int wings;
    private String nameOfBug;

    public Bug(int wing, String name)
    {
        wings = wing;
        nameOfBug = name;
    }

    public int getWings()
    {
        return wings;
    }

    public String getNameBug()
    {
        return nameOfBug;
    }
}