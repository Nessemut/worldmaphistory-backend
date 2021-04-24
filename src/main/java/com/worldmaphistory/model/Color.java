package com.worldmaphistory.model;

public class Color {

    private final int r;
    private final int g;
    private final int b;
    private final int difference = 25;

    public Color(int r, int g, int b) {
        //TODO: do this with only one if condition
        if (r > 255){
            r = 255;
        }
        if (g > 255){
            g = 255;
        }
        if (b > 255){
            b = 255;
        }
        this.r = r;
        this.g = g;
        this.b = b;
    }

    public Color getSecondary() {
        return new Color(this.r + difference, this.g + difference, this.b + difference);
    }

    public Color getTertiary() {
        return new Color(this.r + 2*difference, this.g + 2*difference, this.b + 2*difference);
    }

    public Color getQuaternary() {
        return new Color(this.r + 3*difference, this.g + 3*difference, this.b + 3*difference);
    }

    @Override
    public String toString() {
        return "#" + Integer.toHexString(r) + Integer.toHexString(g) + Integer.toHexString(b);
    }

}
