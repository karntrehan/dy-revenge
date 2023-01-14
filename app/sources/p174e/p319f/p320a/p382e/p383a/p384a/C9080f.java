package p174e.p319f.p320a.p382e.p383a.p384a;

import android.app.Activity;
import android.content.Intent;
import android.content.IntentSender;
import android.os.Bundle;
import com.google.android.play.core.common.C4455a;

/* renamed from: e.f.a.e.a.a.f */
final class C9080f implements C4455a {

    /* renamed from: a */
    final /* synthetic */ Activity f24928a;

    C9080f(Activity activity) {
        this.f24928a = activity;
    }

    /* renamed from: a */
    public final void mo13984a(IntentSender intentSender, int i, Intent intent, int i2, int i3, int i4, Bundle bundle) {
        this.f24928a.startIntentSenderForResult(intentSender, i, intent, i2, i3, i4, bundle);
    }
}
