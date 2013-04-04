package ioio.lib.api;

public interface Logger {
	public int println(int priority, String tag, String msg);
	
	public void e(String tag, String message);

	public void e(String tag, String message, Throwable tr);

	public void w(String tag, String message);

	public void w(String tag, String message, Throwable tr);

	public void i(String tag, String message);

	public void d(String tag, String message);

	public void v(String tag, String message);
}
