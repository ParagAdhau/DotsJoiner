package com.example.letstry;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.SweepGradient;
import android.util.AttributeSet;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.appwidget.*;
import java.awt.*;
import android.widget.*;

public class MyView extends View {  
 
 Paint BackPaint = new Paint();
 Context MyContext;
 int t=0;
	Button reset;
	public int board[][]={ {0,0,0,0,0,0,0,0,0},
					{0,0,0,0,0,0,0,0,0},
					{0,0,0,0,0,0,0,0,0},
					{0,0,0,0,0,0,0,0,0},
					{0,0,0,0,0,0,0,0,0},
					{0,0,0,0,0,0,0,0,0},
					{0,0,0,0,0,0,0,0,0},
					{0,0,0,0,0,0,0,0,0},
					{0,0,0,0,0,0,0,0,0}	};
	
	
	int p1=0,p2=0,print;
	int b=0;
	int n=0,s=0;
	float x,y;
	float z=100;float zz=100;
	float d=110;float dd=110;
	float e=150;float ee=150;
	float f=160;float ff=160;
	float g=200;float gg=200;
	float h=210;float hh=210;
	float i=250;float ii=250;
	float p=260;float pp=260;
	float j=300;float jj=300;
	float q=710;float qq=710;
	
    
 public MyView(Context context) {
  super(context);
  init(context);
 }

 public MyView(Context context, AttributeSet attrs) {
  super(context, attrs);
  init(context);
 }

 public MyView(Context context, AttributeSet attrs, int defStyle) {
  super(context, attrs, defStyle);
  init(context);
 }
 
 private void init(Context ctx){
  MyContext = ctx;
  BackPaint.setStyle(Paint.Style.FILL);
  BackPaint.setColor(Color.BLACK);
  
 }

