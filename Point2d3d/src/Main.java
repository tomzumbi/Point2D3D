public class Main {
    public static void main(String[] args) {
        Point2D mang = new Point2D();
        mang.setXY(2,3);
        mang.getXY();
        System.out.println(mang.toString());
        Poin3d mang1 = new Poin3d();
        mang1.setXYZ(4,5,6);
        System.out.println(mang1.toString());
    }
}