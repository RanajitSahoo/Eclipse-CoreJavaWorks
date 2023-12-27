package vegetable;
interface Vegetable {
	
	default void eat() {
		System.out.println(" eatable");
	}
}
