package dev.mqxf.shopping.data;

public class ShopItem implements Item {

	private float price;
	private int amount;
	private String name;

	public ShopItem(final float price, final int amount, final String name) {
		this.price = price;
		this.amount = amount;
		this.name = name;
	}

	public ShopItem(final String name) {
		this.name = name;
	}

	public float getPrice() {
		return price;
	}

	public void setPrice(final float price) {
		this.price = price;
	}

	@Override
	public int getAmount() {
		return amount;
	}

	@Override
	public void setAmount(final int amount) {
		this.amount = amount;
	}

	@Override
	public String getName() {
		return name;
	}

	@Override
	public void setName(final String name) {
		this.name = name;
	}
}
