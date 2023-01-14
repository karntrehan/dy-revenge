package p027c.p064i.p072j.p073g0;

import android.graphics.Rect;
import android.os.Build;
import android.os.Bundle;
import android.text.SpannableString;
import android.text.Spanned;
import android.text.TextUtils;
import android.text.style.ClickableSpan;
import android.util.SparseArray;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import okhttp3.internal.http2.Http2;
import okhttp3.internal.p510ws.WebSocketProtocol;
import p027c.p064i.C1825b;
import p027c.p064i.p069g.C1848a;
import p027c.p064i.p072j.p073g0.C1965f;

/* renamed from: c.i.j.g0.c */
public class C1955c {

    /* renamed from: a */
    private static int f5686a;

    /* renamed from: b */
    private final AccessibilityNodeInfo f5687b;

    /* renamed from: c */
    public int f5688c = -1;

    /* renamed from: d */
    private int f5689d = -1;

    /* renamed from: c.i.j.g0.c$a */
    public static class C1956a {

        /* renamed from: A */
        public static final C1956a f5690A;

        /* renamed from: B */
        public static final C1956a f5691B;

        /* renamed from: C */
        public static final C1956a f5692C;

        /* renamed from: D */
        public static final C1956a f5693D;

        /* renamed from: E */
        public static final C1956a f5694E;

        /* renamed from: F */
        public static final C1956a f5695F;

        /* renamed from: G */
        public static final C1956a f5696G;

        /* renamed from: H */
        public static final C1956a f5697H;

        /* renamed from: I */
        public static final C1956a f5698I;

        /* renamed from: J */
        public static final C1956a f5699J;

        /* renamed from: K */
        public static final C1956a f5700K;

        /* renamed from: L */
        public static final C1956a f5701L;

        /* renamed from: M */
        public static final C1956a f5702M;

        /* renamed from: a */
        public static final C1956a f5703a = new C1956a(1, (CharSequence) null);

        /* renamed from: b */
        public static final C1956a f5704b = new C1956a(2, (CharSequence) null);

        /* renamed from: c */
        public static final C1956a f5705c = new C1956a(4, (CharSequence) null);

        /* renamed from: d */
        public static final C1956a f5706d = new C1956a(8, (CharSequence) null);

        /* renamed from: e */
        public static final C1956a f5707e = new C1956a(16, (CharSequence) null);

        /* renamed from: f */
        public static final C1956a f5708f = new C1956a(32, (CharSequence) null);

        /* renamed from: g */
        public static final C1956a f5709g = new C1956a(64, (CharSequence) null);

        /* renamed from: h */
        public static final C1956a f5710h = new C1956a(128, (CharSequence) null);

        /* renamed from: i */
        public static final C1956a f5711i;

        /* renamed from: j */
        public static final C1956a f5712j;

        /* renamed from: k */
        public static final C1956a f5713k;

        /* renamed from: l */
        public static final C1956a f5714l;

        /* renamed from: m */
        public static final C1956a f5715m = new C1956a(4096, (CharSequence) null);

        /* renamed from: n */
        public static final C1956a f5716n = new C1956a(8192, (CharSequence) null);

        /* renamed from: o */
        public static final C1956a f5717o = new C1956a(Http2.INITIAL_MAX_FRAME_SIZE, (CharSequence) null);

        /* renamed from: p */
        public static final C1956a f5718p = new C1956a(32768, (CharSequence) null);

        /* renamed from: q */
        public static final C1956a f5719q = new C1956a(65536, (CharSequence) null);

        /* renamed from: r */
        public static final C1956a f5720r = new C1956a(131072, (CharSequence) null, C1965f.C1972g.class);

        /* renamed from: s */
        public static final C1956a f5721s = new C1956a(262144, (CharSequence) null);

        /* renamed from: t */
        public static final C1956a f5722t = new C1956a(524288, (CharSequence) null);

        /* renamed from: u */
        public static final C1956a f5723u = new C1956a(1048576, (CharSequence) null);

        /* renamed from: v */
        public static final C1956a f5724v = new C1956a(2097152, (CharSequence) null, C1965f.C1973h.class);

        /* renamed from: w */
        public static final C1956a f5725w;

        /* renamed from: x */
        public static final C1956a f5726x;

        /* renamed from: y */
        public static final C1956a f5727y;

        /* renamed from: z */
        public static final C1956a f5728z;

        /* renamed from: N */
        final Object f5729N;

        /* renamed from: O */
        private final int f5730O;

        /* renamed from: P */
        private final Class<? extends C1965f.C1966a> f5731P;

        /* renamed from: Q */
        protected final C1965f f5732Q;

