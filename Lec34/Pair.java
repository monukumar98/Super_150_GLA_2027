package Lec34;
public class Pair<T, P> {

	T x;
	P y;

	public Pair() {
		// TODO Auto-generated constructor stub
	}

	public Pair(T x, P y) {
		// TODO Auto-generated constructor stub
		this.x = x;
		this.y = y;
	}

	public T getx() {
		return x;
	}

	public static void main(String[] args) {
		Pair<Integer, Character> p1 = new Pair<>();
		Pair<String, Boolean> p2 = new Pair<>();
	}
}










