package com.proyecto26.inappbrowser;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import org.greenrobot.eventbus.C10878c;

public class ChromeTabsManagerActivity extends Activity {

    /* renamed from: f */
    private boolean f14702f = false;

    /* renamed from: o */
    private String f14703o = null;

    /* renamed from: p */
    private boolean f14704p = false;

    /* renamed from: a */
    private static Intent m19503a(Context context) {
        return new Intent(context, ChromeTabsManagerActivity.class);
    }

    /* renamed from: b */
    public static Intent m19504b(Context context) {
        Intent a = m19503a(context);
        a.addFlags(67108864);
        return a;
    }

    /* renamed from: c */
    public static Intent m19505c(Context context, Intent intent) {
        Intent a = m19503a(context);
        a.putExtra("browserIntent", intent);
        return a;
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        try {
            super.onCreate(bundle);
            if (!getIntent().hasExtra("browserIntent") || !(bundle == null || bundle.getString("browserResultType") == null)) {
                finish();
                return;
            }
            Intent intent = (Intent) getIntent().getParcelableExtra("browserIntent");
            intent.addFlags(67108864);
            startActivity(intent);
            this.f14703o = "dismiss";
        } catch (Exception e) {
            this.f14704p = true;
            C10878c.m37003c().mo28479l(new C5209a("Unable to open url.", this.f14703o, Boolean.valueOf(this.f14704p)));
            finish();
            e.printStackTrace();
        }
    }

    /* access modifiers changed from: protected */
    public void onDestroy() {
        C5209a aVar;
        C10878c cVar;
        String str = this.f14703o;
        if (str != null) {
            str.hashCode();
            if (!str.equals("cancel")) {
                cVar = C10878c.m37003c();
                aVar = new C5209a("chrome tabs activity destroyed", "dismiss", Boolean.valueOf(this.f14704p));
            } else {
                cVar = C10878c.m37003c();
                aVar = new C5209a("chrome tabs activity closed", this.f14703o, Boolean.valueOf(this.f14704p));
            }
            cVar.mo28479l(aVar);
            this.f14703o = null;
        }
        super.onDestroy();
    }

    /* access modifiers changed from: protected */
    public void onNewIntent(Intent intent) {
        super.onNewIntent(intent);
        setIntent(intent);
    }

    /* access modifiers changed from: protected */
    public void onRestoreInstanceState(Bundle bundle) {
        super.onRestoreInstanceState(bundle);
        this.f14703o = bundle.getString("browserResultType");
    }

    /* access modifiers changed from: protected */
    public void onResume() {
        super.onResume();
        if (!this.f14702f) {
            this.f14702f = true;
            return;
        }
        this.f14703o = "cancel";
        finish();
    }

    /* access modifiers changed from: protected */
    public void onSaveInstanceState(Bundle bundle) {
        bundle.putString("browserResultType", "dismiss");
        super.onSaveInstanceState(bundle);
    }
}
