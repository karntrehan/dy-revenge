package com.google.firebase.crashlytics.p139h.p150q;

/* renamed from: com.google.firebase.crashlytics.h.q.a */
public class C4804a implements C4807d {

    /* renamed from: a */
    private final int f13535a;

    /* renamed from: b */
    private final C4807d[] f13536b;

    /* renamed from: c */
    private final C4805b f13537c;

    public C4804a(int i, C4807d... dVarArr) {
        this.f13535a = i;
        this.f13536b = dVarArr;
        this.f13537c = new C4805b(i);
    }

    /* renamed from: a */
    public StackTraceElement[] mo14705a(StackTraceElement[] stackTraceElementArr) {
        if (stackTraceElementArr.length <= this.f13535a) {
            return stackTraceElementArr;
        }
        StackTraceElement[] stackTraceElementArr2 = stackTraceElementArr;
        for (C4807d dVar : this.f13536b) {
            if (stackTraceElementArr2.length <= this.f13535a) {
                break;
            }
            stackTraceElementArr2 = dVar.mo14705a(stackTraceElementArr);
        }
        return stackTraceElementArr2.length > this.f13535a ? this.f13537c.mo14705a(stackTraceElementArr2) : stackTraceElementArr2;
    }
}
