package com.capacitor.intent.resolver;

import com.getcapacitor.JSObject;
import com.getcapacitor.NativePlugin;
import com.getcapacitor.Plugin;
import com.getcapacitor.PluginCall;
import com.getcapacitor.PluginMethod;

@NativePlugin()
public class CapacitorIntentResolver extends Plugin {

    @PluginMethod()
    public Boolean shouldOverrideLoad(Uri url) {
        System.out.println("!!!!!!!!!!!!!test");
        return null;
    }
}
