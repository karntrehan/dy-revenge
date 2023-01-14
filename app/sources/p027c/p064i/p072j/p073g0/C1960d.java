package p027c.p064i.p072j.p073g0;

import android.os.Build;
import android.os.Bundle;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.accessibility.AccessibilityNodeProvider;
import java.util.ArrayList;
import java.util.List;

/* renamed from: c.i.j.g0.d */
public class C1960d {

    /* renamed from: a */
    private final Object f5736a;

    /* renamed from: c.i.j.g0.d$a */
    static class C1961a extends AccessibilityNodeProvider {

        /* renamed from: a */
        final C1960d f5737a;

        C1961a(C1960d dVar) {
            this.f5737a = dVar;
        }

        public AccessibilityNodeInfo createAccessibilityNodeInfo(int i) {
            C1955c b = this.f5737a.mo6629b(i);
            if (b == null) {
                return null;
            }
            return b.mo6560E0();
        }

        public List<AccessibilityNodeInfo> findAccessibilityNodeInfosByText(String str, int i) {
            List<C1955c> c = this.f5737a.mo6630c(str, i);
            if (c == null) {
                return null;
            }
            ArrayList arrayList = new ArrayList();
            int size = c.size();
            for (int i2 = 0; i2 < size; i2++) {
                arrayList.add(c.get(i2).mo6560E0());
            }
            return arrayList;
        }

        public boolean performAction(int i, int i2, Bundle bundle) {
            return this.f5737a.mo6633f(i, i2, bundle);
        }
    }

    /* renamed from: c.i.j.g0.d$b */
    static class C1962b extends C1961a {
        C1962b(C1960d dVar) {
            super(dVar);
        }

        public AccessibilityNodeInfo findFocus(int i) {
            C1955c d = this.f5737a.mo6631d(i);
            if (d == null) {
                return null;
            }
            return d.mo6560E0();
        }
    }

    /* renamed from: c.i.j.g0.d$c */
    static class C1963c extends C1962b {
        C1963c(C1960d dVar) {
            super(dVar);
        }

        public void addExtraDataToAccessibilityNodeInfo(int i, AccessibilityNodeInfo accessibilityNodeInfo, String str, Bundle bundle) {
            this.f5737a.mo6628a(i, C1955c.m8187F0(accessibilityNodeInfo), str, bundle);
        }
    }

    public C1960d() {
        int i = Build.VERSION.SDK_INT;
        this.f5736a = i >= 26 ? new C1963c(this) : i >= 19 ? new C1962b(this) : i >= 16 ? new C1961a(this) : null;
    }

    public C1960d(Object obj) {
        this.f5736a = obj;
    }

    /* renamed from: a */
    public void mo6628a(int i, C1955c cVar, String str, Bundle bundle) {
    }

    /* renamed from: b */
    public C1955c mo6629b(int i) {
        return null;
    }

    /* renamed from: c */
    public List<C1955c> mo6630c(String str, int i) {
        return null;
    }

    /* renamed from: d */
    public C1955c mo6631d(int i) {
        return null;
    }

    /* renamed from: e */
    public Object mo6632e() {
        return this.f5736a;
    }

    /* renamed from: f */
    public boolean mo6633f(int i, int i2, Bundle bundle) {
        return false;
    }
}
