//  1. Modify the class to add a isTails method that returns true when the value is not heads.

public class Coin
{

    // constant to represent heads
    private int HEADS = 1;

    // current value of the coin
    private int value = 0;

    // method to randomly set the value of the coin to heads or tails
    public void flip()
    {
        if (Math.random() < 0.5)
        {
            value = 0;
        }
        else
        {
            value = 1;
        }
    }

    // return true if the value is heads or false otherwise
    public boolean isHeads()
    {
        return value == HEADS;
    }
    private int TAILS = 1;

    // current value of the coin
    private int value1 = 0;

    // method to randomly set the value of the coin to heads or tails
    public void flip1()
    {
        if (Math.random() < 0.5)
        {
            value = 0;
        }
        else
        {
            value = 1;
        }
    }

    public boolean isTails()
    {
        return true;
    }

    // convert the value to a string
    public String toString()
    {
        if (value == HEADS) return "Heads";
        else return "Tails";
    }

    public static class AsQ_4 {


            // test the class
            public void main(String[] args)
            {

                Coin myCoin = new Coin();
                for (int i = 0; i < 10; i++)
                {
                    myCoin.flip();
                    System.out.println(myCoin);
                    System.out.println(myCoin.isHeads());
                }
            }
        }




}
