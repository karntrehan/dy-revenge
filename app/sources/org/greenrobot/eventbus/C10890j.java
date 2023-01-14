package org.greenrobot.eventbus;

import java.util.ArrayList;
import java.util.List;

/* renamed from: org.greenrobot.eventbus.j */
final class C10890j {

    /* renamed from: a */
    private static final List<C10890j> f28489a = new ArrayList();

    /* renamed from: b */
    Object f28490b;

    /* renamed from: c */
    C10898q f28491c;

    /* renamed from: d */
    C10890j f28492d;

    private C10890j(Object obj, C10898q qVar) {
        this.f28490b = obj;
        this.f28491c = qVar;
    }

    /* renamed from: a */
    static C10890j m37031a(C10898q qVar, Object obj) {
        List<C10890j> list = f28489a;
        synchronized (list) {
            int size = list.size();
            if (size <= 0) {
                return new C10890j(obj, qVar);
            }
            C10890j remove = list.remove(size - 1);
            remove.f28490b = obj;
            remove.f28491c = qVar;
            remove.f28492d = null;
            return remove;
        }
    }

    /* renamed from: b */
    static void m37032b(C10890j jVar) {
        jVar.f28490b = null;
        jVar.f28491c = null;
        jVar.f28492d = null;
        List<C10890j> list = f28489a;
        synchronized (list) {
            if (list.size() < 10000) {
                list.add(jVar);
            }
        }
    }
}
