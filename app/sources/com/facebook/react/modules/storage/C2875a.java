package com.facebook.react.modules.storage;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.text.TextUtils;
import com.facebook.react.bridge.ReadableArray;
import java.util.Arrays;
import java.util.Iterator;
import org.json.JSONObject;

/* renamed from: com.facebook.react.modules.storage.a */
public class C2875a {
    /* renamed from: a */
    static String m11339a(int i) {
        String[] strArr = new String[i];
        Arrays.fill(strArr, "?");
        return "key IN (" + TextUtils.join(", ", strArr) + ")";
    }

    /* renamed from: b */
    static String[] m11340b(ReadableArray readableArray, int i, int i2) {
        String[] strArr = new String[i2];
        for (int i3 = 0; i3 < i2; i3++) {
            strArr[i3] = readableArray.getString(i + i3);
        }
        return strArr;
    }

    /* renamed from: c */
    private static void m11341c(JSONObject jSONObject, JSONObject jSONObject2) {
        Iterator<String> keys = jSONObject2.keys();
        while (keys.hasNext()) {
            String next = keys.next();
            JSONObject optJSONObject = jSONObject2.optJSONObject(next);
            JSONObject optJSONObject2 = jSONObject.optJSONObject(next);
            if (optJSONObject == null || optJSONObject2 == null) {
                jSONObject.put(next, jSONObject2.get(next));
            } else {
                m11341c(optJSONObject2, optJSONObject);
                jSONObject.put(next, optJSONObject2);
            }
        }
    }

    /* renamed from: d */
    public static String m11342d(SQLiteDatabase sQLiteDatabase, String str) {
        SQLiteDatabase sQLiteDatabase2 = sQLiteDatabase;
        Cursor query = sQLiteDatabase2.query("catalystLocalStorage", new String[]{"value"}, "key=?", new String[]{str}, (String) null, (String) null, (String) null);
        try {
            if (!query.moveToFirst()) {
                return null;
            }
            String string = query.getString(0);
            query.close();
            return string;
        } finally {
            query.close();
        }
    }

    /* renamed from: e */
    static boolean m11343e(SQLiteDatabase sQLiteDatabase, String str, String str2) {
        String d = m11342d(sQLiteDatabase, str);
        if (d != null) {
            JSONObject jSONObject = new JSONObject(d);
            m11341c(jSONObject, new JSONObject(str2));
            str2 = jSONObject.toString();
        }
        return m11344f(sQLiteDatabase, str, str2);
    }

    /* renamed from: f */
    static boolean m11344f(SQLiteDatabase sQLiteDatabase, String str, String str2) {
        ContentValues contentValues = new ContentValues();
        contentValues.put("key", str);
        contentValues.put("value", str2);
        return -1 != sQLiteDatabase.insertWithOnConflict("catalystLocalStorage", (String) null, contentValues, 5);
    }
}
