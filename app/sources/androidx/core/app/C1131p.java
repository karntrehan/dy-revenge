package androidx.core.app;

import android.app.Activity;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.util.Log;
import androidx.core.content.C1135a;
import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: androidx.core.app.p */
public final class C1131p implements Iterable<Intent> {

    /* renamed from: f */
    private final ArrayList<Intent> f3189f = new ArrayList<>();

    /* renamed from: o */
    private final Context f3190o;

    /* renamed from: androidx.core.app.p$a */
    public interface C1132a {
        /* renamed from: f */
        Intent mo236f();
    }

    private C1131p(Context context) {
        this.f3190o = context;
    }

    /* renamed from: j */
    public static C1131p m4396j(Context context) {
        return new C1131p(context);
    }

    /* renamed from: b */
    public C1131p mo3604b(Intent intent) {
        this.f3189f.add(intent);
        return this;
    }

    /* renamed from: g */
    public C1131p mo3605g(Activity activity) {
        Intent f = activity instanceof C1132a ? ((C1132a) activity).mo236f() : null;
        if (f == null) {
            f = C1115g.m4323a(activity);
        }
        if (f != null) {
            ComponentName component = f.getComponent();
            if (component == null) {
                component = f.resolveActivity(this.f3190o.getPackageManager());
            }
            mo3606h(component);
            mo3604b(f);
        }
        return this;
    }

    /* renamed from: h */
    public C1131p mo3606h(ComponentName componentName) {
        int size = this.f3189f.size();
        try {
            Context context = this.f3190o;
            while (true) {
                Intent b = C1115g.m4324b(context, componentName);
                if (b == null) {
                    return this;
                }
                this.f3189f.add(size, b);
                context = this.f3190o;
                componentName = b.getComponent();
            }
        } catch (PackageManager.NameNotFoundException e) {
            Log.e("TaskStackBuilder", "Bad ComponentName while traversing activity parent metadata");
            throw new IllegalArgumentException(e);
        }
    }

    @Deprecated
    public Iterator<Intent> iterator() {
        return this.f3189f.iterator();
    }

    /* renamed from: k */
    public void mo3608k() {
        mo3609o((Bundle) null);
    }

    /* renamed from: o */
    public void mo3609o(Bundle bundle) {
        if (!this.f3189f.isEmpty()) {
            ArrayList<Intent> arrayList = this.f3189f;
            Intent[] intentArr = (Intent[]) arrayList.toArray(new Intent[arrayList.size()]);
            intentArr[0] = new Intent(intentArr[0]).addFlags(268484608);
            if (!C1135a.m4423i(this.f3190o, intentArr, bundle)) {
                Intent intent = new Intent(intentArr[intentArr.length - 1]);
                intent.addFlags(268435456);
                this.f3190o.startActivity(intent);
                return;
            }
            return;
        }
        throw new IllegalStateException("No intents added to TaskStackBuilder; cannot startActivities");
    }
}
