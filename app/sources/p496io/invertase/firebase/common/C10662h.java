package p496io.invertase.firebase.common;

import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.modules.core.DeviceEventManagerModule;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import p450f.p451a.p452a.p453a.C10237a;

/* renamed from: io.invertase.firebase.common.h */
public class C10662h {

    /* renamed from: a */
    private static C10662h f28134a = new C10662h();

    /* renamed from: b */
    private final List<C10237a> f28135b = new ArrayList();

    /* renamed from: c */
    private final Handler f28136c = new Handler(Looper.getMainLooper());

    /* renamed from: d */
    private final HashMap<String, Integer> f28137d = new HashMap<>();

    /* renamed from: e */
    private ReactContext f28138e;

    /* renamed from: f */
    private Boolean f28139f = Boolean.FALSE;

    /* renamed from: g */
    private int f28140g;

    /* renamed from: c */
    private boolean m36282c(C10237a aVar) {
        ReactContext reactContext;
        if (this.f28139f.booleanValue() && (reactContext = this.f28138e) != null && reactContext.hasActiveCatalystInstance()) {
            try {
                ((DeviceEventManagerModule.RCTDeviceEventEmitter) this.f28138e.getJSModule(DeviceEventManagerModule.RCTDeviceEventEmitter.class)).emit("rnfb_" + aVar.mo25544b(), aVar.mo25543a());
                return true;
            } catch (Exception e) {
                Log.wtf("RNFB_EMITTER", "Error sending Event " + aVar.mo25544b(), e);
            }
        }
        return false;
    }

    /* renamed from: e */
    public static C10662h m36283e() {
        return f28134a;
    }

    /* access modifiers changed from: private */
    /* renamed from: f */
    public /* synthetic */ void mo26546g(ReactContext reactContext) {
        this.f28138e = reactContext;
        m36288p();
    }

    /* access modifiers changed from: private */
    /* renamed from: i */
    public /* synthetic */ void mo26547j(Boolean bool) {
        this.f28139f = bool;
        m36288p();
    }

    /* access modifiers changed from: private */
    /* renamed from: k */
    public /* synthetic */ void mo26548l(C10237a aVar) {
        synchronized (this.f28137d) {
            if (!this.f28137d.containsKey(aVar.mo25544b()) || !m36282c(aVar)) {
                this.f28135b.add(aVar);
            }
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: p */
    public void m36288p() {
        synchronized (this.f28137d) {
            Iterator it = new ArrayList(this.f28135b).iterator();
            while (it.hasNext()) {
                C10237a aVar = (C10237a) it.next();
                if (this.f28137d.containsKey(aVar.mo25544b())) {
                    this.f28135b.remove(aVar);
                    mo26551o(aVar);
                }
            }
        }
    }

    /* renamed from: a */
    public void mo26543a(String str) {
        synchronized (this.f28137d) {
            this.f28140g++;
            if (!this.f28137d.containsKey(str)) {
                this.f28137d.put(str, 1);
            } else {
                this.f28137d.put(str, Integer.valueOf(this.f28137d.get(str).intValue() + 1));
            }
        }
        this.f28136c.post(new C10657c(this));
    }

    /* renamed from: b */
    public void mo26544b(ReactContext reactContext) {
        this.f28136c.post(new C10655a(this, reactContext));
    }

    /* renamed from: d */
    public WritableMap mo26545d() {
        WritableMap createMap = Arguments.createMap();
        WritableMap createMap2 = Arguments.createMap();
        createMap.putInt("listeners", this.f28140g);
        createMap.putInt("queued", this.f28135b.size());
        synchronized (this.f28137d) {
            for (Map.Entry next : this.f28137d.entrySet()) {
                createMap2.putInt((String) next.getKey(), ((Integer) next.getValue()).intValue());
            }
        }
        createMap.putMap("events", createMap2);
        return createMap;
    }

    /* renamed from: m */
    public void mo26549m(Boolean bool) {
        this.f28136c.post(new C10658d(this, bool));
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x003a  */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x003b  */
    /* renamed from: n */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo26550n(java.lang.String r6, java.lang.Boolean r7) {
        /*
            r5 = this;
            java.util.HashMap<java.lang.String, java.lang.Integer> r0 = r5.f28137d
            monitor-enter(r0)
            java.util.HashMap<java.lang.String, java.lang.Integer> r1 = r5.f28137d     // Catch:{ all -> 0x0041 }
            boolean r1 = r1.containsKey(r6)     // Catch:{ all -> 0x0041 }
            if (r1 == 0) goto L_0x003f
            java.util.HashMap<java.lang.String, java.lang.Integer> r1 = r5.f28137d     // Catch:{ all -> 0x0041 }
            java.lang.Object r1 = r1.get(r6)     // Catch:{ all -> 0x0041 }
            java.lang.Integer r1 = (java.lang.Integer) r1     // Catch:{ all -> 0x0041 }
            int r1 = r1.intValue()     // Catch:{ all -> 0x0041 }
            r2 = 1
            if (r1 <= r2) goto L_0x002d
            boolean r3 = r7.booleanValue()     // Catch:{ all -> 0x0041 }
            if (r3 == 0) goto L_0x0021
            goto L_0x002d
        L_0x0021:
            java.util.HashMap<java.lang.String, java.lang.Integer> r3 = r5.f28137d     // Catch:{ all -> 0x0041 }
            int r4 = r1 + -1
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)     // Catch:{ all -> 0x0041 }
            r3.put(r6, r4)     // Catch:{ all -> 0x0041 }
            goto L_0x0032
        L_0x002d:
            java.util.HashMap<java.lang.String, java.lang.Integer> r3 = r5.f28137d     // Catch:{ all -> 0x0041 }
            r3.remove(r6)     // Catch:{ all -> 0x0041 }
        L_0x0032:
            int r6 = r5.f28140g     // Catch:{ all -> 0x0041 }
            boolean r7 = r7.booleanValue()     // Catch:{ all -> 0x0041 }
            if (r7 == 0) goto L_0x003b
            goto L_0x003c
        L_0x003b:
            r1 = 1
        L_0x003c:
            int r6 = r6 - r1
            r5.f28140g = r6     // Catch:{ all -> 0x0041 }
        L_0x003f:
            monitor-exit(r0)     // Catch:{ all -> 0x0041 }
            return
        L_0x0041:
            r6 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x0041 }
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: p496io.invertase.firebase.common.C10662h.mo26550n(java.lang.String, java.lang.Boolean):void");
    }

    /* renamed from: o */
    public void mo26551o(C10237a aVar) {
        this.f28136c.post(new C10656b(this, aVar));
    }
}
