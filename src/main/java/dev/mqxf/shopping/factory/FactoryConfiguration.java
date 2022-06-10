package dev.mqxf.shopping.factory;

import dev.mqxf.shopping.data.ItemFactoryType;
import dev.mqxf.shopping.file.FileUtilsFactoryType;

import java.lang.module.Configuration;
import java.util.Objects;
import java.util.UUID;

public class FactoryConfiguration {

	private ItemFactoryType itemFactoryType;
	private FactoryConfigurationFactoryType factoryConfigurationFactoryType;
	private FileUtilsFactoryType fileUtilsFactoryType;
	private String name;
	private Factory factory;
	private int id;
	private long classifier;
	private UUID uuid;
	private Configuration config;

	public FactoryConfiguration(final ItemFactoryType itemFactoryType, final FactoryConfigurationFactoryType factoryConfigurationFactoryType, final FileUtilsFactoryType fileUtilsFactoryType, final String name, final Factory factory, final int id, final long classifier, final UUID uuid, final Configuration config) {
		this.itemFactoryType = itemFactoryType;
		this.factoryConfigurationFactoryType = factoryConfigurationFactoryType;
		this.fileUtilsFactoryType = fileUtilsFactoryType;
		this.name = name;
		this.factory = factory;
		this.id = id;
		this.classifier = classifier;
		this.uuid = uuid;
		this.config = config;
	}

	public FactoryConfiguration() {
	}

	public ItemFactoryType getItemFactoryType() {
		return itemFactoryType;
	}

	public void setItemFactoryType(final ItemFactoryType itemFactoryType) {
		this.itemFactoryType = itemFactoryType;
	}

	public FactoryConfigurationFactoryType getFactoryConfigurationFactoryType() {
		return factoryConfigurationFactoryType;
	}

	public void setFactoryConfigurationFactoryType(final FactoryConfigurationFactoryType factoryConfigurationFactoryType) {
		this.factoryConfigurationFactoryType = factoryConfigurationFactoryType;
	}

	public FileUtilsFactoryType getFileUtilsFactoryType() {
		return fileUtilsFactoryType;
	}

	public void setFileUtilsFactoryType(final FileUtilsFactoryType fileUtilsFactoryType) {
		this.fileUtilsFactoryType = fileUtilsFactoryType;
	}

	public String getName() {
		return name;
	}

	public void setName(final String name) {
		this.name = name;
	}

	public Factory getFactory() {
		return factory;
	}

	public void setFactory(final Factory factory) {
		this.factory = factory;
	}

	public int getId() {
		return id;
	}

	public void setId(final int id) {
		this.id = id;
	}

	public long getClassifier() {
		return classifier;
	}

	public void setClassifier(final long classifier) {
		this.classifier = classifier;
	}

	public UUID getUuid() {
		return uuid;
	}

	public void setUuid(final UUID uuid) {
		this.uuid = uuid;
	}

	public Configuration getConfig() {
		return config;
	}

	public void setConfig(final Configuration config) {
		this.config = config;
	}

	@Override
	public boolean equals(final Object o) {
		if (this == o) return true;
		if (!(o instanceof FactoryConfiguration)) return false;
		final FactoryConfiguration that = (FactoryConfiguration) o;
		return getId() == that.getId() && getClassifier() == that.getClassifier() && getItemFactoryType() == that.getItemFactoryType() && getFactoryConfigurationFactoryType() == that.getFactoryConfigurationFactoryType() && getFileUtilsFactoryType() == that.getFileUtilsFactoryType() && Objects.equals(getName(), that.getName()) && Objects.equals(getFactory(), that.getFactory()) && Objects.equals(getUuid(), that.getUuid()) && Objects.equals(getConfig(), that.getConfig());
	}

	@Override
	public int hashCode() {
		return Objects.hash(getItemFactoryType(), getFactoryConfigurationFactoryType(), getFileUtilsFactoryType(), getName(), getFactory(), getId(), getClassifier(), getUuid(), getConfig());
	}

	@Override
	public String toString() {
		return "FactoryConfiguration{" +
				"itemFactoryType=" + itemFactoryType +
				", factoryConfigurationFactoryType=" + factoryConfigurationFactoryType +
				", fileUtilsFactoryType=" + fileUtilsFactoryType +
				", name='" + name + '\'' +
				", factory=" + factory +
				", id=" + id +
				", classifier=" + classifier +
				", uuid=" + uuid +
				", config=" + config +
				'}';
	}
}
