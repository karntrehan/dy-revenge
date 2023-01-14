package androidx.core.app;

import android.app.Notification;
import android.app.PendingIntent;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.drawable.Icon;
import android.os.Build;
import android.os.Bundle;
import android.widget.RemoteViews;
import androidx.core.content.C1142b;
import androidx.core.graphics.drawable.IconCompat;
import java.util.ArrayList;
import okhttp3.HttpUrl;

/* renamed from: androidx.core.app.i */
public class C1117i {

    /* renamed from: androidx.core.app.i$a */
    public static class C1118a {

        /* renamed from: a */
        final Bundle f3101a;

        /* renamed from: b */
        private IconCompat f3102b;

        /* renamed from: c */
        private final C1129n[] f3103c;

        /* renamed from: d */
        private final C1129n[] f3104d;

        /* renamed from: e */
        private boolean f3105e;

        /* renamed from: f */
        boolean f3106f;

        /* renamed from: g */
        private final int f3107g;

        /* renamed from: h */
        private final boolean f3108h;
        @Deprecated

        /* renamed from: i */
        public int f3109i;

        /* renamed from: j */
        public CharSequence f3110j;

        /* renamed from: k */
        public PendingIntent f3111k;

        /* JADX INFO: this call moved to the top of the method (can break code semantics) */
        public C1118a(int i, CharSequence charSequence, PendingIntent pendingIntent) {
            this(i != 0 ? IconCompat.m4522b((Resources) null, HttpUrl.FRAGMENT_ENCODE_SET, i) : null, charSequence, pendingIntent);
        }

        public C1118a(IconCompat iconCompat, CharSequence charSequence, PendingIntent pendingIntent) {
            this(iconCompat, charSequence, pendingIntent, new Bundle(), (C1129n[]) null, (C1129n[]) null, true, 0, true, false);
        }

        C1118a(IconCompat iconCompat, CharSequence charSequence, PendingIntent pendingIntent, Bundle bundle, C1129n[] nVarArr, C1129n[] nVarArr2, boolean z, int i, boolean z2, boolean z3) {
            this.f3106f = true;
            this.f3102b = iconCompat;
            if (iconCompat != null && iconCompat.mo3647g() == 2) {
                this.f3109i = iconCompat.mo3645c();
            }
            this.f3110j = C1123d.m4348d(charSequence);
            this.f3111k = pendingIntent;
            this.f3101a = bundle == null ? new Bundle() : bundle;
            this.f3103c = nVarArr;
            this.f3104d = nVarArr2;
            this.f3105e = z;
            this.f3107g = i;
            this.f3106f = z2;
            this.f3108h = z3;
        }

        /* renamed from: a */
        public PendingIntent mo3561a() {
            return this.f3111k;
        }

        /* renamed from: b */
        public boolean mo3562b() {
            return this.f3105e;
        }

        /* renamed from: c */
        public C1129n[] mo3563c() {
            return this.f3104d;
        }

        /* renamed from: d */
        public Bundle mo3564d() {
            return this.f3101a;
        }

        /* renamed from: e */
        public IconCompat mo3565e() {
            int i;
            if (this.f3102b == null && (i = this.f3109i) != 0) {
                this.f3102b = IconCompat.m4522b((Resources) null, HttpUrl.FRAGMENT_ENCODE_SET, i);
            }
            return this.f3102b;
        }

        /* renamed from: f */
        public C1129n[] mo3566f() {
            return this.f3103c;
        }

        /* renamed from: g */
        public int mo3567g() {
            return this.f3107g;
        }

        /* renamed from: h */
        public boolean mo3568h() {
            return this.f3106f;
        }

        /* renamed from: i */
        public CharSequence mo3569i() {
            return this.f3110j;
        }

        /* renamed from: j */
        public boolean mo3570j() {
            return this.f3108h;
        }
    }

    /* renamed from: androidx.core.app.i$b */
    public static class C1119b extends C1124e {

        /* renamed from: e */
        private CharSequence f3112e;

        /* renamed from: a */
        public void mo3571a(Bundle bundle) {
            super.mo3571a(bundle);
            if (Build.VERSION.SDK_INT < 21) {
                bundle.putCharSequence("android.bigText", this.f3112e);
            }
        }

        /* renamed from: b */
        public void mo3572b(C1116h hVar) {
            if (Build.VERSION.SDK_INT >= 16) {
                Notification.BigTextStyle bigText = new Notification.BigTextStyle(hVar.mo3560a()).setBigContentTitle(this.f3162b).bigText(this.f3112e);
                if (this.f3164d) {
                    bigText.setSummaryText(this.f3163c);
                }
            }
        }

