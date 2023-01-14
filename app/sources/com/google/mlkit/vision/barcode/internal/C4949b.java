package com.google.mlkit.vision.barcode.internal;

import android.annotation.SuppressLint;
import android.util.SparseArray;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicReference;
import p174e.p319f.p320a.p335c.p345f.p354i.C7154a1;
import p174e.p319f.p320a.p335c.p345f.p354i.C7283ia;
import p174e.p319f.p320a.p335c.p345f.p354i.C7309k8;
import p174e.p319f.p320a.p335c.p345f.p354i.C7323l8;
import p174e.p319f.p320a.p335c.p345f.p354i.C7325la;
import p174e.p319f.p320a.p335c.p345f.p354i.C7339ma;
import p174e.p319f.p320a.p335c.p345f.p354i.C7491x8;
import p174e.p319f.p320a.p335c.p345f.p354i.C7505y8;
import p174e.p319f.p320a.p335c.p345f.p354i.C7521za;
import p174e.p319f.p406d.p407a.p409c.C9606i;
import p174e.p319f.p406d.p411b.p412a.C9627c;

/* renamed from: com.google.mlkit.vision.barcode.internal.b */
public final class C4949b {

    /* renamed from: a */
    private static final SparseArray<C7491x8> f13806a;

    /* renamed from: b */
    private static final SparseArray<C7505y8> f13807b;

    /* renamed from: c */
    static final AtomicReference<String> f13808c = new AtomicReference<>();
    @SuppressLint({"UseSparseArrays"})

    /* renamed from: d */
    private static final Map<Integer, C7283ia> f13809d;

    static {
        SparseArray<C7491x8> sparseArray = new SparseArray<>();
        f13806a = sparseArray;
        SparseArray<C7505y8> sparseArray2 = new SparseArray<>();
        f13807b = sparseArray2;
        sparseArray.put(-1, C7491x8.FORMAT_UNKNOWN);
        sparseArray.put(1, C7491x8.FORMAT_CODE_128);
        sparseArray.put(2, C7491x8.FORMAT_CODE_39);
        sparseArray.put(4, C7491x8.FORMAT_CODE_93);
        sparseArray.put(8, C7491x8.FORMAT_CODABAR);
        sparseArray.put(16, C7491x8.FORMAT_DATA_MATRIX);
        sparseArray.put(32, C7491x8.FORMAT_EAN_13);
        sparseArray.put(64, C7491x8.FORMAT_EAN_8);
        sparseArray.put(128, C7491x8.FORMAT_ITF);
        sparseArray.put(256, C7491x8.FORMAT_QR_CODE);
        sparseArray.put(512, C7491x8.FORMAT_UPC_A);
        sparseArray.put(1024, C7491x8.FORMAT_UPC_E);
        sparseArray.put(2048, C7491x8.FORMAT_PDF417);
        sparseArray.put(4096, C7491x8.FORMAT_AZTEC);
        sparseArray2.put(0, C7505y8.TYPE_UNKNOWN);
        sparseArray2.put(1, C7505y8.TYPE_CONTACT_INFO);
        sparseArray2.put(2, C7505y8.TYPE_EMAIL);
        sparseArray2.put(3, C7505y8.TYPE_ISBN);
        sparseArray2.put(4, C7505y8.TYPE_PHONE);
        sparseArray2.put(5, C7505y8.TYPE_PRODUCT);
        sparseArray2.put(6, C7505y8.TYPE_SMS);
        sparseArray2.put(7, C7505y8.TYPE_TEXT);
        sparseArray2.put(8, C7505y8.TYPE_URL);
        sparseArray2.put(9, C7505y8.TYPE_WIFI);
        sparseArray2.put(10, C7505y8.TYPE_GEO);
        sparseArray2.put(11, C7505y8.TYPE_CALENDAR_EVENT);
        sparseArray2.put(12, C7505y8.TYPE_DRIVER_LICENSE);
        HashMap hashMap = new HashMap();
        f13809d = hashMap;
        hashMap.put(1, C7283ia.CODE_128);
        hashMap.put(2, C7283ia.CODE_39);
        hashMap.put(4, C7283ia.CODE_93);
        hashMap.put(8, C7283ia.CODABAR);
        hashMap.put(16, C7283ia.DATA_MATRIX);
        hashMap.put(32, C7283ia.EAN_13);
        hashMap.put(64, C7283ia.EAN_8);
        hashMap.put(128, C7283ia.ITF);
        hashMap.put(256, C7283ia.QR_CODE);
        hashMap.put(512, C7283ia.UPC_A);
        hashMap.put(1024, C7283ia.UPC_E);
        hashMap.put(2048, C7283ia.PDF417);
        hashMap.put(4096, C7283ia.AZTEC);
    }

    /* renamed from: a */
    public static C7491x8 m18820a(int i) {
        C7491x8 x8Var = f13806a.get(i);
        return x8Var == null ? C7491x8.FORMAT_UNKNOWN : x8Var;
    }

    /* renamed from: b */
    public static C7505y8 m18821b(int i) {
        C7505y8 y8Var = f13807b.get(i);
        return y8Var == null ? C7505y8.TYPE_UNKNOWN : y8Var;
    }

    /* renamed from: c */
    public static C7339ma m18822c(C9627c cVar) {
        int a = cVar.mo24121a();
        C7154a1 a1Var = new C7154a1();
        if (a == 0) {
            a1Var.mo20563f(f13809d.values());
        } else {
            for (Map.Entry next : f13809d.entrySet()) {
                if ((((Integer) next.getKey()).intValue() & a) != 0) {
                    a1Var.mo20562e((C7283ia) next.getValue());
                }
            }
        }
        C7325la laVar = new C7325la();
        laVar.mo20805b(a1Var.mo20564g());
        return laVar.mo20806c();
    }

    /* renamed from: d */
    public static String m18823d() {
        AtomicReference<String> atomicReference = f13808c;
        if (atomicReference.get() != null) {
            return atomicReference.get();
        }
        String str = true != C4960m.m18844b(C9606i.m32708c().mo24098b()) ? "play-services-mlkit-barcode-scanning" : "barcode-scanning";
        atomicReference.set(str);
        return str;
    }

    /* renamed from: e */
    static void m18824e(C7521za zaVar, C7309k8 k8Var) {
        zaVar.mo21031b(new C4948a(k8Var), C7323l8.ON_DEVICE_BARCODE_LOAD);
    }
}
