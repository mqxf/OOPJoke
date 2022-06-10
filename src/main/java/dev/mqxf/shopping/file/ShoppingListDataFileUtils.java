package dev.mqxf.shopping.file;

import dev.mqxf.shopping.data.ShopItem;
import org.bspfsystems.yamlconfiguration.configuration.InvalidConfigurationException;
import org.bspfsystems.yamlconfiguration.file.YamlConfiguration;

import java.io.File;
import java.io.IOException;
import java.util.List;

public class ShoppingListDataFileUtils extends ItemFileUtils {

	public ShoppingListDataFileUtils(final String filename) {
		super(filename);
	}

	public void addItem(final ShopItem item) {
		final YamlConfiguration config = new YamlConfiguration();
		try {
			config.load(new File(filename));
		} catch (IOException | InvalidConfigurationException e) {
			e.printStackTrace();
		}

		if (!config.contains("itemNum")) {
			config.set("itemNum", 0);
		} else {
			config.set("itemNum", config.getInt("itemNum") + 1);
		}

		final String basePath = "item-" + config.getInt("itemNum") + ".";

		config.set(basePath + "name", item.getName());
		config.set(basePath + "price", item.getPrice());
		config.set(basePath + "amount", item.getAmount());

		try {
			config.save(new File(filename));
		} catch (final IOException e) {
			e.printStackTrace();
		}

	}

	public void addItemList(final List<ShopItem> items) {
		for (final ShopItem item : items) {
			addItem(item);
		}
	}

	public ShopItem getItem(final int line) {

		return null;
	}

	public List<ShopItem> getItems(final String filename) {

		return null;
	}

}
