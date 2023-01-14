package p174e.p319f.p406d.p411b.p412a;

import android.graphics.Rect;
import androidx.annotation.RecentlyNullable;
import com.google.android.gms.common.internal.C3705r;
import com.google.mlkit.vision.barcode.internal.C4958k;

/* renamed from: e.f.d.b.a.a */
public class C9625a {

    /* renamed from: a */
    private final C4958k f25740a;

    public C9625a(C4958k kVar) {
        this.f25740a = (C4958k) C3705r.m14346k(kVar);
    }

    @RecentlyNullable
    /* renamed from: a */
    public Rect mo24115a() {
        return this.f25740a.mo14965a();
    }

    @RecentlyNullable
    /* renamed from: b */
    public String mo24116b() {
        return this.f25740a.mo14967k();
    }

    /* renamed from: c */
    public int mo24117c() {
        int zza = this.f25740a.zza();
        if (zza > 4096 || zza == 0) {
            return -1;
        }
        return zza;
    }

    @RecentlyNullable
    /* renamed from: d */
    public String mo24118d() {
        return this.f25740a.mo14966i();
    }

    /* renamed from: e */
    public int mo24119e() {
        return this.f25740a.zzb();
    }
}
