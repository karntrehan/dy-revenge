package p174e.p181b.p182a.p192x;

import android.util.Pair;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.zip.ZipInputStream;
import p174e.p181b.p182a.C5433e;
import p174e.p181b.p182a.C5434f;
import p174e.p181b.p182a.C5463m;
import p174e.p181b.p182a.p195z.C5643d;

/* renamed from: e.b.a.x.h */
public class C5594h {

    /* renamed from: a */
    private final C5593g f15877a;

    /* renamed from: b */
    private final C5592f f15878b;

    public C5594h(C5593g gVar, C5592f fVar) {
        this.f15877a = gVar;
        this.f15878b = fVar;
    }

    /* renamed from: a */
    private C5433e m20872a(String str, String str2) {
        Pair<C5589c, InputStream> a;
        if (str2 == null || (a = this.f15877a.mo16849a(str)) == null) {
            return null;
        }
        C5589c cVar = (C5589c) a.first;
        InputStream inputStream = (InputStream) a.second;
        C5463m<C5433e> s = cVar == C5589c.ZIP ? C5434f.m20257s(new ZipInputStream(inputStream), str) : C5434f.m20247i(inputStream, str);
        if (s.mo16572b() != null) {
            return s.mo16572b();
        }
        return null;
    }

    /* renamed from: b */
    private C5463m<C5433e> m20873b(String str, String str2) {
        C5643d.m21025a("Fetching " + str);
        C5590d dVar = null;
        try {
            dVar = this.f15878b.mo16846a(str);
            if (dVar.isSuccessful()) {
                C5463m<C5433e> d = m20874d(str, dVar.mo16842O(), dVar.mo16841J(), str2);
                StringBuilder sb = new StringBuilder();
                sb.append("Completed fetch from network. Success: ");
                sb.append(d.mo16572b() != null);
                C5643d.m21025a(sb.toString());
                try {
                    dVar.close();
                } catch (IOException e) {
                    C5643d.m21028d("LottieFetchResult close failed ", e);
                }
                return d;
            }
            C5463m<C5433e> mVar = new C5463m<>((Throwable) new IllegalArgumentException(dVar.error()));
            try {
                dVar.close();
            } catch (IOException e2) {
                C5643d.m21028d("LottieFetchResult close failed ", e2);
            }
            return mVar;
        } catch (Exception e3) {
            C5463m<C5433e> mVar2 = new C5463m<>((Throwable) e3);
            if (dVar != null) {
                try {
                    dVar.close();
                } catch (IOException e4) {
                    C5643d.m21028d("LottieFetchResult close failed ", e4);
                }
            }
            return mVar2;
        } catch (Throwable th) {
            if (dVar != null) {
                try {
                    dVar.close();
                } catch (IOException e5) {
                    C5643d.m21028d("LottieFetchResult close failed ", e5);
                }
            }
            throw th;
        }
    }

    /* renamed from: d */
    private C5463m<C5433e> m20874d(String str, InputStream inputStream, String str2, String str3) {
        C5589c cVar;
        C5463m<C5433e> mVar;
        if (str2 == null) {
            str2 = "application/json";
        }
        if (str2.contains("application/zip") || str.split("\\?")[0].endsWith(".lottie")) {
            C5643d.m21025a("Handling zip response.");
            cVar = C5589c.ZIP;
            mVar = m20876f(str, inputStream, str3);
        } else {
            C5643d.m21025a("Received json response.");
            cVar = C5589c.JSON;
            mVar = m20875e(str, inputStream, str3);
        }
        if (!(str3 == null || mVar.mo16572b() == null)) {
            this.f15877a.mo16850e(str, cVar);
        }
        return mVar;
    }

    /* renamed from: e */
    private C5463m<C5433e> m20875e(String str, InputStream inputStream, String str2) {
        return str2 == null ? C5434f.m20247i(inputStream, (String) null) : C5434f.m20247i(new FileInputStream(new File(this.f15877a.mo16851f(str, inputStream, C5589c.JSON).getAbsolutePath())), str);
    }

    /* renamed from: f */
    private C5463m<C5433e> m20876f(String str, InputStream inputStream, String str2) {
        return str2 == null ? C5434f.m20257s(new ZipInputStream(inputStream), (String) null) : C5434f.m20257s(new ZipInputStream(new FileInputStream(this.f15877a.mo16851f(str, inputStream, C5589c.ZIP))), str);
    }

    /* renamed from: c */
    public C5463m<C5433e> mo16852c(String str, String str2) {
        C5433e a = m20872a(str, str2);
        if (a != null) {
            return new C5463m<>(a);
        }
        C5643d.m21025a("Animation for " + str + " not found in cache. Fetching from network.");
        return m20873b(str, str2);
    }
}
