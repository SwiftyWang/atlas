package com.taobao.atlas.complex.base;

import android.content.Context;
import android.taobao.atlas.runtime.AtlasPreLauncher;
import android.util.Log;

import com.taobao.atlas.complex.utils.Env;

/**
 * Created by zhongcnag on 2017/9/5.
 * .
 */

public class PreLaunch implements AtlasPreLauncher {
    @Override
    public void initBeforeAtlas(Context context) {
        Log.d(Env.TAG, "you can do sth here, before init Atlas");
    }
}
