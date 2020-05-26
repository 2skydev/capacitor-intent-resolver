package com.capacitor.intent.resolver;

import android.content.Intent;
import android.net.Uri;

import com.getcapacitor.JSObject;
import com.getcapacitor.NativePlugin;
import com.getcapacitor.Plugin;
import com.getcapacitor.PluginCall;
import com.getcapacitor.PluginMethod;

@NativePlugin()
public class CapacitorIntentResolver extends Plugin {

    @PluginMethod()
    public Boolean shouldOverrideLoad(Uri url) {
        try {
            Intent intent = Intent.parseUri(url.toString(), Intent.URI_INTENT_SCHEME);
            Intent existPackage = getContext().getPackageManager().getLaunchIntentForPackage(intent.getPackage());
            if (existPackage != null) {
                getContext().startActivity(intent);
            } else {
                Intent marketIntent = new Intent(Intent.ACTION_VIEW);
                marketIntent.setData(Uri.parse("market://details?id=" + intent.getPackage()));
                getContext().startActivity(marketIntent);
            }
            return true;
        } catch (Exception e) {
            e.printStackTrace();
        }

        return null;
    }
}
