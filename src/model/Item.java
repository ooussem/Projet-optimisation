package model;

import java.util.Comparator;

/**
 * Created by OOussema on 01/03/2017.
 */
public class Item implements Comparable<Item>{
	private int id;
	private int weight;
	private int utility;
	private int ratio;
	private boolean isTaken;
	private float partTaken;

	public Item(int id, int weight, int utility) {
		this.id = id;
		this.weight = weight;
		this.utility = utility;
		this.isTaken = false;
		this.ratio = (this.utility/this.weight);
	}

	public int getId() {
		return id;
	}

	public int getWeight() {
		return weight;
	}

	public int getUtility() {
		return utility;
	}

	public int getRatio() {
		return ratio;
	}


	/**
	 * Compares this object with the specified object for order.  Returns a
	 * negative integer, zero, or a positive integer as this object is less
	 * than, equal to, or greater than the specified object.
	 * <p>
	 * <p>The implementor must ensure <tt>sgn(x.compareTo(y)) ==
	 * -sgn(y.compareTo(x))</tt> for all <tt>x</tt> and <tt>y</tt>.  (This
	 * implies that <tt>x.compareTo(y)</tt> must throw an exception iff
	 * <tt>y.compareTo(x)</tt> throws an exception.)
	 * <p>
	 * <p>The implementor must also ensure that the relation is transitive:
	 * <tt>(x.compareTo(y)&gt;0 &amp;&amp; y.compareTo(z)&gt;0)</tt> implies
	 * <tt>x.compareTo(z)&gt;0</tt>.
	 * <p>
	 * <p>Finally, the implementor must ensure that <tt>x.compareTo(y)==0</tt>
	 * implies that <tt>sgn(x.compareTo(z)) == sgn(y.compareTo(z))</tt>, for
	 * all <tt>z</tt>.
	 * <p>
	 * <p>It is strongly recommended, but <i>not</i> strictly required that
	 * <tt>(x.compareTo(y)==0) == (x.equals(y))</tt>.  Generally speaking, any
	 * class that implements the <tt>Comparable</tt> interface and violates
	 * this condition should clearly indicate this fact.  The recommended
	 * language is "Note: this class has a natural ordering that is
	 * inconsistent with equals."
	 * <p>
	 * <p>In the foregoing description, the notation
	 * <tt>sgn(</tt><i>expression</i><tt>)</tt> designates the mathematical
	 * <i>signum</i> function, which is defined to return one of <tt>-1</tt>,
	 * <tt>0</tt>, or <tt>1</tt> according to whether the value of
	 * <i>expression</i> is negative, zero or positive.
	 *
	 * @param otherItem the object to be compared.
	 * @return a negative integer, zero, or a positive integer as this object
	 * is less than, equal to, or greater than the specified object.
	 * @throws NullPointerException if the specified object is null
	 * @throws ClassCastException   if the specified object's type prevents it
	 *                              from being compared to this object.
	 */
	@Override
	public int compareTo(Item otherItem) {
		int compareRatio = otherItem.getRatio();
		if (this.getRatio() < compareRatio) return 1;
		if (this.getRatio() > compareRatio) return -1;
		else return 0;
	}

	public boolean isTaken() {
		return isTaken;
	}

	public void setTaken(boolean taken) {
		isTaken = taken;
	}
}
