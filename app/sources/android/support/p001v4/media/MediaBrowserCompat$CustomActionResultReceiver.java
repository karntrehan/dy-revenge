package android.support.p001v4.media;

import android.os.Bundle;
import android.support.p001v4.media.session.MediaSessionCompat;
import android.util.Log;
import p023b.p024a.p025a.p026a.C1431b;

/* renamed from: android.support.v4.media.MediaBrowserCompat$CustomActionResultReceiver */
class MediaBrowserCompat$CustomActionResultReceiver extends C1431b {

    /* renamed from: q */
    private final Bundle f0q;

    /* renamed from: r */
    private final C0006a f1r;

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo1a(int i, Bundle bundle) {
        if (this.f1r != null) {
            MediaSessionCompat.m53a(bundle);
            if (i == -1) {
                throw null;
            } else if (i == 0) {
                throw null;
            } else if (i != 1) {
                Log.w("MediaBrowserCompat", "Unknown result code: " + i + " (extras=" + this.f0q + ", resultData=" + bundle + ")");
            } else {
                throw null;
            }
        }
    }
}