        static {
            Class<C1965f.C1968c> cls = C1965f.C1968c.class;
            Class<C1965f.C1967b> cls2 = C1965f.C1967b.class;
            AccessibilityNodeInfo.AccessibilityAction accessibilityAction = null;
            f5711i = new C1956a(256, (CharSequence) null, cls2);
            f5712j = new C1956a(512, (CharSequence) null, cls2);
            f5713k = new C1956a(1024, (CharSequence) null, cls);
            f5714l = new C1956a(2048, (CharSequence) null, cls);
            int i = Build.VERSION.SDK_INT;
            f5725w = new C1956a(i >= 23 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_SHOW_ON_SCREEN : null, 16908342, (CharSequence) null, (C1965f) null, (Class<? extends C1965f.C1966a>) null);
            f5726x = new C1956a(i >= 23 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_TO_POSITION : null, 16908343, (CharSequence) null, (C1965f) null, C1965f.C1970e.class);
            f5727y = new C1956a(i >= 23 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_UP : null, 16908344, (CharSequence) null, (C1965f) null, (Class<? extends C1965f.C1966a>) null);
            f5728z = new C1956a(i >= 23 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_LEFT : null, 16908345, (CharSequence) null, (C1965f) null, (Class<? extends C1965f.C1966a>) null);
            f5690A = new C1956a(i >= 23 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_DOWN : null, 16908346, (CharSequence) null, (C1965f) null, (Class<? extends C1965f.C1966a>) null);
            f5691B = new C1956a(i >= 23 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_RIGHT : null, 16908347, (CharSequence) null, (C1965f) null, (Class<? extends C1965f.C1966a>) null);
            f5692C = new C1956a(i >= 29 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_PAGE_UP : null, 16908358, (CharSequence) null, (C1965f) null, (Class<? extends C1965f.C1966a>) null);
            f5693D = new C1956a(i >= 29 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_PAGE_DOWN : null, 16908359, (CharSequence) null, (C1965f) null, (Class<? extends C1965f.C1966a>) null);
            f5694E = new C1956a(i >= 29 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_PAGE_LEFT : null, 16908360, (CharSequence) null, (C1965f) null, (Class<? extends C1965f.C1966a>) null);
            f5695F = new C1956a(i >= 29 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_PAGE_RIGHT : null, 16908361, (CharSequence) null, (C1965f) null, (Class<? extends C1965f.C1966a>) null);
            f5696G = new C1956a(i >= 23 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_CONTEXT_CLICK : null, 16908348, (CharSequence) null, (C1965f) null, (Class<? extends C1965f.C1966a>) null);
            f5697H = new C1956a(i >= 24 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_SET_PROGRESS : null, 16908349, (CharSequence) null, (C1965f) null, C1965f.C1971f.class);
            f5698I = new C1956a(i >= 26 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_MOVE_WINDOW : null, 16908354, (CharSequence) null, (C1965f) null, C1965f.C1969d.class);
            f5699J = new C1956a(i >= 28 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_SHOW_TOOLTIP : null, 16908356, (CharSequence) null, (C1965f) null, (Class<? extends C1965f.C1966a>) null);
            f5700K = new C1956a(i >= 28 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_HIDE_TOOLTIP : null, 16908357, (CharSequence) null, (C1965f) null, (Class<? extends C1965f.C1966a>) null);
            f5701L = new C1956a(i >= 30 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_PRESS_AND_HOLD : null, 16908362, (CharSequence) null, (C1965f) null, (Class<? extends C1965f.C1966a>) null);
            if (i >= 30) {
                accessibilityAction = AccessibilityNodeInfo.AccessibilityAction.ACTION_IME_ENTER;
            }
            f5702M = new C1956a(accessibilityAction, 16908372, (CharSequence) null, (C1965f) null, (Class<? extends C1965f.C1966a>) null);
        }

        public C1956a(int i, CharSequence charSequence) {
            this((Object) null, i, charSequence, (C1965f) null, (Class<? extends C1965f.C1966a>) null);
        }

        private C1956a(int i, CharSequence charSequence, Class<? extends C1965f.C1966a> cls) {
            this((Object) null, i, charSequence, (C1965f) null, cls);
        }

        C1956a(Object obj) {
            this(obj, 0, (CharSequence) null, (C1965f) null, (Class<? extends C1965f.C1966a>) null);
        }

        C1956a(Object obj, int i, CharSequence charSequence, C1965f fVar, Class<? extends C1965f.C1966a> cls) {
            this.f5730O = i;
            this.f5732Q = fVar;
            if (Build.VERSION.SDK_INT >= 21 && obj == null) {
                obj = new AccessibilityNodeInfo.AccessibilityAction(i, charSequence);
            }
            this.f5729N = obj;
            this.f5731P = cls;
        }

        /* renamed from: a */
        public C1956a mo6622a(CharSequence charSequence, C1965f fVar) {
            return new C1956a((Object) null, this.f5730O, charSequence, fVar, this.f5731P);
        }

        /* renamed from: b */
        public int mo6623b() {
            if (Build.VERSION.SDK_INT >= 21) {
                return ((AccessibilityNodeInfo.AccessibilityAction) this.f5729N).getId();
            }
            return 0;
        }

        /* renamed from: c */
        public CharSequence mo6624c() {
            if (Build.VERSION.SDK_INT >= 21) {
                return ((AccessibilityNodeInfo.AccessibilityAction) this.f5729N).getLabel();
            }
            return null;
        }

