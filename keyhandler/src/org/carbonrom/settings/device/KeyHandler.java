/*
 * Copyright (C) 2018 CarbonROM
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.carbonrom.settings.device;

import android.os.SystemProperties;
import android.view.KeyEvent;

import com.android.internal.os.DeviceKeyHandler;

public class KeyHandler implements DeviceKeyHandler {
    private static final String TAG = KeyHandler.class.getSimpleName();
    private static String FPNAV_ENABLED_PROP = "sys.fpnav.enabled";


    public void handleNavbarToggle(boolean enabled) {
        SystemProperties.set(FPNAV_ENABLED_PROP, enabled ? "0" : "1");
    }

    public KeyEvent handleKeyEvent(KeyEvent event) {
        return event;
    }
}
