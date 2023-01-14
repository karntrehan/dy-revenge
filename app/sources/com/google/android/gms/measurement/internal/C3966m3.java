package com.google.android.gms.measurement.internal;

import android.content.Context;
import com.google.android.gms.dynamite.descriptors.com.google.mlkit.dynamite.face.ModuleDescriptor;
import com.reactnativecommunity.webview.RNCWebViewManager;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import p174e.p319f.p320a.p335c.p345f.p352g.C6849j6;
import p174e.p319f.p320a.p335c.p345f.p352g.C7088y5;

/* renamed from: com.google.android.gms.measurement.internal.m3 */
public final class C3966m3 {

    /* renamed from: A */
    public static final C3953l3 f10950A = m15025a("measurement.upload.refresh_blacklisted_config_interval", 604800000L, 604800000L, C3911i0.f10775a);

    /* renamed from: A0 */
    public static final C3953l3 f10951A0;

    /* renamed from: B */
    public static final C3953l3 f10952B = m15025a("measurement.upload.initial_upload_delay_time", 15000L, 15000L, C3924j0.f10813a);

    /* renamed from: B0 */
    public static final C3953l3 f10953B0;

    /* renamed from: C */
    public static final C3953l3 f10954C = m15025a("measurement.upload.retry_time", 1800000L, 1800000L, C3937k0.f10846a);

    /* renamed from: C0 */
    public static final C3953l3 f10955C0;

    /* renamed from: D */
    public static final C3953l3 f10956D = m15025a("measurement.upload.retry_count", 6, 6, C3963m0.f10947a);

    /* renamed from: D0 */
    public static final C3953l3 f10957D0;

    /* renamed from: E */
    public static final C3953l3 f10958E = m15025a("measurement.upload.max_queue_time", 2419200000L, 2419200000L, C3975n0.f11067a);

    /* renamed from: E0 */
    public static final C3953l3 f10959E0;

    /* renamed from: F */
    public static final C3953l3 f10960F = m15025a("measurement.lifetimevalue.max_currency_tracked", 4, 4, C3987o0.f11082a);

    /* renamed from: F0 */
    public static final C3953l3 f10961F0;

    /* renamed from: G */
    public static final C3953l3 f10962G = m15025a("measurement.audience.filter_result_max_count", 200, 200, C4011q0.f11184a);

    /* renamed from: G0 */
    public static final C3953l3 f10963G0;

    /* renamed from: H */
    public static final C3953l3 f10964H = m15025a("measurement.upload.max_public_user_properties", 25, 25, (C3914i3) null);

    /* renamed from: H0 */
    public static final C3953l3 f10965H0;

    /* renamed from: I */
    public static final C3953l3 f10966I = m15025a("measurement.upload.max_event_name_cardinality", 500, 500, (C3914i3) null);

    /* renamed from: I0 */
    public static final C3953l3 f10967I0;

    /* renamed from: J */
    public static final C3953l3 f10968J = m15025a("measurement.upload.max_public_event_params", 25, 25, (C3914i3) null);

    /* renamed from: J0 */
    public static final C3953l3 f10969J0;

    /* renamed from: K */
    public static final C3953l3 f10970K = m15025a("measurement.service_client.idle_disconnect_millis", 5000L, 5000L, C4023r0.f11222a);

    /* renamed from: L */
    public static final C3953l3 f10971L;

    /* renamed from: M */
    public static final C3953l3 f10972M = m15025a("measurement.test.string_flag", "---", "---", C4047t0.f11293a);

    /* renamed from: N */
    public static final C3953l3 f10973N = m15025a("measurement.test.long_flag", -1L, -1L, C4059u0.f11310a);

    /* renamed from: O */
    public static final C3953l3 f10974O = m15025a("measurement.test.int_flag", -2, -2, C4071v0.f11334a);

    /* renamed from: P */
    public static final C3953l3 f10975P;

    /* renamed from: Q */
    public static final C3953l3 f10976Q = m15025a("measurement.experiment.max_ids", 50, 50, C4107y0.f11417a);

    /* renamed from: R */
    public static final C3953l3 f10977R = m15025a("measurement.max_bundles_per_iteration", 100, 100, C4119z0.f11445a);

    /* renamed from: S */
    public static final C3953l3 f10978S = m15025a("measurement.sdk.attribution.cache.ttl", 604800000L, 604800000L, C3808a1.f10502a);

    /* renamed from: T */
    public static final C3953l3 f10979T = m15025a("measurement.redaction.app_instance_id.ttl", 7200000L, 7200000L, C3847d1.f10618a);

