package net.flood.ocrnn.util;

public interface Applier<T> {
    /**
     * Apply something to a value.
     * @param value
     * @return the new value.
     */
    T apply(T value);
}
