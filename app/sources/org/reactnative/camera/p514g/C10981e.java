package org.reactnative.camera.p514g;

import android.os.AsyncTask;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.WritableArray;
import com.facebook.react.bridge.WritableMap;
import java.util.List;
import org.reactnative.camera.p515h.C10988a;
import org.reactnative.facedetector.C10996a;
import org.reactnative.facedetector.C10997b;
import p174e.p319f.p406d.p411b.p414c.C9633a;
import p497j.p502b.p504b.C10679b;

/* renamed from: org.reactnative.camera.g.e */
public class C10981e extends AsyncTask<Void, Void, List<C9633a>> {

    /* renamed from: a */
    private byte[] f28775a;

    /* renamed from: b */
    private int f28776b;

    /* renamed from: c */
    private int f28777c;

    /* renamed from: d */
    private int f28778d;

    /* renamed from: e */
    private C10997b f28779e;

    /* renamed from: f */
    private C10982f f28780f;

    /* renamed from: g */
    private C10988a f28781g;

    /* renamed from: h */
    private double f28782h;

    /* renamed from: i */
    private double f28783i;

    /* renamed from: j */
    private int f28784j;

    /* renamed from: k */
    private int f28785k;

    public C10981e(C10982f fVar, C10997b bVar, byte[] bArr, int i, int i2, int i3, float f, int i4, int i5, int i6, int i7, int i8) {
        this.f28775a = bArr;
        this.f28776b = i;
        this.f28777c = i2;
        this.f28778d = i3;
        this.f28780f = fVar;
        this.f28779e = bVar;
        C10988a aVar = new C10988a(i, i2, i3, i4);
        this.f28781g = aVar;
        this.f28782h = ((double) i5) / ((double) (((float) aVar.mo29000d()) * f));
        this.f28783i = ((double) i6) / ((double) (((float) this.f28781g.mo28998b()) * f));
        this.f28784j = i7;
        this.f28785k = i8;
    }

    /* renamed from: c */
    private WritableArray m37260c(List<C9633a> list) {
        WritableArray createArray = Arguments.createArray();
        for (int i = 0; i < list.size(); i++) {
            WritableMap g = C10996a.m37306g(list.get(i), this.f28782h, this.f28783i, this.f28776b, this.f28777c, this.f28784j, this.f28785k);
            createArray.pushMap(this.f28781g.mo28997a() == 1 ? C10996a.m37304e(g, this.f28781g.mo29000d(), this.f28782h) : C10996a.m37300a(g));
        }
        return createArray;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public List<C9633a> doInBackground(Void... voidArr) {
        C10997b bVar;
        if (isCancelled() || this.f28780f == null || (bVar = this.f28779e) == null || !bVar.mo29007c()) {
            return null;
        }
        return this.f28779e.mo29006b(C10679b.m36351b(this.f28775a, this.f28776b, this.f28777c, this.f28778d));
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public void onPostExecute(List<C9633a> list) {
        super.onPostExecute(list);
        if (list == null) {
            this.f28780f.mo28924b(this.f28779e);
            return;
        }
        if (list.size() > 0) {
            this.f28780f.mo28925c(m37260c(list));
        }
        this.f28780f.mo28931i();
    }
}
