package ie.tudublin;

public class Cat extends Animal
{
    private int numLives = 9;

    public void setNumLives(int lives)
    {
        this.numLives = lives;
    }
    public int getNumLives() //this returns value to Main()
    {
        return numLives;
    }

    public void speak()
    {
        System.out.println("Meow!");
    }

    public void kill()
    {
        if (numLives > 0)
        {
            numLives = numLives - 1;
            System.out.println("Ouch!");
        }

        if (numLives == 0)
        {
            System.out.println("Dead");
        }
    }
}