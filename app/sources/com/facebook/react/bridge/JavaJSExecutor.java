package com.facebook.react.bridge;

import p174e.p247e.p317m.p318a.C6410a;

@C6410a
public interface JavaJSExecutor {

    public interface Factory {
        JavaJSExecutor create();
    }

    public static class ProxyExecutorException extends Exception {
        public ProxyExecutorException(Throwable th) {
            super(th);
        }
    }

    void close();

    @C6410a
    String executeJSCall(String str, String str2);

    @C6410a
    void loadBundle(String str);

    @C6410a
    void setGlobalVariable(String str, String str2);
}
