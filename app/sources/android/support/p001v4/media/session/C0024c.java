package android.support.p001v4.media.session;

import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import android.support.p001v4.media.MediaMetadataCompat;
import android.support.p001v4.media.session.C0019a;
import android.support.p001v4.media.session.C0029e;
import android.support.p001v4.media.session.MediaSessionCompat;
import java.lang.ref.WeakReference;
import java.util.List;

/* renamed from: android.support.v4.media.session.c */
public abstract class C0024c implements IBinder.DeathRecipient {

    /* renamed from: a */
    final Object f64a;

    /* renamed from: b */
    C0025a f65b;

    /* renamed from: c */
    C0019a f66c;

    /* renamed from: android.support.v4.media.session.c$a */
    private class C0025a extends Handler {
    }

    /* renamed from: android.support.v4.media.session.c$b */
    private static class C0026b implements C0029e.C0030a {

        /* renamed from: a */
        private final WeakReference<C0024c> f67a;

        C0026b(C0024c cVar) {
            this.f67a = new WeakReference<>(cVar);
        }

        /* renamed from: a */
        public void mo112a(Object obj) {
            C0024c cVar = (C0024c) this.f67a.get();
            if (cVar != null) {
                cVar.mo105c(MediaMetadataCompat.m20a(obj));
            }
        }

        /* renamed from: b */
        public void mo113b(int i, int i2, int i3, int i4, int i5) {
            C0024c cVar = (C0024c) this.f67a.get();
            if (cVar != null) {
                cVar.mo102a(new C0028d(i, i2, i3, i4, i5));
            }
        }

        /* renamed from: c */
        public void mo114c(Object obj) {
            C0024c cVar = (C0024c) this.f67a.get();
            if (cVar != null && cVar.f66c == null) {
                cVar.mo106d(PlaybackStateCompat.m67a(obj));
            }
        }

        /* renamed from: d */
        public void mo115d(Bundle bundle) {
            C0024c cVar = (C0024c) this.f67a.get();
            if (cVar != null) {
                cVar.mo103b(bundle);
            }
        }

        /* renamed from: e */
        public void mo116e(List<?> list) {
            C0024c cVar = (C0024c) this.f67a.get();
            if (cVar != null) {
                cVar.mo107e(MediaSessionCompat.QueueItem.m55b(list));
            }
        }

        /* renamed from: f */
        public void mo117f(String str, Bundle bundle) {
            C0024c cVar = (C0024c) this.f67a.get();
            if (cVar == null) {
                return;
            }
            if (cVar.f66c == null || Build.VERSION.SDK_INT >= 23) {
                cVar.mo110h(str, bundle);
            }
        }

        /* renamed from: g */
        public void mo118g(CharSequence charSequence) {
            C0024c cVar = (C0024c) this.f67a.get();
            if (cVar != null) {
                cVar.mo108f(charSequence);
            }
        }

        /* renamed from: i */
        public void mo119i() {
            C0024c cVar = (C0024c) this.f67a.get();
            if (cVar != null) {
                cVar.mo109g();
            }
        }
    }

    /* renamed from: android.support.v4.media.session.c$c */
    private static class C0027c extends C0019a.C0020a {

        /* renamed from: a */
        private final WeakReference<C0024c> f68a;

        C0027c(C0024c cVar) {
            this.f68a = new WeakReference<>(cVar);
        }

        /* renamed from: H */
        public void mo91H() {
            C0024c cVar = (C0024c) this.f68a.get();
            if (cVar != null) {
                cVar.mo111i(13, (Object) null, (Bundle) null);
            }
        }

        /* renamed from: L0 */
        public void mo92L0(PlaybackStateCompat playbackStateCompat) {
            C0024c cVar = (C0024c) this.f68a.get();
            if (cVar != null) {
                cVar.mo111i(2, playbackStateCompat, (Bundle) null);
            }
        }

