package bitwise;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MyDate implements Comparable<MyDate> {
	private int date;

	public MyDate(int day, int month, int year) {
		setDay(day);
		setMonth(month);
		setYear(year);
	}

	public void setDay(int day) {
		int mask = ~31;
		// clear
		this.date = this.date & mask;
		this.date = this.date | day;
	}

	public void setMonth(int month) {
		int mask = ~(15 << 5);
		// clear
		this.date = this.date & mask;
		month = month << 5;
		this.date = this.date | month;
	}

	public void setYear(int year) {
		int mask = ~(4095 << 9);
		// clear
		this.date = this.date & mask;
		year = year << 9;
		this.date = this.date | year;
	}

	public int getDay() {
		int mask = 31;
		return this.date & mask;
	}

	public int getMonth() {
		int mask = 15;
		return (this.date >> 5) & mask;
	}

	public int getYear() {
		return this.date >> 9;
	}

	@Override
	public String toString() {
		return getDay() + "/" + getMonth() + "/" + getYear();
	}

	@Override
	public int compareTo(MyDate that) {
		return this.date - that.date;
	}

	public static void main(String[] args) {
		MyDate md = new MyDate(7, 12, 1996);
		MyDate md1 = new MyDate(18, 1, 1998);
		MyDate md2 = new MyDate(22, 9, 1997);

		List<MyDate> list = new ArrayList<>();
		list.add(md);
		list.add(md1);
		list.add(md2);

		Collections.sort(list);
		for (MyDate m : list) {
			System.out.println(m);
		}

	}

}
