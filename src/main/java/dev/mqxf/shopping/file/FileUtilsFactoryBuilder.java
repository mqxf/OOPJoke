package dev.mqxf.shopping.file;

import dev.mqxf.shopping.data.ItemFactoryType;
import dev.mqxf.shopping.exception.IllegalFactoryProductTypeException;
import dev.mqxf.shopping.factory.Factory;
import dev.mqxf.shopping.factory.FactoryConfigurationFactory;
import dev.mqxf.shopping.factory.FactoryConfigurationFactoryType;

import java.util.UUID;

public class FileUtilsFactoryBuilder {

    public static FileUtilsFactory makeFileUtilsFactory(FileUtilsFactoryType type) throws IllegalFactoryProductTypeException {
        final FactoryConfigurationFactory factoryConfigurationFactory = new FactoryConfigurationFactory();
        factoryConfigurationFactory.produceFactoryConfiguration();
        factoryConfigurationFactory.getFactoryConfiguration().setFactory(new Factory(new FactoryConfigurationFactory().getFactoryConfiguration()));
        factoryConfigurationFactory.getFactoryConfiguration().setFactoryConfigurationFactoryType(FactoryConfigurationFactoryType.FACTORY_CONFIGURATION_FACTORY_TYPE_NULL);
        factoryConfigurationFactory.getFactoryConfiguration().setConfig(null);
        factoryConfigurationFactory.getFactoryConfiguration().setItemFactoryType(ItemFactoryType.ITEM_FACTORY_TYPE_NULL);
        factoryConfigurationFactory.getFactoryConfiguration().setName(new Factory(null).toString());
        factoryConfigurationFactory.getFactoryConfiguration().setClassifier(1000000);
        factoryConfigurationFactory.getFactoryConfiguration().setFileUtilsFactoryType(type);
        factoryConfigurationFactory.getFactoryConfiguration().setId(1);
        factoryConfigurationFactory.getFactoryConfiguration().setUuid(UUID.randomUUID());
        if (type == FileUtilsFactoryType.FILE_UTILS_FACTORY_TYPE_NULL || type == null) throw new IllegalFactoryProductTypeException("Cannot be null");
        return new FileUtilsFactory(type, factoryConfigurationFactory.getFactoryConfiguration());
    }

}
