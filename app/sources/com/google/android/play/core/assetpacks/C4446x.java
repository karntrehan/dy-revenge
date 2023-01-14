package com.google.android.play.core.assetpacks;

import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.io.SequenceInputStream;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.NavigableMap;
import java.util.TreeMap;
import p174e.p319f.p320a.p382e.p383a.p385b.C9133q;

/* renamed from: com.google.android.play.core.assetpacks.x */
final class C4446x extends C9133q {

    /* renamed from: f */
    private final File f12695f;

    /* renamed from: o */
    private final File f12696o;

    /* renamed from: p */
    private final NavigableMap<Long, File> f12697p = new TreeMap();

    C4446x(File file, File file2) {
        this.f12695f = file;
        this.f12696o = file2;
        List<File> a = C4358a2.m16776a(file, file2);
        if (!a.isEmpty()) {
            long j = 0;
            for (File next : a) {
                this.f12697p.put(Long.valueOf(j), next);
                j += next.length();
            }
            return;
        }
        throw new C4396k0(String.format("Virtualized slice archive empty for %s, %s", new Object[]{file, file2}));
    }

    /* renamed from: o */
    private final InputStream m16996o(long j, Long l) {
        FileInputStream fileInputStream = new FileInputStream((File) this.f12697p.get(l));
        if (fileInputStream.skip(j - l.longValue()) == j - l.longValue()) {
            return fileInputStream;
        }
        throw new C4396k0(String.format("Virtualized slice archive corrupt, could not skip in file with key %s", new Object[]{l}));
    }

    /* renamed from: a */
    public final long mo13950a() {
        Map.Entry<Long, File> lastEntry = this.f12697p.lastEntry();
        return lastEntry.getKey().longValue() + lastEntry.getValue().length();
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final InputStream mo13951b(long j, long j2) {
        if (j < 0 || j2 < 0) {
            throw new C4396k0(String.format("Invalid input parameters %s, %s", new Object[]{Long.valueOf(j), Long.valueOf(j2)}));
        }
        long j3 = j + j2;
        if (j3 <= mo13950a()) {
            Long floorKey = this.f12697p.floorKey(Long.valueOf(j));
            Long floorKey2 = this.f12697p.floorKey(Long.valueOf(j3));
            if (floorKey.equals(floorKey2)) {
                return new C4443w(m16996o(j, floorKey), j2);
            }
            ArrayList arrayList = new ArrayList();
            arrayList.add(m16996o(j, floorKey));
            Collection values = this.f12697p.subMap(floorKey, false, floorKey2, false).values();
            if (!values.isEmpty()) {
                arrayList.add(new C4397k1(Collections.enumeration(values)));
            }
            arrayList.add(new C4443w(new FileInputStream((File) this.f12697p.get(floorKey2)), j2 - (floorKey2.longValue() - j)));
            return new SequenceInputStream(Collections.enumeration(arrayList));
        }
        throw new C4396k0(String.format("Trying to access archive out of bounds. Archive ends at: %s. Tried accessing: %s", new Object[]{Long.valueOf(mo13950a()), Long.valueOf(j3)}));
    }

    public final void close() {
    }
}
