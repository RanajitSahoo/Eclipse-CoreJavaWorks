package vegetable;

public class Shop {
	
	Vegetable sell(String vegName) {
		if(vegName .equals("tomato") ) {
			return new Tomato();
		}
		if(vegName .equals("potato")) {
			return new Potato();
		}
		return null;
	}

}
