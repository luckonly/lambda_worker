package lambda_worker;

public class Worker {
    private OnTaskDoneListener callback;
    private OnTaskErrorListener callbackError;

    public Worker(OnTaskDoneListener callback, OnTaskErrorListener callbackError) {
        this.callback = callback;
        this.callbackError = callbackError;
    }

    public void start() {
        for (int i = 0; i < 100; i++) {
            if (i != 33) {
                callback.onDone("Task " + i + " is done.");
            } else {
                callbackError.onError("Task " + i + " isn't done!");
            }
        }
    }
}