    /* renamed from: U */
    public static final C3953l3 f10980U;

    /* renamed from: V */
    public static final C3953l3 f10981V;

    /* renamed from: W */
    public static final C3953l3 f10982W;

    /* renamed from: X */
    public static final C3953l3 f10983X;

    /* renamed from: Y */
    public static final C3953l3 f10984Y;

    /* renamed from: Z */
    public static final C3953l3 f10985Z;
    /* access modifiers changed from: private */

    /* renamed from: a */
    public static final List f10986a = Collections.synchronizedList(new ArrayList());

    /* renamed from: a0 */
    public static final C3953l3 f10987a0;

    /* renamed from: b */
    private static final Set f10988b = Collections.synchronizedSet(new HashSet());

    /* renamed from: b0 */
    public static final C3953l3 f10989b0;

    /* renamed from: c */
    public static final C3953l3 f10990c = m15025a("measurement.ad_id_cache_time", 10000L, 10000L, C3950l0.f10878a);

    /* renamed from: c0 */
    public static final C3953l3 f10991c0;

    /* renamed from: d */
    public static final C3953l3 f10992d = m15025a("measurement.monitoring.sample_period_millis", 86400000L, 86400000L, C3846d0.f10617a);

    /* renamed from: d0 */
    public static final C3953l3 f10993d0;

    /* renamed from: e */
    public static final C3953l3 f10994e = m15025a("measurement.config.cache_time", 86400000L, 3600000L, C3999p0.f11104a);

    /* renamed from: e0 */
    public static final C3953l3 f10995e0;

    /* renamed from: f */
    public static final C3953l3 f10996f = m15025a("measurement.config.url_scheme", "https", "https", C3821b1.f10534a);

    /* renamed from: f0 */
    public static final C3953l3 f10997f0;

    /* renamed from: g */
    public static final C3953l3 f10998g = m15025a("measurement.config.url_authority", "app-measurement.com", "app-measurement.com", C3988o1.f11083a);

    /* renamed from: g0 */
    public static final C3953l3 f10999g0;

    /* renamed from: h */
    public static final C3953l3 f11000h = m15025a("measurement.upload.max_bundles", 100, 100, C3809a2.f10503a);

    /* renamed from: h0 */
    public static final C3953l3 f11001h0 = m15025a("measurement.service.storage_consent_support_version", 203600, 203600, C4036s1.f11260a);

    /* renamed from: i */
    public static final C3953l3 f11002i = m15025a("measurement.upload.max_batch_size", 65536, 65536, C3977n2.f11069a);

    /* renamed from: i0 */
    public static final C3953l3 f11003i0;

    /* renamed from: j */
    public static final C3953l3 f11004j = m15025a("measurement.upload.max_bundle_size", 65536, 65536, C4121z2.f11447a);

    /* renamed from: j0 */
    public static final C3953l3 f11005j0;

    /* renamed from: k */
    public static final C3953l3 f11006k;

    /* renamed from: k0 */
    public static final C3953l3 f11007k0;

    /* renamed from: l */
    public static final C3953l3 f11008l = m15025a("measurement.upload.max_events_per_day", 100000, 100000, C3875f3.f10664a);

    /* renamed from: l0 */
    public static final C3953l3 f11009l0;

    /* renamed from: m */
    public static final C3953l3 f11010m;

    /* renamed from: m0 */
    public static final C3953l3 f11011m0;

    /* renamed from: n */
    public static final C3953l3 f11012n = m15025a("measurement.upload.max_public_events_per_day", 50000, 50000, C3912i1.f10776a);

    /* renamed from: n0 */
    public static final C3953l3 f11013n0;

    /* renamed from: o */
    public static final C3953l3 f11014o;

    /* renamed from: o0 */
    public static final C3953l3 f11015o0;

    /* renamed from: p */
    public static final C3953l3 f11016p = m15025a("measurement.upload.max_realtime_events_per_day", 10, 10, C3874f2.f10663a);

    /* renamed from: p0 */
    public static final C3953l3 f11017p0;

    /* renamed from: q */
    public static final C3953l3 f11018q = m15025a("measurement.store.max_stored_events_per_app", 100000, 100000, C4013q2.f11186a);

    /* renamed from: q0 */
    public static final C3953l3 f11019q0;

    /* renamed from: r */
    public static final C3953l3 f11020r = m15025a("measurement.upload.url", "https://app-measurement.com/a", "https://app-measurement.com/a", C3823b3.f10536a);

