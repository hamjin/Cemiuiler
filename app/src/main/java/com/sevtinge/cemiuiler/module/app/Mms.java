package com.sevtinge.cemiuiler.module.app;

import com.sevtinge.cemiuiler.module.base.BaseModule;
import com.sevtinge.cemiuiler.module.hook.mms.DisableAd;
import com.sevtinge.cemiuiler.module.hook.various.UnlockSuperClipboard;

public class Mms extends BaseModule {
    @Override
    public void handleLoadPackage() {
        initHook(DisableAd.INSTANCE, mPrefsMap.getBoolean("mms_disable_ad"));
        initHook(UnlockSuperClipboard.INSTANCE, mPrefsMap.getBoolean("various_super_clipboard_enable"));
    }
}
