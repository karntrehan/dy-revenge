package com.facebook.react.bridge;

import java.lang.reflect.Method;
import p174e.p247e.p253d.p258e.C6071a;
import p174e.p247e.p317m.p318a.C6410a;

@C6410a
public class ReactCxxErrorHandler {
    private static Method mHandleErrorFunc;
    private static Object mObject;

    @C6410a
    private static void handleError(String str) {
        if (mHandleErrorFunc != null) {
            try {
                mHandleErrorFunc.invoke(mObject, new Object[]{new Exception(str)});
            } catch (Exception e) {
                C6071a.m22876j("ReactCxxErrorHandler", "Failed to invole error hanlder function", e);
            }
        }
    }

    @C6410a
    public static void setHandleErrorFunc(Object obj, Method method) {
        mObject = obj;
        mHandleErrorFunc = method;
    }
}
