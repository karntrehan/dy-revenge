package com.facebook.react.bridge;

public class RetryableMountingLayerException extends RuntimeException {
    public RetryableMountingLayerException(String str) {
        super(str);
    }

    public RetryableMountingLayerException(String str, Throwable th) {
        super(str, th);
    }

    public RetryableMountingLayerException(Throwable th) {
        super(th);
    }
}
