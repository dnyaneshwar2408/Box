
public class usebox{
    public static void main(String args[]) {
        box a = new box(10.0, 10.0, 30.0, 30.0 );
        double volume1;

        volume1 = a.height * a.width * a.depth;
        System.out.println("Volume is " + volume1);
    }
}