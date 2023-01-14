package android.support.p001v4.media.session;

import android.os.Bundle;
import android.os.RemoteException;
import android.os.ResultReceiver;
import android.support.p001v4.media.MediaMetadataCompat;
import android.support.p001v4.media.session.C0021b;
import android.support.p001v4.media.session.C0024c;
import android.support.p001v4.media.session.MediaSessionCompat;
import android.util.Log;
import androidx.core.app.C1112e;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.List;

/* renamed from: android.support.v4.media.session.MediaControllerCompat$MediaControllerImplApi21 */
class MediaControllerCompat$MediaControllerImplApi21 {

    /* renamed from: a */
    final Object f29a;

    /* renamed from: b */
    private final List<C0024c> f30b;

    /* renamed from: c */
    private HashMap<C0024c, C0012a> f31c;

    /* renamed from: d */
    final MediaSessionCompat.Token f32d;

    /* renamed from: android.support.v4.media.session.MediaControllerCompat$MediaControllerImplApi21$ExtraBinderRequestResultReceiver */
    private static class ExtraBinderRequestResultReceiver extends ResultReceiver {

        /* renamed from: f */
        private WeakReference<MediaControllerCompat$MediaControllerImplApi21> f33f;

        /* access modifiers changed from: protected */
        public void onReceiveResult(int i, Bundle bundle) {
            MediaControllerCompat$MediaControllerImplApi21 mediaControllerCompat$MediaControllerImplApi21 = (MediaControllerCompat$MediaControllerImplApi21) this.f33f.get();
            if (mediaControllerCompat$MediaControllerImplApi21 != null && bundle != null) {
                synchronized (mediaControllerCompat$MediaControllerImplApi21.f29a) {
                    mediaControllerCompat$MediaControllerImplApi21.f32d.mo61b(C0021b.C0022a.m87j(C1112e.m4318a(bundle, "android.support.v4.media.session.EXTRA_BINDER")));
                    mediaControllerCompat$MediaControllerImplApi21.f32d.mo62c(bundle.getBundle("android.support.v4.media.session.SESSION_TOKEN2_BUNDLE"));
                    mediaControllerCompat$MediaControllerImplApi21.mo39a();
                }
            }
        }
    }

    /* renamed from: android.support.v4.media.session.MediaControllerCompat$MediaControllerImplApi21$a */
    private static class C0012a extends C0024c.C0027c {
        C0012a(C0024c cVar) {
            super(cVar);
        }

        /* renamed from: O0 */
        public void mo41O0(ParcelableVolumeInfo parcelableVolumeInfo) {
            throw new AssertionError();
        }

        /* renamed from: d */
        public void mo42d(Bundle bundle) {
            throw new AssertionError();
        }

        /* renamed from: e */
        public void mo43e(List<MediaSessionCompat.QueueItem> list) {
            throw new AssertionError();
        }

        /* renamed from: g */
        public void mo44g(CharSequence charSequence) {
            throw new AssertionError();
        }

        /* renamed from: i */
        public void mo45i() {
            throw new AssertionError();
        }

        /* renamed from: n0 */
        public void mo46n0(MediaMetadataCompat mediaMetadataCompat) {
            throw new AssertionError();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo39a() {
        if (this.f32d.mo60a() != null) {
            for (C0024c next : this.f30b) {
                C0012a aVar = new C0012a(next);
                this.f31c.put(next, aVar);
                next.f66c = aVar;
                try {
                    this.f32d.mo60a().mo100o(aVar);
                    next.mo111i(13, (Object) null, (Bundle) null);
                } catch (RemoteException e) {
                    Log.e("MediaControllerCompat", "Dead object in registerCallback.", e);
                }
            }
            this.f30b.clear();
        }
    }
}
