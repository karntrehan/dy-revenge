package p174e.p181b.p182a;

import android.content.Context;
import java.io.File;
import p027c.p064i.p069g.C1864m;
import p174e.p181b.p182a.p192x.C5588b;
import p174e.p181b.p182a.p192x.C5591e;
import p174e.p181b.p182a.p192x.C5592f;
import p174e.p181b.p182a.p192x.C5593g;
import p174e.p181b.p182a.p192x.C5594h;

/* renamed from: e.b.a.c */
public class C5422c {

    /* renamed from: a */
    public static boolean f15141a = false;

    /* renamed from: b */
    private static boolean f15142b = false;

    /* renamed from: c */
    private static String[] f15143c;

    /* renamed from: d */
    private static long[] f15144d;

    /* renamed from: e */
    private static int f15145e;

    /* renamed from: f */
    private static int f15146f;

    /* renamed from: g */
    private static C5592f f15147g;

    /* renamed from: h */
    private static C5591e f15148h;

    /* renamed from: i */
    private static volatile C5594h f15149i;

    /* renamed from: j */
    private static volatile C5593g f15150j;

    /* renamed from: e.b.a.c$a */
    class C5423a implements C5591e {

        /* renamed from: a */
        final /* synthetic */ Context f15151a;

        C5423a(Context context) {
            this.f15151a = context;
        }

        /* renamed from: a */
        public File mo16378a() {
            return new File(this.f15151a.getCacheDir(), "lottie_network_cache");
        }
    }

    /* renamed from: a */
    public static void m20179a(String str) {
        if (f15142b) {
            int i = f15145e;
            if (i == 20) {
                f15146f++;
                return;
            }
            f15143c[i] = str;
            f15144d[i] = System.nanoTime();
            C1864m.m7881a(str);
            f15145e++;
        }
    }

    /* renamed from: b */
    public static float m20180b(String str) {
        int i = f15146f;
        if (i > 0) {
            f15146f = i - 1;
            return 0.0f;
        } else if (!f15142b) {
            return 0.0f;
        } else {
            int i2 = f15145e - 1;
            f15145e = i2;
            if (i2 == -1) {
                throw new IllegalStateException("Can't end trace section. There are none.");
            } else if (str.equals(f15143c[i2])) {
                C1864m.m7882b();
                return ((float) (System.nanoTime() - f15144d[f15145e])) / 1000000.0f;
            } else {
                throw new IllegalStateException("Unbalanced trace call " + str + ". Expected " + f15143c[f15145e] + ".");
            }
        }
    }

    /* renamed from: c */
    public static C5593g m20181c(Context context) {
        Context applicationContext = context.getApplicationContext();
        C5593g gVar = f15150j;
        if (gVar == null) {
            synchronized (C5593g.class) {
                gVar = f15150j;
                if (gVar == null) {
                    C5591e eVar = f15148h;
                    if (eVar == null) {
                        eVar = new C5423a(applicationContext);
                    }
                    gVar = new C5593g(eVar);
                    f15150j = gVar;
                }
            }
        }
        return gVar;
    }

    /* renamed from: d */
    public static C5594h m20182d(Context context) {
        C5594h hVar = f15149i;
        if (hVar == null) {
            synchronized (C5594h.class) {
                hVar = f15149i;
                if (hVar == null) {
                    C5593g c = m20181c(context);
                    C5592f fVar = f15147g;
                    if (fVar == null) {
                        fVar = new C5588b();
                    }
                    hVar = new C5594h(c, fVar);
                    f15149i = hVar;
                }
            }
        }
        return hVar;
    }
}
