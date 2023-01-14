package com.google.android.gms.measurement.internal;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.os.Parcelable;
import android.text.TextUtils;
import com.facebook.react.modules.appstate.AppStateModule;
import com.google.android.gms.common.internal.C3705r;
import com.reactnativecommunity.webview.RNCWebViewManager;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import okhttp3.HttpUrl;
import p174e.p319f.p320a.p335c.p345f.p352g.C6863k4;
import p174e.p319f.p320a.p335c.p345f.p352g.C7047vc;

/* renamed from: com.google.android.gms.measurement.internal.n */
final class C3974n extends C3843ca {
    /* access modifiers changed from: private */

    /* renamed from: d */
    public static final String[] f11057d = {"last_bundled_timestamp", "ALTER TABLE events ADD COLUMN last_bundled_timestamp INTEGER;", "last_bundled_day", "ALTER TABLE events ADD COLUMN last_bundled_day INTEGER;", "last_sampled_complex_event_id", "ALTER TABLE events ADD COLUMN last_sampled_complex_event_id INTEGER;", "last_sampling_rate", "ALTER TABLE events ADD COLUMN last_sampling_rate INTEGER;", "last_exempt_from_sampling", "ALTER TABLE events ADD COLUMN last_exempt_from_sampling INTEGER;", "current_session_count", "ALTER TABLE events ADD COLUMN current_session_count INTEGER;"};
    /* access modifiers changed from: private */

    /* renamed from: e */
    public static final String[] f11058e = {"origin", "ALTER TABLE user_attributes ADD COLUMN origin TEXT;"};
    /* access modifiers changed from: private */

    /* renamed from: f */
    public static final String[] f11059f = {"app_version", "ALTER TABLE apps ADD COLUMN app_version TEXT;", "app_store", "ALTER TABLE apps ADD COLUMN app_store TEXT;", "gmp_version", "ALTER TABLE apps ADD COLUMN gmp_version INTEGER;", "dev_cert_hash", "ALTER TABLE apps ADD COLUMN dev_cert_hash INTEGER;", "measurement_enabled", "ALTER TABLE apps ADD COLUMN measurement_enabled INTEGER;", "last_bundle_start_timestamp", "ALTER TABLE apps ADD COLUMN last_bundle_start_timestamp INTEGER;", "day", "ALTER TABLE apps ADD COLUMN day INTEGER;", "daily_public_events_count", "ALTER TABLE apps ADD COLUMN daily_public_events_count INTEGER;", "daily_events_count", "ALTER TABLE apps ADD COLUMN daily_events_count INTEGER;", "daily_conversions_count", "ALTER TABLE apps ADD COLUMN daily_conversions_count INTEGER;", "remote_config", "ALTER TABLE apps ADD COLUMN remote_config BLOB;", "config_fetched_time", "ALTER TABLE apps ADD COLUMN config_fetched_time INTEGER;", "failed_config_fetch_time", "ALTER TABLE apps ADD COLUMN failed_config_fetch_time INTEGER;", "app_version_int", "ALTER TABLE apps ADD COLUMN app_version_int INTEGER;", "firebase_instance_id", "ALTER TABLE apps ADD COLUMN firebase_instance_id TEXT;", "daily_error_events_count", "ALTER TABLE apps ADD COLUMN daily_error_events_count INTEGER;", "daily_realtime_events_count", "ALTER TABLE apps ADD COLUMN daily_realtime_events_count INTEGER;", "health_monitor_sample", "ALTER TABLE apps ADD COLUMN health_monitor_sample TEXT;", "android_id", "ALTER TABLE apps ADD COLUMN android_id INTEGER;", "adid_reporting_enabled", "ALTER TABLE apps ADD COLUMN adid_reporting_enabled INTEGER;", "ssaid_reporting_enabled", "ALTER TABLE apps ADD COLUMN ssaid_reporting_enabled INTEGER;", "admob_app_id", "ALTER TABLE apps ADD COLUMN admob_app_id TEXT;", "linked_admob_app_id", "ALTER TABLE apps ADD COLUMN linked_admob_app_id TEXT;", "dynamite_version", "ALTER TABLE apps ADD COLUMN dynamite_version INTEGER;", "safelisted_events", "ALTER TABLE apps ADD COLUMN safelisted_events TEXT;", "ga_app_id", "ALTER TABLE apps ADD COLUMN ga_app_id TEXT;", "config_last_modified_time", "ALTER TABLE apps ADD COLUMN config_last_modified_time TEXT;", "e_tag", "ALTER TABLE apps ADD COLUMN e_tag TEXT;", "session_stitching_token", "ALTER TABLE apps ADD COLUMN session_stitching_token TEXT;"};
    /* access modifiers changed from: private */

    /* renamed from: g */
    public static final String[] f11060g = {"realtime", "ALTER TABLE raw_events ADD COLUMN realtime INTEGER;"};
    /* access modifiers changed from: private */

    /* renamed from: h */
    public static final String[] f11061h = {"has_realtime", "ALTER TABLE queue ADD COLUMN has_realtime INTEGER;", "retry_count", "ALTER TABLE queue ADD COLUMN retry_count INTEGER;"};
    /* access modifiers changed from: private */

    /* renamed from: i */
    public static final String[] f11062i = {"session_scoped", "ALTER TABLE event_filters ADD COLUMN session_scoped BOOLEAN;"};
    /* access modifiers changed from: private */

    /* renamed from: j */
    public static final String[] f11063j = {"session_scoped", "ALTER TABLE property_filters ADD COLUMN session_scoped BOOLEAN;"};
    /* access modifiers changed from: private */

    /* renamed from: k */
    public static final String[] f11064k = {"previous_install_count", "ALTER TABLE app2 ADD COLUMN previous_install_count INTEGER;"};

    /* renamed from: l */
    private final C3962m f11065l;
    /* access modifiers changed from: private */

    /* renamed from: m */
    public final C4116y9 f11066m = new C4116y9(this.f10651a.mo11936c());

    C3974n(C4009pa paVar) {
        super(paVar);
        this.f10651a.mo12181z();
        this.f11065l = new C3962m(this, this.f10651a.mo11938f(), "google_app_measurement.db");
    }

    /* renamed from: H */
    static final void m15037H(ContentValues contentValues, String str, Object obj) {
        C3705r.m14342g("value");
        C3705r.m14346k(obj);
        if (obj instanceof String) {
            contentValues.put("value", (String) obj);
        } else if (obj instanceof Long) {
            contentValues.put("value", (Long) obj);
        } else if (obj instanceof Double) {
            contentValues.put("value", (Double) obj);
        } else {
            throw new IllegalArgumentException("Invalid value type");
        }
    }

    /* renamed from: I */
    private final long m15038I(String str, String[] strArr) {
        Cursor cursor = null;
        try {
            cursor = mo12202P().rawQuery(str, strArr);
            if (cursor.moveToFirst()) {
                long j = cursor.getLong(0);
                cursor.close();
                return j;
            }
            throw new SQLiteException("Database returned empty set");
        } catch (SQLiteException e) {
            this.f10651a.mo11935b().mo12544r().mo12478c("Database error", str, e);
            throw e;
        } catch (Throwable th) {
            if (cursor != null) {
                cursor.close();
            }
            throw th;
        }
    }

