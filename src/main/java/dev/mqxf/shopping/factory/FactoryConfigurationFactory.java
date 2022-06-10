package dev.mqxf.shopping.factory;

public class FactoryConfigurationFactory {

	private FactoryConfiguration factoryConfig;

	public FactoryConfigurationFactory() {
		factoryConfig = new FactoryConfiguration();
	}

	public FactoryConfiguration getFactoryConfiguration() {
		return factoryConfig;
	}

	public void produceFactoryConfiguration() {
		factoryConfig = new FactoryConfiguration();
	}

}
