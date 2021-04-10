package org.kaushik.javabrains;

public class Triangle {
	/*public void draw() {
		System.out.println("Triangle drawing");
	}*/
	private String type;

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}
	public void draw() {
		System.out.println(getType() + "  Triangle drawing");
	}

}






