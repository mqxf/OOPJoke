package dev.mqxf.shopping.data;

import dev.mqxf.shopping.exception.IllegalItemArgumentsException;
import dev.mqxf.shopping.exception.IllegalItemTypeException;
import dev.mqxf.shopping.factory.Factory;
import dev.mqxf.shopping.factory.FactoryConfiguration;
import org.jetbrains.annotations.NotNull;

import java.util.List;

public class ItemFactory extends Factory {

	private ItemFactoryType type;
	private List<Item> producedItems;

	public ItemFactory(final ItemFactoryType type, final FactoryConfiguration factoryConfig) {
		super(factoryConfig);
		this.type = type;
	}

	public Item makeItem(final String name, @NotNull final int amount) throws IllegalItemTypeException, IllegalItemArgumentsException {
		if (type == ItemFactoryType.ITEM_FACTORY_TYPE_SHOP_ITEM) {
			return makeItem(name, amount, 0);
		} else if (type == ItemFactoryType.ITEM_FACTORY_TYPE_ITEM) {
			return null;
		} else {
			throw new IllegalItemTypeException("Item type: " + type.name() + ", " + type.ordinal() + "is unknown.");
		}
	}

	public Item makeItem(final String name, @NotNull final int amount, @NotNull final float price) throws IllegalItemArgumentsException {
		if (price < 0 || name.isEmpty() || name.isBlank() || name == null || amount <= 0) {
			throw new IllegalItemArgumentsException("Nothing can be null or less than 0!");
		}
		final ShopItem i = new ShopItem(price, amount, name);
		producedItems.add(i);
		return i;
	}

	public List<Item> getProducedItems() {
		return producedItems;
	}

	public void setItemFactoryType(final ItemFactoryType type) {
		this.type = type;
	}

}
