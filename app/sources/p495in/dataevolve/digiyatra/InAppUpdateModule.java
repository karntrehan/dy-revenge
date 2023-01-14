package p495in.dataevolve.digiyatra;

import android.app.Activity;
import android.content.Intent;
import android.content.IntentSender;
import android.view.View;
import com.facebook.react.bridge.ActivityEventListener;
import com.facebook.react.bridge.BaseActivityEventListener;
import com.facebook.react.bridge.LifecycleEventListener;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.google.android.material.snackbar.Snackbar;
import com.google.android.play.core.install.C4462b;
import com.google.android.play.core.install.InstallState;
import java.io.PrintStream;
import java.util.Objects;
import p174e.p319f.p320a.p382e.p383a.p384a.C9074a;
import p174e.p319f.p320a.p382e.p383a.p384a.C9075b;
import p174e.p319f.p320a.p382e.p383a.p384a.C9076c;

/* renamed from: in.dataevolve.digiyatra.InAppUpdateModule */
public class InAppUpdateModule extends ReactContextBaseJavaModule implements C4462b, LifecycleEventListener {
    private static final int MY_REQUEST_CODE = 0;
    private static final int STALE_DAYS = 5;
    private static ReactApplicationContext reactContext;
    private C9075b appUpdateManager;
    private final ActivityEventListener mActivityEventListener;

    /* renamed from: in.dataevolve.digiyatra.InAppUpdateModule$a */
    class C10642a extends BaseActivityEventListener {
        C10642a() {
        }

        public void onActivityResult(Activity activity, int i, int i2, Intent intent) {
            if (i == 0 && i2 != -1) {
                PrintStream printStream = System.out;
                printStream.println("Update flow failed! Result code: " + i2);
            }
        }
    }

    InAppUpdateModule(ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext);
        C10642a aVar = new C10642a();
        this.mActivityEventListener = aVar;
        reactContext = reactApplicationContext;
        reactApplicationContext.addActivityEventListener(aVar);
        reactContext.addLifecycleEventListener(this);
    }

    /* access modifiers changed from: private */
    /* renamed from: lambda$checkUpdate$0 */
    public /* synthetic */ void mo26494a(C9074a aVar) {
        if (aVar.mo23051r() == 2 && aVar.mo23040f() != null && aVar.mo23040f().intValue() > 5 && aVar.mo23047n(1)) {
            try {
                this.appUpdateManager.mo23056d(aVar, 1, reactContext.getCurrentActivity(), 0);
            } catch (IntentSender.SendIntentException e) {
                e.printStackTrace();
            }
        } else if (aVar.mo23051r() == 2 && aVar.mo23047n(0)) {
            this.appUpdateManager.mo23056d(aVar, 0, reactContext.getCurrentActivity(), 0);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: lambda$onHostResume$2 */
    public /* synthetic */ void mo26495b(C9074a aVar) {
        if (aVar.mo23046m() == 11) {
            popupSnackbarForCompleteUpdate();
        }
        if (aVar.mo23051r() == 3) {
            try {
                this.appUpdateManager.mo23056d(aVar, 1, reactContext.getCurrentActivity(), 0);
            } catch (IntentSender.SendIntentException e) {
                e.printStackTrace();
            }
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: lambda$popupSnackbarForCompleteUpdate$1 */
    public /* synthetic */ void mo26496c(View view) {
        this.appUpdateManager.mo23053a();
    }

    private void popupSnackbarForCompleteUpdate() {
        Activity currentActivity = reactContext.getCurrentActivity();
        Objects.requireNonNull(currentActivity);
        Snackbar X = Snackbar.m16502X(currentActivity.findViewById(16908290).getRootView(), "An update has just been downloaded.", -2);
        X.mo13565Y("RESTART", new C10645b(this));
        X.mo13566Z(-16711936);
        X.mo13523N();
    }

    @ReactMethod
    public void checkUpdate() {
        C9075b a = C9076c.m30256a(reactContext);
        this.appUpdateManager = a;
        a.mo23055c(this);
        this.appUpdateManager.mo23054b().mo23128c(new C10646c(this));
    }

    public String getName() {
        return "InAppUpdate";
    }

    public void onHostDestroy() {
        C9075b bVar = this.appUpdateManager;
        if (bVar != null) {
            bVar.mo23057e(this);
        }
    }

    public void onHostPause() {
    }

    public void onHostResume() {
        C9075b bVar = this.appUpdateManager;
        if (bVar != null) {
            bVar.mo23054b().mo23128c(new C10644a(this));
        }
    }

    public void onStateUpdate(InstallState installState) {
        if (installState.mo13988d() == 11) {
            popupSnackbarForCompleteUpdate();
        }
    }
}
