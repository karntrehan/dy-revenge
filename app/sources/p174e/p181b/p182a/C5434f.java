package p174e.p181b.p182a;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import java.io.IOException;
import java.io.InputStream;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.zip.ZipEntry;
import java.util.zip.ZipInputStream;
import p174e.p181b.p182a.p188w.C5530g;
import p174e.p181b.p182a.p193y.C5633t;
import p174e.p181b.p182a.p193y.p194k0.C5618c;
import p174e.p181b.p182a.p195z.C5643d;
import p174e.p181b.p182a.p195z.C5647h;
import p493i.C10615h;
import p493i.C10625q;

/* renamed from: e.b.a.f */
public class C5434f {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public static final Map<String, C5464n<C5433e>> f15202a = new HashMap();

    /* renamed from: b */
    private static final byte[] f15203b = {80, 75, 3, 4};

    /* renamed from: e.b.a.f$a */
    class C5435a implements C5459i<C5433e> {

        /* renamed from: a */
        final /* synthetic */ String f15204a;

        C5435a(String str) {
            this.f15204a = str;
        }

        /* renamed from: b */
        public void mo16442a(C5433e eVar) {
            C5434f.f15202a.remove(this.f15204a);
        }
    }

    /* renamed from: e.b.a.f$b */
    class C5436b implements C5459i<Throwable> {

        /* renamed from: a */
        final /* synthetic */ String f15205a;

        C5436b(String str) {
            this.f15205a = str;
        }

        /* renamed from: b */
        public void mo16442a(Throwable th) {
            C5434f.f15202a.remove(this.f15205a);
        }
    }

    /* renamed from: e.b.a.f$c */
    class C5437c implements Callable<C5463m<C5433e>> {

        /* renamed from: a */
        final /* synthetic */ Context f15206a;

        /* renamed from: b */
        final /* synthetic */ String f15207b;

        /* renamed from: c */
        final /* synthetic */ String f15208c;

        C5437c(Context context, String str, String str2) {
            this.f15206a = context;
            this.f15207b = str;
            this.f15208c = str2;
        }

        /* renamed from: a */
        public C5463m<C5433e> call() {
            C5463m<C5433e> c = C5422c.m20182d(this.f15206a).mo16852c(this.f15207b, this.f15208c);
            if (!(this.f15208c == null || c.mo16572b() == null)) {
                C5530g.m20601b().mo16687c(this.f15208c, c.mo16572b());
            }
            return c;
        }
    }

    /* renamed from: e.b.a.f$d */
    class C5438d implements Callable<C5463m<C5433e>> {

        /* renamed from: a */
        final /* synthetic */ Context f15209a;

        /* renamed from: b */
        final /* synthetic */ String f15210b;

        /* renamed from: c */
        final /* synthetic */ String f15211c;

        C5438d(Context context, String str, String str2) {
            this.f15209a = context;
            this.f15210b = str;
            this.f15211c = str2;
        }

        /* renamed from: a */
        public C5463m<C5433e> call() {
            return C5434f.m20245g(this.f15209a, this.f15210b, this.f15211c);
        }
    }

    /* renamed from: e.b.a.f$e */
    class C5439e implements Callable<C5463m<C5433e>> {

        /* renamed from: a */
        final /* synthetic */ WeakReference f15212a;

        /* renamed from: b */
        final /* synthetic */ Context f15213b;

        /* renamed from: c */
        final /* synthetic */ int f15214c;

        /* renamed from: d */
        final /* synthetic */ String f15215d;

        C5439e(WeakReference weakReference, Context context, int i, String str) {
            this.f15212a = weakReference;
            this.f15213b = context;
            this.f15214c = i;
            this.f15215d = str;
        }

        /* renamed from: a */
        public C5463m<C5433e> call() {
            Context context = (Context) this.f15212a.get();
            if (context == null) {
                context = this.f15213b;
            }
            return C5434f.m20254p(context, this.f15214c, this.f15215d);
        }
    }

    /* renamed from: e.b.a.f$f */
    class C5440f implements Callable<C5463m<C5433e>> {

        /* renamed from: a */
        final /* synthetic */ InputStream f15216a;

        /* renamed from: b */
        final /* synthetic */ String f15217b;

        C5440f(InputStream inputStream, String str) {
            this.f15216a = inputStream;
            this.f15217b = str;
        }

