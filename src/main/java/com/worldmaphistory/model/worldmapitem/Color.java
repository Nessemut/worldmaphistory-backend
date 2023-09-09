package com.worldmaphistory.model.worldmapitem;

public class Color {

    private final int r;
    private final int g;
    private final int b;
    private static final int DIFFERENCE = 25;

    public Color(int r, int g, int b) {
        if (r > 255) {
            r = 255;
        }
        if (g > 255) {
            g = 255;
        }
        if (b > 255) {
            b = 255;
        }
        this.r = r;
        this.g = g;
        this.b = b;
    }

    public Color getSecondary() {
        return new Color(this.r + DIFFERENCE, this.g + DIFFERENCE, this.b + DIFFERENCE);
    }

    public Color getTertiary() {
        return new Color(this.r + 2* DIFFERENCE, this.g + 2* DIFFERENCE, this.b + 2* DIFFERENCE);
    }

    public Color getQuaternary() {
        return new Color(this.r + 3* DIFFERENCE, this.g + 3* DIFFERENCE, this.b + 3* DIFFERENCE);
    }

    @Override
    public String toString() {
        return "#" + Integer.toHexString(r) + Integer.toHexString(g) + Integer.toHexString(b);
    }

}
