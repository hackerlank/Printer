package priv.aim.print;

import java.io.PrintStream;
import java.util.Locale;

public class Printer {

	public static void main(String[] args) {
		Printer.println("开启");
		Printer.off();
		Printer.print(true);
		Printer.on();
		Printer.print(111);
		Printer.print(23);
	}

	private static ThreadLocal<PrinterConfig> threadLocal = new ThreadLocal<>();
	private static PrintStream ps = System.out;
	private static boolean open = true;

	public static void on() {
		open = true;		
	}

	public static void off() {
		open = false;
	}

	public static boolean isOpen() {
		return open;
	}

	public static PrintStream append(char c) {
		if (!open)
			return ps;
		return ps.append(c);
	}

	public static PrintStream append(CharSequence csq) {
		if (!open)
			return ps;
		return ps.append(csq);
	}

	public static PrintStream append(CharSequence csq, int start, int end) {
		if (!open)
			return ps;
		return ps.append(csq, start, end);
	}

	public static boolean checkError() {
		return ps.checkError();
	}

	public static void close() {
		if (!open)
			return;
		ps.close();
	}

	public static void flush() {
		if (!open)
			return;
		ps.flush();
	}

	public static PrintStream format(String format, Object... args) {
		if (!open)
			return ps;
		return ps.format(format, args);
	}

	public static PrintStream format(Locale l, String format, Object... args) {
		if (!open)
			return ps;
		return ps.format(l, format, args);
	}

	public static void print(boolean b) {
		if (!open)
			return;
		ps.print(b);
	}

	public static void print(char c) {
		if (!open)
			return;
		ps.print(c);
	}

	public static void print(char[] s) {
		if (!open)
			return;
		ps.print(s);
	}

	public static void print(double d) {
		if (!open)
			return;
		ps.print(d);
	}

	public static void print(float f) {
		if (!open)
			return;
		ps.print(f);
	}

	public static void print(int i) {
		if (!open)
			return;
		ps.print(i);
	}

	public static void print(Object o) {
		if (!open)
			return;
		ps.print(o);
	}

	public static void print(String s) {
		if (!open)
			return;
		ps.print(s);
	}

	public static void print(long l) {
		if (!open)
			return;
		ps.print(l);
	}

	public static void printf(String format, Object... args) {
		if (!open)
			return;
		ps.printf(format, args);
	}

	public static void printf(Locale l, String format, Object... args) {
		if (!open)
			return;
		ps.printf(l, format, args);
	}

	public static void println() {
		if (!open)
			return;
		ps.println();
	}

	public static void println(boolean x) {
		if (!open)
			return;
		ps.println(x);
	}

	public static void println(char c) {
		if (!open)
			return;
		ps.println(c);
	}

	public static void println(char[] c) {
		if (!open)
			return;
		ps.println(c);
	}

	public static void println(double d) {
		if (!open)
			return;
		ps.println(d);
	}

	public static void println(float f) {
		if (!open)
			return;
		ps.println(f);
	}

	public static void println(int i) {
		if (!open)
			return;
		ps.println(i);
	}

	public static void println(Object x) {
		if (!open)
			return;
		ps.println(x);
	}

	public static void println(String s) {
		if (!open)
			return;
		ps.println(s);
	}

	public static void println(long l) {
		if (!open)
			return;
		ps.println(l);
	}

	public static void write(byte buf[], int off, int len) {
		if (!open)
			return;
		ps.write(buf, off, len);
	}

	public static void write(int b) {
		if (!open)
			return;
		ps.write(b);
	}

}
