package num1;

public class Cream extends Bread{
	private String breadType="cream";
	private int flour=100;
	private int water=100;
	private int cream=200;
	
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
	public int getCream() {
		return cream;
	}
	public void setCream(int cream) {
		this.cream = cream;
	}
	//Getters Setters END
	
	@Override
	public void printTypeRecipe() {
		System.out.println("breadTyoe: "+ this.getBreadType());
		System.out.println("recipe");
		System.out.println("flour: "+this.getFlour());
		System.out.println("water: "+this.getWater());
		System.out.println("cream: "+this.getCream());
		
	}
	
	
}
