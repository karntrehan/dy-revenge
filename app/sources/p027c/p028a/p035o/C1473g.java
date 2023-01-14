package p027c.p028a.p035o;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.graphics.PorterDuff;
import android.util.AttributeSet;
import android.util.Log;
import android.util.Xml;
import android.view.InflateException;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import androidx.appcompat.view.menu.C0128i;
import androidx.appcompat.view.menu.C0130j;
import androidx.appcompat.widget.C0215e0;
import androidx.appcompat.widget.C0292x0;
import java.io.IOException;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import okhttp3.internal.http2.Settings;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import p027c.p028a.C1444j;
import p027c.p064i.p066e.p067a.C1844a;
import p027c.p064i.p072j.C1907b;
import p027c.p064i.p072j.C1974h;

/* renamed from: c.a.o.g */
public class C1473g extends MenuInflater {

    /* renamed from: a */
    static final Class<?>[] f4576a;

    /* renamed from: b */
    static final Class<?>[] f4577b;

    /* renamed from: c */
    final Object[] f4578c;

    /* renamed from: d */
    final Object[] f4579d;

    /* renamed from: e */
    Context f4580e;

    /* renamed from: f */
    private Object f4581f;

    /* renamed from: c.a.o.g$a */
    private static class C1474a implements MenuItem.OnMenuItemClickListener {

        /* renamed from: a */
        private static final Class<?>[] f4582a = {MenuItem.class};

        /* renamed from: b */
        private Object f4583b;

        /* renamed from: c */
        private Method f4584c;

        public C1474a(Object obj, String str) {
            this.f4583b = obj;
            Class<?> cls = obj.getClass();
            try {
                this.f4584c = cls.getMethod(str, f4582a);
            } catch (Exception e) {
                InflateException inflateException = new InflateException("Couldn't resolve menu item onClick handler " + str + " in class " + cls.getName());
                inflateException.initCause(e);
                throw inflateException;
            }
        }

        public boolean onMenuItemClick(MenuItem menuItem) {
            try {
                if (this.f4584c.getReturnType() == Boolean.TYPE) {
                    return ((Boolean) this.f4584c.invoke(this.f4583b, new Object[]{menuItem})).booleanValue();
                }
                this.f4584c.invoke(this.f4583b, new Object[]{menuItem});
                return true;
            } catch (Exception e) {
                throw new RuntimeException(e);
            }
        }
    }

    /* renamed from: c.a.o.g$b */
    private class C1475b {

        /* renamed from: A */
        C1907b f4585A;

        /* renamed from: B */
        private CharSequence f4586B;

        /* renamed from: C */
        private CharSequence f4587C;

        /* renamed from: D */
        private ColorStateList f4588D = null;

        /* renamed from: E */
        private PorterDuff.Mode f4589E = null;

        /* renamed from: a */
        private Menu f4591a;

        /* renamed from: b */
        private int f4592b;

        /* renamed from: c */
        private int f4593c;

        /* renamed from: d */
        private int f4594d;

        /* renamed from: e */
        private int f4595e;

        /* renamed from: f */
        private boolean f4596f;

        /* renamed from: g */
        private boolean f4597g;

        /* renamed from: h */
        private boolean f4598h;

        /* renamed from: i */
        private int f4599i;

        /* renamed from: j */
        private int f4600j;

        /* renamed from: k */
        private CharSequence f4601k;

        /* renamed from: l */
        private CharSequence f4602l;

        /* renamed from: m */
        private int f4603m;

        /* renamed from: n */
        private char f4604n;

        /* renamed from: o */
        private int f4605o;

        /* renamed from: p */
        private char f4606p;

        /* renamed from: q */
        private int f4607q;

        /* renamed from: r */
        private int f4608r;

        /* renamed from: s */
        private boolean f4609s;

        /* renamed from: t */
        private boolean f4610t;

        /* renamed from: u */
        private boolean f4611u;

        /* renamed from: v */
        private int f4612v;

        /* renamed from: w */
        private int f4613w;

        /* renamed from: x */
        private String f4614x;

        /* renamed from: y */
        private String f4615y;

        /* renamed from: z */
        private String f4616z;

        public C1475b(Menu menu) {
            this.f4591a = menu;
            mo5489h();
        }

        /* renamed from: c */
        private char m6592c(String str) {
            if (str == null) {
                return 0;
            }
            return str.charAt(0);
        }

        /* renamed from: e */
        private <T> T m6593e(String str, Class<?>[] clsArr, Object[] objArr) {
            try {
                Constructor<?> constructor = Class.forName(str, false, C1473g.this.f4580e.getClassLoader()).getConstructor(clsArr);
                constructor.setAccessible(true);
                return constructor.newInstance(objArr);
            } catch (Exception e) {
                Log.w("SupportMenuInflater", "Cannot instantiate class: " + str, e);
                return null;
            }
        }