 @Override
 protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
  int w = MeasureSpec.getSize(widthMeasureSpec);
  int h = MeasureSpec.getSize(heightMeasureSpec);
  setMeasuredDimension(w, h);
 }

 
 public boolean onTouchEvent(MotionEvent event) {
	    // MotionEvent reports input details from the touch screen
	    // and other input controls. In this case, you are only
	    // interested in events where the touch position changed.

	    x = event.getX();
	    y = event.getY();
	   Log.e("game", x+" "+y);
	   if(b==0&&(	(x>d && x<e &&y>100 &&y<110&&(board[0][1]==0) ) ||
				(x>f && x<g &&y>100 &&y<110&&(board[0][3]==0) ) || 
				(x>h && x<i &&y>100 &&y<110&&(board[0][5]==0) ) || 
				(x>p && x<j &&y>100 &&y<110&&(board[0][7]==0) ) || 
				(x>d && x<e &&y>150 &&y<160&&(board[2][1]==0) ) || 
				(x>f && x<g &&y>150 &&y<160&&(board[2][3]==0) ) || 
				(x>h && x<i &&y>150 &&y<160&&(board[2][5]==0) ) || 
				(x>p && x<j &&y>150 &&y<160&&(board[2][7]==0) ) || 
				(x>d && x<e &&y>200 &&y<210&&(board[4][1]==0) ) || 
				(x>f && x<g &&y>200 &&y<210&&(board[4][3]==0) ) || 
				(x>h && x<i &&y>200 &&y<210&&(board[4][5]==0) ) || 
				(x>p && x<j &&y>200 &&y<210&&(board[4][7]==0) ) || 
				(x>d && x<e &&y>250 &&y<260&&(board[6][1]==0) ) || 
				(x>f && x<g &&y>250 &&y<260&&(board[6][3]==0) ) || 
				(x>h && x<i &&y>250 &&y<260&&(board[6][5]==0) ) || 
				(x>p && x<j &&y>250 &&y<260&&(board[6][7]==0) ) ||
				(x>d && x<e &&y>300 &&y<310&&(board[8][1]==0) ) || 
				(x>f && x<g &&y>300 &&y<310&&(board[8][3]==0) ) || 
				(x>h && x<i &&y>300 &&y<310&&(board[8][5]==0) ) || 
				(x>p && x<j &&y>300 &&y<310&&(board[8][7]==0) ) || 
				(x>z && x<d && y>110 && y<150&&(board[1][0]==0) ) ||
				(x>e && x<f && y>110 && y<150&&(board[1][2]==0) ) ||
				(x>g && x<h && y>110 && y<150&&(board[1][4]==0) ) ||
				(x>i && x<p && y>110 && y<150&&(board[1][6]==0) ) ||
				(x>j && x<q && y>110 && y<150&&(board[1][8]==0) ) ||
				(x>z && x<d && y>160 && y<200&&(board[3][0]==0) ) ||
				(x>e && x<f && y>160 && y<200&&(board[3][2]==0) ) ||
				(x>g && x<h && y>160 && y<200&&(board[3][4]==0) ) ||
				(x>i && x<p && y>160 && y<200&&(board[3][6]==0) ) ||
				(x>j && x<q && y>160 && y<200&&(board[3][8]==0) ) ||
				(x>z && x<d && y>210 && y<250&&(board[5][0]==0) ) ||
				(x>e && x<f && y>210 && y<250&&(board[5][2]==0) ) ||
				(x>g && x<h && y>210 && y<250&&(board[5][4]==0) ) ||
				(x>i && x<p && y>210 && y<250&&(board[5][6]==0) ) ||
				(x>j && x<q && y>210 && y<250&&(board[5][8]==0) ) ||
				(x>z && x<d && y>260 && y<300&&(board[7][0]==0) ) ||
				(x>e && x<f && y>260 && y<300&&(board[7][2]==0) ) ||
				(x>g && x<h && y>260 && y<300&&(board[7][4]==0) ) ||
				(x>i && x<p && y>260 && y<300&&(board[7][6]==0) ) ||
				(x>j && x<q && y>260 && y<300&&(board[7][8]==0) ) ) ){	n=boxes(1);b=player1(x,y);boxfilledornot(1);s=boxes(1);if(s>n){b=0;}else{b=1;}invalidate();return true;			}
				else{
				if(b==1&&(	(x>d && x<e &&y>100 &&y<110&&(board[0][1]==0) ) ||
				(x>f && x<g &&y>100 &&y<110&&(board[0][3]==0) ) || 
				(x>h && x<i &&y>100 &&y<110&&(board[0][5]==0) ) || 
				(x>p && x<j &&y>100 &&y<110&&(board[0][7]==0) ) || 
				(x>d && x<e &&y>150 &&y<160&&(board[2][1]==0) ) || 
				(x>f && x<g &&y>150 &&y<160&&(board[2][3]==0) ) || 
				(x>h && x<i &&y>150 &&y<160&&(board[2][5]==0) ) || 
				(x>p && x<j &&y>150 &&y<160&&(board[2][7]==0) ) || 
				(x>d && x<e &&y>200 &&y<210&&(board[4][1]==0) ) || 
				(x>f && x<g &&y>200 &&y<210&&(board[4][3]==0) ) || 
				(x>h && x<i &&y>200 &&y<210&&(board[4][5]==0) ) || 
				(x>p && x<j &&y>200 &&y<210&&(board[4][7]==0) ) || 
				(x>d && x<e &&y>250 &&y<260&&(board[6][1]==0) ) || 
				(x>f && x<g &&y>250 &&y<260&&(board[6][3]==0) ) || 
				(x>h && x<i &&y>250 &&y<260&&(board[6][5]==0) ) || 
				(x>p && x<j &&y>250 &&y<260&&(board[6][7]==0) ) ||
				(x>d && x<e &&y>300 &&y<310&&(board[8][1]==0) ) || 
				(x>f && x<g &&y>300 &&y<310&&(board[8][3]==0) ) || 
				(x>h && x<i &&y>300 &&y<310&&(board[8][5]==0) ) || 
				(x>p && x<j &&y>300 &&y<310&&(board[8][7]==0) ) || 
				(x>z && x<d && y>110 && y<150&&(board[1][0]==0) ) ||
				(x>e && x<f && y>110 && y<150&&(board[1][2]==0) ) ||
				(x>g && x<h && y>110 && y<150&&(board[1][4]==0) ) ||
				(x>i && x<p && y>110 && y<150&&(board[1][6]==0) ) ||
				(x>j && x<q && y>110 && y<150&&(board[1][8]==0) ) ||
				(x>z && x<d && y>160 && y<200&&(board[3][0]==0) ) ||
				(x>e && x<f && y>160 && y<200&&(board[3][2]==0) ) ||
				(x>g && x<h && y>160 && y<200&&(board[3][4]==0) ) ||
				(x>i && x<p && y>160 && y<200&&(board[3][6]==0) ) ||
				(x>j && x<q && y>160 && y<200&&(board[3][8]==0) ) ||
				(x>z && x<d && y>210 && y<250&&(board[5][0]==0) ) ||
				(x>e && x<f && y>210 && y<250&&(board[5][2]==0) ) ||
				(x>g && x<h && y>210 && y<250&&(board[5][4]==0) ) ||
				(x>i && x<p && y>210 && y<250&&(board[5][6]==0) ) ||
				(x>j && x<q && y>210 && y<250&&(board[5][8]==0) ) ||
				(x>z && x<d && y>260 && y<300&&(board[7][0]==0) ) ||
				(x>e && x<f && y>260 && y<300&&(board[7][2]==0) ) ||
				(x>g && x<h && y>260 && y<300&&(board[7][4]==0) ) ||
				(x>i && x<p && y>260 && y<300&&(board[7][6]==0) ) ||
				(x>j && x<q && y>260 && y<300&&(board[7][8]==0) ) )){	n=boxes(2);b=player2(x,y);boxfilledornot(2);s=boxes(2);if(s>n){b=1;}else{b=0;}invalidate();return true;			}	
				}
				winner();
				if(x>150 && x<250 && y> 350 && y< 400){
					for(int i=0;i<= 8;i++)
					   {
						   for(int j=0;j<=8;j++)
						   {board[i][j]=0;
						    }
					//resetboard();
					invalidate();}
		invalidate();}
	    		return true;
		
	   


	}


 public int player1 (float x,float y)    //returns 1 if bar is made else 0
 {
		if(x>d && x<e &&y>100 &&y<110&&(board[0][1]==0) ){ board[0][1]=1;return 1;}
		else{if(x>f && x<g &&y>100 &&y<110&&(board[0][3]==0) ){ board[0][3]=1;return 1;}
		else{if(x>h && x<i &&y>100 &&y<110&&(board[0][5]==0) ){ board[0][5]=1;return 1;}
		else{if(x>p && x<j &&y>100 &&y<110&&(board[0][7]==0) ){ board[0][7]=1;return 1;}
		else{if(x>d && x<e &&y>150 &&y<160&&(board[2][1]==0) ){ board[2][1]=1;return 1;}
		else{if(x>f && x<g &&y>150 &&y<160&&(board[2][3]==0) ){ board[2][3]=1;return 1;}
		else{if(x>h && x<i &&y>150 &&y<160&&(board[2][5]==0) ){ board[2][5]=1;return 1;}
		else{if(x>p && x<j &&y>150 &&y<160&&(board[2][7]==0) ){ board[2][7]=1;return 1;}
		else{if(x>d && x<e &&y>200 &&y<210&&(board[4][1]==0) ){ board[4][1]=1;return 1;}
		else{if(x>f && x<g &&y>200 &&y<210&&(board[4][3]==0) ){ board[4][3]=1;return 1;}
		else{if(x>h && x<i &&y>200 &&y<210&&(board[4][5]==0) ){ board[4][5]=1;return 1;}
		else{if(x>p && x<j &&y>200 &&y<210&&(board[4][7]==0) ){ board[4][7]=1;return 1;}
		else{if(x>d && x<e &&y>250 &&y<260&&(board[6][1]==0) ){ board[6][1]=1;return 1;}
		else{if(x>f && x<g &&y>250 &&y<260&&(board[6][3]==0) ){ board[6][3]=1;return 1;}
		else{if(x>h && x<i &&y>250 &&y<260&&(board[6][5]==0) ){ board[6][5]=1;return 1;}
		else{if(x>p && x<j &&y>250 &&y<260&&(board[6][7]==0)){ board[6][7]=1;return 1;}
		else{if(x>d && x<e &&y>300 &&y<310&&(board[8][1]==0) ){ board[8][1]=1;return 1;}
		else{if(x>f && x<g &&y>300 &&y<310&&(board[8][3]==0) ){ board[8][3]=1;return 1;}
		else{if(x>h && x<i &&y>300 &&y<310&&(board[8][5]==0) ){ board[8][5]=1;return 1;}
		else{if(x>p && x<j &&y>300 &&y<310&&(board[8][7]==0) ){ board[8][7]=1;return 1;}
		else{if(x>z && x<d && y>110 && y<150&&(board[1][0]==0) ){board[1][0]=1;return 1;}
		else{if(x>e && x<f && y>110 && y<150&&(board[1][2]==0) ){board[1][2]=1;return 1;}
		else{if(x>g && x<h && y>110 && y<150&&(board[1][4]==0) ){board[1][4]=1;return 1;}
		else{if(x>i && x<p && y>110 && y<150&&(board[1][6]==0) ){board[1][6]=1;return 1;}
		else{if(x>j && x<q && y>110 && y<150&&(board[1][8]==0) ){board[1][8]=1;return 1;}
		else{if(x>z && x<d && y>160 && y<200&&(board[3][0]==0) ){board[3][0]=1;return 1;}
		else{if(x>e && x<f && y>160 && y<200&&(board[3][2]==0) ){board[3][2]=1;return 1;}
		else{if(x>g && x<h && y>160 && y<200&&(board[3][4]==0) ){board[3][4]=1;return 1;}
		else{if(x>i && x<p && y>160 && y<200&&(board[3][6]==0) ){board[3][6]=1;return 1;}
		else{if(x>j && x<q && y>160 && y<200&&(board[3][8]==0) ){board[3][8]=1;return 1;}
		else{if(x>z && x<d && y>210 && y<250&&(board[5][0]==0) ){board[5][0]=1;return 1;}
		else{if(x>e && x<f && y>210 && y<250&&(board[5][2]==0) ){board[5][2]=1;return 1;}
		else{if(x>g && x<h && y>210 && y<250&&(board[5][4]==0) ){board[5][4]=1;return 1;}
		else{if(x>i && x<p && y>210 && y<250&&(board[5][6]==0) ){board[5][6]=1;return 1;}
		else{if(x>j && x<q && y>210 && y<250&&(board[5][8]==0) ){board[5][8]=1;return 1;}
		else{if(x>z && x<d && y>260 && y<300&&(board[7][0]==0) ){board[7][0]=1;return 1;}
		else{if(x>e && x<f && y>260 && y<300&&(board[7][2]==0) ){board[7][2]=1;return 1;}
		else{if(x>g && x<h && y>260 && y<300&&(board[7][4]==0) ){board[7][4]=1;return 1;}
		else{if(x>i && x<p && y>260 && y<300&&(board[7][6]==0) ){board[7][6]=1;return 1;}
		else{if(x>j && x<q && y>260 && y<300&&(board[7][8]==0) ){board[7][8]=1;return 1;}else{return 0;}
																														}
																														}
																														}
																														}
																														}
																														}
																														}
																														}
																														}
																														}
																														}
																														}
																														}
																														}
																														}
																														}
																														}
																														}
																														}
																														}			
			
							
							
											}
											}
											}
											}
											}
											}
											}
											}
											}
											}
											}
											}
											}
											}
									}		
							}
							}
				}
			
			
			}
			
	    }
	
