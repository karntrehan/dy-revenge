package p174e.p319f.p320a.p335c.p345f.p352g;

/* renamed from: e.f.a.c.f.g.ed */
public final class C6774ed implements C6757dd {

    /* renamed from: a */
    public static final C7041v6 f18468a;

    /* renamed from: b */
    public static final C7041v6 f18469b;

    /* renamed from: c */
    public static final C7041v6 f18470c;

    /* renamed from: d */
    public static final C7041v6 f18471d;

    static {
        C6977r6 a = new C6977r6(C6849j6.m25968a("com.google.android.gms.measurement")).mo20125a();
        f18468a = a.mo20130f("measurement.service.audience.fix_skip_audience_with_failed_filters", true);
        f18469b = a.mo20130f("measurement.audience.refresh_event_count_filters_timestamp", false);
        f18470c = a.mo20130f("measurement.audience.use_bundle_end_timestamp_for_non_sequence_property_filters", false);
        f18471d = a.mo20130f("measurement.audience.use_bundle_timestamp_for_event_count_filters", false);
    }

    /* renamed from: a */
    public final boolean mo19690a() {
        return ((Boolean) f18470c.mo20382b()).booleanValue();
    }

    /* renamed from: b */
    public final boolean mo19691b() {
        return ((Boolean) f18471d.mo20382b()).booleanValue();
    }

    public final boolean zza() {
        return true;
    }

    public final boolean zzb() {
        return ((Boolean) f18469b.mo20382b()).booleanValue();
    }
}
