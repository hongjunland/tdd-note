package com.tddnote.color;

public class Color {
    public final byte Red;
    public final byte Green;
    public final byte Blue;

    public Color(byte red, byte green, byte blue) {
        Red = red;
        Green = green;
        Blue = blue;
    }

    public Color MixWith(Color other) {
        return new Color((byte) Math.min(this.Red + other.Red, 255),
                (byte) Math.min(this.Green + other.Green, 255),
                (byte) Math.min(this.Blue + other.Blue, 255));
    }
}
