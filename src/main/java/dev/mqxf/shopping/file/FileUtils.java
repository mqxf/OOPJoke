package dev.mqxf.shopping.file;

public interface FileUtils {

	public void write(String s);

	public void write(Object o);

	public String read();

	public void writeArray(String[] data);

	public String getFilename();

	public void setFilename(String filename);

}
