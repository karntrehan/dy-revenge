package p027c.p041c.p042b;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.os.IBinder;
import android.util.SparseArray;
import androidx.core.app.C1104b;
import androidx.core.app.C1112e;
import java.util.ArrayList;
import p027c.p041c.p042b.C1495a;

/* renamed from: c.c.b.c */
public final class C1498c {

    /* renamed from: a */
    public final Intent f4659a;

    /* renamed from: b */
    public final Bundle f4660b;

    /* renamed from: c.c.b.c$a */
    public static final class C1499a {

        /* renamed from: a */
        private final Intent f4661a = new Intent("android.intent.action.VIEW");

        /* renamed from: b */
        private final C1495a.C1496a f4662b = new C1495a.C1496a();

        /* renamed from: c */
        private ArrayList<Bundle> f4663c;

        /* renamed from: d */
        private Bundle f4664d;

        /* renamed from: e */
        private ArrayList<Bundle> f4665e;

        /* renamed from: f */
        private SparseArray<Bundle> f4666f;

        /* renamed from: g */
        private Bundle f4667g;

        /* renamed from: h */
        private int f4668h = 0;

        /* renamed from: i */
        private boolean f4669i = true;

        /* renamed from: e */
        private void m6652e(IBinder iBinder, PendingIntent pendingIntent) {
            Bundle bundle = new Bundle();
            C1112e.m4319b(bundle, "android.support.customtabs.extra.SESSION", iBinder);
            if (pendingIntent != null) {
                bundle.putParcelable("android.support.customtabs.extra.SESSION_ID", pendingIntent);
            }
            this.f4661a.putExtras(bundle);
        }

        @Deprecated
        /* renamed from: a */
        public C1499a mo5552a() {
            mo5556f(1);
            return this;
        }

        /* renamed from: b */
        public C1498c mo5553b() {
            if (!this.f4661a.hasExtra("android.support.customtabs.extra.SESSION")) {
                m6652e((IBinder) null, (PendingIntent) null);
            }
            ArrayList<Bundle> arrayList = this.f4663c;
            if (arrayList != null) {
                this.f4661a.putParcelableArrayListExtra("android.support.customtabs.extra.MENU_ITEMS", arrayList);
            }
            ArrayList<Bundle> arrayList2 = this.f4665e;
            if (arrayList2 != null) {
                this.f4661a.putParcelableArrayListExtra("android.support.customtabs.extra.TOOLBAR_ITEMS", arrayList2);
            }
            this.f4661a.putExtra("android.support.customtabs.extra.EXTRA_ENABLE_INSTANT_APPS", this.f4669i);
            this.f4661a.putExtras(this.f4662b.mo5551a().mo5550a());
            Bundle bundle = this.f4667g;
            if (bundle != null) {
                this.f4661a.putExtras(bundle);
            }
            if (this.f4666f != null) {
                Bundle bundle2 = new Bundle();
                bundle2.putSparseParcelableArray("androidx.browser.customtabs.extra.COLOR_SCHEME_PARAMS", this.f4666f);
                this.f4661a.putExtras(bundle2);
            }
            this.f4661a.putExtra("androidx.browser.customtabs.extra.SHARE_STATE", this.f4668h);
            return new C1498c(this.f4661a, this.f4664d);
        }

        /* renamed from: c */
        public C1499a mo5554c(Bitmap bitmap) {
            this.f4661a.putExtra("android.support.customtabs.extra.CLOSE_BUTTON_ICON", bitmap);
            return this;
        }

        /* renamed from: d */
        public C1499a mo5555d(Context context, int i, int i2) {
            this.f4661a.putExtra("android.support.customtabs.extra.EXIT_ANIMATION_BUNDLE", C1104b.m4304a(context, i, i2).mo3548b());
            return this;
        }

        /* renamed from: f */
        public C1499a mo5556f(int i) {
            if (i < 0 || i > 2) {
                throw new IllegalArgumentException("Invalid value for the shareState argument");
            }
            this.f4668h = i;
            if (i == 1) {
                this.f4661a.putExtra("android.support.customtabs.extra.SHARE_MENU_ITEM", true);
            } else if (i == 2) {
                this.f4661a.putExtra("android.support.customtabs.extra.SHARE_MENU_ITEM", false);
            } else {
                this.f4661a.removeExtra("android.support.customtabs.extra.SHARE_MENU_ITEM");
            }
            return this;
        }

        /* renamed from: g */
        public C1499a mo5557g(boolean z) {
            this.f4661a.putExtra("android.support.customtabs.extra.TITLE_VISIBILITY", z ? 1 : 0);
            return this;
        }

        /* renamed from: h */
        public C1499a mo5558h(Context context, int i, int i2) {
            this.f4664d = C1104b.m4304a(context, i, i2).mo3548b();
            return this;
        }
    }

    C1498c(Intent intent, Bundle bundle) {
        this.f4659a = intent;
        this.f4660b = bundle;
    }
}