    /* renamed from: r0 */
    public static final C3953l3 f11021r0;

    /* renamed from: s */
    public static final C3953l3 f11022s = m15025a("measurement.upload.backoff_period", 43200000L, 43200000L, C3888g3.f10682a);

    /* renamed from: s0 */
    public static final C3953l3 f11023s0;

    /* renamed from: t */
    public static final C3953l3 f11024t = m15025a("measurement.upload.window_interval", 3600000L, 3600000L, C3901h3.f10719a);

    /* renamed from: t0 */
    public static final C3953l3 f11025t0;

    /* renamed from: u */
    public static final C3953l3 f11026u = m15025a("measurement.upload.interval", 3600000L, 3600000L, C3807a0.f10501a);

    /* renamed from: u0 */
    public static final C3953l3 f11027u0;

    /* renamed from: v */
    public static final C3953l3 f11028v = m15025a("measurement.upload.realtime_upload_interval", 10000L, 10000L, C3833c0.f10555a);

    /* renamed from: v0 */
    public static final C3953l3 f11029v0;

    /* renamed from: w */
    public static final C3953l3 f11030w = m15025a("measurement.upload.debug_upload_interval", 1000L, 1000L, C3859e0.f10640a);

    /* renamed from: w0 */
    public static final C3953l3 f11031w0;

    /* renamed from: x */
    public static final C3953l3 f11032x = m15025a("measurement.upload.minimum_delay", 500L, 500L, C3872f0.f10661a);

    /* renamed from: x0 */
    public static final C3953l3 f11033x0;

    /* renamed from: y */
    public static final C3953l3 f11034y = m15025a("measurement.alarm_manager.minimum_interval", 60000L, 60000L, C3885g0.f10679a);

    /* renamed from: y0 */
    public static final C3953l3 f11035y0;

    /* renamed from: z */
    public static final C3953l3 f11036z = m15025a("measurement.upload.stale_data_deletion_interval", 86400000L, 86400000L, C3898h0.f10716a);

    /* renamed from: z0 */
    public static final C3953l3 f11037z0;

