package p027c.p090q.p091a;

import android.content.BroadcastReceiver;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.os.PowerManager;
import android.util.Log;
import android.util.SparseArray;

@Deprecated
/* renamed from: c.q.a.a */
public abstract class C2067a extends BroadcastReceiver {

    /* renamed from: f */
    private static final SparseArray<PowerManager.WakeLock> f6025f = new SparseArray<>();

    /* renamed from: o */
    private static int f6026o = 1;

    /* renamed from: b */
    public static boolean m8876b(Intent intent) {
        int intExtra = intent.getIntExtra("androidx.contentpager.content.wakelockid", 0);
        if (intExtra == 0) {
            return false;
        }
        SparseArray<PowerManager.WakeLock> sparseArray = f6025f;
        synchronized (sparseArray) {
            PowerManager.WakeLock wakeLock = sparseArray.get(intExtra);
            if (wakeLock != null) {
                wakeLock.release();
                sparseArray.remove(intExtra);
                return true;
            }
            Log.w("WakefulBroadcastReceiv.", "No active wake lock id #" + intExtra);
            return true;
        }
    }

    /* renamed from: c */
    public static ComponentName m8877c(Context context, Intent intent) {
        SparseArray<PowerManager.WakeLock> sparseArray = f6025f;
        synchronized (sparseArray) {
            int i = f6026o;
            int i2 = i + 1;
            f6026o = i2;
            if (i2 <= 0) {
                f6026o = 1;
            }
            intent.putExtra("androidx.contentpager.content.wakelockid", i);
            ComponentName startService = context.startService(intent);
            if (startService == null) {
                return null;
            }
            PowerManager.WakeLock newWakeLock = ((PowerManager) context.getSystemService("power")).newWakeLock(1, "androidx.core:wake:" + startService.flattenToShortString());
            newWakeLock.setReferenceCounted(false);
            newWakeLock.acquire(60000);
            sparseArray.put(i, newWakeLock);
            return startService;
        }
    }
}
