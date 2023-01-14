package com.facebook.systrace;

import android.os.Trace;

/* renamed from: com.facebook.systrace.a */
public class C3294a {

    /* renamed from: com.facebook.systrace.a$a */
    public enum C3295a {
        THREAD('t'),
        PROCESS('p'),
        GLOBAL('g');
        

        /* renamed from: r */
        private final char f9306r;

        private C3295a(char c) {
            this.f9306r = c;
        }
    }

    /* renamed from: a */
    public static void m12879a(long j, String str, int i) {
    }

    /* renamed from: b */
    public static void m12880b(long j, String str, int i, long j2) {
    }

    /* renamed from: c */
    public static void m12881c(long j, String str) {
        Trace.beginSection(str);
    }

    /* renamed from: d */
    public static void m12882d(long j, String str, int i) {
    }

    /* renamed from: e */
    public static void m12883e(long j, String str, int i) {
    }

    /* renamed from: f */
    public static void m12884f(long j, String str, int i, long j2) {
    }

    /* renamed from: g */
    public static void m12885g(long j) {
        Trace.endSection();
    }

    /* renamed from: h */
    public static boolean m12886h(long j) {
        return false;
    }

    /* renamed from: i */
    public static void m12887i(TraceListener traceListener) {
    }

    /* renamed from: j */
    public static void m12888j(long j, String str, int i) {
    }

    /* renamed from: k */
    public static void m12889k(long j, String str, int i) {
    }

    /* renamed from: l */
    public static void m12890l(long j, String str, C3295a aVar) {
    }

    /* renamed from: m */
    public static void m12891m(TraceListener traceListener) {
    }
}
