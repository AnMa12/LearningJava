package com.company.ExercitiuPractic;

import java.util.Objects;

public class CercExtins extends Cerc {

    private int x;
    private int y;

    public CercExtins(int r, int x, int y) {
        super(r);
        this.x = x;
        this.y = y;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof CercExtins)) return false;
        if (!super.equals(o)) return false;
        CercExtins that = (CercExtins) o;

        //cercurile sunt egale cand au aceeasi raza si
        //aceleasi coordonate ale centrului)
        return x == that.x &&
                y == that.y && getR() == that.getR();
    }

    @Override
    public String toString() {
        return "CercExtins{" +
                "x=" + x +
                ", y=" + y +
                '}' + " Raza: " + getR() + " }";
    }
}
