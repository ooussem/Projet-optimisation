package generator;

public class TestGenerator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
   Generator g = new Generator();
   // la repart deponde de pi, P, Q
   
   g.generer(20,20, 0, 20, 0, 5, 1, 5, 10);
   System.out.println(g.weightBag1);
   System.out.println(g.weightBag2);
   for (int i = 0; i < g.items.size(); i++) {
	   System.out.println(g.items.get(i).p);
	   System.out.println(g.items.get(i).w);
 }
  

}
}
