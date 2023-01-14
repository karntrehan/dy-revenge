package androidx.appcompat.view.menu;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.util.SparseArray;
import android.view.ContextMenu;
import android.view.KeyCharacterMap;
import android.view.KeyEvent;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import android.view.ViewConfiguration;
import androidx.core.content.C1135a;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import okhttp3.internal.http2.Settings;
import p027c.p064i.p066e.p067a.C1844a;
import p027c.p064i.p072j.C2002u;

/* renamed from: androidx.appcompat.view.menu.g */
public class C0124g implements C1844a {

    /* renamed from: a */
    private static final int[] f522a = {1, 4, 5, 3, 2, 0};

    /* renamed from: A */
    private boolean f523A;

    /* renamed from: b */
    private final Context f524b;

    /* renamed from: c */
    private final Resources f525c;

    /* renamed from: d */
    private boolean f526d;

    /* renamed from: e */
    private boolean f527e;

    /* renamed from: f */
    private C0125a f528f;

    /* renamed from: g */
    private ArrayList<C0128i> f529g;

    /* renamed from: h */
    private ArrayList<C0128i> f530h;

    /* renamed from: i */
    private boolean f531i;

    /* renamed from: j */
    private ArrayList<C0128i> f532j;

    /* renamed from: k */
    private ArrayList<C0128i> f533k;

    /* renamed from: l */
    private boolean f534l;

    /* renamed from: m */
    private int f535m = 0;

    /* renamed from: n */
    private ContextMenu.ContextMenuInfo f536n;

    /* renamed from: o */
    CharSequence f537o;

    /* renamed from: p */
    Drawable f538p;

    /* renamed from: q */
    View f539q;

    /* renamed from: r */
    private boolean f540r = false;

    /* renamed from: s */
    private boolean f541s = false;

    /* renamed from: t */
    private boolean f542t = false;

    /* renamed from: u */
    private boolean f543u = false;

    /* renamed from: v */
    private boolean f544v = false;

    /* renamed from: w */
    private ArrayList<C0128i> f545w = new ArrayList<>();

    /* renamed from: x */
    private CopyOnWriteArrayList<WeakReference<C0139m>> f546x = new CopyOnWriteArrayList<>();

    /* renamed from: y */
    private C0128i f547y;

    /* renamed from: z */
    private boolean f548z = false;

    /* renamed from: androidx.appcompat.view.menu.g$a */
    public interface C0125a {
        /* renamed from: a */
        boolean mo299a(C0124g gVar, MenuItem menuItem);

        /* renamed from: b */
        void mo301b(C0124g gVar);
    }

    /* renamed from: androidx.appcompat.view.menu.g$b */
    public interface C0126b {
        /* renamed from: a */
        boolean mo448a(C0128i iVar);
    }

    public C0124g(Context context) {
        this.f524b = context;
        this.f525c = context.getResources();
        this.f529g = new ArrayList<>();
        this.f530h = new ArrayList<>();
        this.f531i = true;
        this.f532j = new ArrayList<>();
        this.f533k = new ArrayList<>();
        this.f534l = true;
        m606b0(true);
    }

    /* renamed from: B */
    private static int m603B(int i) {
        int i2 = (-65536 & i) >> 16;
        if (i2 >= 0) {
            int[] iArr = f522a;
            if (i2 < iArr.length) {
                return (i & Settings.DEFAULT_INITIAL_WINDOW_SIZE) | (iArr[i2] << 16);
            }
        }
        throw new IllegalArgumentException("order does not contain a valid category.");
    }

    /* renamed from: N */
    private void m604N(int i, boolean z) {
        if (i >= 0 && i < this.f529g.size()) {
            this.f529g.remove(i);
            if (z) {
                mo594K(true);
            }
        }
    }

    /* renamed from: W */
    private void m605W(int i, CharSequence charSequence, int i2, Drawable drawable, View view) {
        Resources C = mo586C();
        if (view != null) {
            this.f539q = view;
            this.f537o = null;
            this.f538p = null;
        } else {
            if (i > 0) {
                this.f537o = C.getText(i);
            } else if (charSequence != null) {
                this.f537o = charSequence;
            }
            if (i2 > 0) {
                this.f538p = C1135a.m4419e(mo653u(), i2);
            } else if (drawable != null) {
                this.f538p = drawable;
            }
            this.f539q = null;
        }
        mo594K(false);
    }