        /* renamed from: i */
        private void m6594i(MenuItem menuItem) {
            boolean z = false;
            menuItem.setChecked(this.f4609s).setVisible(this.f4610t).setEnabled(this.f4611u).setCheckable(this.f4608r >= 1).setTitleCondensed(this.f4602l).setIcon(this.f4603m);
            int i = this.f4612v;
            if (i >= 0) {
                menuItem.setShowAsAction(i);
            }
            if (this.f4616z != null) {
                if (!C1473g.this.f4580e.isRestricted()) {
                    menuItem.setOnMenuItemClickListener(new C1474a(C1473g.this.mo5481b(), this.f4616z));
                } else {
                    throw new IllegalStateException("The android:onClick attribute cannot be used within a restricted context");
                }
            }
            if (this.f4608r >= 2) {
                if (menuItem instanceof C0128i) {
                    ((C0128i) menuItem).mo714t(true);
                } else if (menuItem instanceof C0130j) {
                    ((C0130j) menuItem).mo744h(true);
                }
            }
            String str = this.f4614x;
            if (str != null) {
                menuItem.setActionView((View) m6593e(str, C1473g.f4576a, C1473g.this.f4578c));
                z = true;
            }
            int i2 = this.f4613w;
            if (i2 > 0) {
                if (!z) {
                    menuItem.setActionView(i2);
                } else {
                    Log.w("SupportMenuInflater", "Ignoring attribute 'itemActionViewLayout'. Action view already specified.");
                }
            }
            C1907b bVar = this.f4585A;
            if (bVar != null) {
                C1974h.m8290a(menuItem, bVar);
            }
            C1974h.m8292c(menuItem, this.f4586B);
            C1974h.m8296g(menuItem, this.f4587C);
            C1974h.m8291b(menuItem, this.f4604n, this.f4605o);
            C1974h.m8295f(menuItem, this.f4606p, this.f4607q);
            PorterDuff.Mode mode = this.f4589E;
            if (mode != null) {
                C1974h.m8294e(menuItem, mode);
            }
            ColorStateList colorStateList = this.f4588D;
            if (colorStateList != null) {
                C1974h.m8293d(menuItem, colorStateList);
            }
        }

        /* renamed from: a */
        public void mo5484a() {
            this.f4598h = true;
            m6594i(this.f4591a.add(this.f4592b, this.f4599i, this.f4600j, this.f4601k));
        }

        /* renamed from: b */
        public SubMenu mo5485b() {
            this.f4598h = true;
            SubMenu addSubMenu = this.f4591a.addSubMenu(this.f4592b, this.f4599i, this.f4600j, this.f4601k);
            m6594i(addSubMenu.getItem());
            return addSubMenu;
        }

        /* renamed from: d */
        public boolean mo5486d() {
            return this.f4598h;
        }

        /* renamed from: f */
        public void mo5487f(AttributeSet attributeSet) {
            TypedArray obtainStyledAttributes = C1473g.this.f4580e.obtainStyledAttributes(attributeSet, C1444j.f4416r1);
            this.f4592b = obtainStyledAttributes.getResourceId(C1444j.f4426t1, 0);
            this.f4593c = obtainStyledAttributes.getInt(C1444j.f4436v1, 0);
            this.f4594d = obtainStyledAttributes.getInt(C1444j.f4441w1, 0);
            this.f4595e = obtainStyledAttributes.getInt(C1444j.f4446x1, 0);
            this.f4596f = obtainStyledAttributes.getBoolean(C1444j.f4431u1, true);
            this.f4597g = obtainStyledAttributes.getBoolean(C1444j.f4421s1, true);
            obtainStyledAttributes.recycle();
        }

        /* renamed from: g */
        public void mo5488g(AttributeSet attributeSet) {
            C0292x0 u = C0292x0.m1406u(C1473g.this.f4580e, attributeSet, C1444j.f4451y1);
            this.f4599i = u.mo1797n(C1444j.f4207B1, 0);
            this.f4600j = (u.mo1794k(C1444j.f4222E1, this.f4593c) & -65536) | (u.mo1794k(C1444j.f4227F1, this.f4594d) & Settings.DEFAULT_INITIAL_WINDOW_SIZE);
            this.f4601k = u.mo1799p(C1444j.f4232G1);
            this.f4602l = u.mo1799p(C1444j.f4237H1);
            this.f4603m = u.mo1797n(C1444j.f4456z1, 0);
            this.f4604n = m6592c(u.mo1798o(C1444j.f4242I1));
            this.f4605o = u.mo1794k(C1444j.f4277P1, 4096);
            this.f4606p = m6592c(u.mo1798o(C1444j.f4247J1));
            this.f4607q = u.mo1794k(C1444j.f4297T1, 4096);
            int i = C1444j.f4252K1;
            this.f4608r = u.mo1802s(i) ? u.mo1784a(i, false) : this.f4595e;
            this.f4609s = u.mo1784a(C1444j.f4212C1, false);
            this.f4610t = u.mo1784a(C1444j.f4217D1, this.f4596f);
            this.f4611u = u.mo1784a(C1444j.f4202A1, this.f4597g);
            this.f4612v = u.mo1794k(C1444j.f4302U1, -1);
            this.f4616z = u.mo1798o(C1444j.f4257L1);
            this.f4613w = u.mo1797n(C1444j.f4262M1, 0);
            this.f4614x = u.mo1798o(C1444j.f4272O1);
            String o = u.mo1798o(C1444j.f4267N1);
            this.f4615y = o;
            boolean z = o != null;
            if (z && this.f4613w == 0 && this.f4614x == null) {
                this.f4585A = (C1907b) m6593e(o, C1473g.f4577b, C1473g.this.f4579d);
            } else {
                if (z) {
                    Log.w("SupportMenuInflater", "Ignoring attribute 'actionProviderClass'. Action view already specified.");
                }
                this.f4585A = null;
            }
            this.f4586B = u.mo1799p(C1444j.f4282Q1);
            this.f4587C = u.mo1799p(C1444j.f4307V1);
            int i2 = C1444j.f4292S1;
            if (u.mo1802s(i2)) {
                this.f4589E = C0215e0.m1121e(u.mo1794k(i2, -1), this.f4589E);
            } else {
                this.f4589E = null;
            }
            int i3 = C1444j.f4287R1;
            if (u.mo1802s(i3)) {
                this.f4588D = u.mo1786c(i3);
            } else {
                this.f4588D = null;
            }
            u.mo1803w();
            this.f4598h = false;
        }

