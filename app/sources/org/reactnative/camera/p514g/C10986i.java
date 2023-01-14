package org.reactnative.camera.p514g;

import android.graphics.Rect;
import android.os.AsyncTask;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.WritableArray;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.uimanager.C3031o0;
import java.util.List;
import org.reactnative.camera.p515h.C10988a;
import org.reactnative.facedetector.C10996a;
import p174e.p319f.p406d.p411b.p415d.C9641a;
import p174e.p319f.p406d.p411b.p415d.C9646b;
import p174e.p319f.p406d.p411b.p415d.C9647c;
import p174e.p319f.p406d.p411b.p415d.C9648d;
import p497j.p502b.p504b.C10679b;

/* renamed from: org.reactnative.camera.g.i */
public class C10986i extends AsyncTask<Void, Void, List<C9641a.C9645d>> {

    /* renamed from: a */
    private C10987j f28795a;

    /* renamed from: b */
    private C3031o0 f28796b;

    /* renamed from: c */
    private C9647c f28797c;

    /* renamed from: d */
    private byte[] f28798d;

    /* renamed from: e */
    private int f28799e;

    /* renamed from: f */
    private int f28800f;

    /* renamed from: g */
    private int f28801g;

    /* renamed from: h */
    private C10988a f28802h;

    /* renamed from: i */
    private double f28803i;

    /* renamed from: j */
    private double f28804j;

    /* renamed from: k */
    private int f28805k;

    /* renamed from: l */
    private int f28806l;

    public C10986i(C10987j jVar, C3031o0 o0Var, byte[] bArr, int i, int i2, int i3, float f, int i4, int i5, int i6, int i7, int i8) {
        this.f28795a = jVar;
        this.f28796b = o0Var;
        this.f28798d = bArr;
        this.f28799e = i;
        this.f28800f = i2;
        this.f28801g = i3;
        C10988a aVar = new C10988a(i, i2, i3, i4);
        this.f28802h = aVar;
        this.f28803i = ((double) i5) / ((double) (((float) aVar.mo29000d()) * f));
        this.f28804j = ((double) i6) / ((double) (((float) this.f28802h.mo28998b()) * f));
        this.f28805k = i7;
        this.f28806l = i8;
    }

    /* renamed from: c */
    private WritableMap m37277c(WritableMap writableMap) {
        ReadableMap map = writableMap.getMap("bounds");
        WritableMap d = C10996a.m37303d(C10996a.m37302c(map.getMap("origin"), this.f28802h.mo29000d(), this.f28803i), -map.getMap("size").getDouble("width"));
        WritableMap createMap = Arguments.createMap();
        createMap.merge(map);
        createMap.putMap("origin", d);
        writableMap.putMap("bounds", createMap);
        ReadableArray array = writableMap.getArray("components");
        WritableArray createArray = Arguments.createArray();
        for (int i = 0; i < array.size(); i++) {
            WritableMap createMap2 = Arguments.createMap();
            createMap2.merge(array.getMap(i));
            m37277c(createMap2);
            createArray.pushMap(createMap2);
        }
        writableMap.putArray("components", createArray);
        return writableMap;
    }

    /* renamed from: d */
    private WritableMap m37278d(Rect rect) {
        int i = rect.left;
        int i2 = rect.top;
        int width = rect.width();
        int height = rect.height();
        int i3 = this.f28799e;
        if (i < i3 / 2) {
            i += this.f28805k / 2;
        } else if (i > i3 / 2) {
            i -= this.f28805k / 2;
        }
        int i4 = this.f28800f;
        if (height < i4 / 2) {
            i2 += this.f28806l / 2;
        } else if (height > i4 / 2) {
            i2 -= this.f28806l / 2;
        }
        WritableMap createMap = Arguments.createMap();
        createMap.putDouble("x", ((double) i) * this.f28803i);
        createMap.putDouble("y", ((double) i2) * this.f28804j);
        WritableMap createMap2 = Arguments.createMap();
        createMap2.putDouble("width", ((double) width) * this.f28803i);
        createMap2.putDouble("height", ((double) height) * this.f28804j);
        WritableMap createMap3 = Arguments.createMap();
        createMap3.putMap("origin", createMap);
        createMap3.putMap("size", createMap2);
        return createMap3;
    }

    /* renamed from: e */
    private WritableMap m37279e(C9641a.C9642a aVar) {
        WritableMap createMap = Arguments.createMap();
        createMap.putArray("components", Arguments.createArray());
        createMap.putString("value", aVar.mo24177d());
        createMap.putMap("bounds", m37278d(aVar.mo24180a()));
        createMap.putString("type", "element");
        return createMap;
    }

    /* renamed from: f */
    private WritableMap m37280f(C9641a.C9643b bVar) {
        WritableMap createMap = Arguments.createMap();
        WritableArray createArray = Arguments.createArray();
        for (C9641a.C9642a e : bVar.mo24178d()) {
            createArray.pushMap(m37279e(e));
        }
        createMap.putArray("components", createArray);
        createMap.putString("value", bVar.mo24179e());
        createMap.putMap("bounds", m37278d(bVar.mo24180a()));
        createMap.putString("type", "line");
        return createMap;
    }

    /* renamed from: g */
    private WritableMap m37281g(C9641a.C9645d dVar) {
        WritableMap createMap = Arguments.createMap();
        WritableArray createArray = Arguments.createArray();
        for (C9641a.C9643b f : dVar.mo24183d()) {
            createArray.pushMap(m37280f(f));
        }
        createMap.putArray("components", createArray);
        createMap.putString("value", dVar.mo24184e());
        createMap.putMap("bounds", m37278d(dVar.mo24180a()));
        createMap.putString("type", "block");
        return createMap;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public List<C9641a.C9645d> doInBackground(Void... voidArr) {
        if (isCancelled() || this.f28795a == null) {
            return null;
        }
        this.f28797c = C9646b.m32805a(C9648d.f25789a);
        return this.f28797c.mo15000f(C10679b.m36351b(this.f28798d, this.f28799e, this.f28800f, this.f28801g).mo26604b()).mo22776l().mo24176a();
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public void onPostExecute(List<C9641a.C9645d> list) {
        super.onPostExecute(list);
        C9647c cVar = this.f28797c;
        if (cVar != null) {
            cVar.close();
        }
        if (list != null) {
            WritableArray createArray = Arguments.createArray();
            for (int i = 0; i < list.size(); i++) {
                WritableMap g = m37281g(list.get(i));
                if (this.f28802h.mo28997a() == 1) {
                    g = m37277c(g);
                }
                createArray.pushMap(g);
            }
            this.f28795a.mo28932j(createArray);
        }
        this.f28795a.mo28928f();
    }
}
