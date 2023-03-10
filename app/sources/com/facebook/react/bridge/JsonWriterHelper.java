package com.facebook.react.bridge;

import android.util.JsonWriter;
import java.util.List;
import java.util.Map;

public class JsonWriterHelper {

    /* renamed from: com.facebook.react.bridge.JsonWriterHelper$1 */
    static /* synthetic */ class C26691 {
        static final /* synthetic */ int[] $SwitchMap$com$facebook$react$bridge$ReadableType;

        /* JADX WARNING: Can't wrap try/catch for region: R(14:0|1|2|3|4|5|6|7|8|9|10|11|12|14) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x003e */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0028 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x0033 */
        static {
            /*
                com.facebook.react.bridge.ReadableType[] r0 = com.facebook.react.bridge.ReadableType.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                $SwitchMap$com$facebook$react$bridge$ReadableType = r0
                com.facebook.react.bridge.ReadableType r1 = com.facebook.react.bridge.ReadableType.Null     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = $SwitchMap$com$facebook$react$bridge$ReadableType     // Catch:{ NoSuchFieldError -> 0x001d }
                com.facebook.react.bridge.ReadableType r1 = com.facebook.react.bridge.ReadableType.Boolean     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = $SwitchMap$com$facebook$react$bridge$ReadableType     // Catch:{ NoSuchFieldError -> 0x0028 }
                com.facebook.react.bridge.ReadableType r1 = com.facebook.react.bridge.ReadableType.Number     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = $SwitchMap$com$facebook$react$bridge$ReadableType     // Catch:{ NoSuchFieldError -> 0x0033 }
                com.facebook.react.bridge.ReadableType r1 = com.facebook.react.bridge.ReadableType.String     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                int[] r0 = $SwitchMap$com$facebook$react$bridge$ReadableType     // Catch:{ NoSuchFieldError -> 0x003e }
                com.facebook.react.bridge.ReadableType r1 = com.facebook.react.bridge.ReadableType.Map     // Catch:{ NoSuchFieldError -> 0x003e }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x003e }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x003e }
            L_0x003e:
                int[] r0 = $SwitchMap$com$facebook$react$bridge$ReadableType     // Catch:{ NoSuchFieldError -> 0x0049 }
                com.facebook.react.bridge.ReadableType r1 = com.facebook.react.bridge.ReadableType.Array     // Catch:{ NoSuchFieldError -> 0x0049 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0049 }
                r2 = 6
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0049 }
            L_0x0049:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.facebook.react.bridge.JsonWriterHelper.C26691.<clinit>():void");
        }
    }

    private static void dynamicValue(JsonWriter jsonWriter, Dynamic dynamic) {
        switch (C26691.$SwitchMap$com$facebook$react$bridge$ReadableType[dynamic.getType().ordinal()]) {
            case 1:
                jsonWriter.nullValue();
                return;
            case 2:
                jsonWriter.value(dynamic.asBoolean());
                return;
            case 3:
                jsonWriter.value(dynamic.asDouble());
                return;
            case 4:
                jsonWriter.value(dynamic.asString());
                return;
            case 5:
                readableMapValue(jsonWriter, dynamic.asMap());
                return;
            case 6:
                readableArrayValue(jsonWriter, dynamic.asArray());
                return;
            default:
                throw new IllegalArgumentException("Unknown data type: " + dynamic.getType());
        }
    }

    private static void listValue(JsonWriter jsonWriter, List<?> list) {
        jsonWriter.beginArray();
        for (Object objectValue : list) {
            objectValue(jsonWriter, objectValue);
        }
        jsonWriter.endArray();
    }

    private static void mapValue(JsonWriter jsonWriter, Map<?, ?> map) {
        jsonWriter.beginObject();
        for (Map.Entry next : map.entrySet()) {
            jsonWriter.name(next.getKey().toString());
            value(jsonWriter, next.getValue());
        }
        jsonWriter.endObject();
    }

    private static void objectValue(JsonWriter jsonWriter, Object obj) {
        if (obj == null) {
            jsonWriter.nullValue();
        } else if (obj instanceof String) {
            jsonWriter.value((String) obj);
        } else if (obj instanceof Number) {
            jsonWriter.value((Number) obj);
        } else if (obj instanceof Boolean) {
            jsonWriter.value(((Boolean) obj).booleanValue());
        } else {
            throw new IllegalArgumentException("Unknown value: " + obj);
        }
    }

    public static void readableArrayValue(JsonWriter jsonWriter, ReadableArray readableArray) {
        jsonWriter.beginArray();
        int i = 0;
        while (i < readableArray.size()) {
            try {
                switch (C26691.$SwitchMap$com$facebook$react$bridge$ReadableType[readableArray.getType(i).ordinal()]) {
                    case 1:
                        jsonWriter.nullValue();
                        break;
                    case 2:
                        jsonWriter.value(readableArray.getBoolean(i));
                        break;
                    case 3:
                        jsonWriter.value(readableArray.getDouble(i));
                        break;
                    case 4:
                        jsonWriter.value(readableArray.getString(i));
                        break;
                    case 5:
                        readableMapValue(jsonWriter, readableArray.getMap(i));
                        break;
                    case 6:
                        readableArrayValue(jsonWriter, readableArray.getArray(i));
                        break;
                    default:
                        throw new IllegalArgumentException("Unknown data type: " + readableArray.getType(i));
                }
                i++;
            } finally {
                jsonWriter.endArray();
            }
        }
    }

    private static void readableMapValue(JsonWriter jsonWriter, ReadableMap readableMap) {
        jsonWriter.beginObject();
        try {
            ReadableMapKeySetIterator keySetIterator = readableMap.keySetIterator();
            while (keySetIterator.hasNextKey()) {
                String nextKey = keySetIterator.nextKey();
                jsonWriter.name(nextKey);
                switch (C26691.$SwitchMap$com$facebook$react$bridge$ReadableType[readableMap.getType(nextKey).ordinal()]) {
                    case 1:
                        jsonWriter.nullValue();
                        break;
                    case 2:
                        jsonWriter.value(readableMap.getBoolean(nextKey));
                        break;
                    case 3:
                        jsonWriter.value(readableMap.getDouble(nextKey));
                        break;
                    case 4:
                        jsonWriter.value(readableMap.getString(nextKey));
                        break;
                    case 5:
                        readableMapValue(jsonWriter, readableMap.getMap(nextKey));
                        break;
                    case 6:
                        readableArrayValue(jsonWriter, readableMap.getArray(nextKey));
                        break;
                    default:
                        throw new IllegalArgumentException("Unknown data type: " + readableMap.getType(nextKey));
                }
            }
        } finally {
            jsonWriter.endObject();
        }
    }

    public static void value(JsonWriter jsonWriter, Object obj) {
        if (obj instanceof Map) {
            mapValue(jsonWriter, (Map) obj);
        } else if (obj instanceof List) {
            listValue(jsonWriter, (List) obj);
        } else if (obj instanceof ReadableMap) {
            readableMapValue(jsonWriter, (ReadableMap) obj);
        } else if (obj instanceof ReadableArray) {
            readableArrayValue(jsonWriter, (ReadableArray) obj);
        } else if (obj instanceof Dynamic) {
            dynamicValue(jsonWriter, (Dynamic) obj);
        } else {
            objectValue(jsonWriter, obj);
        }
    }
}
