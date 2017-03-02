import algo.Glouton;
import model.Bag;
import model.Item;
import org.testng.annotations.*;

import java.util.ArrayList;
import java.util.List;

import static org.testng.Assert.*;

/**
 * Created by OOussema on 01/03/2017.
 */
public class GloutonTest {
	Glouton glouton;
	Bag b1;
	Bag b2;
	List<Item> items;
	Bag[] bags = {new Bag(1,9),new Bag(2,5)};

	@BeforeClass
	public void setUp() throws Exception {
//		b1 = new Bag(1,9);
//		b2 = new Bag(2,5);
		glouton = new Glouton();
		items = new ArrayList<>();
		items.add(new Item(1, 3, 30));
		items.add(new Item(2, 4, 36));
		items.add(new Item(3, 5, 40));
		items.add(new Item(4, 2, 14));
		items.add(new Item(5, 3, 18));
		items.add(new Item(6, 1, 5));
		items.add(new Item(7, 3, 12));
	}

	@AfterClass
	public void tearDown() throws Exception {
		b1 = null;
		b2 = null;
		glouton = null;
		items = null;
	}

	@Test
	public void testFindBestSolution() throws Exception {
		int resultBestSolution = glouton.findBestSolution(bags, items);
		for(int i = 0; i<bags.length;i++){
			System.out.println("Bag " +i+ "");
			for(Item item: bags[i].itemsTaken){
				System.out.println("Item:" +item.getId()+ " utility:"+item.getUtility());
			}
		}
		System.out.println("Best solution : "+resultBestSolution);
		assertEquals(resultBestSolution,120);
	}


	@Test
	public void testGetBestSolution() throws Exception {

	}

}