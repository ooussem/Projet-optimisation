package algo;

import model.Bag;
import model.Item;

import java.util.Collections;
import java.util.List;

/**
 * Created by OOussema on 01/03/2017.
 *
 *
 */

public class Relax {
	private double bestSolution;
	private double totalWeightBags;
	private double completedLevel;


	public Relax(Bag[] bags) {
		this.bestSolution = 0;
		this.completedLevel = 0;
		calculateTotalWeight(bags);
	}

	public void calculateTotalWeight(Bag[] bags) {
		for(int i =0; i<bags.length; i++){
			this.totalWeightBags += bags[i].getMax();
		}
	}

	public double findBestSolution(List<Item> items){
		Collections.sort(items);//Trie de la liste item par leur rapport utilité poids.
		for(Item item : items){
			if(this.completedLevel < this.totalWeightBags && item.getWeight()<=(this.totalWeightBags -this.completedLevel)) {
				this.completedLevel += item.getWeight();
				item.setTaken(true);

				this.bestSolution += item.getUtility();
			}
			else if(this.completedLevel < this.totalWeightBags &&
					item.getWeight() > (this.totalWeightBags -this.completedLevel)){

				this.completedLevel += (this.totalWeightBags-this.completedLevel);
				this.bestSolution += (this.totalWeightBags-this.completedLevel)/ item.getWeight() * item.getUtility();
			}

			else break;
		}
		return this.bestSolution;
	}

	public double getBestSolution() {
		return bestSolution;
	}
}
