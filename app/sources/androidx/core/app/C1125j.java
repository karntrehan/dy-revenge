package androidx.core.app;

import android.app.Notification;
import android.app.RemoteInput;
import android.content.Context;
import android.graphics.drawable.Icon;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.SparseArray;
import android.widget.RemoteViews;
import androidx.core.app.C1117i;
import androidx.core.graphics.drawable.IconCompat;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import p027c.p060f.C1790b;

/* renamed from: androidx.core.app.j */
class C1125j implements C1116h {

    /* renamed from: a */
    private final Context f3165a;

    /* renamed from: b */
    private final Notification.Builder f3166b;

    /* renamed from: c */
    private final C1117i.C1123d f3167c;

    /* renamed from: d */
    private RemoteViews f3168d;

    /* renamed from: e */
    private RemoteViews f3169e;

    /* renamed from: f */
    private final List<Bundle> f3170f = new ArrayList();

    /* renamed from: g */
    private final Bundle f3171g = new Bundle();

    /* renamed from: h */
    private int f3172h;

    /* renamed from: i */
    private RemoteViews f3173i;

    C1125j(C1117i.C1123d dVar) {
        Notification.Builder builder;
        Icon icon;
        List<String> e;
        String str;
        Bundle bundle;
        this.f3167c = dVar;
        this.f3165a = dVar.f3135a;
        int i = Build.VERSION.SDK_INT;
        Context context = dVar.f3135a;
        if (i >= 26) {
            String str2 = dVar.f3123K;
        } else {
            builder = new Notification.Builder(context);
        }
        this.f3166b = builder;
        Notification notification = dVar.f3131S;
        this.f3166b.setWhen(notification.when).setSmallIcon(notification.icon, notification.iconLevel).setContent(notification.contentView).setTicker(notification.tickerText, dVar.f3143i).setVibrate(notification.vibrate).setLights(notification.ledARGB, notification.ledOnMS, notification.ledOffMS).setOngoing((notification.flags & 2) != 0).setOnlyAlertOnce((notification.flags & 8) != 0).setAutoCancel((notification.flags & 16) != 0).setDefaults(notification.defaults).setContentTitle(dVar.f3139e).setContentText(dVar.f3140f).setContentInfo(dVar.f3145k).setContentIntent(dVar.f3141g).setDeleteIntent(notification.deleteIntent).setFullScreenIntent(dVar.f3142h, (notification.flags & 128) != 0).setLargeIcon(dVar.f3144j).setNumber(dVar.f3146l).setProgress(dVar.f3154t, dVar.f3155u, dVar.f3156v);
        if (i < 21) {
            this.f3166b.setSound(notification.sound, notification.audioStreamType);
        }
        if (i >= 16) {
            this.f3166b.setSubText(dVar.f3151q).setUsesChronometer(dVar.f3149o).setPriority(dVar.f3147m);
            Iterator<C1117i.C1118a> it = dVar.f3136b.iterator();
            while (it.hasNext()) {
                m4371b(it.next());
            }
            Bundle bundle2 = dVar.f3116D;
            if (bundle2 != null) {
                this.f3171g.putAll(bundle2);
            }
            if (Build.VERSION.SDK_INT < 20) {
                if (dVar.f3160z) {
                    this.f3171g.putBoolean("android.support.localOnly", true);
                }
                String str3 = dVar.f3157w;
                if (str3 != null) {
                    this.f3171g.putString("android.support.groupKey", str3);
                    if (dVar.f3158x) {
                        bundle = this.f3171g;
                        str = "android.support.isGroupSummary";
                    } else {
                        bundle = this.f3171g;
                        str = "android.support.useSideChannel";
                    }
                    bundle.putBoolean(str, true);
                }
                String str4 = dVar.f3159y;
                if (str4 != null) {
                    this.f3171g.putString("android.support.sortKey", str4);
                }
            }
            this.f3168d = dVar.f3120H;
            this.f3169e = dVar.f3121I;
        }
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 17) {
            this.f3166b.setShowWhen(dVar.f3148n);
        }
        if (i2 >= 19 && i2 < 21 && (e = m4372e(m4373f(dVar.f3137c), dVar.f3134V)) != null && !e.isEmpty()) {
            this.f3171g.putStringArray("android.people", (String[]) e.toArray(new String[e.size()]));
        }
        if (i2 >= 20) {
            this.f3166b.setLocalOnly(dVar.f3160z).setGroup(dVar.f3157w).setGroupSummary(dVar.f3158x).setSortKey(dVar.f3159y);
            this.f3172h = dVar.f3128P;
        }
        if (i2 >= 21) {
            this.f3166b.setCategory(dVar.f3115C).setColor(dVar.f3117E).setVisibility(dVar.f3118F).setPublicVersion(dVar.f3119G).setSound(notification.sound, notification.audioAttributes);
            List<String> e2 = i2 < 28 ? m4372e(m4373f(dVar.f3137c), dVar.f3134V) : dVar.f3134V;
            if (e2 != null && !e2.isEmpty()) {
                for (String addPerson : e2) {
                    this.f3166b.addPerson(addPerson);
                }
            }
            this.f3173i = dVar.f3122J;
            if (dVar.f3138d.size() > 0) {
                Bundle bundle3 = dVar.mo3577c().getBundle("android.car.EXTENSIONS");
                bundle3 = bundle3 == null ? new Bundle() : bundle3;
                Bundle bundle4 = new Bundle(bundle3);
                Bundle bundle5 = new Bundle();
                for (int i3 = 0; i3 < dVar.f3138d.size(); i3++) {
                    bundle5.putBundle(Integer.toString(i3), C1126k.m4379b(dVar.f3138d.get(i3)));
                }
                bundle3.putBundle("invisible_actions", bundle5);
                bundle4.putBundle("invisible_actions", bundle5);
                dVar.mo3577c().putBundle("android.car.EXTENSIONS", bundle3);
                this.f3171g.putBundle("android.car.EXTENSIONS", bundle4);
            }
        }
        int i4 = Build.VERSION.SDK_INT;
        if (i4 >= 23 && (icon = dVar.f3133U) != null) {
            this.f3166b.setSmallIcon(icon);
        }
        if (i4 >= 24) {
            this.f3166b.setExtras(dVar.f3116D).setRemoteInputHistory(dVar.f3153s);
            RemoteViews remoteViews = dVar.f3120H;
            if (remoteViews != null) {
                this.f3166b.setCustomContentView(remoteViews);
            }
            RemoteViews remoteViews2 = dVar.f3121I;
            if (remoteViews2 != null) {
                this.f3166b.setCustomBigContentView(remoteViews2);
            }
            RemoteViews remoteViews3 = dVar.f3122J;
            if (remoteViews3 != null) {
                this.f3166b.setCustomHeadsUpContentView(remoteViews3);
            }
        }
        if (i4 >= 26) {
            this.f3166b.setBadgeIconType(dVar.f3124L).setSettingsText(dVar.f3152r).setShortcutId(dVar.f3125M).setTimeoutAfter(dVar.f3127O).setGroupAlertBehavior(dVar.f3128P);
            if (dVar.f3114B) {
                this.f3166b.setColorized(dVar.f3113A);
            }
            if (!TextUtils.isEmpty(dVar.f3123K)) {
                this.f3166b.setSound((Uri) null).setDefaults(0).setLights(0, 0, 0).setVibrate((long[]) null);
            }
        }
        if (i4 >= 28) {
            Iterator<C1128m> it2 = dVar.f3137c.iterator();
            while (it2.hasNext()) {
                this.f3166b.addPerson(it2.next().mo3603h());
            }
        }
        int i5 = Build.VERSION.SDK_INT;
        if (i5 >= 29) {
            this.f3166b.setAllowSystemGeneratedContextualActions(dVar.f3129Q);
            this.f3166b.setBubbleMetadata(C1117i.C1120c.m4345a(dVar.f3130R));
            if (dVar.f3126N != null) {
                throw null;
            }
        }
        if (dVar.f3132T) {
            if (this.f3167c.f3158x) {
                this.f3172h = 2;
            } else {
                this.f3172h = 1;
            }
            this.f3166b.setVibrate((long[]) null);
            this.f3166b.setSound((Uri) null);
            int i6 = notification.defaults & -2;
            notification.defaults = i6;
            int i7 = i6 & -3;
            notification.defaults = i7;
            this.f3166b.setDefaults(i7);
            if (i5 >= 26) {
                if (TextUtils.isEmpty(this.f3167c.f3157w)) {
                    this.f3166b.setGroup("silent");
                }
                this.f3166b.setGroupAlertBehavior(this.f3172h);
            }
        }
    }

    /* renamed from: b */
    private void m4371b(C1117i.C1118a aVar) {
        Notification.Action.Builder builder;
        int i = Build.VERSION.SDK_INT;
        if (i >= 20) {
            IconCompat e = aVar.mo3565e();
            if (i >= 23) {
                builder = new Notification.Action.Builder(e != null ? e.mo3652n() : null, aVar.mo3569i(), aVar.mo3561a());
            } else {
                builder = new Notification.Action.Builder(e != null ? e.mo3645c() : 0, aVar.mo3569i(), aVar.mo3561a());
            }
            if (aVar.mo3566f() != null) {
                for (RemoteInput addRemoteInput : C1129n.m4395b(aVar.mo3566f())) {
                    builder.addRemoteInput(addRemoteInput);
                }
            }
            Bundle bundle = aVar.mo3564d() != null ? new Bundle(aVar.mo3564d()) : new Bundle();
            bundle.putBoolean("android.support.allowGeneratedReplies", aVar.mo3562b());
            int i2 = Build.VERSION.SDK_INT;
            if (i2 >= 24) {
                builder.setAllowGeneratedReplies(aVar.mo3562b());
            }
            bundle.putInt("android.support.action.semanticAction", aVar.mo3567g());
            if (i2 >= 28) {
                builder.setSemanticAction(aVar.mo3567g());
            }
            if (i2 >= 29) {
                builder.setContextual(aVar.mo3570j());
            }
            bundle.putBoolean("android.support.action.showsUserInterface", aVar.mo3568h());
            builder.addExtras(bundle);
            this.f3166b.addAction(builder.build());
        } else if (i >= 16) {
            this.f3170f.add(C1126k.m4383f(this.f3166b, aVar));
        }
    }

    /* renamed from: e */
    private static List<String> m4372e(List<String> list, List<String> list2) {
        if (list == null) {
            return list2;
        }
        if (list2 == null) {
            return list;
        }
        C1790b bVar = new C1790b(list.size() + list2.size());
        bVar.addAll(list);
        bVar.addAll(list2);
        return new ArrayList(bVar);
    }

    /* renamed from: f */
    private static List<String> m4373f(List<C1128m> list) {
        if (list == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList(list.size());
        for (C1128m g : list) {
            arrayList.add(g.mo3602g());
        }
        return arrayList;
    }

    /* renamed from: g */
    private void m4374g(Notification notification) {
        notification.sound = null;
        notification.vibrate = null;
        int i = notification.defaults & -2;
        notification.defaults = i;
        notification.defaults = i & -3;
    }

    /* renamed from: a */
    public Notification.Builder mo3560a() {
        return this.f3166b;
    }

    /* renamed from: c */
    public Notification mo3593c() {
        Bundle a;
        RemoteViews f;
        RemoteViews d;
        C1117i.C1124e eVar = this.f3167c.f3150p;
        if (eVar != null) {
            eVar.mo3572b(this);
        }
        RemoteViews e = eVar != null ? eVar.mo3590e(this) : null;
        Notification d2 = mo3594d();
        if (!(e == null && (e = this.f3167c.f3120H) == null)) {
            d2.contentView = e;
        }
        int i = Build.VERSION.SDK_INT;
        if (!(i < 16 || eVar == null || (d = eVar.mo3589d(this)) == null)) {
            d2.bigContentView = d;
        }
        if (!(i < 21 || eVar == null || (f = this.f3167c.f3150p.mo3591f(this)) == null)) {
            d2.headsUpContentView = f;
        }
        if (!(i < 16 || eVar == null || (a = C1117i.m4330a(d2)) == null)) {
            eVar.mo3571a(a);
        }
        return d2;
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public Notification mo3594d() {
        int i = Build.VERSION.SDK_INT;
        if (i >= 26) {
            return this.f3166b.build();
        }
        if (i >= 24) {
            Notification build = this.f3166b.build();
            if (this.f3172h != 0) {
                if (!(build.getGroup() == null || (build.flags & 512) == 0 || this.f3172h != 2)) {
                    m4374g(build);
                }
                if (build.getGroup() != null && (build.flags & 512) == 0 && this.f3172h == 1) {
                    m4374g(build);
                }
            }
            return build;
        } else if (i >= 21) {
            this.f3166b.setExtras(this.f3171g);
            Notification build2 = this.f3166b.build();
            RemoteViews remoteViews = this.f3168d;
            if (remoteViews != null) {
                build2.contentView = remoteViews;
            }
            RemoteViews remoteViews2 = this.f3169e;
            if (remoteViews2 != null) {
                build2.bigContentView = remoteViews2;
            }
            RemoteViews remoteViews3 = this.f3173i;
            if (remoteViews3 != null) {
                build2.headsUpContentView = remoteViews3;
            }
            if (this.f3172h != 0) {
                if (!(build2.getGroup() == null || (build2.flags & 512) == 0 || this.f3172h != 2)) {
                    m4374g(build2);
                }
                if (build2.getGroup() != null && (build2.flags & 512) == 0 && this.f3172h == 1) {
                    m4374g(build2);
                }
            }
            return build2;
        } else if (i >= 20) {
            this.f3166b.setExtras(this.f3171g);
            Notification build3 = this.f3166b.build();
            RemoteViews remoteViews4 = this.f3168d;
            if (remoteViews4 != null) {
                build3.contentView = remoteViews4;
            }
            RemoteViews remoteViews5 = this.f3169e;
            if (remoteViews5 != null) {
                build3.bigContentView = remoteViews5;
            }
            if (this.f3172h != 0) {
                if (!(build3.getGroup() == null || (build3.flags & 512) == 0 || this.f3172h != 2)) {
                    m4374g(build3);
                }
                if (build3.getGroup() != null && (build3.flags & 512) == 0 && this.f3172h == 1) {
                    m4374g(build3);
                }
            }
            return build3;
        } else if (i >= 19) {
            SparseArray<Bundle> a = C1126k.m4378a(this.f3170f);
            if (a != null) {
                this.f3171g.putSparseParcelableArray("android.support.actionExtras", a);
            }
            this.f3166b.setExtras(this.f3171g);
            Notification build4 = this.f3166b.build();
            RemoteViews remoteViews6 = this.f3168d;
            if (remoteViews6 != null) {
                build4.contentView = remoteViews6;
            }
            RemoteViews remoteViews7 = this.f3169e;
            if (remoteViews7 != null) {
                build4.bigContentView = remoteViews7;
            }
            return build4;
        } else if (i < 16) {
            return this.f3166b.getNotification();
        } else {
            Notification build5 = this.f3166b.build();
            Bundle a2 = C1117i.m4330a(build5);
            Bundle bundle = new Bundle(this.f3171g);
            for (String str : this.f3171g.keySet()) {
                if (a2.containsKey(str)) {
                    bundle.remove(str);
                }
            }
            a2.putAll(bundle);
            SparseArray<Bundle> a3 = C1126k.m4378a(this.f3170f);
            if (a3 != null) {
                C1117i.m4330a(build5).putSparseParcelableArray("android.support.actionExtras", a3);
            }
            RemoteViews remoteViews8 = this.f3168d;
            if (remoteViews8 != null) {
                build5.contentView = remoteViews8;
            }
            RemoteViews remoteViews9 = this.f3169e;
            if (remoteViews9 != null) {
                build5.bigContentView = remoteViews9;
            }
            return build5;
        }
    }
}
