package B15_XuLyNgoaiLeVaDebug;

public class Test {
    public static void main(String[] args) {

        Triangle a = null;
        try {
            a = new Triangle(1,2,3);
        } catch (IllegalTriangleException e) {
            e.printStackTrace();
            System.out.println("3 canh khong hop le");
        }
        System.out.println("Stop");

    }
}
