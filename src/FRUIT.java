public enum FRUIT {

    // Base prices
    APPLE(35),
    BANANA(20),
    MELON(50),
    LIME(15);

    final int price;

	FRUIT(int price) {
		this.price = price;
	}

    public int getPrice() {
        return price;
    }

}
