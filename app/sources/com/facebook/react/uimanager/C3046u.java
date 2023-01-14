package com.facebook.react.uimanager;

import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.text.SpannableString;
import android.text.style.URLSpan;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import com.facebook.react.C2766g;
import com.facebook.react.C2767h;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.Dynamic;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.bridge.ReactNoCrashSoftException;
import com.facebook.react.bridge.ReactSoftExceptionLogger;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.ReadableMapKeySetIterator;
import com.facebook.react.bridge.ReadableType;
import com.facebook.react.bridge.UIManager;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.uimanager.events.C2944c;
import com.facebook.react.uimanager.events.C2945d;
import java.util.HashMap;
import okhttp3.HttpUrl;
import p027c.p064i.p072j.C1904a;
import p027c.p064i.p072j.C1988t;
import p027c.p064i.p072j.p073g0.C1955c;

/* renamed from: com.facebook.react.uimanager.u */
public class C3046u extends C1904a {

    /* renamed from: d */
    private static int f8453d = 1056964608;

    /* renamed from: e */
    public static final HashMap<String, Integer> f8454e;

    /* renamed from: f */
    private Handler f8455f = new C3047a();

    /* renamed from: g */
    private final HashMap<Integer, String> f8456g = new HashMap<>();

    /* renamed from: com.facebook.react.uimanager.u$a */
    class C3047a extends Handler {
        C3047a() {
        }

        public void handleMessage(Message message) {
            ((View) message.obj).sendAccessibilityEvent(4);
        }
    }

    /* renamed from: com.facebook.react.uimanager.u$b */
    class C3048b extends C2944c {

        /* renamed from: h */
        final /* synthetic */ WritableMap f8458h;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C3048b(int i, int i2, WritableMap writableMap) {
            super(i, i2);
            this.f8458h = writableMap;
        }

        /* access modifiers changed from: protected */
        /* renamed from: i */
        public WritableMap mo9629i() {
            return this.f8458h;
        }

        /* renamed from: j */
        public String mo9630j() {
            return "topAccessibilityAction";
        }
    }

