package p174e.p319f.p393c.p394a.p395a0;

/* renamed from: e.f.c.a.a0.v */
public class C9213v {
    /* renamed from: a */
    public static int m30603a() {
        try {
            return Class.forName("android.os.Build$VERSION").getDeclaredField("SDK_INT").getInt((Object) null);
        } catch (ClassNotFoundException | IllegalAccessException | NoSuchFieldException unused) {
            return -1;
        }
    }

    /* renamed from: b */
    public static boolean m30604b() {
        try {
            Class.forName("android.app.Application", false, (ClassLoader) null);
            return true;
        } catch (Exception unused) {
            return false;
        }
    }
}
