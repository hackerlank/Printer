package priv.aim.print;

import java.io.PrintStream;
import java.util.Locale;

public class Printer {

	public static void main(String[] args) {
		Thread t1 = new Thread(new Runnable() {

			int i = 0;

			@Override
			public void run() {
				// TODO Auto-generated method stub
				Printer.on();
				while (i < 20) {
					try {
						Thread.sleep(1000);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					Printer.println(Thread.currentThread().getId());
					i++;
				}
				Printer.clear();
			}
		});

		Thread t2 = new Thread(new Runnable() {

			private int i = 0;

			@Override
			public void run() {
				// TODO Auto-generated method stub
				Printer.on();
				while (i < 20) {
					try {
						Thread.sleep(1000);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					Printer.off();
					if (i > 3)
						Printer.on();

					Printer.println(Thread.currentThread().getId() + ":" + i);
					i++;
				}
				Printer.clear();
			}
		});
		 t1.start();
		t2.start();
	}

	private static ThreadLocal<PrinterConfig> threadLocal = new ThreadLocal<>();
	private static PrintStream ps = System.out;

	private static PrinterConfig getPrinterConfig() {
		PrinterConfig config = threadLocal.get();
		if (config == null) {
			config = new PrinterConfig();
			threadLocal.set(config);
		}
		return config;
	}

	public static void clear() {
		threadLocal.remove();
	}

	public static void on() {
		getPrinterConfig().on();
	}

	public static void off() {
		getPrinterConfig().off();
	}

	public static boolean isOpen() {
		return getPrinterConfig().isOpen();
	}

	public static PrintStream append(char c) {
		if (!getPrinterConfig().isOpen())
			return ps;
		return ps.append(c);
	}

	public static PrintStream append(CharSequence csq) {
		if (!getPrinterConfig().isOpen())
			return ps;
		return ps.append(csq);
	}

	public static PrintStream append(CharSequence csq, int start, int end) {
		if (!getPrinterConfig().isOpen())
			return ps;
		return ps.append(csq, start, end);
	}

	public static boolean checkError() {
		return ps.checkError();
	}

	public static void close() {
		if (!getPrinterConfig().isOpen())
			return;
		ps.close();
	}

	public static void flush() {
		if (!getPrinterConfig().isOpen())
			return;
		ps.flush();
	}

	public static PrintStream format(String format, Object... args) {
		if (!getPrinterConfig().isOpen())
			return ps;
		return ps.format(format, args);
	}

	public static PrintStream format(Locale l, String format, Object... args) {
		if (!getPrinterConfig().isOpen())
			return ps;
		return ps.format(l, format, args);
	}

	public static void print(boolean b) {
		if (!getPrinterConfig().isOpen())
			return;
		ps.print(b);
	}

	public static void print(char c) {
		if (!getPrinterConfig().isOpen())
			return;
		ps.print(c);
	}

	public static void print(char[] s) {
		if (!getPrinterConfig().isOpen())
			return;
		ps.print(s);
	}

	public static void print(double d) {
		if (!getPrinterConfig().isOpen())
			return;
		ps.print(d);
	}

	public static void print(float f) {
		if (!getPrinterConfig().isOpen())
			return;
		ps.print(f);
	}

	public static void print(int i) {
		if (!getPrinterConfig().isOpen())
			return;
		ps.print(i);
	}

	public static void print(Object o) {
		if (!getPrinterConfig().isOpen())
			return;
		ps.print(o);
	}

	public static void print(String s) {
		if (!getPrinterConfig().isOpen())
			return;
		ps.print(s);
	}

	public static void print(long l) {
		if (!getPrinterConfig().isOpen())
			return;
		ps.print(l);
	}

	public static void printf(String format, Object... args) {
		if (!getPrinterConfig().isOpen())
			return;
		ps.printf(format, args);
	}

	public static void printf(Locale l, String format, Object... args) {
		if (!getPrinterConfig().isOpen())
			return;
		ps.printf(l, format, args);
	}

	public static void println() {
		if (!getPrinterConfig().isOpen())
			return;
		ps.println();
	}

	public static void println(boolean x) {
		if (!getPrinterConfig().isOpen())
			return;
		ps.println(x);
	}

	public static void println(char c) {
		if (!getPrinterConfig().isOpen())
			return;
		ps.println(c);
	}

	public static void println(char[] c) {
		if (!getPrinterConfig().isOpen())
			return;
		ps.println(c);
	}

	public static void println(double d) {
		if (!getPrinterConfig().isOpen())
			return;
		ps.println(d);
	}

	public static void println(float f) {
		if (!getPrinterConfig().isOpen())
			return;
		ps.println(f);
	}

	public static void println(int i) {
		if (!getPrinterConfig().isOpen())
			return;
		ps.println(i);
	}

	public static void println(Object x) {
		if (!getPrinterConfig().isOpen())
			return;
		ps.println(x);
	}

	public static void println(String s) {
		if (!getPrinterConfig().isOpen())
			return;
		ps.println(s);
	}

	public static void println(long l) {
		if (!getPrinterConfig().isOpen())
			return;
		ps.println(l);
	}

	public static void write(byte buf[], int off, int len) {
		if (!getPrinterConfig().isOpen())
			return;
		ps.write(buf, off, len);
	}

	public static void write(int b) {
		if (!getPrinterConfig().isOpen())
			return;
		ps.write(b);
	}

}
