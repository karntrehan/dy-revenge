package com.google.firebase.crashlytics.p139h.p147n;

import com.google.firebase.crashlytics.p139h.C4542f;
import com.google.firebase.crashlytics.p139h.p142j.C4603t;
import com.google.firebase.crashlytics.p139h.p143k.C4631i;
import com.google.firebase.crashlytics.p139h.p144l.C4655a0;
import com.google.firebase.crashlytics.p139h.p144l.C4699b0;
import com.google.firebase.crashlytics.p139h.p144l.p145d0.C4716g;
import com.google.firebase.crashlytics.p139h.p149p.C4800i;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FilenameFilter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.SortedSet;
import java.util.TreeSet;
import java.util.concurrent.atomic.AtomicInteger;
import okhttp3.HttpUrl;

/* renamed from: com.google.firebase.crashlytics.h.n.e */
public class C4781e {

    /* renamed from: a */
    private static final Charset f13459a = Charset.forName("UTF-8");

    /* renamed from: b */
    private static final int f13460b = 15;

    /* renamed from: c */
    private static final C4716g f13461c = new C4716g();

    /* renamed from: d */
    private static final Comparator<? super File> f13462d = C4777a.f13455f;

    /* renamed from: e */
    private static final FilenameFilter f13463e = C4780d.f13458a;

    /* renamed from: f */
    private final AtomicInteger f13464f = new AtomicInteger(0);

    /* renamed from: g */
    private final C4782f f13465g;

    /* renamed from: h */
    private final C4800i f13466h;

    public C4781e(C4782f fVar, C4800i iVar) {
        this.f13465g = fVar;
        this.f13466h = iVar;
    }

    /* renamed from: A */
    private void m18248A(String str, long j) {
        boolean z;
        List<File> p = this.f13465g.mo14684p(str, f13463e);
        if (p.isEmpty()) {
            C4542f f = C4542f.m17259f();
            f.mo14110i("Session " + str + " has no events.");
            return;
        }
        Collections.sort(p);
        ArrayList arrayList = new ArrayList();
        Iterator<File> it = p.iterator();
        loop0:
        while (true) {
            z = false;
            while (true) {
                if (!it.hasNext()) {
                    break loop0;
                }
                File next = it.next();
                try {
                    arrayList.add(f13461c.mo14585a(m18268y(next)));
                    if (z || m18261o(next.getName())) {
                        z = true;
                    }
                } catch (IOException e) {
                    C4542f f2 = C4542f.m17259f();
                    f2.mo14113l("Could not add event to report for " + next, e);
                }
            }
        }
        if (arrayList.isEmpty()) {
            C4542f f3 = C4542f.m17259f();
            f3.mo14112k("Could not parse event files for session " + str);
            return;
        }
        String j2 = C4631i.m17635j(str, this.f13465g);
        m18249B(this.f13465g.mo14683o(str, "report"), arrayList, j, z, j2);
    }

    /* renamed from: B */
    private void m18249B(File file, List<C4655a0.C4665e.C4672d> list, long j, boolean z, String str) {
        try {
            C4716g gVar = f13461c;
            C4655a0 l = gVar.mo14583D(m18268y(file)).mo14313n(j, z, str).mo14311l(C4699b0.m17956b(list));
            C4655a0.C4665e j2 = l.mo14309j();
            if (j2 != null) {
                m18251D(z ? this.f13465g.mo14679j(j2.mo14361h()) : this.f13465g.mo14681l(j2.mo14361h()), gVar.mo14584E(l));
            }
        } catch (IOException e) {
            C4542f f = C4542f.m17259f();
            f.mo14113l("Could not synthesize final report file for " + file, e);
        }
    }

    /* renamed from: C */
    private int m18250C(String str, int i) {
        List<File> p = this.f13465g.mo14684p(str, C4778b.f13456a);
        Collections.sort(p, C4779c.f13457f);
        return m18254b(p, i);
    }

    /* renamed from: D */
    private static void m18251D(File file, String str) {
        OutputStreamWriter outputStreamWriter = new OutputStreamWriter(new FileOutputStream(file), f13459a);
        try {
            outputStreamWriter.write(str);
            outputStreamWriter.close();
            return;
        } catch (Throwable th) {
            th.addSuppressed(th);
        }
        throw th;
    }

    /* renamed from: E */
    private static void m18252E(File file, String str, long j) {
        OutputStreamWriter outputStreamWriter = new OutputStreamWriter(new FileOutputStream(file), f13459a);
        try {
            outputStreamWriter.write(str);
            file.setLastModified(m18256d(j));
            outputStreamWriter.close();
            return;
        } catch (Throwable th) {
            th.addSuppressed(th);
        }
        throw th;
    }

    /* renamed from: a */
    private SortedSet<String> m18253a(String str) {
        this.f13465g.mo14671b();
        SortedSet<String> l = mo14665l();
        if (str != null) {
            l.remove(str);
        }
        if (l.size() <= 8) {
            return l;
        }
        while (l.size() > 8) {
            String last = l.last();
            C4542f f = C4542f.m17259f();
            f.mo14104b("Removing session over cap: " + last);
            this.f13465g.mo14672c(last);
            l.remove(last);
        }
        return l;
    }

    /* renamed from: b */
    private static int m18254b(List<File> list, int i) {
        int size = list.size();
        for (File next : list) {
            if (size <= i) {
                return size;
            }
            C4782f.m18283s(next);
            size--;
        }
        return size;
    }

    /* renamed from: c */
    private void m18255c() {
        int i = this.f13466h.mo14699b().f13499a.f13510b;
        List<File> j = m18259j();
        int size = j.size();
        if (size > i) {
            for (File delete : j.subList(i, size)) {
                delete.delete();
            }
        }
    }

