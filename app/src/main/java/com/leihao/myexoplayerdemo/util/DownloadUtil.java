package com.leihao.myexoplayerdemo.util;

import android.content.Context;

import com.google.android.exoplayer2.upstream.cache.Cache;
import com.google.android.exoplayer2.upstream.cache.LeastRecentlyUsedCacheEvictor;
import com.google.android.exoplayer2.upstream.cache.SimpleCache;

import java.io.File;

public class DownloadUtil {

    public static Cache getCache(Context context) {
        File cacheFile = new File(context.getApplicationContext().getExternalCacheDir().getAbsolutePath(), "video");
        return new SimpleCache(cacheFile, new LeastRecentlyUsedCacheEvictor(512 * 1024 * 1024));
    }
}
