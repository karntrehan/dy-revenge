package p477h.p478a.p479a.p491h;

import com.google.android.gms.dynamite.descriptors.com.google.mlkit.dynamite.face.ModuleDescriptor;
import java.io.File;
import java.io.OutputStream;
import java.io.RandomAccessFile;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;
import p477h.p478a.p479a.p483c.C10497a;
import p477h.p478a.p479a.p484d.C10503e;
import p477h.p478a.p479a.p488f.C10543j;
import p477h.p478a.p479a.p488f.C10549p;
import p477h.p478a.p479a.p490g.C10558a;
import p477h.p478a.p479a.p491h.C10572i;
import p477h.p478a.p479a.p492i.C10581d;

/* renamed from: h.a.a.h.e */
abstract class C10566e<T> extends C10572i<T> {
    C10566e(C10572i.C10573a aVar) {
        super(aVar);
    }

    /* renamed from: l */
    private int m35821l(List<C10543j> list, C10543j jVar) {
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).equals(jVar)) {
                return i;
            }
        }
        throw new C10497a("Could not find file header in list of central directory file headers");
    }

    /* renamed from: o */
    static /* synthetic */ int m35822o(C10543j jVar, C10543j jVar2) {
        if (jVar.mo26042k().equals(jVar2.mo26042k())) {
            return 0;
        }
        return jVar.mo26094R() < jVar2.mo26094R() ? -1 : 1;
    }

    /* renamed from: p */
    private void m35823p(File file, File file2) {
        if (!file.delete()) {
            throw new C10497a("cannot delete old zip file");
        } else if (!file2.renameTo(file)) {
            throw new C10497a("cannot rename modified zip file");
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: i */
    public void mo26223i(boolean z, File file, File file2) {
        if (z) {
            m35823p(file, file2);
        } else if (!file2.delete()) {
            throw new C10497a("Could not delete temporary file");
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: j */
    public List<C10543j> mo26224j(List<C10543j> list) {
        ArrayList arrayList = new ArrayList(list);
        Collections.sort(arrayList, C10562a.f27988f);
        return arrayList;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: k */
    public long mo26225k(RandomAccessFile randomAccessFile, OutputStream outputStream, long j, long j2, C10558a aVar) {
        C10581d.m35892g(randomAccessFile, outputStream, j, j + j2, aVar);
        return j2;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: m */
    public long mo26226m(List<C10543j> list, C10543j jVar, C10549p pVar) {
        int l = m35821l(list, jVar);
        return l == list.size() + -1 ? C10503e.m35461e(pVar) : list.get(l + 1).mo26094R();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: n */
    public File mo26227n(String str) {
        Random random = new Random();
        File file = new File(str + random.nextInt(ModuleDescriptor.MODULE_VERSION));
        while (file.exists()) {
            file = new File(str + random.nextInt(ModuleDescriptor.MODULE_VERSION));
        }
        return file;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: q */
    public void mo26228q(List<C10543j> list, C10549p pVar, C10543j jVar, long j) {
        int l = m35821l(list, jVar);
        if (l != -1) {
            while (true) {
                l++;
                if (l < list.size()) {
                    C10543j jVar2 = list.get(l);
                    jVar2.mo26101Y(jVar2.mo26094R() + j);
                    if (!(!pVar.mo26150l() || jVar2.mo26048q() == null || jVar2.mo26048q().mo26133e() == -1)) {
                        jVar2.mo26048q().mo26137i(jVar2.mo26048q().mo26133e() + j);
                    }
                } else {
                    return;
                }
            }
        } else {
            throw new C10497a("Could not locate modified file header in zipModel");
        }
    }
}
