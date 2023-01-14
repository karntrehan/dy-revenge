package p174e.p319f.p320a.p335c.p345f.p352g;

/* renamed from: e.f.a.c.f.g.fc */
public final class C6790fc implements C6773ec {

    /* renamed from: a */
    public static final C7041v6 f18487a;

    /* renamed from: b */
    public static final C7041v6 f18488b;

    /* renamed from: c */
    public static final C7041v6 f18489c;

    /* renamed from: d */
    public static final C7041v6 f18490d;

    /* renamed from: e */
    public static final C7041v6 f18491e;

    /* renamed from: f */
    public static final C7041v6 f18492f;

    /* renamed from: g */
    public static final C7041v6 f18493g;

    static {
        C6977r6 a = new C6977r6(C6849j6.m25968a("com.google.android.gms.measurement")).mo20126b().mo20125a();
        f18487a = a.mo20130f("measurement.adid_zero.app_instance_id_fix", true);
        f18488b = a.mo20130f("measurement.adid_zero.service", true);
        f18489c = a.mo20130f("measurement.adid_zero.adid_uid", true);
        f18490d = a.mo20130f("measurement.adid_zero.only_request_adid_if_enabled", true);
        f18491e = a.mo20130f("measurement.adid_zero.remove_lair_if_adidzero_false", true);
        f18492f = a.mo20130f("measurement.adid_zero.remove_lair_if_userid_cleared", true);
        f18493g = a.mo20130f("measurement.adid_zero.remove_lair_on_id_value_change_only", true);
    }

    public final boolean zza() {
        return ((Boolean) f18490d.mo20382b()).booleanValue();
    }
}
