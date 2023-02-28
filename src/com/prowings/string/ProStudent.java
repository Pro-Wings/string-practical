package com.prowings.string;

import java.util.Objects;

public class ProStudent {

	int roll;
	String name;

	public ProStudent() {
	}

	public ProStudent(int roll, String name) {
		super();
		this.roll = roll;
		this.name = name;
	}

	@Override
	public String toString() {
		return "ProStudent [roll=" + roll + ", name=" + name + "]";
	}

	@Override
	public int hashCode() {
		int res = 1;
		res = roll * 31 + name.hashCode() * 31;

		return res;
	}

	@Override
	public boolean equals(Object obj) {
		ProStudent otherStd = (ProStudent) obj;

		boolean res = false;

		if (this.roll == otherStd.roll) {
			if (this.name.equals(otherStd.name))
				res = true;
		} else
			res = false;
		return res;
	}

}
