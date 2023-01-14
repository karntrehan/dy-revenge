package com.swmansion.reanimated.nodes;

import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.UiThreadUtil;
import com.swmansion.reanimated.C9911d;
import com.swmansion.reanimated.C9920g;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.Stack;
import okhttp3.HttpUrl;

/* renamed from: com.swmansion.reanimated.nodes.m */
public abstract class C9965m {
    public static final Double ONE = Double.valueOf(1.0d);
    public static final Double ZERO = Double.valueOf(0.0d);
    private List<C9965m> mChildren;
    private final Map<String, Long> mLastLoopID;
    private final Map<String, Object> mMemoizedValue = new HashMap();
    protected final int mNodeID;
    protected final C9911d mNodesManager;
    protected final C9920g mUpdateContext;

    public C9965m(int i, ReadableMap readableMap, C9911d dVar) {
        HashMap hashMap = new HashMap();
        this.mLastLoopID = hashMap;
        hashMap.put(HttpUrl.FRAGMENT_ENCODE_SET, -1L);
        this.mNodeID = i;
        this.mNodesManager = dVar;
        this.mUpdateContext = dVar.f26524s;
    }

    private static void findAndUpdateNodes(C9965m mVar, Set<C9965m> set, Stack<C9962j> stack) {
        if (!set.contains(mVar)) {
            set.add(mVar);
            List<C9965m> list = mVar.mChildren;
            if (list != null) {
                for (C9965m findAndUpdateNodes : list) {
                    findAndUpdateNodes(findAndUpdateNodes, set, stack);
                }
            }
            if (mVar instanceof C9962j) {
                stack.push((C9962j) mVar);
            }
        }
    }

    public static void runUpdates(C9920g gVar) {
        UiThreadUtil.assertOnUiThread();
        ArrayList<C9965m> arrayList = gVar.f26543c;
        HashSet hashSet = new HashSet();
        Stack stack = new Stack();
        for (int i = 0; i < arrayList.size(); i++) {
            findAndUpdateNodes(arrayList.get(i), hashSet, stack);
            if (i == arrayList.size() - 1) {
                while (!stack.isEmpty()) {
                    ((C9962j) stack.pop()).mo24854a();
                }
            }
        }
        arrayList.clear();
        gVar.f26541a++;
    }

    public void addChild(C9965m mVar) {
        if (this.mChildren == null) {
            this.mChildren = new ArrayList();
        }
        this.mChildren.add(mVar);
        mVar.dangerouslyRescheduleEvaluate();
    }

    /* access modifiers changed from: protected */
    public final void dangerouslyRescheduleEvaluate() {
        this.mLastLoopID.put(this.mUpdateContext.f26542b, -1L);
        markUpdated();
    }

    public final Double doubleValue() {
        Object value = value();
        if (value == null) {
            return ZERO;
        }
        if (value instanceof Double) {
            return (Double) value;
        }
        if (value instanceof Number) {
            return Double.valueOf(((Number) value).doubleValue());
        }
        if (value instanceof Boolean) {
            return ((Boolean) value).booleanValue() ? ONE : ZERO;
        }
        throw new IllegalStateException("Value of node " + this + " cannot be cast to a number");
    }

    /* access modifiers changed from: protected */
    public abstract Object evaluate();

    /* access modifiers changed from: protected */
    public final void forceUpdateMemoizedValue(Object obj) {
        this.mMemoizedValue.put(this.mUpdateContext.f26542b, obj);
        markUpdated();
    }

    /* access modifiers changed from: protected */
    public void markUpdated() {
        UiThreadUtil.assertOnUiThread();
        this.mUpdateContext.f26543c.add(this);
        this.mNodesManager.mo24792I();
    }

    public void onDrop() {
    }

    public void removeChild(C9965m mVar) {
        List<C9965m> list = this.mChildren;
        if (list != null) {
            list.remove(mVar);
        }
    }

    public final Object value() {
        if (this.mLastLoopID.containsKey(this.mUpdateContext.f26542b)) {
            long longValue = this.mLastLoopID.get(this.mUpdateContext.f26542b).longValue();
            C9920g gVar = this.mUpdateContext;
            if (longValue >= gVar.f26541a) {
                return this.mMemoizedValue.get(gVar.f26542b);
            }
        }
        Map<String, Long> map = this.mLastLoopID;
        C9920g gVar2 = this.mUpdateContext;
        map.put(gVar2.f26542b, Long.valueOf(gVar2.f26541a));
        Object evaluate = evaluate();
        this.mMemoizedValue.put(this.mUpdateContext.f26542b, evaluate);
        return evaluate;
    }
}
