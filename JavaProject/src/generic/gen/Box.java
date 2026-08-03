package generic.gen;

// generic 타입
public class Box<T> {
	private T product;

	
	public void set(T product) {
		this.product = product;
	}
	
	public T get() {
		return product;
	}
}
