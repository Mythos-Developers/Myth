package net.mythos.config;

public class ConfigParam<T> {

	private T value;

	public ConfigParam(T defaultValue) {
		value = defaultValue;
	}

	public T read() {
		return value;
	}

	public void write(T value) {
		this.value = value;
	}

}