    /* renamed from: d */
    private static long m18256d(long j) {
        return j * 1000;
    }

    /* renamed from: f */
    private void m18257f(List<File> list) {
        for (File delete : list) {
            delete.delete();
        }
    }

    /* renamed from: i */
    private static String m18258i(int i, boolean z) {
        String format = String.format(Locale.US, "%010d", new Object[]{Integer.valueOf(i)});
        String str = z ? "_" : HttpUrl.FRAGMENT_ENCODE_SET;
        return "event" + format + str;
    }

    /* renamed from: j */
    private List<File> m18259j() {
        ArrayList arrayList = new ArrayList();
        arrayList.addAll(this.f13465g.mo14680k());
        arrayList.addAll(this.f13465g.mo14677h());
        Comparator<? super File> comparator = f13462d;
        Collections.sort(arrayList, comparator);
        List<File> m = this.f13465g.mo14682m();
        Collections.sort(m, comparator);
        arrayList.addAll(m);
        return arrayList;
    }

    /* renamed from: k */
    private static String m18260k(String str) {
        return str.substring(0, f13460b);
    }

    /* renamed from: o */
    private static boolean m18261o(String str) {
        return str.startsWith("event") && str.endsWith("_");
    }

    /* access modifiers changed from: private */
    /* renamed from: p */
    public static boolean m18262p(File file, String str) {
        return str.startsWith("event") && !str.endsWith("_");
    }

    /* access modifiers changed from: private */
    /* renamed from: v */
    public static int m18267v(File file, File file2) {
        return m18260k(file.getName()).compareTo(m18260k(file2.getName()));
    }

    /* renamed from: y */
    private static String m18268y(File file) {
        byte[] bArr = new byte[8192];
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        FileInputStream fileInputStream = new FileInputStream(file);
        while (true) {
            try {
                int read = fileInputStream.read(bArr);
                if (read > 0) {
                    byteArrayOutputStream.write(bArr, 0, read);
                } else {
                    String str = new String(byteArrayOutputStream.toByteArray(), f13459a);
                    fileInputStream.close();
                    return str;
                }
            } catch (Throwable th) {
                th.addSuppressed(th);
            }
        }
        throw th;
    }

    /* renamed from: z */
    private void m18269z(File file, C4655a0.C4661d dVar, String str) {
        try {
            C4716g gVar = f13461c;
            m18251D(this.f13465g.mo14676g(str), gVar.mo14584E(gVar.mo14583D(m18268y(file)).mo14312m(dVar)));
        } catch (IOException e) {
            C4542f f = C4542f.m17259f();
            f.mo14113l("Could not synthesize final native report file for " + file, e);
        }
    }

    /* renamed from: e */
    public void mo14662e() {
        m18257f(this.f13465g.mo14682m());
        m18257f(this.f13465g.mo14680k());
        m18257f(this.f13465g.mo14677h());
    }

    /* renamed from: g */
    public void mo14663g(String str, long j) {
        for (String next : m18253a(str)) {
            C4542f f = C4542f.m17259f();
            f.mo14110i("Finalizing report for session " + next);
            m18248A(next, j);
            this.f13465g.mo14672c(next);
        }
        m18255c();
    }

    /* renamed from: h */
    public void mo14664h(String str, C4655a0.C4661d dVar) {
        File o = this.f13465g.mo14683o(str, "report");
        C4542f f = C4542f.m17259f();
        f.mo14104b("Writing native session report for " + str + " to file: " + o);
        m18269z(o, dVar, str);
    }

    /* renamed from: l */
    public SortedSet<String> mo14665l() {
        return new TreeSet(this.f13465g.mo14673d()).descendingSet();
    }

    /* renamed from: m */
    public long mo14666m(String str) {
        return this.f13465g.mo14683o(str, "start-time").lastModified();
    }

    /* renamed from: n */
    public boolean mo14667n() {
        return !this.f13465g.mo14682m().isEmpty() || !this.f13465g.mo14680k().isEmpty() || !this.f13465g.mo14677h().isEmpty();
    }

    /* renamed from: u */
    public List<C4603t> mo14668u() {
        List<File> j = m18259j();
        ArrayList arrayList = new ArrayList();
        for (File next : j) {
            try {
                arrayList.add(C4603t.m17527a(f13461c.mo14583D(m18268y(next)), next.getName(), next));
            } catch (IOException e) {
                C4542f f = C4542f.m17259f();
                f.mo14113l("Could not load report file " + next + "; deleting", e);
                next.delete();
            }
        }
        return arrayList;
    }

    /* renamed from: w */
    public void mo14669w(C4655a0.C4665e.C4672d dVar, String str, boolean z) {
        int i = this.f13466h.mo14699b().f13499a.f13509a;
        try {
            m18251D(this.f13465g.mo14683o(str, m18258i(this.f13464f.getAndIncrement(), z)), f13461c.mo14586b(dVar));
        } catch (IOException e) {
            C4542f f = C4542f.m17259f();
            f.mo14113l("Could not persist event for session " + str, e);
        }
        m18250C(str, i);
    }

    /* renamed from: x */
    public void mo14670x(C4655a0 a0Var) {
        C4655a0.C4665e j = a0Var.mo14309j();
        if (j == null) {
            C4542f.m17259f().mo14104b("Could not get session for report");
            return;
        }
        String h = j.mo14361h();
        try {
            m18251D(this.f13465g.mo14683o(h, "report"), f13461c.mo14584E(a0Var));
            m18252E(this.f13465g.mo14683o(h, "start-time"), HttpUrl.FRAGMENT_ENCODE_SET, j.mo14364k());
        } catch (IOException e) {
            C4542f f = C4542f.m17259f();
            f.mo14105c("Could not persist report for session " + h, e);
        }
    }
}
