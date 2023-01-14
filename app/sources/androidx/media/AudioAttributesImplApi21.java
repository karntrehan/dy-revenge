package androidx.media;

import android.annotation.TargetApi;
import android.media.AudioAttributes;

@TargetApi(21)
class AudioAttributesImplApi21 implements AudioAttributesImpl {

    /* renamed from: a */
    AudioAttributes f3748a;

    /* renamed from: b */
    int f3749b = -1;

    AudioAttributesImplApi21() {
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof AudioAttributesImplApi21)) {
            return false;
        }
        return this.f3748a.equals(((AudioAttributesImplApi21) obj).f3748a);
    }

    public int hashCode() {
        return this.f3748a.hashCode();
    }

    public String toString() {
        return "AudioAttributesCompat: audioattributes=" + this.f3748a;
    }
}
