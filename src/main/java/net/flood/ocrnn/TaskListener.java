package net.flood.ocrnn;

public interface TaskListener<T> {
    void onTaskEnd(T result);
}
