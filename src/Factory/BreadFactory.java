package Factory;

import java.util.*;

import num1.Bread;
import num1.Butter;
import num1.Cream;
import num1.Sugar;

public class BreadFactory {
	private static final List<Bread> instances=new ArrayList<>();
	
	static {
		instances.addAll(Arrays.asList(
				new Cream(),
				new Sugar(),
				new Butter()
				));
		
	}
/* Registration of the storage instances
 * 
 * 
 * private static final map<String,Bread> instances = new HashMap<>();
 * 
 * public static void register(String breadType,Bread instance) {
 * 
 * if(Bread!=null && instance !=null) {
 * 	instances.put(breadType,Bread);
 * }
 * public static Bread getInstance( String breadType) {
 * 	if(instances.containsKey(breadType)){
 *      return instances.get(breadType);
 *      }
 *     return null; 
 * 
 * 
 * 
 * 	
 */
	
	public static void  printInstanceDetail() {
		for (Bread bread : instances) {
			bread.printTypeRecipe();
		}
	}
	
	public static void main(String[] args) {
		printInstanceDetail();
	}
	
	
	
//	// createBread method t0 get object of type bread
//	public Bread createBread(String breadType) {
//		Bread production = null;
//		switch (breadType) {
//		case "butter":
//			production= new butter();
//			break;
//		case "cream":
//			production=new cream();
//			break;
//		case "sugar":
//			production=new sugar();
//			break;
//		}
//		return production;
//	}//end of createBread() method 
	
	
}//end of BreadFactory class
