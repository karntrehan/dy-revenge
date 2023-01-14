package com.google.firebase.crashlytics.p139h.p144l;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;

/* renamed from: com.google.firebase.crashlytics.h.l.b0 */
public final class C4699b0<E> implements List<E>, RandomAccess {

    /* renamed from: f */
    private final List<E> f13244f;

    private C4699b0(List<E> list) {
        this.f13244f = Collections.unmodifiableList(list);
    }

    /* renamed from: b */
    public static <E> C4699b0<E> m17956b(List<E> list) {
        return new C4699b0<>(list);
    }

    /* renamed from: g */
    public static <E> C4699b0<E> m17957g(E... eArr) {
        return new C4699b0<>(Arrays.asList(eArr));
    }

    public void add(int i, E e) {
        this.f13244f.add(i, e);
    }

    public boolean add(E e) {
        return this.f13244f.add(e);
    }

    public boolean addAll(int i, Collection<? extends E> collection) {
        return this.f13244f.addAll(i, collection);
    }

    public boolean addAll(Collection<? extends E> collection) {
        return this.f13244f.addAll(collection);
    }

    public void clear() {
        this.f13244f.clear();
    }

    public boolean contains(Object obj) {
        return this.f13244f.contains(obj);
    }

    public boolean containsAll(Collection<?> collection) {
        return this.f13244f.containsAll(collection);
    }

    public boolean equals(Object obj) {
        return this.f13244f.equals(obj);
    }

    public E get(int i) {
        return this.f13244f.get(i);
    }

    public int hashCode() {
        return this.f13244f.hashCode();
    }

    public int indexOf(Object obj) {
        return this.f13244f.indexOf(obj);
    }

    public boolean isEmpty() {
        return this.f13244f.isEmpty();
    }

    public Iterator<E> iterator() {
        return this.f13244f.iterator();
    }

    public int lastIndexOf(Object obj) {
        return this.f13244f.lastIndexOf(obj);
    }

    public ListIterator<E> listIterator() {
        return this.f13244f.listIterator();
    }

    public ListIterator<E> listIterator(int i) {
        return this.f13244f.listIterator(i);
    }

    public E remove(int i) {
        return this.f13244f.remove(i);
    }

    public boolean remove(Object obj) {
        return this.f13244f.remove(obj);
    }

    public boolean removeAll(Collection<?> collection) {
        return this.f13244f.removeAll(collection);
    }

    public boolean retainAll(Collection<?> collection) {
        return this.f13244f.retainAll(collection);
    }

    public E set(int i, E e) {
        return this.f13244f.set(i, e);
    }

    public int size() {
        return this.f13244f.size();
    }

    public List<E> subList(int i, int i2) {
        return this.f13244f.subList(i, i2);
    }

    public Object[] toArray() {
        return this.f13244f.toArray();
    }

    public <T> T[] toArray(T[] tArr) {
        return this.f13244f.toArray(tArr);
    }
}
