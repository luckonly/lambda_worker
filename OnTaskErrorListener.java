package lambda_worker;

@FunctionalInterface
public interface OnTaskErrorListener {
    void onError(String result);
}