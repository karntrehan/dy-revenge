package androidx.core.app;

import android.app.Notification;
import android.os.Bundle;
import android.util.Log;
import android.util.SparseArray;
import androidx.core.app.C1117i;
import androidx.core.graphics.drawable.IconCompat;
import java.lang.reflect.Field;
import java.util.List;

/* renamed from: androidx.core.app.k */
class C1126k {

    /* renamed from: a */
    private static final Object f3174a = new Object();

    /* renamed from: b */
    private static Field f3175b;

    /* renamed from: c */
    private static boolean f3176c;

    /* renamed from: d */
    private static final Object f3177d = new Object();

    /* renamed from: a */
    public static SparseArray<Bundle> m4378a(List<Bundle> list) {
        int size = list.size();
        SparseArray<Bundle> sparseArray = null;
        for (int i = 0; i < size; i++) {
            Bundle bundle = list.get(i);
            if (bundle != null) {
                if (sparseArray == null) {
                    sparseArray = new SparseArray<>();
                }
                sparseArray.put(i, bundle);
            }
        }
        return sparseArray;
    }

    /* renamed from: b */
    static Bundle m4379b(C1117i.C1118a aVar) {
        Bundle bundle = new Bundle();
        IconCompat e = aVar.mo3565e();
        bundle.putInt("icon", e != null ? e.mo3645c() : 0);
        bundle.putCharSequence("title", aVar.mo3569i());
        bundle.putParcelable("actionIntent", aVar.mo3561a());
        Bundle bundle2 = aVar.mo3564d() != null ? new Bundle(aVar.mo3564d()) : new Bundle();
        bundle2.putBoolean("android.support.allowGeneratedReplies", aVar.mo3562b());
        bundle.putBundle("extras", bundle2);
        bundle.putParcelableArray("remoteInputs", m4382e(aVar.mo3566f()));
        bundle.putBoolean("showsUserInterface", aVar.mo3568h());
        bundle.putInt("semanticAction", aVar.mo3567g());
        return bundle;
    }

    /* renamed from: c */
    public static Bundle m4380c(Notification notification) {
        String str;
        String str2;
        synchronized (f3174a) {
            if (f3176c) {
                return null;
            }
            try {
                if (f3175b == null) {
                    Field declaredField = Notification.class.getDeclaredField("extras");
                    if (!Bundle.class.isAssignableFrom(declaredField.getType())) {
                        Log.e("NotificationCompat", "Notification.extras field is not of type Bundle");
                        f3176c = true;
                        return null;
                    }
                    declaredField.setAccessible(true);
                    f3175b = declaredField;
                }
                Bundle bundle = (Bundle) f3175b.get(notification);
                if (bundle == null) {
                    bundle = new Bundle();
                    f3175b.set(notification, bundle);
                }
                return bundle;
            } catch (IllegalAccessException e) {
                e = e;
                str = "NotificationCompat";
                str2 = "Unable to access notification extras";
                Log.e(str, str2, e);
                f3176c = true;
                return null;
            } catch (NoSuchFieldException e2) {
                e = e2;
                str = "NotificationCompat";
                str2 = "Unable to access notification extras";
                Log.e(str, str2, e);
                f3176c = true;
                return null;
            }
        }
    }

    /* renamed from: d */
    private static Bundle m4381d(C1129n nVar) {
        new Bundle();
        throw null;
    }

    /* renamed from: e */
    private static Bundle[] m4382e(C1129n[] nVarArr) {
        if (nVarArr == null) {
            return null;
        }
        Bundle[] bundleArr = new Bundle[nVarArr.length];
        for (int i = 0; i < nVarArr.length; i++) {
            bundleArr[i] = m4381d(nVarArr[i]);
        }
        return bundleArr;
    }

    /* renamed from: f */
    public static Bundle m4383f(Notification.Builder builder, C1117i.C1118a aVar) {
        IconCompat e = aVar.mo3565e();
        builder.addAction(e != null ? e.mo3645c() : 0, aVar.mo3569i(), aVar.mo3561a());
        Bundle bundle = new Bundle(aVar.mo3564d());
        if (aVar.mo3566f() != null) {
            bundle.putParcelableArray("android.support.remoteInputs", m4382e(aVar.mo3566f()));
        }
        if (aVar.mo3563c() != null) {
            bundle.putParcelableArray("android.support.dataRemoteInputs", m4382e(aVar.mo3563c()));
        }
        bundle.putBoolean("android.support.allowGeneratedReplies", aVar.mo3562b());
        return bundle;
    }
}
