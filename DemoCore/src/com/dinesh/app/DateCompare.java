package com.dinesh.app;

import java.util.Comparator;

public class DateCompare implements Comparator<Movie>{
	
	public int compare(Movie m1, Movie m2) {
		if(m1.getDt().before(m2.getDt()))
			return -1;
		else if(m1.getDt().after(m2.getDt()))
			return 1;
		else
			return 0;
	}

}