        /* JADX WARNING: Removed duplicated region for block: B:14:0x0025  */
        /* JADX WARNING: Removed duplicated region for block: B:15:0x0028  */
        /* renamed from: d */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public boolean mo6625d(android.view.View r5, android.os.Bundle r6) {
            /*
                r4 = this;
                c.i.j.g0.f r0 = r4.f5732Q
                r1 = 0
                if (r0 == 0) goto L_0x0049
                r0 = 0
                java.lang.Class<? extends c.i.j.g0.f$a> r2 = r4.f5731P
                if (r2 == 0) goto L_0x0042
                java.lang.Class[] r3 = new java.lang.Class[r1]     // Catch:{ Exception -> 0x0020 }
                java.lang.reflect.Constructor r2 = r2.getDeclaredConstructor(r3)     // Catch:{ Exception -> 0x0020 }
                java.lang.Object[] r1 = new java.lang.Object[r1]     // Catch:{ Exception -> 0x0020 }
                java.lang.Object r1 = r2.newInstance(r1)     // Catch:{ Exception -> 0x0020 }
                c.i.j.g0.f$a r1 = (p027c.p064i.p072j.p073g0.C1965f.C1966a) r1     // Catch:{ Exception -> 0x0020 }
                r1.mo6640a(r6)     // Catch:{ Exception -> 0x001d }
                r0 = r1
                goto L_0x0042
            L_0x001d:
                r6 = move-exception
                r0 = r1
                goto L_0x0021
            L_0x0020:
                r6 = move-exception
            L_0x0021:
                java.lang.Class<? extends c.i.j.g0.f$a> r1 = r4.f5731P
                if (r1 != 0) goto L_0x0028
                java.lang.String r1 = "null"
                goto L_0x002c
            L_0x0028:
                java.lang.String r1 = r1.getName()
            L_0x002c:
                java.lang.StringBuilder r2 = new java.lang.StringBuilder
                r2.<init>()
                java.lang.String r3 = "Failed to execute command with argument class ViewCommandArgument: "
                r2.append(r3)
                r2.append(r1)
                java.lang.String r1 = r2.toString()
                java.lang.String r2 = "A11yActionCompat"
                android.util.Log.e(r2, r1, r6)
            L_0x0042:
                c.i.j.g0.f r6 = r4.f5732Q
                boolean r5 = r6.mo6639a(r5, r0)
                return r5
            L_0x0049:
                return r1
            */
            throw new UnsupportedOperationException("Method not decompiled: p027c.p064i.p072j.p073g0.C1955c.C1956a.mo6625d(android.view.View, android.os.Bundle):boolean");
        }

        public boolean equals(Object obj) {
            if (obj == null || !(obj instanceof C1956a)) {
                return false;
            }
            Object obj2 = this.f5729N;
            Object obj3 = ((C1956a) obj).f5729N;
            return obj2 == null ? obj3 == null : obj2.equals(obj3);
        }

        public int hashCode() {
            Object obj = this.f5729N;
            if (obj != null) {
                return obj.hashCode();
            }
            return 0;
        }
    }

    /* renamed from: c.i.j.g0.c$b */
    public static class C1957b {

        /* renamed from: a */
        final Object f5733a;

        C1957b(Object obj) {
            this.f5733a = obj;
        }

        /* renamed from: a */
        public static C1957b m8275a(int i, int i2, boolean z, int i3) {
            int i4 = Build.VERSION.SDK_INT;
            return i4 >= 21 ? new C1957b(AccessibilityNodeInfo.CollectionInfo.obtain(i, i2, z, i3)) : i4 >= 19 ? new C1957b(AccessibilityNodeInfo.CollectionInfo.obtain(i, i2, z)) : new C1957b((Object) null);
        }
    }

    /* renamed from: c.i.j.g0.c$c */
    public static class C1958c {

        /* renamed from: a */
        final Object f5734a;

        C1958c(Object obj) {
            this.f5734a = obj;
        }

        /* renamed from: a */
        public static C1958c m8276a(int i, int i2, int i3, int i4, boolean z) {
            return Build.VERSION.SDK_INT >= 19 ? new C1958c(AccessibilityNodeInfo.CollectionItemInfo.obtain(i, i2, i3, i4, z)) : new C1958c((Object) null);
        }

        /* renamed from: b */
        public static C1958c m8277b(int i, int i2, int i3, int i4, boolean z, boolean z2) {
            int i5 = Build.VERSION.SDK_INT;
            return i5 >= 21 ? new C1958c(AccessibilityNodeInfo.CollectionItemInfo.obtain(i, i2, i3, i4, z, z2)) : i5 >= 19 ? new C1958c(AccessibilityNodeInfo.CollectionItemInfo.obtain(i, i2, i3, i4, z)) : new C1958c((Object) null);
        }
    }

    /* renamed from: c.i.j.g0.c$d */
    public static class C1959d {