    /* renamed from: com.facebook.react.uimanager.u$c */
    static /* synthetic */ class C3049c {

        /* renamed from: a */
        static final /* synthetic */ int[] f8460a;

        /* JADX WARNING: Can't wrap try/catch for region: R(58:0|1|2|3|4|5|6|7|8|9|10|11|12|13|14|15|16|17|18|19|20|21|22|23|24|25|26|27|28|29|30|31|32|33|34|35|36|37|38|39|40|41|42|43|44|45|46|47|48|49|50|51|52|53|54|55|56|(3:57|58|60)) */
        /* JADX WARNING: Can't wrap try/catch for region: R(60:0|1|2|3|4|5|6|7|8|9|10|11|12|13|14|15|16|17|18|19|20|21|22|23|24|25|26|27|28|29|30|31|32|33|34|35|36|37|38|39|40|41|42|43|44|45|46|47|48|49|50|51|52|53|54|55|56|57|58|60) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x003e */
        /* JADX WARNING: Missing exception handler attribute for start block: B:13:0x0049 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:15:0x0054 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:17:0x0060 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:19:0x006c */
        /* JADX WARNING: Missing exception handler attribute for start block: B:21:0x0078 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:23:0x0084 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:25:0x0090 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:27:0x009c */
        /* JADX WARNING: Missing exception handler attribute for start block: B:29:0x00a8 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:31:0x00b4 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:33:0x00c0 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:35:0x00cc */
        /* JADX WARNING: Missing exception handler attribute for start block: B:37:0x00d8 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:39:0x00e4 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:41:0x00f0 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:43:0x00fc */
        /* JADX WARNING: Missing exception handler attribute for start block: B:45:0x0108 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:47:0x0114 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:49:0x0120 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:51:0x012c */
        /* JADX WARNING: Missing exception handler attribute for start block: B:53:0x0138 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:55:0x0144 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:57:0x0150 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0028 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x0033 */
        static {
            /*
                com.facebook.react.uimanager.u$d[] r0 = com.facebook.react.uimanager.C3046u.C3050d.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f8460a = r0
                com.facebook.react.uimanager.u$d r1 = com.facebook.react.uimanager.C3046u.C3050d.BUTTON     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f8460a     // Catch:{ NoSuchFieldError -> 0x001d }
                com.facebook.react.uimanager.u$d r1 = com.facebook.react.uimanager.C3046u.C3050d.TOGGLEBUTTON     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f8460a     // Catch:{ NoSuchFieldError -> 0x0028 }
                com.facebook.react.uimanager.u$d r1 = com.facebook.react.uimanager.C3046u.C3050d.SEARCH     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = f8460a     // Catch:{ NoSuchFieldError -> 0x0033 }
                com.facebook.react.uimanager.u$d r1 = com.facebook.react.uimanager.C3046u.C3050d.IMAGE     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                int[] r0 = f8460a     // Catch:{ NoSuchFieldError -> 0x003e }
                com.facebook.react.uimanager.u$d r1 = com.facebook.react.uimanager.C3046u.C3050d.IMAGEBUTTON     // Catch:{ NoSuchFieldError -> 0x003e }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x003e }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x003e }
            L_0x003e:
                int[] r0 = f8460a     // Catch:{ NoSuchFieldError -> 0x0049 }
                com.facebook.react.uimanager.u$d r1 = com.facebook.react.uimanager.C3046u.C3050d.KEYBOARDKEY     // Catch:{ NoSuchFieldError -> 0x0049 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0049 }
                r2 = 6
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0049 }
            L_0x0049:
                int[] r0 = f8460a     // Catch:{ NoSuchFieldError -> 0x0054 }
                com.facebook.react.uimanager.u$d r1 = com.facebook.react.uimanager.C3046u.C3050d.TEXT     // Catch:{ NoSuchFieldError -> 0x0054 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0054 }
                r2 = 7
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0054 }
            L_0x0054:
                int[] r0 = f8460a     // Catch:{ NoSuchFieldError -> 0x0060 }
                com.facebook.react.uimanager.u$d r1 = com.facebook.react.uimanager.C3046u.C3050d.ADJUSTABLE     // Catch:{ NoSuchFieldError -> 0x0060 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0060 }
                r2 = 8
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0060 }
            L_0x0060:
                int[] r0 = f8460a     // Catch:{ NoSuchFieldError -> 0x006c }
                com.facebook.react.uimanager.u$d r1 = com.facebook.react.uimanager.C3046u.C3050d.CHECKBOX     // Catch:{ NoSuchFieldError -> 0x006c }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x006c }
                r2 = 9
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x006c }
            L_0x006c:
                int[] r0 = f8460a     // Catch:{ NoSuchFieldError -> 0x0078 }
                com.facebook.react.uimanager.u$d r1 = com.facebook.react.uimanager.C3046u.C3050d.RADIO     // Catch:{ NoSuchFieldError -> 0x0078 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0078 }
                r2 = 10
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0078 }
            L_0x0078:
                int[] r0 = f8460a     // Catch:{ NoSuchFieldError -> 0x0084 }
                com.facebook.react.uimanager.u$d r1 = com.facebook.react.uimanager.C3046u.C3050d.SPINBUTTON     // Catch:{ NoSuchFieldError -> 0x0084 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0084 }
                r2 = 11
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0084 }
            L_0x0084:
                int[] r0 = f8460a     // Catch:{ NoSuchFieldError -> 0x0090 }
                com.facebook.react.uimanager.u$d r1 = com.facebook.react.uimanager.C3046u.C3050d.SWITCH     // Catch:{ NoSuchFieldError -> 0x0090 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0090 }
                r2 = 12
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0090 }
            L_0x0090:
                int[] r0 = f8460a     // Catch:{ NoSuchFieldError -> 0x009c }
                com.facebook.react.uimanager.u$d r1 = com.facebook.react.uimanager.C3046u.C3050d.LIST     // Catch:{ NoSuchFieldError -> 0x009c }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x009c }
                r2 = 13
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x009c }
            L_0x009c:
                int[] r0 = f8460a     // Catch:{ NoSuchFieldError -> 0x00a8 }
                com.facebook.react.uimanager.u$d r1 = com.facebook.react.uimanager.C3046u.C3050d.NONE     // Catch:{ NoSuchFieldError -> 0x00a8 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x00a8 }
                r2 = 14
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x00a8 }
            L_0x00a8:
                int[] r0 = f8460a     // Catch:{ NoSuchFieldError -> 0x00b4 }
                com.facebook.react.uimanager.u$d r1 = com.facebook.react.uimanager.C3046u.C3050d.LINK     // Catch:{ NoSuchFieldError -> 0x00b4 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x00b4 }
                r2 = 15
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x00b4 }
            L_0x00b4:
                int[] r0 = f8460a     // Catch:{ NoSuchFieldError -> 0x00c0 }
                com.facebook.react.uimanager.u$d r1 = com.facebook.react.uimanager.C3046u.C3050d.SUMMARY     // Catch:{ NoSuchFieldError -> 0x00c0 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x00c0 }
                r2 = 16
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x00c0 }
            L_0x00c0:
                int[] r0 = f8460a     // Catch:{ NoSuchFieldError -> 0x00cc }
                com.facebook.react.uimanager.u$d r1 = com.facebook.react.uimanager.C3046u.C3050d.HEADER     // Catch:{ NoSuchFieldError -> 0x00cc }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x00cc }
                r2 = 17
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x00cc }
            L_0x00cc:
                int[] r0 = f8460a     // Catch:{ NoSuchFieldError -> 0x00d8 }
                com.facebook.react.uimanager.u$d r1 = com.facebook.react.uimanager.C3046u.C3050d.ALERT     // Catch:{ NoSuchFieldError -> 0x00d8 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x00d8 }
                r2 = 18
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x00d8 }
            L_0x00d8:
                int[] r0 = f8460a     // Catch:{ NoSuchFieldError -> 0x00e4 }
                com.facebook.react.uimanager.u$d r1 = com.facebook.react.uimanager.C3046u.C3050d.COMBOBOX     // Catch:{ NoSuchFieldError -> 0x00e4 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x00e4 }
                r2 = 19
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x00e4 }
            L_0x00e4:
                int[] r0 = f8460a     // Catch:{ NoSuchFieldError -> 0x00f0 }
                com.facebook.react.uimanager.u$d r1 = com.facebook.react.uimanager.C3046u.C3050d.MENU     // Catch:{ NoSuchFieldError -> 0x00f0 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x00f0 }
                r2 = 20
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x00f0 }
            L_0x00f0:
                int[] r0 = f8460a     // Catch:{ NoSuchFieldError -> 0x00fc }
                com.facebook.react.uimanager.u$d r1 = com.facebook.react.uimanager.C3046u.C3050d.MENUBAR     // Catch:{ NoSuchFieldError -> 0x00fc }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x00fc }
                r2 = 21
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x00fc }
            L_0x00fc:
                int[] r0 = f8460a     // Catch:{ NoSuchFieldError -> 0x0108 }
                com.facebook.react.uimanager.u$d r1 = com.facebook.react.uimanager.C3046u.C3050d.MENUITEM     // Catch:{ NoSuchFieldError -> 0x0108 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0108 }
                r2 = 22
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0108 }
            L_0x0108:
                int[] r0 = f8460a     // Catch:{ NoSuchFieldError -> 0x0114 }
                com.facebook.react.uimanager.u$d r1 = com.facebook.react.uimanager.C3046u.C3050d.PROGRESSBAR     // Catch:{ NoSuchFieldError -> 0x0114 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0114 }
                r2 = 23
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0114 }
            L_0x0114:
                int[] r0 = f8460a     // Catch:{ NoSuchFieldError -> 0x0120 }
                com.facebook.react.uimanager.u$d r1 = com.facebook.react.uimanager.C3046u.C3050d.RADIOGROUP     // Catch:{ NoSuchFieldError -> 0x0120 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0120 }
                r2 = 24
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0120 }
            L_0x0120:
                int[] r0 = f8460a     // Catch:{ NoSuchFieldError -> 0x012c }
                com.facebook.react.uimanager.u$d r1 = com.facebook.react.uimanager.C3046u.C3050d.SCROLLBAR     // Catch:{ NoSuchFieldError -> 0x012c }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x012c }
                r2 = 25
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x012c }
            L_0x012c:
                int[] r0 = f8460a     // Catch:{ NoSuchFieldError -> 0x0138 }
                com.facebook.react.uimanager.u$d r1 = com.facebook.react.uimanager.C3046u.C3050d.TAB     // Catch:{ NoSuchFieldError -> 0x0138 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0138 }
                r2 = 26
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0138 }
            L_0x0138:
                int[] r0 = f8460a     // Catch:{ NoSuchFieldError -> 0x0144 }
                com.facebook.react.uimanager.u$d r1 = com.facebook.react.uimanager.C3046u.C3050d.TABLIST     // Catch:{ NoSuchFieldError -> 0x0144 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0144 }
                r2 = 27
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0144 }
            L_0x0144:
                int[] r0 = f8460a     // Catch:{ NoSuchFieldError -> 0x0150 }
                com.facebook.react.uimanager.u$d r1 = com.facebook.react.uimanager.C3046u.C3050d.TIMER     // Catch:{ NoSuchFieldError -> 0x0150 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0150 }
                r2 = 28
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0150 }
            L_0x0150:
                int[] r0 = f8460a     // Catch:{ NoSuchFieldError -> 0x015c }
                com.facebook.react.uimanager.u$d r1 = com.facebook.react.uimanager.C3046u.C3050d.TOOLBAR     // Catch:{ NoSuchFieldError -> 0x015c }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x015c }
                r2 = 29
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x015c }
            L_0x015c:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.facebook.react.uimanager.C3046u.C3049c.<clinit>():void");
        }
    }

    /* renamed from: com.facebook.react.uimanager.u$d */
    public enum C3050d {
        NONE,
        BUTTON,
        TOGGLEBUTTON,
        LINK,
        SEARCH,
        IMAGE,
        IMAGEBUTTON,
        KEYBOARDKEY,
        TEXT,
        ADJUSTABLE,
        SUMMARY,
        HEADER,
        ALERT,
        CHECKBOX,
        COMBOBOX,
        MENU,
        MENUBAR,
        MENUITEM,
        PROGRESSBAR,
        RADIO,
        RADIOGROUP,
        SCROLLBAR,
        SPINBUTTON,
        SWITCH,
        TAB,
        TABLIST,
        TIMER,
        LIST,
        TOOLBAR;

        /* renamed from: e */
        public static C3050d m12082e(String str) {
            for (C3050d dVar : values()) {
                if (dVar.name().equalsIgnoreCase(str)) {
                    return dVar;
                }
            }
            throw new IllegalArgumentException("Invalid accessibility role value: " + str);
        }

        /* renamed from: g */
        public static String m12083g(C3050d dVar) {
            switch (C3049c.f8460a[dVar.ordinal()]) {
                case 1:
                    return "android.widget.Button";
                case 2:
                    return "android.widget.ToggleButton";
                case 3:
                    return "android.widget.EditText";
                case 4:
                    return "android.widget.ImageView";
                case 5:
                    return "android.widget.ImageButon";
                case 6:
                    return "android.inputmethodservice.Keyboard$Key";
                case 7:
                    return "android.widget.TextView";
                case 8:
                    return "android.widget.SeekBar";
                case 9:
                    return "android.widget.CheckBox";
                case 10:
                    return "android.widget.RadioButton";
                case 11:
                    return "android.widget.SpinButton";
                case 12:
                    return "android.widget.Switch";
                case 13:
                    return "android.widget.AbsListView";
                case 14:
                case 15:
                case 16:
                case 17:
                case 18:
                case 19:
                case 20:
                case 21:
                case 22:
                case 23:
                case 24:
                case 25:
                case 26:
                case 27:
                case 28:
                case 29:
                    return "android.view.View";
                default:
                    throw new IllegalArgumentException("Invalid accessibility role value: " + dVar);
            }
        }
    }

    static {
        HashMap<String, Integer> hashMap = new HashMap<>();
        f8454e = hashMap;
        hashMap.put("activate", Integer.valueOf(C1955c.C1956a.f5707e.mo6623b()));
        hashMap.put("longpress", Integer.valueOf(C1955c.C1956a.f5708f.mo6623b()));
        hashMap.put("increment", Integer.valueOf(C1955c.C1956a.f5715m.mo6623b()));
        hashMap.put("decrement", Integer.valueOf(C1955c.C1956a.f5716n.mo6623b()));
    }

    /* renamed from: n */
    private void m12073n(View view) {
        if (this.f8455f.hasMessages(1, view)) {
            this.f8455f.removeMessages(1, view);
        }
        this.f8455f.sendMessageDelayed(this.f8455f.obtainMessage(1, view), 200);
    }

    /* renamed from: o */
    public static void m12074o(View view) {
        if (C1988t.m8354L(view)) {
            return;
        }
        if (view.getTag(C2766g.accessibility_role) != null || view.getTag(C2766g.accessibility_state) != null || view.getTag(C2766g.accessibility_actions) != null || view.getTag(C2766g.react_test_id) != null) {
            C1988t.m8394m0(view, new C3046u());
        }
    }

    /* renamed from: p */
    public static void m12075p(C1955c cVar, C3050d dVar, Context context) {
        int i;
        if (dVar == null) {
            dVar = C3050d.NONE;
        }
        cVar.mo6578a0(C3050d.m12083g(dVar));
        if (dVar.equals(C3050d.LINK)) {
            cVar.mo6611t0(context.getString(C2767h.link_description));
            if (cVar.mo6607r() != null) {
                SpannableString spannableString = new SpannableString(cVar.mo6607r());
                spannableString.setSpan(new URLSpan(HttpUrl.FRAGMENT_ENCODE_SET), 0, spannableString.length(), 0);
                cVar.mo6585e0(spannableString);
            }
            if (cVar.mo6616w() != null) {
                SpannableString spannableString2 = new SpannableString(cVar.mo6616w());
                spannableString2.setSpan(new URLSpan(HttpUrl.FRAGMENT_ENCODE_SET), 0, spannableString2.length(), 0);
                cVar.mo6554B0(spannableString2);
                return;
            }
            return;
        }
        if (dVar.equals(C3050d.IMAGE)) {
            i = C2767h.image_description;
        } else {
            if (dVar.equals(C3050d.IMAGEBUTTON)) {
                cVar.mo6611t0(context.getString(C2767h.imagebutton_description));
            } else if (!dVar.equals(C3050d.BUTTON)) {
                if (dVar.equals(C3050d.TOGGLEBUTTON)) {
                    cVar.mo6580b0(true);
                    cVar.mo6575Y(true);
                    return;
                } else if (dVar.equals(C3050d.SUMMARY)) {
                    i = C2767h.summary_description;
                } else if (dVar.equals(C3050d.HEADER)) {
                    cVar.mo6584d0(C1955c.C1958c.m8276a(0, 1, 0, 1, true));
                    return;
                } else if (dVar.equals(C3050d.ALERT)) {
                    i = C2767h.alert_description;
                } else if (dVar.equals(C3050d.COMBOBOX)) {
                    i = C2767h.combobox_description;
                } else if (dVar.equals(C3050d.MENU)) {
                    i = C2767h.menu_description;
                } else if (dVar.equals(C3050d.MENUBAR)) {
                    i = C2767h.menubar_description;
                } else if (dVar.equals(C3050d.MENUITEM)) {
                    i = C2767h.menuitem_description;
                } else if (dVar.equals(C3050d.PROGRESSBAR)) {
                    i = C2767h.progressbar_description;
                } else if (dVar.equals(C3050d.RADIOGROUP)) {
                    i = C2767h.radiogroup_description;
                } else if (dVar.equals(C3050d.SCROLLBAR)) {
                    i = C2767h.scrollbar_description;
                } else if (dVar.equals(C3050d.SPINBUTTON)) {
                    i = C2767h.spinbutton_description;
                } else if (dVar.equals(C3050d.TAB)) {
                    i = C2767h.rn_tab_description;
                } else if (dVar.equals(C3050d.TABLIST)) {
                    i = C2767h.tablist_description;
                } else if (dVar.equals(C3050d.TIMER)) {
                    i = C2767h.timer_description;
                } else if (dVar.equals(C3050d.TOOLBAR)) {
                    i = C2767h.toolbar_description;
                } else {
                    return;
                }
            }
            cVar.mo6580b0(true);
            return;
        }
        cVar.mo6611t0(context.getString(i));
    }

    /* renamed from: q */
    private static void m12076q(C1955c cVar, ReadableMap readableMap, Context context) {
        ReadableMapKeySetIterator keySetIterator = readableMap.keySetIterator();
        while (keySetIterator.hasNextKey()) {
            String nextKey = keySetIterator.nextKey();
            Dynamic dynamic = readableMap.getDynamic(nextKey);
            if (nextKey.equals("selected") && dynamic.getType() == ReadableType.Boolean) {
                cVar.mo6617w0(dynamic.asBoolean());
            } else if (nextKey.equals("disabled") && dynamic.getType() == ReadableType.Boolean) {
                cVar.mo6590h0(!dynamic.asBoolean());
            } else if (nextKey.equals("checked") && dynamic.getType() == ReadableType.Boolean) {
                boolean asBoolean = dynamic.asBoolean();
                cVar.mo6575Y(true);
                cVar.mo6576Z(asBoolean);
                if (cVar.mo6604p().equals(C3050d.m12083g(C3050d.SWITCH))) {
                    cVar.mo6554B0(context.getString(asBoolean ? C2767h.state_on_description : C2767h.state_off_description));
                }
            }
        }
    }

    /* renamed from: f */
    public void mo3775f(View view, AccessibilityEvent accessibilityEvent) {
        ReadableType readableType;
        super.mo3775f(view, accessibilityEvent);
        ReadableMap readableMap = (ReadableMap) view.getTag(C2766g.accessibility_value);
        if (readableMap != null && readableMap.hasKey("min") && readableMap.hasKey("now") && readableMap.hasKey("max")) {
            Dynamic dynamic = readableMap.getDynamic("min");
            Dynamic dynamic2 = readableMap.getDynamic("now");
            Dynamic dynamic3 = readableMap.getDynamic("max");
            if (dynamic != null && dynamic.getType() == (readableType = ReadableType.Number) && dynamic2 != null && dynamic2.getType() == readableType && dynamic3 != null && dynamic3.getType() == readableType) {
                int asInt = dynamic.asInt();
                int asInt2 = dynamic2.asInt();
                int asInt3 = dynamic3.asInt();
                if (asInt3 > asInt && asInt2 >= asInt && asInt3 >= asInt2) {
                    accessibilityEvent.setItemCount(asInt3 - asInt);
                    accessibilityEvent.setCurrentItemIndex(asInt2);
                }
            }
        }
    }

    /* renamed from: g */
    public void mo3776g(View view, C1955c cVar) {
        ReadableType readableType;
        super.mo3776g(view, cVar);
        C3050d dVar = (C3050d) view.getTag(C2766g.accessibility_role);
        if (dVar != null) {
            m12075p(cVar, dVar, view.getContext());
        }
        ReadableMap readableMap = (ReadableMap) view.getTag(C2766g.accessibility_state);
        if (readableMap != null) {
            m12076q(cVar, readableMap, view.getContext());
        }
        ReadableArray readableArray = (ReadableArray) view.getTag(C2766g.accessibility_actions);
        if (readableArray != null) {
            int i = 0;
            while (i < readableArray.size()) {
                ReadableMap map = readableArray.getMap(i);
                if (map.hasKey("name")) {
                    int i2 = f8453d;
                    String string = map.hasKey("label") ? map.getString("label") : null;
                    HashMap<String, Integer> hashMap = f8454e;
                    if (hashMap.containsKey(map.getString("name"))) {
                        i2 = hashMap.get(map.getString("name")).intValue();
                    } else {
                        f8453d++;
                    }
                    this.f8456g.put(Integer.valueOf(i2), map.getString("name"));
                    cVar.mo6579b(new C1955c.C1956a(i2, string));
                    i++;
                } else {
                    throw new IllegalArgumentException("Unknown accessibility action.");
                }
            }
        }
        ReadableMap readableMap2 = (ReadableMap) view.getTag(C2766g.accessibility_value);
        if (readableMap2 != null && readableMap2.hasKey("min") && readableMap2.hasKey("now") && readableMap2.hasKey("max")) {
            Dynamic dynamic = readableMap2.getDynamic("min");
            Dynamic dynamic2 = readableMap2.getDynamic("now");
            Dynamic dynamic3 = readableMap2.getDynamic("max");
            if (dynamic != null && dynamic.getType() == (readableType = ReadableType.Number) && dynamic2 != null && dynamic2.getType() == readableType && dynamic3 != null && dynamic3.getType() == readableType) {
                int asInt = dynamic.asInt();
                int asInt2 = dynamic2.asInt();
                int asInt3 = dynamic3.asInt();
                if (asInt3 > asInt && asInt2 >= asInt && asInt3 >= asInt2) {
                    cVar.mo6610s0(C1955c.C1959d.m8278a(0, (float) asInt, (float) asInt3, (float) asInt2));
                }
            }
        }
        String str = (String) view.getTag(C2766g.react_test_id);
        if (str != null) {
            cVar.mo6556C0(str);
        }
    }

    /* renamed from: j */
    public boolean mo3777j(View view, int i, Bundle bundle) {
        if (!this.f8456g.containsKey(Integer.valueOf(i))) {
            return super.mo3777j(view, i, bundle);
        }
        WritableMap createMap = Arguments.createMap();
        createMap.putString("actionName", this.f8456g.get(Integer.valueOf(i)));
        ReactContext reactContext = (ReactContext) view.getContext();
        if (reactContext.hasActiveReactInstance()) {
            int id = view.getId();
            int d = C3051u0.m12087d(reactContext);
            UIManager f = C3051u0.m12089f(reactContext, id);
            if (f != null) {
                ((C2945d) f.getEventDispatcher()).mo9651c(new C3048b(d, id, createMap));
            }
        } else {
            ReactSoftExceptionLogger.logSoftException("ReactAccessibilityDelegate", new ReactNoCrashSoftException("Cannot get RCTEventEmitter, no CatalystInstance"));
        }
        C3050d dVar = (C3050d) view.getTag(C2766g.accessibility_role);
        ReadableMap readableMap = (ReadableMap) view.getTag(C2766g.accessibility_value);
        if (dVar != C3050d.ADJUSTABLE) {
            return true;
        }
        if (i != C1955c.C1956a.f5715m.mo6623b() && i != C1955c.C1956a.f5716n.mo6623b()) {
            return true;
        }
        if (readableMap != null && !readableMap.hasKey("text")) {
            m12073n(view);
        }
        return super.mo3777j(view, i, bundle);
    }
}
