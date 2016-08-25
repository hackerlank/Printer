package priv.aim.print;

public class PrinterConfig {
	private boolean open = true;

	public void on() {
		open = true;
	}

	public void off() {
		open = false;
	}

	public boolean isOpen() {
		return open;
	}
	
}