    /* renamed from: b0 */
    private void m606b0(boolean z) {
        boolean z2 = true;
        if (!z || this.f525c.getConfiguration().keyboard == 1 || !C2002u.m8473e(ViewConfiguration.get(this.f524b), this.f524b)) {
            z2 = false;
        }
        this.f527e = z2;
    }

    /* renamed from: g */
    private C0128i m607g(int i, int i2, int i3, int i4, CharSequence charSequence, int i5) {
        return new C0128i(this, i, i2, i3, i4, charSequence, i5);
    }

    /* renamed from: i */
    private void m608i(boolean z) {
        if (!this.f546x.isEmpty()) {
            mo626d0();
            Iterator<WeakReference<C0139m>> it = this.f546x.iterator();
            while (it.hasNext()) {
                WeakReference next = it.next();
                C0139m mVar = (C0139m) next.get();
                if (mVar == null) {
                    this.f546x.remove(next);
                } else {
                    mVar.mo525d(z);
                }
            }
            mo621c0();
        }
    }

    /* renamed from: j */
    private boolean m609j(C0148r rVar, C0139m mVar) {
        boolean z = false;
        if (this.f546x.isEmpty()) {
            return false;
        }
        if (mVar != null) {
            z = mVar.mo531k(rVar);
        }
        Iterator<WeakReference<C0139m>> it = this.f546x.iterator();
        while (it.hasNext()) {
            WeakReference next = it.next();
            C0139m mVar2 = (C0139m) next.get();
            if (mVar2 == null) {
                this.f546x.remove(next);
            } else if (!z) {
                z = mVar2.mo531k(rVar);
            }
        }
        return z;
    }

