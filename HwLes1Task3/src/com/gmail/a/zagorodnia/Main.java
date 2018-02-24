package com.gmail.a.zagorodnia;

public class Main {

	public static void main(String[] args) {
		
		Vector3d vectorOne  = new Vector3d(18, 11, 12.5);
        Vector3d vectorTwo = new Vector3d(26, 14, 9.5);
        Vector3d vectorThree = vectorOne.vectAddition(vectorTwo);
        Vector3d vectorFour = vectorOne.scalarProd(vectorTwo);
        Vector3d vectorFive = vectorOne.vectorProd(vectorTwo);

        System.out.println(vectorOne);
        System.out.println(vectorTwo);
        System.out.println(vectorThree);
        System.out.println(vectorFour);
        System.out.println(vectorFive);
       
	}

}
