package com.facebook.react.uimanager.events;

import android.view.MotionEvent;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.ReactSoftExceptionLogger;
import com.facebook.react.bridge.WritableArray;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.uimanager.C3038r;

/* renamed from: com.facebook.react.uimanager.events.l */
public class C2959l {

    /* renamed from: com.facebook.react.uimanager.events.l$a */
    static /* synthetic */ class C2960a {

        /* renamed from: a */
        static final /* synthetic */ int[] f8286a;

        /* JADX WARNING: Can't wrap try/catch for region: R(8:0|1|2|3|4|5|6|(3:7|8|10)) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0028 */
        static {
            /*
                com.facebook.react.uimanager.events.k[] r0 = com.facebook.react.uimanager.events.C2958k.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f8286a = r0
                com.facebook.react.uimanager.events.k r1 = com.facebook.react.uimanager.events.C2958k.START     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f8286a     // Catch:{ NoSuchFieldError -> 0x001d }
                com.facebook.react.uimanager.events.k r1 = com.facebook.react.uimanager.events.C2958k.END     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f8286a     // Catch:{ NoSuchFieldError -> 0x0028 }
                com.facebook.react.uimanager.events.k r1 = com.facebook.react.uimanager.events.C2958k.MOVE     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = f8286a     // Catch:{ NoSuchFieldError -> 0x0033 }
                com.facebook.react.uimanager.events.k r1 = com.facebook.react.uimanager.events.C2958k.CANCEL     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.facebook.react.uimanager.events.C2959l.C2960a.<clinit>():void");
        }
    }

    /* renamed from: a */
    private static WritableMap[] m11794a(C2955i iVar) {
        MotionEvent u = iVar.mo9662u();
        WritableMap[] writableMapArr = new WritableMap[u.getPointerCount()];
        float x = u.getX() - iVar.mo9664w();
        float y = u.getY() - iVar.mo9665x();
        for (int i = 0; i < u.getPointerCount(); i++) {
            WritableMap createMap = Arguments.createMap();
            createMap.putDouble("pageX", (double) C3038r.m12004a(u.getX(i)));
            createMap.putDouble("pageY", (double) C3038r.m12004a(u.getY(i)));
            createMap.putDouble("locationX", (double) C3038r.m12004a(u.getX(i) - x));
            createMap.putDouble("locationY", (double) C3038r.m12004a(u.getY(i) - y));
            createMap.putInt("targetSurface", iVar.mo9639k());
            createMap.putInt("target", iVar.mo9643o());
            createMap.putDouble("timestamp", (double) iVar.mo9640l());
            createMap.putDouble("identifier", (double) u.getPointerId(i));
            writableMapArr[i] = createMap;
        }
        return writableMapArr;
    }

    /* renamed from: b */
    private static WritableArray m11795b(boolean z, WritableMap... writableMapArr) {
        WritableArray createArray = Arguments.createArray();
        for (WritableMap writableMap : writableMapArr) {
            if (writableMap != null) {
                if (z) {
                    writableMap = writableMap.copy();
                }
                createArray.pushMap(writableMap);
            }
        }
        return createArray;
    }

    /* renamed from: c */
    private static WritableArray m11796c(WritableMap... writableMapArr) {
        return m11795b(false, writableMapArr);
    }

    /* renamed from: d */
    public static void m11797d(RCTEventEmitter rCTEventEmitter, C2955i iVar) {
        C2958k v = iVar.mo9663v();
        WritableArray c = m11796c(m11794a(iVar));
        MotionEvent u = iVar.mo9662u();
        WritableArray createArray = Arguments.createArray();
        if (v == C2958k.MOVE || v == C2958k.CANCEL) {
            for (int i = 0; i < u.getPointerCount(); i++) {
                createArray.pushInt(i);
            }
        } else if (v == C2958k.START || v == C2958k.END) {
            createArray.pushInt(u.getActionIndex());
        } else {
            throw new RuntimeException("Unknown touch type: " + v);
        }
        rCTEventEmitter.receiveTouches(C2958k.m11792e(v), c, createArray);
    }

    /* renamed from: e */
    public static void m11798e(RCTModernEventEmitter rCTModernEventEmitter, C2955i iVar, boolean z) {
        WritableMap[] writableMapArr;
        C2958k v = iVar.mo9663v();
        MotionEvent u = iVar.mo9662u();
        if (u == null) {
            ReactSoftExceptionLogger.logSoftException("TouchesHelper", new IllegalStateException("Cannot dispatch a TouchEvent that has no MotionEvent; the TouchEvent has been recycled"));
            return;
        }
        WritableMap[] a = m11794a(iVar);
        int i = C2960a.f8286a[v.ordinal()];
        if (i == 1) {
            writableMapArr = new WritableMap[]{a[u.getActionIndex()].copy()};
        } else if (i == 2) {
            int actionIndex = u.getActionIndex();
            WritableMap writableMap = a[actionIndex];
            a[actionIndex] = null;
            writableMapArr = new WritableMap[]{writableMap};
        } else if (i == 3) {
            writableMapArr = new WritableMap[a.length];
            for (int i2 = 0; i2 < a.length; i2++) {
                writableMapArr[i2] = a[i2].copy();
            }
        } else if (i != 4) {
            writableMapArr = null;
        } else {
            WritableMap[] writableMapArr2 = a;
            a = new WritableMap[0];
            writableMapArr = writableMapArr2;
        }
        WritableArray c = m11796c(a);
        WritableArray b = m11795b(true, writableMapArr);
        for (WritableMap writableMap2 : writableMapArr) {
            writableMap2.putArray("changedTouches", b);
            writableMap2.putArray("touches", c);
            if (z) {
                rCTModernEventEmitter.receiveEvent(iVar.mo9639k(), iVar.mo9643o(), iVar.mo9630j(), iVar.mo9631a(), 0, writableMap2, iVar.mo9638h());
                RCTModernEventEmitter rCTModernEventEmitter2 = rCTModernEventEmitter;
            } else {
                RCTModernEventEmitter rCTModernEventEmitter3 = rCTModernEventEmitter;
                rCTModernEventEmitter.receiveEvent(iVar.mo9639k(), iVar.mo9643o(), iVar.mo9630j(), writableMap2);
            }
        }
    }
}