    /* renamed from: n */
    private static int m610n(ArrayList<C0128i> arrayList, int i) {
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            if (arrayList.get(size).mo667f() <= i) {
                return size + 1;
            }
        }
        return 0;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: A */
    public boolean mo585A() {
        return this.f543u;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: C */
    public Resources mo586C() {
        return this.f525c;
    }

    /* renamed from: D */
    public C0124g mo587D() {
        return this;
    }

    /* renamed from: E */
    public ArrayList<C0128i> mo588E() {
        if (!this.f531i) {
            return this.f530h;
        }
        this.f530h.clear();
        int size = this.f529g.size();
        for (int i = 0; i < size; i++) {
            C0128i iVar = this.f529g.get(i);
            if (iVar.isVisible()) {
                this.f530h.add(iVar);
            }
        }
        this.f531i = false;
        this.f534l = true;
        return this.f530h;
    }

    /* renamed from: F */
    public boolean mo589F() {
        return this.f548z;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: G */
    public boolean mo590G() {
        return this.f526d;
    }

    /* renamed from: H */
    public boolean mo591H() {
        return this.f527e;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: I */
    public void mo592I(C0128i iVar) {
        this.f534l = true;
        mo594K(true);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: J */
    public void mo593J(C0128i iVar) {
        this.f531i = true;
        mo594K(true);
    }

    /* renamed from: K */
    public void mo594K(boolean z) {
        if (!this.f540r) {
            if (z) {
                this.f531i = true;
                this.f534l = true;
            }
            m608i(z);
            return;
        }
        this.f541s = true;
        if (z) {
            this.f542t = true;
        }
    }

    /* renamed from: L */
    public boolean mo595L(MenuItem menuItem, int i) {
        return mo596M(menuItem, (C0139m) null, i);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x002b, code lost:
        if (r1 != false) goto L_0x002d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x003c, code lost:
        if ((r9 & 1) == 0) goto L_0x002d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x0068, code lost:
        if (r1 == false) goto L_0x002d;
     */
    /* renamed from: M */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean mo596M(android.view.MenuItem r7, androidx.appcompat.view.menu.C0139m r8, int r9) {
        /*
            r6 = this;
            androidx.appcompat.view.menu.i r7 = (androidx.appcompat.view.menu.C0128i) r7
            r0 = 0
            if (r7 == 0) goto L_0x006c
            boolean r1 = r7.isEnabled()
            if (r1 != 0) goto L_0x000c
            goto L_0x006c
        L_0x000c:
            boolean r1 = r7.mo689k()
            c.i.j.b r2 = r7.mo464b()
            r3 = 1
            if (r2 == 0) goto L_0x001f
            boolean r4 = r2.mo778a()
            if (r4 == 0) goto L_0x001f
            r4 = 1
            goto L_0x0020
        L_0x001f:
            r4 = 0
        L_0x0020:
            boolean r5 = r7.mo688j()
            if (r5 == 0) goto L_0x0031
            boolean r7 = r7.expandActionView()
            r1 = r1 | r7
            if (r1 == 0) goto L_0x006b
        L_0x002d:
            r6.mo627e(r3)
            goto L_0x006b
        L_0x0031:
            boolean r5 = r7.hasSubMenu()
            if (r5 != 0) goto L_0x003f
            if (r4 == 0) goto L_0x003a
            goto L_0x003f
        L_0x003a:
            r7 = r9 & 1
            if (r7 != 0) goto L_0x006b
            goto L_0x002d
        L_0x003f:
            r9 = r9 & 4
            if (r9 != 0) goto L_0x0046
            r6.mo627e(r0)
        L_0x0046:
            boolean r9 = r7.hasSubMenu()
            if (r9 != 0) goto L_0x0058
            androidx.appcompat.view.menu.r r9 = new androidx.appcompat.view.menu.r
            android.content.Context r0 = r6.mo653u()
            r9.<init>(r0, r6, r7)
            r7.mo719x(r9)
        L_0x0058:
            android.view.SubMenu r7 = r7.getSubMenu()
            androidx.appcompat.view.menu.r r7 = (androidx.appcompat.view.menu.C0148r) r7
            if (r4 == 0) goto L_0x0063
            r2.mo781f(r7)
        L_0x0063:
            boolean r7 = r6.m609j(r7, r8)
            r1 = r1 | r7
            if (r1 != 0) goto L_0x006b
            goto L_0x002d
        L_0x006b:
            return r1
        L_0x006c:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.view.menu.C0124g.mo596M(android.view.MenuItem, androidx.appcompat.view.menu.m, int):boolean");
    }

    /* renamed from: O */
    public void mo597O(C0139m mVar) {
        Iterator<WeakReference<C0139m>> it = this.f546x.iterator();
        while (it.hasNext()) {
            WeakReference next = it.next();
            C0139m mVar2 = (C0139m) next.get();
            if (mVar2 == null || mVar2 == mVar) {
                this.f546x.remove(next);
            }
        }
    }

    /* renamed from: P */
    public void mo598P(Bundle bundle) {
        MenuItem findItem;
        if (bundle != null) {
            SparseArray sparseParcelableArray = bundle.getSparseParcelableArray(mo652t());
            int size = size();
            for (int i = 0; i < size; i++) {
                MenuItem item = getItem(i);
                View actionView = item.getActionView();
                if (!(actionView == null || actionView.getId() == -1)) {
                    actionView.restoreHierarchyState(sparseParcelableArray);
                }
                if (item.hasSubMenu()) {
                    ((C0148r) item.getSubMenu()).mo598P(bundle);
                }
            }
            int i2 = bundle.getInt("android:menu:expandedactionview");
            if (i2 > 0 && (findItem = findItem(i2)) != null) {
                findItem.expandActionView();
            }
        }
    }

    /* renamed from: Q */
    public void mo599Q(Bundle bundle) {
        int size = size();
        SparseArray sparseArray = null;
        for (int i = 0; i < size; i++) {
            MenuItem item = getItem(i);
            View actionView = item.getActionView();
            if (!(actionView == null || actionView.getId() == -1)) {
                if (sparseArray == null) {
                    sparseArray = new SparseArray();
                }
                actionView.saveHierarchyState(sparseArray);
                if (item.isActionViewExpanded()) {
                    bundle.putInt("android:menu:expandedactionview", item.getItemId());
                }
            }
            if (item.hasSubMenu()) {
                ((C0148r) item.getSubMenu()).mo599Q(bundle);
            }
        }
        if (sparseArray != null) {
            bundle.putSparseParcelableArray(mo652t(), sparseArray);
        }
    }

    /* renamed from: R */
    public void mo600R(C0125a aVar) {
        this.f528f = aVar;
    }

    /* renamed from: S */
    public C0124g mo601S(int i) {
        this.f535m = i;
        return this;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: T */
    public void mo602T(MenuItem menuItem) {
        int groupId = menuItem.getGroupId();
        int size = this.f529g.size();
        mo626d0();
        for (int i = 0; i < size; i++) {
            C0128i iVar = this.f529g.get(i);
            if (iVar.getGroupId() == groupId && iVar.mo691m() && iVar.isCheckable()) {
                iVar.mo697s(iVar == menuItem);
            }
        }
        mo621c0();
    }

    /* access modifiers changed from: protected */
    /* renamed from: U */
    public C0124g mo603U(int i) {
        m605W(0, (CharSequence) null, i, (Drawable) null, (View) null);
        return this;
    }

    /* access modifiers changed from: protected */
    /* renamed from: V */
    public C0124g mo604V(Drawable drawable) {
        m605W(0, (CharSequence) null, 0, drawable, (View) null);
        return this;
    }

    /* access modifiers changed from: protected */
    /* renamed from: X */
    public C0124g mo605X(int i) {
        m605W(i, (CharSequence) null, 0, (Drawable) null, (View) null);
        return this;
    }

    /* access modifiers changed from: protected */
    /* renamed from: Y */
    public C0124g mo606Y(CharSequence charSequence) {
        m605W(0, charSequence, 0, (Drawable) null, (View) null);
        return this;
    }

    /* access modifiers changed from: protected */
    /* renamed from: Z */
    public C0124g mo607Z(View view) {
        m605W(0, (CharSequence) null, 0, (Drawable) null, view);
        return this;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public MenuItem mo608a(int i, int i2, int i3, CharSequence charSequence) {
        int B = m603B(i3);
        C0128i g = m607g(i, i2, i3, B, charSequence, this.f535m);
        ContextMenu.ContextMenuInfo contextMenuInfo = this.f536n;
        if (contextMenuInfo != null) {
            g.mo717v(contextMenuInfo);
        }
        ArrayList<C0128i> arrayList = this.f529g;
        arrayList.add(m610n(arrayList, B), g);
        mo594K(true);
        return g;
    }

    /* renamed from: a0 */
    public void mo609a0(boolean z) {
        this.f523A = z;
    }

    public MenuItem add(int i) {
        return mo608a(0, 0, 0, this.f525c.getString(i));
    }

    public MenuItem add(int i, int i2, int i3, int i4) {
        return mo608a(i, i2, i3, this.f525c.getString(i4));
    }

    public MenuItem add(int i, int i2, int i3, CharSequence charSequence) {
        return mo608a(i, i2, i3, charSequence);
    }

    public MenuItem add(CharSequence charSequence) {
        return mo608a(0, 0, 0, charSequence);
    }

    public int addIntentOptions(int i, int i2, int i3, ComponentName componentName, Intent[] intentArr, Intent intent, int i4, MenuItem[] menuItemArr) {
        int i5;
        PackageManager packageManager = this.f524b.getPackageManager();
        List<ResolveInfo> queryIntentActivityOptions = packageManager.queryIntentActivityOptions(componentName, intentArr, intent, 0);
        int size = queryIntentActivityOptions != null ? queryIntentActivityOptions.size() : 0;
        if ((i4 & 1) == 0) {
            removeGroup(i);
        }
        for (int i6 = 0; i6 < size; i6++) {
            ResolveInfo resolveInfo = queryIntentActivityOptions.get(i6);
            int i7 = resolveInfo.specificIndex;
            Intent intent2 = new Intent(i7 < 0 ? intent : intentArr[i7]);
            ActivityInfo activityInfo = resolveInfo.activityInfo;
            intent2.setComponent(new ComponentName(activityInfo.applicationInfo.packageName, activityInfo.name));
            MenuItem intent3 = add(i, i2, i3, resolveInfo.loadLabel(packageManager)).setIcon(resolveInfo.loadIcon(packageManager)).setIntent(intent2);
            if (menuItemArr != null && (i5 = resolveInfo.specificIndex) >= 0) {
                menuItemArr[i5] = intent3;
            }
        }
        return size;
    }

    public SubMenu addSubMenu(int i) {
        return addSubMenu(0, 0, 0, (CharSequence) this.f525c.getString(i));
    }

    public SubMenu addSubMenu(int i, int i2, int i3, int i4) {
        return addSubMenu(i, i2, i3, (CharSequence) this.f525c.getString(i4));
    }

    public SubMenu addSubMenu(int i, int i2, int i3, CharSequence charSequence) {
        C0128i iVar = (C0128i) mo608a(i, i2, i3, charSequence);
        C0148r rVar = new C0148r(this.f524b, this, iVar);
        iVar.mo719x(rVar);
        return rVar;
    }

    public SubMenu addSubMenu(CharSequence charSequence) {
        return addSubMenu(0, 0, 0, charSequence);
    }

    /* renamed from: b */
    public void mo619b(C0139m mVar) {
        mo620c(mVar, this.f524b);
    }

    /* renamed from: c */
    public void mo620c(C0139m mVar, Context context) {
        this.f546x.add(new WeakReference(mVar));
        mVar.mo529i(context, this);
        this.f534l = true;
    }

    /* renamed from: c0 */
    public void mo621c0() {
        this.f540r = false;
        if (this.f541s) {
            this.f541s = false;
            mo594K(this.f542t);
        }
    }

    public void clear() {
        C0128i iVar = this.f547y;
        if (iVar != null) {
            mo628f(iVar);
        }
        this.f529g.clear();
        mo594K(true);
    }

    public void clearHeader() {
        this.f538p = null;
        this.f537o = null;
        this.f539q = null;
        mo594K(false);
    }

    public void close() {
        mo627e(true);
    }

    /* renamed from: d */
    public void mo625d() {
        C0125a aVar = this.f528f;
        if (aVar != null) {
            aVar.mo301b(this);
        }
    }

    /* renamed from: d0 */
    public void mo626d0() {
        if (!this.f540r) {
            this.f540r = true;
            this.f541s = false;
            this.f542t = false;
        }
    }

    /* renamed from: e */
    public final void mo627e(boolean z) {
        if (!this.f544v) {
            this.f544v = true;
            Iterator<WeakReference<C0139m>> it = this.f546x.iterator();
            while (it.hasNext()) {
                WeakReference next = it.next();
                C0139m mVar = (C0139m) next.get();
                if (mVar == null) {
                    this.f546x.remove(next);
                } else {
                    mVar.mo524c(this, z);
                }
            }
            this.f544v = false;
        }
    }

    /* renamed from: f */
    public boolean mo628f(C0128i iVar) {
        boolean z = false;
        if (!this.f546x.isEmpty() && this.f547y == iVar) {
            mo626d0();
            Iterator<WeakReference<C0139m>> it = this.f546x.iterator();
            while (it.hasNext()) {
                WeakReference next = it.next();
                C0139m mVar = (C0139m) next.get();
                if (mVar == null) {
                    this.f546x.remove(next);
                } else {
                    z = mVar.mo526f(this, iVar);
                    if (z) {
                        break;
                    }
                }
            }
            mo621c0();
            if (z) {
                this.f547y = null;
            }
        }
        return z;
    }

    public MenuItem findItem(int i) {
        MenuItem findItem;
        int size = size();
        for (int i2 = 0; i2 < size; i2++) {
            C0128i iVar = this.f529g.get(i2);
            if (iVar.getItemId() == i) {
                return iVar;
            }
            if (iVar.hasSubMenu() && (findItem = iVar.getSubMenu().findItem(i)) != null) {
                return findItem;
            }
        }
        return null;
    }

    public MenuItem getItem(int i) {
        return this.f529g.get(i);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: h */
    public boolean mo631h(C0124g gVar, MenuItem menuItem) {
        C0125a aVar = this.f528f;
        return aVar != null && aVar.mo299a(gVar, menuItem);
    }

    public boolean hasVisibleItems() {
        if (this.f523A) {
            return true;
        }
        int size = size();
        for (int i = 0; i < size; i++) {
            if (this.f529g.get(i).isVisible()) {
                return true;
            }
        }
        return false;
    }

    public boolean isShortcutKey(int i, KeyEvent keyEvent) {
        return mo638p(i, keyEvent) != null;
    }

    /* renamed from: k */
    public boolean mo634k(C0128i iVar) {
        boolean z = false;
        if (this.f546x.isEmpty()) {
            return false;
        }
        mo626d0();
        Iterator<WeakReference<C0139m>> it = this.f546x.iterator();
        while (it.hasNext()) {
            WeakReference next = it.next();
            C0139m mVar = (C0139m) next.get();
            if (mVar == null) {
                this.f546x.remove(next);
            } else {
                z = mVar.mo527g(this, iVar);
                if (z) {
                    break;
                }
            }
        }
        mo621c0();
        if (z) {
            this.f547y = iVar;
        }
        return z;
    }

    /* renamed from: l */
    public int mo635l(int i) {
        return mo636m(i, 0);
    }

    /* renamed from: m */
    public int mo636m(int i, int i2) {
        int size = size();
        if (i2 < 0) {
            i2 = 0;
        }
        while (i2 < size) {
            if (this.f529g.get(i2).getGroupId() == i) {
                return i2;
            }
            i2++;
        }
        return -1;
    }

    /* renamed from: o */
    public int mo637o(int i) {
        int size = size();
        for (int i2 = 0; i2 < size; i2++) {
            if (this.f529g.get(i2).getItemId() == i) {
                return i2;
            }
        }
        return -1;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: p */
    public C0128i mo638p(int i, KeyEvent keyEvent) {
        ArrayList<C0128i> arrayList = this.f545w;
        arrayList.clear();
        mo641q(arrayList, i, keyEvent);
        if (arrayList.isEmpty()) {
            return null;
        }
        int metaState = keyEvent.getMetaState();
        KeyCharacterMap.KeyData keyData = new KeyCharacterMap.KeyData();
        keyEvent.getKeyData(keyData);
        int size = arrayList.size();
        if (size == 1) {
            return arrayList.get(0);
        }
        boolean G = mo590G();
        for (int i2 = 0; i2 < size; i2++) {
            C0128i iVar = arrayList.get(i2);
            char alphabeticShortcut = G ? iVar.getAlphabeticShortcut() : iVar.getNumericShortcut();
            char[] cArr = keyData.meta;
            if ((alphabeticShortcut == cArr[0] && (metaState & 2) == 0) || ((alphabeticShortcut == cArr[2] && (metaState & 2) != 0) || (G && alphabeticShortcut == 8 && i == 67))) {
                return iVar;
            }
        }
        return null;
    }

    public boolean performIdentifierAction(int i, int i2) {
        return mo595L(findItem(i), i2);
    }

    public boolean performShortcut(int i, KeyEvent keyEvent, int i2) {
        C0128i p = mo638p(i, keyEvent);
        boolean L = p != null ? mo595L(p, i2) : false;
        if ((i2 & 2) != 0) {
            mo627e(true);
        }
        return L;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: q */
    public void mo641q(List<C0128i> list, int i, KeyEvent keyEvent) {
        boolean G = mo590G();
        int modifiers = keyEvent.getModifiers();
        KeyCharacterMap.KeyData keyData = new KeyCharacterMap.KeyData();
        if (keyEvent.getKeyData(keyData) || i == 67) {
            int size = this.f529g.size();
            for (int i2 = 0; i2 < size; i2++) {
                C0128i iVar = this.f529g.get(i2);
                if (iVar.hasSubMenu()) {
                    ((C0124g) iVar.getSubMenu()).mo641q(list, i, keyEvent);
                }
                char alphabeticShortcut = G ? iVar.getAlphabeticShortcut() : iVar.getNumericShortcut();
                if (((modifiers & 69647) == ((G ? iVar.getAlphabeticModifiers() : iVar.getNumericModifiers()) & 69647)) && alphabeticShortcut != 0) {
                    char[] cArr = keyData.meta;
                    if ((alphabeticShortcut == cArr[0] || alphabeticShortcut == cArr[2] || (G && alphabeticShortcut == 8 && i == 67)) && iVar.isEnabled()) {
                        list.add(iVar);
                    }
                }
            }
        }
    }

    /* renamed from: r */
    public void mo642r() {
        ArrayList<C0128i> E = mo588E();
        if (this.f534l) {
            Iterator<WeakReference<C0139m>> it = this.f546x.iterator();
            boolean z = false;
            while (it.hasNext()) {
                WeakReference next = it.next();
                C0139m mVar = (C0139m) next.get();
                if (mVar == null) {
                    this.f546x.remove(next);
                } else {
                    z |= mVar.mo546e();
                }
            }
            if (z) {
                this.f532j.clear();
                this.f533k.clear();
                int size = E.size();
                for (int i = 0; i < size; i++) {
                    C0128i iVar = E.get(i);
                    (iVar.mo690l() ? this.f532j : this.f533k).add(iVar);
                }
            } else {
                this.f532j.clear();
                this.f533k.clear();
                this.f533k.addAll(mo588E());
            }
            this.f534l = false;
        }
    }

    public void removeGroup(int i) {
        int l = mo635l(i);
        if (l >= 0) {
            int size = this.f529g.size() - l;
            int i2 = 0;
            while (true) {
                int i3 = i2 + 1;
                if (i2 >= size || this.f529g.get(l).getGroupId() != i) {
                    mo594K(true);
                } else {
                    m604N(l, false);
                    i2 = i3;
                }
            }
            mo594K(true);
        }
    }

    public void removeItem(int i) {
        m604N(mo637o(i), true);
    }

    /* renamed from: s */
    public ArrayList<C0128i> mo645s() {
        mo642r();
        return this.f532j;
    }

    public void setGroupCheckable(int i, boolean z, boolean z2) {
        int size = this.f529g.size();
        for (int i2 = 0; i2 < size; i2++) {
            C0128i iVar = this.f529g.get(i2);
            if (iVar.getGroupId() == i) {
                iVar.mo714t(z2);
                iVar.setCheckable(z);
            }
        }
    }

    public void setGroupDividerEnabled(boolean z) {
        this.f548z = z;
    }

    public void setGroupEnabled(int i, boolean z) {
        int size = this.f529g.size();
        for (int i2 = 0; i2 < size; i2++) {
            C0128i iVar = this.f529g.get(i2);
            if (iVar.getGroupId() == i) {
                iVar.setEnabled(z);
            }
        }
    }

    public void setGroupVisible(int i, boolean z) {
        int size = this.f529g.size();
        boolean z2 = false;
        for (int i2 = 0; i2 < size; i2++) {
            C0128i iVar = this.f529g.get(i2);
            if (iVar.getGroupId() == i && iVar.mo720y(z)) {
                z2 = true;
            }
        }
        if (z2) {
            mo594K(true);
        }
    }

    public void setQwertyMode(boolean z) {
        this.f526d = z;
        mo594K(false);
    }

    public int size() {
        return this.f529g.size();
    }

    /* access modifiers changed from: protected */
    /* renamed from: t */
    public String mo652t() {
        return "android:menu:actionviewstates";
    }

    /* renamed from: u */
    public Context mo653u() {
        return this.f524b;
    }

    /* renamed from: v */
    public C0128i mo654v() {
        return this.f547y;
    }

    /* renamed from: w */
    public Drawable mo655w() {
        return this.f538p;
    }

    /* renamed from: x */
    public CharSequence mo656x() {
        return this.f537o;
    }

    /* renamed from: y */
    public View mo657y() {
        return this.f539q;
    }

    /* renamed from: z */
    public ArrayList<C0128i> mo658z() {
        mo642r();
        return this.f533k;
    }
}
