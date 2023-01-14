package p027c.p064i.p069g;

import android.os.Build;
import android.os.Trace;
import android.util.Log;
import java.lang.reflect.Method;

@Deprecated
/* renamed from: c.i.g.m */
public final class C1864m {

    /* renamed from: a */
    private static long f5500a;

    /* renamed from: b */
    private static Method f5501b;

    /* renamed from: c */
    private static Method f5502c;

    /* renamed from: d */
    private static Method f5503d;

    /* renamed from: e */
    private static Method f5504e;

    static {
        Class<String> cls = String.class;
        int i = Build.VERSION.SDK_INT;
        if (i >= 18 && i < 29) {
            try {
                f5500a = Trace.class.getField("TRACE_TAG_APP").getLong((Object) null);
                Class cls2 = Long.TYPE;
                f5501b = Trace.class.getMethod("isTagEnabled", new Class[]{cls2});
                Class cls3 = Integer.TYPE;
                f5502c = Trace.class.getMethod("asyncTraceBegin", new Class[]{cls2, cls, cls3});
                f5503d = Trace.class.getMethod("asyncTraceEnd", new Class[]{cls2, cls, cls3});
                f5504e = Trace.class.getMethod("traceCounter", new Class[]{cls2, cls, cls3});
            } catch (Exception e) {
                Log.i("TraceCompat", "Unable to initialize via reflection.", e);
            }
        }
    }

    /* renamed from: a */
    public static void m7881a(String str) {
        if (Build.VERSION.SDK_INT >= 18) {
            Trace.beginSection(str);
        }
    }

    /* renamed from: b */
    public static void m7882b() {
        if (Build.VERSION.SDK_INT >= 18) {
            Trace.endSection();
        }
    }
}