        /* renamed from: a */
        final Object f5735a;

        C1959d(Object obj) {
            this.f5735a = obj;
        }

        /* renamed from: a */
        public static C1959d m8278a(int i, float f, float f2, float f3) {
            return Build.VERSION.SDK_INT >= 19 ? new C1959d(AccessibilityNodeInfo.RangeInfo.obtain(i, f, f2, f3)) : new C1959d((Object) null);
        }
    }

    private C1955c(AccessibilityNodeInfo accessibilityNodeInfo) {
        this.f5687b = accessibilityNodeInfo;
    }

    /* renamed from: F0 */
    public static C1955c m8187F0(AccessibilityNodeInfo accessibilityNodeInfo) {
        return new C1955c(accessibilityNodeInfo);
    }

    /* renamed from: N */
    public static C1955c m8188N() {
        return m8187F0(AccessibilityNodeInfo.obtain());
    }

    /* renamed from: O */
    public static C1955c m8189O(View view) {
        return m8187F0(AccessibilityNodeInfo.obtain(view));
    }

    /* renamed from: P */
    public static C1955c m8190P(C1955c cVar) {
        return m8187F0(AccessibilityNodeInfo.obtain(cVar.f5687b));
    }

    /* renamed from: T */
    private void m8191T(View view) {
        SparseArray<WeakReference<ClickableSpan>> v = m8200v(view);
        if (v != null) {
            ArrayList arrayList = new ArrayList();
            for (int i = 0; i < v.size(); i++) {
                if (v.valueAt(i).get() == null) {
                    arrayList.add(Integer.valueOf(i));
                }
            }
            for (int i2 = 0; i2 < arrayList.size(); i2++) {
                v.remove(((Integer) arrayList.get(i2)).intValue());
            }
        }
    }

    /* renamed from: V */
    private void m8192V(int i, boolean z) {
        Bundle s = mo6609s();
        if (s != null) {
            int i2 = s.getInt("androidx.view.accessibility.AccessibilityNodeInfoCompat.BOOLEAN_PROPERTY_KEY", 0) & (~i);
            if (!z) {
                i = 0;
            }
            s.putInt("androidx.view.accessibility.AccessibilityNodeInfoCompat.BOOLEAN_PROPERTY_KEY", i | i2);
        }
    }

    /* renamed from: e */
    private void m8193e(ClickableSpan clickableSpan, Spanned spanned, int i) {
        m8195h("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_START_KEY").add(Integer.valueOf(spanned.getSpanStart(clickableSpan)));
        m8195h("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_END_KEY").add(Integer.valueOf(spanned.getSpanEnd(clickableSpan)));
        m8195h("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_FLAGS_KEY").add(Integer.valueOf(spanned.getSpanFlags(clickableSpan)));
        m8195h("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_ID_KEY").add(Integer.valueOf(i));
    }

    /* renamed from: g */
    private void m8194g() {
        if (Build.VERSION.SDK_INT >= 19) {
            this.f5687b.getExtras().remove("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_START_KEY");
            this.f5687b.getExtras().remove("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_END_KEY");
            this.f5687b.getExtras().remove("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_FLAGS_KEY");
            this.f5687b.getExtras().remove("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_ID_KEY");
        }
    }

    /* renamed from: h */
    private List<Integer> m8195h(String str) {
        if (Build.VERSION.SDK_INT < 19) {
            return new ArrayList();
        }
        ArrayList<Integer> integerArrayList = this.f5687b.getExtras().getIntegerArrayList(str);
        if (integerArrayList != null) {
            return integerArrayList;
        }
        ArrayList arrayList = new ArrayList();
        this.f5687b.getExtras().putIntegerArrayList(str, arrayList);
        return arrayList;
    }

