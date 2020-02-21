package com.example.lessoncanvas;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Path;
import android.view.View;

class MyDraw extends View {
    public MyDraw(Context context){
        super(context);
    }
    protected void onDraw(Canvas canvas){
        Paint paint=new Paint();
        paint.setColor(Color.GREEN);
        paint.setStrokeWidth(10);
        paint.setAntiAlias(true);
        paint.setStyle(Paint.Style.FILL);
        canvas.drawRect(0,canvas.getHeight(),canvas.getWidth(),1050,paint);
        paint.setColor(Color.YELLOW);
        canvas.drawCircle(100,100,100,paint);
        canvas.drawLine(100,100,200,200,paint);
        canvas.drawLine(100,100,130,300,paint);
        canvas.drawLine(100,100,250,150,paint);
        canvas.drawLine(100,100,150,250,paint);
        canvas.drawLine(100,100,300,180,paint);
        paint.setColor(Color.GRAY);
        canvas.drawRect(500,500,200,1200,paint);
        paint.setColor(Color.MAGENTA);
        canvas.drawRect(450,600,250,950,paint);
        paint.setColor(Color.BLACK);
        paint.setStrokeWidth(25);
        canvas.drawLine(900,850,900,1050,paint);
        paint.setColor(Color.GREEN);
        canvas.drawCircle(900,850,75,paint);
        Path path=new Path();
        paint.setColor(Color.GRAY);
        path.moveTo(400,400);
        path.lineTo(500,500);
        path.lineTo(200,500);
        path.close();
        canvas.drawPath(path,paint);
        paint.setColor(Color.RED);
        paint.setStrokeWidth(5);
        for (int i=600;i<950;i+=40){
            canvas.drawLine(450,i,250,i,paint);
        }

    }
}
