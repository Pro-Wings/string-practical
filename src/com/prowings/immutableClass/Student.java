package com.prowings.immutableClass;

public final class Student {
	
	private final int roll;
	private final String name;
	private final Address address;
	
	public Student() {
		this.roll = 0;
		this.name = "";
		this.address = new Address();
	}

	public Student(int roll, String name, Address address) {
		super();
		this.roll = roll;
		this.name = name;
		
		Address clonedAddress = new Address();
		clonedAddress.city = address.getCity();
		clonedAddress.country = address.getCountry();
		clonedAddress.pin = address.getPin();
		
//		this.address = address;
		
		this.address = clonedAddress;
	}

	public int getRoll() {
		return roll;
	}

//	public void setRoll(int roll) {
//		this.roll = roll;
//	}

	public String getName() {
		return name;
	}

//	public void setName(String name) {
//		this.name = name;
//	}

	public Address getAddress() {
		
		Address dummyAddress = new Address();
		dummyAddress.setCity(this.address.getCity());
		dummyAddress.setCountry(this.address.getCountry());
		dummyAddress.setPin(this.address.getPin());
//		return address;
		return dummyAddress;
	}


//	public void setAddress(String address) {
//		this.address = address;
//	}

	@Override
	public String toString() {
		return "Student [roll=" + roll + ", name=" + name + ", address=" + address + "]";
	}
	
}
