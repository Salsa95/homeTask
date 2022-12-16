public class Worker {

    @FunctionalInterface
    public interface OnTaskErrorListener{
        void onError(String error);
    }
    @FunctionalInterface
    public interface OnTaskDoneListener {
        void onDone(String result);
    }

    protected OnTaskDoneListener callback;
    protected OnTaskErrorListener errorCallback;

    public Worker (OnTaskDoneListener callback, OnTaskErrorListener errorCallback){
        this.callback = callback;
        this.errorCallback = errorCallback;
    }

    public void start() {
        for (int i = 0; i < 100; i++) {
            if (i != 33){
            callback.onDone("Task " + i + " is done");
            } else {
                errorCallback.onError("Task " + i + " is ERROR");
            }
        }
    }
}
