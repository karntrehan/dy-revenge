package com.facebook.react.p115e0;

import android.view.View;
import com.facebook.react.p115e0.C2745m;
import com.facebook.react.uimanager.C2918a;
import com.facebook.react.uimanager.C2922b;

/* renamed from: com.facebook.react.e0.l */
public class C2744l<T extends View, U extends C2922b<T> & C2745m<T>> extends C2918a<T, U> {
    public C2744l(U u) {
        super(u);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v0, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v1, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v2, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v3, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v5, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v7, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v9, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v11, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v12, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v13, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v14, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v15, resolved type: boolean} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo8908b(T r4, java.lang.String r5, java.lang.Object r6) {
        /*
            r3 = this;
            r5.hashCode()
            int r0 = r5.hashCode()
            r1 = 0
            r2 = -1
            switch(r0) {
                case -2143114526: goto L_0x0044;
                case -1609594047: goto L_0x0039;
                case -775297261: goto L_0x002e;
                case 1686617758: goto L_0x0023;
                case 1825644485: goto L_0x0018;
                case 1984457027: goto L_0x000d;
                default: goto L_0x000c;
            }
        L_0x000c:
            goto L_0x004e
        L_0x000d:
            java.lang.String r0 = "foreground"
            boolean r0 = r5.equals(r0)
            if (r0 != 0) goto L_0x0016
            goto L_0x004e
        L_0x0016:
            r2 = 5
            goto L_0x004e
        L_0x0018:
            java.lang.String r0 = "borderless"
            boolean r0 = r5.equals(r0)
            if (r0 != 0) goto L_0x0021
            goto L_0x004e
        L_0x0021:
            r2 = 4
            goto L_0x004e
        L_0x0023:
            java.lang.String r0 = "exclusive"
            boolean r0 = r5.equals(r0)
            if (r0 != 0) goto L_0x002c
            goto L_0x004e
        L_0x002c:
            r2 = 3
            goto L_0x004e
        L_0x002e:
            java.lang.String r0 = "rippleColor"
            boolean r0 = r5.equals(r0)
            if (r0 != 0) goto L_0x0037
            goto L_0x004e
        L_0x0037:
            r2 = 2
            goto L_0x004e
        L_0x0039:
            java.lang.String r0 = "enabled"
            boolean r0 = r5.equals(r0)
            if (r0 != 0) goto L_0x0042
            goto L_0x004e
        L_0x0042:
            r2 = 1
            goto L_0x004e
        L_0x0044:
            java.lang.String r0 = "rippleRadius"
            boolean r0 = r5.equals(r0)
            if (r0 != 0) goto L_0x004d
            goto L_0x004e
        L_0x004d:
            r2 = 0
        L_0x004e:
            switch(r2) {
                case 0: goto L_0x00aa;
                case 1: goto L_0x0099;
                case 2: goto L_0x0089;
                case 3: goto L_0x0078;
                case 4: goto L_0x0067;
                case 5: goto L_0x0056;
                default: goto L_0x0051;
            }
        L_0x0051:
            super.mo8908b(r4, r5, r6)
            goto L_0x00ba
        L_0x0056:
            U r5 = r3.f8197a
            com.facebook.react.e0.m r5 = (com.facebook.react.p115e0.C2745m) r5
            if (r6 != 0) goto L_0x005d
            goto L_0x0063
        L_0x005d:
            java.lang.Boolean r6 = (java.lang.Boolean) r6
            boolean r1 = r6.booleanValue()
        L_0x0063:
            r5.setForeground(r4, r1)
            goto L_0x00ba
        L_0x0067:
            U r5 = r3.f8197a
            com.facebook.react.e0.m r5 = (com.facebook.react.p115e0.C2745m) r5
            if (r6 != 0) goto L_0x006e
            goto L_0x0074
        L_0x006e:
            java.lang.Boolean r6 = (java.lang.Boolean) r6
            boolean r1 = r6.booleanValue()
        L_0x0074:
            r5.setBorderless(r4, r1)
            goto L_0x00ba
        L_0x0078:
            U r5 = r3.f8197a
            com.facebook.react.e0.m r5 = (com.facebook.react.p115e0.C2745m) r5
            if (r6 != 0) goto L_0x007f
            goto L_0x0085
        L_0x007f:
            java.lang.Boolean r6 = (java.lang.Boolean) r6
            boolean r1 = r6.booleanValue()
        L_0x0085:
            r5.setExclusive(r4, r1)
            goto L_0x00ba
        L_0x0089:
            U r5 = r3.f8197a
            com.facebook.react.e0.m r5 = (com.facebook.react.p115e0.C2745m) r5
            android.content.Context r0 = r4.getContext()
            java.lang.Integer r6 = com.facebook.react.bridge.ColorPropConverter.getColor(r6, r0)
            r5.setRippleColor(r4, r6)
            goto L_0x00ba
        L_0x0099:
            U r5 = r3.f8197a
            com.facebook.react.e0.m r5 = (com.facebook.react.p115e0.C2745m) r5
            if (r6 != 0) goto L_0x00a0
            goto L_0x00a6
        L_0x00a0:
            java.lang.Boolean r6 = (java.lang.Boolean) r6
            boolean r1 = r6.booleanValue()
        L_0x00a6:
            r5.setEnabled(r4, r1)
            goto L_0x00ba
        L_0x00aa:
            U r5 = r3.f8197a
            com.facebook.react.e0.m r5 = (com.facebook.react.p115e0.C2745m) r5
            if (r6 != 0) goto L_0x00b1
            goto L_0x00b7
        L_0x00b1:
            java.lang.Double r6 = (java.lang.Double) r6
            int r1 = r6.intValue()
        L_0x00b7:
            r5.setRippleRadius(r4, r1)
        L_0x00ba:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.react.p115e0.C2744l.mo8908b(android.view.View, java.lang.String, java.lang.Object):void");
    }
}
