import java.util.Scanner;

public class Main
{

    public static void main(String[] args)
    {

        Scanner keyboard = new Scanner(System.in);
        System.out.println("please enter 3 non-negative numbers");
        int x,y,z;
        x= keyboard.nextInt();
        y= keyboard.nextInt();
        z=keyboard.nextInt();
        if((x < y)&&(x < z)&&(y < z))
        {
            System.out.println("x is: " + x +"y is: " + y + "z is: " +z);
        }
        else if((y < x)&&(y < z)&&(x<z))
        {
            System.out.println("y is: " + y+"x is: " + x+"z is: " +z);
        }
        else if((z<x)&&(z<y)&&(x>y))
        {
            System.out.println("z:" +z +" y: " +y +" x: "+x);
        }
        else
        {
            System.out.println("z: "+ z +"x: " +x +"y: " + y);
        }

    }
}