    /* renamed from: j */
    private static String m8196j(int i) {
        if (i == 1) {
            return "ACTION_FOCUS";
        }
        if (i == 2) {
            return "ACTION_CLEAR_FOCUS";
        }
        switch (i) {
            case 4:
                return "ACTION_SELECT";
            case 8:
                return "ACTION_CLEAR_SELECTION";
            case 16:
                return "ACTION_CLICK";
            case 32:
                return "ACTION_LONG_CLICK";
            case WebSocketProtocol.B0_FLAG_RSV1 /*64*/:
                return "ACTION_ACCESSIBILITY_FOCUS";
            case 128:
                return "ACTION_CLEAR_ACCESSIBILITY_FOCUS";
            case 256:
                return "ACTION_NEXT_AT_MOVEMENT_GRANULARITY";
            case 512:
                return "ACTION_PREVIOUS_AT_MOVEMENT_GRANULARITY";
            case 1024:
                return "ACTION_NEXT_HTML_ELEMENT";
            case 2048:
                return "ACTION_PREVIOUS_HTML_ELEMENT";
            case 4096:
                return "ACTION_SCROLL_FORWARD";
            case 8192:
                return "ACTION_SCROLL_BACKWARD";
            case Http2.INITIAL_MAX_FRAME_SIZE /*16384*/:
                return "ACTION_COPY";
            case 32768:
                return "ACTION_PASTE";
            case 65536:
                return "ACTION_CUT";
            case 131072:
                return "ACTION_SET_SELECTION";
            case 262144:
                return "ACTION_EXPAND";
            case 524288:
                return "ACTION_COLLAPSE";
            case 2097152:
                return "ACTION_SET_TEXT";
            case 16908354:
                return "ACTION_MOVE_WINDOW";
            case 16908372:
                return "ACTION_IME_ENTER";
            default:
                switch (i) {
                    case 16908342:
                        return "ACTION_SHOW_ON_SCREEN";
                    case 16908343:
                        return "ACTION_SCROLL_TO_POSITION";
                    case 16908344:
                        return "ACTION_SCROLL_UP";
                    case 16908345:
                        return "ACTION_SCROLL_LEFT";
                    case 16908346:
                        return "ACTION_SCROLL_DOWN";
                    case 16908347:
                        return "ACTION_SCROLL_RIGHT";
                    case 16908348:
                        return "ACTION_CONTEXT_CLICK";
                    case 16908349:
                        return "ACTION_SET_PROGRESS";
                    default:
                        switch (i) {
                            case 16908356:
                                return "ACTION_SHOW_TOOLTIP";
                            case 16908357:
                                return "ACTION_HIDE_TOOLTIP";
                            case 16908358:
                                return "ACTION_PAGE_UP";
                            case 16908359:
                                return "ACTION_PAGE_DOWN";
                            case 16908360:
                                return "ACTION_PAGE_LEFT";
                            case 16908361:
                                return "ACTION_PAGE_RIGHT";
                            case 16908362:
                                return "ACTION_PRESS_AND_HOLD";
                            default:
                                return "ACTION_UNKNOWN";
                        }
                }
        }
    }

    /* renamed from: l */
    private boolean m8197l(int i) {
        Bundle s = mo6609s();
        return s != null && (s.getInt("androidx.view.accessibility.AccessibilityNodeInfoCompat.BOOLEAN_PROPERTY_KEY", 0) & i) == i;
    }

    /* renamed from: q */
    public static ClickableSpan[] m8198q(CharSequence charSequence) {
        if (charSequence instanceof Spanned) {
            return (ClickableSpan[]) ((Spanned) charSequence).getSpans(0, charSequence.length(), ClickableSpan.class);
        }
        return null;
    }

    /* renamed from: t */
    private SparseArray<WeakReference<ClickableSpan>> m8199t(View view) {
        SparseArray<WeakReference<ClickableSpan>> v = m8200v(view);
        if (v != null) {
            return v;
        }
        SparseArray<WeakReference<ClickableSpan>> sparseArray = new SparseArray<>();
        view.setTag(C1825b.tag_accessibility_clickable_spans, sparseArray);
        return sparseArray;
    }

    /* renamed from: v */
    private SparseArray<WeakReference<ClickableSpan>> m8200v(View view) {
        return (SparseArray) view.getTag(C1825b.tag_accessibility_clickable_spans);
    }

    /* renamed from: y */
    private boolean m8201y() {
        return !m8195h("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_START_KEY").isEmpty();
    }

    /* renamed from: z */
    private int m8202z(ClickableSpan clickableSpan, SparseArray<WeakReference<ClickableSpan>> sparseArray) {
        if (sparseArray != null) {
            for (int i = 0; i < sparseArray.size(); i++) {
                if (clickableSpan.equals((ClickableSpan) sparseArray.valueAt(i).get())) {
                    return sparseArray.keyAt(i);
                }
            }
        }
        int i2 = f5686a;
        f5686a = i2 + 1;
        return i2;
    }

    /* renamed from: A */
    public boolean mo6551A() {
        if (Build.VERSION.SDK_INT >= 16) {
            return this.f5687b.isAccessibilityFocused();
        }
        return false;
    }

    /* renamed from: A0 */
    public void mo6552A0(CharSequence charSequence) {
        if (C1848a.m7859a()) {
            this.f5687b.setStateDescription(charSequence);
        } else if (Build.VERSION.SDK_INT >= 19) {
            this.f5687b.getExtras().putCharSequence("androidx.view.accessibility.AccessibilityNodeInfoCompat.STATE_DESCRIPTION_KEY", charSequence);
        }
    }

    /* renamed from: B */
    public boolean mo6553B() {
        return this.f5687b.isCheckable();
    }

    /* renamed from: B0 */
    public void mo6554B0(CharSequence charSequence) {
        this.f5687b.setText(charSequence);
    }

    /* renamed from: C */
    public boolean mo6555C() {
        return this.f5687b.isChecked();
    }

    /* renamed from: C0 */
    public void mo6556C0(String str) {
        if (Build.VERSION.SDK_INT >= 18) {
            this.f5687b.setViewIdResourceName(str);
        }
    }

    /* renamed from: D */
    public boolean mo6557D() {
        return this.f5687b.isClickable();
    }

