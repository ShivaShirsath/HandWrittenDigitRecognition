package net.flood.ocrnn;

import java.util.concurrent.Callable;

public abstract class Task<T> implements Callable<T> {
    private TaskListener<T> listener;
    private T result;

    public void setListener(TaskListener<T> listener) {
        this.listener = listener;
        if(result != null && listener != null) {
            listener.onTaskEnd(result);
        }
    }

    public abstract T doWork();

    @Override
    public T call() throws Exception {
        result = doWork();
        if(listener != null) {
            listener.onTaskEnd(result);
        }
        return result;
    }
}
