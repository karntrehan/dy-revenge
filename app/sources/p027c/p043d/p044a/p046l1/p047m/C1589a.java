package p027c.p043d.p044a.p046l1.p047m;

import android.media.AudioRecord;
import android.media.AudioRecordingConfiguration;
import android.media.AudioTimestamp;

/* renamed from: c.d.a.l1.m.a */
public final class C1589a {
    /* renamed from: a */
    public static int m7038a(AudioRecordingConfiguration audioRecordingConfiguration) {
        return audioRecordingConfiguration.getClientAudioSessionId();
    }

    /* renamed from: b */
    public static int m7039b(AudioRecord audioRecord, AudioTimestamp audioTimestamp, int i) {
        return audioRecord.getTimestamp(audioTimestamp, i);
    }
}