        /* renamed from: a */
        public C5463m<C5433e> call() {
            return C5434f.m20247i(this.f15216a, this.f15217b);
        }
    }

    /* renamed from: e.b.a.f$g */
    class C5441g implements Callable<C5463m<C5433e>> {

        /* renamed from: a */
        final /* synthetic */ C5433e f15218a;

        C5441g(C5433e eVar) {
            this.f15218a = eVar;
        }

        /* renamed from: a */
        public C5463m<C5433e> call() {
            return new C5463m<>(this.f15218a);
        }
    }

    /* renamed from: b */
    private static C5464n<C5433e> m20240b(String str, Callable<C5463m<C5433e>> callable) {
        C5433e a = str == null ? null : C5530g.m20601b().mo16686a(str);
        if (a != null) {
            return new C5464n<>(new C5441g(a));
        }
        if (str != null) {
            Map<String, C5464n<C5433e>> map = f15202a;
            if (map.containsKey(str)) {
                return map.get(str);
            }
        }
        C5464n<C5433e> nVar = new C5464n<>(callable);
        if (str != null) {
            nVar.mo16576f(new C5435a(str));
            nVar.mo16575e(new C5436b(str));
            f15202a.put(str, nVar);
        }
        return nVar;
    }

    /* renamed from: c */
    private static C5458h m20241c(C5433e eVar, String str) {
        for (C5458h next : eVar.mo16464j().values()) {
            if (next.mo16561b().equals(str)) {
                return next;
            }
        }
        return null;
    }

    /* renamed from: d */
    public static C5464n<C5433e> m20242d(Context context, String str) {
        return m20243e(context, str, "asset_" + str);
    }

    /* renamed from: e */
    public static C5464n<C5433e> m20243e(Context context, String str, String str2) {
        return m20240b(str2, new C5438d(context.getApplicationContext(), str, str2));
    }

    /* renamed from: f */
    public static C5463m<C5433e> m20244f(Context context, String str) {
        return m20245g(context, str, "asset_" + str);
    }

    /* renamed from: g */
    public static C5463m<C5433e> m20245g(Context context, String str, String str2) {
        try {
            if (!str.endsWith(".zip")) {
                if (!str.endsWith(".lottie")) {
                    return m20247i(context.getAssets().open(str), str2);
                }
            }
            return m20257s(new ZipInputStream(context.getAssets().open(str)), str2);
        } catch (IOException e) {
            return new C5463m<>((Throwable) e);
        }
    }

    /* renamed from: h */
    public static C5464n<C5433e> m20246h(InputStream inputStream, String str) {
        return m20240b(str, new C5440f(inputStream, str));
    }

    /* renamed from: i */
    public static C5463m<C5433e> m20247i(InputStream inputStream, String str) {
        return m20248j(inputStream, str, true);
    }

    /* renamed from: j */
    private static C5463m<C5433e> m20248j(InputStream inputStream, String str, boolean z) {
        try {
            return m20249k(C5618c.m20923i0(C10625q.m36156d(C10625q.m36163k(inputStream))), str);
        } finally {
            if (z) {
                C5647h.m21068c(inputStream);
            }
        }
    }

    /* renamed from: k */
    public static C5463m<C5433e> m20249k(C5618c cVar, String str) {
        return m20250l(cVar, str, true);
    }

    /* renamed from: l */
    private static C5463m<C5433e> m20250l(C5618c cVar, String str, boolean z) {
        try {
            C5433e a = C5633t.m20999a(cVar);
            if (str != null) {
                C5530g.m20601b().mo16687c(str, a);
            }
            C5463m<C5433e> mVar = new C5463m<>(a);
            if (z) {
                C5647h.m21068c(cVar);
            }
            return mVar;
        } catch (Exception e) {
            C5463m<C5433e> mVar2 = new C5463m<>((Throwable) e);
            if (z) {
                C5647h.m21068c(cVar);
            }
            return mVar2;
        } catch (Throwable th) {
            if (z) {
                C5647h.m21068c(cVar);
            }
            throw th;
        }
    }

    /* renamed from: m */
    public static C5464n<C5433e> m20251m(Context context, int i) {
        return m20252n(context, i, m20261w(context, i));
    }

