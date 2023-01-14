package p174e.p319f.p416e.p436x.p437b;

import p174e.p319f.p416e.p420s.C9680b;

/* renamed from: e.f.e.x.b.c */
enum C9786c {
    DATA_MASK_000 {
        /* access modifiers changed from: package-private */
        /* renamed from: e */
        public boolean mo24516e(int i, int i2) {
            return ((i + i2) & 1) == 0;
        }
    },
    DATA_MASK_001 {
        /* access modifiers changed from: package-private */
        /* renamed from: e */
        public boolean mo24516e(int i, int i2) {
            return (i & 1) == 0;
        }
    },
    DATA_MASK_010 {
        /* access modifiers changed from: package-private */
        /* renamed from: e */
        public boolean mo24516e(int i, int i2) {
            return i2 % 3 == 0;
        }
    },
    DATA_MASK_011 {
        /* access modifiers changed from: package-private */
        /* renamed from: e */
        public boolean mo24516e(int i, int i2) {
            return (i + i2) % 3 == 0;
        }
    },
    DATA_MASK_100 {
        /* access modifiers changed from: package-private */
        /* renamed from: e */
        public boolean mo24516e(int i, int i2) {
            return (((i / 2) + (i2 / 3)) & 1) == 0;
        }
    },
    DATA_MASK_101 {
        /* access modifiers changed from: package-private */
        /* renamed from: e */
        public boolean mo24516e(int i, int i2) {
            return (i * i2) % 6 == 0;
        }
    },
    DATA_MASK_110 {
        /* access modifiers changed from: package-private */
        /* renamed from: e */
        public boolean mo24516e(int i, int i2) {
            return (i * i2) % 6 < 3;
        }
    },
    DATA_MASK_111 {
        /* access modifiers changed from: package-private */
        /* renamed from: e */
        public boolean mo24516e(int i, int i2) {
            return (((i + i2) + ((i * i2) % 3)) & 1) == 0;
        }
    };

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public abstract boolean mo24516e(int i, int i2);

    /* access modifiers changed from: package-private */
    /* renamed from: g */
    public final void mo24517g(C9680b bVar, int i) {
        for (int i2 = 0; i2 < i; i2++) {
            for (int i3 = 0; i3 < i; i3++) {
                if (mo24516e(i2, i3)) {
                    bVar.mo24262e(i3, i2);
                }
            }
        }
    }
}
