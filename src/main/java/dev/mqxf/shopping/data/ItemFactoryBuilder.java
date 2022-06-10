package dev.mqxf.shopping.data;

import dev.mqxf.shopping.factory.Factory;
import dev.mqxf.shopping.factory.FactoryConfigurationFactory;
import dev.mqxf.shopping.factory.FactoryConfigurationFactoryType;
import dev.mqxf.shopping.file.FileUtilsFactoryType;

import java.util.UUID;

public class ItemFactoryBuilder {

	public static ItemFactory makeShopItemFactory() {
		final FactoryConfigurationFactory factoryConfigurationFactory = new FactoryConfigurationFactory();
		factoryConfigurationFactory.produceFactoryConfiguration();
		factoryConfigurationFactory.getFactoryConfiguration().setFactory(new Factory(new FactoryConfigurationFactory().getFactoryConfiguration()));
		factoryConfigurationFactory.getFactoryConfiguration().setFactoryConfigurationFactoryType(FactoryConfigurationFactoryType.FACTORY_CONFIGURATION_FACTORY_TYPE_NULL);
		factoryConfigurationFactory.getFactoryConfiguration().setConfig(null);
		factoryConfigurationFactory.getFactoryConfiguration().setItemFactoryType(ItemFactoryType.ITEM_FACTORY_TYPE_SHOP_ITEM);
		factoryConfigurationFactory.getFactoryConfiguration().setName(new Factory(null).toString());
		factoryConfigurationFactory.getFactoryConfiguration().setClassifier(1000000);
		factoryConfigurationFactory.getFactoryConfiguration().setFileUtilsFactoryType(FileUtilsFactoryType.FILE_UTILS_FACTORY_TYPE_NULL);
		factoryConfigurationFactory.getFactoryConfiguration().setId(1);
		factoryConfigurationFactory.getFactoryConfiguration().setUuid(UUID.randomUUID());
		final ItemFactory itemFactory = new ItemFactory(ItemFactoryType.ITEM_FACTORY_TYPE_SHOP_ITEM, factoryConfigurationFactory.getFactoryConfiguration());
		return itemFactory;
	}

}
