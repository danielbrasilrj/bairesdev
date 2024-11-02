package com.exercise.jaalamc;

import java.util.Map;

public final class ProfessionName {

	public enum Profession {
		ENGINEER("Engineer"),
		DESIGNER("Designer"),
		DRIVER("Driver"),
		LAWYER("Lawyer");

		private String value;

		private Profession(String value) {
			this.value = value;
		}

		public String getValue() {
			return value;
		}
	}

	Map<String, Profession> map = Map.of(
			"Daniel Carmo", Profession.ENGINEER,
			"John", Profession.DRIVER,
			"Lucy", Profession.DESIGNER
	);

	public String getProfession(String personName) {
		Profession result = map.get( personName );
		return result != null
				? result.getValue() : "Not found";
	}

	public static void main(String[] args) {
		ProfessionName object = new ProfessionName();
		System.out.println( object.getProfession( "Daniel Carmo" ) );
		System.out.println( object.getProfession( "Blah" ) );
	}
}
