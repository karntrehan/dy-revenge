package p495in.dataevolve.digiyatra;

import android.app.Application;
import android.content.Context;
import android.database.CursorWindow;
import com.facebook.react.C2756f;
import com.facebook.react.C2775m;
import com.facebook.react.C2886o;
import com.facebook.react.C2904r;
import com.facebook.react.C2906s;
import com.facebook.soloader.SoLoader;
import com.reactnativeotpautofill.C5343d;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.List;

/* renamed from: in.dataevolve.digiyatra.MainApplication */
public class MainApplication extends Application implements C2775m {

    /* renamed from: f */
    private final C2904r f28115f = new C10643a(this);

    /* renamed from: in.dataevolve.digiyatra.MainApplication$a */
    class C10643a extends C2904r {
        C10643a(Application application) {
            super(application);
        }

        /* access modifiers changed from: protected */
        /* renamed from: f */
        public String mo9342f() {
            return "index";
        }

        /* access modifiers changed from: protected */
        /* renamed from: h */
        public List<C2906s> mo9344h() {
            ArrayList<C2906s> a = new C2756f(this).mo9018a();
            a.add(new C10648e());
            a.add(new C5343d());
            a.add(new C10647d());
            return a;
        }

        /* renamed from: o */
        public boolean mo9351o() {
            return false;
        }
    }

    /* renamed from: b */
    private static void m36245b(Context context, C2886o oVar) {
    }

    /* renamed from: a */
    public C2904r mo9081a() {
        return this.f28115f;
    }

    public void onCreate() {
        super.onCreate();
        SoLoader.m12778f(this, false);
        m36245b(this, mo9081a().mo9345i());
        try {
            Field declaredField = CursorWindow.class.getDeclaredField("sCursorWindowSize");
            declaredField.setAccessible(true);
            declaredField.set((Object) null, 104857600);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