public int player2(float x,float y)    //returns 0 if bar is made else 1
	{
		if(x>110 && x<150 &&y>100 &&y<110&&(board[0][1]==0) ){ board[0][1]=2;return 0;}
		else{if(x>f && x<g &&y>100 &&y<110&&(board[0][3]==0) ){ board[0][3]=2;return 0;}
					else{   if(x>h && x<i &&y>100 &&y<110&&(board[0][5]==0) ){ board[0][5]=2;return 0;}
						 else	{ if(x>p && x<j &&y>100 &&y<110&&(board[0][7]==0) ){ board[0][7]=2;return 0;}
									else{ if(x>d && x<e &&y>150 &&y<160&&(board[2][1]==0) ){ board[2][1]=2;return 0;}
										else    { if(x>f && x<g &&y>150 &&y<160&&(board[2][3]==0) ){ board[2][3]=2;return 0;}
													else{if(x>h && x<i &&y>150 &&y<160&&(board[2][5]==0) ){ board[2][5]=2;return 0;}
															else{if(x>p && x<j &&y>150 &&y<160&&(board[2][7]==0) ){ board[2][7]=2;return 0;}
																	else{if(x>d && x<e &&y>200 &&y<210&&(board[4][1]==0) ){ board[4][1]=2;return 0;}
																			else{if(x>f && x<g &&y>200 &&y<210&&(board[4][3]==0) ){ board[4][3]=2;return 0;}
																					else{if(x>h && x<i &&y>200 &&y<210&&(board[4][5]==0) ){ board[4][5]=2;return 0;}
																							else{if(x>p && x<j &&y>200 &&y<210&&(board[4][7]==0) ){ board[4][7]=2;return 0;}
																									else{if(x>d && x<e &&y>250 &&y<260&&(board[6][1]==0) ){ board[6][1]=2;return 0;}
																											else{if(x>f && x<g &&y>250 &&y<260&&(board[6][3]==0) ){ board[6][3]=2;return 0;}
																												else{if(x>h && x<i &&y>250 &&y<260&&(board[6][5]==0) ){ board[6][5]=2;return 0;}
																												else{if(x>p && x<j &&y>250 &&y<260&&(board[6][7]==0)){ board[6][7]=2;return 0;}
																												else{if(x>d && x<e &&y>300 &&y<310&&(board[8][1]==0) ){ board[8][1]=2;return 0;}
																												else{if(x>f && x<g &&y>300 &&y<310&&(board[8][3]==0) ){ board[8][3]=2;return 0;}
																												else{if(x>h && x<i &&y>300 &&y<310&&(board[8][5]==0) ){ board[8][5]=2;return 0;}
																												else{if(x>p && x<j &&y>300 &&y<310&&(board[8][7]==0) ){ board[8][7]=2;return 0;}
																												else{if(x>z && x<d && y>110 && y<150&&(board[1][0]==0) ){board[1][0]=2;return 0;}
																												else{if(x>e && x<f && y>110 && y<150&&(board[1][2]==0) ){board[1][2]=2;return 0;}
																												else{if(x>g && x<h && y>110 && y<150&&(board[1][4]==0) ){board[1][4]=2;return 0;}
																												else{if(x>i && x<p && y>110 && y<150&&(board[1][6]==0) ){board[1][6]=2;return 0;}
																												else{if(x>j && x<q && y>110 && y<150&&(board[1][8]==0) ){board[1][8]=2;return 0;}
																												else{if(x>z && x<d && y>160 && y<200&&(board[3][0]==0) ){board[3][0]=2;return 0;}
																												else{if(x>e && x<f && y>160 && y<200&&(board[3][2]==0) ){board[3][2]=2;return 0;}
																												else{if(x>g && x<h && y>160 && y<200&&(board[3][4]==0) ){board[3][4]=2;return 0;}
																												else{if(x>i && x<p && y>160 && y<200&&(board[3][6]==0) ){board[3][6]=2;return 0;}
																												else{if(x>j && x<q && y>160 && y<200&&(board[3][8]==0) ){board[3][8]=2;return 0;}
																												else{if(x>z && x<d && y>210 && y<250&&(board[5][0]==0) ){board[5][0]=2;return 0;}
																												else{if(x>e && x<f && y>210 && y<250&&(board[5][2]==0) ){board[5][2]=2;return 0;}
																												else{if(x>g && x<h && y>210 && y<250&&(board[5][4]==0) ){board[5][4]=2;return 0;}
																												else{if(x>i && x<p && y>210 && y<250&&(board[5][6]==0) ){board[5][6]=2;return 0;}
																												else{if(x>j && x<q && y>210 && y<250&&(board[5][8]==0) ){board[5][8]=2;return 0;}
																												else{if(x>z && x<d && y>260 && y<300&&(board[7][0]==0) ){board[7][0]=2;return 0;}
																												else{if(x>e && x<f && y>260 && y<300&&(board[7][2]==0) ){board[7][2]=2;return 0;}
																												else{if(x>g && x<h && y>260 && y<300&&(board[7][4]==0) ){board[7][4]=2;return 0;}
																												else{if(x>i && x<p && y>260 && y<300&&(board[7][6]==0) ){board[7][6]=2;return 0;}
																												else{if(x>j && x<q && y>260 && y<300&&(board[7][8]==0) ){board[7][8]=2;return 0;}else{return 1;}
																													}
																													}
																													}
																													}
																													}
																													}
																													}
																													}
																													}
																													}
																													}
																													}
																													}
																													}
																													}
																													}
																													}
																													}
																													}
																													}			
		
						
						
										}
										}
										}
										}
										}
										}
										}
										}
										}
										}
										}
										}
										}
										}
								}		
						}
						}
			}
		
		
		}
		
 }		
	
