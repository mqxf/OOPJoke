package dev.mqxf.shopping.file;

import dev.mqxf.shopping.data.Item;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

public class ItemFileUtils implements FileUtils {

	protected String filename;

	public ItemFileUtils(final String filename) {
		this.filename = filename;
	}

	@Override
	public void write(final String s) {
		write((Object) s);
	}

	@Override
	public void write(final Object o) {
		try {
			final File file = new File(filename);
			final FileWriter fw = new FileWriter(file);
			fw.write(o.toString());
			fw.close();
		} catch (IOException | RuntimeException e) {
			e.printStackTrace();
		}
	}

	@Override
	public String read() {
		return null;
	}

	@Override
	public void writeArray(final String[] data) {

	}

	public List<Object> decompileShopItem(final Item item) {
		return null;
	}

	@Override
	public String getFilename() {
		return filename;
	}

	@Override
	public void setFilename(final String filename) {
		this.filename = filename;
	}
}
