/**
 * 実行用クラス
 * @author M.Takahashi
 */
public class Driver {
	/**
	 * メインメソッド
	 * @param args 未使用
	 */
	public static void main(String[] args) {
		// 店舗名表示
		System.out.println();
		Product.displayStoreName();

		// 商品のインスタンス化
		Product keyboard = new Product("キーボード", 3000);
		Product mouse = new Product("マウス", 2000);

		// 商品情報表示
		System.out.println();
		keyboard.display();
		mouse.display();
		
		// インスタンス数の表示
		System.out.println();
		System.out.println("インスタンス数：" + Product.instanceCnt);
	}
}
