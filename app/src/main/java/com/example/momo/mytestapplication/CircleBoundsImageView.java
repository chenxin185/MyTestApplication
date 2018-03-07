package com.example.momo.mytestapplication;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.widget.ImageView;

/**
 * Created by momo on 18/3/6.
 */

public class CircleBoundsImageView extends ImageView {



    public CircleBoundsImageView(Context context) {
        super(context);
    }

    public CircleBoundsImageView(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
    }

    public CircleBoundsImageView(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    @Override
    protected void onDraw(Canvas canvas) {

        Paint paint = new Paint();
        paint.setColor(getResources().getColor(R.color.colorPrimaryDark));
        paint.setStyle(Paint.Style.STROKE);
        int width = getWidth();
        int height = getHeight();
        int radius = width>height?height/2:width/2;
        canvas.drawCircle(width/2,height/2, radius,paint);

        super.onDraw(canvas);

    }
}
