package com.happycity.project.happy_shipper.ui.Interfaces;

import android.content.Context;
import android.content.Intent;

/**
 * Created by Ha Truong on 12/31/2017.
 * This is a App
 * into the com.happycity.project.happy_shipper.ui.Interfaces
 */

public interface ActivityLauncher {

    /**
     * Starts an activity with the Intent provided.
     * @param intent an intent
     */
    void start(Context context, Intent intent);

    /**
     *
     * Returns the intent as set by {@link #start(android.content.Context,     android.content.Intent) start} or null if not yet
     * called.
     *
     * @return an intent or null
     */
    Intent getIntent();
}
