package com.google.android.gms.auth.api.signin.internal;

import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.accessibility.AccessibilityEvent;
import androidx.fragment.app.C1214c;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.auth.api.signin.SignInAccount;
import com.google.android.gms.common.annotation.KeepName;
import com.google.android.gms.common.api.Status;
import java.util.Objects;

@KeepName
public class SignInHubActivity extends C1214c {

    /* renamed from: E */
    private static boolean f9773E = false;

    /* renamed from: F */
    private boolean f9774F = false;

    /* renamed from: G */
    private SignInConfiguration f9775G;

    /* renamed from: H */
    private boolean f9776H;
    /* access modifiers changed from: private */

    /* renamed from: I */
    public int f9777I;
    /* access modifiers changed from: private */

    /* renamed from: J */
    public Intent f9778J;

    /* renamed from: C */
    private final void m13425C() {
        mo4007r().mo6949c(0, (Bundle) null, new C3463y(this, (C3462x) null));
        f9773E = false;
    }

    /* renamed from: D */
    private final void m13426D(int i) {
        Status status = new Status(i);
        Intent intent = new Intent();
        intent.putExtra("googleSignInStatus", status);
        setResult(0, intent);
        finish();
        f9773E = false;
    }

    /* renamed from: E */
    private final void m13427E(String str) {
        Intent intent = new Intent(str);
        intent.setPackage(str.equals("com.google.android.gms.auth.GOOGLE_SIGN_IN") ? "com.google.android.gms" : getPackageName());
        intent.putExtra("config", this.f9775G);
        try {
            startActivityForResult(intent, 40962);
        } catch (ActivityNotFoundException unused) {
            this.f9774F = true;
            Log.w("AuthSignInClient", "Could not launch sign in Intent. Google Play Service is probably being updated...");
            m13426D(17);
        }
    }

    public final boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        return true;
    }

    /* access modifiers changed from: protected */
    public final void onActivityResult(int i, int i2, Intent intent) {
        if (!this.f9774F) {
            setResult(0);
            if (i == 40962) {
                if (intent != null) {
                    SignInAccount signInAccount = (SignInAccount) intent.getParcelableExtra("signInAccount");
                    if (signInAccount != null && signInAccount.mo11097o() != null) {
                        GoogleSignInAccount o = signInAccount.mo11097o();
                        C3454p a = C3454p.m13465a(this);
                        GoogleSignInOptions o2 = this.f9775G.mo11111o();
                        Objects.requireNonNull(o);
                        a.mo11143c(o2, o);
                        intent.removeExtra("signInAccount");
                        intent.putExtra("googleSignInAccount", o);
                        this.f9776H = true;
                        this.f9777I = i2;
                        this.f9778J = intent;
                        m13425C();
                        return;
                    } else if (intent.hasExtra("errorCode")) {
                        int intExtra = intent.getIntExtra("errorCode", 8);
                        if (intExtra == 13) {
                            intExtra = 12501;
                        }
                        m13426D(intExtra);
                        return;
                    }
                }
                m13426D(8);
            }
        }
    }

    /* access modifiers changed from: protected */
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Intent intent = getIntent();
        String action = intent.getAction();
        Objects.requireNonNull(action);
        if ("com.google.android.gms.auth.NO_IMPL".equals(action)) {
            m13426D(12500);
        } else if (action.equals("com.google.android.gms.auth.GOOGLE_SIGN_IN") || action.equals("com.google.android.gms.auth.APPAUTH_SIGN_IN")) {
            Bundle bundleExtra = intent.getBundleExtra("config");
            Objects.requireNonNull(bundleExtra);
            SignInConfiguration signInConfiguration = (SignInConfiguration) bundleExtra.getParcelable("config");
            if (signInConfiguration == null) {
                Log.e("AuthSignInClient", "Activity started with invalid configuration.");
                setResult(0);
                finish();
                return;
            }
            this.f9775G = signInConfiguration;
            if (bundle != null) {
                boolean z = bundle.getBoolean("signingInGoogleApiClients");
                this.f9776H = z;
                if (z) {
                    this.f9777I = bundle.getInt("signInResultCode");
                    Intent intent2 = (Intent) bundle.getParcelable("signInResultData");
                    Objects.requireNonNull(intent2);
                    this.f9778J = intent2;
                    m13425C();
                }
            } else if (f9773E) {
                setResult(0);
                m13426D(12502);
            } else {
                f9773E = true;
                m13427E(action);
            }
        } else {
            Log.e("AuthSignInClient", "Unknown action: ".concat(String.valueOf(intent.getAction())));
            finish();
        }
    }

    public final void onDestroy() {
        super.onDestroy();
        f9773E = false;
    }

    /* access modifiers changed from: protected */
    public final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putBoolean("signingInGoogleApiClients", this.f9776H);
        if (this.f9776H) {
            bundle.putInt("signInResultCode", this.f9777I);
            bundle.putParcelable("signInResultData", this.f9778J);
        }
    }
}
