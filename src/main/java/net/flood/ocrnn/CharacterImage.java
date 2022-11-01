package net.flood.ocrnn;

public class CharacterImage {
    public final char label;
    public final int[][] pixels;

    public CharacterImage(char label, int[][] pixels) {
        this.label = label;
        this.pixels = pixels;
    }
}
