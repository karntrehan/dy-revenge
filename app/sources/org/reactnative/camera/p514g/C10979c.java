package org.reactnative.camera.p514g;

import android.graphics.Rect;
import android.os.AsyncTask;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.WritableArray;
import com.facebook.react.bridge.WritableMap;
import java.util.List;
import org.reactnative.camera.p515h.C10988a;
import p174e.p319f.p406d.p411b.p412a.C9625a;
import p497j.p502b.p503a.C10676a;
import p497j.p502b.p503a.C10677b;
import p497j.p502b.p504b.C10679b;

/* renamed from: org.reactnative.camera.g.c */
public class C10979c extends AsyncTask<Void, Void, List<C9625a>> {

    /* renamed from: a */
    private byte[] f28764a;

    /* renamed from: b */
    private int f28765b;

    /* renamed from: c */
    private int f28766c;

    /* renamed from: d */
    private int f28767d;

    /* renamed from: e */
    private C10677b f28768e;

    /* renamed from: f */
    private C10980d f28769f;

    /* renamed from: g */
    private double f28770g;

    /* renamed from: h */
    private double f28771h;

    /* renamed from: i */
    private C10988a f28772i;

    /* renamed from: j */
    private int f28773j;

    /* renamed from: k */
    private int f28774k;

    public C10979c(C10980d dVar, C10677b bVar, byte[] bArr, int i, int i2, int i3, float f, int i4, int i5, int i6, int i7, int i8) {
        this.f28764a = bArr;
        this.f28765b = i;
        this.f28766c = i2;
        this.f28767d = i3;
        this.f28769f = dVar;
        this.f28768e = bVar;
        C10988a aVar = new C10988a(i, i2, i3, i4);
        this.f28772i = aVar;
        this.f28770g = ((double) i5) / ((double) (((float) aVar.mo29000d()) * f));
        this.f28771h = ((double) i6) / ((double) (((float) this.f28772i.mo28998b()) * f));
        this.f28773j = i7;
        this.f28774k = i8;
    }

    /* renamed from: c */
    private WritableMap m37253c(Rect rect) {
        WritableMap createMap = Arguments.createMap();
        int i = rect.left;
        int i2 = rect.top;
        int i3 = this.f28765b;
        if (i < i3 / 2) {
            i += this.f28773j / 2;
        } else if (i > i3 / 2) {
            i -= this.f28773j / 2;
        }
        int i4 = this.f28766c;
        if (i2 < i4 / 2) {
            i2 += this.f28774k / 2;
        } else if (i2 > i4 / 2) {
            i2 -= this.f28774k / 2;
        }
        createMap.putDouble("x", ((double) i) * this.f28770g);
        createMap.putDouble("y", ((double) i2) * this.f28771h);
        WritableMap createMap2 = Arguments.createMap();
        createMap2.putDouble("width", ((double) rect.width()) * this.f28770g);
        createMap2.putDouble("height", ((double) rect.height()) * this.f28771h);
        WritableMap createMap3 = Arguments.createMap();
        createMap3.putMap("origin", createMap);
        createMap3.putMap("size", createMap2);
        return createMap3;
    }

    /* renamed from: d */
    private WritableArray m37254d(List<C9625a> list) {
        WritableArray createArray = Arguments.createArray();
        for (int i = 0; i < list.size(); i++) {
            C9625a aVar = list.get(i);
            WritableMap createMap = Arguments.createMap();
            createMap.putString("data", aVar.mo24116b());
            createMap.putString("rawData", aVar.mo24118d());
            createMap.putString("type", C10676a.m36341a(aVar.mo24117c()));
            createMap.putMap("bounds", m37253c(aVar.mo24115a()));
            createArray.pushMap(createMap);
        }
        return createArray;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public List<C9625a> doInBackground(Void... voidArr) {
        C10677b bVar;
        if (isCancelled() || this.f28769f == null || (bVar = this.f28768e) == null || !bVar.mo26600c()) {
            return null;
        }
        return this.f28768e.mo26599b(C10679b.m36351b(this.f28764a, this.f28765b, this.f28766c, this.f28767d));
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public void onPostExecute(List<C9625a> list) {
        super.onPostExecute(list);
        if (list == null) {
            this.f28769f.mo28927e(this.f28768e);
            return;
        }
        if (list.size() > 0) {
            this.f28769f.mo28923a(m37254d(list), this.f28765b, this.f28766c, this.f28764a);
        }
        this.f28769f.mo28933k();
    }
}
