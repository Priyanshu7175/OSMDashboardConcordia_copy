package de.storchp.opentracks.osmplugin.compass;

/**
 * Derived from <a href="https://github.com/kylecorry31/Trail-Sense/blob/master/app/src/main/java/com/kylecorry/trail_sense/shared/domain/Vector3.kt">...</a>
 */
public class Vector3 {

    public static final Vector3 ZERO = new Vector3(0f, 0f, 0f);

    private final float y;
    private final float z;
    private final float x;

    public Vector3(float x, float y, float z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    public Vector3 cross(Vector3 other) {
        return new Vector3(
                this.y * other.z - this.z * other.y,
                this.z * other.x - this.x * other.z,
                this.x * other.y - this.y * other.x
        );
    }

    public Vector3 minus(Vector3 other) {
        return new Vector3(
                x - other.x,
                y - other.y,
                z - other.z
        );
    }

    public Vector3 plus(Vector3 other) {
        return new Vector3(
                x + other.x,
                y + other.y,
                z + other.z
        );
    }

    public Vector3 times(float factor) {
        return new Vector3(
                x * factor,
                y * factor,
                z * factor
        );
    }

    public float[] toFloatArray() {
        return new float[]{x, y, z};
    }

    public float dot(Vector3 other) {
        return x * other.x + y * other.y + z * other.z;
    }

    public float magnitude() {
        return (float) Math.sqrt(x * x + y * y + z * z);
    }

    public Vector3 normalize() {
        float mag = magnitude();
        return new Vector3(
                x / mag,
                y / mag,
                z / mag
        );
    }

    public float getX() {
        return this.x;
    }

    public float getY() {
        return this.y;
    }

    public float getZ() {
        return this.z;
    }

}
