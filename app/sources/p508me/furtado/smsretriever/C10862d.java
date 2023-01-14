package p508me.furtado.smsretriever;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.WritableNativeMap;
import com.facebook.react.modules.core.DeviceEventManagerModule;
import com.google.android.gms.common.api.Status;

/* renamed from: me.furtado.smsretriever.d */
public final class C10862d extends BroadcastReceiver {

    /* renamed from: a */
    private ReactApplicationContext f28422a;

    public C10862d(ReactApplicationContext reactApplicationContext) {
        this.f28422a = reactApplicationContext;
    }

    /* renamed from: a */
    private void m36968a(String str, String str2) {
        ReactApplicationContext reactApplicationContext = this.f28422a;
        if (reactApplicationContext != null && reactApplicationContext.hasActiveCatalystInstance()) {
            WritableNativeMap writableNativeMap = new WritableNativeMap();
            writableNativeMap.putString(str, str2);
            ((DeviceEventManagerModule.RCTDeviceEventEmitter) this.f28422a.getJSModule(DeviceEventManagerModule.RCTDeviceEventEmitter.class)).emit("me.furtado.smsretriever:SmsEvent", writableNativeMap);
        }
    }

    public void onReceive(Context context, Intent intent) {
        String str;
        String str2;
        if ("com.google.android.gms.auth.api.phone.SMS_RETRIEVED".equals(intent.getAction())) {
            Bundle extras = intent.getExtras();
            if (extras == null) {
                str = "extras";
                str2 = "Extras is null.";
            } else {
                Status status = (Status) extras.get("com.google.android.gms.auth.api.phone.EXTRA_STATUS");
                if (status == null) {
                    str = "status";
                    str2 = "Status is null.";
                } else {
                    int p = status.mo11172p();
                    if (p == 0) {
                        m36968a("message", (String) extras.get("com.google.android.gms.auth.api.phone.EXTRA_SMS_MESSAGE"));
                        return;
                    } else if (p == 15) {
                        m36968a("timeout", "Timeout error.");
                        return;
                    } else {
                        return;
                    }
                }
            }
            m36968a(str, str2);
        }
    }
}
