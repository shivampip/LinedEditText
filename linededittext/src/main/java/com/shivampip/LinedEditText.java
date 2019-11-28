package com.shivampip;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.widget.EditText;

public class LinedEditText extends EditText {

    private Rect mRect;
    private Paint mPaint;

    float lineTextGap = 1.0f;
    int lineColor = Color.GRAY;
    float lineWidth = 1.0f;


    public LinedEditText(Context context, AttributeSet attrs) {
        super(context, attrs);

        if (attrs == null) {
            return;
        }

        TypedArray ta = getContext().obtainStyledAttributes(attrs, R.styleable.LinedEditText);
        lineTextGap = ta.getFloat(R.styleable.LinedEditText_lineTextGap, 1.0f);
        lineColor = ta.getColor(R.styleable.LinedEditText_lineColor, Color.GRAY);
        lineWidth = ta.getFloat(R.styleable.LinedEditText_lineWidth, 1.0f);


        mRect = new Rect();
        mPaint = new Paint();
        mPaint.setStyle(Paint.Style.FILL_AND_STROKE);
        //mPaint.setColor(getResources().getColor(R.color.edit_note_line));
        mPaint.setColor(lineColor);
        mPaint.setStrokeWidth(lineWidth);


        ta.recycle();
    }


    @Override
    protected void onDraw(Canvas canvas) {
        //int count = getLineCount();

        int height = getHeight();
        int line_height = getLineHeight();

        int count = height / line_height;

        if (getLineCount() > count)
            count = getLineCount();//for long text with scrolling

        Rect r = mRect;
        Paint paint = mPaint;
        int baseline = getLineBounds(0, r);//first line

        for (int i = 0; i < count; i++) {

            canvas.drawLine(r.left, baseline + lineTextGap, r.right, baseline + lineTextGap, paint);
            baseline += getLineHeight();//next line
        }

        super.onDraw(canvas);
    }


}//classEND
