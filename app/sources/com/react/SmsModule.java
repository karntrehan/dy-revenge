package com.react;

import android.app.Activity;
import android.app.PendingIntent;
import android.content.BroadcastReceiver;
import android.content.ContentResolver;
import android.content.ContentValues;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.database.Cursor;
import android.net.Uri;
import android.telephony.SmsManager;
import com.facebook.react.bridge.Callback;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.modules.core.DeviceEventManagerModule;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class SmsModule extends ReactContextBaseJavaModule {
    private static Context context;
    private Callback cb_autoSend_err = null;
    private Callback cb_autoSend_succ = null;
    Activity mActivity = null;
    /* access modifiers changed from: private */
    public ReactContext mReactContext;
    private Cursor smsCursor;
    private Map<Long, String> smsList;
    private Map<Long, Object> smsListBody;

    /* renamed from: com.react.SmsModule$a */
    class C5214a extends BroadcastReceiver {
        C5214a() {
        }

        public void onReceive(Context context, Intent intent) {
            SmsModule smsModule;
            String str;
            int resultCode = getResultCode();
            if (resultCode != -1) {
                if (resultCode == 1) {
                    smsModule = SmsModule.this;
                    str = "Generic failure";
                } else if (resultCode == 2) {
                    smsModule = SmsModule.this;
                    str = "Radio off";
                } else if (resultCode == 3) {
                    smsModule = SmsModule.this;
                    str = "Null PDU";
                } else if (resultCode == 4) {
                    smsModule = SmsModule.this;
                    str = "No service";
                } else {
                    return;
                }
                smsModule.sendCallback(str, false);
                return;
            }
            SmsModule.this.sendCallback("SMS sent", true);
        }
    }

    /* renamed from: com.react.SmsModule$b */
    class C5215b extends BroadcastReceiver {
        C5215b() {
        }

        public void onReceive(Context context, Intent intent) {
            ReactContext reactContext;
            SmsModule smsModule;
            String str;
            int resultCode = getResultCode();
            if (resultCode == -1) {
                smsModule = SmsModule.this;
                reactContext = smsModule.mReactContext;
                str = "SMS delivered";
            } else if (resultCode == 0) {
                smsModule = SmsModule.this;
                reactContext = smsModule.mReactContext;
                str = "SMS not delivered";
            } else {
                return;
            }
            smsModule.sendEvent(reactContext, "sms_onDelivery", str);
        }
    }

    public SmsModule(ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext);
        this.mReactContext = reactApplicationContext;
        this.smsList = new HashMap();
        context = reactApplicationContext.getApplicationContext();
    }

    private JSONObject getJsonFromCursor(Cursor cursor) {
        String str;
        Object string;
        JSONObject jSONObject = new JSONObject();
        int columnCount = cursor.getColumnCount();
        String[] columnNames = cursor.getColumnNames();
        int i = 0;
        while (i < columnCount) {
            try {
                int type = cursor.getType(i);
                if (type == 0) {
                    jSONObject.put(columnNames[i], (Object) null);
                } else if (type == 1) {
                    jSONObject.put(columnNames[i], cursor.getLong(i));
                } else if (type != 2) {
                    if (type == 3) {
                        str = columnNames[i];
                        string = cursor.getString(i);
                    } else if (type == 4) {
                        str = columnNames[i];
                        string = cursor.getBlob(i);
                    }
                    jSONObject.put(str, string);
                } else {
                    jSONObject.put(columnNames[i], (double) cursor.getFloat(i));
                }
                i++;
            } catch (Exception unused) {
                return null;
            }
        }
        return jSONObject;
    }

    /* access modifiers changed from: private */
    public void sendCallback(String str, boolean z) {
        Callback callback;
        Callback callback2;
        if (z && (callback2 = this.cb_autoSend_succ) != null) {
            callback2.invoke(str);
            this.cb_autoSend_succ = null;
        } else if (!z && (callback = this.cb_autoSend_err) != null) {
            callback.invoke(str);
            this.cb_autoSend_err = null;
        }
    }

    /* access modifiers changed from: private */
    public void sendEvent(ReactContext reactContext, String str, String str2) {
        ((DeviceEventManagerModule.RCTDeviceEventEmitter) reactContext.getJSModule(DeviceEventManagerModule.RCTDeviceEventEmitter.class)).emit(str, str2);
    }

    @ReactMethod
    public void autoSend(String str, String str2, Callback callback, Callback callback2) {
        this.cb_autoSend_succ = callback2;
        this.cb_autoSend_err = callback;
        try {
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = new ArrayList();
            PendingIntent broadcast = PendingIntent.getBroadcast(context, 0, new Intent("SMS_SENT"), 0);
            PendingIntent broadcast2 = PendingIntent.getBroadcast(context, 0, new Intent("SMS_DELIVERED"), 0);
            context.registerReceiver(new C5214a(), new IntentFilter("SMS_SENT"));
            context.registerReceiver(new C5215b(), new IntentFilter("SMS_DELIVERED"));
            SmsManager smsManager = SmsManager.getDefault();
            ArrayList<String> divideMessage = smsManager.divideMessage(str2);
            for (int i = 0; i < divideMessage.size(); i++) {
                arrayList.add(i, broadcast);
                arrayList2.add(i, broadcast2);
            }
            smsManager.sendMultipartTextMessage(str, (String) null, divideMessage, arrayList, arrayList2);
            ContentValues contentValues = new ContentValues();
            contentValues.put("address", str);
            contentValues.put("body", str2);
            context.getContentResolver().insert(Uri.parse("content://sms/sent"), contentValues);
        } catch (Exception e) {
            sendCallback(e.getMessage(), false);
        }
    }

    @ReactMethod
    public void delete(Integer num, Callback callback, Callback callback2) {
        try {
            ContentResolver contentResolver = context.getContentResolver();
            if (contentResolver.delete(Uri.parse("content://sms/" + num), (String) null, (String[]) null) > 0) {
                callback2.invoke("OK");
                return;
            }
            callback.invoke("SMS not found");
        } catch (Exception e) {
            callback.invoke(e.getMessage());
        }
    }

    public String getName() {
        return "Sms";
    }

    /* JADX WARNING: Code restructure failed: missing block: B:62:0x0100, code lost:
        if (r13 == r0.getInt(r0.getColumnIndex("_id"))) goto L_0x0102;
     */
    /* JADX WARNING: Removed duplicated region for block: B:105:0x01c5 A[Catch:{ JSONException -> 0x0233 }] */
    /* JADX WARNING: Removed duplicated region for block: B:112:0x01d8  */
    /* JADX WARNING: Removed duplicated region for block: B:121:0x01f0 A[Catch:{ JSONException -> 0x0231 }] */
    /* JADX WARNING: Removed duplicated region for block: B:93:0x01a5  */
    /* JADX WARNING: Removed duplicated region for block: B:94:0x01a7  */
    /* JADX WARNING: Removed duplicated region for block: B:97:0x01b0  */
    @com.facebook.react.bridge.ReactMethod
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void list(java.lang.String r32, com.facebook.react.bridge.Callback r33, com.facebook.react.bridge.Callback r34) {
        /*
            r31 = this;
            r1 = r33
            java.lang.String r0 = "minDate"
            java.lang.String r2 = "maxDate"
            java.lang.String r3 = "sortOrder"
            java.lang.String r4 = "selection"
            java.lang.String r5 = "maxCount"
            java.lang.String r6 = "indexFrom"
            java.lang.String r7 = "address"
            java.lang.String r8 = "box"
            java.lang.String r9 = "body"
            java.lang.String r10 = "thread_id"
            java.lang.String r11 = "_id"
            java.lang.String r12 = "read"
            org.json.JSONObject r15 = new org.json.JSONObject     // Catch:{ JSONException -> 0x0239 }
            r14 = r32
            r15.<init>(r14)     // Catch:{ JSONException -> 0x0239 }
            boolean r14 = r15.has(r8)     // Catch:{ JSONException -> 0x0239 }
            if (r14 == 0) goto L_0x0033
            java.lang.String r8 = r15.optString(r8)     // Catch:{ JSONException -> 0x002c }
            goto L_0x0035
        L_0x002c:
            r0 = move-exception
            r2 = r1
            r3 = 1
            r1 = r31
            goto L_0x023e
        L_0x0033:
            java.lang.String r8 = "inbox"
        L_0x0035:
            boolean r14 = r15.has(r12)     // Catch:{ JSONException -> 0x0239 }
            if (r14 == 0) goto L_0x0040
            int r14 = r15.optInt(r12)     // Catch:{ JSONException -> 0x002c }
            goto L_0x0041
        L_0x0040:
            r14 = -1
        L_0x0041:
            boolean r16 = r15.has(r11)     // Catch:{ JSONException -> 0x0239 }
            if (r16 == 0) goto L_0x004e
            int r16 = r15.optInt(r11)     // Catch:{ JSONException -> 0x002c }
            r13 = r16
            goto L_0x004f
        L_0x004e:
            r13 = -1
        L_0x004f:
            boolean r16 = r15.has(r10)     // Catch:{ JSONException -> 0x0239 }
            if (r16 == 0) goto L_0x005c
            int r16 = r15.optInt(r10)     // Catch:{ JSONException -> 0x002c }
            r1 = r16
            goto L_0x005d
        L_0x005c:
            r1 = -1
        L_0x005d:
            r16 = r12
            java.lang.String r12 = r15.optString(r7)     // Catch:{ JSONException -> 0x0233 }
            r17 = r7
            java.lang.String r7 = r15.optString(r9)     // Catch:{ JSONException -> 0x0233 }
            r18 = r9
            java.lang.String r9 = "bodyRegex"
            java.lang.String r9 = r15.optString(r9)     // Catch:{ JSONException -> 0x0233 }
            boolean r19 = r15.has(r6)     // Catch:{ JSONException -> 0x0233 }
            if (r19 == 0) goto L_0x007c
            int r6 = r15.optInt(r6)     // Catch:{ JSONException -> 0x0233 }
            goto L_0x007d
        L_0x007c:
            r6 = 0
        L_0x007d:
            boolean r19 = r15.has(r5)     // Catch:{ JSONException -> 0x0233 }
            if (r19 == 0) goto L_0x0088
            int r5 = r15.optInt(r5)     // Catch:{ JSONException -> 0x0233 }
            goto L_0x0089
        L_0x0088:
            r5 = -1
        L_0x0089:
            boolean r19 = r15.has(r4)     // Catch:{ JSONException -> 0x0233 }
            if (r19 == 0) goto L_0x0094
            java.lang.String r4 = r15.optString(r4)     // Catch:{ JSONException -> 0x0233 }
            goto L_0x0096
        L_0x0094:
            java.lang.String r4 = ""
        L_0x0096:
            r22 = r4
            boolean r4 = r15.has(r3)     // Catch:{ JSONException -> 0x0233 }
            if (r4 == 0) goto L_0x00a3
            java.lang.String r3 = r15.optString(r3)     // Catch:{ JSONException -> 0x0233 }
            goto L_0x00a4
        L_0x00a3:
            r3 = 0
        L_0x00a4:
            r24 = r3
            boolean r3 = r15.has(r2)     // Catch:{ JSONException -> 0x0233 }
            r25 = -1
            if (r3 == 0) goto L_0x00b3
            long r2 = r15.optLong(r2)     // Catch:{ JSONException -> 0x0233 }
            goto L_0x00b5
        L_0x00b3:
            r2 = r25
        L_0x00b5:
            boolean r4 = r15.has(r0)     // Catch:{ JSONException -> 0x0233 }
            if (r4 == 0) goto L_0x00c2
            long r19 = r15.optLong(r0)     // Catch:{ JSONException -> 0x0233 }
            r27 = r19
            goto L_0x00c4
        L_0x00c2:
            r27 = r25
        L_0x00c4:
            android.content.Context r0 = context     // Catch:{ JSONException -> 0x0233 }
            android.content.ContentResolver r19 = r0.getContentResolver()     // Catch:{ JSONException -> 0x0233 }
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ JSONException -> 0x0233 }
            r0.<init>()     // Catch:{ JSONException -> 0x0233 }
            java.lang.String r4 = "content://sms/"
            r0.append(r4)     // Catch:{ JSONException -> 0x0233 }
            r0.append(r8)     // Catch:{ JSONException -> 0x0233 }
            java.lang.String r0 = r0.toString()     // Catch:{ JSONException -> 0x0233 }
            android.net.Uri r20 = android.net.Uri.parse(r0)     // Catch:{ JSONException -> 0x0233 }
            r21 = 0
            r23 = 0
            android.database.Cursor r0 = r19.query(r20, r21, r22, r23, r24)     // Catch:{ JSONException -> 0x0233 }
            org.json.JSONArray r4 = new org.json.JSONArray     // Catch:{ JSONException -> 0x0233 }
            r4.<init>()     // Catch:{ JSONException -> 0x0233 }
            r8 = 0
        L_0x00ed:
            if (r0 == 0) goto L_0x0202
            boolean r15 = r0.moveToNext()     // Catch:{ JSONException -> 0x0233 }
            if (r15 == 0) goto L_0x0202
            r15 = -1
            if (r13 <= r15) goto L_0x0116
            int r15 = r0.getColumnIndex(r11)     // Catch:{ JSONException -> 0x0233 }
            int r15 = r0.getInt(r15)     // Catch:{ JSONException -> 0x0233 }
            if (r13 != r15) goto L_0x0104
        L_0x0102:
            r15 = 1
            goto L_0x0105
        L_0x0104:
            r15 = 0
        L_0x0105:
            r29 = r16
            r16 = r1
            r1 = r15
            r15 = r29
            r30 = r17
            r17 = r10
            r10 = r18
            r18 = r30
            goto L_0x018d
        L_0x0116:
            if (r1 <= r15) goto L_0x0123
            int r15 = r0.getColumnIndex(r10)     // Catch:{ JSONException -> 0x0233 }
            int r15 = r0.getInt(r15)     // Catch:{ JSONException -> 0x0233 }
            if (r1 != r15) goto L_0x0104
            goto L_0x0102
        L_0x0123:
            if (r14 <= r15) goto L_0x013f
            r15 = r16
            r16 = r1
            int r1 = r0.getColumnIndex(r15)     // Catch:{ JSONException -> 0x0233 }
            int r1 = r0.getInt(r1)     // Catch:{ JSONException -> 0x0233 }
            if (r14 != r1) goto L_0x0135
            r1 = 1
            goto L_0x0136
        L_0x0135:
            r1 = 0
        L_0x0136:
            r29 = r17
            r17 = r10
            r10 = r18
            r18 = r29
            goto L_0x018d
        L_0x013f:
            r15 = r16
            r16 = r1
            if (r12 == 0) goto L_0x0167
            boolean r1 = r12.isEmpty()     // Catch:{ JSONException -> 0x0233 }
            if (r1 != 0) goto L_0x0167
            r1 = r17
            r17 = r10
            int r10 = r0.getColumnIndex(r1)     // Catch:{ JSONException -> 0x0233 }
            java.lang.String r10 = r0.getString(r10)     // Catch:{ JSONException -> 0x0233 }
            java.lang.String r10 = r10.trim()     // Catch:{ JSONException -> 0x0233 }
            boolean r10 = r12.equals(r10)     // Catch:{ JSONException -> 0x0233 }
            r29 = r18
            r18 = r1
            r1 = r10
            r10 = r29
            goto L_0x018d
        L_0x0167:
            r1 = r17
            r17 = r10
            if (r7 == 0) goto L_0x0188
            boolean r10 = r7.isEmpty()     // Catch:{ JSONException -> 0x0233 }
            if (r10 != 0) goto L_0x0188
            r10 = r18
            r18 = r1
            int r1 = r0.getColumnIndex(r10)     // Catch:{ JSONException -> 0x0233 }
            java.lang.String r1 = r0.getString(r1)     // Catch:{ JSONException -> 0x0233 }
            java.lang.String r1 = r1.trim()     // Catch:{ JSONException -> 0x0233 }
            boolean r1 = r7.equals(r1)     // Catch:{ JSONException -> 0x0233 }
            goto L_0x018d
        L_0x0188:
            r10 = r18
            r18 = r1
            r1 = 1
        L_0x018d:
            if (r9 == 0) goto L_0x01a8
            boolean r19 = r9.isEmpty()     // Catch:{ JSONException -> 0x0233 }
            if (r19 != 0) goto L_0x01a8
            if (r1 == 0) goto L_0x01a7
            int r1 = r0.getColumnIndex(r10)     // Catch:{ JSONException -> 0x0233 }
            java.lang.String r1 = r0.getString(r1)     // Catch:{ JSONException -> 0x0233 }
            boolean r1 = r1.matches(r9)     // Catch:{ JSONException -> 0x0233 }
            if (r1 == 0) goto L_0x01a7
            r1 = 1
            goto L_0x01a8
        L_0x01a7:
            r1 = 0
        L_0x01a8:
            r19 = r7
            java.lang.String r7 = "date"
            int r20 = (r2 > r25 ? 1 : (r2 == r25 ? 0 : -1))
            if (r20 <= 0) goto L_0x01c1
            if (r1 == 0) goto L_0x01c0
            int r1 = r0.getColumnIndex(r7)     // Catch:{ JSONException -> 0x0233 }
            long r20 = r0.getLong(r1)     // Catch:{ JSONException -> 0x0233 }
            int r1 = (r2 > r20 ? 1 : (r2 == r20 ? 0 : -1))
            if (r1 < 0) goto L_0x01c0
            r1 = 1
            goto L_0x01c1
        L_0x01c0:
            r1 = 0
        L_0x01c1:
            int r20 = (r27 > r25 ? 1 : (r27 == r25 ? 0 : -1))
            if (r20 <= 0) goto L_0x01d6
            if (r1 == 0) goto L_0x01d5
            int r1 = r0.getColumnIndex(r7)     // Catch:{ JSONException -> 0x0233 }
            long r20 = r0.getLong(r1)     // Catch:{ JSONException -> 0x0233 }
            int r1 = (r27 > r20 ? 1 : (r27 == r20 ? 0 : -1))
            if (r1 > 0) goto L_0x01d5
            r1 = 1
            goto L_0x01d6
        L_0x01d5:
            r1 = 0
        L_0x01d6:
            if (r1 == 0) goto L_0x01f0
            if (r8 < r6) goto L_0x01eb
            if (r5 <= 0) goto L_0x01e1
            int r1 = r6 + r5
            if (r8 < r1) goto L_0x01e1
            goto L_0x0202
        L_0x01e1:
            r1 = r31
            org.json.JSONObject r7 = r1.getJsonFromCursor(r0)     // Catch:{ JSONException -> 0x0231 }
            r4.put(r7)     // Catch:{ JSONException -> 0x0231 }
            goto L_0x01ed
        L_0x01eb:
            r1 = r31
        L_0x01ed:
            int r8 = r8 + 1
            goto L_0x01f2
        L_0x01f0:
            r1 = r31
        L_0x01f2:
            r1 = r16
            r7 = r19
            r16 = r15
            r29 = r18
            r18 = r10
            r10 = r17
            r17 = r29
            goto L_0x00ed
        L_0x0202:
            r1 = r31
            r0.close()     // Catch:{ JSONException -> 0x0231 }
            r0 = 2
            java.lang.Object[] r0 = new java.lang.Object[r0]     // Catch:{ Exception -> 0x021e }
            java.lang.Integer r2 = java.lang.Integer.valueOf(r8)     // Catch:{ Exception -> 0x021e }
            r3 = 0
            r0[r3] = r2     // Catch:{ Exception -> 0x021e }
            java.lang.String r2 = r4.toString()     // Catch:{ Exception -> 0x021e }
            r3 = 1
            r0[r3] = r2     // Catch:{ Exception -> 0x021e }
            r2 = r34
            r2.invoke(r0)     // Catch:{ Exception -> 0x021e }
            goto L_0x022e
        L_0x021e:
            r0 = move-exception
            r2 = 1
            java.lang.Object[] r3 = new java.lang.Object[r2]     // Catch:{ JSONException -> 0x0231 }
            java.lang.String r0 = r0.getMessage()     // Catch:{ JSONException -> 0x0231 }
            r2 = 0
            r3[r2] = r0     // Catch:{ JSONException -> 0x0231 }
            r2 = r33
            r2.invoke(r3)     // Catch:{ JSONException -> 0x022f }
        L_0x022e:
            return
        L_0x022f:
            r0 = move-exception
            goto L_0x023d
        L_0x0231:
            r0 = move-exception
            goto L_0x0236
        L_0x0233:
            r0 = move-exception
            r1 = r31
        L_0x0236:
            r2 = r33
            goto L_0x023d
        L_0x0239:
            r0 = move-exception
            r2 = r1
            r1 = r31
        L_0x023d:
            r3 = 1
        L_0x023e:
            java.lang.Object[] r3 = new java.lang.Object[r3]
            java.lang.String r0 = r0.getMessage()
            r4 = 0
            r3[r4] = r0
            r2.invoke(r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.react.SmsModule.list(java.lang.String, com.facebook.react.bridge.Callback, com.facebook.react.bridge.Callback):void");
    }

    @ReactMethod
    public void send(String str, String str2, Callback callback, Callback callback2) {
        this.mActivity = getCurrentActivity();
        try {
            JSONArray jSONArray = new JSONObject(str).getJSONArray("addressList");
            int length = jSONArray.length();
            if (length > 0) {
                PendingIntent broadcast = PendingIntent.getBroadcast(this.mActivity, 0, new Intent("SENDING_SMS"), 0);
                SmsManager smsManager = SmsManager.getDefault();
                for (int i = 0; i < length; i++) {
                    String optString = jSONArray.optString(i);
                    if (optString.length() > 0) {
                        smsManager.sendTextMessage(optString, (String) null, str2, broadcast, (PendingIntent) null);
                    }
                }
                return;
            }
            PendingIntent activity = PendingIntent.getActivity(this.mActivity, 0, new Intent("android.intent.action.VIEW"), 0);
            Intent intent = new Intent("android.intent.action.VIEW");
            intent.putExtra("sms_body", str2);
            intent.setData(Uri.parse("sms:"));
            try {
                activity.send(this.mActivity.getApplicationContext(), 0, intent);
                callback2.invoke("OK");
            } catch (PendingIntent.CanceledException e) {
                callback.invoke(e.getMessage());
            }
        } catch (JSONException e2) {
            callback.invoke(e2.getMessage());
        }
    }
}
