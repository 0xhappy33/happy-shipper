package com.happycity.project.happy_shipper.ui.Interfaces;

import android.content.Context;
import android.content.Intent;

/**
 * Created by Ha Truong on 12/31/2017.
 * This is a App
 * into the com.happycity.project.happy_shipper.ui.Interfaces
 */

public class DefaultActivityLauncher implements ActivityLauncher {
    private Intent intent;

    public DefaultActivityLauncher() {
    }

    @Override
    public void start(Context context, Intent intent) {
        this.intent = intent;
        context.startActivity(intent);
    }

    @Override
    public Intent getIntent() {
        return intent;
    }
}
