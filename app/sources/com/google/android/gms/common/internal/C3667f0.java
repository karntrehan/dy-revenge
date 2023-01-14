package com.google.android.gms.common.internal;

import android.content.Context;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.common.C3635h;
import com.google.android.gms.common.C3740k;
import com.google.android.gms.common.p133n.C3746c;
import com.google.android.gms.common.util.C3762i;
import java.util.Locale;
import p027c.p060f.C1801g;
import p027c.p064i.p069g.C1851c;
import p174e.p319f.p320a.p335c.p342c.C6633b;

/* renamed from: com.google.android.gms.common.internal.f0 */
public final class C3667f0 {

    /* renamed from: a */
    private static final C1801g<String, String> f10299a = new C1801g<>();

    /* renamed from: b */
    private static Locale f10300b;

    /* renamed from: a */
    public static String m14252a(Context context) {
        String packageName = context.getPackageName();
        try {
            return C3746c.m14493a(context).mo11718c(packageName).toString();
        } catch (PackageManager.NameNotFoundException | NullPointerException unused) {
            String str = context.getApplicationInfo().name;
            return TextUtils.isEmpty(str) ? packageName : str;
        }
    }

    /* renamed from: b */
    public static String m14253b(Context context) {
        return context.getResources().getString(C6633b.common_google_play_services_notification_channel_name);
    }

    /* renamed from: c */
    public static String m14254c(Context context, int i) {
        return context.getResources().getString(i != 1 ? i != 2 ? i != 3 ? 17039370 : C6633b.common_google_play_services_enable_button : C6633b.common_google_play_services_update_button : C6633b.common_google_play_services_install_button);
    }

    /* renamed from: d */
    public static String m14255d(Context context, int i) {
        Resources resources = context.getResources();
        String a = m14252a(context);
        if (i == 1) {
            return resources.getString(C6633b.common_google_play_services_install_text, new Object[]{a});
        } else if (i != 2) {
            if (i == 3) {
                return resources.getString(C6633b.common_google_play_services_enable_text, new Object[]{a});
            } else if (i == 5) {
                return m14259h(context, "common_google_play_services_invalid_account_text", a);
            } else {
                if (i == 7) {
                    return m14259h(context, "common_google_play_services_network_error_text", a);
                }
                if (i == 9) {
                    return resources.getString(C6633b.common_google_play_services_unsupported_text, new Object[]{a});
                } else if (i == 20) {
                    return m14259h(context, "common_google_play_services_restricted_profile_text", a);
                } else {
                    switch (i) {
                        case 16:
                            return m14259h(context, "common_google_play_services_api_unavailable_text", a);
                        case 17:
                            return m14259h(context, "common_google_play_services_sign_in_failed_text", a);
                        case 18:
                            return resources.getString(C6633b.common_google_play_services_updating_text, new Object[]{a});
                        default:
                            return resources.getString(C3740k.common_google_play_services_unknown_issue, new Object[]{a});
                    }
                }
            }
        } else if (C3762i.m14517d(context)) {
            return resources.getString(C6633b.common_google_play_services_wear_update_text);
        } else {
            return resources.getString(C6633b.common_google_play_services_update_text, new Object[]{a});
        }
    }

    /* renamed from: e */
    public static String m14256e(Context context, int i) {
        return (i == 6 || i == 19) ? m14259h(context, "common_google_play_services_resolution_required_text", m14252a(context)) : m14255d(context, i);
    }

    /* renamed from: f */
    public static String m14257f(Context context, int i) {
        String i2 = i == 6 ? m14260i(context, "common_google_play_services_resolution_required_title") : m14258g(context, i);
        return i2 == null ? context.getResources().getString(C6633b.common_google_play_services_notification_ticker) : i2;
    }

    /* renamed from: g */
    public static String m14258g(Context context, int i) {
        String str;
        Resources resources = context.getResources();
        switch (i) {
            case 1:
                return resources.getString(C6633b.common_google_play_services_install_title);
            case 2:
                return resources.getString(C6633b.common_google_play_services_update_title);
            case 3:
                return resources.getString(C6633b.common_google_play_services_enable_title);
            case 4:
            case 6:
            case 18:
                return null;
            case 5:
                Log.e("GoogleApiAvailability", "An invalid account was specified when connecting. Please provide a valid account.");
                return m14260i(context, "common_google_play_services_invalid_account_title");
            case 7:
                Log.e("GoogleApiAvailability", "Network error occurred. Please retry request later.");
                return m14260i(context, "common_google_play_services_network_error_title");
            case 8:
                str = "Internal error occurred. Please see logs for detailed information";
                break;
            case 9:
                str = "Google Play services is invalid. Cannot recover.";
                break;
            case 10:
                str = "Developer error occurred. Please see logs for detailed information";
                break;
            case 11:
                str = "The application is not licensed to the user.";
                break;
            case 16:
                str = "One of the API components you attempted to connect to is not available.";
                break;
            case 17:
                Log.e("GoogleApiAvailability", "The specified account could not be signed in.");
                return m14260i(context, "common_google_play_services_sign_in_failed_title");
            case 20:
                Log.e("GoogleApiAvailability", "The current user profile is restricted and could not use authenticated features.");
                return m14260i(context, "common_google_play_services_restricted_profile_title");
            default:
                StringBuilder sb = new StringBuilder(33);
                sb.append("Unexpected error code ");
                sb.append(i);
                str = sb.toString();
                break;
        }
        Log.e("GoogleApiAvailability", str);
        return null;
    }

    /* renamed from: h */
    private static String m14259h(Context context, String str, String str2) {
        Resources resources = context.getResources();
        String i = m14260i(context, str);
        if (i == null) {
            i = resources.getString(C3740k.common_google_play_services_unknown_issue);
        }
        return String.format(resources.getConfiguration().locale, i, new Object[]{str2});
    }

    /* renamed from: i */
    private static String m14260i(Context context, String str) {
        C1801g<String, String> gVar = f10299a;
        synchronized (gVar) {
            Locale c = C1851c.m7865a(context.getResources().getConfiguration()).mo6353c(0);
            if (!c.equals(f10300b)) {
                gVar.clear();
                f10300b = c;
            }
            String str2 = gVar.get(str);
            if (str2 != null) {
                return str2;
            }
            Resources d = C3635h.m14123d(context);
            if (d == null) {
                return null;
            }
            int identifier = d.getIdentifier(str, "string", "com.google.android.gms");
            if (identifier == 0) {
                Log.w("GoogleApiAvailability", str.length() != 0 ? "Missing resource: ".concat(str) : new String("Missing resource: "));
                return null;
            }
            String string = d.getString(identifier);
            if (TextUtils.isEmpty(string)) {
                Log.w("GoogleApiAvailability", str.length() != 0 ? "Got empty resource: ".concat(str) : new String("Got empty resource: "));
                return null;
            }
            gVar.put(str, string);
            return string;
        }
    }
}
