package com.springcore.ref;

public class B {

    private int y;

    @Override
    public String toString() {
        return "{" + " y='" + getY() + "'" + "}";
    }

    public int getY() {
        return this.y;
    }

    public void setY(int y) {
        this.y = y;
    }

}
