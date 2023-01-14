package p455g.p470y.p472d;

import p455g.p457b0.C10250b;
import p455g.p457b0.C10255g;
import p455g.p457b0.C10259i;

/* renamed from: g.y.d.n */
public abstract class C10459n extends C10461p implements C10255g {
    public C10459n() {
    }

    public C10459n(Object obj) {
        super(obj);
    }

    public C10459n(Object obj, Class cls, String str, String str2, int i) {
        super(obj, cls, str, str2, i);
    }

    /* access modifiers changed from: protected */
    public C10250b computeReflected() {
        return C10468w.m35337d(this);
    }

    public Object getDelegate() {
        return ((C10255g) getReflected()).getDelegate();
    }

    public C10259i.C10260a getGetter() {
        return ((C10255g) getReflected()).getGetter();
    }

    public C10255g.C10256a getSetter() {
        return ((C10255g) getReflected()).getSetter();
    }

    public Object invoke() {
        return get();
    }
}
