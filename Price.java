package lazy_class;

public class Price {
	private int value;

	public Price(int value) throws Exception {
		if(!Isvalidate(value)) {
			throw new Exception("price not valid");
		}
		this.value = value;
	}

	public int getValue() {
		return value;
	}
	public  boolean Isvalidate(int value){
		return value >= 0;
	}
}