package p027c.p064i.p072j;

import android.view.View;
import android.view.ViewGroup;
import java.util.Iterator;
import p455g.p458c0.C10268d;
import p455g.p470y.p472d.C10457l;
import p455g.p470y.p472d.p473b0.C10445a;

/* renamed from: c.i.j.w */
public final class C2004w {

    /* renamed from: c.i.j.w$a */
    public static final class C2005a implements C10268d<View> {

        /* renamed from: a */
        final /* synthetic */ ViewGroup f5777a;

        C2005a(ViewGroup viewGroup) {
            this.f5777a = viewGroup;
        }

        public Iterator<View> iterator() {
            return C2004w.m8476b(this.f5777a);
        }
    }

    /* renamed from: c.i.j.w$b */
    public static final class C2006b implements Iterator<View>, C10445a {

        /* renamed from: f */
        private int f5778f;

        /* renamed from: o */
        final /* synthetic */ ViewGroup f5779o;

        C2006b(ViewGroup viewGroup) {
            this.f5779o = viewGroup;
        }

        /* renamed from: b */
        public View next() {
            ViewGroup viewGroup = this.f5779o;
            int i = this.f5778f;
            this.f5778f = i + 1;
            View childAt = viewGroup.getChildAt(i);
            if (childAt != null) {
                return childAt;
            }
            throw new IndexOutOfBoundsException();
        }

        public boolean hasNext() {
            return this.f5778f < this.f5779o.getChildCount();
        }

        public void remove() {
            ViewGroup viewGroup = this.f5779o;
            int i = this.f5778f - 1;
            this.f5778f = i;
            viewGroup.removeViewAt(i);
        }
    }

    /* renamed from: a */
    public static final C10268d<View> m8475a(ViewGroup viewGroup) {
        C10457l.m35320e(viewGroup, "<this>");
        return new C2005a(viewGroup);
    }

    /* renamed from: b */
    public static final Iterator<View> m8476b(ViewGroup viewGroup) {
        C10457l.m35320e(viewGroup, "<this>");
        return new C2006b(viewGroup);
    }
}
