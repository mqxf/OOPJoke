package dev.mqxf.shopping.file;

import dev.mqxf.shopping.exception.IllegalFactoryProductTypeException;
import dev.mqxf.shopping.factory.Factory;
import dev.mqxf.shopping.factory.FactoryConfiguration;

import java.util.List;

public class FileUtilsFactory extends Factory {

	FileUtilsFactoryType type;
	List<ShoppingListFileUtils> producedShoppingListFileUtils;
	List<ShoppingListDataFileUtils> producedShoppingListDataFileUtils;

	public FileUtilsFactory(final FileUtilsFactoryType type, final FactoryConfiguration factoryConfiguration) {
		super(factoryConfiguration);
		this.type = type;
	}

	public ShoppingListDataFileUtils makeShoppingListDataFileUtils(final String filename) throws IllegalFactoryProductTypeException {
		if (type == FileUtilsFactoryType.FILE_UTILS_FACTORY_TYPE_SHOPPING_LIST_DATA) {
			final ShoppingListDataFileUtils shoppingListDataFileUtils = new ShoppingListDataFileUtils(filename);
			producedShoppingListDataFileUtils.add(shoppingListDataFileUtils);
			return shoppingListDataFileUtils;
		} else {
			throw new IllegalFactoryProductTypeException("This factory produces non data files!");
		}
	}

}
