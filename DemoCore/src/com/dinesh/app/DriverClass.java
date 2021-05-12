package com.dinesh.app;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.List;

public class DriverClass {

	public static void main(String args[]) throws ParseException {

		String sDate1="31/12/1998";  
		Date date1=new SimpleDateFormat("dd/MM/yyyy").parse(sDate1); 

		String sDate2="05/08/1998";  
		Date date2=new SimpleDateFormat("dd/MM/yyyy").parse(sDate2); 

		String sDate3="12/10/1999";  
		Date date3=new SimpleDateFormat("dd/MM/yyyy").parse(sDate3); 

		Movie m = new Movie(2010,"Aliens",8.3f,date1);
		Movie m1 = new Movie(1988,"Predator",7.8f,date2);
		Movie m2 = new Movie(2020,"Rain Man",8.0f,date3);

		List<Movie> movieLst = new ArrayList<>();
		movieLst.add(m);
		movieLst.add(m1);
		movieLst.add(m2);

		System.out.println("Print List before sort ::");
		System.out.println("==========================");
		movieLst.forEach(o -> System.out.println(o));
		System.out.println();
		Collections.sort(movieLst);
		System.out.println("Print List after sort ::");
		System.out.println("==========================");
		movieLst.forEach(o -> System.out.println(o));
		System.out.println();
		System.out.println("Print List after Name sort ::");
		System.out.println("==========================");
		NameCompare nc = new NameCompare();
		Collections.sort(movieLst, nc);
		movieLst.forEach(o -> System.out.println(o));
		System.out.println();
		System.out.println("Print List after Rating sort ::");
		System.out.println("==========================");
		RatingCompare rc = new RatingCompare();
		Collections.sort(movieLst, rc);
		movieLst.forEach(o -> System.out.println(o));
		System.out.println();
		System.out.println("Print List after Date sort ::");
		System.out.println("==========================");
		DateCompare dc = new DateCompare();
		Collections.sort(movieLst, dc);
		movieLst.forEach(o -> System.out.println(o));

		//code snippet to check Exception handling
		try {
			CheckArray a = new CheckArray();
			a.checkArrayFunc(0);
		}catch(Exception e) {
			System.out.println("Exception : "+e);
		}
	}
}
