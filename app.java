package dev;

import dev.twohead;
import java.awt.*;
import java.applet.*;

public class app extends Applet{
	
	public void update(Graphics g)
	{
		
	}
	
	public void init()
	{
		setSize(500, 500);
	}
	
	public void paint(Graphics g)
	{
		String args[]={
				
		};
		int k=100;
		twohead t=new twohead();
		t.main(args);
		g.setColor(Color.red);
		g.fillRect(k+50,30+(int)((0.5)*(t.stfcfs-t.stothdsa)),25 , (int)((0.5)*(t.stothdsa)));
		g.setColor(Color.black);
		g.drawString("OTHDSA",k+35 ,30+(int)((0.5)*(t.stfcfs-t.stothdsa))+(int)((0.5)*(t.stothdsa)+10) );
		g.drawString(""+t.stothdsa, k+50,25+(int)((0.5)*(t.stfcfs-t.stothdsa)) );
		
		g.setColor(Color.green);
		g.fillRect(k+90, 30,25, (int)((0.5)*(t.stfcfs)));
		g.setColor(Color.black);
		g.drawString("FCFS",k+ 90, (int)((0.5)*(t.stfcfs)+40));
		g.drawString(""+t.stfcfs,k+ 90, 25);
		
		g.setColor(Color.blue);
		g.fillRect(130+k,30+(int)((0.5)*(t.stfcfs-t.stsstf)), 25, (int)((0.5)*(t.stsstf)));
		g.setColor(Color.black);
		g.drawString("SSTF",k+ 130, 30+(int)((0.5)*(t.stfcfs-t.stsstf)+(int)((0.5)*(t.stsstf)+10)));
		g.drawString(""+t.stsstf,k+ 130, 25+(int)((0.5)*(t.stfcfs-t.stsstf)));
		
	}
	
	

	

}
