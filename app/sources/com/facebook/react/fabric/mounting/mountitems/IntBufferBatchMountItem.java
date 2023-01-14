package com.facebook.react.fabric.mounting.mountitems;

import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.fabric.C2763a;
import com.facebook.react.uimanager.C3025n0;
import okhttp3.HttpUrl;
import p174e.p247e.p253d.p258e.C6071a;
import p174e.p247e.p317m.p318a.C6410a;

@C6410a
public class IntBufferBatchMountItem {

    /* renamed from: a */
    static final String f7830a = "IntBufferBatchMountItem";

    /* renamed from: b */
    private final int f7831b;

    /* renamed from: c */
    private final int[] f7832c;

    /* renamed from: d */
    private final Object[] f7833d;

    /* renamed from: e */
    private final int f7834e;

    /* renamed from: f */
    private final int f7835f;

    /* renamed from: a */
    private static ReadableMap m11080a(Object obj) {
        if (obj != null) {
            return (ReadableMap) obj;
        }
        return null;
    }

    /* renamed from: b */
    private static C3025n0 m11081b(Object obj) {
        if (obj != null) {
            return (C3025n0) obj;
        }
        return null;
    }

    public String toString() {
        int i;
        int i2;
        String format;
        int i3;
        int i4;
        String format2;
        int i5;
        String format3;
        try {
            StringBuilder sb = new StringBuilder();
            sb.append(String.format("IntBufferBatchMountItem [surface:%d]:\n", new Object[]{Integer.valueOf(this.f7831b)}));
            int i6 = 0;
            int i7 = 0;
            while (i6 < this.f7834e) {
                int[] iArr = this.f7832c;
                int i8 = i6 + 1;
                int i9 = iArr[i6];
                int i10 = i9 & -2;
                if ((i9 & 1) != 0) {
                    i = iArr[i8];
                    i8++;
                } else {
                    i = 1;
                }
                i6 = i8;
                int i11 = 0;
                while (true) {
                    if (i11 < i) {
                        if (i10 == 2) {
                            int i12 = i6 + 1;
                            i5 = i12 + 1;
                            sb.append(String.format("CREATE [%d] - layoutable:%d - %s\n", new Object[]{Integer.valueOf(this.f7832c[i6]), Integer.valueOf(this.f7832c[i12]), C2763a.m11077a((String) this.f7833d[i7])}));
                            i7 = i7 + 1 + 3;
                        } else {
                            if (i10 == 4) {
                                i2 = i6 + 1;
                                format = String.format("DELETE [%d]\n", new Object[]{Integer.valueOf(this.f7832c[i6])});
                            } else {
                                if (i10 == 8) {
                                    int i13 = i6 + 1;
                                    int i14 = i13 + 1;
                                    i5 = i14 + 1;
                                    format3 = String.format("INSERT [%d]->[%d] @%d\n", new Object[]{Integer.valueOf(this.f7832c[i6]), Integer.valueOf(this.f7832c[i13]), Integer.valueOf(this.f7832c[i14])});
                                } else if (i10 == 16) {
                                    int i15 = i6 + 1;
                                    int i16 = i15 + 1;
                                    i5 = i16 + 1;
                                    format3 = String.format("REMOVE [%d]->[%d] @%d\n", new Object[]{Integer.valueOf(this.f7832c[i6]), Integer.valueOf(this.f7832c[i15]), Integer.valueOf(this.f7832c[i16])});
                                } else {
                                    if (i10 == 32) {
                                        i3 = i7 + 1;
                                        m11080a(this.f7833d[i7]);
                                        i4 = i6 + 1;
                                        format2 = String.format("UPDATE PROPS [%d]: %s\n", new Object[]{Integer.valueOf(this.f7832c[i6]), "<hidden>"});
                                    } else if (i10 == 64) {
                                        i3 = i7 + 1;
                                        m11081b(this.f7833d[i7]);
                                        i4 = i6 + 1;
                                        format2 = String.format("UPDATE STATE [%d]: %s\n", new Object[]{Integer.valueOf(this.f7832c[i6]), "<hidden>"});
                                    } else {
                                        if (i10 == 128) {
                                            int i17 = i6 + 1;
                                            int i18 = i17 + 1;
                                            int i19 = i18 + 1;
                                            int i20 = i19 + 1;
                                            int i21 = i20 + 1;
                                            sb.append(String.format("UPDATE LAYOUT [%d]: x:%d y:%d w:%d h:%d displayType:%d\n", new Object[]{Integer.valueOf(this.f7832c[i6]), Integer.valueOf(this.f7832c[i17]), Integer.valueOf(this.f7832c[i18]), Integer.valueOf(this.f7832c[i19]), Integer.valueOf(this.f7832c[i20]), Integer.valueOf(this.f7832c[i21])}));
                                            i6 = i21 + 1;
                                        } else if (i10 == 512) {
                                            int i22 = i6 + 1;
                                            int i23 = i22 + 1;
                                            int i24 = i23 + 1;
                                            int i25 = i24 + 1;
                                            sb.append(String.format("UPDATE PADDING [%d]: top:%d right:%d bottom:%d left:%d\n", new Object[]{Integer.valueOf(this.f7832c[i6]), Integer.valueOf(this.f7832c[i22]), Integer.valueOf(this.f7832c[i23]), Integer.valueOf(this.f7832c[i24]), Integer.valueOf(this.f7832c[i25])}));
                                            i6 = i25 + 1;
                                        } else if (i10 == 256) {
                                            i7++;
                                            i2 = i6 + 1;
                                            format = String.format("UPDATE EVENTEMITTER [%d]\n", new Object[]{Integer.valueOf(this.f7832c[i6])});
                                        } else {
                                            String str = f7830a;
                                            C6071a.m22875i(str, "String so far: " + sb.toString());
                                            throw new IllegalArgumentException("Invalid type argument to IntBufferBatchMountItem: " + i10 + " at index: " + i6);
                                        }
                                        i11++;
                                    }
                                    sb.append(format2);
                                    i7 = i3;
                                    i6 = i4;
                                    i11++;
                                }
                                sb.append(format3);
                            }
                            sb.append(format);
                            i6 = i4;
                            i11++;
                        }
                        i6 = i5;
                        i11++;
                    }
                }
            }
            return sb.toString();
        } catch (Exception e) {
            C6071a.m22876j(f7830a, "Caught exception trying to print", e);
            StringBuilder sb2 = new StringBuilder();
            for (int i26 = 0; i26 < this.f7834e; i26++) {
                sb2.append(this.f7832c[i26]);
                sb2.append(", ");
            }
            C6071a.m22875i(f7830a, sb2.toString());
            for (int i27 = 0; i27 < this.f7835f; i27++) {
                String str2 = f7830a;
                Object[] objArr = this.f7833d;
                C6071a.m22875i(str2, objArr[i27] != null ? objArr[i27].toString() : "null");
            }
            return HttpUrl.FRAGMENT_ENCODE_SET;
        }
    }
}
