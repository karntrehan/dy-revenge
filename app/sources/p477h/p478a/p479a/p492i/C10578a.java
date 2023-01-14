package p477h.p478a.p479a.p492i;

import java.io.File;
import java.io.FilenameFilter;

/* renamed from: h.a.a.i.a */
public final /* synthetic */ class C10578a implements FilenameFilter {

    /* renamed from: a */
    public final /* synthetic */ String f28017a;

    public /* synthetic */ C10578a(String str) {
        this.f28017a = str;
    }

    public final boolean accept(File file, String str) {
        return str.startsWith(this.f28017a + ".");
    }
}