        /* renamed from: h */
        public void mo5489h() {
            this.f4592b = 0;
            this.f4593c = 0;
            this.f4594d = 0;
            this.f4595e = 0;
            this.f4596f = true;
            this.f4597g = true;
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v1, resolved type: java.lang.Class<?>[]} */
    /* JADX WARNING: Multi-variable type inference failed */
    static {
        /*
            r0 = 1
            java.lang.Class[] r0 = new java.lang.Class[r0]
            r1 = 0
            java.lang.Class<android.content.Context> r2 = android.content.Context.class
            r0[r1] = r2
            f4576a = r0
            f4577b = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p027c.p028a.p035o.C1473g.<clinit>():void");
    }

    public C1473g(Context context) {
        super(context);
        this.f4580e = context;
        Object[] objArr = {context};
        this.f4578c = objArr;
        this.f4579d = objArr;
    }

    /* renamed from: a */
    private Object m6589a(Object obj) {
        return (!(obj instanceof Activity) && (obj instanceof ContextWrapper)) ? m6589a(((ContextWrapper) obj).getBaseContext()) : obj;
    }

    /* renamed from: c */
    private void m6590c(XmlPullParser xmlPullParser, AttributeSet attributeSet, Menu menu) {
        C1475b bVar = new C1475b(menu);
        int eventType = xmlPullParser.getEventType();
        while (true) {
            if (eventType != 2) {
                eventType = xmlPullParser.next();
                if (eventType == 1) {
                    break;
                }
            } else {
                String name = xmlPullParser.getName();
                if (name.equals("menu")) {
                    eventType = xmlPullParser.next();
                } else {
                    throw new RuntimeException("Expecting menu, got " + name);
                }
            }
        }
        String str = null;
        boolean z = false;
        boolean z2 = false;
        while (!z) {
            if (eventType != 1) {
                if (eventType != 2) {
                    if (eventType == 3) {
                        String name2 = xmlPullParser.getName();
                        if (z2 && name2.equals(str)) {
                            str = null;
                            z2 = false;
                        } else if (name2.equals("group")) {
                            bVar.mo5489h();
                        } else if (name2.equals("item")) {
                            if (!bVar.mo5486d()) {
                                C1907b bVar2 = bVar.f4585A;
                                if (bVar2 == null || !bVar2.mo778a()) {
                                    bVar.mo5484a();
                                } else {
                                    bVar.mo5485b();
                                }
                            }
                        } else if (name2.equals("menu")) {
                            z = true;
                        }
                    }
                } else if (!z2) {
                    String name3 = xmlPullParser.getName();
                    if (name3.equals("group")) {
                        bVar.mo5487f(attributeSet);
                    } else if (name3.equals("item")) {
                        bVar.mo5488g(attributeSet);
                    } else if (name3.equals("menu")) {
                        m6590c(xmlPullParser, attributeSet, bVar.mo5485b());
                    } else {
                        str = name3;
                        z2 = true;
                    }
                }
                eventType = xmlPullParser.next();
            } else {
                throw new RuntimeException("Unexpected end of document");
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public Object mo5481b() {
        if (this.f4581f == null) {
            this.f4581f = m6589a(this.f4580e);
        }
        return this.f4581f;
    }

    public void inflate(int i, Menu menu) {
        if (!(menu instanceof C1844a)) {
            super.inflate(i, menu);
            return;
        }
        XmlResourceParser xmlResourceParser = null;
        try {
            xmlResourceParser = this.f4580e.getResources().getLayout(i);
            m6590c(xmlResourceParser, Xml.asAttributeSet(xmlResourceParser), menu);
            if (xmlResourceParser != null) {
                xmlResourceParser.close();
            }
        } catch (XmlPullParserException e) {
            throw new InflateException("Error inflating menu XML", e);
        } catch (IOException e2) {
            throw new InflateException("Error inflating menu XML", e2);
        } catch (Throwable th) {
            if (xmlResourceParser != null) {
                xmlResourceParser.close();
            }
            throw th;
        }
    }
}
