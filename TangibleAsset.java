public abstract class TangibleAsset {
  private String name;    // 有形資産の名称
  private int price;      // 有形資産の価格
  private String color;   // 有形資産の色

  public TangibleAsset(String name, int price, String color) {
    this.name = name;
    this.price = price;
    this.color = color;
  }

  public String getName() {
    return this.name;
  }

  public int getPrice() {
    return this.price;
  }

  public String getColor() {
    return this.color;
  }
}
