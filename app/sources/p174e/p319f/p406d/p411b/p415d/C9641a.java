package p174e.p319f.p406d.p411b.p415d;

import android.graphics.Point;
import android.graphics.Rect;
import androidx.annotation.RecentlyNonNull;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import okhttp3.HttpUrl;
import p174e.p319f.p320a.p335c.p345f.p358m.C8598ab;
import p174e.p319f.p320a.p335c.p345f.p358m.C8624cb;
import p174e.p319f.p320a.p335c.p345f.p358m.C8650eb;
import p174e.p319f.p320a.p335c.p345f.p358m.C8676gb;
import p174e.p319f.p320a.p335c.p345f.p358m.C8847u0;

/* renamed from: e.f.d.b.d.a */
public class C9641a {

    /* renamed from: a */
    private final List<C9645d> f25781a;

    /* renamed from: b */
    private final String f25782b;

    /* renamed from: e.f.d.b.d.a$a */
    public static class C9642a extends C9644c {
        C9642a(C8624cb cbVar) {
            super(cbVar.mo22340r(), cbVar.mo22338o(), cbVar.mo22337C(), cbVar.mo22339p());
        }

        public C9642a(@RecentlyNonNull String str, @RecentlyNonNull Rect rect, @RecentlyNonNull List<Point> list, @RecentlyNonNull String str2) {
            super(str, rect, list, str2);
        }

        /* renamed from: d */
        public String mo24177d() {
            return mo24182c();
        }
    }

    /* renamed from: e.f.d.b.d.a$b */
    public static class C9643b extends C9644c {

        /* renamed from: e */
        private final List<C9642a> f25783e;

        C9643b(C8650eb ebVar) {
            super(ebVar.mo22396r(), ebVar.mo22394o(), ebVar.mo22392C(), ebVar.mo22395p());
            this.f25783e = C8847u0.m29704a(ebVar.mo22393E(), C9652g.f25794a);
        }

        public C9643b(@RecentlyNonNull String str, @RecentlyNonNull Rect rect, @RecentlyNonNull List<Point> list, @RecentlyNonNull String str2, @RecentlyNonNull List<C9642a> list2) {
            super(str, rect, list, str2);
            this.f25783e = list2;
        }

        /* renamed from: d */
        public synchronized List<C9642a> mo24178d() {
            return this.f25783e;
        }

        /* renamed from: e */
        public String mo24179e() {
            return mo24182c();
        }
    }

    /* renamed from: e.f.d.b.d.a$c */
    static class C9644c {

        /* renamed from: a */
        private final String f25784a;

        /* renamed from: b */
        private final Rect f25785b;

        /* renamed from: c */
        private final Point[] f25786c;

        /* renamed from: d */
        private final String f25787d;

        C9644c(String str, Rect rect, List<Point> list, String str2) {
            this.f25784a = str;
            this.f25785b = rect;
            this.f25786c = (Point[]) list.toArray(new Point[0]);
            this.f25787d = str2;
        }

        /* renamed from: a */
        public Rect mo24180a() {
            return this.f25785b;
        }

        /* renamed from: b */
        public String mo24181b() {
            return this.f25787d;
        }

        /* access modifiers changed from: protected */
        /* renamed from: c */
        public final String mo24182c() {
            String str = this.f25784a;
            return str == null ? HttpUrl.FRAGMENT_ENCODE_SET : str;
        }
    }

    /* renamed from: e.f.d.b.d.a$d */
    public static class C9645d extends C9644c {

        /* renamed from: e */
        private final List<C9643b> f25788e;

        C9645d(C8598ab abVar) {
            super(abVar.mo22316r(), abVar.mo22314o(), abVar.mo22312C(), abVar.mo22315p());
            this.f25788e = C8847u0.m29704a(abVar.mo22313E(), C9653h.f25795a);
        }

        public C9645d(@RecentlyNonNull String str, @RecentlyNonNull Rect rect, @RecentlyNonNull List<Point> list, @RecentlyNonNull String str2, @RecentlyNonNull List<C9643b> list2) {
            super(str, rect, list, str2);
            this.f25788e = list2;
        }

        /* renamed from: d */
        public synchronized List<C9643b> mo24183d() {
            return this.f25788e;
        }

        /* renamed from: e */
        public String mo24184e() {
            return mo24182c();
        }
    }

    public C9641a(C8676gb gbVar) {
        ArrayList arrayList = new ArrayList();
        this.f25781a = arrayList;
        this.f25782b = gbVar.mo22427o();
        arrayList.addAll(C8847u0.m29704a(gbVar.mo22428p(), C9651f.f25793a));
    }

    public C9641a(@RecentlyNonNull String str, @RecentlyNonNull List<C9645d> list) {
        ArrayList arrayList = new ArrayList();
        this.f25781a = arrayList;
        arrayList.addAll(list);
        this.f25782b = str;
    }

    /* renamed from: a */
    public List<C9645d> mo24176a() {
        return Collections.unmodifiableList(this.f25781a);
    }
}
