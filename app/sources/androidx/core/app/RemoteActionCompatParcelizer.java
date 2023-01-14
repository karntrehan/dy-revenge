package androidx.core.app;

import android.app.PendingIntent;
import androidx.core.graphics.drawable.IconCompat;
import androidx.versionedparcelable.C1425a;

public class RemoteActionCompatParcelizer {
    public static RemoteActionCompat read(C1425a aVar) {
        RemoteActionCompat remoteActionCompat = new RemoteActionCompat();
        remoteActionCompat.f3064a = (IconCompat) aVar.mo5305v(remoteActionCompat.f3064a, 1);
        remoteActionCompat.f3065b = aVar.mo5295l(remoteActionCompat.f3065b, 2);
        remoteActionCompat.f3066c = aVar.mo5295l(remoteActionCompat.f3066c, 3);
        remoteActionCompat.f3067d = (PendingIntent) aVar.mo5301r(remoteActionCompat.f3067d, 4);
        remoteActionCompat.f3068e = aVar.mo5291h(remoteActionCompat.f3068e, 5);
        remoteActionCompat.f3069f = aVar.mo5291h(remoteActionCompat.f3069f, 6);
        return remoteActionCompat;
    }

    public static void write(RemoteActionCompat remoteActionCompat, C1425a aVar) {
        aVar.mo5307x(false, false);
        aVar.mo5286M(remoteActionCompat.f3064a, 1);
        aVar.mo5277D(remoteActionCompat.f3065b, 2);
        aVar.mo5277D(remoteActionCompat.f3066c, 3);
        aVar.mo5281H(remoteActionCompat.f3067d, 4);
        aVar.mo5309z(remoteActionCompat.f3068e, 5);
        aVar.mo5309z(remoteActionCompat.f3069f, 6);
    }
}
