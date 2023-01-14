package p174e.p319f.p406d.p407a.p409c;

import android.content.Context;
import android.content.SharedPreferences;
import androidx.annotation.RecentlyNonNull;
import com.google.firebase.components.C4501n;
import com.google.firebase.components.C4518u;
import java.util.UUID;

/* renamed from: e.f.d.a.c.n */
public class C9611n {
    @RecentlyNonNull

    /* renamed from: a */
    public static final C4501n<?> f25711a = C4501n.m17120a(C9611n.class).mo14031b(C4518u.m17193i(C9606i.class)).mo14031b(C4518u.m17193i(Context.class)).mo14034e(C9596c0.f25686a).mo14032c();

    /* renamed from: b */
    private final Context f25712b;

    public C9611n(@RecentlyNonNull Context context) {
        this.f25712b = context;
    }

    /* renamed from: b */
    private final SharedPreferences m32727b() {
        return this.f25712b.getSharedPreferences("com.google.mlkit.internal", 0);
    }

    @RecentlyNonNull
    /* renamed from: a */
    public synchronized String mo24105a() {
        String string = m32727b().getString("ml_sdk_instance_id", (String) null);
        if (string != null) {
            return string;
        }
        String uuid = UUID.randomUUID().toString();
        m32727b().edit().putString("ml_sdk_instance_id", uuid).apply();
        return uuid;
    }
}