public int boxes(int k)
{
	p1=0;
	p2=0;
	for(int i=1;i<=8;i=i+2)
    for(int j=1;j<=8;j=j+2)
{
    if(board[i][j]==1&&k==1){p1++;}
	if(board[i][j]==2&&k==2){p2++;}
}
if(k==1){return p1;}
	else{return p2;}


}

public void boxfilledornot(int k)
{

	for(int i=1;i<=8;i=i+2)
    for(int j=1;j<=8;j=j+2)
{
    if(board[i][j]==0&&(board[i-1][j]==1||board[i-1][j]==2) &&(board[i+1][j]==1||board[i+1][j]==2)&&(board[i][j-1]==1||board[i][j-1]==2)&&(board[i][j+1]==1||board[i][j+1]==2)&& k==1)
	{board[i][j]=1;}
	if(board[i][j]==0&&(board[i-1][j]==1||board[i-1][j]==2)&&(board[i+1][j]==1||board[i+1][j]==2)&&(board[i][j-1]==1||board[i][j-1]==2)&&(board[i][j+1]==1||board[i][j+1]==2)&& k==2)
	{board[i][j]=2;}
		
}

}

public void winner()
{int c=0,d=0;
//showStatus("                 ");

if(	(board[1][1]!=0)  &&
(board[1][3]!=0)  && 
(board[1][5]!=0)  && 
(board[1][7]!=0)  && 
(board[3][1]!=0)  && 
(board[3][3]!=0)  && 
(board[3][5]!=0)  && 
(board[3][7]!=0)  && 
(board[5][1]!=0)  && 
(board[5][3]!=0)  && 
(board[5][5]!=0)  && 
(board[5][7]!=0)  && 
(board[7][1]!=0)  && 
(board[7][3]!=0)  && 
(board[7][5]!=0)  && 
(board[7][7]!=0)  &&
(board[7][1]!=0)  && 
(board[7][3]!=0)  && 
(board[7][5]!=0)  && 
(board[7][7]!=0)  )
{
	
for(int i=1;i<=8;i=i+2)
    for(int j=1;j<=8;j=j+2)
{
    if(board[i][j]==1){c++;}
	if(board[i][j]==2){d++;}
}

//if(c>d){showStatus("Green(Player1) wins");();}
//else{
//if(c<d){showStatus("Blue(Player2) wins");repaint();}
//else{showStatus("DRAW!!!!!!!!!");repaint();}
//}
}
}	
@Override
protected void onDraw(Canvas canvas) {

 float w, h, cx, cy, radius;
 w = getWidth();
 h = getHeight();
 cx = w/2;
 cy = h/2;
 
 if(w > h){
  radius = h/4;
 }else{
  radius = w/4;
 }
 
 canvas.drawRect(0, 0, w, h, BackPaint);
 
 Paint MyPaint = new Paint();
 MyPaint.setStyle(Paint.Style.FILL);
 Paint MyPaint2 = new Paint();
 Paint MyPaint3 = new Paint();
 MyPaint3.setColor(Color.WHITE);
 MyPaint.setAntiAlias(true);
 for(int k=100;k<=300;k=k+50)
{for(int l=100;l<=300;l=l+50) canvas.drawCircle(k, l, 5, MyPaint3);}
	
	MyPaint2.setColor(Color.RED);
	
	
	int c=0,d=0;
	//showStatus("                 ");

	if(	(board[1][1]!=0)  &&
	(board[1][3]!=0)  && 
	(board[1][5]!=0)  && 
	(board[1][7]!=0)  && 
	(board[3][1]!=0)  && 
	(board[3][3]!=0)  && 
	(board[3][5]!=0)  && 
	(board[3][7]!=0)  && 
	(board[5][1]!=0)  && 
	(board[5][3]!=0)  && 
	(board[5][5]!=0)  && 
	(board[5][7]!=0)  && 
	(board[7][1]!=0)  && 
	(board[7][3]!=0)  && 
	(board[7][5]!=0)  && 
	(board[7][7]!=0)  &&
	(board[7][1]!=0)  && 
	(board[7][3]!=0)  && 
	(board[7][5]!=0)  && 
	(board[7][7]!=0)  )
	{
		
	for(int i=1;i<=8;i=i+2)
	    for(int j=1;j<=8;j=j+2)
	{
	    if(board[i][j]==1){c++;}
		if(board[i][j]==2){d++;}
	}

	if(c>d){canvas.drawText("Green (player1) wins", getHeight()/2,getWidth()/2, MyPaint3);invalidate();
	canvas.drawRect(400,400,450,450,MyPaint3);}
	else{
	if(c<d){canvas.drawText("Blue (player2) wins", getHeight()/2,getWidth()/2, MyPaint3);invalidate();}
	else{invalidate();}
	}
	}
	canvas.drawRect(150,350,250,400,MyPaint3);
	canvas.drawText("Reset", 180,375,BackPaint);invalidate();
	//canvas.drawRect(left, top, right, bottom, paint)
   for(int i=0,shifty=0;i<= 8;i=i+2,shifty=shifty+50)
   {
	   for(int j=1,shiftx=0;j<=7;j=j+2,shiftx=shiftx+50)
	   {
		  
		   if(board[i][j]==1)
		   {
			   	MyPaint2.setColor(Color.GREEN);
			   	canvas.drawRect(100+shiftx,95 + shifty,150+shiftx,105+shifty,MyPaint2);
			   	for(int k=100;k<=300;k=k+50)
			   	{for(int l=100;l<=300;l=l+50) canvas.drawCircle(k, l, 5, MyPaint3);}

			   	invalidate();
		   }
		   if(board[i][j]==2)
		   {
			   	MyPaint2.setColor(Color.BLUE);
			   	canvas.drawRect(100+shiftx,95 + shifty,150+shiftx,105+shifty,MyPaint2);
			   	for(int k=100;k<=300;k=k+50)
			   	{for(int l=100;l<=300;l=l+50) canvas.drawCircle(k, l, 5, MyPaint3);}

			   	invalidate();
		   }
		   invalidate();
	   }
   }
   for(int i=1,shifty=0;i<= 7;i=i+2,shifty=shifty+50)
   {
	   for(int j=0,shiftx=0;j<=8;j=j+2,shiftx=shiftx+50)
	   {
		  
		   if(board[i][j]==1)
		   {
			   	MyPaint2.setColor(Color.GREEN);
			   	canvas.drawRect(95+shiftx,100 + shifty,105+shiftx,150+shifty,MyPaint2);
			   	for(int k=100;k<=300;k=k+50)
			   	{for(int l=100;l<=300;l=l+50) canvas.drawCircle(k, l, 5, MyPaint3);}
			   	invalidate();
		   }
		   if(board[i][j]==2)
		   {
			   	MyPaint2.setColor(Color.BLUE);
			   	canvas.drawRect(95+shiftx,100 + shifty,105+shiftx,150+shifty,MyPaint2);
			   	for(int k=100;k<=300;k=k+50)
			   	{for(int l=100;l<=300;l=l+50) canvas.drawCircle(k, l, 5, MyPaint3);}
			   	invalidate();
		   }
		   invalidate();
	   }
   }
    
 
 invalidate();
 for(int i=1,shifty=0;i<= 7;i=i+2,shifty=shifty+50)
 {
	   for(int j=1,shiftx=0;j<=7;j=j+2,shiftx=shiftx+50)
	   {
		  
		   if(board[i][j]==1)
		   {
			   	MyPaint2.setColor(Color.GREEN);
			   	canvas.drawRect(110+shiftx,110 + shifty,140+shiftx,140+shifty,MyPaint2);
			   	
			   	invalidate();
		   }
		   if(board[i][j]==2)
		   {
			   	MyPaint2.setColor(Color.BLUE);
			   	canvas.drawRect(110+shiftx,110 + shifty,140+shiftx,140+shifty,MyPaint2);
			   	
			   	invalidate();
		   }
		   invalidate();
	   }
 }
  
 
};

 
 
}


