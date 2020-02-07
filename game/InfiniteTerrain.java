package com.qa.game;

import java.util.Scanner;

/**
 * Using a simple Cartesian graph to model north,south,east and west. 
 * Let north advancements be denoted by a positive "y value."
 * Let south advancements be denoted by a negative "y value."
 * Let east advancements be denoted by a positive "x value." 
 * Let west advancements be denoted by a negative "x value."
 *
 * @author Haziq
 *
 */

public class InfiniteTerrain {
	public void terrain(double Position_of_POIX, double Position_of_POIY) {

		for (;;) {
			System.out.println("Enter your x value:");
			Scanner scanner = new Scanner(System.in);
			System.out.println(Position_of_POIX - scanner.nextDouble());
			System.out.println("Enter your y value:");
			System.out.println(Position_of_POIY - scanner.nextDouble());
			
			if ((Position_of_POIX - scanner.nextDouble() == 0 && Position_of_POIY - scanner.nextDouble() != 0)
					|| (Position_of_POIX - scanner.nextDouble() != 0 && Position_of_POIY - scanner.nextDouble() == 0)) {

				System.out.println("Enter your x value:");

				System.out.println(Position_of_POIX - scanner.nextDouble() - scanner.nextDouble());
				System.out.println("Enter your y value:");
				System.out.println(Position_of_POIY - scanner.nextDouble() - scanner.nextDouble());

			}
			else {
				System.out.println("You Win");
			}
		}
	}
}
