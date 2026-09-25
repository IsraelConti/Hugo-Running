package com.hugorunning.app;
import android.app.*;import android.os.*;import android.graphics.Color;import android.graphics.drawable.GradientDrawable;import android.content.*;import android.net.Uri;import android.view.*;import android.widget.*;import java.util.*;
public class MainActivity extends Activity{
    LinearLayout box;SharedPreferences p;ArrayList<Race> races=new ArrayList<>();int blue=Color.rgb(19,62,135),orange=Color.rgb(255,105,36),light=Color.rgb(247,249,252),ink=Color.rgb(22,34,54),muted=Color.rgb(91,105,125),green=Color.rgb(18,145,93);
    static class Race{String n,l,q;Race(String a,String b,String c){n=a;l=b;q=c;}}
    TextView tx(String s,int z){TextView v=new TextView(this);v.setText(s);v.setTextSize(z);v.setTextColor(ink);v.setPadding(18,10,18,10);return v;}
    GradientDrawable bg(int c,int rad){GradientDrawable g=new GradientDrawable();g.setColor(c);g.setCornerRadius(rad);return g;}\n  GradientDrawable stroke(int fill,int line,int rad){GradientDrawable g=bg(fill,rad);g.setStroke(2,line);return g;}
    Button bt(String s,int c){Button b=new Button(this);b.setText(s);b.setTextSize(15);b.setTextColor(Color
