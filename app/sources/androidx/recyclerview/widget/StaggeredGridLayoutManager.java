package androidx.recyclerview.widget;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.PointF;
import android.graphics.Rect;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import androidx.recyclerview.widget.RecyclerView;
import com.lwansbrough.RCTCamera.RCTCameraModule;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.BitSet;
import java.util.List;
import p027c.p064i.p072j.p073g0.C1955c;

public class StaggeredGridLayoutManager extends RecyclerView.C1342o implements RecyclerView.C1359z.C1361b {

    /* renamed from: A */
    boolean f3931A = false;

    /* renamed from: B */
    private BitSet f3932B;

    /* renamed from: C */
    int f3933C = -1;

    /* renamed from: D */
    int f3934D = RecyclerView.UNDEFINED_DURATION;

    /* renamed from: E */
    C1365d f3935E = new C1365d();

    /* renamed from: F */
    private int f3936F = 2;

    /* renamed from: G */
    private boolean f3937G;

    /* renamed from: H */
    private boolean f3938H;

    /* renamed from: I */
    private C1368e f3939I;

    /* renamed from: J */
    private int f3940J;

    /* renamed from: K */
    private final Rect f3941K = new Rect();

    /* renamed from: L */
    private final C1363b f3942L = new C1363b();

    /* renamed from: M */
    private boolean f3943M = false;

    /* renamed from: N */
    private boolean f3944N = true;

    /* renamed from: O */
    private int[] f3945O;

    /* renamed from: P */
    private final Runnable f3946P = new C1362a();

    /* renamed from: s */
    private int f3947s = -1;

    /* renamed from: t */
    C1370f[] f3948t;

    /* renamed from: u */
    C1402j f3949u;

    /* renamed from: v */
    C1402j f3950v;

    /* renamed from: w */
    private int f3951w;

    /* renamed from: x */
    private int f3952x;

    /* renamed from: y */
    private final C1397f f3953y;

    /* renamed from: z */
    boolean f3954z = false;

    /* renamed from: androidx.recyclerview.widget.StaggeredGridLayoutManager$a */
    class C1362a implements Runnable {
        C1362a() {
        }

        public void run() {
            StaggeredGridLayoutManager.this.mo5010S1();
        }
    }

    /* renamed from: androidx.recyclerview.widget.StaggeredGridLayoutManager$b */
    class C1363b {

        /* renamed from: a */
        int f3956a;

        /* renamed from: b */
        int f3957b;

        /* renamed from: c */
        boolean f3958c;

        /* renamed from: d */
        boolean f3959d;

        /* renamed from: e */
        boolean f3960e;

        /* renamed from: f */
        int[] f3961f;

