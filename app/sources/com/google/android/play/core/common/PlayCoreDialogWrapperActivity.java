package com.google.android.play.core.common;

import android.app.Activity;
import android.app.PendingIntent;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.IntentSender;
import android.os.Bundle;
import android.os.ResultReceiver;
import p174e.p319f.p320a.p382e.p383a.p385b.C9127n;

public class PlayCoreDialogWrapperActivity extends Activity {

    /* renamed from: f */
    private ResultReceiver f12731f;

    /* renamed from: a */
    public static void m17030a(Context context) {
        C9127n.m30385a(context.getPackageManager(), new ComponentName(context.getPackageName(), "com.google.android.play.core.common.PlayCoreDialogWrapperActivity"), 1);
    }

    /* access modifiers changed from: protected */
    public final void onActivityResult(int i, int i2, Intent intent) {
        ResultReceiver resultReceiver;
        Bundle bundle;
        int i3;
        super.onActivityResult(i, i2, intent);
        if (i == 0 && (resultReceiver = this.f12731f) != null) {
            if (i2 == -1) {
                bundle = new Bundle();
                i3 = 1;
            } else if (i2 == 0) {
                bundle = new Bundle();
                i3 = 2;
            }
            resultReceiver.send(i3, bundle);
        }
        finish();
    }

    /* access modifiers changed from: protected */
    public final void onCreate(Bundle bundle) {
        Intent intent;
        int intExtra = getIntent().getIntExtra("window_flags", 0);
        if (intExtra != 0) {
            getWindow().getDecorView().setSystemUiVisibility(intExtra);
            intent = new Intent();
            intent.putExtra("window_flags", intExtra);
        } else {
            intent = null;
        }
        Intent intent2 = intent;
        super.onCreate(bundle);
        if (bundle == null) {
            this.f12731f = (ResultReceiver) getIntent().getParcelableExtra("result_receiver");
            try {
                startIntentSenderForResult(((PendingIntent) getIntent().getExtras().get("confirmation_intent")).getIntentSender(), 0, intent2, 0, 0, 0);
            } catch (IntentSender.SendIntentException unused) {
                ResultReceiver resultReceiver = this.f12731f;
                if (resultReceiver != null) {
                    resultReceiver.send(3, new Bundle());
                }
                finish();
            }
        } else {
            this.f12731f = (ResultReceiver) bundle.getParcelable("result_receiver");
        }
    }

    /* access modifiers changed from: protected */
    public final void onSaveInstanceState(Bundle bundle) {
        bundle.putParcelable("result_receiver", this.f12731f);
    }
}
