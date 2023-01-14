package com.reactnativeotpautofill;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.widget.EditText;
import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class OtpBroadcastReceiver extends BroadcastReceiver {

    /* renamed from: a */
    private static EditText f14964a;

    /* renamed from: a */
    public void mo16114a(EditText editText) {
        f14964a = editText;
    }

    public void onReceive(Context context, Intent intent) {
        Bundle extras;
        if ("com.google.android.gms.auth.api.phone.SMS_RETRIEVED".equals(intent.getAction()) && (extras = intent.getExtras()) != null) {
            Matcher matcher = Pattern.compile("\\d+").matcher(extras.getString("com.google.android.gms.auth.api.phone.EXTRA_SMS_MESSAGE"));
            ArrayList arrayList = new ArrayList();
            while (matcher.find()) {
                arrayList.add(matcher.group());
            }
            if (arrayList.size() > 0) {
                f14964a.setText((CharSequence) arrayList.get(0));
            }
        }
    }
}
