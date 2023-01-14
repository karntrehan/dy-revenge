package android.support.p001v4.media.session;

import android.media.AudioAttributes;
import android.media.MediaMetadata;
import android.media.session.MediaController;
import android.media.session.MediaSession;
import android.media.session.PlaybackState;
import android.os.Bundle;
import java.util.List;

/* renamed from: android.support.v4.media.session.e */
class C0029e {

    /* renamed from: android.support.v4.media.session.e$a */
    public interface C0030a {
        /* renamed from: a */
        void mo112a(Object obj);

        /* renamed from: b */
        void mo113b(int i, int i2, int i3, int i4, int i5);

        /* renamed from: c */
        void mo114c(Object obj);

        /* renamed from: d */
        void mo115d(Bundle bundle);

        /* renamed from: e */
        void mo116e(List<?> list);

        /* renamed from: f */
        void mo117f(String str, Bundle bundle);

        /* renamed from: g */
        void mo118g(CharSequence charSequence);

        /* renamed from: i */
        void mo119i();
    }

    /* renamed from: android.support.v4.media.session.e$b */
    static class C0031b<T extends C0030a> extends MediaController.Callback {

        /* renamed from: a */
        protected final T f74a;

        public C0031b(T t) {
            this.f74a = t;
        }

        public void onAudioInfoChanged(MediaController.PlaybackInfo playbackInfo) {
            this.f74a.mo113b(playbackInfo.getPlaybackType(), C0032c.m129b(playbackInfo), playbackInfo.getVolumeControl(), playbackInfo.getMaxVolume(), playbackInfo.getCurrentVolume());
        }

        public void onExtrasChanged(Bundle bundle) {
            MediaSessionCompat.m53a(bundle);
            this.f74a.mo115d(bundle);
        }

        public void onMetadataChanged(MediaMetadata mediaMetadata) {
            this.f74a.mo112a(mediaMetadata);
        }

        public void onPlaybackStateChanged(PlaybackState playbackState) {
            this.f74a.mo114c(playbackState);
        }

        public void onQueueChanged(List<MediaSession.QueueItem> list) {
            this.f74a.mo116e(list);
        }

        public void onQueueTitleChanged(CharSequence charSequence) {
            this.f74a.mo118g(charSequence);
        }

        public void onSessionDestroyed() {
            this.f74a.mo119i();
        }

        public void onSessionEvent(String str, Bundle bundle) {
            MediaSessionCompat.m53a(bundle);
            this.f74a.mo117f(str, bundle);
        }
    }

    /* renamed from: android.support.v4.media.session.e$c */
    public static class C0032c {
        /* renamed from: a */
        public static AudioAttributes m128a(Object obj) {
            return ((MediaController.PlaybackInfo) obj).getAudioAttributes();
        }

        /* renamed from: b */
        public static int m129b(Object obj) {
            return m130c(m128a(obj));
        }

        /* renamed from: c */
        private static int m130c(AudioAttributes audioAttributes) {
            if ((audioAttributes.getFlags() & 1) == 1) {
                return 7;
            }
            if ((audioAttributes.getFlags() & 4) == 4) {
                return 6;
            }
            int usage = audioAttributes.getUsage();
            if (usage == 13) {
                return 1;
            }
            switch (usage) {
                case 2:
                    return 0;
                case 3:
                    return 8;
                case 4:
                    return 4;
                case 5:
                case 7:
                case 8:
                case 9:
                case 10:
                    return 5;
                case 6:
                    return 2;
                default:
                    return 3;
            }
        }
    }

    /* renamed from: a */
    public static Object m119a(C0030a aVar) {
        return new C0031b(aVar);
    }
}
