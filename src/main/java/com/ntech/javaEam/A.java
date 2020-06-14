package com.ntech.javaEam;

import lombok.Data;

@Data
public class A {
	private X x;

	public void setX(X x) {
		this.x = x;
	}

	public void print(){
		int total = x.total();
		System.out.println("total = " + total);
	}
}
