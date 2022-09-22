public class Main
{
    public static void main(String[] args)
    {
        int price = 180;
        double total = price + (price * 0.02);


        if (price >= 100){
            System.out.println("Your price is " + price);
        }
        else {
            System.out.println("Your price is " + total);
        }
    }
}