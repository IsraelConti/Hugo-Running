package com.hugorunning.app;
import android.app.*;import android.os.*;import android.graphics.Color;import android.graphics.drawable.GradientDrawable;import android.content.*;import android.net.Uri;import android.view.*;import android.widget.*;import java.util.*;
public class MainActivity extends Activity{
      LinearLayout box;SharedPreferences p;ArrayList<Race> races=new ArrayList<>();int blue=Color.rgb(12,74,160),orange=Color.rgb(255,112,25),light=Color.rgb(244,248,253);
      static class Race{String n,l,q;Race(String a,String b,String c){n=a;l=b;q=c;}}
      TextView tx(String s,int z){TextView v=new TextView(this);v.setText(s);v.setTextSize(z);v.setTextColor(Color.rgb(28,43,65));v.setPadding(18,10,18,10);return v;}
      GradientDrawable bg(int c,int rad){GradientDrawable g=new GradientDrawable();g.setColor(c);g.setCornerRadius(rad);return g;}
      Button bt(String s,int c){Button b=new Button(this);b.setText(s);b.setTextSize(16);b.setTextColor(Color.WHITE);b.setAllCaps(false);b.setBackground(bg(c,28));LinearLayout.LayoutParams lp=new LinearLayout.LayoutParams(-1,-2);lp.setMargins(8,8,8,8);b.setLayoutParams(lp);return b;}
      public void onCreate(Bundle b){super.onCreate(b);p=getSharedPreferences("hugo",0);seed();home();}
      void seed(){races.add(new Race("Carrera de la Mujer por la Igualdad","Córdoba","Carrera Mujer Igualdad Córdoba infantil reglamento 2026"));races.add(new Race("XXI Ruta del Aceite","La Victoria","Ruta Aceite La Victoria carrera infantil reglamento