        /* access modifiers changed from: protected */
        /* renamed from: c */
        public String mo3573c() {
            return "androidx.core.app.NotificationCompat$BigTextStyle";
        }

        /* renamed from: h */
        public C1119b mo3574h(CharSequence charSequence) {
            this.f3112e = C1123d.m4348d(charSequence);
            return this;
        }
    }

    /* renamed from: androidx.core.app.i$c */
    public static final class C1120c {

        /* renamed from: androidx.core.app.i$c$a */
        private static class C1121a {
            /* renamed from: a */
            static Notification.BubbleMetadata m4346a(C1120c cVar) {
                if (cVar == null) {
                    return null;
                }
                throw null;
            }
        }

        /* renamed from: androidx.core.app.i$c$b */
        private static class C1122b {
            /* renamed from: a */
            static Notification.BubbleMetadata m4347a(C1120c cVar) {
                if (cVar == null) {
                    return null;
                }
                throw null;
            }
        }

        /* renamed from: a */
        public static Notification.BubbleMetadata m4345a(C1120c cVar) {
            if (cVar == null) {
                return null;
            }
            int i = Build.VERSION.SDK_INT;
            if (i >= 30) {
                return C1122b.m4347a(cVar);
            }
            if (i == 29) {
                return C1121a.m4346a(cVar);
            }
            return null;
        }
    }

    /* renamed from: androidx.core.app.i$d */
    public static class C1123d {

        /* renamed from: A */
        boolean f3113A;

        /* renamed from: B */
        boolean f3114B;

        /* renamed from: C */
        String f3115C;

        /* renamed from: D */
        Bundle f3116D;

        /* renamed from: E */
        int f3117E;

        /* renamed from: F */
        int f3118F;

        /* renamed from: G */
        Notification f3119G;

        /* renamed from: H */
        RemoteViews f3120H;

        /* renamed from: I */
        RemoteViews f3121I;

        /* renamed from: J */
        RemoteViews f3122J;

        /* renamed from: K */
        String f3123K;

        /* renamed from: L */
        int f3124L;

        /* renamed from: M */
        String f3125M;

        /* renamed from: N */
        C1142b f3126N;

        /* renamed from: O */
        long f3127O;

        /* renamed from: P */
        int f3128P;

        /* renamed from: Q */
        boolean f3129Q;

        /* renamed from: R */
        C1120c f3130R;

        /* renamed from: S */
        Notification f3131S;

        /* renamed from: T */
        boolean f3132T;

        /* renamed from: U */
        Icon f3133U;
        @Deprecated

        /* renamed from: V */
        public ArrayList<String> f3134V;

        /* renamed from: a */
        public Context f3135a;

        /* renamed from: b */
        public ArrayList<C1118a> f3136b;

        /* renamed from: c */
        public ArrayList<C1128m> f3137c;

        /* renamed from: d */
        ArrayList<C1118a> f3138d;

        /* renamed from: e */
        CharSequence f3139e;

        /* renamed from: f */
        CharSequence f3140f;

        /* renamed from: g */
        PendingIntent f3141g;

        /* renamed from: h */
        PendingIntent f3142h;

        /* renamed from: i */
        RemoteViews f3143i;

        /* renamed from: j */
        Bitmap f3144j;

        /* renamed from: k */
        CharSequence f3145k;

        /* renamed from: l */
        int f3146l;

        /* renamed from: m */
        int f3147m;

        /* renamed from: n */
        boolean f3148n;

        /* renamed from: o */
        boolean f3149o;

        /* renamed from: p */
        C1124e f3150p;

        /* renamed from: q */
        CharSequence f3151q;

        /* renamed from: r */
        CharSequence f3152r;

        /* renamed from: s */
        CharSequence[] f3153s;

        /* renamed from: t */
        int f3154t;

        /* renamed from: u */
        int f3155u;

        /* renamed from: v */
        boolean f3156v;

        /* renamed from: w */
        String f3157w;

        /* renamed from: x */
        boolean f3158x;

        /* renamed from: y */
        String f3159y;

        /* renamed from: z */
        boolean f3160z;

        @Deprecated
        public C1123d(Context context) {
            this(context, (String) null);
        }

        public C1123d(Context context, String str) {
            this.f3136b = new ArrayList<>();
            this.f3137c = new ArrayList<>();
            this.f3138d = new ArrayList<>();
            this.f3148n = true;
            this.f3160z = false;
            this.f3117E = 0;
            this.f3118F = 0;
            this.f3124L = 0;
            this.f3128P = 0;
            Notification notification = new Notification();
            this.f3131S = notification;
            this.f3135a = context;
            this.f3123K = str;
            notification.when = System.currentTimeMillis();
            this.f3131S.audioStreamType = -1;
            this.f3147m = 0;
            this.f3134V = new ArrayList<>();
            this.f3129Q = true;
        }

