import java.util.Arrays;

public class Poin3d extends Point2D {
    private float z;

    public Poin3d() {

    }

    public float getZ() {
        return z;
    }

    public void setZ(float z) {
        this.z = z;
    }

    public void setXYZ(float x, float y, float z) {
        this.setXY(x, y);
        this.z = z;
    }

    public float[] getXYZ() {
        float[] newarr = {getX(), getY(), z};
        return newarr;
    }

    public String toString() {
        return Arrays.toString(getXYZ());
    }


}