    static {
        Integer valueOf = Integer.valueOf(RNCWebViewManager.COMMAND_CLEAR_FORM_DATA);
        f11006k = m15025a("measurement.upload.max_events_per_bundle", valueOf, valueOf, C3849d3.f10622a);
        f11010m = m15025a("measurement.upload.max_error_events_per_day", valueOf, valueOf, C4083w0.f11352a);
        Integer valueOf2 = Integer.valueOf(ModuleDescriptor.MODULE_VERSION);
        f11014o = m15025a("measurement.upload.max_conversions_per_day", valueOf2, valueOf2, C4048t1.f11294a);
        Boolean bool = Boolean.FALSE;
        f10971L = m15025a("measurement.test.boolean_flag", bool, bool, C4035s0.f11259a);
        Double valueOf3 = Double.valueOf(-3.0d);
        f10975P = m15025a("measurement.test.double_flag", valueOf3, valueOf3, C4095x0.f11385a);
        Boolean bool2 = Boolean.TRUE;
        f10980U = m15025a("measurement.collection.log_event_and_bundle_v2", bool2, bool2, C3860e1.f10641a);
        f10981V = m15025a("measurement.quality.checksum", bool, bool, (C3914i3) null);
        f10982W = m15025a("measurement.audience.use_bundle_end_timestamp_for_non_sequence_property_filters", bool, bool, C3873f1.f10662a);
        f10983X = m15025a("measurement.audience.refresh_event_count_filters_timestamp", bool, bool, C3886g1.f10680a);
        f10984Y = m15025a("measurement.audience.use_bundle_timestamp_for_event_count_filters", bool, bool, C3899h1.f10717a);
        f10985Z = m15025a("measurement.sdk.collection.retrieve_deeplink_from_bow_2", bool2, bool2, C3925j1.f10814a);
        f10987a0 = m15025a("measurement.sdk.collection.last_deep_link_referrer_campaign2", bool, bool, C3938k1.f10847a);
        f10989b0 = m15025a("measurement.lifecycle.app_in_background_parameter", bool, bool, C3951l1.f10879a);
        f10991c0 = m15025a("measurement.integration.disable_firebase_instance_id", bool, bool, C3964m1.f10948a);
        f10993d0 = m15025a("measurement.collection.service.update_with_analytics_fix", bool, bool, C3976n1.f11068a);
        f10995e0 = m15025a("measurement.client.firebase_feature_rollout.v1.enable", bool2, bool2, C4000p1.f11105a);
        f10997f0 = m15025a("measurement.client.sessions.check_on_reset_and_enable2", bool2, bool2, C4012q1.f11185a);
        f10999g0 = m15025a("measurement.collection.synthetic_data_mitigation", bool, bool, C4024r1.f11223a);
        f11003i0 = m15025a("measurement.client.click_identifier_control.dev", bool, bool, C4060u1.f11311a);
        f11005j0 = m15025a("measurement.service.click_identifier_control", bool, bool, C4072v1.f11335a);
        f11007k0 = m15025a("measurement.module.pixie.fix_array", bool2, bool2, C4084w1.f11353a);
        f11009l0 = m15025a("measurement.adid_zero.only_request_adid_if_enabled", bool2, bool2, C4096x1.f11386a);
        f11011m0 = m15025a("measurement.service.refactor.package_side_screen", bool2, bool2, C4108y1.f11418a);
        f11013n0 = m15025a("measurement.enhanced_campaign.service", bool2, bool2, C4120z1.f11446a);
        f11015o0 = m15025a("measurement.enhanced_campaign.client", bool2, bool2, C3822b2.f10535a);
        f11017p0 = m15025a("measurement.enhanced_campaign.srsltid.client", bool2, bool2, C3835c2.f10558a);
        f11019q0 = m15025a("measurement.enhanced_campaign.srsltid.service", bool2, bool2, C3861e2.f10642a);
        f11021r0 = m15025a("measurement.service.store_null_safelist", bool2, bool2, C3887g2.f10681a);
        f11023s0 = m15025a("measurement.service.store_safelist", bool2, bool2, C3900h2.f10718a);
        f11025t0 = m15025a("measurement.redaction.no_aiid_in_config_request", bool2, bool2, C3913i2.f10777a);
        f11027u0 = m15025a("measurement.redaction.config_redacted_fields", bool2, bool2, C3926j2.f10815a);
        f11029v0 = m15025a("measurement.redaction.upload_redacted_fields", bool2, bool2, C3939k2.f10848a);
        f11031w0 = m15025a("measurement.redaction.upload_subdomain_override", bool2, bool2, C3952l2.f10880a);
        f11033x0 = m15025a("measurement.redaction.device_info", bool2, bool2, C3965m2.f10949a);
        f11035y0 = m15025a("measurement.redaction.user_id", bool2, bool2, C3989o2.f11084a);
        f11037z0 = m15025a("measurement.redaction.google_signals", bool2, bool2, C4001p2.f11106a);
        f10951A0 = m15025a("measurement.collection.enable_session_stitching_token.service", bool, bool, C4025r2.f11224a);
        f10953B0 = m15025a("measurement.collection.enable_session_stitching_token.client.dev", bool, bool, C4037s2.f11261a);
        f10955C0 = m15025a("measurement.redaction.app_instance_id", bool2, bool2, C4049t2.f11295a);
        f10957D0 = m15025a("measurement.redaction.populate_ephemeral_app_instance_id", bool2, bool2, C4061u2.f11312a);
        f10959E0 = m15025a("measurement.redaction.enhanced_uid", bool2, bool2, C4073v2.f11336a);
        f10961F0 = m15025a("measurement.redaction.e_tag", bool2, bool2, C4085w2.f11354a);
        f10963G0 = m15025a("measurement.redaction.client_ephemeral_aiid_generation", bool2, bool2, C4097x2.f11387a);
        f10965H0 = m15025a("measurement.redaction.retain_major_os_version", bool2, bool2, C4109y2.f11419a);
        f10967I0 = m15025a("measurement.redaction.scion_payload_generator", bool, bool, C3810a3.f10504a);
        f10969J0 = m15025a("measurement.audience.dynamic_filters.oob_fix", bool2, bool2, C3836c3.f10559a);
    }

    /* renamed from: a */
    static C3953l3 m15025a(String str, Object obj, Object obj2, C3914i3 i3Var) {
        C3953l3 l3Var = new C3953l3(str, obj, obj2, i3Var, (C3940k3) null);
        f10986a.add(l3Var);
        return l3Var;
    }

    /* renamed from: c */
    public static Map m15027c(Context context) {
        C7088y5 b = C7088y5.m27037b(context.getContentResolver(), C6849j6.m25968a("com.google.android.gms.measurement"), C4118z.f11444f);
        return b == null ? Collections.emptyMap() : b.mo20451c();
    }
}