        /* renamed from: d */
        protected static CharSequence m4348d(CharSequence charSequence) {
            return (charSequence != null && charSequence.length() > 5120) ? charSequence.subSequence(0, 5120) : charSequence;
        }

        /* renamed from: j */
        private void m4349j(int i, boolean z) {
            Notification notification;
            int i2;
            if (z) {
                notification = this.f3131S;
                i2 = i | notification.flags;
            } else {
                notification = this.f3131S;
                i2 = (~i) & notification.flags;
            }
            notification.flags = i2;
        }

        /* renamed from: a */
        public C1123d mo3575a(int i, CharSequence charSequence, PendingIntent pendingIntent) {
            this.f3136b.add(new C1118a(i, charSequence, pendingIntent));
            return this;
        }

        /* renamed from: b */
        public Notification mo3576b() {
            return new C1125j(this).mo3593c();
        }

        /* renamed from: c */
        public Bundle mo3577c() {
            if (this.f3116D == null) {
                this.f3116D = new Bundle();
            }
            return this.f3116D;
        }

        /* renamed from: e */
        public C1123d mo3578e(boolean z) {
            m4349j(16, z);
            return this;
        }

        /* renamed from: f */
        public C1123d mo3579f(String str) {
            this.f3123K = str;
            return this;
        }

        /* renamed from: g */
        public C1123d mo3580g(PendingIntent pendingIntent) {
            this.f3141g = pendingIntent;
            return this;
        }

        /* renamed from: h */
        public C1123d mo3581h(CharSequence charSequence) {
            this.f3140f = m4348d(charSequence);
            return this;
        }

        /* renamed from: i */
        public C1123d mo3582i(CharSequence charSequence) {
            this.f3139e = m4348d(charSequence);
            return this;
        }

        /* renamed from: k */
        public C1123d mo3583k(boolean z) {
            this.f3160z = z;
            return this;
        }

        /* renamed from: l */
        public C1123d mo3584l(int i) {
            this.f3147m = i;
            return this;
        }

        /* renamed from: m */
        public C1123d mo3585m(int i) {
            this.f3131S.icon = i;
            return this;
        }

        /* renamed from: n */
        public C1123d mo3586n(C1124e eVar) {
            if (this.f3150p != eVar) {
                this.f3150p = eVar;
                if (eVar != null) {
                    eVar.mo3592g(this);
                }
            }
            return this;
        }

        /* renamed from: o */
        public C1123d mo3587o(CharSequence charSequence) {
            this.f3131S.tickerText = m4348d(charSequence);
            return this;
        }

        /* renamed from: p */
        public C1123d mo3588p(long j) {
            this.f3131S.when = j;
            return this;
        }
    }

    /* renamed from: androidx.core.app.i$e */
    public static abstract class C1124e {

        /* renamed from: a */
        protected C1123d f3161a;

        /* renamed from: b */
        CharSequence f3162b;

        /* renamed from: c */
        CharSequence f3163c;

        /* renamed from: d */
        boolean f3164d = false;

        /* renamed from: a */
        public void mo3571a(Bundle bundle) {
            if (this.f3164d) {
                bundle.putCharSequence("android.summaryText", this.f3163c);
            }
            CharSequence charSequence = this.f3162b;
            if (charSequence != null) {
                bundle.putCharSequence("android.title.big", charSequence);
            }
            String c = mo3573c();
            if (c != null) {
                bundle.putString("androidx.core.app.extra.COMPAT_TEMPLATE", c);
            }
        }

        /* renamed from: b */
        public abstract void mo3572b(C1116h hVar);

        /* access modifiers changed from: protected */
        /* renamed from: c */
        public abstract String mo3573c();

        /* renamed from: d */
        public RemoteViews mo3589d(C1116h hVar) {
            return null;
        }

        /* renamed from: e */
        public RemoteViews mo3590e(C1116h hVar) {
            return null;
        }

        /* renamed from: f */
        public RemoteViews mo3591f(C1116h hVar) {
            return null;
        }

        /* renamed from: g */
        public void mo3592g(C1123d dVar) {
            if (this.f3161a != dVar) {
                this.f3161a = dVar;
                if (dVar != null) {
                    dVar.mo3586n(this);
                }
            }
        }
    }

    /* renamed from: a */
    public static Bundle m4330a(Notification notification) {
        int i = Build.VERSION.SDK_INT;
        if (i >= 19) {
            return notification.extras;
        }
        if (i >= 16) {
            return C1126k.m4380c(notification);
        }
        return null;
    }
}
