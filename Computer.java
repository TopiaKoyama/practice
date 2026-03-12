public class Computer extends TangibleAsset {
	private String makerName;	// 製造メーカー名

	public Book(String name, int price, String color, String makerName) {
		super(name, price, color);
		this.makerName = makerName;
	}

	public String getMakerName() {
		return this.makerName;
	}
}

