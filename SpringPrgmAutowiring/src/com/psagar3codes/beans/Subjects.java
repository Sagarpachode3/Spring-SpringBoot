package com.psagar3codes.beans;

import java.util.ArrayList;
import java.util.List;

public class Subjects {
	
	List<String> sub = new ArrayList<String>();

	public List<String> getSub() {
		return sub;
	}

	public void setSub(List<String> sub) {
		this.sub = sub;
	}

	@Override
	public String toString() {
		return "" + sub + "";
	}	
}
