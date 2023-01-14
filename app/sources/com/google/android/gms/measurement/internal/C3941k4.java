package com.google.android.gms.measurement.internal;

import android.content.SharedPreferences;
import android.os.Bundle;
import com.google.android.gms.common.internal.C3705r;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.google.android.gms.measurement.internal.k4 */
public final class C3941k4 {

    /* renamed from: a */
    private final String f10849a = "default_event_parameters";

    /* renamed from: b */
    private final Bundle f10850b = new Bundle();

    /* renamed from: c */
    private Bundle f10851c;

    /* renamed from: d */
    final /* synthetic */ C4003p4 f10852d;

    public C3941k4(C4003p4 p4Var, String str, Bundle bundle) {
        this.f10852d = p4Var;
        C3705r.m14342g("default_event_parameters");
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(3:35|36|47) */
    /* JADX WARNING: Code restructure failed: missing block: B:36:?, code lost:
        r11.f10852d.f10651a.mo11935b().mo12544r().mo12476a("Error reading value from SharedPreferences. Value dropped");
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:35:0x00a3 */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x006d  */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x009b A[Catch:{ NumberFormatException | JSONException -> 0x00a3 }] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final android.os.Bundle mo12139a() {
        /*
            r11 = this;
            android.os.Bundle r0 = r11.f10851c
            if (r0 == 0) goto L_0x0006
            goto L_0x00d4
        L_0x0006:
            com.google.android.gms.measurement.internal.p4 r0 = r11.f10852d
            android.content.SharedPreferences r0 = r0.mo12255o()
            java.lang.String r1 = r11.f10849a
            r2 = 0
            java.lang.String r0 = r0.getString(r1, r2)
            if (r0 == 0) goto L_0x00cc
            android.os.Bundle r1 = new android.os.Bundle     // Catch:{ JSONException -> 0x00bb }
            r1.<init>()     // Catch:{ JSONException -> 0x00bb }
            org.json.JSONArray r2 = new org.json.JSONArray     // Catch:{ JSONException -> 0x00bb }
            r2.<init>(r0)     // Catch:{ JSONException -> 0x00bb }
            r0 = 0
            r3 = 0
        L_0x0021:
            int r4 = r2.length()     // Catch:{ JSONException -> 0x00bb }
            if (r3 >= r4) goto L_0x00b8
            org.json.JSONObject r4 = r2.getJSONObject(r3)     // Catch:{ NumberFormatException | JSONException -> 0x00a3 }
            java.lang.String r5 = "n"
            java.lang.String r5 = r4.getString(r5)     // Catch:{ NumberFormatException | JSONException -> 0x00a3 }
            java.lang.String r6 = "t"
            java.lang.String r6 = r4.getString(r6)     // Catch:{ NumberFormatException | JSONException -> 0x00a3 }
            int r7 = r6.hashCode()     // Catch:{ NumberFormatException | JSONException -> 0x00a3 }
            r8 = 100
            r9 = 2
            r10 = 1
            if (r7 == r8) goto L_0x005e
            r8 = 108(0x6c, float:1.51E-43)
            if (r7 == r8) goto L_0x0054
            r8 = 115(0x73, float:1.61E-43)
            if (r7 == r8) goto L_0x004a
            goto L_0x0068
        L_0x004a:
            java.lang.String r7 = "s"
            boolean r7 = r6.equals(r7)
            if (r7 == 0) goto L_0x0068
            r7 = 0
            goto L_0x0069
        L_0x0054:
            java.lang.String r7 = "l"
            boolean r7 = r6.equals(r7)
            if (r7 == 0) goto L_0x0068
            r7 = 2
            goto L_0x0069
        L_0x005e:
            java.lang.String r7 = "d"
            boolean r7 = r6.equals(r7)
            if (r7 == 0) goto L_0x0068
            r7 = 1
            goto L_0x0069
        L_0x0068:
            r7 = -1
        L_0x0069:
            java.lang.String r8 = "v"
            if (r7 == 0) goto L_0x009b
            if (r7 == r10) goto L_0x008f
            if (r7 == r9) goto L_0x0083
            com.google.android.gms.measurement.internal.p4 r4 = r11.f10852d     // Catch:{ NumberFormatException | JSONException -> 0x00a3 }
            com.google.android.gms.measurement.internal.l5 r4 = r4.f10651a     // Catch:{ NumberFormatException | JSONException -> 0x00a3 }
            com.google.android.gms.measurement.internal.z3 r4 = r4.mo11935b()     // Catch:{ NumberFormatException | JSONException -> 0x00a3 }
            com.google.android.gms.measurement.internal.x3 r4 = r4.mo12544r()     // Catch:{ NumberFormatException | JSONException -> 0x00a3 }
            java.lang.String r5 = "Unrecognized persisted bundle type. Type"
            r4.mo12477b(r5, r6)     // Catch:{ NumberFormatException | JSONException -> 0x00a3 }
            goto L_0x00b4
        L_0x0083:
            java.lang.String r4 = r4.getString(r8)     // Catch:{ NumberFormatException | JSONException -> 0x00a3 }
            long r6 = java.lang.Long.parseLong(r4)     // Catch:{ NumberFormatException | JSONException -> 0x00a3 }
            r1.putLong(r5, r6)     // Catch:{ NumberFormatException | JSONException -> 0x00a3 }
            goto L_0x00b4
        L_0x008f:
            java.lang.String r4 = r4.getString(r8)     // Catch:{ NumberFormatException | JSONException -> 0x00a3 }
            double r6 = java.lang.Double.parseDouble(r4)     // Catch:{ NumberFormatException | JSONException -> 0x00a3 }
            r1.putDouble(r5, r6)     // Catch:{ NumberFormatException | JSONException -> 0x00a3 }
            goto L_0x00b4
        L_0x009b:
            java.lang.String r4 = r4.getString(r8)     // Catch:{ NumberFormatException | JSONException -> 0x00a3 }
            r1.putString(r5, r4)     // Catch:{ NumberFormatException | JSONException -> 0x00a3 }
            goto L_0x00b4
        L_0x00a3:
            com.google.android.gms.measurement.internal.p4 r4 = r11.f10852d     // Catch:{ JSONException -> 0x00bb }
            com.google.android.gms.measurement.internal.l5 r4 = r4.f10651a     // Catch:{ JSONException -> 0x00bb }
            com.google.android.gms.measurement.internal.z3 r4 = r4.mo11935b()     // Catch:{ JSONException -> 0x00bb }
            com.google.android.gms.measurement.internal.x3 r4 = r4.mo12544r()     // Catch:{ JSONException -> 0x00bb }
            java.lang.String r5 = "Error reading value from SharedPreferences. Value dropped"
            r4.mo12476a(r5)     // Catch:{ JSONException -> 0x00bb }
        L_0x00b4:
            int r3 = r3 + 1
            goto L_0x0021
        L_0x00b8:
            r11.f10851c = r1     // Catch:{ JSONException -> 0x00bb }
            goto L_0x00cc
        L_0x00bb:
            com.google.android.gms.measurement.internal.p4 r0 = r11.f10852d
            com.google.android.gms.measurement.internal.l5 r0 = r0.f10651a
            com.google.android.gms.measurement.internal.z3 r0 = r0.mo11935b()
            com.google.android.gms.measurement.internal.x3 r0 = r0.mo12544r()
            java.lang.String r1 = "Error loading bundle from SharedPreferences. Values will be lost"
            r0.mo12476a(r1)
        L_0x00cc:
            android.os.Bundle r0 = r11.f10851c
            if (r0 != 0) goto L_0x00d4
            android.os.Bundle r0 = r11.f10850b
            r11.f10851c = r0
        L_0x00d4:
            android.os.Bundle r0 = r11.f10851c
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.C3941k4.mo12139a():android.os.Bundle");
    }

    /* renamed from: b */
    public final void mo12140b(Bundle bundle) {
        String str;
        if (bundle == null) {
            bundle = new Bundle();
        }
        SharedPreferences.Editor edit = this.f10852d.mo12255o().edit();
        if (bundle.size() == 0) {
            edit.remove(this.f10849a);
        } else {
            String str2 = this.f10849a;
            JSONArray jSONArray = new JSONArray();
            for (String str3 : bundle.keySet()) {
                Object obj = bundle.get(str3);
                if (obj != null) {
                    try {
                        JSONObject jSONObject = new JSONObject();
                        jSONObject.put("n", str3);
                        jSONObject.put("v", obj.toString());
                        if (obj instanceof String) {
                            str = "s";
                        } else if (obj instanceof Long) {
                            str = "l";
                        } else if (obj instanceof Double) {
                            str = "d";
                        } else {
                            this.f10852d.f10651a.mo11935b().mo12544r().mo12477b("Cannot serialize bundle value to SharedPreferences. Type", obj.getClass());
                        }
                        jSONObject.put("t", str);
                        jSONArray.put(jSONObject);
                    } catch (JSONException e) {
                        this.f10852d.f10651a.mo11935b().mo12544r().mo12477b("Cannot serialize bundle value to SharedPreferences", e);
                    }
                }
            }
            edit.putString(str2, jSONArray.toString());
        }
        edit.apply();
        this.f10851c = bundle;
    }
}
