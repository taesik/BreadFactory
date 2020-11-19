package num1;

public class Sugar extends Bread{
	private String breadType="sugar";
	private int  flour=100;
	private int water = 50;
	private int sugar = 200;
	
	public String getBreadType() {
		return breadType;
	}
	public void setBreadType(String breadType) {
		this.breadType = breadType;
	}
	public int getFlour() {
		return flour;
	}
	public void setFlour(int flour) {
		this.flour = flour;
	}
	public int getWater() {
		return water;
	}
	public void setWater(int water) {
		this.water = water;
	}
	public int getSugar() {
		return sugar;
	}
	public void setSugar(int sugar) {
		this.sugar = sugar;
	}
	//Getters Setters END
	@Override
	public void printTypeRecipe() {
		System.out.println("breadType: "+ this.getBreadType());
		System.out.println("recipe");
		System.out.println("flour: "+this.getFlour());
		System.out.println("water: "+this.getWater());
		System.out.println("sugar: "+this.getSugar());
		System.out.println();
	}
	
}
