package com.google.mlkit.vision.text.internal;

import android.graphics.Point;
import android.util.SparseArray;
import androidx.recyclerview.widget.RecyclerView;
import com.lwansbrough.RCTCamera.RCTCameraModule;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import p174e.p319f.p320a.p335c.p345f.p358m.C8612c;
import p174e.p319f.p320a.p335c.p345f.p358m.C8643e4;
import p174e.p319f.p320a.p335c.p345f.p358m.C8717k0;
import p174e.p319f.p320a.p335c.p345f.p358m.C8718k1;
import p174e.p319f.p320a.p335c.p345f.p358m.C8727ka;
import p174e.p319f.p320a.p335c.p345f.p358m.C8756n0;
import p174e.p319f.p320a.p335c.p345f.p358m.C8819rb;
import p174e.p319f.p320a.p335c.p345f.p358m.C8847u0;
import p174e.p319f.p406d.p411b.p415d.C9641a;

/* renamed from: com.google.mlkit.vision.text.internal.i */
final class C4994i {

    /* renamed from: a */
    static final C8819rb f13918a = C8819rb.m29648a("\n");

    /* renamed from: b */
    private static final Comparator<Map.Entry<String, Integer>> f13919b = C4993h.f13917f;

    /* renamed from: a */
    static C9641a m18922a(C8727ka[] kaVarArr) {
        SparseArray sparseArray = new SparseArray();
        int i = 0;
        for (C8727ka kaVar : kaVarArr) {
            SparseArray sparseArray2 = (SparseArray) sparseArray.get(kaVar.f23861w);
            if (sparseArray2 == null) {
                sparseArray2 = new SparseArray();
                sparseArray.append(kaVar.f23861w, sparseArray2);
            }
            sparseArray2.append(kaVar.f23862x, kaVar);
        }
        C8717k0 o = C8756n0.m29569o();
        int i2 = 0;
        while (i2 < sparseArray.size()) {
            SparseArray sparseArray3 = (SparseArray) sparseArray.valueAt(i2);
            C8717k0 o2 = C8756n0.m29569o();
            for (int i3 = 0; i3 < sparseArray3.size(); i3++) {
                o2.mo22501c((C8727ka) sparseArray3.valueAt(i3));
            }
            C8756n0 d = o2.mo22502d();
            List a = C8847u0.m29704a(d, C4989d.f13913a);
            C8643e4 e4Var = ((C8727ka) d.get(i)).f23853o;
            C8718k1 v = d.listIterator(i);
            int i4 = RecyclerView.UNDEFINED_DURATION;
            int i5 = RecyclerView.UNDEFINED_DURATION;
            int i6 = RCTCameraModule.RCT_CAMERA_ORIENTATION_AUTO;
            int i7 = RCTCameraModule.RCT_CAMERA_ORIENTATION_AUTO;
            while (v.hasNext()) {
                C8643e4 e4Var2 = ((C8727ka) v.next()).f23853o;
                int i8 = e4Var.f23682f;
                int i9 = e4Var.f23683o;
                C8718k1 k1Var = v;
                double sin = Math.sin(Math.toRadians((double) e4Var.f23686r));
                double cos = Math.cos(Math.toRadians((double) e4Var.f23686r));
                SparseArray sparseArray4 = sparseArray;
                int i10 = i2;
                Point[] pointArr = new Point[4];
                C8717k0 k0Var = o;
                List list = a;
                Point point = new Point(e4Var2.f23682f, e4Var2.f23683o);
                pointArr[0] = point;
                point.offset(-i8, -i9);
                int i11 = (int) ((((double) pointArr[0].x) * cos) + (((double) pointArr[0].y) * sin));
                int i12 = (int) ((((double) (-pointArr[0].x)) * sin) + (((double) pointArr[0].y) * cos));
                pointArr[0].x = i11;
                pointArr[0].y = i12;
                pointArr[1] = new Point(e4Var2.f23684p + i11, i12);
                pointArr[2] = new Point(e4Var2.f23684p + i11, e4Var2.f23685q + i12);
                pointArr[3] = new Point(i11, i12 + e4Var2.f23685q);
                for (int i13 = 0; i13 < 4; i13++) {
                    Point point2 = pointArr[i13];
                    i6 = Math.min(i6, point2.x);
                    i4 = Math.max(i4, point2.x);
                    i7 = Math.min(i7, point2.y);
                    i5 = Math.max(i5, point2.y);
                }
                v = k1Var;
                sparseArray = sparseArray4;
                i2 = i10;
                o = k0Var;
                a = list;
            }
            C8717k0 k0Var2 = o;
            SparseArray sparseArray5 = sparseArray;
            int i14 = i2;
            List list2 = a;
            int i15 = e4Var.f23682f;
            int i16 = e4Var.f23683o;
            double sin2 = Math.sin(Math.toRadians((double) e4Var.f23686r));
            double cos2 = Math.cos(Math.toRadians((double) e4Var.f23686r));
            Point[] pointArr2 = {new Point(i6, i7), new Point(i4, i7), new Point(i4, i5), new Point(i6, i5)};
            int i17 = 0;
            for (int i18 = 4; i17 < i18; i18 = 4) {
                int i19 = pointArr2[i17].x;
                int i20 = pointArr2[i17].y;
                int i21 = pointArr2[i17].x;
                int i22 = pointArr2[i17].y;
                pointArr2[i17].x = (int) ((((double) i19) * cos2) - (((double) i20) * sin2));
                pointArr2[i17].y = (int) ((((double) i21) * sin2) + (((double) i22) * cos2));
                pointArr2[i17].offset(i15, i16);
                i17++;
            }
            List asList = Arrays.asList(pointArr2);
            List list3 = list2;
            C8717k0 k0Var3 = k0Var2;
            k0Var3.mo22501c(new C9641a.C9645d(f13918a.mo22629b(C8847u0.m29704a(list3, C4991f.f13915a)), C4986a.m18912a(asList), asList, m18923b(list3), list3));
            i2 = i14 + 1;
            o = k0Var3;
            sparseArray = sparseArray5;
            i = 0;
        }
        C8756n0 d2 = o.mo22502d();
        return new C9641a(f13918a.mo22629b(C8847u0.m29704a(d2, C4992g.f13916a)), d2);
    }

    /* renamed from: b */
    private static String m18923b(List<C9641a.C9643b> list) {
        HashMap hashMap = new HashMap();
        for (C9641a.C9643b b : list) {
            String b2 = b.mo24181b();
            hashMap.put(b2, Integer.valueOf((hashMap.containsKey(b2) ? ((Integer) hashMap.get(b2)).intValue() : 0) + 1));
        }
        Set entrySet = hashMap.entrySet();
        if (entrySet.isEmpty()) {
            return "und";
        }
        String str = (String) ((Map.Entry) Collections.max(entrySet, f13919b)).getKey();
        return C8612c.m29392b(str) ? "und" : str;
    }
}
