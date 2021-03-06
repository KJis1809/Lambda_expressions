package com.company;

public class Worker {
    private OnTaskDoneListener callback;
    private OnTaskErrorListener errorCallback;

    public Worker(OnTaskDoneListener callback, OnTaskErrorListener errorCallback) {
        this.callback = callback;
        this.errorCallback = errorCallback;
    }

    public void start() {
        for (int i = 1; i <= 100; i++) {
            if (i == 33) {
                System.out.println("---------------------------");
                errorCallback.onError("Error: Task " + i + " wasn't added");
                System.out.println("---------------------------");
            }
            callback.onDone("Task " + i + " added");
        }
    }
}