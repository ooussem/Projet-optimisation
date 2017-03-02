package generator;

import java.util.ArrayList;
import java.util.Random;


public class Generator {
	
	ArrayList<Item> items;
    float weightBag1;
    float weightBag2;

	public Generator() {
		super();
		items = new ArrayList<Item>();
	    this.weightBag1 =0;
	    this.weightBag2 =0;
		// TODO Auto-generated constructor stub
	}
	public ArrayList<Item> getItems() {
		return items;
	}
	public void setItems(ArrayList<Item> items) {
		this.items = items;
	}
	public float getWeightBag1() {
		return weightBag1;
	}
	public void setWeightBag1(float weightBag1) {
		this.weightBag1 = weightBag1;
	}
	public float getWeightBag2() {
		return weightBag2;
	}
	public void setWeightBag2(float weightBag2) {
		this.weightBag2 = weightBag2;
	}
    
	public void generer(float minP, float maxP, float minQ, float maxQ,float minPi,
						float maxPi,float minWi, float maxWi, int nbObject)
	{
		Random r = new Random();
		Random r2 = new Random();
		if (minP!=maxP)
			this.weightBag1 =  minP+r.nextInt((int)maxP-(int)minP);
		else
			this.weightBag1 = maxP;
		
		if (minQ!=maxQ)
			this.weightBag2 =  minQ+r2.nextInt((int)maxQ-(int)minQ);
		else
			this.weightBag2 =maxQ;
		
		
		for (int i=0;  i<nbObject; i++)
		{
			Random r3 = new Random();
			float p = minPi+r3.nextInt((int)maxPi-(int)minPi);
			Random r4 = new Random();
			float w = minWi+r4.nextInt((int)maxWi-(int)minWi);
			Item o = new Item(p,w);
			items.add(o);
		}
	}
    
}