    /* renamed from: D0 */
    public void mo6558D0(boolean z) {
        if (Build.VERSION.SDK_INT >= 16) {
            this.f5687b.setVisibleToUser(z);
        }
    }

    /* renamed from: E */
    public boolean mo6559E() {
        return this.f5687b.isEnabled();
    }

    /* renamed from: E0 */
    public AccessibilityNodeInfo mo6560E0() {
        return this.f5687b;
    }

    /* renamed from: F */
    public boolean mo6561F() {
        return this.f5687b.isFocusable();
    }

    /* renamed from: G */
    public boolean mo6562G() {
        return this.f5687b.isFocused();
    }

    /* renamed from: H */
    public boolean mo6563H() {
        return this.f5687b.isLongClickable();
    }

    /* renamed from: I */
    public boolean mo6564I() {
        return this.f5687b.isPassword();
    }

    /* renamed from: J */
    public boolean mo6565J() {
        return this.f5687b.isScrollable();
    }

    /* renamed from: K */
    public boolean mo6566K() {
        return this.f5687b.isSelected();
    }

    /* renamed from: L */
    public boolean mo6567L() {
        return Build.VERSION.SDK_INT >= 26 ? this.f5687b.isShowingHintText() : m8197l(4);
    }

    /* renamed from: M */
    public boolean mo6568M() {
        if (Build.VERSION.SDK_INT >= 16) {
            return this.f5687b.isVisibleToUser();
        }
        return false;
    }

    /* renamed from: Q */
    public boolean mo6569Q(int i, Bundle bundle) {
        if (Build.VERSION.SDK_INT >= 16) {
            return this.f5687b.performAction(i, bundle);
        }
        return false;
    }

    /* renamed from: R */
    public void mo6570R() {
        this.f5687b.recycle();
    }

    /* renamed from: S */
    public boolean mo6571S(C1956a aVar) {
        if (Build.VERSION.SDK_INT >= 21) {
            return this.f5687b.removeAction((AccessibilityNodeInfo.AccessibilityAction) aVar.f5729N);
        }
        return false;
    }

    /* renamed from: U */
    public void mo6572U(boolean z) {
        if (Build.VERSION.SDK_INT >= 16) {
            this.f5687b.setAccessibilityFocused(z);
        }
    }

    @Deprecated
    /* renamed from: W */
    public void mo6573W(Rect rect) {
        this.f5687b.setBoundsInParent(rect);
    }

    /* renamed from: X */
    public void mo6574X(Rect rect) {
        this.f5687b.setBoundsInScreen(rect);
    }

    /* renamed from: Y */
    public void mo6575Y(boolean z) {
        this.f5687b.setCheckable(z);
    }

    /* renamed from: Z */
    public void mo6576Z(boolean z) {
        this.f5687b.setChecked(z);
    }

    /* renamed from: a */
    public void mo6577a(int i) {
        this.f5687b.addAction(i);
    }

    /* renamed from: a0 */
    public void mo6578a0(CharSequence charSequence) {
        this.f5687b.setClassName(charSequence);
    }

    /* renamed from: b */
    public void mo6579b(C1956a aVar) {
        if (Build.VERSION.SDK_INT >= 21) {
            this.f5687b.addAction((AccessibilityNodeInfo.AccessibilityAction) aVar.f5729N);
        }
    }

    /* renamed from: b0 */
    public void mo6580b0(boolean z) {
        this.f5687b.setClickable(z);
    }

    /* renamed from: c */
    public void mo6581c(View view) {
        this.f5687b.addChild(view);
    }

    /* renamed from: c0 */
    public void mo6582c0(Object obj) {
        if (Build.VERSION.SDK_INT >= 19) {
            this.f5687b.setCollectionInfo(obj == null ? null : (AccessibilityNodeInfo.CollectionInfo) ((C1957b) obj).f5733a);
        }
    }

    /* renamed from: d */
    public void mo6583d(View view, int i) {
        if (Build.VERSION.SDK_INT >= 16) {
            this.f5687b.addChild(view, i);
        }
    }

    /* renamed from: d0 */
    public void mo6584d0(Object obj) {
        if (Build.VERSION.SDK_INT >= 19) {
            this.f5687b.setCollectionItemInfo(obj == null ? null : (AccessibilityNodeInfo.CollectionItemInfo) ((C1958c) obj).f5734a);
        }
    }

