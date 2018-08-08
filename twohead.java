package dev;

import java.util.*;
import java.awt.*;
import java.applet.*;


public class twohead extends Applet{
    private int array[];
private int length;
public static int stothdsa;
public static int stfcfs;
public static int stsstf;

String[] str;
String[] cylNum;
int x[];
int nearest = -1;


public int findClosest(int desiredNumber) {
	int bestDistanceFoundYet = 1000;
	int d;
	int i;
	for (int k = 0; k < x.length; k++) {
		if (nearest == x[k])
			x[k] = 5000;
	}

	for (i = 1; i < x.length; i++) {
		d = Math.abs(desiredNumber - x[i]);
		if (d < bestDistanceFoundYet) {
			bestDistanceFoundYet = d;
			nearest = x[i];
		}
	}
	return nearest;
}

public int[] getSftf(int[] x, int st) {
	this.x = x;
	int[] sstf = new int[x.length + 1];
	sstf[0] = st;

	int desiredNumber = st;
	
	for (int count = 0; count < x.length - 1; count++) {
		sstf[count + 1] = findClosest(desiredNumber);

		desiredNumber = nearest;
	}
	return sstf;
}



    public void sort(int[] inputArr) 
    {
            if (inputArr == null || inputArr.length == 0) 
            {
                return;
            }
            this.array = inputArr;
            length = inputArr.length;
            quickSort(0, length - 1);
}
    private void quickSort(int lowerIndex, int higherIndex) {
            int i = lowerIndex;
int j = higherIndex;

int pivot = array[lowerIndex+(higherIndex-lowerIndex)/2];
while (i <= j) 
{
while (array[i] < pivot) 
{
i++;
}
while (array[j] > pivot) 
{
j--;
}
if (i <= j) 
{
exchangeNumbers(i, j);
i++;
j--;
}
}
if (lowerIndex< j)
quickSort(lowerIndex, j);
if (i <higherIndex)
quickSort(i, higherIndex);
}
private void exchangeNumbers(int i, int j) 
{
int temp = array[i];
array[i] = array[j];
array[j] = temp;
}

public int othdsa(twohead sorter,int input[],int n)
{
	
	int i,j;

	
	sorter.sort(input);
	int a[]=new int[10];
	for(i=0;i<n;i++)
	{
	     a[i]=input[i];
	}
	int lefthead=0;
	int righthead=200;
	int x=a[0]-lefthead;
	int y=righthead-a[n-1];
	System.out.println("The sequence of operations is as follows: ");
	try
	{
	if(x<=y)
	{
	i=0;
	while(a[i]<=100){
	        lefthead=a[i];
	        System.out.println("Left head: "+a[i]+" ");
	       	if(i==n-1)
	        break;
	        else
	         	i++;
	}
	x=a[n-1]-a[i-1];
	y=200-a[i];
	if(x<=y)
	{
	        while(i<n-1){
	        lefthead=a[i];
	        System.out.println("Left head: "+a[i]+" ");
	        if(i==n-1)
	        break;
	        else
	          i++;
	  }
	}
	else{
	j=n-1;
	while(j>=i){
	        righthead=a[j];
	        System.out.println("Right head: "+a[j]+" ");
	        j--;
	}
	}
	}
	else
	{
	        i=n-1;
	        while(a[i]>=100){
	righthead=a[i];
	System.out.println("Right head: "+a[i]+" ");
	i--;
	        }
	        x=a[i]-0;
	        y=a[i+1]-a[0];
	        if(x<=y){
	        j=0;
	while(j<=i){
	lefthead=a[j];
	System.out.println("Left head: "+a[j]+" ");
	j++;}
	        }
	        else{
	while(i>=0){
	              righthead=a[i];
	             	System.out.println("Right head: "+a[i]+" ");
	              i--;
	}
	   }
	}
	        }
	catch(Exception e){};
	int seektime=lefthead+200-righthead;
	System.out.println("Seektime of two headed algorithm:"+seektime);
		
	return seektime;
}

public int fcfs(int c[],int hm[],int n)
{
	int i,hs,flag,total=0;
	Scanner sc=new Scanner(System.in);


		/*headstart*/
		hs=0;
		flag=hs;
		for(i=0;i<n;i++)
		{
		if(c[i] > flag)
		hm[i]=c[i]-flag;
		else
		hm[i]=flag-c[i];
		flag=c[i];
		}
		for(i=0;i<n;i++)
		total=total+hm[i];
		System.out.println("Total cylinders traversed in fcfs:"+ total);
		
		return total;
	
}



public int sstf(twohead sorter,int in[])
{
	int sst[]=sorter.getSftf(in, 0);
	System.out.println("Total cylinders traversed in sstf:"+ sst[sst.length-2]);
	
	return sst[sst.length-2];
	
}


public static void main(String args[])
{
	
twohead sorter = new twohead();
System.out.print("Enter the no. of requests: ");
Scanner sc=new Scanner(System.in);
int i,j;
int n=sc.nextInt();
System.out.print("Enter the requests: ");
int hm[]=new int[n];
        int in[]=new int[n];
        int input[]=new int[n];
        int cin[]=new int[n];
        
        
for(i=0;i<n;i++)
in[i]=sc.nextInt();

for(i=0;i<n;i++)
{
	input[i]=in[i];
	cin[i]=in[i];
}

stothdsa = sorter.othdsa(sorter, in, n);
stfcfs = sorter.fcfs(input, hm, n);
stsstf=sorter.sstf(sorter, cin);

}
}