    /* renamed from: K */
    private final long m15039K(String str, String[] strArr, long j) {
        Cursor cursor = null;
        try {
            Cursor rawQuery = mo12202P().rawQuery(str, strArr);
            if (rawQuery.moveToFirst()) {
                long j2 = rawQuery.getLong(0);
                rawQuery.close();
                return j2;
            }
            rawQuery.close();
            return j;
        } catch (SQLiteException e) {
            this.f10651a.mo11935b().mo12544r().mo12478c("Database error", str, e);
            throw e;
        } catch (Throwable th) {
            if (cursor != null) {
                cursor.close();
            }
            throw th;
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v2, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v5, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v0, resolved type: java.lang.String[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v4, resolved type: java.lang.String[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v15, resolved type: java.lang.String[]} */
    /* JADX WARNING: type inference failed for: r3v0 */
    /* JADX WARNING: type inference failed for: r3v1, types: [android.database.Cursor] */
    /* JADX WARNING: type inference failed for: r3v3 */
    /* JADX WARNING: type inference failed for: r3v6 */
    /* JADX WARNING: type inference failed for: r3v7 */
    /* JADX WARNING: type inference failed for: r3v8 */
    /* JADX WARNING: type inference failed for: r3v10 */
    /* JADX WARNING: type inference failed for: r3v11 */
    /* JADX WARNING: type inference failed for: r3v12 */
    /* JADX WARNING: type inference failed for: r3v13 */
    /* JADX WARNING: type inference failed for: r3v14 */
    /* JADX WARNING: type inference failed for: r3v15 */
    /* JADX WARNING: type inference failed for: r3v16 */
    /* JADX WARNING: type inference failed for: r3v17 */
    /* JADX WARNING: type inference failed for: r3v18 */
    /* JADX WARNING: type inference failed for: r3v19 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:111:0x0220  */
    /* JADX WARNING: Removed duplicated region for block: B:115:0x0228  */
    /* JADX WARNING: Removed duplicated region for block: B:120:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Unknown top exception splitter block from list: {B:29:0x0088=Splitter:B:29:0x0088, B:12:0x003e=Splitter:B:12:0x003e} */
    /* renamed from: G */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo12196G(java.lang.String r21, long r22, long r24, com.google.android.gms.measurement.internal.C3973ma r26) {
        /*
            r20 = this;
            r1 = r20
            r2 = r26
            com.google.android.gms.common.internal.C3705r.m14346k(r26)
            r20.mo11931h()
            r20.mo11893i()
            r3 = 0
            android.database.sqlite.SQLiteDatabase r0 = r20.mo12202P()     // Catch:{ SQLiteException -> 0x0209, all -> 0x0207 }
            boolean r4 = android.text.TextUtils.isEmpty(r3)     // Catch:{ SQLiteException -> 0x0209, all -> 0x0207 }
            java.lang.String r5 = ""
            r13 = -1
            r15 = 2
            r12 = 1
            r11 = 0
            if (r4 == 0) goto L_0x0071
            int r4 = (r24 > r13 ? 1 : (r24 == r13 ? 0 : -1))
            if (r4 == 0) goto L_0x0032
            java.lang.String[] r6 = new java.lang.String[r15]     // Catch:{ SQLiteException -> 0x0209, all -> 0x0207 }
            java.lang.String r7 = java.lang.String.valueOf(r24)     // Catch:{ SQLiteException -> 0x0209, all -> 0x0207 }
            r6[r11] = r7     // Catch:{ SQLiteException -> 0x0209, all -> 0x0207 }
            java.lang.String r7 = java.lang.String.valueOf(r22)     // Catch:{ SQLiteException -> 0x0209, all -> 0x0207 }
            r6[r12] = r7     // Catch:{ SQLiteException -> 0x0209, all -> 0x0207 }
            goto L_0x003a
        L_0x0032:
            java.lang.String[] r6 = new java.lang.String[r12]     // Catch:{ SQLiteException -> 0x0209, all -> 0x0207 }
            java.lang.String r7 = java.lang.String.valueOf(r22)     // Catch:{ SQLiteException -> 0x0209, all -> 0x0207 }
            r6[r11] = r7     // Catch:{ SQLiteException -> 0x0209, all -> 0x0207 }
        L_0x003a:
            if (r4 == 0) goto L_0x003e
            java.lang.String r5 = "rowid <= ? and "
        L_0x003e:
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ SQLiteException -> 0x0209, all -> 0x0207 }
            r4.<init>()     // Catch:{ SQLiteException -> 0x0209, all -> 0x0207 }
            java.lang.String r7 = "select app_id, metadata_fingerprint from raw_events where "
            r4.append(r7)     // Catch:{ SQLiteException -> 0x0209, all -> 0x0207 }
            r4.append(r5)     // Catch:{ SQLiteException -> 0x0209, all -> 0x0207 }
            java.lang.String r5 = "app_id in (select app_id from apps where config_fetched_time >= ?) order by rowid limit 1;"
            r4.append(r5)     // Catch:{ SQLiteException -> 0x0209, all -> 0x0207 }
            java.lang.String r4 = r4.toString()     // Catch:{ SQLiteException -> 0x0209, all -> 0x0207 }
            android.database.Cursor r4 = r0.rawQuery(r4, r6)     // Catch:{ SQLiteException -> 0x0209, all -> 0x0207 }
            boolean r5 = r4.moveToFirst()     // Catch:{ SQLiteException -> 0x006e }
            if (r5 != 0) goto L_0x0062
            r4.close()
            return
        L_0x0062:
            java.lang.String r3 = r4.getString(r11)     // Catch:{ SQLiteException -> 0x006e }
            java.lang.String r5 = r4.getString(r12)     // Catch:{ SQLiteException -> 0x006e }
            r4.close()     // Catch:{ SQLiteException -> 0x006e }
            goto L_0x00b3
        L_0x006e:
            r0 = move-exception
            goto L_0x020b
        L_0x0071:
            int r4 = (r24 > r13 ? 1 : (r24 == r13 ? 0 : -1))
            if (r4 == 0) goto L_0x0080
            java.lang.String[] r6 = new java.lang.String[r15]     // Catch:{ SQLiteException -> 0x0209, all -> 0x0207 }
            r6[r11] = r3     // Catch:{ SQLiteException -> 0x0209, all -> 0x0207 }
            java.lang.String r7 = java.lang.String.valueOf(r24)     // Catch:{ SQLiteException -> 0x0209, all -> 0x0207 }
            r6[r12] = r7     // Catch:{ SQLiteException -> 0x0209, all -> 0x0207 }
            goto L_0x0084
        L_0x0080:
            java.lang.String[] r6 = new java.lang.String[]{r3}     // Catch:{ SQLiteException -> 0x0209, all -> 0x0207 }
        L_0x0084:
            if (r4 == 0) goto L_0x0088
            java.lang.String r5 = " and rowid <= ?"
        L_0x0088:
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ SQLiteException -> 0x0209, all -> 0x0207 }
            r4.<init>()     // Catch:{ SQLiteException -> 0x0209, all -> 0x0207 }
            java.lang.String r7 = "select metadata_fingerprint from raw_events where app_id = ?"
            r4.append(r7)     // Catch:{ SQLiteException -> 0x0209, all -> 0x0207 }
            r4.append(r5)     // Catch:{ SQLiteException -> 0x0209, all -> 0x0207 }
            java.lang.String r5 = " order by rowid limit 1;"
            r4.append(r5)     // Catch:{ SQLiteException -> 0x0209, all -> 0x0207 }
            java.lang.String r4 = r4.toString()     // Catch:{ SQLiteException -> 0x0209, all -> 0x0207 }
            android.database.Cursor r4 = r0.rawQuery(r4, r6)     // Catch:{ SQLiteException -> 0x0209, all -> 0x0207 }
            boolean r5 = r4.moveToFirst()     // Catch:{ SQLiteException -> 0x006e }
            if (r5 != 0) goto L_0x00ac
            r4.close()
            return
        L_0x00ac:
            java.lang.String r5 = r4.getString(r11)     // Catch:{ SQLiteException -> 0x006e }
            r4.close()     // Catch:{ SQLiteException -> 0x006e }
        L_0x00b3:
            r16 = r4
            r17 = r5
            java.lang.String r4 = "metadata"
            java.lang.String[] r6 = new java.lang.String[]{r4}     // Catch:{ SQLiteException -> 0x0203, all -> 0x01ff }
            java.lang.String[] r8 = new java.lang.String[r15]     // Catch:{ SQLiteException -> 0x0203, all -> 0x01ff }
            r8[r11] = r3     // Catch:{ SQLiteException -> 0x0203, all -> 0x01ff }
            r8[r12] = r17     // Catch:{ SQLiteException -> 0x0203, all -> 0x01ff }
            java.lang.String r5 = "raw_events_metadata"
            java.lang.String r7 = "app_id = ? and metadata_fingerprint = ?"
            r9 = 0
            r10 = 0
            java.lang.String r18 = "rowid"
            java.lang.String r19 = "2"
            r4 = r0
            r15 = 0
            r11 = r18
            r12 = r19
            android.database.Cursor r12 = r4.query(r5, r6, r7, r8, r9, r10, r11, r12)     // Catch:{ SQLiteException -> 0x0203, all -> 0x01ff }
            boolean r4 = r12.moveToFirst()     // Catch:{ SQLiteException -> 0x01fb, all -> 0x01f7 }
            if (r4 != 0) goto L_0x00f4
            com.google.android.gms.measurement.internal.l5 r0 = r1.f10651a     // Catch:{ SQLiteException -> 0x01fb, all -> 0x01f7 }
            com.google.android.gms.measurement.internal.z3 r0 = r0.mo11935b()     // Catch:{ SQLiteException -> 0x01fb, all -> 0x01f7 }
            com.google.android.gms.measurement.internal.x3 r0 = r0.mo12544r()     // Catch:{ SQLiteException -> 0x01fb, all -> 0x01f7 }
            java.lang.String r2 = "Raw event metadata record is missing. appId"
            java.lang.Object r4 = com.google.android.gms.measurement.internal.C4122z3.m15469z(r3)     // Catch:{ SQLiteException -> 0x01fb, all -> 0x01f7 }
            r0.mo12477b(r2, r4)     // Catch:{ SQLiteException -> 0x01fb, all -> 0x01f7 }
            r12.close()
            return
        L_0x00f4:
            byte[] r4 = r12.getBlob(r15)     // Catch:{ SQLiteException -> 0x01fb, all -> 0x01f7 }
            e.f.a.c.f.g.u4 r5 = p174e.p319f.p320a.p335c.p345f.p352g.C7039v4.m26810L1()     // Catch:{ IOException -> 0x01da }
            e.f.a.c.f.g.fa r4 = com.google.android.gms.measurement.internal.C4033ra.m15282C(r5, r4)     // Catch:{ IOException -> 0x01da }
            e.f.a.c.f.g.u4 r4 = (p174e.p319f.p320a.p335c.p345f.p352g.C7023u4) r4     // Catch:{ IOException -> 0x01da }
            e.f.a.c.f.g.a9 r4 = r4.mo20436r()     // Catch:{ IOException -> 0x01da }
            e.f.a.c.f.g.v4 r4 = (p174e.p319f.p320a.p335c.p345f.p352g.C7039v4) r4     // Catch:{ IOException -> 0x01da }
            boolean r5 = r12.moveToNext()     // Catch:{ SQLiteException -> 0x01fb, all -> 0x01f7 }
            if (r5 == 0) goto L_0x0121
            com.google.android.gms.measurement.internal.l5 r5 = r1.f10651a     // Catch:{ SQLiteException -> 0x01fb, all -> 0x01f7 }
            com.google.android.gms.measurement.internal.z3 r5 = r5.mo11935b()     // Catch:{ SQLiteException -> 0x01fb, all -> 0x01f7 }
            com.google.android.gms.measurement.internal.x3 r5 = r5.mo12549w()     // Catch:{ SQLiteException -> 0x01fb, all -> 0x01f7 }
            java.lang.String r6 = "Get multiple raw event metadata records, expected one. appId"
            java.lang.Object r7 = com.google.android.gms.measurement.internal.C4122z3.m15469z(r3)     // Catch:{ SQLiteException -> 0x01fb, all -> 0x01f7 }
            r5.mo12477b(r6, r7)     // Catch:{ SQLiteException -> 0x01fb, all -> 0x01f7 }
        L_0x0121:
            r12.close()     // Catch:{ SQLiteException -> 0x01fb, all -> 0x01f7 }
            com.google.android.gms.common.internal.C3705r.m14346k(r4)     // Catch:{ SQLiteException -> 0x01fb, all -> 0x01f7 }
            r2.f11052a = r4     // Catch:{ SQLiteException -> 0x01fb, all -> 0x01f7 }
            r11 = 3
            int r4 = (r24 > r13 ? 1 : (r24 == r13 ? 0 : -1))
            if (r4 == 0) goto L_0x0141
            java.lang.String r4 = "app_id = ? and metadata_fingerprint = ? and rowid <= ?"
            java.lang.String[] r5 = new java.lang.String[r11]     // Catch:{ SQLiteException -> 0x01fb, all -> 0x01f7 }
            r5[r15] = r3     // Catch:{ SQLiteException -> 0x01fb, all -> 0x01f7 }
            r13 = 1
            r5[r13] = r17     // Catch:{ SQLiteException -> 0x01fb, all -> 0x01f7 }
            java.lang.String r6 = java.lang.String.valueOf(r24)     // Catch:{ SQLiteException -> 0x01fb, all -> 0x01f7 }
            r7 = 2
            r5[r7] = r6     // Catch:{ SQLiteException -> 0x01fb, all -> 0x01f7 }
            r7 = r4
            r8 = r5
            goto L_0x014d
        L_0x0141:
            r13 = 1
            java.lang.String r4 = "app_id = ? and metadata_fingerprint = ?"
            r5 = 2
            java.lang.String[] r6 = new java.lang.String[r5]     // Catch:{ SQLiteException -> 0x01fb, all -> 0x01f7 }
            r6[r15] = r3     // Catch:{ SQLiteException -> 0x01fb, all -> 0x01f7 }
            r6[r13] = r17     // Catch:{ SQLiteException -> 0x01fb, all -> 0x01f7 }
            r7 = r4
            r8 = r6
        L_0x014d:
            java.lang.String r4 = "rowid"
            java.lang.String r5 = "name"
            java.lang.String r6 = "timestamp"
            java.lang.String r9 = "data"
            java.lang.String[] r6 = new java.lang.String[]{r4, r5, r6, r9}     // Catch:{ SQLiteException -> 0x01fb, all -> 0x01f7 }
            java.lang.String r5 = "raw_events"
            r9 = 0
            r10 = 0
            java.lang.String r14 = "rowid"
            r16 = 0
            r4 = r0
            r13 = 3
            r11 = r14
            r14 = r12
            r12 = r16
            android.database.Cursor r4 = r4.query(r5, r6, r7, r8, r9, r10, r11, r12)     // Catch:{ SQLiteException -> 0x01f5, all -> 0x01f3 }
            boolean r0 = r4.moveToFirst()     // Catch:{ SQLiteException -> 0x006e }
            if (r0 == 0) goto L_0x01c3
        L_0x0171:
            long r5 = r4.getLong(r15)     // Catch:{ SQLiteException -> 0x006e }
            byte[] r0 = r4.getBlob(r13)     // Catch:{ SQLiteException -> 0x006e }
            e.f.a.c.f.g.j4 r7 = p174e.p319f.p320a.p335c.p345f.p352g.C6863k4.m26045B()     // Catch:{ IOException -> 0x01a3 }
            e.f.a.c.f.g.fa r0 = com.google.android.gms.measurement.internal.C4033ra.m15282C(r7, r0)     // Catch:{ IOException -> 0x01a3 }
            e.f.a.c.f.g.j4 r0 = (p174e.p319f.p320a.p335c.p345f.p352g.C6847j4) r0     // Catch:{ IOException -> 0x01a3 }
            r7 = 1
            java.lang.String r8 = r4.getString(r7)     // Catch:{ SQLiteException -> 0x006e }
            r0.mo19860D(r8)     // Catch:{ SQLiteException -> 0x006e }
            r8 = 2
            long r9 = r4.getLong(r8)     // Catch:{ SQLiteException -> 0x006e }
            r0.mo19864J(r9)     // Catch:{ SQLiteException -> 0x006e }
            e.f.a.c.f.g.a9 r0 = r0.mo20436r()     // Catch:{ SQLiteException -> 0x006e }
            e.f.a.c.f.g.k4 r0 = (p174e.p319f.p320a.p335c.p345f.p352g.C6863k4) r0     // Catch:{ SQLiteException -> 0x006e }
            boolean r0 = r2.mo12195a(r5, r0)     // Catch:{ SQLiteException -> 0x006e }
            if (r0 != 0) goto L_0x01b9
            r4.close()
            return
        L_0x01a3:
            r0 = move-exception
            r7 = 1
            r8 = 2
            com.google.android.gms.measurement.internal.l5 r5 = r1.f10651a     // Catch:{ SQLiteException -> 0x006e }
            com.google.android.gms.measurement.internal.z3 r5 = r5.mo11935b()     // Catch:{ SQLiteException -> 0x006e }
            com.google.android.gms.measurement.internal.x3 r5 = r5.mo12544r()     // Catch:{ SQLiteException -> 0x006e }
            java.lang.String r6 = "Data loss. Failed to merge raw event. appId"
            java.lang.Object r9 = com.google.android.gms.measurement.internal.C4122z3.m15469z(r3)     // Catch:{ SQLiteException -> 0x006e }
            r5.mo12478c(r6, r9, r0)     // Catch:{ SQLiteException -> 0x006e }
        L_0x01b9:
            boolean r0 = r4.moveToNext()     // Catch:{ SQLiteException -> 0x006e }
            if (r0 != 0) goto L_0x0171
            r4.close()
            return
        L_0x01c3:
            com.google.android.gms.measurement.internal.l5 r0 = r1.f10651a     // Catch:{ SQLiteException -> 0x006e }
            com.google.android.gms.measurement.internal.z3 r0 = r0.mo11935b()     // Catch:{ SQLiteException -> 0x006e }
            com.google.android.gms.measurement.internal.x3 r0 = r0.mo12549w()     // Catch:{ SQLiteException -> 0x006e }
            java.lang.String r2 = "Raw event data disappeared while in transaction. appId"
            java.lang.Object r5 = com.google.android.gms.measurement.internal.C4122z3.m15469z(r3)     // Catch:{ SQLiteException -> 0x006e }
            r0.mo12477b(r2, r5)     // Catch:{ SQLiteException -> 0x006e }
            r4.close()
            return
        L_0x01da:
            r0 = move-exception
            r14 = r12
            com.google.android.gms.measurement.internal.l5 r2 = r1.f10651a     // Catch:{ SQLiteException -> 0x01f5, all -> 0x01f3 }
            com.google.android.gms.measurement.internal.z3 r2 = r2.mo11935b()     // Catch:{ SQLiteException -> 0x01f5, all -> 0x01f3 }
            com.google.android.gms.measurement.internal.x3 r2 = r2.mo12544r()     // Catch:{ SQLiteException -> 0x01f5, all -> 0x01f3 }
            java.lang.String r4 = "Data loss. Failed to merge raw event metadata. appId"
            java.lang.Object r5 = com.google.android.gms.measurement.internal.C4122z3.m15469z(r3)     // Catch:{ SQLiteException -> 0x01f5, all -> 0x01f3 }
            r2.mo12478c(r4, r5, r0)     // Catch:{ SQLiteException -> 0x01f5, all -> 0x01f3 }
            r14.close()
            return
        L_0x01f3:
            r0 = move-exception
            goto L_0x01f9
        L_0x01f5:
            r0 = move-exception
            goto L_0x01fd
        L_0x01f7:
            r0 = move-exception
            r14 = r12
        L_0x01f9:
            r3 = r14
            goto L_0x0226
        L_0x01fb:
            r0 = move-exception
            r14 = r12
        L_0x01fd:
            r4 = r14
            goto L_0x020b
        L_0x01ff:
            r0 = move-exception
            r3 = r16
            goto L_0x0226
        L_0x0203:
            r0 = move-exception
            r4 = r16
            goto L_0x020b
        L_0x0207:
            r0 = move-exception
            goto L_0x0226
        L_0x0209:
            r0 = move-exception
            r4 = r3
        L_0x020b:
            com.google.android.gms.measurement.internal.l5 r2 = r1.f10651a     // Catch:{ all -> 0x0224 }
            com.google.android.gms.measurement.internal.z3 r2 = r2.mo11935b()     // Catch:{ all -> 0x0224 }
            com.google.android.gms.measurement.internal.x3 r2 = r2.mo12544r()     // Catch:{ all -> 0x0224 }
            java.lang.String r5 = "Data loss. Error selecting raw event. appId"
            java.lang.Object r3 = com.google.android.gms.measurement.internal.C4122z3.m15469z(r3)     // Catch:{ all -> 0x0224 }
            r2.mo12478c(r5, r3, r0)     // Catch:{ all -> 0x0224 }
            if (r4 == 0) goto L_0x0223
            r4.close()
        L_0x0223:
            return
        L_0x0224:
            r0 = move-exception
            r3 = r4
        L_0x0226:
            if (r3 == 0) goto L_0x022b
            r3.close()
        L_0x022b:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.C3974n.mo12196G(java.lang.String, long, long, com.google.android.gms.measurement.internal.ma):void");
    }

    /* renamed from: J */
    public final int mo12197J(String str, String str2) {
        C3705r.m14342g(str);
        C3705r.m14342g(str2);
        mo11931h();
        mo11893i();
        try {
            return mo12202P().delete("conditional_properties", "app_id=? and name=?", new String[]{str, str2});
        } catch (SQLiteException e) {
            this.f10651a.mo11935b().mo12544r().mo12479d("Error deleting conditional property", C4122z3.m15469z(str), this.f10651a.mo12152D().mo12440f(str2), e);
            return 0;
        }
    }

    /* JADX INFO: finally extract failed */
    /* access modifiers changed from: protected */
    /* renamed from: L */
    public final long mo12198L(String str, String str2) {
        String str3 = str;
        C3705r.m14342g(str);
        C3705r.m14342g("first_open_count");
        mo11931h();
        mo11893i();
        SQLiteDatabase P = mo12202P();
        P.beginTransaction();
        long j = 0;
        try {
            long K = m15039K("select " + "first_open_count" + " from app2 where app_id=?", new String[]{str3}, -1);
            if (K == -1) {
                ContentValues contentValues = new ContentValues();
                contentValues.put("app_id", str3);
                contentValues.put("first_open_count", 0);
                contentValues.put("previous_install_count", 0);
                if (P.insertWithOnConflict("app2", (String) null, contentValues, 5) == -1) {
                    this.f10651a.mo11935b().mo12544r().mo12478c("Failed to insert column (got -1). appId", C4122z3.m15469z(str), "first_open_count");
                    P.endTransaction();
                    return -1;
                }
                K = 0;
            }
            try {
                ContentValues contentValues2 = new ContentValues();
                contentValues2.put("app_id", str3);
                contentValues2.put("first_open_count", Long.valueOf(1 + K));
                if (((long) P.update("app2", contentValues2, "app_id = ?", new String[]{str3})) == 0) {
                    this.f10651a.mo11935b().mo12544r().mo12478c("Failed to update column (got 0). appId", C4122z3.m15469z(str), "first_open_count");
                    P.endTransaction();
                    return -1;
                }
                P.setTransactionSuccessful();
                P.endTransaction();
                return K;
            } catch (SQLiteException e) {
                e = e;
                j = K;
                try {
                    this.f10651a.mo11935b().mo12544r().mo12479d("Error inserting column. appId", C4122z3.m15469z(str), "first_open_count", e);
                    P.endTransaction();
                    return j;
                } catch (Throwable th) {
                    P.endTransaction();
                    throw th;
                }
            }
        } catch (SQLiteException e2) {
            e = e2;
            this.f10651a.mo11935b().mo12544r().mo12479d("Error inserting column. appId", C4122z3.m15469z(str), "first_open_count", e);
            P.endTransaction();
            return j;
        }
    }

    /* renamed from: M */
    public final long mo12199M() {
        return m15039K("select max(bundle_end_timestamp) from queue", (String[]) null, 0);
    }

    /* renamed from: N */
    public final long mo12200N() {
        return m15039K("select max(timestamp) from raw_events", (String[]) null, 0);
    }

    /* renamed from: O */
    public final long mo12201O(String str) {
        C3705r.m14342g(str);
        return m15039K("select count(1) from events where app_id=? and name not like '!_%' escape '!'", new String[]{str}, 0);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: P */
    public final SQLiteDatabase mo12202P() {
        mo11931h();
        try {
            return this.f11065l.getWritableDatabase();
        } catch (SQLiteException e) {
            this.f10651a.mo11935b().mo12549w().mo12477b("Error opening database", e);
            throw e;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:43:0x00d1  */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x00d9  */
    /* renamed from: Q */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final android.os.Bundle mo12203Q(java.lang.String r8) {
        /*
            r7 = this;
            r7.mo11931h()
            r7.mo11893i()
            r0 = 0
            android.database.sqlite.SQLiteDatabase r1 = r7.mo12202P()     // Catch:{ SQLiteException -> 0x00be, all -> 0x00bc }
            r2 = 1
            java.lang.String[] r2 = new java.lang.String[r2]     // Catch:{ SQLiteException -> 0x00be, all -> 0x00bc }
            r3 = 0
            r2[r3] = r8     // Catch:{ SQLiteException -> 0x00be, all -> 0x00bc }
            java.lang.String r4 = "select parameters from default_event_params where app_id=?"
            android.database.Cursor r1 = r1.rawQuery(r4, r2)     // Catch:{ SQLiteException -> 0x00be, all -> 0x00bc }
            boolean r2 = r1.moveToFirst()     // Catch:{ SQLiteException -> 0x00ba }
            if (r2 != 0) goto L_0x0030
            com.google.android.gms.measurement.internal.l5 r8 = r7.f10651a     // Catch:{ SQLiteException -> 0x00ba }
            com.google.android.gms.measurement.internal.z3 r8 = r8.mo11935b()     // Catch:{ SQLiteException -> 0x00ba }
            com.google.android.gms.measurement.internal.x3 r8 = r8.mo12548v()     // Catch:{ SQLiteException -> 0x00ba }
            java.lang.String r2 = "Default event parameters not found"
            r8.mo12476a(r2)     // Catch:{ SQLiteException -> 0x00ba }
            r1.close()
            return r0
        L_0x0030:
            byte[] r2 = r1.getBlob(r3)     // Catch:{ SQLiteException -> 0x00ba }
            e.f.a.c.f.g.j4 r3 = p174e.p319f.p320a.p335c.p345f.p352g.C6863k4.m26045B()     // Catch:{ IOException -> 0x00a2 }
            e.f.a.c.f.g.fa r2 = com.google.android.gms.measurement.internal.C4033ra.m15282C(r3, r2)     // Catch:{ IOException -> 0x00a2 }
            e.f.a.c.f.g.j4 r2 = (p174e.p319f.p320a.p335c.p345f.p352g.C6847j4) r2     // Catch:{ IOException -> 0x00a2 }
            e.f.a.c.f.g.a9 r2 = r2.mo20436r()     // Catch:{ IOException -> 0x00a2 }
            e.f.a.c.f.g.k4 r2 = (p174e.p319f.p320a.p335c.p345f.p352g.C6863k4) r2     // Catch:{ IOException -> 0x00a2 }
            com.google.android.gms.measurement.internal.pa r8 = r7.f10552b     // Catch:{ SQLiteException -> 0x00ba }
            r8.mo12287g0()     // Catch:{ SQLiteException -> 0x00ba }
            java.util.List r8 = r2.mo19917F()     // Catch:{ SQLiteException -> 0x00ba }
            android.os.Bundle r2 = new android.os.Bundle     // Catch:{ SQLiteException -> 0x00ba }
            r2.<init>()     // Catch:{ SQLiteException -> 0x00ba }
            java.util.Iterator r8 = r8.iterator()     // Catch:{ SQLiteException -> 0x00ba }
        L_0x0056:
            boolean r3 = r8.hasNext()     // Catch:{ SQLiteException -> 0x00ba }
            if (r3 == 0) goto L_0x009e
            java.lang.Object r3 = r8.next()     // Catch:{ SQLiteException -> 0x00ba }
            e.f.a.c.f.g.o4 r3 = (p174e.p319f.p320a.p335c.p345f.p352g.C6927o4) r3     // Catch:{ SQLiteException -> 0x00ba }
            java.lang.String r4 = r3.mo20057D()     // Catch:{ SQLiteException -> 0x00ba }
            boolean r5 = r3.mo20060Q()     // Catch:{ SQLiteException -> 0x00ba }
            if (r5 == 0) goto L_0x0074
            double r5 = r3.mo20065x()     // Catch:{ SQLiteException -> 0x00ba }
            r2.putDouble(r4, r5)     // Catch:{ SQLiteException -> 0x00ba }
            goto L_0x0056
        L_0x0074:
            boolean r5 = r3.mo20061R()     // Catch:{ SQLiteException -> 0x00ba }
            if (r5 == 0) goto L_0x0082
            float r3 = r3.mo20066y()     // Catch:{ SQLiteException -> 0x00ba }
            r2.putFloat(r4, r3)     // Catch:{ SQLiteException -> 0x00ba }
            goto L_0x0056
        L_0x0082:
            boolean r5 = r3.mo20064U()     // Catch:{ SQLiteException -> 0x00ba }
            if (r5 == 0) goto L_0x0090
            java.lang.String r3 = r3.mo20058E()     // Catch:{ SQLiteException -> 0x00ba }
            r2.putString(r4, r3)     // Catch:{ SQLiteException -> 0x00ba }
            goto L_0x0056
        L_0x0090:
            boolean r5 = r3.mo20062S()     // Catch:{ SQLiteException -> 0x00ba }
            if (r5 == 0) goto L_0x0056
            long r5 = r3.mo20056A()     // Catch:{ SQLiteException -> 0x00ba }
            r2.putLong(r4, r5)     // Catch:{ SQLiteException -> 0x00ba }
            goto L_0x0056
        L_0x009e:
            r1.close()
            return r2
        L_0x00a2:
            r2 = move-exception
            com.google.android.gms.measurement.internal.l5 r3 = r7.f10651a     // Catch:{ SQLiteException -> 0x00ba }
            com.google.android.gms.measurement.internal.z3 r3 = r3.mo11935b()     // Catch:{ SQLiteException -> 0x00ba }
            com.google.android.gms.measurement.internal.x3 r3 = r3.mo12544r()     // Catch:{ SQLiteException -> 0x00ba }
            java.lang.String r4 = "Failed to retrieve default event parameters. appId"
            java.lang.Object r8 = com.google.android.gms.measurement.internal.C4122z3.m15469z(r8)     // Catch:{ SQLiteException -> 0x00ba }
            r3.mo12478c(r4, r8, r2)     // Catch:{ SQLiteException -> 0x00ba }
            r1.close()
            return r0
        L_0x00ba:
            r8 = move-exception
            goto L_0x00c0
        L_0x00bc:
            r8 = move-exception
            goto L_0x00d7
        L_0x00be:
            r8 = move-exception
            r1 = r0
        L_0x00c0:
            com.google.android.gms.measurement.internal.l5 r2 = r7.f10651a     // Catch:{ all -> 0x00d5 }
            com.google.android.gms.measurement.internal.z3 r2 = r2.mo11935b()     // Catch:{ all -> 0x00d5 }
            com.google.android.gms.measurement.internal.x3 r2 = r2.mo12544r()     // Catch:{ all -> 0x00d5 }
            java.lang.String r3 = "Error selecting default event parameters"
            r2.mo12477b(r3, r8)     // Catch:{ all -> 0x00d5 }
            if (r1 == 0) goto L_0x00d4
            r1.close()
        L_0x00d4:
            return r0
        L_0x00d5:
            r8 = move-exception
            r0 = r1
        L_0x00d7:
            if (r0 == 0) goto L_0x00dc
            r0.close()
        L_0x00dc:
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.C3974n.mo12203Q(java.lang.String):android.os.Bundle");
    }

    /* JADX WARNING: Removed duplicated region for block: B:18:0x0119 A[Catch:{ SQLiteException -> 0x01cb }] */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x011d A[Catch:{ SQLiteException -> 0x01cb }] */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x0151 A[Catch:{ SQLiteException -> 0x01cb }] */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x016d A[Catch:{ SQLiteException -> 0x01cb }] */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x0170 A[Catch:{ SQLiteException -> 0x01cb }] */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x017f A[Catch:{ SQLiteException -> 0x01cb }] */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x01a2 A[Catch:{ SQLiteException -> 0x01cb }] */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x01b4 A[Catch:{ SQLiteException -> 0x01cb }] */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x01e6  */
    /* JADX WARNING: Removed duplicated region for block: B:53:0x01ee  */
    /* renamed from: R */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.google.android.gms.measurement.internal.C3904h6 mo12204R(java.lang.String r35) {
        /*
            r34 = this;
            r1 = r34
            r2 = r35
            com.google.android.gms.common.internal.C3705r.m14342g(r35)
            r34.mo11931h()
            r34.mo11893i()
            r3 = 0
            android.database.sqlite.SQLiteDatabase r4 = r34.mo12202P()     // Catch:{ SQLiteException -> 0x01cf, all -> 0x01cd }
            java.lang.String r5 = "app_instance_id"
            java.lang.String r6 = "gmp_app_id"
            java.lang.String r7 = "resettable_device_id_hash"
            java.lang.String r8 = "last_bundle_index"
            java.lang.String r9 = "last_bundle_start_timestamp"
            java.lang.String r10 = "last_bundle_end_timestamp"
            java.lang.String r11 = "app_version"
            java.lang.String r12 = "app_store"
            java.lang.String r13 = "gmp_version"
            java.lang.String r14 = "dev_cert_hash"
            java.lang.String r15 = "measurement_enabled"
            java.lang.String r16 = "day"
            java.lang.String r17 = "daily_public_events_count"
            java.lang.String r18 = "daily_events_count"
            java.lang.String r19 = "daily_conversions_count"
            java.lang.String r20 = "config_fetched_time"
            java.lang.String r21 = "failed_config_fetch_time"
            java.lang.String r22 = "app_version_int"
            java.lang.String r23 = "firebase_instance_id"
            java.lang.String r24 = "daily_error_events_count"
            java.lang.String r25 = "daily_realtime_events_count"
            java.lang.String r26 = "health_monitor_sample"
            java.lang.String r27 = "android_id"
            java.lang.String r28 = "adid_reporting_enabled"
            java.lang.String r29 = "admob_app_id"
            java.lang.String r30 = "dynamite_version"
            java.lang.String r31 = "safelisted_events"
            java.lang.String r32 = "ga_app_id"
            java.lang.String r33 = "session_stitching_token"
            java.lang.String[] r6 = new java.lang.String[]{r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32, r33}     // Catch:{ SQLiteException -> 0x01cf, all -> 0x01cd }
            r0 = 1
            java.lang.String[] r8 = new java.lang.String[r0]     // Catch:{ SQLiteException -> 0x01cf, all -> 0x01cd }
            r12 = 0
            r8[r12] = r2     // Catch:{ SQLiteException -> 0x01cf, all -> 0x01cd }
            java.lang.String r5 = "apps"
            java.lang.String r7 = "app_id=?"
            r9 = 0
            r10 = 0
            r11 = 0
            android.database.Cursor r4 = r4.query(r5, r6, r7, r8, r9, r10, r11)     // Catch:{ SQLiteException -> 0x01cf, all -> 0x01cd }
            boolean r5 = r4.moveToFirst()     // Catch:{ SQLiteException -> 0x01cb }
            if (r5 != 0) goto L_0x006b
            r4.close()
            return r3
        L_0x006b:
            com.google.android.gms.measurement.internal.h6 r5 = new com.google.android.gms.measurement.internal.h6     // Catch:{ SQLiteException -> 0x01cb }
            com.google.android.gms.measurement.internal.pa r6 = r1.f10552b     // Catch:{ SQLiteException -> 0x01cb }
            com.google.android.gms.measurement.internal.l5 r6 = r6.mo12282c0()     // Catch:{ SQLiteException -> 0x01cb }
            r5.<init>(r6, r2)     // Catch:{ SQLiteException -> 0x01cb }
            java.lang.String r6 = r4.getString(r12)     // Catch:{ SQLiteException -> 0x01cb }
            r5.mo12076h(r6)     // Catch:{ SQLiteException -> 0x01cb }
            java.lang.String r6 = r4.getString(r0)     // Catch:{ SQLiteException -> 0x01cb }
            r5.mo12094w(r6)     // Catch:{ SQLiteException -> 0x01cb }
            r6 = 2
            java.lang.String r6 = r4.getString(r6)     // Catch:{ SQLiteException -> 0x01cb }
            r5.mo12041F(r6)     // Catch:{ SQLiteException -> 0x01cb }
            r6 = 3
            long r6 = r4.getLong(r6)     // Catch:{ SQLiteException -> 0x01cb }
            r5.mo12037B(r6)     // Catch:{ SQLiteException -> 0x01cb }
            r6 = 4
            long r6 = r4.getLong(r6)     // Catch:{ SQLiteException -> 0x01cb }
            r5.mo12038C(r6)     // Catch:{ SQLiteException -> 0x01cb }
            r6 = 5
            long r6 = r4.getLong(r6)     // Catch:{ SQLiteException -> 0x01cb }
            r5.mo12097z(r6)     // Catch:{ SQLiteException -> 0x01cb }
            r6 = 6
            java.lang.String r6 = r4.getString(r6)     // Catch:{ SQLiteException -> 0x01cb }
            r5.mo12080j(r6)     // Catch:{ SQLiteException -> 0x01cb }
            r6 = 7
            java.lang.String r6 = r4.getString(r6)     // Catch:{ SQLiteException -> 0x01cb }
            r5.mo12078i(r6)     // Catch:{ SQLiteException -> 0x01cb }
            r6 = 8
            long r6 = r4.getLong(r6)     // Catch:{ SQLiteException -> 0x01cb }
            r5.mo12095x(r6)     // Catch:{ SQLiteException -> 0x01cb }
            r6 = 9
            long r6 = r4.getLong(r6)     // Catch:{ SQLiteException -> 0x01cb }
            r5.mo12090s(r6)     // Catch:{ SQLiteException -> 0x01cb }
            r6 = 10
            boolean r7 = r4.isNull(r6)     // Catch:{ SQLiteException -> 0x01cb }
            if (r7 != 0) goto L_0x00d7
            int r6 = r4.getInt(r6)     // Catch:{ SQLiteException -> 0x01cb }
            if (r6 == 0) goto L_0x00d5
            goto L_0x00d7
        L_0x00d5:
            r6 = 0
            goto L_0x00d8
        L_0x00d7:
            r6 = 1
        L_0x00d8:
            r5.mo12039D(r6)     // Catch:{ SQLiteException -> 0x01cb }
            r6 = 11
            long r6 = r4.getLong(r6)     // Catch:{ SQLiteException -> 0x01cb }
            r5.mo12089r(r6)     // Catch:{ SQLiteException -> 0x01cb }
            r6 = 12
            long r6 = r4.getLong(r6)     // Catch:{ SQLiteException -> 0x01cb }
            r5.mo12087p(r6)     // Catch:{ SQLiteException -> 0x01cb }
            r6 = 13
            long r6 = r4.getLong(r6)     // Catch:{ SQLiteException -> 0x01cb }
            r5.mo12086o(r6)     // Catch:{ SQLiteException -> 0x01cb }
            r6 = 14
            long r6 = r4.getLong(r6)     // Catch:{ SQLiteException -> 0x01cb }
            r5.mo12084m(r6)     // Catch:{ SQLiteException -> 0x01cb }
            r6 = 15
            long r6 = r4.getLong(r6)     // Catch:{ SQLiteException -> 0x01cb }
            r5.mo12083l(r6)     // Catch:{ SQLiteException -> 0x01cb }
            r6 = 16
            long r6 = r4.getLong(r6)     // Catch:{ SQLiteException -> 0x01cb }
            r5.mo12092u(r6)     // Catch:{ SQLiteException -> 0x01cb }
            r6 = 17
            boolean r7 = r4.isNull(r6)     // Catch:{ SQLiteException -> 0x01cb }
            if (r7 == 0) goto L_0x011d
            r6 = -2147483648(0xffffffff80000000, double:NaN)
            goto L_0x0122
        L_0x011d:
            int r6 = r4.getInt(r6)     // Catch:{ SQLiteException -> 0x01cb }
            long r6 = (long) r6     // Catch:{ SQLiteException -> 0x01cb }
        L_0x0122:
            r5.mo12082k(r6)     // Catch:{ SQLiteException -> 0x01cb }
            r6 = 18
            java.lang.String r6 = r4.getString(r6)     // Catch:{ SQLiteException -> 0x01cb }
            r5.mo12093v(r6)     // Catch:{ SQLiteException -> 0x01cb }
            r6 = 19
            long r6 = r4.getLong(r6)     // Catch:{ SQLiteException -> 0x01cb }
            r5.mo12085n(r6)     // Catch:{ SQLiteException -> 0x01cb }
            r6 = 20
            long r6 = r4.getLong(r6)     // Catch:{ SQLiteException -> 0x01cb }
            r5.mo12088q(r6)     // Catch:{ SQLiteException -> 0x01cb }
            r6 = 21
            java.lang.String r6 = r4.getString(r6)     // Catch:{ SQLiteException -> 0x01cb }
            r5.mo12096y(r6)     // Catch:{ SQLiteException -> 0x01cb }
            r6 = 23
            boolean r7 = r4.isNull(r6)     // Catch:{ SQLiteException -> 0x01cb }
            if (r7 != 0) goto L_0x0159
            int r6 = r4.getInt(r6)     // Catch:{ SQLiteException -> 0x01cb }
            if (r6 == 0) goto L_0x0158
            goto L_0x0159
        L_0x0158:
            r0 = 0
        L_0x0159:
            r5.mo12074g(r0)     // Catch:{ SQLiteException -> 0x01cb }
            r0 = 24
            java.lang.String r0 = r4.getString(r0)     // Catch:{ SQLiteException -> 0x01cb }
            r5.mo12072f(r0)     // Catch:{ SQLiteException -> 0x01cb }
            r0 = 25
            boolean r6 = r4.isNull(r0)     // Catch:{ SQLiteException -> 0x01cb }
            if (r6 == 0) goto L_0x0170
            r6 = 0
            goto L_0x0174
        L_0x0170:
            long r6 = r4.getLong(r0)     // Catch:{ SQLiteException -> 0x01cb }
        L_0x0174:
            r5.mo12091t(r6)     // Catch:{ SQLiteException -> 0x01cb }
            r0 = 26
            boolean r6 = r4.isNull(r0)     // Catch:{ SQLiteException -> 0x01cb }
            if (r6 != 0) goto L_0x0191
            java.lang.String r0 = r4.getString(r0)     // Catch:{ SQLiteException -> 0x01cb }
            java.lang.String r6 = ","
            r7 = -1
            java.lang.String[] r0 = r0.split(r6, r7)     // Catch:{ SQLiteException -> 0x01cb }
            java.util.List r0 = java.util.Arrays.asList(r0)     // Catch:{ SQLiteException -> 0x01cb }
            r5.mo12042G(r0)     // Catch:{ SQLiteException -> 0x01cb }
        L_0x0191:
            p174e.p319f.p320a.p335c.p345f.p352g.C6825he.m25843b()     // Catch:{ SQLiteException -> 0x01cb }
            com.google.android.gms.measurement.internal.l5 r0 = r1.f10651a     // Catch:{ SQLiteException -> 0x01cb }
            com.google.android.gms.measurement.internal.h r0 = r0.mo12181z()     // Catch:{ SQLiteException -> 0x01cb }
            com.google.android.gms.measurement.internal.l3 r6 = com.google.android.gms.measurement.internal.C3966m3.f10951A0     // Catch:{ SQLiteException -> 0x01cb }
            boolean r0 = r0.mo12010B(r3, r6)     // Catch:{ SQLiteException -> 0x01cb }
            if (r0 == 0) goto L_0x01ab
            r0 = 28
            java.lang.String r0 = r4.getString(r0)     // Catch:{ SQLiteException -> 0x01cb }
            r5.mo12043H(r0)     // Catch:{ SQLiteException -> 0x01cb }
        L_0x01ab:
            r5.mo12068d()     // Catch:{ SQLiteException -> 0x01cb }
            boolean r0 = r4.moveToNext()     // Catch:{ SQLiteException -> 0x01cb }
            if (r0 == 0) goto L_0x01c7
            com.google.android.gms.measurement.internal.l5 r0 = r1.f10651a     // Catch:{ SQLiteException -> 0x01cb }
            com.google.android.gms.measurement.internal.z3 r0 = r0.mo11935b()     // Catch:{ SQLiteException -> 0x01cb }
            com.google.android.gms.measurement.internal.x3 r0 = r0.mo12544r()     // Catch:{ SQLiteException -> 0x01cb }
            java.lang.String r6 = "Got multiple records for app, expected one. appId"
            java.lang.Object r7 = com.google.android.gms.measurement.internal.C4122z3.m15469z(r35)     // Catch:{ SQLiteException -> 0x01cb }
            r0.mo12477b(r6, r7)     // Catch:{ SQLiteException -> 0x01cb }
        L_0x01c7:
            r4.close()
            return r5
        L_0x01cb:
            r0 = move-exception
            goto L_0x01d1
        L_0x01cd:
            r0 = move-exception
            goto L_0x01ec
        L_0x01cf:
            r0 = move-exception
            r4 = r3
        L_0x01d1:
            com.google.android.gms.measurement.internal.l5 r5 = r1.f10651a     // Catch:{ all -> 0x01ea }
            com.google.android.gms.measurement.internal.z3 r5 = r5.mo11935b()     // Catch:{ all -> 0x01ea }
            com.google.android.gms.measurement.internal.x3 r5 = r5.mo12544r()     // Catch:{ all -> 0x01ea }
            java.lang.String r6 = "Error querying app. appId"
            java.lang.Object r2 = com.google.android.gms.measurement.internal.C4122z3.m15469z(r35)     // Catch:{ all -> 0x01ea }
            r5.mo12478c(r6, r2, r0)     // Catch:{ all -> 0x01ea }
            if (r4 == 0) goto L_0x01e9
            r4.close()
        L_0x01e9:
            return r3
        L_0x01ea:
            r0 = move-exception
            r3 = r4
        L_0x01ec:
            if (r3 == 0) goto L_0x01f1
            r3.close()
        L_0x01f1:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.C3974n.mo12204R(java.lang.String):com.google.android.gms.measurement.internal.h6");
    }

    /* JADX WARNING: Removed duplicated region for block: B:28:0x011e  */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x0126  */
    /* renamed from: S */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.google.android.gms.measurement.internal.C3845d mo12205S(java.lang.String r31, java.lang.String r32) {
        /*
            r30 = this;
            r1 = r30
            r8 = r32
            com.google.android.gms.common.internal.C3705r.m14342g(r31)
            com.google.android.gms.common.internal.C3705r.m14342g(r32)
            r30.mo11931h()
            r30.mo11893i()
            r9 = 0
            android.database.sqlite.SQLiteDatabase r10 = r30.mo12202P()     // Catch:{ SQLiteException -> 0x00fd, all -> 0x00fb }
            java.lang.String r11 = "origin"
            java.lang.String r12 = "value"
            java.lang.String r13 = "active"
            java.lang.String r14 = "trigger_event_name"
            java.lang.String r15 = "trigger_timeout"
            java.lang.String r16 = "timed_out_event"
            java.lang.String r17 = "creation_timestamp"
            java.lang.String r18 = "triggered_event"
            java.lang.String r19 = "triggered_timestamp"
            java.lang.String r20 = "time_to_live"
            java.lang.String r21 = "expired_event"
            java.lang.String[] r12 = new java.lang.String[]{r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21}     // Catch:{ SQLiteException -> 0x00fd, all -> 0x00fb }
            r0 = 2
            java.lang.String[] r14 = new java.lang.String[r0]     // Catch:{ SQLiteException -> 0x00fd, all -> 0x00fb }
            r2 = 0
            r14[r2] = r31     // Catch:{ SQLiteException -> 0x00fd, all -> 0x00fb }
            r3 = 1
            r14[r3] = r8     // Catch:{ SQLiteException -> 0x00fd, all -> 0x00fb }
            java.lang.String r11 = "conditional_properties"
            java.lang.String r13 = "app_id=? and name=?"
            r15 = 0
            r16 = 0
            r17 = 0
            android.database.Cursor r10 = r10.query(r11, r12, r13, r14, r15, r16, r17)     // Catch:{ SQLiteException -> 0x00fd, all -> 0x00fb }
            boolean r4 = r10.moveToFirst()     // Catch:{ SQLiteException -> 0x00f9 }
            if (r4 != 0) goto L_0x004f
            r10.close()
            return r9
        L_0x004f:
            java.lang.String r4 = r10.getString(r2)     // Catch:{ SQLiteException -> 0x00f9 }
            if (r4 != 0) goto L_0x0057
            java.lang.String r4 = ""
        L_0x0057:
            r17 = r4
            java.lang.Object r6 = r1.mo12210Y(r10, r3)     // Catch:{ SQLiteException -> 0x00f9 }
            int r0 = r10.getInt(r0)     // Catch:{ SQLiteException -> 0x00f9 }
            if (r0 == 0) goto L_0x0066
            r21 = 1
            goto L_0x0068
        L_0x0066:
            r21 = 0
        L_0x0068:
            r0 = 3
            java.lang.String r22 = r10.getString(r0)     // Catch:{ SQLiteException -> 0x00f9 }
            r0 = 4
            long r24 = r10.getLong(r0)     // Catch:{ SQLiteException -> 0x00f9 }
            com.google.android.gms.measurement.internal.pa r0 = r1.f10552b     // Catch:{ SQLiteException -> 0x00f9 }
            com.google.android.gms.measurement.internal.ra r0 = r0.mo12287g0()     // Catch:{ SQLiteException -> 0x00f9 }
            r2 = 5
            byte[] r2 = r10.getBlob(r2)     // Catch:{ SQLiteException -> 0x00f9 }
            android.os.Parcelable$Creator<com.google.android.gms.measurement.internal.x> r3 = com.google.android.gms.measurement.internal.C4094x.CREATOR     // Catch:{ SQLiteException -> 0x00f9 }
            android.os.Parcelable r0 = r0.mo12402z(r2, r3)     // Catch:{ SQLiteException -> 0x00f9 }
            r23 = r0
            com.google.android.gms.measurement.internal.x r23 = (com.google.android.gms.measurement.internal.C4094x) r23     // Catch:{ SQLiteException -> 0x00f9 }
            r0 = 6
            long r19 = r10.getLong(r0)     // Catch:{ SQLiteException -> 0x00f9 }
            com.google.android.gms.measurement.internal.pa r0 = r1.f10552b     // Catch:{ SQLiteException -> 0x00f9 }
            com.google.android.gms.measurement.internal.ra r0 = r0.mo12287g0()     // Catch:{ SQLiteException -> 0x00f9 }
            r2 = 7
            byte[] r2 = r10.getBlob(r2)     // Catch:{ SQLiteException -> 0x00f9 }
            android.os.Parcelable r0 = r0.mo12402z(r2, r3)     // Catch:{ SQLiteException -> 0x00f9 }
            r26 = r0
            com.google.android.gms.measurement.internal.x r26 = (com.google.android.gms.measurement.internal.C4094x) r26     // Catch:{ SQLiteException -> 0x00f9 }
            r0 = 8
            long r4 = r10.getLong(r0)     // Catch:{ SQLiteException -> 0x00f9 }
            r0 = 9
            long r27 = r10.getLong(r0)     // Catch:{ SQLiteException -> 0x00f9 }
            com.google.android.gms.measurement.internal.pa r0 = r1.f10552b     // Catch:{ SQLiteException -> 0x00f9 }
            com.google.android.gms.measurement.internal.ra r0 = r0.mo12287g0()     // Catch:{ SQLiteException -> 0x00f9 }
            r2 = 10
            byte[] r2 = r10.getBlob(r2)     // Catch:{ SQLiteException -> 0x00f9 }
            android.os.Parcelable r0 = r0.mo12402z(r2, r3)     // Catch:{ SQLiteException -> 0x00f9 }
            r29 = r0
            com.google.android.gms.measurement.internal.x r29 = (com.google.android.gms.measurement.internal.C4094x) r29     // Catch:{ SQLiteException -> 0x00f9 }
            com.google.android.gms.measurement.internal.sa r18 = new com.google.android.gms.measurement.internal.sa     // Catch:{ SQLiteException -> 0x00f9 }
            r2 = r18
            r3 = r32
            r7 = r17
            r2.<init>(r3, r4, r6, r7)     // Catch:{ SQLiteException -> 0x00f9 }
            com.google.android.gms.measurement.internal.d r0 = new com.google.android.gms.measurement.internal.d     // Catch:{ SQLiteException -> 0x00f9 }
            r15 = r0
            r16 = r31
            r15.<init>(r16, r17, r18, r19, r21, r22, r23, r24, r26, r27, r29)     // Catch:{ SQLiteException -> 0x00f9 }
            boolean r2 = r10.moveToNext()     // Catch:{ SQLiteException -> 0x00f9 }
            if (r2 == 0) goto L_0x00f5
            com.google.android.gms.measurement.internal.l5 r2 = r1.f10651a     // Catch:{ SQLiteException -> 0x00f9 }
            com.google.android.gms.measurement.internal.z3 r2 = r2.mo11935b()     // Catch:{ SQLiteException -> 0x00f9 }
            com.google.android.gms.measurement.internal.x3 r2 = r2.mo12544r()     // Catch:{ SQLiteException -> 0x00f9 }
            java.lang.String r3 = "Got multiple records for conditional property, expected one"
            java.lang.Object r4 = com.google.android.gms.measurement.internal.C4122z3.m15469z(r31)     // Catch:{ SQLiteException -> 0x00f9 }
            com.google.android.gms.measurement.internal.l5 r5 = r1.f10651a     // Catch:{ SQLiteException -> 0x00f9 }
            com.google.android.gms.measurement.internal.u3 r5 = r5.mo12152D()     // Catch:{ SQLiteException -> 0x00f9 }
            java.lang.String r5 = r5.mo12440f(r8)     // Catch:{ SQLiteException -> 0x00f9 }
            r2.mo12478c(r3, r4, r5)     // Catch:{ SQLiteException -> 0x00f9 }
        L_0x00f5:
            r10.close()
            return r0
        L_0x00f9:
            r0 = move-exception
            goto L_0x00ff
        L_0x00fb:
            r0 = move-exception
            goto L_0x0124
        L_0x00fd:
            r0 = move-exception
            r10 = r9
        L_0x00ff:
            com.google.android.gms.measurement.internal.l5 r2 = r1.f10651a     // Catch:{ all -> 0x0122 }
            com.google.android.gms.measurement.internal.z3 r2 = r2.mo11935b()     // Catch:{ all -> 0x0122 }
            com.google.android.gms.measurement.internal.x3 r2 = r2.mo12544r()     // Catch:{ all -> 0x0122 }
            java.lang.String r3 = "Error querying conditional property"
            java.lang.Object r4 = com.google.android.gms.measurement.internal.C4122z3.m15469z(r31)     // Catch:{ all -> 0x0122 }
            com.google.android.gms.measurement.internal.l5 r5 = r1.f10651a     // Catch:{ all -> 0x0122 }
            com.google.android.gms.measurement.internal.u3 r5 = r5.mo12152D()     // Catch:{ all -> 0x0122 }
            java.lang.String r5 = r5.mo12440f(r8)     // Catch:{ all -> 0x0122 }
            r2.mo12479d(r3, r4, r5, r0)     // Catch:{ all -> 0x0122 }
            if (r10 == 0) goto L_0x0121
            r10.close()
        L_0x0121:
            return r9
        L_0x0122:
            r0 = move-exception
            r9 = r10
        L_0x0124:
            if (r9 == 0) goto L_0x0129
            r9.close()
        L_0x0129:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.C3974n.mo12205S(java.lang.String, java.lang.String):com.google.android.gms.measurement.internal.d");
    }

    /* renamed from: T */
    public final C3949l mo12206T(long j, String str, boolean z, boolean z2, boolean z3, boolean z4, boolean z5) {
        return mo12207U(j, str, 1, false, false, z3, false, z5);
    }

    /* renamed from: U */
    public final C3949l mo12207U(long j, String str, long j2, boolean z, boolean z2, boolean z3, boolean z4, boolean z5) {
        C3705r.m14342g(str);
        mo11931h();
        mo11893i();
        String[] strArr = {str};
        C3949l lVar = new C3949l();
        Cursor cursor = null;
        try {
            SQLiteDatabase P = mo12202P();
            cursor = P.query("apps", new String[]{"day", "daily_events_count", "daily_public_events_count", "daily_conversions_count", "daily_error_events_count", "daily_realtime_events_count"}, "app_id=?", new String[]{str}, (String) null, (String) null, (String) null);
            if (!cursor.moveToFirst()) {
                this.f10651a.mo11935b().mo12549w().mo12477b("Not updating daily counts, app is not known. appId", C4122z3.m15469z(str));
                cursor.close();
                return lVar;
            }
            if (cursor.getLong(0) == j) {
                lVar.f10874b = cursor.getLong(1);
                lVar.f10873a = cursor.getLong(2);
                lVar.f10875c = cursor.getLong(3);
                lVar.f10876d = cursor.getLong(4);
                lVar.f10877e = cursor.getLong(5);
            }
            if (z) {
                lVar.f10874b += j2;
            }
            if (z2) {
                lVar.f10873a += j2;
            }
            if (z3) {
                lVar.f10875c += j2;
            }
            if (z4) {
                lVar.f10876d += j2;
            }
            if (z5) {
                lVar.f10877e += j2;
            }
            ContentValues contentValues = new ContentValues();
            contentValues.put("day", Long.valueOf(j));
            contentValues.put("daily_public_events_count", Long.valueOf(lVar.f10873a));
            contentValues.put("daily_events_count", Long.valueOf(lVar.f10874b));
            contentValues.put("daily_conversions_count", Long.valueOf(lVar.f10875c));
            contentValues.put("daily_error_events_count", Long.valueOf(lVar.f10876d));
            contentValues.put("daily_realtime_events_count", Long.valueOf(lVar.f10877e));
            P.update("apps", contentValues, "app_id=?", strArr);
            cursor.close();
            return lVar;
        } catch (SQLiteException e) {
            this.f10651a.mo11935b().mo12544r().mo12478c("Error updating daily counts. appId", C4122z3.m15469z(str), e);
            if (cursor != null) {
                cursor.close();
            }
            return lVar;
        } catch (Throwable th) {
            if (cursor != null) {
                cursor.close();
            }
            throw th;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:58:0x0147  */
    /* JADX WARNING: Removed duplicated region for block: B:63:0x0150  */
    /* renamed from: V */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.google.android.gms.measurement.internal.C4046t mo12208V(java.lang.String r28, java.lang.String r29) {
        /*
            r27 = this;
            r1 = r27
            r15 = r29
            com.google.android.gms.common.internal.C3705r.m14342g(r28)
            com.google.android.gms.common.internal.C3705r.m14342g(r29)
            r27.mo11931h()
            r27.mo11893i()
            java.util.ArrayList r0 = new java.util.ArrayList
            java.lang.String r2 = "lifetime_count"
            java.lang.String r3 = "current_bundle_count"
            java.lang.String r4 = "last_fire_timestamp"
            java.lang.String r5 = "last_bundled_timestamp"
            java.lang.String r6 = "last_bundled_day"
            java.lang.String r7 = "last_sampled_complex_event_id"
            java.lang.String r8 = "last_sampling_rate"
            java.lang.String r9 = "last_exempt_from_sampling"
            java.lang.String r10 = "current_session_count"
            java.lang.String[] r2 = new java.lang.String[]{r2, r3, r4, r5, r6, r7, r8, r9, r10}
            java.util.List r2 = java.util.Arrays.asList(r2)
            r0.<init>(r2)
            r19 = 0
            android.database.sqlite.SQLiteDatabase r2 = r27.mo12202P()     // Catch:{ SQLiteException -> 0x0123, all -> 0x0121 }
            r10 = 0
            java.lang.String[] r3 = new java.lang.String[r10]     // Catch:{ SQLiteException -> 0x0123, all -> 0x0121 }
            java.lang.Object[] r0 = r0.toArray(r3)     // Catch:{ SQLiteException -> 0x0123, all -> 0x0121 }
            r4 = r0
            java.lang.String[] r4 = (java.lang.String[]) r4     // Catch:{ SQLiteException -> 0x0123, all -> 0x0121 }
            r0 = 2
            java.lang.String[] r6 = new java.lang.String[r0]     // Catch:{ SQLiteException -> 0x0123, all -> 0x0121 }
            r6[r10] = r28     // Catch:{ SQLiteException -> 0x0123, all -> 0x0121 }
            r11 = 1
            r6[r11] = r15     // Catch:{ SQLiteException -> 0x0123, all -> 0x0121 }
            java.lang.String r3 = "events"
            java.lang.String r5 = "app_id=? and name=?"
            r7 = 0
            r8 = 0
            r9 = 0
            android.database.Cursor r13 = r2.query(r3, r4, r5, r6, r7, r8, r9)     // Catch:{ SQLiteException -> 0x0123, all -> 0x0121 }
            boolean r2 = r13.moveToFirst()     // Catch:{ SQLiteException -> 0x011b, all -> 0x0115 }
            if (r2 != 0) goto L_0x005c
            r13.close()
            return r19
        L_0x005c:
            long r5 = r13.getLong(r10)     // Catch:{ SQLiteException -> 0x011b, all -> 0x0115 }
            long r7 = r13.getLong(r11)     // Catch:{ SQLiteException -> 0x011b, all -> 0x0115 }
            long r16 = r13.getLong(r0)     // Catch:{ SQLiteException -> 0x011b, all -> 0x0115 }
            r0 = 3
            boolean r2 = r13.isNull(r0)     // Catch:{ SQLiteException -> 0x011b, all -> 0x0115 }
            r3 = 0
            if (r2 == 0) goto L_0x0074
            r20 = r3
            goto L_0x0078
        L_0x0074:
            long r20 = r13.getLong(r0)     // Catch:{ SQLiteException -> 0x011b, all -> 0x0115 }
        L_0x0078:
            r0 = 4
            boolean r2 = r13.isNull(r0)     // Catch:{ SQLiteException -> 0x011b, all -> 0x0115 }
            if (r2 == 0) goto L_0x0082
            r0 = r19
            goto L_0x008a
        L_0x0082:
            long r22 = r13.getLong(r0)     // Catch:{ SQLiteException -> 0x011b, all -> 0x0115 }
            java.lang.Long r0 = java.lang.Long.valueOf(r22)     // Catch:{ SQLiteException -> 0x011b, all -> 0x0115 }
        L_0x008a:
            r2 = 5
            boolean r9 = r13.isNull(r2)     // Catch:{ SQLiteException -> 0x011b, all -> 0x0115 }
            if (r9 == 0) goto L_0x0094
            r18 = r19
            goto L_0x009e
        L_0x0094:
            long r22 = r13.getLong(r2)     // Catch:{ SQLiteException -> 0x011b, all -> 0x0115 }
            java.lang.Long r2 = java.lang.Long.valueOf(r22)     // Catch:{ SQLiteException -> 0x011b, all -> 0x0115 }
            r18 = r2
        L_0x009e:
            r2 = 6
            boolean r9 = r13.isNull(r2)     // Catch:{ SQLiteException -> 0x011b, all -> 0x0115 }
            if (r9 == 0) goto L_0x00a8
            r22 = r19
            goto L_0x00b2
        L_0x00a8:
            long r22 = r13.getLong(r2)     // Catch:{ SQLiteException -> 0x011b, all -> 0x0115 }
            java.lang.Long r2 = java.lang.Long.valueOf(r22)     // Catch:{ SQLiteException -> 0x011b, all -> 0x0115 }
            r22 = r2
        L_0x00b2:
            r2 = 7
            boolean r9 = r13.isNull(r2)     // Catch:{ SQLiteException -> 0x011b, all -> 0x0115 }
            if (r9 != 0) goto L_0x00cb
            long r23 = r13.getLong(r2)     // Catch:{ SQLiteException -> 0x011b, all -> 0x0115 }
            r25 = 1
            int r2 = (r23 > r25 ? 1 : (r23 == r25 ? 0 : -1))
            if (r2 != 0) goto L_0x00c4
            r10 = 1
        L_0x00c4:
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r10)     // Catch:{ SQLiteException -> 0x011b, all -> 0x0115 }
            r23 = r2
            goto L_0x00cd
        L_0x00cb:
            r23 = r19
        L_0x00cd:
            r2 = 8
            boolean r9 = r13.isNull(r2)     // Catch:{ SQLiteException -> 0x011b, all -> 0x0115 }
            if (r9 == 0) goto L_0x00d7
            r9 = r3
            goto L_0x00dc
        L_0x00d7:
            long r2 = r13.getLong(r2)     // Catch:{ SQLiteException -> 0x011b, all -> 0x0115 }
            r9 = r2
        L_0x00dc:
            com.google.android.gms.measurement.internal.t r24 = new com.google.android.gms.measurement.internal.t     // Catch:{ SQLiteException -> 0x011b, all -> 0x0115 }
            r2 = r24
            r3 = r28
            r4 = r29
            r11 = r16
            r25 = r13
            r13 = r20
            r15 = r0
            r16 = r18
            r17 = r22
            r18 = r23
            r2.<init>(r3, r4, r5, r7, r9, r11, r13, r15, r16, r17, r18)     // Catch:{ SQLiteException -> 0x0113, all -> 0x0111 }
            boolean r0 = r25.moveToNext()     // Catch:{ SQLiteException -> 0x0113, all -> 0x0111 }
            if (r0 == 0) goto L_0x010d
            com.google.android.gms.measurement.internal.l5 r0 = r1.f10651a     // Catch:{ SQLiteException -> 0x0113, all -> 0x0111 }
            com.google.android.gms.measurement.internal.z3 r0 = r0.mo11935b()     // Catch:{ SQLiteException -> 0x0113, all -> 0x0111 }
            com.google.android.gms.measurement.internal.x3 r0 = r0.mo12544r()     // Catch:{ SQLiteException -> 0x0113, all -> 0x0111 }
            java.lang.String r2 = "Got multiple records for event aggregates, expected one. appId"
            java.lang.Object r3 = com.google.android.gms.measurement.internal.C4122z3.m15469z(r28)     // Catch:{ SQLiteException -> 0x0113, all -> 0x0111 }
            r0.mo12477b(r2, r3)     // Catch:{ SQLiteException -> 0x0113, all -> 0x0111 }
        L_0x010d:
            r25.close()
            return r24
        L_0x0111:
            r0 = move-exception
            goto L_0x0118
        L_0x0113:
            r0 = move-exception
            goto L_0x011e
        L_0x0115:
            r0 = move-exception
            r25 = r13
        L_0x0118:
            r19 = r25
            goto L_0x014e
        L_0x011b:
            r0 = move-exception
            r25 = r13
        L_0x011e:
            r13 = r25
            goto L_0x0126
        L_0x0121:
            r0 = move-exception
            goto L_0x014e
        L_0x0123:
            r0 = move-exception
            r13 = r19
        L_0x0126:
            com.google.android.gms.measurement.internal.l5 r2 = r1.f10651a     // Catch:{ all -> 0x014b }
            com.google.android.gms.measurement.internal.z3 r2 = r2.mo11935b()     // Catch:{ all -> 0x014b }
            com.google.android.gms.measurement.internal.x3 r2 = r2.mo12544r()     // Catch:{ all -> 0x014b }
            java.lang.String r3 = "Error querying events. appId"
            java.lang.Object r4 = com.google.android.gms.measurement.internal.C4122z3.m15469z(r28)     // Catch:{ all -> 0x014b }
            com.google.android.gms.measurement.internal.l5 r5 = r1.f10651a     // Catch:{ all -> 0x014b }
            com.google.android.gms.measurement.internal.u3 r5 = r5.mo12152D()     // Catch:{ all -> 0x014b }
            r6 = r29
            java.lang.String r5 = r5.mo12438d(r6)     // Catch:{ all -> 0x014b }
            r2.mo12479d(r3, r4, r5, r0)     // Catch:{ all -> 0x014b }
            if (r13 == 0) goto L_0x014a
            r13.close()
        L_0x014a:
            return r19
        L_0x014b:
            r0 = move-exception
            r19 = r13
        L_0x014e:
            if (r19 == 0) goto L_0x0153
            r19.close()
        L_0x0153:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.C3974n.mo12208V(java.lang.String, java.lang.String):com.google.android.gms.measurement.internal.t");
    }

    /* JADX WARNING: Removed duplicated region for block: B:26:0x009e  */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x00a6  */
    /* renamed from: X */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.google.android.gms.measurement.internal.C4069ua mo12209X(java.lang.String r20, java.lang.String r21) {
        /*
            r19 = this;
            r1 = r19
            r9 = r21
            com.google.android.gms.common.internal.C3705r.m14342g(r20)
            com.google.android.gms.common.internal.C3705r.m14342g(r21)
            r19.mo11931h()
            r19.mo11893i()
            r10 = 0
            android.database.sqlite.SQLiteDatabase r11 = r19.mo12202P()     // Catch:{ SQLiteException -> 0x007d, all -> 0x007b }
            java.lang.String r0 = "set_timestamp"
            java.lang.String r2 = "value"
            java.lang.String r3 = "origin"
            java.lang.String[] r13 = new java.lang.String[]{r0, r2, r3}     // Catch:{ SQLiteException -> 0x007d, all -> 0x007b }
            r0 = 2
            java.lang.String[] r15 = new java.lang.String[r0]     // Catch:{ SQLiteException -> 0x007d, all -> 0x007b }
            r2 = 0
            r15[r2] = r20     // Catch:{ SQLiteException -> 0x007d, all -> 0x007b }
            r3 = 1
            r15[r3] = r9     // Catch:{ SQLiteException -> 0x007d, all -> 0x007b }
            java.lang.String r12 = "user_attributes"
            java.lang.String r14 = "app_id=? and name=?"
            r16 = 0
            r17 = 0
            r18 = 0
            android.database.Cursor r11 = r11.query(r12, r13, r14, r15, r16, r17, r18)     // Catch:{ SQLiteException -> 0x007d, all -> 0x007b }
            boolean r4 = r11.moveToFirst()     // Catch:{ SQLiteException -> 0x0079 }
            if (r4 != 0) goto L_0x0040
            r11.close()
            return r10
        L_0x0040:
            long r6 = r11.getLong(r2)     // Catch:{ SQLiteException -> 0x0079 }
            java.lang.Object r8 = r1.mo12210Y(r11, r3)     // Catch:{ SQLiteException -> 0x0079 }
            if (r8 != 0) goto L_0x004e
            r11.close()
            return r10
        L_0x004e:
            java.lang.String r4 = r11.getString(r0)     // Catch:{ SQLiteException -> 0x0079 }
            com.google.android.gms.measurement.internal.ua r0 = new com.google.android.gms.measurement.internal.ua     // Catch:{ SQLiteException -> 0x0079 }
            r2 = r0
            r3 = r20
            r5 = r21
            r2.<init>(r3, r4, r5, r6, r8)     // Catch:{ SQLiteException -> 0x0079 }
            boolean r2 = r11.moveToNext()     // Catch:{ SQLiteException -> 0x0079 }
            if (r2 == 0) goto L_0x0075
            com.google.android.gms.measurement.internal.l5 r2 = r1.f10651a     // Catch:{ SQLiteException -> 0x0079 }
            com.google.android.gms.measurement.internal.z3 r2 = r2.mo11935b()     // Catch:{ SQLiteException -> 0x0079 }
            com.google.android.gms.measurement.internal.x3 r2 = r2.mo12544r()     // Catch:{ SQLiteException -> 0x0079 }
            java.lang.String r3 = "Got multiple records for user property, expected one. appId"
            java.lang.Object r4 = com.google.android.gms.measurement.internal.C4122z3.m15469z(r20)     // Catch:{ SQLiteException -> 0x0079 }
            r2.mo12477b(r3, r4)     // Catch:{ SQLiteException -> 0x0079 }
        L_0x0075:
            r11.close()
            return r0
        L_0x0079:
            r0 = move-exception
            goto L_0x007f
        L_0x007b:
            r0 = move-exception
            goto L_0x00a4
        L_0x007d:
            r0 = move-exception
            r11 = r10
        L_0x007f:
            com.google.android.gms.measurement.internal.l5 r2 = r1.f10651a     // Catch:{ all -> 0x00a2 }
            com.google.android.gms.measurement.internal.z3 r2 = r2.mo11935b()     // Catch:{ all -> 0x00a2 }
            com.google.android.gms.measurement.internal.x3 r2 = r2.mo12544r()     // Catch:{ all -> 0x00a2 }
            java.lang.String r3 = "Error querying user property. appId"
            java.lang.Object r4 = com.google.android.gms.measurement.internal.C4122z3.m15469z(r20)     // Catch:{ all -> 0x00a2 }
            com.google.android.gms.measurement.internal.l5 r5 = r1.f10651a     // Catch:{ all -> 0x00a2 }
            com.google.android.gms.measurement.internal.u3 r5 = r5.mo12152D()     // Catch:{ all -> 0x00a2 }
            java.lang.String r5 = r5.mo12440f(r9)     // Catch:{ all -> 0x00a2 }
            r2.mo12479d(r3, r4, r5, r0)     // Catch:{ all -> 0x00a2 }
            if (r11 == 0) goto L_0x00a1
            r11.close()
        L_0x00a1:
            return r10
        L_0x00a2:
            r0 = move-exception
            r10 = r11
        L_0x00a4:
            if (r10 == 0) goto L_0x00a9
            r10.close()
        L_0x00a9:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.C3974n.mo12209X(java.lang.String, java.lang.String):com.google.android.gms.measurement.internal.ua");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: Y */
    public final Object mo12210Y(Cursor cursor, int i) {
        int type = cursor.getType(i);
        if (type == 0) {
            this.f10651a.mo11935b().mo12544r().mo12476a("Loaded invalid null value from database");
            return null;
        } else if (type == 1) {
            return Long.valueOf(cursor.getLong(i));
        } else {
            if (type == 2) {
                return Double.valueOf(cursor.getDouble(i));
            }
            if (type == 3) {
                return cursor.getString(i);
            }
            if (type != 4) {
                this.f10651a.mo11935b().mo12544r().mo12477b("Loaded invalid unknown value type, ignoring it", Integer.valueOf(type));
                return null;
            }
            this.f10651a.mo11935b().mo12544r().mo12476a("Loaded invalid blob type value, ignoring it");
            return null;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:18:0x0036  */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x0040  */
    /* renamed from: Z */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.String mo12211Z() {
        /*
            r6 = this;
            android.database.sqlite.SQLiteDatabase r0 = r6.mo12202P()
            r1 = 0
            java.lang.String r2 = "select app_id from queue order by has_realtime desc, rowid asc limit 1;"
            android.database.Cursor r0 = r0.rawQuery(r2, r1)     // Catch:{ SQLiteException -> 0x0022, all -> 0x0020 }
            boolean r2 = r0.moveToFirst()     // Catch:{ SQLiteException -> 0x001e }
            if (r2 == 0) goto L_0x001a
            r2 = 0
            java.lang.String r1 = r0.getString(r2)     // Catch:{ SQLiteException -> 0x001e }
            r0.close()
            return r1
        L_0x001a:
            r0.close()
            return r1
        L_0x001e:
            r2 = move-exception
            goto L_0x0025
        L_0x0020:
            r0 = move-exception
            goto L_0x003e
        L_0x0022:
            r0 = move-exception
            r2 = r0
            r0 = r1
        L_0x0025:
            com.google.android.gms.measurement.internal.l5 r3 = r6.f10651a     // Catch:{ all -> 0x003a }
            com.google.android.gms.measurement.internal.z3 r3 = r3.mo11935b()     // Catch:{ all -> 0x003a }
            com.google.android.gms.measurement.internal.x3 r3 = r3.mo12544r()     // Catch:{ all -> 0x003a }
            java.lang.String r4 = "Database error getting next bundle app id"
            r3.mo12477b(r4, r2)     // Catch:{ all -> 0x003a }
            if (r0 == 0) goto L_0x0039
            r0.close()
        L_0x0039:
            return r1
        L_0x003a:
            r1 = move-exception
            r5 = r1
            r1 = r0
            r0 = r5
        L_0x003e:
            if (r1 == 0) goto L_0x0043
            r1.close()
        L_0x0043:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.C3974n.mo12211Z():java.lang.String");
    }

    /* renamed from: a0 */
    public final List mo12212a0(String str, String str2, String str3) {
        C3705r.m14342g(str);
        mo11931h();
        mo11893i();
        ArrayList arrayList = new ArrayList(3);
        arrayList.add(str);
        StringBuilder sb = new StringBuilder("app_id=?");
        if (!TextUtils.isEmpty(str2)) {
            arrayList.add(str2);
            sb.append(" and origin=?");
        }
        if (!TextUtils.isEmpty(str3)) {
            arrayList.add(String.valueOf(str3).concat("*"));
            sb.append(" and name glob ?");
        }
        return mo12213b0(sb.toString(), (String[]) arrayList.toArray(new String[arrayList.size()]));
    }

    /* renamed from: b0 */
    public final List mo12213b0(String str, String[] strArr) {
        mo11931h();
        mo11893i();
        ArrayList arrayList = new ArrayList();
        Cursor cursor = null;
        try {
            SQLiteDatabase P = mo12202P();
            String[] strArr2 = {"app_id", "origin", "name", "value", AppStateModule.APP_STATE_ACTIVE, "trigger_event_name", "trigger_timeout", "timed_out_event", "creation_timestamp", "triggered_event", "triggered_timestamp", "time_to_live", "expired_event"};
            this.f10651a.mo12181z();
            Cursor query = P.query("conditional_properties", strArr2, str, strArr, (String) null, (String) null, "rowid", "1001");
            if (query.moveToFirst()) {
                while (true) {
                    int size = arrayList.size();
                    this.f10651a.mo12181z();
                    if (size < 1000) {
                        String string = query.getString(0);
                        String string2 = query.getString(1);
                        String string3 = query.getString(2);
                        Object Y = mo12210Y(query, 3);
                        boolean z = query.getInt(4) != 0;
                        String string4 = query.getString(5);
                        long j = query.getLong(6);
                        C4033ra g0 = this.f10552b.mo12287g0();
                        byte[] blob = query.getBlob(7);
                        Parcelable.Creator<C4094x> creator = C4094x.CREATOR;
                        arrayList.add(new C3845d(string, string2, new C4045sa(string3, query.getLong(10), Y, string2), query.getLong(8), z, string4, (C4094x) g0.mo12402z(blob, creator), j, (C4094x) this.f10552b.mo12287g0().mo12402z(query.getBlob(9), creator), query.getLong(11), (C4094x) this.f10552b.mo12287g0().mo12402z(query.getBlob(12), creator)));
                        if (!query.moveToNext()) {
                            break;
                        }
                    } else {
                        C4098x3 r = this.f10651a.mo11935b().mo12544r();
                        this.f10651a.mo12181z();
                        r.mo12477b("Read more than the max allowed conditional properties, ignoring extra", Integer.valueOf(RNCWebViewManager.COMMAND_CLEAR_FORM_DATA));
                        break;
                    }
                }
                query.close();
                return arrayList;
            }
            query.close();
            return arrayList;
        } catch (SQLiteException e) {
            this.f10651a.mo11935b().mo12544r().mo12477b("Error querying conditional user property value", e);
            List emptyList = Collections.emptyList();
            if (cursor != null) {
                cursor.close();
            }
            return emptyList;
        } catch (Throwable th) {
            if (cursor != null) {
                cursor.close();
            }
            throw th;
        }
    }

    /* renamed from: c0 */
    public final List mo12214c0(String str) {
        C3705r.m14342g(str);
        mo11931h();
        mo11893i();
        ArrayList arrayList = new ArrayList();
        Cursor cursor = null;
        try {
            this.f10651a.mo12181z();
            Cursor query = mo12202P().query("user_attributes", new String[]{"name", "origin", "set_timestamp", "value"}, "app_id=?", new String[]{str}, (String) null, (String) null, "rowid", "1000");
            if (query.moveToFirst()) {
                do {
                    String string = query.getString(0);
                    String string2 = query.getString(1);
                    if (string2 == null) {
                        string2 = HttpUrl.FRAGMENT_ENCODE_SET;
                    }
                    String str2 = string2;
                    long j = query.getLong(2);
                    Object Y = mo12210Y(query, 3);
                    if (Y == null) {
                        this.f10651a.mo11935b().mo12544r().mo12477b("Read invalid user property value, ignoring it. appId", C4122z3.m15469z(str));
                    } else {
                        arrayList.add(new C4069ua(str, str2, string, j, Y));
                    }
                } while (query.moveToNext());
                query.close();
                return arrayList;
            }
            query.close();
            return arrayList;
        } catch (SQLiteException e) {
            this.f10651a.mo11935b().mo12544r().mo12478c("Error querying user properties. appId", C4122z3.m15469z(str), e);
            List emptyList = Collections.emptyList();
            if (cursor != null) {
                cursor.close();
            }
            return emptyList;
        } catch (Throwable th) {
            if (cursor != null) {
                cursor.close();
            }
            throw th;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:39:0x0124 A[DONT_GENERATE] */
    /* renamed from: d0 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.util.List mo12215d0(java.lang.String r18, java.lang.String r19, java.lang.String r20) {
        /*
            r17 = this;
            r1 = r17
            r0 = r20
            com.google.android.gms.common.internal.C3705r.m14342g(r18)
            r17.mo11931h()
            r17.mo11893i()
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            java.lang.String r11 = "1001"
            r12 = 0
            java.util.ArrayList r3 = new java.util.ArrayList     // Catch:{ SQLiteException -> 0x0106 }
            r13 = 3
            r3.<init>(r13)     // Catch:{ SQLiteException -> 0x0106 }
            r14 = r18
            r3.add(r14)     // Catch:{ SQLiteException -> 0x0104 }
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ SQLiteException -> 0x0104 }
            java.lang.String r5 = "app_id=?"
            r4.<init>(r5)     // Catch:{ SQLiteException -> 0x0104 }
            boolean r5 = android.text.TextUtils.isEmpty(r19)     // Catch:{ SQLiteException -> 0x0104 }
            if (r5 != 0) goto L_0x0038
            r15 = r19
            r3.add(r15)     // Catch:{ SQLiteException -> 0x0100 }
            java.lang.String r5 = " and origin=?"
            r4.append(r5)     // Catch:{ SQLiteException -> 0x0100 }
            goto L_0x003a
        L_0x0038:
            r15 = r19
        L_0x003a:
            boolean r5 = android.text.TextUtils.isEmpty(r20)     // Catch:{ SQLiteException -> 0x0100 }
            if (r5 != 0) goto L_0x0059
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch:{ SQLiteException -> 0x0100 }
            r5.<init>()     // Catch:{ SQLiteException -> 0x0100 }
            r5.append(r0)     // Catch:{ SQLiteException -> 0x0100 }
            java.lang.String r6 = "*"
            r5.append(r6)     // Catch:{ SQLiteException -> 0x0100 }
            java.lang.String r5 = r5.toString()     // Catch:{ SQLiteException -> 0x0100 }
            r3.add(r5)     // Catch:{ SQLiteException -> 0x0100 }
            java.lang.String r5 = " and name glob ?"
            r4.append(r5)     // Catch:{ SQLiteException -> 0x0100 }
        L_0x0059:
            int r5 = r3.size()     // Catch:{ SQLiteException -> 0x0100 }
            java.lang.String[] r5 = new java.lang.String[r5]     // Catch:{ SQLiteException -> 0x0100 }
            java.lang.Object[] r3 = r3.toArray(r5)     // Catch:{ SQLiteException -> 0x0100 }
            r7 = r3
            java.lang.String[] r7 = (java.lang.String[]) r7     // Catch:{ SQLiteException -> 0x0100 }
            android.database.sqlite.SQLiteDatabase r3 = r17.mo12202P()     // Catch:{ SQLiteException -> 0x0100 }
            java.lang.String r5 = "user_attributes"
            java.lang.String r6 = "name"
            java.lang.String r8 = "set_timestamp"
            java.lang.String r9 = "value"
            java.lang.String r10 = "origin"
            java.lang.String[] r6 = new java.lang.String[]{r6, r8, r9, r10}     // Catch:{ SQLiteException -> 0x0100 }
            java.lang.String r8 = r4.toString()     // Catch:{ SQLiteException -> 0x0100 }
            java.lang.String r10 = "rowid"
            com.google.android.gms.measurement.internal.l5 r4 = r1.f10651a     // Catch:{ SQLiteException -> 0x0100 }
            r4.mo12181z()     // Catch:{ SQLiteException -> 0x0100 }
            r9 = 0
            r16 = 0
            r4 = r5
            r5 = r6
            r6 = r8
            r8 = r9
            r9 = r16
            android.database.Cursor r12 = r3.query(r4, r5, r6, r7, r8, r9, r10, r11)     // Catch:{ SQLiteException -> 0x0100 }
            boolean r3 = r12.moveToFirst()     // Catch:{ SQLiteException -> 0x0100 }
            if (r3 != 0) goto L_0x009a
            r12.close()
            return r2
        L_0x009a:
            int r3 = r2.size()     // Catch:{ SQLiteException -> 0x0100 }
            com.google.android.gms.measurement.internal.l5 r4 = r1.f10651a     // Catch:{ SQLiteException -> 0x0100 }
            r4.mo12181z()     // Catch:{ SQLiteException -> 0x0100 }
            r4 = 1000(0x3e8, float:1.401E-42)
            if (r3 < r4) goto L_0x00c0
            com.google.android.gms.measurement.internal.l5 r0 = r1.f10651a     // Catch:{ SQLiteException -> 0x0100 }
            com.google.android.gms.measurement.internal.z3 r0 = r0.mo11935b()     // Catch:{ SQLiteException -> 0x0100 }
            com.google.android.gms.measurement.internal.x3 r0 = r0.mo12544r()     // Catch:{ SQLiteException -> 0x0100 }
            java.lang.String r3 = "Read more than the max allowed user properties, ignoring excess"
            com.google.android.gms.measurement.internal.l5 r5 = r1.f10651a     // Catch:{ SQLiteException -> 0x0100 }
            r5.mo12181z()     // Catch:{ SQLiteException -> 0x0100 }
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)     // Catch:{ SQLiteException -> 0x0100 }
            r0.mo12477b(r3, r4)     // Catch:{ SQLiteException -> 0x0100 }
            goto L_0x00fc
        L_0x00c0:
            r3 = 0
            java.lang.String r7 = r12.getString(r3)     // Catch:{ SQLiteException -> 0x0100 }
            r3 = 1
            long r8 = r12.getLong(r3)     // Catch:{ SQLiteException -> 0x0100 }
            r3 = 2
            java.lang.Object r10 = r1.mo12210Y(r12, r3)     // Catch:{ SQLiteException -> 0x0100 }
            java.lang.String r15 = r12.getString(r13)     // Catch:{ SQLiteException -> 0x0100 }
            if (r10 != 0) goto L_0x00e9
            com.google.android.gms.measurement.internal.l5 r3 = r1.f10651a     // Catch:{ SQLiteException -> 0x0100 }
            com.google.android.gms.measurement.internal.z3 r3 = r3.mo11935b()     // Catch:{ SQLiteException -> 0x0100 }
            com.google.android.gms.measurement.internal.x3 r3 = r3.mo12544r()     // Catch:{ SQLiteException -> 0x0100 }
            java.lang.String r4 = "(2)Read invalid user property value, ignoring it"
            java.lang.Object r5 = com.google.android.gms.measurement.internal.C4122z3.m15469z(r18)     // Catch:{ SQLiteException -> 0x0100 }
            r3.mo12479d(r4, r5, r15, r0)     // Catch:{ SQLiteException -> 0x0100 }
            goto L_0x00f5
        L_0x00e9:
            com.google.android.gms.measurement.internal.ua r3 = new com.google.android.gms.measurement.internal.ua     // Catch:{ SQLiteException -> 0x0100 }
            r4 = r3
            r5 = r18
            r6 = r15
            r4.<init>(r5, r6, r7, r8, r10)     // Catch:{ SQLiteException -> 0x0100 }
            r2.add(r3)     // Catch:{ SQLiteException -> 0x0100 }
        L_0x00f5:
            boolean r3 = r12.moveToNext()     // Catch:{ SQLiteException -> 0x0100 }
            if (r3 == 0) goto L_0x00fc
            goto L_0x009a
        L_0x00fc:
            r12.close()
            return r2
        L_0x0100:
            r0 = move-exception
            goto L_0x010b
        L_0x0102:
            r0 = move-exception
            goto L_0x0128
        L_0x0104:
            r0 = move-exception
            goto L_0x0109
        L_0x0106:
            r0 = move-exception
            r14 = r18
        L_0x0109:
            r15 = r19
        L_0x010b:
            com.google.android.gms.measurement.internal.l5 r2 = r1.f10651a     // Catch:{ all -> 0x0102 }
            com.google.android.gms.measurement.internal.z3 r2 = r2.mo11935b()     // Catch:{ all -> 0x0102 }
            com.google.android.gms.measurement.internal.x3 r2 = r2.mo12544r()     // Catch:{ all -> 0x0102 }
            java.lang.String r3 = "(2)Error querying user properties"
            java.lang.Object r4 = com.google.android.gms.measurement.internal.C4122z3.m15469z(r18)     // Catch:{ all -> 0x0102 }
            r2.mo12479d(r3, r4, r15, r0)     // Catch:{ all -> 0x0102 }
            java.util.List r0 = java.util.Collections.emptyList()     // Catch:{ all -> 0x0102 }
            if (r12 == 0) goto L_0x0127
            r12.close()
        L_0x0127:
            return r0
        L_0x0128:
            if (r12 == 0) goto L_0x012d
            r12.close()
        L_0x012d:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.C3974n.mo12215d0(java.lang.String, java.lang.String, java.lang.String):java.util.List");
    }

    /* renamed from: e0 */
    public final void mo12216e0() {
        mo11893i();
        mo12202P().beginTransaction();
    }

    /* renamed from: f0 */
    public final void mo12217f0() {
        mo11893i();
        mo12202P().endTransaction();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: g0 */
    public final void mo12218g0(List list) {
        mo11931h();
        mo11893i();
        C3705r.m14346k(list);
        C3705r.m14348m(list.size());
        if (mo12228u()) {
            String str = "(" + TextUtils.join(",", list) + ")";
            if (m15038I("SELECT COUNT(1) FROM queue WHERE rowid IN " + str + " AND retry_count =  2147483647 LIMIT 1", (String[]) null) > 0) {
                this.f10651a.mo11935b().mo12549w().mo12476a("The number of upload retries exceeds the limit. Will remain unchanged.");
            }
            try {
                mo12202P().execSQL("UPDATE queue SET retry_count = IFNULL(retry_count, 0) + 1 WHERE rowid IN " + str + " AND (retry_count IS NULL OR retry_count < 2147483647)");
            } catch (SQLiteException e) {
                this.f10651a.mo11935b().mo12544r().mo12477b("Error incrementing retry count. error", e);
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: h0 */
    public final void mo12219h0() {
        mo11931h();
        mo11893i();
        if (mo12228u()) {
            long a = this.f10552b.mo12285e0().f10834e.mo12147a();
            long b = this.f10651a.mo11936c().mo11731b();
            long abs = Math.abs(b - a);
            this.f10651a.mo12181z();
            if (abs > ((Long) C3966m3.f11036z.mo12145a((Object) null)).longValue()) {
                this.f10552b.mo12285e0().f10834e.mo12148b(b);
                mo11931h();
                mo11893i();
                if (mo12228u()) {
                    SQLiteDatabase P = mo12202P();
                    this.f10651a.mo12181z();
                    int delete = P.delete("queue", "abs(bundle_end_timestamp - ?) > cast(? as integer)", new String[]{String.valueOf(this.f10651a.mo11936c().mo11730a()), String.valueOf(C3897h.m14818i())});
                    if (delete > 0) {
                        this.f10651a.mo11935b().mo12548v().mo12477b("Deleted stale rows. rowsDeleted", Integer.valueOf(delete));
                    }
                }
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: l */
    public final boolean mo11853l() {
        return false;
    }

    /* renamed from: m */
    public final void mo12220m(String str, String str2) {
        C3705r.m14342g(str);
        C3705r.m14342g(str2);
        mo11931h();
        mo11893i();
        try {
            mo12202P().delete("user_attributes", "app_id=? and name=?", new String[]{str, str2});
        } catch (SQLiteException e) {
            this.f10651a.mo11935b().mo12544r().mo12479d("Error deleting user property. appId", C4122z3.m15469z(str), this.f10651a.mo12152D().mo12440f(str2), e);
        }
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Code restructure failed: missing block: B:100:0x0318, code lost:
        r12 = java.lang.Integer.valueOf(r3.mo19856x());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:101:0x0321, code lost:
        r12 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:102:0x0322, code lost:
        r11.put("filter_id", r12);
        r22 = r0;
        r11.put("property_name", r3.mo19850B());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:103:0x0334, code lost:
        if (r3.mo19855H() == false) goto L_0x033f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:104:0x0336, code lost:
        r0 = java.lang.Boolean.valueOf(r3.mo19853F());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:105:0x033f, code lost:
        r0 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:106:0x0340, code lost:
        r11.put("session_scoped", r0);
        r11.put("data", r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:109:0x0354, code lost:
        if (mo12202P().insertWithOnConflict("property_filters", (java.lang.String) null, r11, 5) != -1) goto L_0x036a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:110:0x0356, code lost:
        r9.f10651a.mo11935b().mo12544r().mo12477b("Failed to insert property filter (got -1). appId", com.google.android.gms.measurement.internal.C4122z3.m15469z(r24));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:111:0x036a, code lost:
        r0 = r22;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:112:0x036e, code lost:
        r0 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:114:?, code lost:
        r3 = r9.f10651a.mo11935b().mo12544r();
        r4 = "Error storing property filter. appId";
        r7 = com.google.android.gms.measurement.internal.C4122z3.m15469z(r24);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:115:0x0381, code lost:
        mo11893i();
        mo11931h();
        com.google.android.gms.common.internal.C3705r.m14342g(r24);
        r0 = mo12202P();
        r3 = r17;
        r0.delete("property_filters", r3, new java.lang.String[]{r2, java.lang.String.valueOf(r10)});
        r0.delete("event_filters", r3, new java.lang.String[]{r2, java.lang.String.valueOf(r10)});
        r17 = r3;
        r4 = r21;
        r3 = r25;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:116:0x03b8, code lost:
        r3 = r25;
        r4 = r21;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:51:0x0187, code lost:
        r0.mo12478c(r7, r8, r10);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:52:0x018b, code lost:
        r11 = r0.mo20446E().iterator();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:54:0x0197, code lost:
        if (r11.hasNext() == false) goto L_0x01ba;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:56:0x01a3, code lost:
        if (((p174e.p319f.p320a.p335c.p345f.p352g.C6846j3) r11.next()).mo19854G() != false) goto L_0x0193;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:57:0x01a5, code lost:
        r0 = r9.f10651a.mo11935b().mo12549w();
        r7 = "Property filter with no ID. Audience definition ignored. appId, audienceId";
        r8 = com.google.android.gms.measurement.internal.C4122z3.m15469z(r24);
        r10 = java.lang.Integer.valueOf(r10);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:58:0x01ba, code lost:
        r11 = r0.mo20445D().iterator();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:61:0x01d0, code lost:
        if (r11.hasNext() == false) goto L_0x02a6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:63:?, code lost:
        r12 = (p174e.p319f.p320a.p335c.p345f.p352g.C6696a3) r11.next();
        mo11893i();
        mo11931h();
        com.google.android.gms.common.internal.C3705r.m14342g(r24);
        com.google.android.gms.common.internal.C3705r.m14346k(r12);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:64:0x01ec, code lost:
        if (r12.mo19489D().isEmpty() == false) goto L_0x0220;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:65:0x01ee, code lost:
        r0 = r9.f10651a.mo11935b().mo12549w();
        r8 = com.google.android.gms.measurement.internal.C4122z3.m15469z(r24);
        r11 = java.lang.Integer.valueOf(r10);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:66:0x0206, code lost:
        if (r12.mo19495L() == false) goto L_0x0213;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:67:0x0208, code lost:
        r20 = java.lang.Integer.valueOf(r12.mo19499y());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:68:0x0213, code lost:
        r20 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:69:0x0215, code lost:
        r0.mo12479d("Event filter had no event name. Audience definition ignored. appId, audienceId, filterId", r8, r11, java.lang.String.valueOf(r20));
        r21 = r4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:70:0x0220, code lost:
        r3 = r12.mo19840k();
        r21 = r4;
        r4 = new android.content.ContentValues();
        r4.put("app_id", r2);
        r4.put("audience_id", java.lang.Integer.valueOf(r10));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:71:0x0239, code lost:
        if (r12.mo19495L() == false) goto L_0x0244;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:72:0x023b, code lost:
        r8 = java.lang.Integer.valueOf(r12.mo19499y());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:73:0x0244, code lost:
        r8 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:74:0x0245, code lost:
        r4.put("filter_id", r8);
        r4.put("event_name", r12.mo19489D());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:75:0x0255, code lost:
        if (r12.mo19496M() == false) goto L_0x0260;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:76:0x0257, code lost:
        r8 = java.lang.Boolean.valueOf(r12.mo19493J());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:77:0x0260, code lost:
        r8 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:78:0x0261, code lost:
        r4.put("session_scoped", r8);
        r4.put("data", r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:81:0x0275, code lost:
        if (mo12202P().insertWithOnConflict("event_filters", (java.lang.String) null, r4, 5) != -1) goto L_0x028a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:82:0x0277, code lost:
        r9.f10651a.mo11935b().mo12544r().mo12477b("Failed to insert event filter (got -1). appId", com.google.android.gms.measurement.internal.C4122z3.m15469z(r24));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:83:0x028a, code lost:
        r3 = r25;
        r4 = r21;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:87:0x02a1, code lost:
        r3.mo12478c(r4, r7, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:88:0x02a6, code lost:
        r21 = r4;
        r0 = r0.mo20446E().iterator();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:90:0x02b4, code lost:
        if (r0.hasNext() == false) goto L_0x03b8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:91:0x02b6, code lost:
        r3 = (p174e.p319f.p320a.p335c.p345f.p352g.C6846j3) r0.next();
        mo11893i();
        mo11931h();
        com.google.android.gms.common.internal.C3705r.m14342g(r24);
        com.google.android.gms.common.internal.C3705r.m14346k(r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:92:0x02d0, code lost:
        if (r3.mo19850B().isEmpty() == false) goto L_0x02ff;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:93:0x02d2, code lost:
        r0 = r9.f10651a.mo11935b().mo12549w();
        r7 = com.google.android.gms.measurement.internal.C4122z3.m15469z(r24);
        r8 = java.lang.Integer.valueOf(r10);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:94:0x02ea, code lost:
        if (r3.mo19854G() == false) goto L_0x02f5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:95:0x02ec, code lost:
        r3 = java.lang.Integer.valueOf(r3.mo19856x());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:96:0x02f5, code lost:
        r3 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:97:0x02f6, code lost:
        r0.mo12479d("Property filter had no property name. Audience definition ignored. appId, audienceId, filterId", r7, r8, java.lang.String.valueOf(r3));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:98:0x02ff, code lost:
        r4 = r3.mo19840k();
        r11 = new android.content.ContentValues();
        r11.put("app_id", r2);
        r11.put("audience_id", java.lang.Integer.valueOf(r10));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:99:0x0316, code lost:
        if (r3.mo19854G() == false) goto L_0x0321;
     */
    /* renamed from: n */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo12221n(java.lang.String r24, java.util.List r25) {
        /*
            r23 = this;
            r1 = r23
            r2 = r24
            r3 = r25
            java.lang.String r4 = "app_id=? and audience_id=?"
            java.lang.String r0 = "app_id=?"
            java.lang.String r5 = "event_filters"
            java.lang.String r6 = "property_filters"
            com.google.android.gms.common.internal.C3705r.m14346k(r25)
            r8 = 0
        L_0x0012:
            int r9 = r25.size()
            if (r8 >= r9) goto L_0x00e9
            java.lang.Object r9 = r3.get(r8)
            e.f.a.c.f.g.y2 r9 = (p174e.p319f.p320a.p335c.p345f.p352g.C7085y2) r9
            e.f.a.c.f.g.x8 r9 = r9.mo19526u()
            e.f.a.c.f.g.x2 r9 = (p174e.p319f.p320a.p335c.p345f.p352g.C7069x2) r9
            int r11 = r9.mo20425u()
            if (r11 == 0) goto L_0x00a6
            r12 = r9
            r11 = 0
        L_0x002c:
            int r13 = r12.mo20425u()
            if (r11 >= r13) goto L_0x00a3
            e.f.a.c.f.g.a3 r13 = r12.mo20429y(r11)
            e.f.a.c.f.g.x8 r13 = r13.mo19526u()
            e.f.a.c.f.g.z2 r13 = (p174e.p319f.p320a.p335c.p345f.p352g.C7101z2) r13
            e.f.a.c.f.g.x8 r14 = r13.clone()
            e.f.a.c.f.g.z2 r14 = (p174e.p319f.p320a.p335c.p345f.p352g.C7101z2) r14
            java.lang.String r15 = r13.mo20461y()
            java.lang.String r15 = com.google.android.gms.measurement.internal.C3930j6.m14951b(r15)
            if (r15 == 0) goto L_0x0051
            r14.mo20458v(r15)
            r15 = 1
            goto L_0x0052
        L_0x0051:
            r15 = 0
        L_0x0052:
            r7 = 0
        L_0x0053:
            int r10 = r13.mo20457u()
            if (r7 >= r10) goto L_0x008b
            e.f.a.c.f.g.c3 r10 = r13.mo20460x(r7)
            r16 = r13
            java.lang.String r13 = r10.mo19602B()
            r17 = r4
            java.lang.String[] r4 = com.google.android.gms.measurement.internal.C3943k6.f10855a
            java.lang.String[] r1 = com.google.android.gms.measurement.internal.C3943k6.f10856b
            java.lang.String r1 = com.google.android.gms.measurement.internal.C4102x7.m15386a(r13, r4, r1)
            if (r1 == 0) goto L_0x0082
            e.f.a.c.f.g.x8 r4 = r10.mo19526u()
            e.f.a.c.f.g.b3 r4 = (p174e.p319f.p320a.p335c.p345f.p352g.C6713b3) r4
            r4.mo19558u(r1)
            e.f.a.c.f.g.a9 r1 = r4.mo20436r()
            e.f.a.c.f.g.c3 r1 = (p174e.p319f.p320a.p335c.p345f.p352g.C6730c3) r1
            r14.mo20459w(r7, r1)
            r15 = 1
        L_0x0082:
            int r7 = r7 + 1
            r1 = r23
            r13 = r16
            r4 = r17
            goto L_0x0053
        L_0x008b:
            r17 = r4
            if (r15 == 0) goto L_0x009c
            r12.mo20427w(r11, r14)
            e.f.a.c.f.g.a9 r1 = r9.mo20436r()
            e.f.a.c.f.g.y2 r1 = (p174e.p319f.p320a.p335c.p345f.p352g.C7085y2) r1
            r3.set(r8, r1)
            r12 = r9
        L_0x009c:
            int r11 = r11 + 1
            r1 = r23
            r4 = r17
            goto L_0x002c
        L_0x00a3:
            r17 = r4
            goto L_0x00a9
        L_0x00a6:
            r17 = r4
            r12 = r9
        L_0x00a9:
            int r1 = r12.mo20426v()
            if (r1 == 0) goto L_0x00e1
            r1 = 0
        L_0x00b0:
            int r4 = r12.mo20426v()
            if (r1 >= r4) goto L_0x00e1
            e.f.a.c.f.g.j3 r4 = r12.mo20430z(r1)
            java.lang.String r7 = r4.mo19850B()
            java.lang.String[] r10 = com.google.android.gms.measurement.internal.C3956l6.f10928a
            java.lang.String[] r11 = com.google.android.gms.measurement.internal.C3956l6.f10929b
            java.lang.String r7 = com.google.android.gms.measurement.internal.C4102x7.m15386a(r7, r10, r11)
            if (r7 == 0) goto L_0x00de
            e.f.a.c.f.g.x8 r4 = r4.mo19526u()
            e.f.a.c.f.g.i3 r4 = (p174e.p319f.p320a.p335c.p345f.p352g.C6830i3) r4
            r4.mo19835u(r7)
            r12.mo20428x(r1, r4)
            e.f.a.c.f.g.a9 r4 = r9.mo20436r()
            e.f.a.c.f.g.y2 r4 = (p174e.p319f.p320a.p335c.p345f.p352g.C7085y2) r4
            r3.set(r8, r4)
            r12 = r9
        L_0x00de:
            int r1 = r1 + 1
            goto L_0x00b0
        L_0x00e1:
            int r8 = r8 + 1
            r1 = r23
            r4 = r17
            goto L_0x0012
        L_0x00e9:
            r17 = r4
            r23.mo11893i()
            r23.mo11931h()
            com.google.android.gms.common.internal.C3705r.m14342g(r24)
            com.google.android.gms.common.internal.C3705r.m14346k(r25)
            android.database.sqlite.SQLiteDatabase r1 = r23.mo12202P()
            r1.beginTransaction()
            r23.mo11893i()     // Catch:{ all -> 0x04a5 }
            r23.mo11931h()     // Catch:{ all -> 0x04a5 }
            com.google.android.gms.common.internal.C3705r.m14342g(r24)     // Catch:{ all -> 0x04a5 }
            android.database.sqlite.SQLiteDatabase r4 = r23.mo12202P()     // Catch:{ all -> 0x04a5 }
            r7 = 1
            java.lang.String[] r8 = new java.lang.String[r7]     // Catch:{ all -> 0x04a5 }
            r9 = 0
            r8[r9] = r2     // Catch:{ all -> 0x04a5 }
            r4.delete(r6, r0, r8)     // Catch:{ all -> 0x04a5 }
            java.lang.String[] r8 = new java.lang.String[r7]     // Catch:{ all -> 0x04a5 }
            r8[r9] = r2     // Catch:{ all -> 0x04a5 }
            r4.delete(r5, r0, r8)     // Catch:{ all -> 0x04a5 }
            java.util.Iterator r4 = r25.iterator()     // Catch:{ all -> 0x04a5 }
        L_0x011f:
            boolean r0 = r4.hasNext()     // Catch:{ all -> 0x04a5 }
            if (r0 == 0) goto L_0x03be
            java.lang.Object r0 = r4.next()     // Catch:{ all -> 0x04a5 }
            e.f.a.c.f.g.y2 r0 = (p174e.p319f.p320a.p335c.p345f.p352g.C7085y2) r0     // Catch:{ all -> 0x04a5 }
            r23.mo11893i()     // Catch:{ all -> 0x04a5 }
            r23.mo11931h()     // Catch:{ all -> 0x04a5 }
            com.google.android.gms.common.internal.C3705r.m14342g(r24)     // Catch:{ all -> 0x04a5 }
            com.google.android.gms.common.internal.C3705r.m14346k(r0)     // Catch:{ all -> 0x04a5 }
            boolean r9 = r0.mo20447H()     // Catch:{ all -> 0x04a5 }
            if (r9 != 0) goto L_0x0153
            r9 = r23
            com.google.android.gms.measurement.internal.l5 r0 = r9.f10651a     // Catch:{ all -> 0x04a3 }
            com.google.android.gms.measurement.internal.z3 r0 = r0.mo11935b()     // Catch:{ all -> 0x04a3 }
            com.google.android.gms.measurement.internal.x3 r0 = r0.mo12549w()     // Catch:{ all -> 0x04a3 }
            java.lang.String r7 = "Audience with no ID. appId"
            java.lang.Object r8 = com.google.android.gms.measurement.internal.C4122z3.m15469z(r24)     // Catch:{ all -> 0x04a3 }
            r0.mo12477b(r7, r8)     // Catch:{ all -> 0x04a3 }
            goto L_0x011f
        L_0x0153:
            r9 = r23
            int r10 = r0.mo20448x()     // Catch:{ all -> 0x04a3 }
            java.util.List r11 = r0.mo20445D()     // Catch:{ all -> 0x04a3 }
            java.util.Iterator r11 = r11.iterator()     // Catch:{ all -> 0x04a3 }
        L_0x0161:
            boolean r12 = r11.hasNext()     // Catch:{ all -> 0x04a3 }
            if (r12 == 0) goto L_0x018b
            java.lang.Object r12 = r11.next()     // Catch:{ all -> 0x04a3 }
            e.f.a.c.f.g.a3 r12 = (p174e.p319f.p320a.p335c.p345f.p352g.C6696a3) r12     // Catch:{ all -> 0x04a3 }
            boolean r12 = r12.mo19495L()     // Catch:{ all -> 0x04a3 }
            if (r12 != 0) goto L_0x0161
            com.google.android.gms.measurement.internal.l5 r0 = r9.f10651a     // Catch:{ all -> 0x04a3 }
            com.google.android.gms.measurement.internal.z3 r0 = r0.mo11935b()     // Catch:{ all -> 0x04a3 }
            com.google.android.gms.measurement.internal.x3 r0 = r0.mo12549w()     // Catch:{ all -> 0x04a3 }
            java.lang.String r7 = "Event filter with no ID. Audience definition ignored. appId, audienceId"
            java.lang.Object r8 = com.google.android.gms.measurement.internal.C4122z3.m15469z(r24)     // Catch:{ all -> 0x04a3 }
            java.lang.Integer r10 = java.lang.Integer.valueOf(r10)     // Catch:{ all -> 0x04a3 }
        L_0x0187:
            r0.mo12478c(r7, r8, r10)     // Catch:{ all -> 0x04a3 }
            goto L_0x011f
        L_0x018b:
            java.util.List r11 = r0.mo20446E()     // Catch:{ all -> 0x04a3 }
            java.util.Iterator r11 = r11.iterator()     // Catch:{ all -> 0x04a3 }
        L_0x0193:
            boolean r12 = r11.hasNext()     // Catch:{ all -> 0x04a3 }
            if (r12 == 0) goto L_0x01ba
            java.lang.Object r12 = r11.next()     // Catch:{ all -> 0x04a3 }
            e.f.a.c.f.g.j3 r12 = (p174e.p319f.p320a.p335c.p345f.p352g.C6846j3) r12     // Catch:{ all -> 0x04a3 }
            boolean r12 = r12.mo19854G()     // Catch:{ all -> 0x04a3 }
            if (r12 != 0) goto L_0x0193
            com.google.android.gms.measurement.internal.l5 r0 = r9.f10651a     // Catch:{ all -> 0x04a3 }
            com.google.android.gms.measurement.internal.z3 r0 = r0.mo11935b()     // Catch:{ all -> 0x04a3 }
            com.google.android.gms.measurement.internal.x3 r0 = r0.mo12549w()     // Catch:{ all -> 0x04a3 }
            java.lang.String r7 = "Property filter with no ID. Audience definition ignored. appId, audienceId"
            java.lang.Object r8 = com.google.android.gms.measurement.internal.C4122z3.m15469z(r24)     // Catch:{ all -> 0x04a3 }
            java.lang.Integer r10 = java.lang.Integer.valueOf(r10)     // Catch:{ all -> 0x04a3 }
            goto L_0x0187
        L_0x01ba:
            java.util.List r11 = r0.mo20445D()     // Catch:{ all -> 0x04a3 }
            java.util.Iterator r11 = r11.iterator()     // Catch:{ all -> 0x04a3 }
        L_0x01c2:
            boolean r12 = r11.hasNext()     // Catch:{ all -> 0x04a3 }
            java.lang.String r7 = "data"
            java.lang.String r13 = "session_scoped"
            java.lang.String r14 = "filter_id"
            java.lang.String r8 = "audience_id"
            java.lang.String r15 = "app_id"
            if (r12 == 0) goto L_0x02a6
            java.lang.Object r12 = r11.next()     // Catch:{ all -> 0x04a3 }
            e.f.a.c.f.g.a3 r12 = (p174e.p319f.p320a.p335c.p345f.p352g.C6696a3) r12     // Catch:{ all -> 0x04a3 }
            r23.mo11893i()     // Catch:{ all -> 0x04a3 }
            r23.mo11931h()     // Catch:{ all -> 0x04a3 }
            com.google.android.gms.common.internal.C3705r.m14342g(r24)     // Catch:{ all -> 0x04a3 }
            com.google.android.gms.common.internal.C3705r.m14346k(r12)     // Catch:{ all -> 0x04a3 }
            java.lang.String r21 = r12.mo19489D()     // Catch:{ all -> 0x04a3 }
            boolean r21 = r21.isEmpty()     // Catch:{ all -> 0x04a3 }
            if (r21 == 0) goto L_0x0220
            com.google.android.gms.measurement.internal.l5 r0 = r9.f10651a     // Catch:{ all -> 0x04a3 }
            com.google.android.gms.measurement.internal.z3 r0 = r0.mo11935b()     // Catch:{ all -> 0x04a3 }
            com.google.android.gms.measurement.internal.x3 r0 = r0.mo12549w()     // Catch:{ all -> 0x04a3 }
            java.lang.String r7 = "Event filter had no event name. Audience definition ignored. appId, audienceId, filterId"
            java.lang.Object r8 = com.google.android.gms.measurement.internal.C4122z3.m15469z(r24)     // Catch:{ all -> 0x04a3 }
            java.lang.Integer r11 = java.lang.Integer.valueOf(r10)     // Catch:{ all -> 0x04a3 }
            boolean r13 = r12.mo19495L()     // Catch:{ all -> 0x04a3 }
            if (r13 == 0) goto L_0x0213
            int r12 = r12.mo19499y()     // Catch:{ all -> 0x04a3 }
            java.lang.Integer r12 = java.lang.Integer.valueOf(r12)     // Catch:{ all -> 0x04a3 }
            r20 = r12
            goto L_0x0215
        L_0x0213:
            r20 = 0
        L_0x0215:
            java.lang.String r12 = java.lang.String.valueOf(r20)     // Catch:{ all -> 0x04a3 }
            r0.mo12479d(r7, r8, r11, r12)     // Catch:{ all -> 0x04a3 }
            r21 = r4
            goto L_0x0381
        L_0x0220:
            byte[] r3 = r12.mo19840k()     // Catch:{ all -> 0x04a3 }
            r21 = r4
            android.content.ContentValues r4 = new android.content.ContentValues     // Catch:{ all -> 0x04a3 }
            r4.<init>()     // Catch:{ all -> 0x04a3 }
            r4.put(r15, r2)     // Catch:{ all -> 0x04a3 }
            java.lang.Integer r15 = java.lang.Integer.valueOf(r10)     // Catch:{ all -> 0x04a3 }
            r4.put(r8, r15)     // Catch:{ all -> 0x04a3 }
            boolean r8 = r12.mo19495L()     // Catch:{ all -> 0x04a3 }
            if (r8 == 0) goto L_0x0244
            int r8 = r12.mo19499y()     // Catch:{ all -> 0x04a3 }
            java.lang.Integer r8 = java.lang.Integer.valueOf(r8)     // Catch:{ all -> 0x04a3 }
            goto L_0x0245
        L_0x0244:
            r8 = 0
        L_0x0245:
            r4.put(r14, r8)     // Catch:{ all -> 0x04a3 }
            java.lang.String r8 = "event_name"
            java.lang.String r14 = r12.mo19489D()     // Catch:{ all -> 0x04a3 }
            r4.put(r8, r14)     // Catch:{ all -> 0x04a3 }
            boolean r8 = r12.mo19496M()     // Catch:{ all -> 0x04a3 }
            if (r8 == 0) goto L_0x0260
            boolean r8 = r12.mo19493J()     // Catch:{ all -> 0x04a3 }
            java.lang.Boolean r8 = java.lang.Boolean.valueOf(r8)     // Catch:{ all -> 0x04a3 }
            goto L_0x0261
        L_0x0260:
            r8 = 0
        L_0x0261:
            r4.put(r13, r8)     // Catch:{ all -> 0x04a3 }
            r4.put(r7, r3)     // Catch:{ all -> 0x04a3 }
            android.database.sqlite.SQLiteDatabase r3 = r23.mo12202P()     // Catch:{ SQLiteException -> 0x0290 }
            r7 = 5
            r8 = 0
            long r3 = r3.insertWithOnConflict(r5, r8, r4, r7)     // Catch:{ SQLiteException -> 0x0290 }
            r7 = -1
            int r12 = (r3 > r7 ? 1 : (r3 == r7 ? 0 : -1))
            if (r12 != 0) goto L_0x028a
            com.google.android.gms.measurement.internal.l5 r3 = r9.f10651a     // Catch:{ SQLiteException -> 0x0290 }
            com.google.android.gms.measurement.internal.z3 r3 = r3.mo11935b()     // Catch:{ SQLiteException -> 0x0290 }
            com.google.android.gms.measurement.internal.x3 r3 = r3.mo12544r()     // Catch:{ SQLiteException -> 0x0290 }
            java.lang.String r4 = "Failed to insert event filter (got -1). appId"
            java.lang.Object r7 = com.google.android.gms.measurement.internal.C4122z3.m15469z(r24)     // Catch:{ SQLiteException -> 0x0290 }
            r3.mo12477b(r4, r7)     // Catch:{ SQLiteException -> 0x0290 }
        L_0x028a:
            r3 = r25
            r4 = r21
            goto L_0x01c2
        L_0x0290:
            r0 = move-exception
            com.google.android.gms.measurement.internal.l5 r3 = r9.f10651a     // Catch:{ all -> 0x04a3 }
            com.google.android.gms.measurement.internal.z3 r3 = r3.mo11935b()     // Catch:{ all -> 0x04a3 }
            com.google.android.gms.measurement.internal.x3 r3 = r3.mo12544r()     // Catch:{ all -> 0x04a3 }
            java.lang.String r4 = "Error storing event filter. appId"
            java.lang.Object r7 = com.google.android.gms.measurement.internal.C4122z3.m15469z(r24)     // Catch:{ all -> 0x04a3 }
        L_0x02a1:
            r3.mo12478c(r4, r7, r0)     // Catch:{ all -> 0x04a3 }
            goto L_0x0381
        L_0x02a6:
            r21 = r4
            java.util.List r0 = r0.mo20446E()     // Catch:{ all -> 0x04a3 }
            java.util.Iterator r0 = r0.iterator()     // Catch:{ all -> 0x04a3 }
        L_0x02b0:
            boolean r3 = r0.hasNext()     // Catch:{ all -> 0x04a3 }
            if (r3 == 0) goto L_0x03b8
            java.lang.Object r3 = r0.next()     // Catch:{ all -> 0x04a3 }
            e.f.a.c.f.g.j3 r3 = (p174e.p319f.p320a.p335c.p345f.p352g.C6846j3) r3     // Catch:{ all -> 0x04a3 }
            r23.mo11893i()     // Catch:{ all -> 0x04a3 }
            r23.mo11931h()     // Catch:{ all -> 0x04a3 }
            com.google.android.gms.common.internal.C3705r.m14342g(r24)     // Catch:{ all -> 0x04a3 }
            com.google.android.gms.common.internal.C3705r.m14346k(r3)     // Catch:{ all -> 0x04a3 }
            java.lang.String r4 = r3.mo19850B()     // Catch:{ all -> 0x04a3 }
            boolean r4 = r4.isEmpty()     // Catch:{ all -> 0x04a3 }
            if (r4 == 0) goto L_0x02ff
            com.google.android.gms.measurement.internal.l5 r0 = r9.f10651a     // Catch:{ all -> 0x04a3 }
            com.google.android.gms.measurement.internal.z3 r0 = r0.mo11935b()     // Catch:{ all -> 0x04a3 }
            com.google.android.gms.measurement.internal.x3 r0 = r0.mo12549w()     // Catch:{ all -> 0x04a3 }
            java.lang.String r4 = "Property filter had no property name. Audience definition ignored. appId, audienceId, filterId"
            java.lang.Object r7 = com.google.android.gms.measurement.internal.C4122z3.m15469z(r24)     // Catch:{ all -> 0x04a3 }
            java.lang.Integer r8 = java.lang.Integer.valueOf(r10)     // Catch:{ all -> 0x04a3 }
            boolean r11 = r3.mo19854G()     // Catch:{ all -> 0x04a3 }
            if (r11 == 0) goto L_0x02f5
            int r3 = r3.mo19856x()     // Catch:{ all -> 0x04a3 }
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)     // Catch:{ all -> 0x04a3 }
            goto L_0x02f6
        L_0x02f5:
            r3 = 0
        L_0x02f6:
            java.lang.String r3 = java.lang.String.valueOf(r3)     // Catch:{ all -> 0x04a3 }
            r0.mo12479d(r4, r7, r8, r3)     // Catch:{ all -> 0x04a3 }
            goto L_0x0381
        L_0x02ff:
            byte[] r4 = r3.mo19840k()     // Catch:{ all -> 0x04a3 }
            android.content.ContentValues r11 = new android.content.ContentValues     // Catch:{ all -> 0x04a3 }
            r11.<init>()     // Catch:{ all -> 0x04a3 }
            r11.put(r15, r2)     // Catch:{ all -> 0x04a3 }
            java.lang.Integer r12 = java.lang.Integer.valueOf(r10)     // Catch:{ all -> 0x04a3 }
            r11.put(r8, r12)     // Catch:{ all -> 0x04a3 }
            boolean r12 = r3.mo19854G()     // Catch:{ all -> 0x04a3 }
            if (r12 == 0) goto L_0x0321
            int r12 = r3.mo19856x()     // Catch:{ all -> 0x04a3 }
            java.lang.Integer r12 = java.lang.Integer.valueOf(r12)     // Catch:{ all -> 0x04a3 }
            goto L_0x0322
        L_0x0321:
            r12 = 0
        L_0x0322:
            r11.put(r14, r12)     // Catch:{ all -> 0x04a3 }
            java.lang.String r12 = "property_name"
            r22 = r0
            java.lang.String r0 = r3.mo19850B()     // Catch:{ all -> 0x04a3 }
            r11.put(r12, r0)     // Catch:{ all -> 0x04a3 }
            boolean r0 = r3.mo19855H()     // Catch:{ all -> 0x04a3 }
            if (r0 == 0) goto L_0x033f
            boolean r0 = r3.mo19853F()     // Catch:{ all -> 0x04a3 }
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)     // Catch:{ all -> 0x04a3 }
            goto L_0x0340
        L_0x033f:
            r0 = 0
        L_0x0340:
            r11.put(r13, r0)     // Catch:{ all -> 0x04a3 }
            r11.put(r7, r4)     // Catch:{ all -> 0x04a3 }
            android.database.sqlite.SQLiteDatabase r0 = r23.mo12202P()     // Catch:{ SQLiteException -> 0x036e }
            r3 = 0
            r4 = 5
            long r11 = r0.insertWithOnConflict(r6, r3, r11, r4)     // Catch:{ SQLiteException -> 0x036e }
            r18 = -1
            int r0 = (r11 > r18 ? 1 : (r11 == r18 ? 0 : -1))
            if (r0 != 0) goto L_0x036a
            com.google.android.gms.measurement.internal.l5 r0 = r9.f10651a     // Catch:{ SQLiteException -> 0x036e }
            com.google.android.gms.measurement.internal.z3 r0 = r0.mo11935b()     // Catch:{ SQLiteException -> 0x036e }
            com.google.android.gms.measurement.internal.x3 r0 = r0.mo12544r()     // Catch:{ SQLiteException -> 0x036e }
            java.lang.String r3 = "Failed to insert property filter (got -1). appId"
            java.lang.Object r4 = com.google.android.gms.measurement.internal.C4122z3.m15469z(r24)     // Catch:{ SQLiteException -> 0x036e }
            r0.mo12477b(r3, r4)     // Catch:{ SQLiteException -> 0x036e }
            goto L_0x0381
        L_0x036a:
            r0 = r22
            goto L_0x02b0
        L_0x036e:
            r0 = move-exception
            com.google.android.gms.measurement.internal.l5 r3 = r9.f10651a     // Catch:{ all -> 0x04a3 }
            com.google.android.gms.measurement.internal.z3 r3 = r3.mo11935b()     // Catch:{ all -> 0x04a3 }
            com.google.android.gms.measurement.internal.x3 r3 = r3.mo12544r()     // Catch:{ all -> 0x04a3 }
            java.lang.String r4 = "Error storing property filter. appId"
            java.lang.Object r7 = com.google.android.gms.measurement.internal.C4122z3.m15469z(r24)     // Catch:{ all -> 0x04a3 }
            goto L_0x02a1
        L_0x0381:
            r23.mo11893i()     // Catch:{ all -> 0x04a3 }
            r23.mo11931h()     // Catch:{ all -> 0x04a3 }
            com.google.android.gms.common.internal.C3705r.m14342g(r24)     // Catch:{ all -> 0x04a3 }
            android.database.sqlite.SQLiteDatabase r0 = r23.mo12202P()     // Catch:{ all -> 0x04a3 }
            r3 = 2
            java.lang.String[] r4 = new java.lang.String[r3]     // Catch:{ all -> 0x04a3 }
            r3 = 0
            r4[r3] = r2     // Catch:{ all -> 0x04a3 }
            java.lang.String r3 = java.lang.String.valueOf(r10)     // Catch:{ all -> 0x04a3 }
            r7 = 1
            r4[r7] = r3     // Catch:{ all -> 0x04a3 }
            r3 = r17
            r0.delete(r6, r3, r4)     // Catch:{ all -> 0x04a3 }
            r4 = 2
            java.lang.String[] r4 = new java.lang.String[r4]     // Catch:{ all -> 0x04a3 }
            r7 = 0
            r4[r7] = r2     // Catch:{ all -> 0x04a3 }
            java.lang.String r7 = java.lang.String.valueOf(r10)     // Catch:{ all -> 0x04a3 }
            r8 = 1
            r4[r8] = r7     // Catch:{ all -> 0x04a3 }
            r0.delete(r5, r3, r4)     // Catch:{ all -> 0x04a3 }
            r17 = r3
            r4 = r21
            r3 = r25
            goto L_0x011f
        L_0x03b8:
            r3 = r25
            r4 = r21
            goto L_0x011f
        L_0x03be:
            r3 = 0
            r9 = r23
            java.util.ArrayList r0 = new java.util.ArrayList     // Catch:{ all -> 0x04a3 }
            r0.<init>()     // Catch:{ all -> 0x04a3 }
            java.util.Iterator r4 = r25.iterator()     // Catch:{ all -> 0x04a3 }
        L_0x03ca:
            boolean r5 = r4.hasNext()     // Catch:{ all -> 0x04a3 }
            if (r5 == 0) goto L_0x03ea
            java.lang.Object r5 = r4.next()     // Catch:{ all -> 0x04a3 }
            e.f.a.c.f.g.y2 r5 = (p174e.p319f.p320a.p335c.p345f.p352g.C7085y2) r5     // Catch:{ all -> 0x04a3 }
            boolean r6 = r5.mo20447H()     // Catch:{ all -> 0x04a3 }
            if (r6 == 0) goto L_0x03e5
            int r5 = r5.mo20448x()     // Catch:{ all -> 0x04a3 }
            java.lang.Integer r8 = java.lang.Integer.valueOf(r5)     // Catch:{ all -> 0x04a3 }
            goto L_0x03e6
        L_0x03e5:
            r8 = r3
        L_0x03e6:
            r0.add(r8)     // Catch:{ all -> 0x04a3 }
            goto L_0x03ca
        L_0x03ea:
            com.google.android.gms.common.internal.C3705r.m14342g(r24)     // Catch:{ all -> 0x04a3 }
            r23.mo11893i()     // Catch:{ all -> 0x04a3 }
            r23.mo11931h()     // Catch:{ all -> 0x04a3 }
            android.database.sqlite.SQLiteDatabase r3 = r23.mo12202P()     // Catch:{ all -> 0x04a3 }
            r4 = 1
            java.lang.String[] r5 = new java.lang.String[r4]     // Catch:{ SQLiteException -> 0x0488 }
            r4 = 0
            r5[r4] = r2     // Catch:{ SQLiteException -> 0x0488 }
            java.lang.String r4 = "select count(1) from audience_filter_values where app_id=?"
            long r4 = r9.m15038I(r4, r5)     // Catch:{ SQLiteException -> 0x0488 }
            com.google.android.gms.measurement.internal.l5 r6 = r9.f10651a     // Catch:{ all -> 0x04a3 }
            com.google.android.gms.measurement.internal.h r6 = r6.mo12181z()     // Catch:{ all -> 0x04a3 }
            r7 = 2000(0x7d0, float:2.803E-42)
            com.google.android.gms.measurement.internal.l3 r8 = com.google.android.gms.measurement.internal.C3966m3.f10962G     // Catch:{ all -> 0x04a3 }
            int r6 = r6.mo12021o(r2, r8)     // Catch:{ all -> 0x04a3 }
            int r6 = java.lang.Math.min(r7, r6)     // Catch:{ all -> 0x04a3 }
            r7 = 0
            int r6 = java.lang.Math.max(r7, r6)     // Catch:{ all -> 0x04a3 }
            long r7 = (long) r6     // Catch:{ all -> 0x04a3 }
            int r10 = (r4 > r7 ? 1 : (r4 == r7 ? 0 : -1))
            if (r10 > 0) goto L_0x0421
            goto L_0x049c
        L_0x0421:
            java.util.ArrayList r4 = new java.util.ArrayList     // Catch:{ all -> 0x04a3 }
            r4.<init>()     // Catch:{ all -> 0x04a3 }
            r5 = 0
        L_0x0427:
            int r7 = r0.size()     // Catch:{ all -> 0x04a3 }
            if (r5 >= r7) goto L_0x0443
            java.lang.Object r7 = r0.get(r5)     // Catch:{ all -> 0x04a3 }
            java.lang.Integer r7 = (java.lang.Integer) r7     // Catch:{ all -> 0x04a3 }
            if (r7 == 0) goto L_0x049c
            int r7 = r7.intValue()     // Catch:{ all -> 0x04a3 }
            java.lang.String r7 = java.lang.Integer.toString(r7)     // Catch:{ all -> 0x04a3 }
            r4.add(r7)     // Catch:{ all -> 0x04a3 }
            int r5 = r5 + 1
            goto L_0x0427
        L_0x0443:
            java.lang.String r0 = ","
            java.lang.String r0 = android.text.TextUtils.join(r0, r4)     // Catch:{ all -> 0x04a3 }
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ all -> 0x04a3 }
            r4.<init>()     // Catch:{ all -> 0x04a3 }
            java.lang.String r5 = "("
            r4.append(r5)     // Catch:{ all -> 0x04a3 }
            r4.append(r0)     // Catch:{ all -> 0x04a3 }
            java.lang.String r0 = ")"
            r4.append(r0)     // Catch:{ all -> 0x04a3 }
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ all -> 0x04a3 }
            r0.<init>()     // Catch:{ all -> 0x04a3 }
            java.lang.String r5 = "audience_id in (select audience_id from audience_filter_values where app_id=? and audience_id not in "
            r0.append(r5)     // Catch:{ all -> 0x04a3 }
            java.lang.String r4 = r4.toString()     // Catch:{ all -> 0x04a3 }
            r0.append(r4)     // Catch:{ all -> 0x04a3 }
            java.lang.String r4 = " order by rowid desc limit -1 offset ?)"
            r0.append(r4)     // Catch:{ all -> 0x04a3 }
            r4 = 2
            java.lang.String[] r4 = new java.lang.String[r4]     // Catch:{ all -> 0x04a3 }
            r5 = 0
            r4[r5] = r2     // Catch:{ all -> 0x04a3 }
            java.lang.String r2 = java.lang.Integer.toString(r6)     // Catch:{ all -> 0x04a3 }
            r5 = 1
            r4[r5] = r2     // Catch:{ all -> 0x04a3 }
            java.lang.String r2 = "audience_filter_values"
            java.lang.String r0 = r0.toString()     // Catch:{ all -> 0x04a3 }
            r3.delete(r2, r0, r4)     // Catch:{ all -> 0x04a3 }
            goto L_0x049c
        L_0x0488:
            r0 = move-exception
            com.google.android.gms.measurement.internal.l5 r3 = r9.f10651a     // Catch:{ all -> 0x04a3 }
            com.google.android.gms.measurement.internal.z3 r3 = r3.mo11935b()     // Catch:{ all -> 0x04a3 }
            com.google.android.gms.measurement.internal.x3 r3 = r3.mo12544r()     // Catch:{ all -> 0x04a3 }
            java.lang.String r4 = "Database error querying filters. appId"
            java.lang.Object r2 = com.google.android.gms.measurement.internal.C4122z3.m15469z(r24)     // Catch:{ all -> 0x04a3 }
            r3.mo12478c(r4, r2, r0)     // Catch:{ all -> 0x04a3 }
        L_0x049c:
            r1.setTransactionSuccessful()     // Catch:{ all -> 0x04a3 }
            r1.endTransaction()
            return
        L_0x04a3:
            r0 = move-exception
            goto L_0x04a8
        L_0x04a5:
            r0 = move-exception
            r9 = r23
        L_0x04a8:
            r1.endTransaction()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.C3974n.mo12221n(java.lang.String, java.util.List):void");
    }

    /* renamed from: o */
    public final void mo12222o() {
        mo11893i();
        mo12202P().setTransactionSuccessful();
    }

    /* renamed from: p */
    public final void mo12223p(C3904h6 h6Var) {
        C3705r.m14346k(h6Var);
        mo11931h();
        mo11893i();
        String d0 = h6Var.mo12069d0();
        C3705r.m14346k(d0);
        ContentValues contentValues = new ContentValues();
        contentValues.put("app_id", d0);
        contentValues.put("app_instance_id", h6Var.mo12071e0());
        contentValues.put("gmp_app_id", h6Var.mo12079i0());
        contentValues.put("resettable_device_id_hash", h6Var.mo12062a());
        contentValues.put("last_bundle_index", Long.valueOf(h6Var.mo12060Y()));
        contentValues.put("last_bundle_start_timestamp", Long.valueOf(h6Var.mo12061Z()));
        contentValues.put("last_bundle_end_timestamp", Long.valueOf(h6Var.mo12059X()));
        contentValues.put("app_version", h6Var.mo12075g0());
        contentValues.put("app_store", h6Var.mo12073f0());
        contentValues.put("gmp_version", Long.valueOf(h6Var.mo12058W()));
        contentValues.put("dev_cert_hash", Long.valueOf(h6Var.mo12055T()));
        contentValues.put("measurement_enabled", Boolean.valueOf(h6Var.mo12045J()));
        contentValues.put("day", Long.valueOf(h6Var.mo12054S()));
        contentValues.put("daily_public_events_count", Long.valueOf(h6Var.mo12052Q()));
        contentValues.put("daily_events_count", Long.valueOf(h6Var.mo12051P()));
        contentValues.put("daily_conversions_count", Long.valueOf(h6Var.mo12049N()));
        contentValues.put("config_fetched_time", Long.valueOf(h6Var.mo12048M()));
        contentValues.put("failed_config_fetch_time", Long.valueOf(h6Var.mo12057V()));
        contentValues.put("app_version_int", Long.valueOf(h6Var.mo12047L()));
        contentValues.put("firebase_instance_id", h6Var.mo12077h0());
        contentValues.put("daily_error_events_count", Long.valueOf(h6Var.mo12050O()));
        contentValues.put("daily_realtime_events_count", Long.valueOf(h6Var.mo12053R()));
        contentValues.put("health_monitor_sample", h6Var.mo12081j0());
        h6Var.mo12036A();
        contentValues.put("android_id", 0L);
        contentValues.put("adid_reporting_enabled", Boolean.valueOf(h6Var.mo12044I()));
        contentValues.put("admob_app_id", h6Var.mo12065b0());
        contentValues.put("dynamite_version", Long.valueOf(h6Var.mo12056U()));
        contentValues.put("session_stitching_token", h6Var.mo12064b());
        List c = h6Var.mo12066c();
        if (c != null) {
            if (c.isEmpty()) {
                this.f10651a.mo11935b().mo12549w().mo12477b("Safelisted events should not be an empty list. appId", d0);
            } else {
                contentValues.put("safelisted_events", TextUtils.join(",", c));
            }
        }
        C7047vc.m26943b();
        if (this.f10651a.mo12181z().mo12010B((String) null, C3966m3.f11021r0) && !contentValues.containsKey("safelisted_events")) {
            contentValues.put("safelisted_events", (String) null);
        }
        try {
            SQLiteDatabase P = mo12202P();
            if (((long) P.update("apps", contentValues, "app_id = ?", new String[]{d0})) == 0 && P.insertWithOnConflict("apps", (String) null, contentValues, 5) == -1) {
                this.f10651a.mo11935b().mo12544r().mo12477b("Failed to insert/update app (got -1). appId", C4122z3.m15469z(d0));
            }
        } catch (SQLiteException e) {
            this.f10651a.mo11935b().mo12544r().mo12478c("Error storing app. appId", C4122z3.m15469z(d0), e);
        }
    }

    /* renamed from: q */
    public final void mo12224q(C4046t tVar) {
        C3705r.m14346k(tVar);
        mo11931h();
        mo11893i();
        ContentValues contentValues = new ContentValues();
        contentValues.put("app_id", tVar.f11282a);
        contentValues.put("name", tVar.f11283b);
        contentValues.put("lifetime_count", Long.valueOf(tVar.f11284c));
        contentValues.put("current_bundle_count", Long.valueOf(tVar.f11285d));
        contentValues.put("last_fire_timestamp", Long.valueOf(tVar.f11287f));
        contentValues.put("last_bundled_timestamp", Long.valueOf(tVar.f11288g));
        contentValues.put("last_bundled_day", tVar.f11289h);
        contentValues.put("last_sampled_complex_event_id", tVar.f11290i);
        contentValues.put("last_sampling_rate", tVar.f11291j);
        contentValues.put("current_session_count", Long.valueOf(tVar.f11286e));
        Boolean bool = tVar.f11292k;
        contentValues.put("last_exempt_from_sampling", (bool == null || !bool.booleanValue()) ? null : 1L);
        try {
            if (mo12202P().insertWithOnConflict("events", (String) null, contentValues, 5) == -1) {
                this.f10651a.mo11935b().mo12544r().mo12477b("Failed to insert/update event aggregates (got -1). appId", C4122z3.m15469z(tVar.f11282a));
            }
        } catch (SQLiteException e) {
            this.f10651a.mo11935b().mo12544r().mo12478c("Error storing event aggregates. appId", C4122z3.m15469z(tVar.f11282a), e);
        }
    }

    /* renamed from: r */
    public final boolean mo12225r() {
        return m15038I("select count(1) > 0 from raw_events", (String[]) null) != 0;
    }

    /* renamed from: s */
    public final boolean mo12226s() {
        return m15038I("select count(1) > 0 from queue where has_realtime = 1", (String[]) null) != 0;
    }

    /* renamed from: t */
    public final boolean mo12227t() {
        return m15038I("select count(1) > 0 from raw_events where realtime = 1", (String[]) null) != 0;
    }

    /* access modifiers changed from: protected */
    /* renamed from: u */
    public final boolean mo12228u() {
        Context f = this.f10651a.mo11938f();
        this.f10651a.mo12181z();
        return f.getDatabasePath("google_app_measurement.db").exists();
    }

    /* renamed from: v */
    public final boolean mo12229v(String str, Long l, long j, C6863k4 k4Var) {
        mo11931h();
        mo11893i();
        C3705r.m14346k(k4Var);
        C3705r.m14342g(str);
        C3705r.m14346k(l);
        byte[] k = k4Var.mo19840k();
        this.f10651a.mo11935b().mo12548v().mo12478c("Saving complex main event, appId, data size", this.f10651a.mo12152D().mo12438d(str), Integer.valueOf(k.length));
        ContentValues contentValues = new ContentValues();
        contentValues.put("app_id", str);
        contentValues.put("event_id", l);
        contentValues.put("children_to_process", Long.valueOf(j));
        contentValues.put("main_event", k);
        try {
            if (mo12202P().insertWithOnConflict("main_event_params", (String) null, contentValues, 5) != -1) {
                return true;
            }
            this.f10651a.mo11935b().mo12544r().mo12477b("Failed to insert complex main event (got -1). appId", C4122z3.m15469z(str));
            return false;
        } catch (SQLiteException e) {
            this.f10651a.mo11935b().mo12544r().mo12478c("Error storing complex main event. appId", C4122z3.m15469z(str), e);
            return false;
        }
    }

    /* renamed from: w */
    public final boolean mo12230w(C3845d dVar) {
        C3705r.m14346k(dVar);
        mo11931h();
        mo11893i();
        String str = dVar.f10606f;
        C3705r.m14346k(str);
        if (mo12209X(str, dVar.f10608p.f11276o) == null) {
            long I = m15038I("SELECT COUNT(1) FROM conditional_properties WHERE app_id=?", new String[]{str});
            this.f10651a.mo12181z();
            if (I >= 1000) {
                return false;
            }
        }
        ContentValues contentValues = new ContentValues();
        contentValues.put("app_id", str);
        contentValues.put("origin", dVar.f10607o);
        contentValues.put("name", dVar.f10608p.f11276o);
        m15037H(contentValues, "value", C3705r.m14346k(dVar.f10608p.mo12418o()));
        contentValues.put(AppStateModule.APP_STATE_ACTIVE, Boolean.valueOf(dVar.f10610r));
        contentValues.put("trigger_event_name", dVar.f10611s);
        contentValues.put("trigger_timeout", Long.valueOf(dVar.f10613u));
        contentValues.put("timed_out_event", this.f10651a.mo12161N().mo12507c0(dVar.f10612t));
        contentValues.put("creation_timestamp", Long.valueOf(dVar.f10609q));
        contentValues.put("triggered_event", this.f10651a.mo12161N().mo12507c0(dVar.f10614v));
        contentValues.put("triggered_timestamp", Long.valueOf(dVar.f10608p.f11277p));
        contentValues.put("time_to_live", Long.valueOf(dVar.f10615w));
        contentValues.put("expired_event", this.f10651a.mo12161N().mo12507c0(dVar.f10616x));
        try {
            if (mo12202P().insertWithOnConflict("conditional_properties", (String) null, contentValues, 5) == -1) {
                this.f10651a.mo11935b().mo12544r().mo12477b("Failed to insert/update conditional user property (got -1)", C4122z3.m15469z(str));
            }
        } catch (SQLiteException e) {
            this.f10651a.mo11935b().mo12544r().mo12478c("Error storing conditional user property", C4122z3.m15469z(str), e);
        }
        return true;
    }

    /* renamed from: x */
    public final boolean mo12231x(C4069ua uaVar) {
        C3705r.m14346k(uaVar);
        mo11931h();
        mo11893i();
        if (mo12209X(uaVar.f11328a, uaVar.f11330c) == null) {
            if (C4105xa.m15395X(uaVar.f11330c)) {
                if (m15038I("select count(1) from user_attributes where app_id=? and name not like '!_%' escape '!'", new String[]{uaVar.f11328a}) >= ((long) this.f10651a.mo12181z().mo12022p(uaVar.f11328a, C3966m3.f10964H, 25, 100))) {
                    return false;
                }
            } else if (!"_npa".equals(uaVar.f11330c)) {
                long I = m15038I("select count(1) from user_attributes where app_id=? and origin=? AND name like '!_%' escape '!'", new String[]{uaVar.f11328a, uaVar.f11329b});
                this.f10651a.mo12181z();
                if (I >= 25) {
                    return false;
                }
            }
        }
        ContentValues contentValues = new ContentValues();
        contentValues.put("app_id", uaVar.f11328a);
        contentValues.put("origin", uaVar.f11329b);
        contentValues.put("name", uaVar.f11330c);
        contentValues.put("set_timestamp", Long.valueOf(uaVar.f11331d));
        m15037H(contentValues, "value", uaVar.f11332e);
        try {
            if (mo12202P().insertWithOnConflict("user_attributes", (String) null, contentValues, 5) == -1) {
                this.f10651a.mo11935b().mo12544r().mo12477b("Failed to insert/update user property (got -1). appId", C4122z3.m15469z(uaVar.f11328a));
            }
        } catch (SQLiteException e) {
            this.f10651a.mo11935b().mo12544r().mo12478c("Error storing user property. appId", C4122z3.m15469z(uaVar.f11328a), e);
        }
        return true;
    }
}
