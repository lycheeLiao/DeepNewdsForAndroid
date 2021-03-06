package com.google.android.gms.internal;

import com.google.android.gms.common.internal.zzbq;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

public final class zzbid implements ThreadFactory {
    private final int mPriority;
    private final String zzgln;
    private final AtomicInteger zzglo;
    private final ThreadFactory zzglp;

    public zzbid(String str) {
        this(str, 0);
    }

    private zzbid(String str, int i) {
        this.zzglo = new AtomicInteger();
        this.zzglp = Executors.defaultThreadFactory();
        zzbq.checkNotNull(str, "Name must not be null");
        this.zzgln = str;
        this.mPriority = 0;
    }

    public final Thread newThread(Runnable runnable) {
        Thread newThread = this.zzglp.newThread(new zzbie(runnable, 0));
        String str = this.zzgln;
        int andIncrement = this.zzglo.getAndIncrement();
        StringBuilder stringBuilder = new StringBuilder(String.valueOf(str).length() + 13);
        stringBuilder.append(str);
        stringBuilder.append("[");
        stringBuilder.append(andIncrement);
        stringBuilder.append("]");
        newThread.setName(stringBuilder.toString());
        return newThread;
    }
}
