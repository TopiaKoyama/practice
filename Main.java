public class Main {

	public static void main(String[] args) {
		Book book = new Book(
			"スッキリJava入門",
			2600,
			"白と黄緑",
			"ISBN978-4-295-00780-7");
		
		System.out.println("タイトル："+book.getName());
		System.out.println("価格    ："+book.getPrice());
		System.out.println("色      ："+book.getColor());
		System.out.println("ISBN    ："+book.getIsbn());
	}
}

