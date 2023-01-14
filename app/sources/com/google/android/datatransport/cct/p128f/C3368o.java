package com.google.android.datatransport.cct.p128f;

import android.util.SparseArray;
import com.google.android.datatransport.cct.p128f.C3356i;

/* renamed from: com.google.android.datatransport.cct.f.o */
public abstract class C3368o {

    /* renamed from: com.google.android.datatransport.cct.f.o$a */
    public static abstract class C3369a {
        /* renamed from: a */
        public abstract C3368o mo10942a();

        /* renamed from: b */
        public abstract C3369a mo10943b(C3370b bVar);

        /* renamed from: c */
        public abstract C3369a mo10944c(C3371c cVar);
    }

    /* renamed from: com.google.android.datatransport.cct.f.o$b */
    public enum C3370b {
        UNKNOWN_MOBILE_SUBTYPE(0),
        GPRS(1),
        EDGE(2),
        UMTS(3),
        CDMA(4),
        EVDO_0(5),
        EVDO_A(6),
        RTT(7),
        HSDPA(8),
        HSUPA(9),
        HSPA(10),
        IDEN(11),
        EVDO_B(12),
        LTE(13),
        EHRPD(14),
        HSPAP(15),
        GSM(16),
        TD_SCDMA(17),
        IWLAN(18),
        LTE_CA(19),
        COMBINED(100);
        

        /* renamed from: I */
        private static final SparseArray<C3370b> f9536I = null;

        /* renamed from: K */
        private final int f9551K;

        static {
            C3370b bVar;
            C3370b bVar2;
            C3370b bVar3;
            C3370b bVar4;
            C3370b bVar5;
            C3370b bVar6;
            C3370b bVar7;
            C3370b bVar8;
            C3370b bVar9;
            C3370b bVar10;
            C3370b bVar11;
            C3370b bVar12;
            C3370b bVar13;
            C3370b bVar14;
            C3370b bVar15;
            C3370b bVar16;
            C3370b bVar17;
            C3370b bVar18;
            C3370b bVar19;
            C3370b bVar20;
            SparseArray<C3370b> sparseArray = new SparseArray<>();
            f9536I = sparseArray;
            sparseArray.put(0, bVar);
            sparseArray.put(1, bVar2);
            sparseArray.put(2, bVar3);
            sparseArray.put(3, bVar4);
            sparseArray.put(4, bVar5);
            sparseArray.put(5, bVar6);
            sparseArray.put(6, bVar7);
            sparseArray.put(7, bVar8);
            sparseArray.put(8, bVar9);
            sparseArray.put(9, bVar10);
            sparseArray.put(10, bVar11);
            sparseArray.put(11, bVar12);
            sparseArray.put(12, bVar20);
            sparseArray.put(13, bVar13);
            sparseArray.put(14, bVar14);
            sparseArray.put(15, bVar15);
            sparseArray.put(16, bVar16);
            sparseArray.put(17, bVar17);
            sparseArray.put(18, bVar18);
            sparseArray.put(19, bVar19);
        }

        private C3370b(int i) {
            this.f9551K = i;
        }

        /* renamed from: e */
        public static C3370b m13232e(int i) {
            return f9536I.get(i);
        }

        /* renamed from: g */
        public int mo10947g() {
            return this.f9551K;
        }
    }

    /* renamed from: com.google.android.datatransport.cct.f.o$c */
    public enum C3371c {
        MOBILE(0),
        WIFI(1),
        MOBILE_MMS(2),
        MOBILE_SUPL(3),
        MOBILE_DUN(4),
        MOBILE_HIPRI(5),
        WIMAX(6),
        BLUETOOTH(7),
        DUMMY(8),
        ETHERNET(9),
        MOBILE_FOTA(10),
        MOBILE_IMS(11),
        MOBILE_CBS(12),
        WIFI_P2P(13),
        MOBILE_IA(14),
        MOBILE_EMERGENCY(15),
        PROXY(16),
        VPN(17),
        NONE(-1);
        

        /* renamed from: G */
        private static final SparseArray<C3371c> f9558G = null;

        /* renamed from: I */
        private final int f9573I;

        static {
            C3371c cVar;
            C3371c cVar2;
            C3371c cVar3;
            C3371c cVar4;
            C3371c cVar5;
            C3371c cVar6;
            C3371c cVar7;
            C3371c cVar8;
            C3371c cVar9;
            C3371c cVar10;
            C3371c cVar11;
            C3371c cVar12;
            C3371c cVar13;
            C3371c cVar14;
            C3371c cVar15;
            C3371c cVar16;
            C3371c cVar17;
            C3371c cVar18;
            C3371c cVar19;
            SparseArray<C3371c> sparseArray = new SparseArray<>();
            f9558G = sparseArray;
            sparseArray.put(0, cVar);
            sparseArray.put(1, cVar2);
            sparseArray.put(2, cVar3);
            sparseArray.put(3, cVar4);
            sparseArray.put(4, cVar5);
            sparseArray.put(5, cVar6);
            sparseArray.put(6, cVar7);
            sparseArray.put(7, cVar8);
            sparseArray.put(8, cVar9);
            sparseArray.put(9, cVar10);
            sparseArray.put(10, cVar11);
            sparseArray.put(11, cVar12);
            sparseArray.put(12, cVar19);
            sparseArray.put(13, cVar13);
            sparseArray.put(14, cVar14);
            sparseArray.put(15, cVar15);
            sparseArray.put(16, cVar16);
            sparseArray.put(17, cVar18);
            sparseArray.put(-1, cVar17);
        }

        private C3371c(int i) {
            this.f9573I = i;
        }

        /* renamed from: e */
        public static C3371c m13234e(int i) {
            return f9558G.get(i);
        }

        /* renamed from: g */
        public int mo10948g() {
            return this.f9573I;
        }
    }

    /* renamed from: a */
    public static C3369a m13226a() {
        return new C3356i.C3358b();
    }

    /* renamed from: b */
    public abstract C3370b mo10937b();

    /* renamed from: c */
    public abstract C3371c mo10938c();
}
