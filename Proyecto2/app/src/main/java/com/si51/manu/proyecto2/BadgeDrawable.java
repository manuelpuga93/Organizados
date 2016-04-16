package com.si51.manu.proyecto2;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.PixelFormat;
import android.graphics.Rect;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;

/**
 * Created by Manu on 31/03/2016.
 */
public class BadgeDrawable extends Drawable{

    private float mTextSize;
    private Paint mBagPaint;
    private Paint mTextPain;
    private Rect mTextRect = new Rect();

    private String mCount="";
    private boolean mwilDraw = false;

    public BadgeDrawable(Context context){
        mTextSize = context.getResources().getDimension(R.dimen.badge_text_size);

        mBagPaint = new Paint();
        mBagPaint.setColor(Color.RED);
        mBagPaint.setAntiAlias(true);
        mBagPaint.setStyle(Paint.Style.FILL);

        mTextPain = new Paint();
        mTextPain.setColor(Color.WHITE);
        mTextPain.setTypeface(Typeface.DEFAULT_BOLD);
        mTextPain.setTextSize(mTextSize);
        mTextPain.setAntiAlias(true);
        mTextPain.setTextAlign(Paint.Align.CENTER);
    }

    @Override
    public void draw(Canvas canvas) {
        if (!mwilDraw){
            return;
        }

        Rect bounds = getBounds();
        float width = bounds.right - bounds.left;
        float height = bounds.bottom - bounds.top;

        //posicion del badge en el top-right cuadrante del icono
        float radio = ((Math.min(width,height) /2) -1) /2;
        float centerX = width - radio -1;
        float centerY = radio+1;

        //draw badge circle
        canvas.drawCircle(centerX, centerY, radio, mBagPaint);

        mTextPain.getTextBounds(mCount, 0, mCount.length(), mTextRect);
        float textHeight = mTextRect.bottom - mTextRect.top;
        float textY = centerY + (textHeight / 2f);
        canvas.drawText(mCount, centerX, textY, mTextPain);

    }

    public void setCount(int count){
        mCount = Integer.toString(count);

        mwilDraw = count > 0;
        invalidateSelf();
    }

    @Override
    public void setAlpha(int alpha) {

    }

    @Override
    public void setColorFilter(ColorFilter colorFilter) {

    }

    @Override
    public int getOpacity() {
        return PixelFormat.UNKNOWN;
    }
}
