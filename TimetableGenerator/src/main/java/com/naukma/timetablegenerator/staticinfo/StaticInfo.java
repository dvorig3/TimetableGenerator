package com.naukma.timetablegenerator.staticinfo;

public interface StaticInfo {
	// Validation constraint for property Lector.id
	int LECTOR_ID_MIN_VALUE = 0;
	
	// Validation constraint for property Lector.id 
	int LECTOR_ID_SUPER_VALUE = 0;

	// Validation constraint for property Lector.firstName
	int LECTOR_FIRST_NAME_MIN_VALUE = 1;
	
	// Validation constraint for property Lector.firstName 
	int LECTOR_FIRST_NAME_MAX_VALUE = 25;
	
	// Validation constraint for property Lector.lastName
	int LECTOR_LAST_NAME_MIN_VALUE = 1;
	
	// Validation constraint for property Lector.lastName 
	int LECTOR_LAST_NAME_MAX_VALUE = 60;
	
	// Validation constraint for property Lector.degree
	int LECTOR_LAST_DEGREE_VALUE = 1;
	
	// Validation constraint for property Lector.degree 
	int LECTOR_DEGREE_MAX_VALUE = 25;
}
