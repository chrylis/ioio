package ioio.lib.spi;

import java.util.NoSuchElementException;
import java.util.ServiceLoader;

import ioio.lib.api.Logger;

public final class LoggerProvider {
	public static final Logger INSTANCE;

	static {
		Logger instance = null;
		
		try {
			instance = ServiceLoader.load(Logger.class).iterator().next();
		} catch (NoSuchElementException e) {
			System.err
					.println("ERROR: Could not load a Logger for this platform.");
			e.printStackTrace();
		}
		
		INSTANCE = instance;
	}
}
