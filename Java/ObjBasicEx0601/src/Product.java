/**
 * 商品クラス
 * @author M.Takahashi
 */
public class Product {
	/******** フィールド ******************************************/
	/**
	 * 店舗名
	 */
	static final String STORE_NAME = "速水PC販売店";
	
	/**
	 * 作成したインスタンス数
	 */
	static int instanceCnt = 0;

	/**
	 * 商品名
	 */
	String name;

	/**
	 * 価格
	 */
	int price;

	/******** コンストラクタ **************************************/
	/**
	 * @param name 商品名初期値
	 * @param price 価格初期値
	 */
	Product(String name, int price) {
		this.name = name;
		this.price = price;
		instanceCnt++;
	}

	/******** メソッド ******************************************/
	/**
	 * 店舗名の表示
	 */
	static void displayStoreName() {
		System.out.println("■店舗名：" + STORE_NAME);
	}

	/**
	 * 値上げする
	 * @param amt 値上げ金額
	 * @return 値上げ後の価格
	 */
	int up(int amt) {
		return price += amt;
	}
	
	/**
	 * 値下げする
	 * @param amt 値下げ金額
	 * @return 値下げ後の価格
	 */
	int down(int amt) {
		return price -= amt;
	}

	/**
	 * 情報表示
	 */
	void display() {
		System.out.println(name + "："+price+"円");
	}
}
