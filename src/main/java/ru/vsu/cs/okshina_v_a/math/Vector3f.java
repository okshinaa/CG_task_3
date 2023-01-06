package ru.vsu.cs.okshina_v_a.math;

import java.util.Objects;

public final class Vector3f {
    public float x;
    public float y;
    public float z;

    public Vector3f() {
    }

    public Vector3f(float x, float y, float z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    public Vector3f(Vector3f vector3f) {
        this(vector3f.x, vector3f.y, vector3f.z);
    }

    public void add(Vector3f t1) {
        this.x += t1.x;
        this.y += t1.y;
        this.z += t1.z;
    }

    public void rotateAroundX(float angle) {
        float y = (float) (this.y * Math.cos(angle) + this.z * Math.sin(angle));
        float z = (float) (-this.y * Math.sin(angle) + this.z * Math.cos(angle));

        this.y = y;
        this.z = z;
    }

    public void rotateAroundY(float angle) {
        float x = (float) (this.x * Math.cos(angle) + this.z * Math.sin(angle));
        float z = (float) (-this.x * Math.sin(angle) + this.z * Math.cos(angle));

        this.x = x;
        this.z = z;
    }

    public void rotateAroundZ(float angle) {
        float x = (float) (this.x * Math.cos(angle) + this.y * Math.sin(angle));
        float y = (float) (-this.x * Math.sin(angle) + this.y * Math.cos(angle));

        this.x = x;
        this.y = y;
    }

    public void scaleX(float scale) {
        this.x *= scale;
    }

    public void scaleY(float scale) {
        this.y *= scale;
    }

    public void scaleZ(float scale) {
        this.z *= scale;
    }

    @Override
    public int hashCode() {
        return Objects.hash(x, y, z);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Vector3f vector3f = (Vector3f) o;
        return Float.compare(vector3f.x, x) == 0 &&
                Float.compare(vector3f.y, y) == 0 &&
                Float.compare(vector3f.z, z) == 0;
    }

    @Override
    public String toString() {
        return "Vector3f{" +
                "x=" + x +
                ", y=" + y +
                ", z=" + z +
                '}';
    }
}
