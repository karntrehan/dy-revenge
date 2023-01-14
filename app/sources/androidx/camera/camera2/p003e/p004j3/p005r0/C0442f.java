package androidx.camera.camera2.p003e.p004j3.p005r0;

import android.annotation.SuppressLint;
import android.os.Build;
import android.util.Size;
import android.view.Surface;
import androidx.camera.camera2.p003e.p004j3.p005r0.C0435b;
import androidx.camera.core.C0949o2;
import androidx.core.util.C1177h;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Collections;
import java.util.List;
import java.util.Objects;

/* renamed from: androidx.camera.camera2.e.j3.r0.f */
class C0442f implements C0435b.C0436a {

    /* renamed from: a */
    final Object f1572a;

    /* renamed from: androidx.camera.camera2.e.j3.r0.f$a */
    private static final class C0443a {

        /* renamed from: a */
        final List<Surface> f1573a;

        /* renamed from: b */
        final Size f1574b;

        /* renamed from: c */
        final int f1575c;

        /* renamed from: d */
        final int f1576d;

        /* renamed from: e */
        String f1577e;

        /* renamed from: f */
        boolean f1578f = false;

        C0443a(Surface surface) {
            C1177h.m4584f(surface, "Surface must not be null");
            this.f1573a = Collections.singletonList(surface);
            this.f1574b = m1937c(surface);
            this.f1575c = m1935a(surface);
            this.f1576d = m1936b(surface);
        }

        @SuppressLint({"BlockedPrivateApi"})
        /* renamed from: a */
        private static int m1935a(Surface surface) {
            try {
                Method declaredMethod = Class.forName("android.hardware.camera2.legacy.LegacyCameraDevice").getDeclaredMethod("detectSurfaceType", new Class[]{Surface.class});
                if (Build.VERSION.SDK_INT < 22) {
                    declaredMethod.setAccessible(true);
                }
                return ((Integer) declaredMethod.invoke((Object) null, new Object[]{surface})).intValue();
            } catch (ClassNotFoundException | IllegalAccessException | NoSuchMethodException | InvocationTargetException e) {
                C0949o2.m3691d("OutputConfigCompat", "Unable to retrieve surface format.", e);
                return 0;
            }
        }

        @SuppressLint({"SoonBlockedPrivateApi"})
        /* renamed from: b */
        private static int m1936b(Surface surface) {
            try {
                return ((Integer) Surface.class.getDeclaredMethod("getGenerationId", new Class[0]).invoke(surface, new Object[0])).intValue();
            } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException e) {
                C0949o2.m3691d("OutputConfigCompat", "Unable to retrieve surface generation id.", e);
                return -1;
            }
        }

        @SuppressLint({"BlockedPrivateApi"})
        /* renamed from: c */
        private static Size m1937c(Surface surface) {
            try {
                Method declaredMethod = Class.forName("android.hardware.camera2.legacy.LegacyCameraDevice").getDeclaredMethod("getSurfaceSize", new Class[]{Surface.class});
                declaredMethod.setAccessible(true);
                return (Size) declaredMethod.invoke((Object) null, new Object[]{surface});
            } catch (ClassNotFoundException | IllegalAccessException | NoSuchMethodException | InvocationTargetException e) {
                C0949o2.m3691d("OutputConfigCompat", "Unable to retrieve surface size.", e);
                return null;
            }
        }

        public boolean equals(Object obj) {
            if (!(obj instanceof C0443a)) {
                return false;
            }
            C0443a aVar = (C0443a) obj;
            if (!this.f1574b.equals(aVar.f1574b) || this.f1575c != aVar.f1575c || this.f1576d != aVar.f1576d || this.f1578f != aVar.f1578f || !Objects.equals(this.f1577e, aVar.f1577e)) {
                return false;
            }
            int min = Math.min(this.f1573a.size(), aVar.f1573a.size());
            for (int i = 0; i < min; i++) {
                if (this.f1573a.get(i) != aVar.f1573a.get(i)) {
                    return false;
                }
            }
            return true;
        }

        public int hashCode() {
            int hashCode = this.f1573a.hashCode() ^ 31;
            int i = this.f1576d ^ ((hashCode << 5) - hashCode);
            int hashCode2 = this.f1574b.hashCode() ^ ((i << 5) - i);
            int i2 = this.f1575c ^ ((hashCode2 << 5) - hashCode2);
            boolean z = this.f1578f ^ ((i2 << 5) - i2);
            int i3 = ((z ? 1 : 0) << true) - z;
            String str = this.f1577e;
            return (str == null ? 0 : str.hashCode()) ^ i3;
        }
    }

    C0442f(Surface surface) {
        this.f1572a = new C0443a(surface);
    }

    C0442f(Object obj) {
        this.f1572a = obj;
    }

    /* renamed from: b */
    public Surface mo2175b() {
        List<Surface> list = ((C0443a) this.f1572a).f1573a;
        if (list.size() == 0) {
            return null;
        }
        return list.get(0);
    }

    /* renamed from: c */
    public String mo2176c() {
        return ((C0443a) this.f1572a).f1577e;
    }

    /* renamed from: d */
    public void mo2177d(String str) {
        ((C0443a) this.f1572a).f1577e = str;
    }

    /* renamed from: e */
    public Object mo2178e() {
        return null;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof C0442f)) {
            return false;
        }
        return Objects.equals(this.f1572a, ((C0442f) obj).f1572a);
    }

    public int hashCode() {
        return this.f1572a.hashCode();
    }
}
