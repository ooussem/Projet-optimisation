package model;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by OOussema on 01/03/2017.
 */
public class Bag {
	private int id;
	private int max;
	private int levelOfFull;
	public List<Item> itemsTaken;
	private boolean full;

	public Bag(int id, int max) {
		this.id = id;
		this.max = max;
		itemsTaken = new ArrayList<>();
		this.levelOfFull = 0;
		this.full = false;
	}


	public int getId() {
		return id;
	}

	public int getLevelOfFull() {
		return levelOfFull;
	}

	public int getMax() {
		return max;
	}

	public void setLevelOfFull(int objectWeight) {
		this.levelOfFull += objectWeight;
	}

	public void addItem(Item item){
		this.itemsTaken.add(item);
		this.setLevelOfFull(item.getWeight());
		isFull();
	}

	public void isFull() {
		if(this.getMax()-this.levelOfFull == 0){
			this.full = true;
		}

	}

	public boolean getFull() {
		return this.full;
	}

}
