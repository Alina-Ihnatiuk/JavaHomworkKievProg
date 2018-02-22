package com.gmail.a.zagorodnia;

import java.util.Comparator;

public class StudentsComparator implements Comparator {
	
	private SortType sortType;
		

	public StudentsComparator(SortType sortType) {
		super();
		this.sortType = sortType;
	}


	@Override
	public int compare(Object o1, Object o2) {
		
		Student stOne = (Student) o1;
		Student stTwo = (Student) o2;
		
		if (NullChecker.checkNull(stOne, stTwo) != NullChecker.NOT_NULL ) {
			
			return NullChecker.checkNull(stOne, stTwo);
		}
		
		switch (sortType) {
		
			case SURNAME:
				return (stOne.getSurname().compareTo(stTwo.getSurname()));
            
			case SCORE:
				return (int) (stOne.getAverageScore() - stTwo.getAverageScore());
				
			case AGE:
				return (stOne.getAge() - stTwo.getAge());
		}
		
		return 0;
		
		
	}
	
	
	

	
	
	
	
}