        C1363b() {
            mo5023c();
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public void mo5021a() {
            this.f3957b = this.f3958c ? StaggeredGridLayoutManager.this.f3949u.mo5193i() : StaggeredGridLayoutManager.this.f3949u.mo5197m();
        }

        /* access modifiers changed from: package-private */
        /* renamed from: b */
        public void mo5022b(int i) {
            this.f3957b = this.f3958c ? StaggeredGridLayoutManager.this.f3949u.mo5193i() - i : StaggeredGridLayoutManager.this.f3949u.mo5197m() + i;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: c */
        public void mo5023c() {
            this.f3956a = -1;
            this.f3957b = RecyclerView.UNDEFINED_DURATION;
            this.f3958c = false;
            this.f3959d = false;
            this.f3960e = false;
            int[] iArr = this.f3961f;
            if (iArr != null) {
                Arrays.fill(iArr, -1);
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: d */
        public void mo5024d(C1370f[] fVarArr) {
            int length = fVarArr.length;
            int[] iArr = this.f3961f;
            if (iArr == null || iArr.length < length) {
                this.f3961f = new int[StaggeredGridLayoutManager.this.f3948t.length];
            }
            for (int i = 0; i < length; i++) {
                this.f3961f[i] = fVarArr[i].mo5070p(RecyclerView.UNDEFINED_DURATION);
            }
        }
    }

    /* renamed from: androidx.recyclerview.widget.StaggeredGridLayoutManager$c */
    public static class C1364c extends RecyclerView.C1347p {

        /* renamed from: e */
        C1370f f3963e;

        /* renamed from: f */
        boolean f3964f;

        public C1364c(int i, int i2) {
            super(i, i2);
        }

        public C1364c(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }

        public C1364c(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
        }

        public C1364c(ViewGroup.MarginLayoutParams marginLayoutParams) {
            super(marginLayoutParams);
        }

        /* renamed from: e */
        public final int mo5025e() {
            C1370f fVar = this.f3963e;
            if (fVar == null) {
                return -1;
            }
            return fVar.f3985e;
        }

        /* renamed from: f */
        public boolean mo5026f() {
            return this.f3964f;
        }
    }

    /* renamed from: androidx.recyclerview.widget.StaggeredGridLayoutManager$d */
    static class C1365d {

        /* renamed from: a */
        int[] f3965a;

        /* renamed from: b */
        List<C1366a> f3966b;

        @SuppressLint({"BanParcelableUsage"})
        /* renamed from: androidx.recyclerview.widget.StaggeredGridLayoutManager$d$a */
        static class C1366a implements Parcelable {
            public static final Parcelable.Creator<C1366a> CREATOR = new C1367a();

            /* renamed from: f */
            int f3967f;

            /* renamed from: o */
            int f3968o;

            /* renamed from: p */
            int[] f3969p;

            /* renamed from: q */
            boolean f3970q;

            /* renamed from: androidx.recyclerview.widget.StaggeredGridLayoutManager$d$a$a */
            static class C1367a implements Parcelable.Creator<C1366a> {
                C1367a() {
                }

                /* renamed from: a */
                public C1366a createFromParcel(Parcel parcel) {
                    return new C1366a(parcel);
                }

                /* renamed from: b */
                public C1366a[] newArray(int i) {
                    return new C1366a[i];
                }
            }

            C1366a() {
            }

            C1366a(Parcel parcel) {
                this.f3967f = parcel.readInt();
                this.f3968o = parcel.readInt();
                this.f3970q = parcel.readInt() != 1 ? false : true;
                int readInt = parcel.readInt();
                if (readInt > 0) {
                    int[] iArr = new int[readInt];
                    this.f3969p = iArr;
                    parcel.readIntArray(iArr);
                }
            }

            /* access modifiers changed from: package-private */
            /* renamed from: a */
            public int mo5039a(int i) {
                int[] iArr = this.f3969p;
                if (iArr == null) {
                    return 0;
                }
                return iArr[i];
            }

            public int describeContents() {
                return 0;
            }

            public String toString() {
                return "FullSpanItem{mPosition=" + this.f3967f + ", mGapDir=" + this.f3968o + ", mHasUnwantedGapAfter=" + this.f3970q + ", mGapPerSpan=" + Arrays.toString(this.f3969p) + '}';
            }

            public void writeToParcel(Parcel parcel, int i) {
                parcel.writeInt(this.f3967f);
                parcel.writeInt(this.f3968o);
                parcel.writeInt(this.f3970q ? 1 : 0);
                int[] iArr = this.f3969p;
                if (iArr == null || iArr.length <= 0) {
                    parcel.writeInt(0);
                    return;
                }
                parcel.writeInt(iArr.length);
                parcel.writeIntArray(this.f3969p);
            }
        }

        C1365d() {
        }

        /* renamed from: i */
        private int m6007i(int i) {
            if (this.f3966b == null) {
                return -1;
            }
            C1366a f = mo5032f(i);
            if (f != null) {
                this.f3966b.remove(f);
            }
            int size = this.f3966b.size();
            int i2 = 0;
            while (true) {
                if (i2 >= size) {
                    i2 = -1;
                    break;
                } else if (this.f3966b.get(i2).f3967f >= i) {
                    break;
                } else {
                    i2++;
                }
            }
            if (i2 == -1) {
                return -1;
            }
            this.f3966b.remove(i2);
            return this.f3966b.get(i2).f3967f;
        }

        /* renamed from: l */
        private void m6008l(int i, int i2) {
            List<C1366a> list = this.f3966b;
            if (list != null) {
                for (int size = list.size() - 1; size >= 0; size--) {
                    C1366a aVar = this.f3966b.get(size);
                    int i3 = aVar.f3967f;
                    if (i3 >= i) {
                        aVar.f3967f = i3 + i2;
                    }
                }
            }
        }

        /* renamed from: m */
        private void m6009m(int i, int i2) {
            List<C1366a> list = this.f3966b;
            if (list != null) {
                int i3 = i + i2;
                for (int size = list.size() - 1; size >= 0; size--) {
                    C1366a aVar = this.f3966b.get(size);
                    int i4 = aVar.f3967f;
                    if (i4 >= i) {
                        if (i4 < i3) {
                            this.f3966b.remove(size);
                        } else {
                            aVar.f3967f = i4 - i2;
                        }
                    }
                }
            }
        }

        /* renamed from: a */
        public void mo5027a(C1366a aVar) {
            if (this.f3966b == null) {
                this.f3966b = new ArrayList();
            }
            int size = this.f3966b.size();
            for (int i = 0; i < size; i++) {
                C1366a aVar2 = this.f3966b.get(i);
                if (aVar2.f3967f == aVar.f3967f) {
                    this.f3966b.remove(i);
                }
                if (aVar2.f3967f >= aVar.f3967f) {
                    this.f3966b.add(i, aVar);
                    return;
                }
            }
            this.f3966b.add(aVar);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: b */
        public void mo5028b() {
            int[] iArr = this.f3965a;
            if (iArr != null) {
                Arrays.fill(iArr, -1);
            }
            this.f3966b = null;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: c */
        public void mo5029c(int i) {
            int[] iArr = this.f3965a;
            if (iArr == null) {
                int[] iArr2 = new int[(Math.max(i, 10) + 1)];
                this.f3965a = iArr2;
                Arrays.fill(iArr2, -1);
            } else if (i >= iArr.length) {
                int[] iArr3 = new int[mo5038o(i)];
                this.f3965a = iArr3;
                System.arraycopy(iArr, 0, iArr3, 0, iArr.length);
                int[] iArr4 = this.f3965a;
                Arrays.fill(iArr4, iArr.length, iArr4.length, -1);
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: d */
        public int mo5030d(int i) {
            List<C1366a> list = this.f3966b;
            if (list != null) {
                for (int size = list.size() - 1; size >= 0; size--) {
                    if (this.f3966b.get(size).f3967f >= i) {
                        this.f3966b.remove(size);
                    }
                }
            }
            return mo5034h(i);
        }

        /* renamed from: e */
        public C1366a mo5031e(int i, int i2, int i3, boolean z) {
            List<C1366a> list = this.f3966b;
            if (list == null) {
                return null;
            }
            int size = list.size();
            for (int i4 = 0; i4 < size; i4++) {
                C1366a aVar = this.f3966b.get(i4);
                int i5 = aVar.f3967f;
                if (i5 >= i2) {
                    return null;
                }
                if (i5 >= i && (i3 == 0 || aVar.f3968o == i3 || (z && aVar.f3970q))) {
                    return aVar;
                }
            }
            return null;
        }

        /* renamed from: f */
        public C1366a mo5032f(int i) {
            List<C1366a> list = this.f3966b;
            if (list == null) {
                return null;
            }
            for (int size = list.size() - 1; size >= 0; size--) {
                C1366a aVar = this.f3966b.get(size);
                if (aVar.f3967f == i) {
                    return aVar;
                }
            }
            return null;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: g */
        public int mo5033g(int i) {
            int[] iArr = this.f3965a;
            if (iArr == null || i >= iArr.length) {
                return -1;
            }
            return iArr[i];
        }

        /* access modifiers changed from: package-private */
        /* renamed from: h */
        public int mo5034h(int i) {
            int[] iArr = this.f3965a;
            if (iArr == null || i >= iArr.length) {
                return -1;
            }
            int i2 = m6007i(i);
            if (i2 == -1) {
                int[] iArr2 = this.f3965a;
                Arrays.fill(iArr2, i, iArr2.length, -1);
                return this.f3965a.length;
            }
            int i3 = i2 + 1;
            Arrays.fill(this.f3965a, i, i3, -1);
            return i3;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: j */
        public void mo5035j(int i, int i2) {
            int[] iArr = this.f3965a;
            if (iArr != null && i < iArr.length) {
                int i3 = i + i2;
                mo5029c(i3);
                int[] iArr2 = this.f3965a;
                System.arraycopy(iArr2, i, iArr2, i3, (iArr2.length - i) - i2);
                Arrays.fill(this.f3965a, i, i3, -1);
                m6008l(i, i2);
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: k */
        public void mo5036k(int i, int i2) {
            int[] iArr = this.f3965a;
            if (iArr != null && i < iArr.length) {
                int i3 = i + i2;
                mo5029c(i3);
                int[] iArr2 = this.f3965a;
                System.arraycopy(iArr2, i3, iArr2, i, (iArr2.length - i) - i2);
                int[] iArr3 = this.f3965a;
                Arrays.fill(iArr3, iArr3.length - i2, iArr3.length, -1);
                m6009m(i, i2);
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: n */
        public void mo5037n(int i, C1370f fVar) {
            mo5029c(i);
            this.f3965a[i] = fVar.f3985e;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: o */
        public int mo5038o(int i) {
            int length = this.f3965a.length;
            while (length <= i) {
                length *= 2;
            }
            return length;
        }
    }

    @SuppressLint({"BanParcelableUsage"})
    /* renamed from: androidx.recyclerview.widget.StaggeredGridLayoutManager$e */
    public static class C1368e implements Parcelable {
        public static final Parcelable.Creator<C1368e> CREATOR = new C1369a();

        /* renamed from: f */
        int f3971f;

        /* renamed from: o */
        int f3972o;

        /* renamed from: p */
        int f3973p;

        /* renamed from: q */
        int[] f3974q;

        /* renamed from: r */
        int f3975r;

        /* renamed from: s */
        int[] f3976s;

        /* renamed from: t */
        List<C1365d.C1366a> f3977t;

        /* renamed from: u */
        boolean f3978u;

        /* renamed from: v */
        boolean f3979v;

        /* renamed from: w */
        boolean f3980w;

        /* renamed from: androidx.recyclerview.widget.StaggeredGridLayoutManager$e$a */
        static class C1369a implements Parcelable.Creator<C1368e> {
            C1369a() {
            }

            /* renamed from: a */
            public C1368e createFromParcel(Parcel parcel) {
                return new C1368e(parcel);
            }

            /* renamed from: b */
            public C1368e[] newArray(int i) {
                return new C1368e[i];
            }
        }

        public C1368e() {
        }

        C1368e(Parcel parcel) {
            this.f3971f = parcel.readInt();
            this.f3972o = parcel.readInt();
            int readInt = parcel.readInt();
            this.f3973p = readInt;
            if (readInt > 0) {
                int[] iArr = new int[readInt];
                this.f3974q = iArr;
                parcel.readIntArray(iArr);
            }
            int readInt2 = parcel.readInt();
            this.f3975r = readInt2;
            if (readInt2 > 0) {
                int[] iArr2 = new int[readInt2];
                this.f3976s = iArr2;
                parcel.readIntArray(iArr2);
            }
            boolean z = false;
            this.f3978u = parcel.readInt() == 1;
            this.f3979v = parcel.readInt() == 1;
            this.f3980w = parcel.readInt() == 1 ? true : z;
            this.f3977t = parcel.readArrayList(C1365d.C1366a.class.getClassLoader());
        }

        public C1368e(C1368e eVar) {
            this.f3973p = eVar.f3973p;
            this.f3971f = eVar.f3971f;
            this.f3972o = eVar.f3972o;
            this.f3974q = eVar.f3974q;
            this.f3975r = eVar.f3975r;
            this.f3976s = eVar.f3976s;
            this.f3978u = eVar.f3978u;
            this.f3979v = eVar.f3979v;
            this.f3980w = eVar.f3980w;
            this.f3977t = eVar.f3977t;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public void mo5047a() {
            this.f3974q = null;
            this.f3973p = 0;
            this.f3971f = -1;
            this.f3972o = -1;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: b */
        public void mo5048b() {
            this.f3974q = null;
            this.f3973p = 0;
            this.f3975r = 0;
            this.f3976s = null;
            this.f3977t = null;
        }

        public int describeContents() {
            return 0;
        }

        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeInt(this.f3971f);
            parcel.writeInt(this.f3972o);
            parcel.writeInt(this.f3973p);
            if (this.f3973p > 0) {
                parcel.writeIntArray(this.f3974q);
            }
            parcel.writeInt(this.f3975r);
            if (this.f3975r > 0) {
                parcel.writeIntArray(this.f3976s);
            }
            parcel.writeInt(this.f3978u ? 1 : 0);
            parcel.writeInt(this.f3979v ? 1 : 0);
            parcel.writeInt(this.f3980w ? 1 : 0);
            parcel.writeList(this.f3977t);
        }
    }

    /* renamed from: androidx.recyclerview.widget.StaggeredGridLayoutManager$f */
    class C1370f {

        /* renamed from: a */
        ArrayList<View> f3981a = new ArrayList<>();

        /* renamed from: b */
        int f3982b = RecyclerView.UNDEFINED_DURATION;

        /* renamed from: c */
        int f3983c = RecyclerView.UNDEFINED_DURATION;

        /* renamed from: d */
        int f3984d = 0;

        /* renamed from: e */
        final int f3985e;

        C1370f(int i) {
            this.f3985e = i;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public void mo5055a(View view) {
            C1364c n = mo5068n(view);
            n.f3963e = this;
            this.f3981a.add(view);
            this.f3983c = RecyclerView.UNDEFINED_DURATION;
            if (this.f3981a.size() == 1) {
                this.f3982b = RecyclerView.UNDEFINED_DURATION;
            }
            if (n.mo4915c() || n.mo4914b()) {
                this.f3984d += StaggeredGridLayoutManager.this.f3949u.mo5189e(view);
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: b */
        public void mo5056b(boolean z, int i) {
            int l = z ? mo5066l(RecyclerView.UNDEFINED_DURATION) : mo5070p(RecyclerView.UNDEFINED_DURATION);
            mo5059e();
            if (l != Integer.MIN_VALUE) {
                if (z && l < StaggeredGridLayoutManager.this.f3949u.mo5193i()) {
                    return;
                }
                if (z || l <= StaggeredGridLayoutManager.this.f3949u.mo5197m()) {
                    if (i != Integer.MIN_VALUE) {
                        l += i;
                    }
                    this.f3983c = l;
                    this.f3982b = l;
                }
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: c */
        public void mo5057c() {
            C1365d.C1366a f;
            ArrayList<View> arrayList = this.f3981a;
            View view = arrayList.get(arrayList.size() - 1);
            C1364c n = mo5068n(view);
            this.f3983c = StaggeredGridLayoutManager.this.f3949u.mo5188d(view);
            if (n.f3964f && (f = StaggeredGridLayoutManager.this.f3935E.mo5032f(n.mo4913a())) != null && f.f3968o == 1) {
                this.f3983c += f.mo5039a(this.f3985e);
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: d */
        public void mo5058d() {
            C1365d.C1366a f;
            View view = this.f3981a.get(0);
            C1364c n = mo5068n(view);
            this.f3982b = StaggeredGridLayoutManager.this.f3949u.mo5191g(view);
            if (n.f3964f && (f = StaggeredGridLayoutManager.this.f3935E.mo5032f(n.mo4913a())) != null && f.f3968o == -1) {
                this.f3982b -= f.mo5039a(this.f3985e);
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: e */
        public void mo5059e() {
            this.f3981a.clear();
            mo5071q();
            this.f3984d = 0;
        }

        /* renamed from: f */
        public int mo5060f() {
            int i;
            int i2;
            if (StaggeredGridLayoutManager.this.f3954z) {
                i2 = this.f3981a.size() - 1;
                i = -1;
            } else {
                i2 = 0;
                i = this.f3981a.size();
            }
            return mo5063i(i2, i, true);
        }

        /* renamed from: g */
        public int mo5061g() {
            int i;
            int i2;
            if (StaggeredGridLayoutManager.this.f3954z) {
                i2 = 0;
                i = this.f3981a.size();
            } else {
                i2 = this.f3981a.size() - 1;
                i = -1;
            }
            return mo5063i(i2, i, true);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: h */
        public int mo5062h(int i, int i2, boolean z, boolean z2, boolean z3) {
            int m = StaggeredGridLayoutManager.this.f3949u.mo5197m();
            int i3 = StaggeredGridLayoutManager.this.f3949u.mo5193i();
            int i4 = i2 > i ? 1 : -1;
            while (i != i2) {
                View view = this.f3981a.get(i);
                int g = StaggeredGridLayoutManager.this.f3949u.mo5191g(view);
                int d = StaggeredGridLayoutManager.this.f3949u.mo5188d(view);
                boolean z4 = false;
                boolean z5 = !z3 ? g < i3 : g <= i3;
                if (!z3 ? d > m : d >= m) {
                    z4 = true;
                }
                if (z5 && z4) {
                    if (!z || !z2) {
                        if (!z2 && g >= m && d <= i3) {
                        }
                    } else if (g >= m && d <= i3) {
                    }
                    return StaggeredGridLayoutManager.this.mo4873h0(view);
                }
                i += i4;
            }
            return -1;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: i */
        public int mo5063i(int i, int i2, boolean z) {
            return mo5062h(i, i2, false, false, z);
        }

        /* renamed from: j */
        public int mo5064j() {
            return this.f3984d;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: k */
        public int mo5065k() {
            int i = this.f3983c;
            if (i != Integer.MIN_VALUE) {
                return i;
            }
            mo5057c();
            return this.f3983c;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: l */
        public int mo5066l(int i) {
            int i2 = this.f3983c;
            if (i2 != Integer.MIN_VALUE) {
                return i2;
            }
            if (this.f3981a.size() == 0) {
                return i;
            }
            mo5057c();
            return this.f3983c;
        }

        /* renamed from: m */
        public View mo5067m(int i, int i2) {
            View view = null;
            if (i2 != -1) {
                int size = this.f3981a.size() - 1;
                while (size >= 0) {
                    View view2 = this.f3981a.get(size);
                    StaggeredGridLayoutManager staggeredGridLayoutManager = StaggeredGridLayoutManager.this;
                    if (staggeredGridLayoutManager.f3954z && staggeredGridLayoutManager.mo4873h0(view2) >= i) {
                        break;
                    }
                    StaggeredGridLayoutManager staggeredGridLayoutManager2 = StaggeredGridLayoutManager.this;
                    if ((!staggeredGridLayoutManager2.f3954z && staggeredGridLayoutManager2.mo4873h0(view2) <= i) || !view2.hasFocusable()) {
                        break;
                    }
                    size--;
                    view = view2;
                }
            } else {
                int size2 = this.f3981a.size();
                int i3 = 0;
                while (i3 < size2) {
                    View view3 = this.f3981a.get(i3);
                    StaggeredGridLayoutManager staggeredGridLayoutManager3 = StaggeredGridLayoutManager.this;
                    if (staggeredGridLayoutManager3.f3954z && staggeredGridLayoutManager3.mo4873h0(view3) <= i) {
                        break;
                    }
                    StaggeredGridLayoutManager staggeredGridLayoutManager4 = StaggeredGridLayoutManager.this;
                    if ((!staggeredGridLayoutManager4.f3954z && staggeredGridLayoutManager4.mo4873h0(view3) >= i) || !view3.hasFocusable()) {
                        break;
                    }
                    i3++;
                    view = view3;
                }
            }
            return view;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: n */
        public C1364c mo5068n(View view) {
            return (C1364c) view.getLayoutParams();
        }

        /* access modifiers changed from: package-private */
        /* renamed from: o */
        public int mo5069o() {
            int i = this.f3982b;
            if (i != Integer.MIN_VALUE) {
                return i;
            }
            mo5058d();
            return this.f3982b;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: p */
        public int mo5070p(int i) {
            int i2 = this.f3982b;
            if (i2 != Integer.MIN_VALUE) {
                return i2;
            }
            if (this.f3981a.size() == 0) {
                return i;
            }
            mo5058d();
            return this.f3982b;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: q */
        public void mo5071q() {
            this.f3982b = RecyclerView.UNDEFINED_DURATION;
            this.f3983c = RecyclerView.UNDEFINED_DURATION;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: r */
        public void mo5072r(int i) {
            int i2 = this.f3982b;
            if (i2 != Integer.MIN_VALUE) {
                this.f3982b = i2 + i;
            }
            int i3 = this.f3983c;
            if (i3 != Integer.MIN_VALUE) {
                this.f3983c = i3 + i;
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: s */
        public void mo5073s() {
            int size = this.f3981a.size();
            View remove = this.f3981a.remove(size - 1);
            C1364c n = mo5068n(remove);
            n.f3963e = null;
            if (n.mo4915c() || n.mo4914b()) {
                this.f3984d -= StaggeredGridLayoutManager.this.f3949u.mo5189e(remove);
            }
            if (size == 1) {
                this.f3982b = RecyclerView.UNDEFINED_DURATION;
            }
            this.f3983c = RecyclerView.UNDEFINED_DURATION;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: t */
        public void mo5074t() {
            View remove = this.f3981a.remove(0);
            C1364c n = mo5068n(remove);
            n.f3963e = null;
            if (this.f3981a.size() == 0) {
                this.f3983c = RecyclerView.UNDEFINED_DURATION;
            }
            if (n.mo4915c() || n.mo4914b()) {
                this.f3984d -= StaggeredGridLayoutManager.this.f3949u.mo5189e(remove);
            }
            this.f3982b = RecyclerView.UNDEFINED_DURATION;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: u */
        public void mo5075u(View view) {
            C1364c n = mo5068n(view);
            n.f3963e = this;
            this.f3981a.add(0, view);
            this.f3982b = RecyclerView.UNDEFINED_DURATION;
            if (this.f3981a.size() == 1) {
                this.f3983c = RecyclerView.UNDEFINED_DURATION;
            }
            if (n.mo4915c() || n.mo4914b()) {
                this.f3984d += StaggeredGridLayoutManager.this.f3949u.mo5189e(view);
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: v */
        public void mo5076v(int i) {
            this.f3982b = i;
            this.f3983c = i;
        }
    }

    public StaggeredGridLayoutManager(Context context, AttributeSet attributeSet, int i, int i2) {
        RecyclerView.C1342o.C1346d i0 = RecyclerView.C1342o.m5661i0(context, attributeSet, i, i2);
        mo5002H2(i0.f3891a);
        mo5004J2(i0.f3892b);
        mo5003I2(i0.f3893c);
        this.f3953y = new C1397f();
        m5925a2();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0010, code lost:
        if (r4.f4110e == -1) goto L_0x0012;
     */
    /* renamed from: A2 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void m5903A2(androidx.recyclerview.widget.RecyclerView.C1354v r3, androidx.recyclerview.widget.C1397f r4) {
        /*
            r2 = this;
            boolean r0 = r4.f4106a
            if (r0 == 0) goto L_0x004d
            boolean r0 = r4.f4114i
            if (r0 == 0) goto L_0x0009
            goto L_0x004d
        L_0x0009:
            int r0 = r4.f4107b
            r1 = -1
            if (r0 != 0) goto L_0x001e
            int r0 = r4.f4110e
            if (r0 != r1) goto L_0x0018
        L_0x0012:
            int r4 = r4.f4112g
        L_0x0014:
            r2.m5904B2(r3, r4)
            goto L_0x004d
        L_0x0018:
            int r4 = r4.f4111f
        L_0x001a:
            r2.m5905C2(r3, r4)
            goto L_0x004d
        L_0x001e:
            int r0 = r4.f4110e
            if (r0 != r1) goto L_0x0037
            int r0 = r4.f4111f
            int r1 = r2.m5932m2(r0)
            int r0 = r0 - r1
            if (r0 >= 0) goto L_0x002c
            goto L_0x0012
        L_0x002c:
            int r1 = r4.f4112g
            int r4 = r4.f4107b
            int r4 = java.lang.Math.min(r0, r4)
            int r4 = r1 - r4
            goto L_0x0014
        L_0x0037:
            int r0 = r4.f4112g
            int r0 = r2.m5933n2(r0)
            int r1 = r4.f4112g
            int r0 = r0 - r1
            if (r0 >= 0) goto L_0x0043
            goto L_0x0018
        L_0x0043:
            int r1 = r4.f4111f
            int r4 = r4.f4107b
            int r4 = java.lang.Math.min(r0, r4)
            int r4 = r4 + r1
            goto L_0x001a
        L_0x004d:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.StaggeredGridLayoutManager.m5903A2(androidx.recyclerview.widget.RecyclerView$v, androidx.recyclerview.widget.f):void");
    }

    /* renamed from: B2 */
    private void m5904B2(RecyclerView.C1354v vVar, int i) {
        int J = mo4833J() - 1;
        while (J >= 0) {
            View I = mo4832I(J);
            if (this.f3949u.mo5191g(I) >= i && this.f3949u.mo5201q(I) >= i) {
                C1364c cVar = (C1364c) I.getLayoutParams();
                if (cVar.f3964f) {
                    int i2 = 0;
                    while (i2 < this.f3947s) {
                        if (this.f3948t[i2].f3981a.size() != 1) {
                            i2++;
                        } else {
                            return;
                        }
                    }
                    for (int i3 = 0; i3 < this.f3947s; i3++) {
                        this.f3948t[i3].mo5073s();
                    }
                } else if (cVar.f3963e.f3981a.size() != 1) {
                    cVar.f3963e.mo5073s();
                } else {
                    return;
                }
                mo4884m1(I, vVar);
                J--;
            } else {
                return;
            }
        }
    }

    /* renamed from: C2 */
    private void m5905C2(RecyclerView.C1354v vVar, int i) {
        while (mo4833J() > 0) {
            View I = mo4832I(0);
            if (this.f3949u.mo5188d(I) <= i && this.f3949u.mo5200p(I) <= i) {
                C1364c cVar = (C1364c) I.getLayoutParams();
                if (cVar.f3964f) {
                    int i2 = 0;
                    while (i2 < this.f3947s) {
                        if (this.f3948t[i2].f3981a.size() != 1) {
                            i2++;
                        } else {
                            return;
                        }
                    }
                    for (int i3 = 0; i3 < this.f3947s; i3++) {
                        this.f3948t[i3].mo5074t();
                    }
                } else if (cVar.f3963e.f3981a.size() != 1) {
                    cVar.f3963e.mo5074t();
                } else {
                    return;
                }
                mo4884m1(I, vVar);
            } else {
                return;
            }
        }
    }

    /* renamed from: D2 */
    private void m5906D2() {
        if (this.f3950v.mo5195k() != 1073741824) {
            float f = 0.0f;
            int J = mo4833J();
            for (int i = 0; i < J; i++) {
                View I = mo4832I(i);
                float e = (float) this.f3950v.mo5189e(I);
                if (e >= f) {
                    if (((C1364c) I.getLayoutParams()).mo5026f()) {
                        e = (e * 1.0f) / ((float) this.f3947s);
                    }
                    f = Math.max(f, e);
                }
            }
            int i2 = this.f3952x;
            int round = Math.round(f * ((float) this.f3947s));
            if (this.f3950v.mo5195k() == Integer.MIN_VALUE) {
                round = Math.min(round, this.f3950v.mo5198n());
            }
            mo5009P2(round);
            if (this.f3952x != i2) {
                for (int i3 = 0; i3 < J; i3++) {
                    View I2 = mo4832I(i3);
                    C1364c cVar = (C1364c) I2.getLayoutParams();
                    if (!cVar.f3964f) {
                        if (!mo5018t2() || this.f3951w != 1) {
                            int i4 = cVar.f3963e.f3985e;
                            int i5 = this.f3951w;
                            int i6 = (this.f3952x * i4) - (i4 * i2);
                            if (i5 == 1) {
                                I2.offsetLeftAndRight(i6);
                            } else {
                                I2.offsetTopAndBottom(i6);
                            }
                        } else {
                            int i7 = this.f3947s;
                            int i8 = cVar.f3963e.f3985e;
                            I2.offsetLeftAndRight(((-((i7 - 1) - i8)) * this.f3952x) - ((-((i7 - 1) - i8)) * i2));
                        }
                    }
                }
            }
        }
    }

    /* renamed from: E2 */
    private void m5907E2() {
        this.f3931A = (this.f3951w == 1 || !mo5018t2()) ? this.f3954z : !this.f3954z;
    }

    /* renamed from: G2 */
    private void m5908G2(int i) {
        C1397f fVar = this.f3953y;
        fVar.f4110e = i;
        int i2 = 1;
        if (this.f3931A != (i == -1)) {
            i2 = -1;
        }
        fVar.f4109d = i2;
    }

    /* renamed from: K2 */
    private void m5909K2(int i, int i2) {
        for (int i3 = 0; i3 < this.f3947s; i3++) {
            if (!this.f3948t[i3].f3981a.isEmpty()) {
                m5915Q2(this.f3948t[i3], i, i2);
            }
        }
    }

    /* renamed from: L2 */
    private boolean m5910L2(RecyclerView.C1322a0 a0Var, C1363b bVar) {
        boolean z = this.f3937G;
        int b = a0Var.mo4682b();
        bVar.f3956a = z ? m5928g2(b) : m5927c2(b);
        bVar.f3957b = RecyclerView.UNDEFINED_DURATION;
        return true;
    }

    /* renamed from: M1 */
    private void m5911M1(View view) {
        for (int i = this.f3947s - 1; i >= 0; i--) {
            this.f3948t[i].mo5055a(view);
        }
    }

    /* renamed from: N1 */
    private void m5912N1(C1363b bVar) {
        boolean z;
        C1368e eVar = this.f3939I;
        int i = eVar.f3973p;
        if (i > 0) {
            if (i == this.f3947s) {
                for (int i2 = 0; i2 < this.f3947s; i2++) {
                    this.f3948t[i2].mo5059e();
                    C1368e eVar2 = this.f3939I;
                    int i3 = eVar2.f3974q[i2];
                    if (i3 != Integer.MIN_VALUE) {
                        i3 += eVar2.f3979v ? this.f3949u.mo5193i() : this.f3949u.mo5197m();
                    }
                    this.f3948t[i2].mo5076v(i3);
                }
            } else {
                eVar.mo5048b();
                C1368e eVar3 = this.f3939I;
                eVar3.f3971f = eVar3.f3972o;
            }
        }
        C1368e eVar4 = this.f3939I;
        this.f3938H = eVar4.f3980w;
        mo5003I2(eVar4.f3978u);
        m5907E2();
        C1368e eVar5 = this.f3939I;
        int i4 = eVar5.f3971f;
        if (i4 != -1) {
            this.f3933C = i4;
            z = eVar5.f3979v;
        } else {
            z = this.f3931A;
        }
        bVar.f3958c = z;
        if (eVar5.f3975r > 1) {
            C1365d dVar = this.f3935E;
            dVar.f3965a = eVar5.f3976s;
            dVar.f3966b = eVar5.f3977t;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:15:0x0036  */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x004d  */
    /* renamed from: O2 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void m5913O2(int r5, androidx.recyclerview.widget.RecyclerView.C1322a0 r6) {
        /*
            r4 = this;
            androidx.recyclerview.widget.f r0 = r4.f3953y
            r1 = 0
            r0.f4107b = r1
            r0.f4108c = r5
            boolean r0 = r4.mo4902x0()
            r2 = 1
            if (r0 == 0) goto L_0x002e
            int r6 = r6.mo4683c()
            r0 = -1
            if (r6 == r0) goto L_0x002e
            boolean r0 = r4.f3931A
            if (r6 >= r5) goto L_0x001b
            r5 = 1
            goto L_0x001c
        L_0x001b:
            r5 = 0
        L_0x001c:
            if (r0 != r5) goto L_0x0025
            androidx.recyclerview.widget.j r5 = r4.f3949u
            int r5 = r5.mo5198n()
            goto L_0x002f
        L_0x0025:
            androidx.recyclerview.widget.j r5 = r4.f3949u
            int r5 = r5.mo5198n()
            r6 = r5
            r5 = 0
            goto L_0x0030
        L_0x002e:
            r5 = 0
        L_0x002f:
            r6 = 0
        L_0x0030:
            boolean r0 = r4.mo4837M()
            if (r0 == 0) goto L_0x004d
            androidx.recyclerview.widget.f r0 = r4.f3953y
            androidx.recyclerview.widget.j r3 = r4.f3949u
            int r3 = r3.mo5197m()
            int r3 = r3 - r6
            r0.f4111f = r3
            androidx.recyclerview.widget.f r6 = r4.f3953y
            androidx.recyclerview.widget.j r0 = r4.f3949u
            int r0 = r0.mo5193i()
            int r0 = r0 + r5
            r6.f4112g = r0
            goto L_0x005d
        L_0x004d:
            androidx.recyclerview.widget.f r0 = r4.f3953y
            androidx.recyclerview.widget.j r3 = r4.f3949u
            int r3 = r3.mo5192h()
            int r3 = r3 + r5
            r0.f4112g = r3
            androidx.recyclerview.widget.f r5 = r4.f3953y
            int r6 = -r6
            r5.f4111f = r6
        L_0x005d:
            androidx.recyclerview.widget.f r5 = r4.f3953y
            r5.f4113h = r1
            r5.f4106a = r2
            androidx.recyclerview.widget.j r6 = r4.f3949u
            int r6 = r6.mo5195k()
            if (r6 != 0) goto L_0x0074
            androidx.recyclerview.widget.j r6 = r4.f3949u
            int r6 = r6.mo5192h()
            if (r6 != 0) goto L_0x0074
            r1 = 1
        L_0x0074:
            r5.f4114i = r1
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.StaggeredGridLayoutManager.m5913O2(int, androidx.recyclerview.widget.RecyclerView$a0):void");
    }

    /* renamed from: Q1 */
    private void m5914Q1(View view, C1364c cVar, C1397f fVar) {
        if (fVar.f4110e == 1) {
            if (cVar.f3964f) {
                m5911M1(view);
            } else {
                cVar.f3963e.mo5055a(view);
            }
        } else if (cVar.f3964f) {
            m5941z2(view);
        } else {
            cVar.f3963e.mo5075u(view);
        }
    }

    /* renamed from: Q2 */
    private void m5915Q2(C1370f fVar, int i, int i2) {
        int j = fVar.mo5064j();
        if (i == -1) {
            if (fVar.mo5069o() + j > i2) {
                return;
            }
        } else if (fVar.mo5065k() - j < i2) {
            return;
        }
        this.f3932B.set(fVar.f3985e, false);
    }

    /* renamed from: R1 */
    private int m5916R1(int i) {
        if (mo4833J() == 0) {
            return this.f3931A ? 1 : -1;
        }
        return (i < mo5014j2()) != this.f3931A ? -1 : 1;
    }

    /* renamed from: R2 */
    private int m5917R2(int i, int i2, int i3) {
        if (i2 == 0 && i3 == 0) {
            return i;
        }
        int mode = View.MeasureSpec.getMode(i);
        return (mode == Integer.MIN_VALUE || mode == 1073741824) ? View.MeasureSpec.makeMeasureSpec(Math.max(0, (View.MeasureSpec.getSize(i) - i2) - i3), mode) : i;
    }

    /* renamed from: T1 */
    private boolean m5918T1(C1370f fVar) {
        if (this.f3931A) {
            if (fVar.mo5065k() < this.f3949u.mo5193i()) {
                ArrayList<View> arrayList = fVar.f3981a;
                return !fVar.mo5068n(arrayList.get(arrayList.size() - 1)).f3964f;
            }
        } else if (fVar.mo5069o() > this.f3949u.mo5197m()) {
            return !fVar.mo5068n(fVar.f3981a.get(0)).f3964f;
        }
        return false;
    }

    /* renamed from: U1 */
    private int m5919U1(RecyclerView.C1322a0 a0Var) {
        if (mo4833J() == 0) {
            return 0;
        }
        return C1407l.m6279a(a0Var, this.f3949u, mo5012e2(!this.f3944N), mo5011d2(!this.f3944N), this, this.f3944N);
    }

    /* renamed from: V1 */
    private int m5920V1(RecyclerView.C1322a0 a0Var) {
        if (mo4833J() == 0) {
            return 0;
        }
        return C1407l.m6280b(a0Var, this.f3949u, mo5012e2(!this.f3944N), mo5011d2(!this.f3944N), this, this.f3944N, this.f3931A);
    }

    /* renamed from: W1 */
    private int m5921W1(RecyclerView.C1322a0 a0Var) {
        if (mo4833J() == 0) {
            return 0;
        }
        return C1407l.m6281c(a0Var, this.f3949u, mo5012e2(!this.f3944N), mo5011d2(!this.f3944N), this, this.f3944N);
    }

    /* renamed from: X1 */
    private int m5922X1(int i) {
        if (i == 1) {
            return (this.f3951w != 1 && mo5018t2()) ? 1 : -1;
        }
        if (i == 2) {
            return (this.f3951w != 1 && mo5018t2()) ? -1 : 1;
        }
        if (i != 17) {
            if (i != 33) {
                if (i != 66) {
                    if (i == 130 && this.f3951w == 1) {
                        return 1;
                    }
                    return RecyclerView.UNDEFINED_DURATION;
                } else if (this.f3951w == 0) {
                    return 1;
                } else {
                    return RecyclerView.UNDEFINED_DURATION;
                }
            } else if (this.f3951w == 1) {
                return -1;
            } else {
                return RecyclerView.UNDEFINED_DURATION;
            }
        } else if (this.f3951w == 0) {
            return -1;
        } else {
            return RecyclerView.UNDEFINED_DURATION;
        }
    }

    /* renamed from: Y1 */
    private C1365d.C1366a m5923Y1(int i) {
        C1365d.C1366a aVar = new C1365d.C1366a();
        aVar.f3969p = new int[this.f3947s];
        for (int i2 = 0; i2 < this.f3947s; i2++) {
            aVar.f3969p[i2] = i - this.f3948t[i2].mo5066l(i);
        }
        return aVar;
    }

    /* renamed from: Z1 */
    private C1365d.C1366a m5924Z1(int i) {
        C1365d.C1366a aVar = new C1365d.C1366a();
        aVar.f3969p = new int[this.f3947s];
        for (int i2 = 0; i2 < this.f3947s; i2++) {
            aVar.f3969p[i2] = this.f3948t[i2].mo5070p(i) - i;
        }
        return aVar;
    }

    /* renamed from: a2 */
    private void m5925a2() {
        this.f3949u = C1402j.m6217b(this, this.f3951w);
        this.f3950v = C1402j.m6217b(this, 1 - this.f3951w);
    }

    /* JADX WARNING: type inference failed for: r9v0 */
    /* JADX WARNING: type inference failed for: r9v1, types: [int, boolean] */
    /* JADX WARNING: type inference failed for: r9v5 */
    /* renamed from: b2 */
    private int m5926b2(RecyclerView.C1354v vVar, C1397f fVar, RecyclerView.C1322a0 a0Var) {
        int i;
        C1370f fVar2;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        View view;
        StaggeredGridLayoutManager staggeredGridLayoutManager;
        RecyclerView.C1354v vVar2 = vVar;
        C1397f fVar3 = fVar;
        ? r9 = 0;
        this.f3932B.set(0, this.f3947s, true);
        if (this.f3953y.f4114i) {
            i = fVar3.f4110e == 1 ? RCTCameraModule.RCT_CAMERA_ORIENTATION_AUTO : RecyclerView.UNDEFINED_DURATION;
        } else {
            i = fVar3.f4110e == 1 ? fVar3.f4112g + fVar3.f4107b : fVar3.f4111f - fVar3.f4107b;
        }
        m5909K2(fVar3.f4110e, i);
        int i8 = this.f3931A ? this.f3949u.mo5193i() : this.f3949u.mo5197m();
        boolean z = false;
        while (fVar.mo5170a(a0Var) && (this.f3953y.f4114i || !this.f3932B.isEmpty())) {
            View b = fVar3.mo5171b(vVar2);
            C1364c cVar = (C1364c) b.getLayoutParams();
            int a = cVar.mo4913a();
            int g = this.f3935E.mo5033g(a);
            boolean z2 = g == -1;
            if (z2) {
                fVar2 = cVar.f3964f ? this.f3948t[r9] : m5935p2(fVar3);
                this.f3935E.mo5037n(a, fVar2);
            } else {
                fVar2 = this.f3948t[g];
            }
            C1370f fVar4 = fVar2;
            cVar.f3963e = fVar4;
            if (fVar3.f4110e == 1) {
                mo4863d(b);
            } else {
                mo4865e(b, r9);
            }
            m5938v2(b, cVar, r9);
            if (fVar3.f4110e == 1) {
                int l2 = cVar.f3964f ? m5931l2(i8) : fVar4.mo5066l(i8);
                int e = this.f3949u.mo5189e(b) + l2;
                if (z2 && cVar.f3964f) {
                    C1365d.C1366a Y1 = m5923Y1(l2);
                    Y1.f3968o = -1;
                    Y1.f3967f = a;
                    this.f3935E.mo5027a(Y1);
                }
                i2 = e;
                i3 = l2;
            } else {
                int o2 = cVar.f3964f ? m5934o2(i8) : fVar4.mo5070p(i8);
                i3 = o2 - this.f3949u.mo5189e(b);
                if (z2 && cVar.f3964f) {
                    C1365d.C1366a Z1 = m5924Z1(o2);
                    Z1.f3968o = 1;
                    Z1.f3967f = a;
                    this.f3935E.mo5027a(Z1);
                }
                i2 = o2;
            }
            if (cVar.f3964f && fVar3.f4109d == -1) {
                if (!z2) {
                    if (!(fVar3.f4110e == 1 ? mo5007O1() : mo5008P1())) {
                        C1365d.C1366a f = this.f3935E.mo5032f(a);
                        if (f != null) {
                            f.f3970q = true;
                        }
                    }
                }
                this.f3943M = true;
            }
            m5914Q1(b, cVar, fVar3);
            if (!mo5018t2() || this.f3951w != 1) {
                int m = cVar.f3964f ? this.f3950v.mo5197m() : (fVar4.f3985e * this.f3952x) + this.f3950v.mo5197m();
                i5 = m;
                i4 = this.f3950v.mo5189e(b) + m;
            } else {
                int i9 = cVar.f3964f ? this.f3950v.mo5193i() : this.f3950v.mo5193i() - (((this.f3947s - 1) - fVar4.f3985e) * this.f3952x);
                i4 = i9;
                i5 = i9 - this.f3950v.mo5189e(b);
            }
            if (this.f3951w == 1) {
                staggeredGridLayoutManager = this;
                view = b;
                i7 = i5;
                i5 = i3;
                i6 = i4;
            } else {
                staggeredGridLayoutManager = this;
                view = b;
                i7 = i3;
                i6 = i2;
                i2 = i4;
            }
            staggeredGridLayoutManager.mo4905z0(view, i7, i5, i6, i2);
            if (cVar.f3964f) {
                m5909K2(this.f3953y.f4110e, i);
            } else {
                m5915Q2(fVar4, this.f3953y.f4110e, i);
            }
            m5903A2(vVar2, this.f3953y);
            if (this.f3953y.f4113h && b.hasFocusable()) {
                if (cVar.f3964f) {
                    this.f3932B.clear();
                } else {
                    this.f3932B.set(fVar4.f3985e, false);
                    z = true;
                    r9 = 0;
                }
            }
            z = true;
            r9 = 0;
        }
        if (!z) {
            m5903A2(vVar2, this.f3953y);
        }
        int m2 = this.f3953y.f4110e == -1 ? this.f3949u.mo5197m() - m5934o2(this.f3949u.mo5197m()) : m5931l2(this.f3949u.mo5193i()) - this.f3949u.mo5193i();
        if (m2 > 0) {
            return Math.min(fVar3.f4107b, m2);
        }
        return 0;
    }

    /* renamed from: c2 */
    private int m5927c2(int i) {
        int J = mo4833J();
        for (int i2 = 0; i2 < J; i2++) {
            int h0 = mo4873h0(mo4832I(i2));
            if (h0 >= 0 && h0 < i) {
                return h0;
            }
        }
        return 0;
    }

    /* renamed from: g2 */
    private int m5928g2(int i) {
        for (int J = mo4833J() - 1; J >= 0; J--) {
            int h0 = mo4873h0(mo4832I(J));
            if (h0 >= 0 && h0 < i) {
                return h0;
            }
        }
        return 0;
    }

    /* renamed from: h2 */
    private void m5929h2(RecyclerView.C1354v vVar, RecyclerView.C1322a0 a0Var, boolean z) {
        int i;
        int l2 = m5931l2(RecyclerView.UNDEFINED_DURATION);
        if (l2 != Integer.MIN_VALUE && (i = this.f3949u.mo5193i() - l2) > 0) {
            int i2 = i - (-mo5001F2(-i, vVar, a0Var));
            if (z && i2 > 0) {
                this.f3949u.mo5202r(i2);
            }
        }
    }

    /* renamed from: i2 */
    private void m5930i2(RecyclerView.C1354v vVar, RecyclerView.C1322a0 a0Var, boolean z) {
        int m;
        int o2 = m5934o2(RCTCameraModule.RCT_CAMERA_ORIENTATION_AUTO);
        if (o2 != Integer.MAX_VALUE && (m = o2 - this.f3949u.mo5197m()) > 0) {
            int F2 = m - mo5001F2(m, vVar, a0Var);
            if (z && F2 > 0) {
                this.f3949u.mo5202r(-F2);
            }
        }
    }

    /* renamed from: l2 */
    private int m5931l2(int i) {
        int l = this.f3948t[0].mo5066l(i);
        for (int i2 = 1; i2 < this.f3947s; i2++) {
            int l2 = this.f3948t[i2].mo5066l(i);
            if (l2 > l) {
                l = l2;
            }
        }
        return l;
    }

    /* renamed from: m2 */
    private int m5932m2(int i) {
        int p = this.f3948t[0].mo5070p(i);
        for (int i2 = 1; i2 < this.f3947s; i2++) {
            int p2 = this.f3948t[i2].mo5070p(i);
            if (p2 > p) {
                p = p2;
            }
        }
        return p;
    }

    /* renamed from: n2 */
    private int m5933n2(int i) {
        int l = this.f3948t[0].mo5066l(i);
        for (int i2 = 1; i2 < this.f3947s; i2++) {
            int l2 = this.f3948t[i2].mo5066l(i);
            if (l2 < l) {
                l = l2;
            }
        }
        return l;
    }

    /* renamed from: o2 */
    private int m5934o2(int i) {
        int p = this.f3948t[0].mo5070p(i);
        for (int i2 = 1; i2 < this.f3947s; i2++) {
            int p2 = this.f3948t[i2].mo5070p(i);
            if (p2 < p) {
                p = p2;
            }
        }
        return p;
    }

    /* renamed from: p2 */
    private C1370f m5935p2(C1397f fVar) {
        int i;
        int i2;
        int i3 = -1;
        if (m5940x2(fVar.f4110e)) {
            i2 = this.f3947s - 1;
            i = -1;
        } else {
            i2 = 0;
            i3 = this.f3947s;
            i = 1;
        }
        C1370f fVar2 = null;
        if (fVar.f4110e == 1) {
            int i4 = RCTCameraModule.RCT_CAMERA_ORIENTATION_AUTO;
            int m = this.f3949u.mo5197m();
            while (i2 != i3) {
                C1370f fVar3 = this.f3948t[i2];
                int l = fVar3.mo5066l(m);
                if (l < i4) {
                    fVar2 = fVar3;
                    i4 = l;
                }
                i2 += i;
            }
            return fVar2;
        }
        int i5 = RecyclerView.UNDEFINED_DURATION;
        int i6 = this.f3949u.mo5193i();
        while (i2 != i3) {
            C1370f fVar4 = this.f3948t[i2];
            int p = fVar4.mo5070p(i6);
            if (p > i5) {
                fVar2 = fVar4;
                i5 = p;
            }
            i2 += i;
        }
        return fVar2;
    }

    /* JADX WARNING: Removed duplicated region for block: B:13:0x0025  */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x003c  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x0043 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x0044  */
    /* renamed from: q2 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void m5936q2(int r7, int r8, int r9) {
        /*
            r6 = this;
            boolean r0 = r6.f3931A
            if (r0 == 0) goto L_0x0009
            int r0 = r6.mo5015k2()
            goto L_0x000d
        L_0x0009:
            int r0 = r6.mo5014j2()
        L_0x000d:
            r1 = 8
            if (r9 != r1) goto L_0x001a
            if (r7 >= r8) goto L_0x0016
            int r2 = r8 + 1
            goto L_0x001c
        L_0x0016:
            int r2 = r7 + 1
            r3 = r8
            goto L_0x001d
        L_0x001a:
            int r2 = r7 + r8
        L_0x001c:
            r3 = r7
        L_0x001d:
            androidx.recyclerview.widget.StaggeredGridLayoutManager$d r4 = r6.f3935E
            r4.mo5034h(r3)
            r4 = 1
            if (r9 == r4) goto L_0x003c
            r5 = 2
            if (r9 == r5) goto L_0x0036
            if (r9 == r1) goto L_0x002b
            goto L_0x0041
        L_0x002b:
            androidx.recyclerview.widget.StaggeredGridLayoutManager$d r9 = r6.f3935E
            r9.mo5036k(r7, r4)
            androidx.recyclerview.widget.StaggeredGridLayoutManager$d r7 = r6.f3935E
            r7.mo5035j(r8, r4)
            goto L_0x0041
        L_0x0036:
            androidx.recyclerview.widget.StaggeredGridLayoutManager$d r9 = r6.f3935E
            r9.mo5036k(r7, r8)
            goto L_0x0041
        L_0x003c:
            androidx.recyclerview.widget.StaggeredGridLayoutManager$d r9 = r6.f3935E
            r9.mo5035j(r7, r8)
        L_0x0041:
            if (r2 > r0) goto L_0x0044
            return
        L_0x0044:
            boolean r7 = r6.f3931A
            if (r7 == 0) goto L_0x004d
            int r7 = r6.mo5014j2()
            goto L_0x0051
        L_0x004d:
            int r7 = r6.mo5015k2()
        L_0x0051:
            if (r3 > r7) goto L_0x0056
            r6.mo4896t1()
        L_0x0056:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.StaggeredGridLayoutManager.m5936q2(int, int, int):void");
    }

    /* renamed from: u2 */
    private void m5937u2(View view, int i, int i2, boolean z) {
        mo4877j(view, this.f3941K);
        C1364c cVar = (C1364c) view.getLayoutParams();
        int i3 = cVar.leftMargin;
        Rect rect = this.f3941K;
        int R2 = m5917R2(i, i3 + rect.left, cVar.rightMargin + rect.right);
        int i4 = cVar.topMargin;
        Rect rect2 = this.f3941K;
        int R22 = m5917R2(i2, i4 + rect2.top, cVar.bottomMargin + rect2.bottom);
        if (z ? mo4831H1(view, R2, R22, cVar) : mo4826F1(view, R2, R22, cVar)) {
            view.measure(R2, R22);
        }
    }

    /* renamed from: v2 */
    private void m5938v2(View view, C1364c cVar, boolean z) {
        int i;
        int i2;
        if (cVar.f3964f) {
            if (this.f3951w == 1) {
                i2 = this.f3940J;
            } else {
                m5937u2(view, RecyclerView.C1342o.m5658K(mo4887o0(), mo4889p0(), mo4866e0() + mo4868f0(), cVar.width, true), this.f3940J, z);
                return;
            }
        } else if (this.f3951w == 1) {
            i2 = RecyclerView.C1342o.m5658K(this.f3952x, mo4889p0(), 0, cVar.width, false);
        } else {
            i2 = RecyclerView.C1342o.m5658K(mo4887o0(), mo4889p0(), mo4866e0() + mo4868f0(), cVar.width, true);
            i = RecyclerView.C1342o.m5658K(this.f3952x, mo4852X(), 0, cVar.height, false);
            m5937u2(view, i2, i, z);
        }
        i = RecyclerView.C1342o.m5658K(mo4851W(), mo4852X(), mo4870g0() + mo4864d0(), cVar.height, true);
        m5937u2(view, i2, i, z);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:83:0x014b, code lost:
        if (mo5010S1() != false) goto L_0x014f;
     */
    /* renamed from: w2 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void m5939w2(androidx.recyclerview.widget.RecyclerView.C1354v r9, androidx.recyclerview.widget.RecyclerView.C1322a0 r10, boolean r11) {
        /*
            r8 = this;
            androidx.recyclerview.widget.StaggeredGridLayoutManager$b r0 = r8.f3942L
            androidx.recyclerview.widget.StaggeredGridLayoutManager$e r1 = r8.f3939I
            r2 = -1
            if (r1 != 0) goto L_0x000b
            int r1 = r8.f3933C
            if (r1 == r2) goto L_0x0018
        L_0x000b:
            int r1 = r10.mo4682b()
            if (r1 != 0) goto L_0x0018
            r8.mo4880k1(r9)
            r0.mo5023c()
            return
        L_0x0018:
            boolean r1 = r0.f3960e
            r3 = 0
            r4 = 1
            if (r1 == 0) goto L_0x0029
            int r1 = r8.f3933C
            if (r1 != r2) goto L_0x0029
            androidx.recyclerview.widget.StaggeredGridLayoutManager$e r1 = r8.f3939I
            if (r1 == 0) goto L_0x0027
            goto L_0x0029
        L_0x0027:
            r1 = 0
            goto L_0x002a
        L_0x0029:
            r1 = 1
        L_0x002a:
            if (r1 == 0) goto L_0x0043
            r0.mo5023c()
            androidx.recyclerview.widget.StaggeredGridLayoutManager$e r5 = r8.f3939I
            if (r5 == 0) goto L_0x0037
            r8.m5912N1(r0)
            goto L_0x003e
        L_0x0037:
            r8.m5907E2()
            boolean r5 = r8.f3931A
            r0.f3958c = r5
        L_0x003e:
            r8.mo5006N2(r10, r0)
            r0.f3960e = r4
        L_0x0043:
            androidx.recyclerview.widget.StaggeredGridLayoutManager$e r5 = r8.f3939I
            if (r5 != 0) goto L_0x0060
            int r5 = r8.f3933C
            if (r5 != r2) goto L_0x0060
            boolean r5 = r0.f3958c
            boolean r6 = r8.f3937G
            if (r5 != r6) goto L_0x0059
            boolean r5 = r8.mo5018t2()
            boolean r6 = r8.f3938H
            if (r5 == r6) goto L_0x0060
        L_0x0059:
            androidx.recyclerview.widget.StaggeredGridLayoutManager$d r5 = r8.f3935E
            r5.mo5028b()
            r0.f3959d = r4
        L_0x0060:
            int r5 = r8.mo4833J()
            if (r5 <= 0) goto L_0x00c9
            androidx.recyclerview.widget.StaggeredGridLayoutManager$e r5 = r8.f3939I
            if (r5 == 0) goto L_0x006e
            int r5 = r5.f3973p
            if (r5 >= r4) goto L_0x00c9
        L_0x006e:
            boolean r5 = r0.f3959d
            if (r5 == 0) goto L_0x008e
            r1 = 0
        L_0x0073:
            int r5 = r8.f3947s
            if (r1 >= r5) goto L_0x00c9
            androidx.recyclerview.widget.StaggeredGridLayoutManager$f[] r5 = r8.f3948t
            r5 = r5[r1]
            r5.mo5059e()
            int r5 = r0.f3957b
            r6 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r5 == r6) goto L_0x008b
            androidx.recyclerview.widget.StaggeredGridLayoutManager$f[] r6 = r8.f3948t
            r6 = r6[r1]
            r6.mo5076v(r5)
        L_0x008b:
            int r1 = r1 + 1
            goto L_0x0073
        L_0x008e:
            if (r1 != 0) goto L_0x00af
            androidx.recyclerview.widget.StaggeredGridLayoutManager$b r1 = r8.f3942L
            int[] r1 = r1.f3961f
            if (r1 != 0) goto L_0x0097
            goto L_0x00af
        L_0x0097:
            r1 = 0
        L_0x0098:
            int r5 = r8.f3947s
            if (r1 >= r5) goto L_0x00c9
            androidx.recyclerview.widget.StaggeredGridLayoutManager$f[] r5 = r8.f3948t
            r5 = r5[r1]
            r5.mo5059e()
            androidx.recyclerview.widget.StaggeredGridLayoutManager$b r6 = r8.f3942L
            int[] r6 = r6.f3961f
            r6 = r6[r1]
            r5.mo5076v(r6)
            int r1 = r1 + 1
            goto L_0x0098
        L_0x00af:
            r1 = 0
        L_0x00b0:
            int r5 = r8.f3947s
            if (r1 >= r5) goto L_0x00c2
            androidx.recyclerview.widget.StaggeredGridLayoutManager$f[] r5 = r8.f3948t
            r5 = r5[r1]
            boolean r6 = r8.f3931A
            int r7 = r0.f3957b
            r5.mo5056b(r6, r7)
            int r1 = r1 + 1
            goto L_0x00b0
        L_0x00c2:
            androidx.recyclerview.widget.StaggeredGridLayoutManager$b r1 = r8.f3942L
            androidx.recyclerview.widget.StaggeredGridLayoutManager$f[] r5 = r8.f3948t
            r1.mo5024d(r5)
        L_0x00c9:
            r8.mo4900w(r9)
            androidx.recyclerview.widget.f r1 = r8.f3953y
            r1.f4106a = r3
            r8.f3943M = r3
            androidx.recyclerview.widget.j r1 = r8.f3950v
            int r1 = r1.mo5198n()
            r8.mo5009P2(r1)
            int r1 = r0.f3956a
            r8.m5913O2(r1, r10)
            boolean r1 = r0.f3958c
            if (r1 == 0) goto L_0x00f0
            r8.m5908G2(r2)
            androidx.recyclerview.widget.f r1 = r8.f3953y
            r8.m5926b2(r9, r1, r10)
            r8.m5908G2(r4)
            goto L_0x00fb
        L_0x00f0:
            r8.m5908G2(r4)
            androidx.recyclerview.widget.f r1 = r8.f3953y
            r8.m5926b2(r9, r1, r10)
            r8.m5908G2(r2)
        L_0x00fb:
            androidx.recyclerview.widget.f r1 = r8.f3953y
            int r2 = r0.f3956a
            int r5 = r1.f4109d
            int r2 = r2 + r5
            r1.f4108c = r2
            r8.m5926b2(r9, r1, r10)
            r8.m5906D2()
            int r1 = r8.mo4833J()
            if (r1 <= 0) goto L_0x0121
            boolean r1 = r8.f3931A
            if (r1 == 0) goto L_0x011b
            r8.m5929h2(r9, r10, r4)
            r8.m5930i2(r9, r10, r3)
            goto L_0x0121
        L_0x011b:
            r8.m5930i2(r9, r10, r4)
            r8.m5929h2(r9, r10, r3)
        L_0x0121:
            if (r11 == 0) goto L_0x014e
            boolean r11 = r10.mo4685e()
            if (r11 != 0) goto L_0x014e
            int r11 = r8.f3936F
            if (r11 == 0) goto L_0x013f
            int r11 = r8.mo4833J()
            if (r11 <= 0) goto L_0x013f
            boolean r11 = r8.f3943M
            if (r11 != 0) goto L_0x013d
            android.view.View r11 = r8.mo5016r2()
            if (r11 == 0) goto L_0x013f
        L_0x013d:
            r11 = 1
            goto L_0x0140
        L_0x013f:
            r11 = 0
        L_0x0140:
            if (r11 == 0) goto L_0x014e
            java.lang.Runnable r11 = r8.f3946P
            r8.mo4888o1(r11)
            boolean r11 = r8.mo5010S1()
            if (r11 == 0) goto L_0x014e
            goto L_0x014f
        L_0x014e:
            r4 = 0
        L_0x014f:
            boolean r11 = r10.mo4685e()
            if (r11 == 0) goto L_0x015a
            androidx.recyclerview.widget.StaggeredGridLayoutManager$b r11 = r8.f3942L
            r11.mo5023c()
        L_0x015a:
            boolean r11 = r0.f3958c
            r8.f3937G = r11
            boolean r11 = r8.mo5018t2()
            r8.f3938H = r11
            if (r4 == 0) goto L_0x016e
            androidx.recyclerview.widget.StaggeredGridLayoutManager$b r11 = r8.f3942L
            r11.mo5023c()
            r8.m5939w2(r9, r10, r3)
        L_0x016e:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.StaggeredGridLayoutManager.m5939w2(androidx.recyclerview.widget.RecyclerView$v, androidx.recyclerview.widget.RecyclerView$a0, boolean):void");
    }

    /* renamed from: x2 */
    private boolean m5940x2(int i) {
        if (this.f3951w == 0) {
            return (i == -1) != this.f3931A;
        }
        return ((i == -1) == this.f3931A) == mo5018t2();
    }

    /* renamed from: z2 */
    private void m5941z2(View view) {
        for (int i = this.f3947s - 1; i >= 0; i--) {
            this.f3948t[i].mo5075u(view);
        }
    }

    /* renamed from: C0 */
    public void mo4820C0(int i) {
        super.mo4820C0(i);
        for (int i2 = 0; i2 < this.f3947s; i2++) {
            this.f3948t[i2].mo5072r(i);
        }
    }

    /* renamed from: C1 */
    public void mo4396C1(Rect rect, int i, int i2) {
        int i3;
        int i4;
        int e0 = mo4866e0() + mo4868f0();
        int g0 = mo4870g0() + mo4864d0();
        if (this.f3951w == 1) {
            i4 = RecyclerView.C1342o.m5662n(i2, rect.height() + g0, mo4859b0());
            i3 = RecyclerView.C1342o.m5662n(i, (this.f3952x * this.f3947s) + e0, mo4862c0());
        } else {
            i3 = RecyclerView.C1342o.m5662n(i, rect.width() + e0, mo4862c0());
            i4 = RecyclerView.C1342o.m5662n(i2, (this.f3952x * this.f3947s) + g0, mo4859b0());
        }
        mo4819B1(i3, i4);
    }

    /* renamed from: D */
    public RecyclerView.C1347p mo4397D() {
        return this.f3951w == 0 ? new C1364c(-2, -1) : new C1364c(-1, -2);
    }

    /* renamed from: D0 */
    public void mo4821D0(int i) {
        super.mo4821D0(i);
        for (int i2 = 0; i2 < this.f3947s; i2++) {
            this.f3948t[i2].mo5072r(i);
        }
    }

    /* renamed from: E */
    public RecyclerView.C1347p mo4398E(Context context, AttributeSet attributeSet) {
        return new C1364c(context, attributeSet);
    }

    /* renamed from: F */
    public RecyclerView.C1347p mo4400F(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof ViewGroup.MarginLayoutParams ? new C1364c((ViewGroup.MarginLayoutParams) layoutParams) : new C1364c(layoutParams);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: F2 */
    public int mo5001F2(int i, RecyclerView.C1354v vVar, RecyclerView.C1322a0 a0Var) {
        if (mo4833J() == 0 || i == 0) {
            return 0;
        }
        mo5019y2(i, a0Var);
        int b2 = m5926b2(vVar, this.f3953y, a0Var);
        if (this.f3953y.f4107b >= b2) {
            i = i < 0 ? -b2 : b2;
        }
        this.f3949u.mo5202r(-i);
        this.f3937G = this.f3931A;
        C1397f fVar = this.f3953y;
        fVar.f4107b = 0;
        m5903A2(vVar, fVar);
        return i;
    }

    /* renamed from: H2 */
    public void mo5002H2(int i) {
        if (i == 0 || i == 1) {
            mo4458g((String) null);
            if (i != this.f3951w) {
                this.f3951w = i;
                C1402j jVar = this.f3949u;
                this.f3949u = this.f3950v;
                this.f3950v = jVar;
                mo4896t1();
                return;
            }
            return;
        }
        throw new IllegalArgumentException("invalid orientation.");
    }

    /* renamed from: I0 */
    public void mo4441I0(RecyclerView recyclerView, RecyclerView.C1354v vVar) {
        super.mo4441I0(recyclerView, vVar);
        mo4888o1(this.f3946P);
        for (int i = 0; i < this.f3947s; i++) {
            this.f3948t[i].mo5059e();
        }
        recyclerView.requestLayout();
    }

    /* renamed from: I1 */
    public void mo4442I1(RecyclerView recyclerView, RecyclerView.C1322a0 a0Var, int i) {
        C1398g gVar = new C1398g(recyclerView.getContext());
        gVar.mo4994p(i);
        mo4834J1(gVar);
    }

    /* renamed from: I2 */
    public void mo5003I2(boolean z) {
        mo4458g((String) null);
        C1368e eVar = this.f3939I;
        if (!(eVar == null || eVar.f3978u == z)) {
            eVar.f3978u = z;
        }
        this.f3954z = z;
        mo4896t1();
    }

    /* renamed from: J0 */
    public View mo4401J0(View view, int i, RecyclerView.C1354v vVar, RecyclerView.C1322a0 a0Var) {
        View B;
        View m;
        if (mo4833J() == 0 || (B = mo4817B(view)) == null) {
            return null;
        }
        m5907E2();
        int X1 = m5922X1(i);
        if (X1 == Integer.MIN_VALUE) {
            return null;
        }
        C1364c cVar = (C1364c) B.getLayoutParams();
        boolean z = cVar.f3964f;
        C1370f fVar = cVar.f3963e;
        int k2 = X1 == 1 ? mo5015k2() : mo5014j2();
        m5913O2(k2, a0Var);
        m5908G2(X1);
        C1397f fVar2 = this.f3953y;
        fVar2.f4108c = fVar2.f4109d + k2;
        fVar2.f4107b = (int) (((float) this.f3949u.mo5198n()) * 0.33333334f);
        C1397f fVar3 = this.f3953y;
        fVar3.f4113h = true;
        fVar3.f4106a = false;
        m5926b2(vVar, fVar3, a0Var);
        this.f3937G = this.f3931A;
        if (!z && (m = fVar.mo5067m(k2, X1)) != null && m != B) {
            return m;
        }
        if (m5940x2(X1)) {
            for (int i2 = this.f3947s - 1; i2 >= 0; i2--) {
                View m2 = this.f3948t[i2].mo5067m(k2, X1);
                if (m2 != null && m2 != B) {
                    return m2;
                }
            }
        } else {
            for (int i3 = 0; i3 < this.f3947s; i3++) {
                View m3 = this.f3948t[i3].mo5067m(k2, X1);
                if (m3 != null && m3 != B) {
                    return m3;
                }
            }
        }
        boolean z2 = (this.f3954z ^ true) == (X1 == -1);
        if (!z) {
            View C = mo4437C(z2 ? fVar.mo5060f() : fVar.mo5061g());
            if (!(C == null || C == B)) {
                return C;
            }
        }
        if (m5940x2(X1)) {
            for (int i4 = this.f3947s - 1; i4 >= 0; i4--) {
                if (i4 != fVar.f3985e) {
                    C1370f[] fVarArr = this.f3948t;
                    View C2 = mo4437C(z2 ? fVarArr[i4].mo5060f() : fVarArr[i4].mo5061g());
                    if (!(C2 == null || C2 == B)) {
                        return C2;
                    }
                }
            }
        } else {
            for (int i5 = 0; i5 < this.f3947s; i5++) {
                C1370f[] fVarArr2 = this.f3948t;
                View C3 = mo4437C(z2 ? fVarArr2[i5].mo5060f() : fVarArr2[i5].mo5061g());
                if (C3 != null && C3 != B) {
                    return C3;
                }
            }
        }
        return null;
    }

    /* renamed from: J2 */
    public void mo5004J2(int i) {
        mo4458g((String) null);
        if (i != this.f3947s) {
            mo5017s2();
            this.f3947s = i;
            this.f3932B = new BitSet(this.f3947s);
            this.f3948t = new C1370f[this.f3947s];
            for (int i2 = 0; i2 < this.f3947s; i2++) {
                this.f3948t[i2] = new C1370f(i2);
            }
            mo4896t1();
        }
    }

    /* renamed from: K0 */
    public void mo4443K0(AccessibilityEvent accessibilityEvent) {
        super.mo4443K0(accessibilityEvent);
        if (mo4833J() > 0) {
            View e2 = mo5012e2(false);
            View d2 = mo5011d2(false);
            if (e2 != null && d2 != null) {
                int h0 = mo4873h0(e2);
                int h02 = mo4873h0(d2);
                if (h0 < h02) {
                    accessibilityEvent.setFromIndex(h0);
                    accessibilityEvent.setToIndex(h02);
                    return;
                }
                accessibilityEvent.setFromIndex(h02);
                accessibilityEvent.setToIndex(h0);
            }
        }
    }

    /* renamed from: L1 */
    public boolean mo4402L1() {
        return this.f3939I == null;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: M2 */
    public boolean mo5005M2(RecyclerView.C1322a0 a0Var, C1363b bVar) {
        int i;
        int i2;
        int i3;
        boolean z = false;
        if (!a0Var.mo4685e() && (i = this.f3933C) != -1) {
            if (i < 0 || i >= a0Var.mo4682b()) {
                this.f3933C = -1;
                this.f3934D = RecyclerView.UNDEFINED_DURATION;
            } else {
                C1368e eVar = this.f3939I;
                if (eVar == null || eVar.f3971f == -1 || eVar.f3973p < 1) {
                    View C = mo4437C(this.f3933C);
                    if (C != null) {
                        bVar.f3956a = this.f3931A ? mo5015k2() : mo5014j2();
                        if (this.f3934D != Integer.MIN_VALUE) {
                            if (bVar.f3958c) {
                                i3 = this.f3949u.mo5193i() - this.f3934D;
                                i2 = this.f3949u.mo5188d(C);
                            } else {
                                i3 = this.f3949u.mo5197m() + this.f3934D;
                                i2 = this.f3949u.mo5191g(C);
                            }
                            bVar.f3957b = i3 - i2;
                            return true;
                        } else if (this.f3949u.mo5189e(C) > this.f3949u.mo5198n()) {
                            bVar.f3957b = bVar.f3958c ? this.f3949u.mo5193i() : this.f3949u.mo5197m();
                            return true;
                        } else {
                            int g = this.f3949u.mo5191g(C) - this.f3949u.mo5197m();
                            if (g < 0) {
                                bVar.f3957b = -g;
                                return true;
                            }
                            int i4 = this.f3949u.mo5193i() - this.f3949u.mo5188d(C);
                            if (i4 < 0) {
                                bVar.f3957b = i4;
                                return true;
                            }
                            bVar.f3957b = RecyclerView.UNDEFINED_DURATION;
                        }
                    } else {
                        int i5 = this.f3933C;
                        bVar.f3956a = i5;
                        int i6 = this.f3934D;
                        if (i6 == Integer.MIN_VALUE) {
                            if (m5916R1(i5) == 1) {
                                z = true;
                            }
                            bVar.f3958c = z;
                            bVar.mo5021a();
                        } else {
                            bVar.mo5022b(i6);
                        }
                        bVar.f3959d = true;
                    }
                } else {
                    bVar.f3957b = RecyclerView.UNDEFINED_DURATION;
                    bVar.f3956a = this.f3933C;
                }
                return true;
            }
        }
        return false;
    }

    /* renamed from: N */
    public int mo4403N(RecyclerView.C1354v vVar, RecyclerView.C1322a0 a0Var) {
        return this.f3951w == 1 ? this.f3947s : super.mo4403N(vVar, a0Var);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: N2 */
    public void mo5006N2(RecyclerView.C1322a0 a0Var, C1363b bVar) {
        if (!mo5005M2(a0Var, bVar) && !m5910L2(a0Var, bVar)) {
            bVar.mo5021a();
            bVar.f3956a = 0;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: O1 */
    public boolean mo5007O1() {
        int l = this.f3948t[0].mo5066l(RecyclerView.UNDEFINED_DURATION);
        for (int i = 1; i < this.f3947s; i++) {
            if (this.f3948t[i].mo5066l(RecyclerView.UNDEFINED_DURATION) != l) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: P0 */
    public void mo4405P0(RecyclerView.C1354v vVar, RecyclerView.C1322a0 a0Var, View view, C1955c cVar) {
        int i;
        int i2;
        int i3;
        int i4;
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (!(layoutParams instanceof C1364c)) {
            super.mo4841O0(view, cVar);
            return;
        }
        C1364c cVar2 = (C1364c) layoutParams;
        if (this.f3951w == 0) {
            i4 = cVar2.mo5025e();
            i3 = cVar2.f3964f ? this.f3947s : 1;
            i2 = -1;
            i = -1;
        } else {
            i4 = -1;
            i3 = -1;
            i2 = cVar2.mo5025e();
            i = cVar2.f3964f ? this.f3947s : 1;
        }
        cVar.mo6584d0(C1955c.C1958c.m8277b(i4, i3, i2, i, false, false));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: P1 */
    public boolean mo5008P1() {
        int p = this.f3948t[0].mo5070p(RecyclerView.UNDEFINED_DURATION);
        for (int i = 1; i < this.f3947s; i++) {
            if (this.f3948t[i].mo5070p(RecyclerView.UNDEFINED_DURATION) != p) {
                return false;
            }
        }
        return true;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: P2 */
    public void mo5009P2(int i) {
        this.f3952x = i / this.f3947s;
        this.f3940J = View.MeasureSpec.makeMeasureSpec(i, this.f3950v.mo5195k());
    }

    /* renamed from: R0 */
    public void mo4406R0(RecyclerView recyclerView, int i, int i2) {
        m5936q2(i, i2, 1);
    }

    /* renamed from: S0 */
    public void mo4407S0(RecyclerView recyclerView) {
        this.f3935E.mo5028b();
        mo4896t1();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: S1 */
    public boolean mo5010S1() {
        int i;
        int i2;
        if (mo4833J() == 0 || this.f3936F == 0 || !mo4893r0()) {
            return false;
        }
        if (this.f3931A) {
            i2 = mo5015k2();
            i = mo5014j2();
        } else {
            i2 = mo5014j2();
            i = mo5015k2();
        }
        if (i2 == 0 && mo5016r2() != null) {
            this.f3935E.mo5028b();
        } else if (!this.f3943M) {
            return false;
        } else {
            int i3 = this.f3931A ? -1 : 1;
            int i4 = i + 1;
            C1365d.C1366a e = this.f3935E.mo5031e(i2, i4, i3, true);
            if (e == null) {
                this.f3943M = false;
                this.f3935E.mo5030d(i4);
                return false;
            }
            C1365d.C1366a e2 = this.f3935E.mo5031e(i2, e.f3967f, i3 * -1, true);
            if (e2 == null) {
                this.f3935E.mo5030d(e.f3967f);
            } else {
                this.f3935E.mo5030d(e2.f3967f + 1);
            }
        }
        mo4898u1();
        mo4896t1();
        return true;
    }

    /* renamed from: T0 */
    public void mo4408T0(RecyclerView recyclerView, int i, int i2, int i3) {
        m5936q2(i, i2, 8);
    }

    /* renamed from: U0 */
    public void mo4409U0(RecyclerView recyclerView, int i, int i2) {
        m5936q2(i, i2, 2);
    }

    /* renamed from: W0 */
    public void mo4410W0(RecyclerView recyclerView, int i, int i2, Object obj) {
        m5936q2(i, i2, 4);
    }

    /* renamed from: X0 */
    public void mo4412X0(RecyclerView.C1354v vVar, RecyclerView.C1322a0 a0Var) {
        m5939w2(vVar, a0Var, true);
    }

    /* renamed from: Y0 */
    public void mo4414Y0(RecyclerView.C1322a0 a0Var) {
        super.mo4414Y0(a0Var);
        this.f3933C = -1;
        this.f3934D = RecyclerView.UNDEFINED_DURATION;
        this.f3939I = null;
        this.f3942L.mo5023c();
    }

    /* renamed from: a */
    public PointF mo4452a(int i) {
        int R1 = m5916R1(i);
        PointF pointF = new PointF();
        if (R1 == 0) {
            return null;
        }
        if (this.f3951w == 0) {
            pointF.x = (float) R1;
            pointF.y = 0.0f;
        } else {
            pointF.x = 0.0f;
            pointF.y = (float) R1;
        }
        return pointF;
    }

    /* renamed from: c1 */
    public void mo4453c1(Parcelable parcelable) {
        if (parcelable instanceof C1368e) {
            this.f3939I = (C1368e) parcelable;
            mo4896t1();
        }
    }

    /* renamed from: d1 */
    public Parcelable mo4455d1() {
        int i;
        int i2;
        int[] iArr;
        if (this.f3939I != null) {
            return new C1368e(this.f3939I);
        }
        C1368e eVar = new C1368e();
        eVar.f3978u = this.f3954z;
        eVar.f3979v = this.f3937G;
        eVar.f3980w = this.f3938H;
        C1365d dVar = this.f3935E;
        if (dVar == null || (iArr = dVar.f3965a) == null) {
            eVar.f3975r = 0;
        } else {
            eVar.f3976s = iArr;
            eVar.f3975r = iArr.length;
            eVar.f3977t = dVar.f3966b;
        }
        if (mo4833J() > 0) {
            eVar.f3971f = this.f3937G ? mo5015k2() : mo5014j2();
            eVar.f3972o = mo5013f2();
            int i3 = this.f3947s;
            eVar.f3973p = i3;
            eVar.f3974q = new int[i3];
            for (int i4 = 0; i4 < this.f3947s; i4++) {
                if (this.f3937G) {
                    i = this.f3948t[i4].mo5066l(RecyclerView.UNDEFINED_DURATION);
                    if (i != Integer.MIN_VALUE) {
                        i2 = this.f3949u.mo5193i();
                    } else {
                        eVar.f3974q[i4] = i;
                    }
                } else {
                    i = this.f3948t[i4].mo5070p(RecyclerView.UNDEFINED_DURATION);
                    if (i != Integer.MIN_VALUE) {
                        i2 = this.f3949u.mo5197m();
                    } else {
                        eVar.f3974q[i4] = i;
                    }
                }
                i -= i2;
                eVar.f3974q[i4] = i;
            }
        } else {
            eVar.f3971f = -1;
            eVar.f3972o = -1;
            eVar.f3973p = 0;
        }
        return eVar;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d2 */
    public View mo5011d2(boolean z) {
        int m = this.f3949u.mo5197m();
        int i = this.f3949u.mo5193i();
        View view = null;
        for (int J = mo4833J() - 1; J >= 0; J--) {
            View I = mo4832I(J);
            int g = this.f3949u.mo5191g(I);
            int d = this.f3949u.mo5188d(I);
            if (d > m && g < i) {
                if (d <= i || !z) {
                    return I;
                }
                if (view == null) {
                    view = I;
                }
            }
        }
        return view;
    }

    /* renamed from: e1 */
    public void mo4867e1(int i) {
        if (i == 0) {
            mo5010S1();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e2 */
    public View mo5012e2(boolean z) {
        int m = this.f3949u.mo5197m();
        int i = this.f3949u.mo5193i();
        int J = mo4833J();
        View view = null;
        for (int i2 = 0; i2 < J; i2++) {
            View I = mo4832I(i2);
            int g = this.f3949u.mo5191g(I);
            if (this.f3949u.mo5188d(I) > m && g < i) {
                if (g >= m || !z) {
                    return I;
                }
                if (view == null) {
                    view = I;
                }
            }
        }
        return view;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f2 */
    public int mo5013f2() {
        View d2 = this.f3931A ? mo5011d2(true) : mo5012e2(true);
        if (d2 == null) {
            return -1;
        }
        return mo4873h0(d2);
    }

    /* renamed from: g */
    public void mo4458g(String str) {
        if (this.f3939I == null) {
            super.mo4458g(str);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: j2 */
    public int mo5014j2() {
        if (mo4833J() == 0) {
            return 0;
        }
        return mo4873h0(mo4832I(0));
    }

    /* renamed from: k */
    public boolean mo4459k() {
        return this.f3951w == 0;
    }

    /* renamed from: k0 */
    public int mo4417k0(RecyclerView.C1354v vVar, RecyclerView.C1322a0 a0Var) {
        return this.f3951w == 0 ? this.f3947s : super.mo4417k0(vVar, a0Var);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: k2 */
    public int mo5015k2() {
        int J = mo4833J();
        if (J == 0) {
            return 0;
        }
        return mo4873h0(mo4832I(J - 1));
    }

    /* renamed from: l */
    public boolean mo4460l() {
        return this.f3951w == 1;
    }

    /* renamed from: m */
    public boolean mo4418m(RecyclerView.C1347p pVar) {
        return pVar instanceof C1364c;
    }

    /* renamed from: o */
    public void mo4461o(int i, int i2, RecyclerView.C1322a0 a0Var, RecyclerView.C1342o.C1345c cVar) {
        int i3;
        int i4;
        if (this.f3951w != 0) {
            i = i2;
        }
        if (mo4833J() != 0 && i != 0) {
            mo5019y2(i, a0Var);
            int[] iArr = this.f3945O;
            if (iArr == null || iArr.length < this.f3947s) {
                this.f3945O = new int[this.f3947s];
            }
            int i5 = 0;
            for (int i6 = 0; i6 < this.f3947s; i6++) {
                C1397f fVar = this.f3953y;
                if (fVar.f4109d == -1) {
                    i4 = fVar.f4111f;
                    i3 = this.f3948t[i6].mo5070p(i4);
                } else {
                    i4 = this.f3948t[i6].mo5066l(fVar.f4112g);
                    i3 = this.f3953y.f4112g;
                }
                int i7 = i4 - i3;
                if (i7 >= 0) {
                    this.f3945O[i5] = i7;
                    i5++;
                }
            }
            Arrays.sort(this.f3945O, 0, i5);
            for (int i8 = 0; i8 < i5 && this.f3953y.mo5170a(a0Var); i8++) {
                cVar.mo4912a(this.f3953y.f4108c, this.f3945O[i8]);
                C1397f fVar2 = this.f3953y;
                fVar2.f4108c += fVar2.f4109d;
            }
        }
    }

    /* renamed from: q */
    public int mo4465q(RecyclerView.C1322a0 a0Var) {
        return m5919U1(a0Var);
    }

    /* renamed from: r */
    public int mo4419r(RecyclerView.C1322a0 a0Var) {
        return m5920V1(a0Var);
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x0074, code lost:
        if (r10 == r11) goto L_0x0088;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x0086, code lost:
        if (r10 == r11) goto L_0x0088;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x008a, code lost:
        r10 = false;
     */
    /* renamed from: r2 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public android.view.View mo5016r2() {
        /*
            r12 = this;
            int r0 = r12.mo4833J()
            r1 = 1
            int r0 = r0 - r1
            java.util.BitSet r2 = new java.util.BitSet
            int r3 = r12.f3947s
            r2.<init>(r3)
            int r3 = r12.f3947s
            r4 = 0
            r2.set(r4, r3, r1)
            int r3 = r12.f3951w
            r5 = -1
            if (r3 != r1) goto L_0x0020
            boolean r3 = r12.mo5018t2()
            if (r3 == 0) goto L_0x0020
            r3 = 1
            goto L_0x0021
        L_0x0020:
            r3 = -1
        L_0x0021:
            boolean r6 = r12.f3931A
            if (r6 == 0) goto L_0x0027
            r6 = -1
            goto L_0x002b
        L_0x0027:
            int r0 = r0 + 1
            r6 = r0
            r0 = 0
        L_0x002b:
            if (r0 >= r6) goto L_0x002e
            r5 = 1
        L_0x002e:
            if (r0 == r6) goto L_0x00ab
            android.view.View r7 = r12.mo4832I(r0)
            android.view.ViewGroup$LayoutParams r8 = r7.getLayoutParams()
            androidx.recyclerview.widget.StaggeredGridLayoutManager$c r8 = (androidx.recyclerview.widget.StaggeredGridLayoutManager.C1364c) r8
            androidx.recyclerview.widget.StaggeredGridLayoutManager$f r9 = r8.f3963e
            int r9 = r9.f3985e
            boolean r9 = r2.get(r9)
            if (r9 == 0) goto L_0x0054
            androidx.recyclerview.widget.StaggeredGridLayoutManager$f r9 = r8.f3963e
            boolean r9 = r12.m5918T1(r9)
            if (r9 == 0) goto L_0x004d
            return r7
        L_0x004d:
            androidx.recyclerview.widget.StaggeredGridLayoutManager$f r9 = r8.f3963e
            int r9 = r9.f3985e
            r2.clear(r9)
        L_0x0054:
            boolean r9 = r8.f3964f
            if (r9 == 0) goto L_0x0059
            goto L_0x00a9
        L_0x0059:
            int r9 = r0 + r5
            if (r9 == r6) goto L_0x00a9
            android.view.View r9 = r12.mo4832I(r9)
            boolean r10 = r12.f3931A
            if (r10 == 0) goto L_0x0077
            androidx.recyclerview.widget.j r10 = r12.f3949u
            int r10 = r10.mo5188d(r7)
            androidx.recyclerview.widget.j r11 = r12.f3949u
            int r11 = r11.mo5188d(r9)
            if (r10 >= r11) goto L_0x0074
            return r7
        L_0x0074:
            if (r10 != r11) goto L_0x008a
            goto L_0x0088
        L_0x0077:
            androidx.recyclerview.widget.j r10 = r12.f3949u
            int r10 = r10.mo5191g(r7)
            androidx.recyclerview.widget.j r11 = r12.f3949u
            int r11 = r11.mo5191g(r9)
            if (r10 <= r11) goto L_0x0086
            return r7
        L_0x0086:
            if (r10 != r11) goto L_0x008a
        L_0x0088:
            r10 = 1
            goto L_0x008b
        L_0x008a:
            r10 = 0
        L_0x008b:
            if (r10 == 0) goto L_0x00a9
            android.view.ViewGroup$LayoutParams r9 = r9.getLayoutParams()
            androidx.recyclerview.widget.StaggeredGridLayoutManager$c r9 = (androidx.recyclerview.widget.StaggeredGridLayoutManager.C1364c) r9
            androidx.recyclerview.widget.StaggeredGridLayoutManager$f r8 = r8.f3963e
            int r8 = r8.f3985e
            androidx.recyclerview.widget.StaggeredGridLayoutManager$f r9 = r9.f3963e
            int r9 = r9.f3985e
            int r8 = r8 - r9
            if (r8 >= 0) goto L_0x00a0
            r8 = 1
            goto L_0x00a1
        L_0x00a0:
            r8 = 0
        L_0x00a1:
            if (r3 >= 0) goto L_0x00a5
            r9 = 1
            goto L_0x00a6
        L_0x00a5:
            r9 = 0
        L_0x00a6:
            if (r8 == r9) goto L_0x00a9
            return r7
        L_0x00a9:
            int r0 = r0 + r5
            goto L_0x002e
        L_0x00ab:
            r0 = 0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.StaggeredGridLayoutManager.mo5016r2():android.view.View");
    }

    /* renamed from: s */
    public int mo4420s(RecyclerView.C1322a0 a0Var) {
        return m5921W1(a0Var);
    }

    /* renamed from: s0 */
    public boolean mo4468s0() {
        return this.f3936F != 0;
    }

    /* renamed from: s2 */
    public void mo5017s2() {
        this.f3935E.mo5028b();
        mo4896t1();
    }

    /* renamed from: t */
    public int mo4469t(RecyclerView.C1322a0 a0Var) {
        return m5919U1(a0Var);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: t2 */
    public boolean mo5018t2() {
        return mo4854Z() == 1;
    }

    /* renamed from: u */
    public int mo4422u(RecyclerView.C1322a0 a0Var) {
        return m5920V1(a0Var);
    }

    /* renamed from: v */
    public int mo4424v(RecyclerView.C1322a0 a0Var) {
        return m5921W1(a0Var);
    }

    /* renamed from: w1 */
    public int mo4425w1(int i, RecyclerView.C1354v vVar, RecyclerView.C1322a0 a0Var) {
        return mo5001F2(i, vVar, a0Var);
    }

    /* renamed from: x1 */
    public void mo4470x1(int i) {
        C1368e eVar = this.f3939I;
        if (!(eVar == null || eVar.f3971f == i)) {
            eVar.mo5047a();
        }
        this.f3933C = i;
        this.f3934D = RecyclerView.UNDEFINED_DURATION;
        mo4896t1();
    }

    /* renamed from: y1 */
    public int mo4426y1(int i, RecyclerView.C1354v vVar, RecyclerView.C1322a0 a0Var) {
        return mo5001F2(i, vVar, a0Var);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: y2 */
    public void mo5019y2(int i, RecyclerView.C1322a0 a0Var) {
        int i2;
        int i3;
        if (i > 0) {
            i3 = mo5015k2();
            i2 = 1;
        } else {
            i3 = mo5014j2();
            i2 = -1;
        }
        this.f3953y.f4106a = true;
        m5913O2(i3, a0Var);
        m5908G2(i2);
        C1397f fVar = this.f3953y;
        fVar.f4108c = i3 + fVar.f4109d;
        fVar.f4107b = Math.abs(i);
    }
}
