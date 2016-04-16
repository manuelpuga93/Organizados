package com.si51.manu.proyecto2;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;

/**
 * Created by Manu on 31/03/2016.
 */
public class Utils {

    public static void setBadgeCount(Context context, LayerDrawable icon, int count){

        BadgeDrawable badge;

        Drawable reuse = icon.findDrawableByLayerId(R.id.ic_badge);
        if (reuse != null && reuse instanceof BadgeDrawable){
            badge =(BadgeDrawable) reuse;
        }else{
            badge = new BadgeDrawable(context);
        }

        badge.setCount(count);
        icon.mutate();
        icon.setDrawableByLayerId(R.id.ic_badge, badge);

    }
}
