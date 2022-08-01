import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        System.out.println("hello world!");
        Point2D point2D = new Point2D(2,3);
        System.out.println(point2D);
        Point3D point3D = new Point3D(point2D.getX(),point2D.getY(),4);
        System.out.println(point3D);
        System.out.println(Arrays.toString(point3D.getXYZ()));
        point3D.toString();
    }
}
