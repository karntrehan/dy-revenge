package com.google.firebase.crashlytics.p139h.p150q;

/* renamed from: com.google.firebase.crashlytics.h.q.b */
public class C4805b implements C4807d {

    /* renamed from: a */
    private final int f13538a;

    public C4805b(int i) {
        this.f13538a = i;
    }

    /* renamed from: a */
    public StackTraceElement[] mo14705a(StackTraceElement[] stackTraceElementArr) {
        int length = stackTraceElementArr.length;
        int i = this.f13538a;
        if (length <= i) {
            return stackTraceElementArr;
        }
        int i2 = i / 2;
        int i3 = i - i2;
        StackTraceElement[] stackTraceElementArr2 = new StackTraceElement[i];
        System.arraycopy(stackTraceElementArr, 0, stackTraceElementArr2, 0, i3);
        System.arraycopy(stackTraceElementArr, stackTraceElementArr.length - i2, stackTraceElementArr2, i3, i2);
        return stackTraceElementArr2;
    }
}