    /* renamed from: e0 */
    public void mo6585e0(CharSequence charSequence) {
        this.f5687b.setContentDescription(charSequence);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof C1955c)) {
            return false;
        }
        C1955c cVar = (C1955c) obj;
        AccessibilityNodeInfo accessibilityNodeInfo = this.f5687b;
        if (accessibilityNodeInfo == null) {
            if (cVar.f5687b != null) {
                return false;
            }
        } else if (!accessibilityNodeInfo.equals(cVar.f5687b)) {
            return false;
        }
        return this.f5689d == cVar.f5689d && this.f5688c == cVar.f5688c;
    }

    /* renamed from: f */
    public void mo6587f(CharSequence charSequence, View view) {
        int i = Build.VERSION.SDK_INT;
        if (i >= 19 && i < 26) {
            m8194g();
            m8191T(view);
            ClickableSpan[] q = m8198q(charSequence);
            if (q != null && q.length > 0) {
                mo6609s().putInt("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_ACTION_ID_KEY", C1825b.accessibility_action_clickable_span);
                SparseArray<WeakReference<ClickableSpan>> t = m8199t(view);
                for (int i2 = 0; i2 < q.length; i2++) {
                    int z = m8202z(q[i2], t);
                    t.put(z, new WeakReference(q[i2]));
                    m8193e(q[i2], (Spanned) charSequence, z);
                }
            }
        }
    }

    /* renamed from: f0 */
    public void mo6588f0(boolean z) {
        if (Build.VERSION.SDK_INT >= 19) {
            this.f5687b.setContentInvalid(z);
        }
    }

    /* renamed from: g0 */
    public void mo6589g0(boolean z) {
        if (Build.VERSION.SDK_INT >= 19) {
            this.f5687b.setDismissable(z);
        }
    }

    /* renamed from: h0 */
    public void mo6590h0(boolean z) {
        this.f5687b.setEnabled(z);
    }

    public int hashCode() {
        AccessibilityNodeInfo accessibilityNodeInfo = this.f5687b;
        if (accessibilityNodeInfo == null) {
            return 0;
        }
        return accessibilityNodeInfo.hashCode();
    }

    /* renamed from: i */
    public List<C1956a> mo6592i() {
        List<AccessibilityNodeInfo.AccessibilityAction> actionList = Build.VERSION.SDK_INT >= 21 ? this.f5687b.getActionList() : null;
        if (actionList == null) {
            return Collections.emptyList();
        }
        ArrayList arrayList = new ArrayList();
        int size = actionList.size();
        for (int i = 0; i < size; i++) {
            arrayList.add(new C1956a(actionList.get(i)));
        }
        return arrayList;
    }

    /* renamed from: i0 */
    public void mo6593i0(CharSequence charSequence) {
        if (Build.VERSION.SDK_INT >= 21) {
            this.f5687b.setError(charSequence);
        }
    }

    /* renamed from: j0 */
    public void mo6594j0(boolean z) {
        this.f5687b.setFocusable(z);
    }

    /* renamed from: k */
    public int mo6595k() {
        return this.f5687b.getActions();
    }

    /* renamed from: k0 */
    public void mo6596k0(boolean z) {
        this.f5687b.setFocused(z);
    }

    /* renamed from: l0 */
    public void mo6597l0(boolean z) {
        if (Build.VERSION.SDK_INT >= 28) {
            this.f5687b.setHeading(z);
        } else {
            m8192V(2, z);
        }
    }

    @Deprecated
    /* renamed from: m */
    public void mo6598m(Rect rect) {
        this.f5687b.getBoundsInParent(rect);
    }

    /* renamed from: m0 */
    public void mo6599m0(CharSequence charSequence) {
        int i = Build.VERSION.SDK_INT;
        if (i >= 26) {
            this.f5687b.setHintText(charSequence);
        } else if (i >= 19) {
            this.f5687b.getExtras().putCharSequence("androidx.view.accessibility.AccessibilityNodeInfoCompat.HINT_TEXT_KEY", charSequence);
        }
    }

    /* renamed from: n */
    public void mo6600n(Rect rect) {
        this.f5687b.getBoundsInScreen(rect);
    }

    /* renamed from: n0 */
    public void mo6601n0(boolean z) {
        this.f5687b.setLongClickable(z);
    }

    /* renamed from: o */
    public int mo6602o() {
        return this.f5687b.getChildCount();
    }

    /* renamed from: o0 */
    public void mo6603o0(CharSequence charSequence) {
        this.f5687b.setPackageName(charSequence);
    }

    /* renamed from: p */
    public CharSequence mo6604p() {
        return this.f5687b.getClassName();
    }

    /* renamed from: p0 */
    public void mo6605p0(CharSequence charSequence) {
        int i = Build.VERSION.SDK_INT;
        if (i >= 28) {
            this.f5687b.setPaneTitle(charSequence);
        } else if (i >= 19) {
            this.f5687b.getExtras().putCharSequence("androidx.view.accessibility.AccessibilityNodeInfoCompat.PANE_TITLE_KEY", charSequence);
        }
    }

    /* renamed from: q0 */
    public void mo6606q0(View view) {
        this.f5688c = -1;
        this.f5687b.setParent(view);
    }

    /* renamed from: r */
    public CharSequence mo6607r() {
        return this.f5687b.getContentDescription();
    }

    /* renamed from: r0 */
    public void mo6608r0(View view, int i) {
        this.f5688c = i;
        if (Build.VERSION.SDK_INT >= 16) {
            this.f5687b.setParent(view, i);
        }
    }

    /* renamed from: s */
    public Bundle mo6609s() {
        return Build.VERSION.SDK_INT >= 19 ? this.f5687b.getExtras() : new Bundle();
    }

    /* renamed from: s0 */
    public void mo6610s0(C1959d dVar) {
        if (Build.VERSION.SDK_INT >= 19) {
            this.f5687b.setRangeInfo((AccessibilityNodeInfo.RangeInfo) dVar.f5735a);
        }
    }

    /* renamed from: t0 */
    public void mo6611t0(CharSequence charSequence) {
        if (Build.VERSION.SDK_INT >= 19) {
            this.f5687b.getExtras().putCharSequence("AccessibilityNodeInfo.roleDescription", charSequence);
        }
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        Rect rect = new Rect();
        mo6598m(rect);
        sb.append("; boundsInParent: " + rect);
        mo6600n(rect);
        sb.append("; boundsInScreen: " + rect);
        sb.append("; packageName: ");
        sb.append(mo6613u());
        sb.append("; className: ");
        sb.append(mo6604p());
        sb.append("; text: ");
        sb.append(mo6616w());
        sb.append("; contentDescription: ");
        sb.append(mo6607r());
        sb.append("; viewId: ");
        sb.append(mo6618x());
        sb.append("; checkable: ");
        sb.append(mo6553B());
        sb.append("; checked: ");
        sb.append(mo6555C());
        sb.append("; focusable: ");
        sb.append(mo6561F());
        sb.append("; focused: ");
        sb.append(mo6562G());
        sb.append("; selected: ");
        sb.append(mo6566K());
        sb.append("; clickable: ");
        sb.append(mo6557D());
        sb.append("; longClickable: ");
        sb.append(mo6563H());
        sb.append("; enabled: ");
        sb.append(mo6559E());
        sb.append("; password: ");
        sb.append(mo6564I());
        sb.append("; scrollable: " + mo6565J());
        sb.append("; [");
        if (Build.VERSION.SDK_INT >= 21) {
            List<C1956a> i = mo6592i();
            for (int i2 = 0; i2 < i.size(); i2++) {
                C1956a aVar = i.get(i2);
                String j = m8196j(aVar.mo6623b());
                if (j.equals("ACTION_UNKNOWN") && aVar.mo6624c() != null) {
                    j = aVar.mo6624c().toString();
                }
                sb.append(j);
                if (i2 != i.size() - 1) {
                    sb.append(", ");
                }
            }
        } else {
            int k = mo6595k();
            while (k != 0) {
                int numberOfTrailingZeros = 1 << Integer.numberOfTrailingZeros(k);
                k &= ~numberOfTrailingZeros;
                sb.append(m8196j(numberOfTrailingZeros));
                if (k != 0) {
                    sb.append(", ");
                }
            }
        }
        sb.append("]");
        return sb.toString();
    }

    /* renamed from: u */
    public CharSequence mo6613u() {
        return this.f5687b.getPackageName();
    }

    /* renamed from: u0 */
    public void mo6614u0(boolean z) {
        if (Build.VERSION.SDK_INT >= 28) {
            this.f5687b.setScreenReaderFocusable(z);
        } else {
            m8192V(1, z);
        }
    }

    /* renamed from: v0 */
    public void mo6615v0(boolean z) {
        this.f5687b.setScrollable(z);
    }

    /* renamed from: w */
    public CharSequence mo6616w() {
        if (!m8201y()) {
            return this.f5687b.getText();
        }
        List<Integer> h = m8195h("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_START_KEY");
        List<Integer> h2 = m8195h("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_END_KEY");
        List<Integer> h3 = m8195h("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_FLAGS_KEY");
        List<Integer> h4 = m8195h("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_ID_KEY");
        SpannableString spannableString = new SpannableString(TextUtils.substring(this.f5687b.getText(), 0, this.f5687b.getText().length()));
        for (int i = 0; i < h.size(); i++) {
            spannableString.setSpan(new C1953a(h4.get(i).intValue(), this, mo6609s().getInt("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_ACTION_ID_KEY")), h.get(i).intValue(), h2.get(i).intValue(), h3.get(i).intValue());
        }
        return spannableString;
    }

    /* renamed from: w0 */
    public void mo6617w0(boolean z) {
        this.f5687b.setSelected(z);
    }

    /* renamed from: x */
    public String mo6618x() {
        if (Build.VERSION.SDK_INT >= 18) {
            return this.f5687b.getViewIdResourceName();
        }
        return null;
    }

    /* renamed from: x0 */
    public void mo6619x0(boolean z) {
        if (Build.VERSION.SDK_INT >= 26) {
            this.f5687b.setShowingHintText(z);
        } else {
            m8192V(4, z);
        }
    }

    /* renamed from: y0 */
    public void mo6620y0(View view) {
        this.f5689d = -1;
        this.f5687b.setSource(view);
    }

    /* renamed from: z0 */
    public void mo6621z0(View view, int i) {
        this.f5689d = i;
        if (Build.VERSION.SDK_INT >= 16) {
            this.f5687b.setSource(view, i);
        }
    }
}