    /* renamed from: n */
    public static C5464n<C5433e> m20252n(Context context, int i, String str) {
        return m20240b(str, new C5439e(new WeakReference(context), context.getApplicationContext(), i, str));
    }

    /* renamed from: o */
    public static C5463m<C5433e> m20253o(Context context, int i) {
        return m20254p(context, i, m20261w(context, i));
    }

    /* renamed from: p */
    public static C5463m<C5433e> m20254p(Context context, int i, String str) {
        try {
            C10615h d = C10625q.m36156d(C10625q.m36163k(context.getResources().openRawResource(i)));
            return m20260v(d).booleanValue() ? m20257s(new ZipInputStream(d.mo26367r0()), str) : m20247i(d.mo26367r0(), str);
        } catch (Resources.NotFoundException e) {
            return new C5463m<>((Throwable) e);
        }
    }

    /* renamed from: q */
    public static C5464n<C5433e> m20255q(Context context, String str) {
        return m20256r(context, str, "url_" + str);
    }

    /* renamed from: r */
    public static C5464n<C5433e> m20256r(Context context, String str, String str2) {
        return m20240b(str2, new C5437c(context, str, str2));
    }

    /* renamed from: s */
    public static C5463m<C5433e> m20257s(ZipInputStream zipInputStream, String str) {
        try {
            return m20258t(zipInputStream, str);
        } finally {
            C5647h.m21068c(zipInputStream);
        }
    }

    /* renamed from: t */
    private static C5463m<C5433e> m20258t(ZipInputStream zipInputStream, String str) {
        HashMap hashMap = new HashMap();
        try {
            ZipEntry nextEntry = zipInputStream.getNextEntry();
            C5433e eVar = null;
            while (nextEntry != null) {
                String name = nextEntry.getName();
                if (!name.contains("__MACOSX")) {
                    if (!nextEntry.getName().equalsIgnoreCase("manifest.json")) {
                        if (nextEntry.getName().contains(".json")) {
                            eVar = m20250l(C5618c.m20923i0(C10625q.m36156d(C10625q.m36163k(zipInputStream))), (String) null, false).mo16572b();
                        } else if (name.contains(".png") || name.contains(".webp") || name.contains(".jpg") || name.contains(".jpeg")) {
                            String[] split = name.split("/");
                            hashMap.put(split[split.length - 1], BitmapFactory.decodeStream(zipInputStream));
                        }
                        nextEntry = zipInputStream.getNextEntry();
                    }
                }
                zipInputStream.closeEntry();
                nextEntry = zipInputStream.getNextEntry();
            }
            if (eVar == null) {
                return new C5463m<>((Throwable) new IllegalArgumentException("Unable to parse composition"));
            }
            for (Map.Entry entry : hashMap.entrySet()) {
                C5458h c = m20241c(eVar, (String) entry.getKey());
                if (c != null) {
                    c.mo16565f(C5647h.m21077l((Bitmap) entry.getValue(), c.mo16564e(), c.mo16562c()));
                }
            }
            for (Map.Entry next : eVar.mo16464j().entrySet()) {
                if (((C5458h) next.getValue()).mo16560a() == null) {
                    return new C5463m<>((Throwable) new IllegalStateException("There is no image for " + ((C5458h) next.getValue()).mo16561b()));
                }
            }
            if (str != null) {
                C5530g.m20601b().mo16687c(str, eVar);
            }
            return new C5463m<>(eVar);
        } catch (IOException e) {
            return new C5463m<>((Throwable) e);
        }
    }

    /* renamed from: u */
    private static boolean m20259u(Context context) {
        return (context.getResources().getConfiguration().uiMode & 48) == 32;
    }

    /* renamed from: v */
    private static Boolean m20260v(C10615h hVar) {
        try {
            C10615h j0 = hVar.mo26357j0();
            for (byte b : f15203b) {
                if (j0.readByte() != b) {
                    return Boolean.FALSE;
                }
            }
            j0.close();
            return Boolean.TRUE;
        } catch (Exception e) {
            C5643d.m21026b("Failed to check zip file header", e);
            return Boolean.FALSE;
        }
    }

    /* renamed from: w */
    private static String m20261w(Context context, int i) {
        StringBuilder sb = new StringBuilder();
        sb.append("rawRes");
        sb.append(m20259u(context) ? "_night_" : "_day_");
        sb.append(i);
        return sb.toString();
    }
}
