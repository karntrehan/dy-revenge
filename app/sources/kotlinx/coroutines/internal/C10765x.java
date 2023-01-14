package kotlinx.coroutines.internal;

/* renamed from: kotlinx.coroutines.internal.x */
final /* synthetic */ class C10765x {

    /* renamed from: a */
    private static final int f28270a = Runtime.getRuntime().availableProcessors();

    /* renamed from: a */
    public static final int m36603a() {
        return f28270a;
    }

    /* renamed from: b */
    public static final String m36604b(String str) {
        try {
            return System.getProperty(str);
        } catch (SecurityException unused) {
            return null;
        }
    }
}
