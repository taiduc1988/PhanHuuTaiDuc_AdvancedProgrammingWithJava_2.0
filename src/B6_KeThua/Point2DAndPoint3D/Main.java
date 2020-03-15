package B6_KeThua.Point2DAndPoint3D;

public class Main {
    public static void main(String[] args) {
        Point2D point2D =new Point2D();
        System.out.println(point2D);

        point2D = new Point2D(2.0f,2.0f);
        System.out.println(point2D);

        Point3D point3D = new Point3D();
        System.out.println(point3D);

        point3D = new Point3D(5.0f,5.0f,6.0f);
        System.out.println(point3D);
    }
}