        /* renamed from: O0 */
        public void mo41O0(ParcelableVolumeInfo parcelableVolumeInfo) {
            C0024c cVar = (C0024c) this.f68a.get();
            if (cVar != null) {
                cVar.mo111i(4, parcelableVolumeInfo != null ? new C0028d(parcelableVolumeInfo.f41f, parcelableVolumeInfo.f42o, parcelableVolumeInfo.f43p, parcelableVolumeInfo.f44q, parcelableVolumeInfo.f45r) : null, (Bundle) null);
            }
        }

        /* renamed from: S */
        public void mo93S(boolean z) {
            C0024c cVar = (C0024c) this.f68a.get();
            if (cVar != null) {
                cVar.mo111i(11, Boolean.valueOf(z), (Bundle) null);
            }
        }

        /* renamed from: d */
        public void mo42d(Bundle bundle) {
            C0024c cVar = (C0024c) this.f68a.get();
            if (cVar != null) {
                cVar.mo111i(7, bundle, (Bundle) null);
            }
        }

        /* renamed from: e */
        public void mo43e(List<MediaSessionCompat.QueueItem> list) {
            C0024c cVar = (C0024c) this.f68a.get();
            if (cVar != null) {
                cVar.mo111i(5, list, (Bundle) null);
            }
        }

        /* renamed from: g */
        public void mo44g(CharSequence charSequence) {
            C0024c cVar = (C0024c) this.f68a.get();
            if (cVar != null) {
                cVar.mo111i(6, charSequence, (Bundle) null);
            }
        }

        /* renamed from: g0 */
        public void mo94g0(boolean z) {
        }

        /* renamed from: i */
        public void mo45i() {
            C0024c cVar = (C0024c) this.f68a.get();
            if (cVar != null) {
                cVar.mo111i(8, (Object) null, (Bundle) null);
            }
        }

        /* renamed from: l */
        public void mo95l(String str, Bundle bundle) {
            C0024c cVar = (C0024c) this.f68a.get();
            if (cVar != null) {
                cVar.mo111i(1, str, bundle);
            }
        }

        /* renamed from: n0 */
        public void mo46n0(MediaMetadataCompat mediaMetadataCompat) {
            C0024c cVar = (C0024c) this.f68a.get();
            if (cVar != null) {
                cVar.mo111i(3, mediaMetadataCompat, (Bundle) null);
            }
        }

        /* renamed from: s0 */
        public void mo96s0(int i) {
            C0024c cVar = (C0024c) this.f68a.get();
            if (cVar != null) {
                cVar.mo111i(9, Integer.valueOf(i), (Bundle) null);
            }
        }

        /* renamed from: x0 */
        public void mo97x0(int i) {
            C0024c cVar = (C0024c) this.f68a.get();
            if (cVar != null) {
                cVar.mo111i(12, Integer.valueOf(i), (Bundle) null);
            }
        }
    }

    public C0024c() {
        C0027c cVar;
        if (Build.VERSION.SDK_INT >= 21) {
            cVar = C0029e.m119a(new C0026b(this));
        } else {
            C0027c cVar2 = new C0027c(this);
            this.f66c = cVar2;
            cVar = cVar2;
        }
        this.f64a = cVar;
    }

    /* renamed from: a */
    public void mo102a(C0028d dVar) {
    }

    /* renamed from: b */
    public void mo103b(Bundle bundle) {
    }

    public void binderDied() {
        mo111i(8, (Object) null, (Bundle) null);
    }

    /* renamed from: c */
    public void mo105c(MediaMetadataCompat mediaMetadataCompat) {
    }

    /* renamed from: d */
    public void mo106d(PlaybackStateCompat playbackStateCompat) {
    }

    /* renamed from: e */
    public void mo107e(List<MediaSessionCompat.QueueItem> list) {
    }

    /* renamed from: f */
    public void mo108f(CharSequence charSequence) {
    }

    /* renamed from: g */
    public void mo109g() {
    }

    /* renamed from: h */
    public void mo110h(String str, Bundle bundle) {
    }

    /* access modifiers changed from: package-private */
    /* renamed from: i */
    public void mo111i(int i, Object obj, Bundle bundle) {
        if (this.f65b != null) {
            throw null;
        }
    }
}
