package p027c.p064i.p072j;

import android.os.Build;
import android.os.Bundle;
import android.text.style.ClickableSpan;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.accessibility.AccessibilityNodeProvider;
import java.lang.ref.WeakReference;
import java.util.Collections;
import java.util.List;
import p027c.p064i.C1825b;
import p027c.p064i.p072j.p073g0.C1955c;
import p027c.p064i.p072j.p073g0.C1960d;

/* renamed from: c.i.j.a */
public class C1904a {

    /* renamed from: a */
    private static final View.AccessibilityDelegate f5597a = new View.AccessibilityDelegate();

    /* renamed from: b */
    private final View.AccessibilityDelegate f5598b;

    /* renamed from: c */
    private final View.AccessibilityDelegate f5599c;

    /* renamed from: c.i.j.a$a */
    static final class C1905a extends View.AccessibilityDelegate {

        /* renamed from: a */
        final C1904a f5600a;

        C1905a(C1904a aVar) {
            this.f5600a = aVar;
        }

        public boolean dispatchPopulateAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
            return this.f5600a.mo5206a(view, accessibilityEvent);
        }

        public AccessibilityNodeProvider getAccessibilityNodeProvider(View view) {
            C1960d b = this.f5600a.mo5207b(view);
            if (b != null) {
                return (AccessibilityNodeProvider) b.mo6632e();
            }
            return null;
        }

        public void onInitializeAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
            this.f5600a.mo3775f(view, accessibilityEvent);
        }

        public void onInitializeAccessibilityNodeInfo(View view, AccessibilityNodeInfo accessibilityNodeInfo) {
            C1955c F0 = C1955c.m8187F0(accessibilityNodeInfo);
            F0.mo6614u0(C1988t.m8364V(view));
            F0.mo6597l0(C1988t.m8358P(view));
            F0.mo6605p0(C1988t.m8395n(view));
            F0.mo6552A0(C1988t.m8345G(view));
            this.f5600a.mo3776g(view, F0);
            F0.mo6587f(accessibilityNodeInfo.getText(), view);
            List<C1955c.C1956a> c = C1904a.m7977c(view);
            for (int i = 0; i < c.size(); i++) {
                F0.mo6579b(c.get(i));
            }
        }

        public void onPopulateAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
            this.f5600a.mo5208h(view, accessibilityEvent);
        }

        public boolean onRequestSendAccessibilityEvent(ViewGroup viewGroup, View view, AccessibilityEvent accessibilityEvent) {
            return this.f5600a.mo5209i(viewGroup, view, accessibilityEvent);
        }

        public boolean performAccessibilityAction(View view, int i, Bundle bundle) {
            return this.f5600a.mo3777j(view, i, bundle);
        }

        public void sendAccessibilityEvent(View view, int i) {
            this.f5600a.mo5210l(view, i);
        }

        public void sendAccessibilityEventUnchecked(View view, AccessibilityEvent accessibilityEvent) {
            this.f5600a.mo5211m(view, accessibilityEvent);
        }
    }

    public C1904a() {
        this(f5597a);
    }

    public C1904a(View.AccessibilityDelegate accessibilityDelegate) {
        this.f5598b = accessibilityDelegate;
        this.f5599c = new C1905a(this);
    }

    /* renamed from: c */
    static List<C1955c.C1956a> m7977c(View view) {
        List<C1955c.C1956a> list = (List) view.getTag(C1825b.tag_accessibility_actions);
        return list == null ? Collections.emptyList() : list;
    }

    /* renamed from: e */
    private boolean m7978e(ClickableSpan clickableSpan, View view) {
        if (clickableSpan != null) {
            ClickableSpan[] q = C1955c.m8198q(view.createAccessibilityNodeInfo().getText());
            int i = 0;
            while (q != null && i < q.length) {
                if (clickableSpan.equals(q[i])) {
                    return true;
                }
                i++;
            }
        }
        return false;
    }

    /* renamed from: k */
    private boolean m7979k(int i, View view) {
        WeakReference weakReference;
        SparseArray sparseArray = (SparseArray) view.getTag(C1825b.tag_accessibility_clickable_spans);
        if (sparseArray == null || (weakReference = (WeakReference) sparseArray.get(i)) == null) {
            return false;
        }
        ClickableSpan clickableSpan = (ClickableSpan) weakReference.get();
        if (!m7978e(clickableSpan, view)) {
            return false;
        }
        clickableSpan.onClick(view);
        return true;
    }

    /* renamed from: a */
    public boolean mo5206a(View view, AccessibilityEvent accessibilityEvent) {
        return this.f5598b.dispatchPopulateAccessibilityEvent(view, accessibilityEvent);
    }

    /* renamed from: b */
    public C1960d mo5207b(View view) {
        AccessibilityNodeProvider accessibilityNodeProvider;
        if (Build.VERSION.SDK_INT < 16 || (accessibilityNodeProvider = this.f5598b.getAccessibilityNodeProvider(view)) == null) {
            return null;
        }
        return new C1960d(accessibilityNodeProvider);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public View.AccessibilityDelegate mo6438d() {
        return this.f5599c;
    }

    /* renamed from: f */
    public void mo3775f(View view, AccessibilityEvent accessibilityEvent) {
        this.f5598b.onInitializeAccessibilityEvent(view, accessibilityEvent);
    }

    /* renamed from: g */
    public void mo3776g(View view, C1955c cVar) {
        this.f5598b.onInitializeAccessibilityNodeInfo(view, cVar.mo6560E0());
    }

    /* renamed from: h */
    public void mo5208h(View view, AccessibilityEvent accessibilityEvent) {
        this.f5598b.onPopulateAccessibilityEvent(view, accessibilityEvent);
    }

    /* renamed from: i */
    public boolean mo5209i(ViewGroup viewGroup, View view, AccessibilityEvent accessibilityEvent) {
        return this.f5598b.onRequestSendAccessibilityEvent(viewGroup, view, accessibilityEvent);
    }

    /* renamed from: j */
    public boolean mo3777j(View view, int i, Bundle bundle) {
        List<C1955c.C1956a> c = m7977c(view);
        boolean z = false;
        int i2 = 0;
        while (true) {
            if (i2 >= c.size()) {
                break;
            }
            C1955c.C1956a aVar = c.get(i2);
            if (aVar.mo6623b() == i) {
                z = aVar.mo6625d(view, bundle);
                break;
            }
            i2++;
        }
        if (!z && Build.VERSION.SDK_INT >= 16) {
            z = this.f5598b.performAccessibilityAction(view, i, bundle);
        }
        return (z || i != C1825b.accessibility_action_clickable_span) ? z : m7979k(bundle.getInt("ACCESSIBILITY_CLICKABLE_SPAN_ID", -1), view);
    }

    /* renamed from: l */
    public void mo5210l(View view, int i) {
        this.f5598b.sendAccessibilityEvent(view, i);
    }

    /* renamed from: m */
    public void mo5211m(View view, AccessibilityEvent accessibilityEvent) {
        this.f5598b.sendAccessibilityEventUnchecked(view, accessibilityEvent);
    }
}
