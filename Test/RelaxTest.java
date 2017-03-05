import algo.Glouton;
import algo.Relax;
import model.Bag;
import model.Item;
import org.testng.annotations.*;

import java.util.ArrayList;
import java.util.List;

import static org.testng.Assert.*;

/**
 * Created by OOussema on 01/03/2017.
 */
public class RelaxTest {

	Relax relax;
	Relax relax2;
	List<Item> items;
	Bag bags[] = {new Bag(1,9),new Bag(2,5)};
	Bag bags2[] = {new Bag(0,13)};

	@BeforeClass
	public void setUp() throws Exception {
		relax = new Relax(bags);
		relax2 = new Relax(bags2);

		items= new ArrayList<>();
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
		relax = null;
		items = null;
	}

	@Test
	public void testFindBestSolution() throws Exception {
		double resultBestSolution = relax.findBestSolution(items);


		for(int i = 0; i<bags.length;i++){
			System.out.println("Bag " +i+ "");
			for(Item item: bags[i].itemsTaken){
				System.out.println("Item:" +item.getId()+ " utility:"+item.getUtility());
			}
		}
		assertEquals(resultBestSolution,120.0);


		double resultBestSolution2 = relax2.findBestSolution(items);
		for(int i = 0; i<bags2.length;i++){
			System.out.println("Bag " +i+ "");
			for(Item item: bags2[i].itemsTaken){
				System.out.println("Item:" +item.getId()+ " utility:"+item.getUtility());
			}
		}

		assertEquals(resultBestSolution2,113.0);
	}

	@Test
	public void testGetBestSolution() throws Exception {

	}

	@Test
	public void testGetBags() throws Exception {

	}

}