package com.company.ExercitiuPractic;

import java.util.Objects;

import static java.lang.Math.PI;

public class Cerc {
    private int r;

    public Cerc(int r) {
        this.r = r;
    }

    public double calculrArie() {
        return PI * r * r;
    }

    public int getR() {
        return r;
    }

    public void setR(int r) {
        this.r = r;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Cerc)) return false;
        Cerc cerc = (Cerc) o;
        return r == cerc.r;
    }

    @Override
    public int hashCode() {

        return Objects.hash(r);
    }

    @Override
    public String toString() {
        return "Cerc{" +
                "r=" + r +
                '}';
    }
}
