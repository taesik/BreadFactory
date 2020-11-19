package num1;

public class Butter extends Bread{
	private String breadType="butter";
	private int flour=100;
	private int water=100;
	private int butter=50;
	
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
	public int getButter() {
		return butter;
	}
	public void setButter(int butter) {
		this.butter = butter;
	}
	
	//Getters Setters END
	

	@Override
	public void printTypeRecipe() {
		System.out.println("breadType: "+ this.getBreadType());
		System.out.println("recipe");
		System.out.println("flour: "+this.getFlour());
		System.out.println("water: "+this.getWater());
		System.out.println("butter: "+this.getButter());
		System.out.println();
	}
}
