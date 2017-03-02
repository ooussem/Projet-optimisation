package algo;

import model.Bag;
import model.Item;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Created by OOussema on 28/02/2017.
 *
 *
 */


public class Glouton {
	private int bestSolution;

	public Glouton() {
		this.bestSolution = 0;
	}
	public int findBestSolution(Bag[] bags, List<Item> items){
		Collections.sort(items);//Trie de la liste item par leur rapport utilité poids.
		for(Item item : items){
			this.bestSolution += isObjectAccepted(bags,item);
		}
		return this.bestSolution;
	}

	private int isObjectAccepted(Bag[] bags, Item item) {
		for(int i = 0; i<bags.length; i++) {
			if (item.getWeight() <= bags[i].getMax() && item.getWeight() <= (bags[i].getMax()-bags[i].getLevelOfFull())) {
				bags[i].addItem(item);
				item.setTaken(true);
				return item.getUtility();
			}
		}
		return 0;
	}

}
