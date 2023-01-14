package androidx.fragment.app;

import android.util.Log;
import androidx.core.util.C1172c;
import androidx.fragment.app.C1231l;
import androidx.fragment.app.C1252s;
import androidx.fragment.app.Fragment;
import java.io.PrintWriter;
import java.util.ArrayList;

/* renamed from: androidx.fragment.app.a */
final class C1211a extends C1252s implements C1231l.C1239h {

    /* renamed from: t */
    final C1231l f3440t;

    /* renamed from: u */
    boolean f3441u;

    /* renamed from: v */
    int f3442v;

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    C1211a(androidx.fragment.app.C1231l r3) {
        /*
            r2 = this;
            androidx.fragment.app.h r0 = r3.mo4141h0()
            androidx.fragment.app.i<?> r1 = r3.f3522p
            if (r1 == 0) goto L_0x0011
            android.content.Context r1 = r1.mo4078f()
            java.lang.ClassLoader r1 = r1.getClassLoader()
            goto L_0x0012
        L_0x0011:
            r1 = 0
        L_0x0012:
            r2.<init>(r0, r1)
            r0 = -1
            r2.f3442v = r0
            r2.f3440t = r3
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.fragment.app.C1211a.<init>(androidx.fragment.app.l):void");
    }

    /* renamed from: D */
    private static boolean m4868D(C1252s.C1253a aVar) {
        Fragment fragment = aVar.f3599b;
        return fragment != null && fragment.f3403y && fragment.f3377U != null && !fragment.f3370N && !fragment.f3369M && fragment.mo3875V();
    }

    /* renamed from: A */
    public String mo3963A() {
        return this.f3589k;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: B */
    public boolean mo3964B(int i) {
        int size = this.f3581c.size();
        for (int i2 = 0; i2 < size; i2++) {
            Fragment fragment = this.f3581c.get(i2).f3599b;
            int i3 = fragment != null ? fragment.f3367K : 0;
            if (i3 != 0 && i3 == i) {
                return true;
            }
        }
        return false;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: C */
    public boolean mo3965C(ArrayList<C1211a> arrayList, int i, int i2) {
        if (i2 == i) {
            return false;
        }
        int size = this.f3581c.size();
        int i3 = -1;
        for (int i4 = 0; i4 < size; i4++) {
            Fragment fragment = this.f3581c.get(i4).f3599b;
            int i5 = fragment != null ? fragment.f3367K : 0;
            if (!(i5 == 0 || i5 == i3)) {
                for (int i6 = i; i6 < i2; i6++) {
                    C1211a aVar = arrayList.get(i6);
                    int size2 = aVar.f3581c.size();
                    for (int i7 = 0; i7 < size2; i7++) {
                        Fragment fragment2 = aVar.f3581c.get(i7).f3599b;
                        if ((fragment2 != null ? fragment2.f3367K : 0) == i5) {
                            return true;
                        }
                    }
                }
                i3 = i5;
            }
        }
        return false;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: E */
    public boolean mo3966E() {
        for (int i = 0; i < this.f3581c.size(); i++) {
            if (m4868D(this.f3581c.get(i))) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: F */
    public void mo3967F() {
        if (this.f3597s != null) {
            for (int i = 0; i < this.f3597s.size(); i++) {
                this.f3597s.get(i).run();
            }
            this.f3597s = null;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: G */
    public void mo3968G(Fragment.C1208f fVar) {
        for (int i = 0; i < this.f3581c.size(); i++) {
            C1252s.C1253a aVar = this.f3581c.get(i);
            if (m4868D(aVar)) {
                aVar.f3599b.mo3932s1(fVar);
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: H */
    public Fragment mo3969H(ArrayList<Fragment> arrayList, Fragment fragment) {
        for (int size = this.f3581c.size() - 1; size >= 0; size--) {
            C1252s.C1253a aVar = this.f3581c.get(size);
            int i = aVar.f3598a;
            if (i != 1) {
                if (i != 3) {
                    switch (i) {
                        case 6:
                            break;
                        case 7:
                            break;
                        case 8:
                            fragment = null;
                            break;
                        case 9:
                            fragment = aVar.f3599b;
                            break;
                        case 10:
                            aVar.f3605h = aVar.f3604g;
                            break;
                    }
                }
                arrayList.add(aVar.f3599b);
            }
            arrayList.remove(aVar.f3599b);
        }
        return fragment;
    }

    /* renamed from: a */
    public boolean mo3970a(ArrayList<C1211a> arrayList, ArrayList<Boolean> arrayList2) {
        if (C1231l.m5013s0(2)) {
            Log.v("FragmentManager", "Run: " + this);
        }
        arrayList.add(this);
        arrayList2.add(Boolean.FALSE);
        if (!this.f3587i) {
            return true;
        }
        this.f3440t.mo4133b(this);
        return true;
    }

    /* renamed from: g */
    public int mo3971g() {
        return mo3979u(false);
    }

    /* renamed from: h */
    public int mo3972h() {
        return mo3979u(true);
    }

    /* renamed from: i */
    public void mo3973i() {
        mo4247k();
        this.f3440t.mo4121R(this, false);
    }

    /* renamed from: j */
    public void mo3974j() {
        mo4247k();
        this.f3440t.mo4121R(this, true);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: l */
    public void mo3975l(int i, Fragment fragment, String str, int i2) {
        super.mo3975l(i, fragment, str, i2);
        fragment.f3362F = this.f3440t;
    }

    /* renamed from: m */
    public C1252s mo3976m(Fragment fragment) {
        C1231l lVar = fragment.f3362F;
        if (lVar == null || lVar == this.f3440t) {
            return super.mo3976m(fragment);
        }
        throw new IllegalStateException("Cannot remove Fragment attached to a different FragmentManager. Fragment " + fragment.toString() + " is already attached to a FragmentManager.");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: t */
    public void mo3977t(int i) {
        if (this.f3587i) {
            if (C1231l.m5013s0(2)) {
                Log.v("FragmentManager", "Bump nesting in " + this + " by " + i);
            }
            int size = this.f3581c.size();
            for (int i2 = 0; i2 < size; i2++) {
                C1252s.C1253a aVar = this.f3581c.get(i2);
                Fragment fragment = aVar.f3599b;
                if (fragment != null) {
                    fragment.f3361E += i;
                    if (C1231l.m5013s0(2)) {
                        Log.v("FragmentManager", "Bump nesting of " + aVar.f3599b + " to " + aVar.f3599b.f3361E);
                    }
                }
            }
        }
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(128);
        sb.append("BackStackEntry{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        if (this.f3442v >= 0) {
            sb.append(" #");
            sb.append(this.f3442v);
        }
        if (this.f3589k != null) {
            sb.append(" ");
            sb.append(this.f3589k);
        }
        sb.append("}");
        return sb.toString();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: u */
    public int mo3979u(boolean z) {
        if (!this.f3441u) {
            if (C1231l.m5013s0(2)) {
                Log.v("FragmentManager", "Commit: " + this);
                PrintWriter printWriter = new PrintWriter(new C1172c("FragmentManager"));
                mo3980v("  ", printWriter);
                printWriter.close();
            }
            this.f3441u = true;
            this.f3442v = this.f3587i ? this.f3440t.mo4138f() : -1;
            this.f3440t.mo4117O(this, z);
            return this.f3442v;
        }
        throw new IllegalStateException("commit already called");
    }

    /* renamed from: v */
    public void mo3980v(String str, PrintWriter printWriter) {
        mo3981w(str, printWriter, true);
    }

    /* renamed from: w */
    public void mo3981w(String str, PrintWriter printWriter, boolean z) {
        String str2;
        if (z) {
            printWriter.print(str);
            printWriter.print("mName=");
            printWriter.print(this.f3589k);
            printWriter.print(" mIndex=");
            printWriter.print(this.f3442v);
            printWriter.print(" mCommitted=");
            printWriter.println(this.f3441u);
            if (this.f3586h != 0) {
                printWriter.print(str);
                printWriter.print("mTransition=#");
                printWriter.print(Integer.toHexString(this.f3586h));
            }
            if (!(this.f3582d == 0 && this.f3583e == 0)) {
                printWriter.print(str);
                printWriter.print("mEnterAnim=#");
                printWriter.print(Integer.toHexString(this.f3582d));
                printWriter.print(" mExitAnim=#");
                printWriter.println(Integer.toHexString(this.f3583e));
            }
            if (!(this.f3584f == 0 && this.f3585g == 0)) {
                printWriter.print(str);
                printWriter.print("mPopEnterAnim=#");
                printWriter.print(Integer.toHexString(this.f3584f));
                printWriter.print(" mPopExitAnim=#");
                printWriter.println(Integer.toHexString(this.f3585g));
            }
            if (!(this.f3590l == 0 && this.f3591m == null)) {
                printWriter.print(str);
                printWriter.print("mBreadCrumbTitleRes=#");
                printWriter.print(Integer.toHexString(this.f3590l));
                printWriter.print(" mBreadCrumbTitleText=");
                printWriter.println(this.f3591m);
            }
            if (!(this.f3592n == 0 && this.f3593o == null)) {
                printWriter.print(str);
                printWriter.print("mBreadCrumbShortTitleRes=#");
                printWriter.print(Integer.toHexString(this.f3592n));
                printWriter.print(" mBreadCrumbShortTitleText=");
                printWriter.println(this.f3593o);
            }
        }
        if (!this.f3581c.isEmpty()) {
            printWriter.print(str);
            printWriter.println("Operations:");
            int size = this.f3581c.size();
            for (int i = 0; i < size; i++) {
                C1252s.C1253a aVar = this.f3581c.get(i);
                switch (aVar.f3598a) {
                    case 0:
                        str2 = "NULL";
                        break;
                    case 1:
                        str2 = "ADD";
                        break;
                    case 2:
                        str2 = "REPLACE";
                        break;
                    case 3:
                        str2 = "REMOVE";
                        break;
                    case 4:
                        str2 = "HIDE";
                        break;
                    case 5:
                        str2 = "SHOW";
                        break;
                    case 6:
                        str2 = "DETACH";
                        break;
                    case 7:
                        str2 = "ATTACH";
                        break;
                    case 8:
                        str2 = "SET_PRIMARY_NAV";
                        break;
                    case 9:
                        str2 = "UNSET_PRIMARY_NAV";
                        break;
                    case 10:
                        str2 = "OP_SET_MAX_LIFECYCLE";
                        break;
                    default:
                        str2 = "cmd=" + aVar.f3598a;
                        break;
                }
                printWriter.print(str);
                printWriter.print("  Op #");
                printWriter.print(i);
                printWriter.print(": ");
                printWriter.print(str2);
                printWriter.print(" ");
                printWriter.println(aVar.f3599b);
                if (z) {
                    if (!(aVar.f3600c == 0 && aVar.f3601d == 0)) {
                        printWriter.print(str);
                        printWriter.print("enterAnim=#");
                        printWriter.print(Integer.toHexString(aVar.f3600c));
                        printWriter.print(" exitAnim=#");
                        printWriter.println(Integer.toHexString(aVar.f3601d));
                    }
                    if (aVar.f3602e != 0 || aVar.f3603f != 0) {
                        printWriter.print(str);
                        printWriter.print("popEnterAnim=#");
                        printWriter.print(Integer.toHexString(aVar.f3602e));
                        printWriter.print(" popExitAnim=#");
                        printWriter.println(Integer.toHexString(aVar.f3603f));
                    }
                }
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: x */
    public void mo3982x() {
        int size = this.f3581c.size();
        for (int i = 0; i < size; i++) {
            C1252s.C1253a aVar = this.f3581c.get(i);
            Fragment fragment = aVar.f3599b;
            if (fragment != null) {
                fragment.mo3929r1(this.f3586h);
            }
            switch (aVar.f3598a) {
                case 1:
                    fragment.mo3926q1(aVar.f3600c);
                    this.f3440t.mo4125U0(fragment, false);
                    this.f3440t.mo4135d(fragment);
                    break;
                case 3:
                    fragment.mo3926q1(aVar.f3601d);
                    this.f3440t.mo4116M0(fragment);
                    break;
                case 4:
                    fragment.mo3926q1(aVar.f3601d);
                    this.f3440t.mo4153q0(fragment);
                    break;
                case 5:
                    fragment.mo3926q1(aVar.f3600c);
                    this.f3440t.mo4125U0(fragment, false);
                    this.f3440t.mo4130Y0(fragment);
                    break;
                case 6:
                    fragment.mo3926q1(aVar.f3601d);
                    this.f3440t.mo4152q(fragment);
                    break;
                case 7:
                    fragment.mo3926q1(aVar.f3600c);
                    this.f3440t.mo4125U0(fragment, false);
                    this.f3440t.mo4140h(fragment);
                    break;
                case 8:
                    this.f3440t.mo4128W0(fragment);
                    break;
                case 9:
                    this.f3440t.mo4128W0((Fragment) null);
                    break;
                case 10:
                    this.f3440t.mo4126V0(fragment, aVar.f3605h);
                    break;
                default:
                    throw new IllegalArgumentException("Unknown cmd: " + aVar.f3598a);
            }
            if (!(this.f3596r || aVar.f3598a == 1 || fragment == null)) {
                this.f3440t.mo4097A0(fragment);
            }
        }
        if (!this.f3596r) {
            C1231l lVar = this.f3440t;
            lVar.mo4099B0(lVar.f3521o, true);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: y */
    public void mo3983y(boolean z) {
        for (int size = this.f3581c.size() - 1; size >= 0; size--) {
            C1252s.C1253a aVar = this.f3581c.get(size);
            Fragment fragment = aVar.f3599b;
            if (fragment != null) {
                fragment.mo3929r1(C1231l.m4993R0(this.f3586h));
            }
            switch (aVar.f3598a) {
                case 1:
                    fragment.mo3926q1(aVar.f3603f);
                    this.f3440t.mo4125U0(fragment, true);
                    this.f3440t.mo4116M0(fragment);
                    break;
                case 3:
                    fragment.mo3926q1(aVar.f3602e);
                    this.f3440t.mo4135d(fragment);
                    break;
                case 4:
                    fragment.mo3926q1(aVar.f3602e);
                    this.f3440t.mo4130Y0(fragment);
                    break;
                case 5:
                    fragment.mo3926q1(aVar.f3603f);
                    this.f3440t.mo4125U0(fragment, true);
                    this.f3440t.mo4153q0(fragment);
                    break;
                case 6:
                    fragment.mo3926q1(aVar.f3602e);
                    this.f3440t.mo4140h(fragment);
                    break;
                case 7:
                    fragment.mo3926q1(aVar.f3603f);
                    this.f3440t.mo4125U0(fragment, true);
                    this.f3440t.mo4152q(fragment);
                    break;
                case 8:
                    this.f3440t.mo4128W0((Fragment) null);
                    break;
                case 9:
                    this.f3440t.mo4128W0(fragment);
                    break;
                case 10:
                    this.f3440t.mo4126V0(fragment, aVar.f3604g);
                    break;
                default:
                    throw new IllegalArgumentException("Unknown cmd: " + aVar.f3598a);
            }
            if (!(this.f3596r || aVar.f3598a == 3 || fragment == null)) {
                this.f3440t.mo4097A0(fragment);
            }
        }
        if (!this.f3596r && z) {
            C1231l lVar = this.f3440t;
            lVar.mo4099B0(lVar.f3521o, true);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: z */
    public Fragment mo3984z(ArrayList<Fragment> arrayList, Fragment fragment) {
        ArrayList<Fragment> arrayList2 = arrayList;
        Fragment fragment2 = fragment;
        int i = 0;
        while (i < this.f3581c.size()) {
            C1252s.C1253a aVar = this.f3581c.get(i);
            int i2 = aVar.f3598a;
            if (i2 != 1) {
                if (i2 == 2) {
                    Fragment fragment3 = aVar.f3599b;
                    int i3 = fragment3.f3367K;
                    boolean z = false;
                    for (int size = arrayList.size() - 1; size >= 0; size--) {
                        Fragment fragment4 = arrayList2.get(size);
                        if (fragment4.f3367K == i3) {
                            if (fragment4 == fragment3) {
                                z = true;
                            } else {
                                if (fragment4 == fragment2) {
                                    this.f3581c.add(i, new C1252s.C1253a(9, fragment4));
                                    i++;
                                    fragment2 = null;
                                }
                                C1252s.C1253a aVar2 = new C1252s.C1253a(3, fragment4);
                                aVar2.f3600c = aVar.f3600c;
                                aVar2.f3602e = aVar.f3602e;
                                aVar2.f3601d = aVar.f3601d;
                                aVar2.f3603f = aVar.f3603f;
                                this.f3581c.add(i, aVar2);
                                arrayList2.remove(fragment4);
                                i++;
                            }
                        }
                    }
                    if (z) {
                        this.f3581c.remove(i);
                        i--;
                    } else {
                        aVar.f3598a = 1;
                        arrayList2.add(fragment3);
                    }
                } else if (i2 == 3 || i2 == 6) {
                    arrayList2.remove(aVar.f3599b);
                    Fragment fragment5 = aVar.f3599b;
                    if (fragment5 == fragment2) {
                        this.f3581c.add(i, new C1252s.C1253a(9, fragment5));
                        i++;
                        fragment2 = null;
                    }
                } else if (i2 != 7) {
                    if (i2 == 8) {
                        this.f3581c.add(i, new C1252s.C1253a(9, fragment2));
                        i++;
                        fragment2 = aVar.f3599b;
                    }
                }
                i++;
            }
            arrayList2.add(aVar.f3599b);
            i++;
        }
        return fragment2;
    }
}
