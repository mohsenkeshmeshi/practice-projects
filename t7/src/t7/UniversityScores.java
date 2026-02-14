package t7;

import java.util.Arrays;

public class UniversityScores {

	public static void main(String[] args) {
		int[] scores = {18,15,17,19,14,20,12,16,13,10};
		
		double sum = 0;
		 for(int s : scores) {
			 sum += s;
		 }
		 double avg = sum / scores.length;
		 
		int max = scores[0];
		int min = scores[0];
		for(int s : scores) {
			if(s > max) max = s;
			if(s < min) min = s;
		}
		Arrays.sort(scores);
		
		System.out.println("میانگین نمرات : "+avg);
		System.out.println("بالاترین نمره : "+max);
		System.out.println("کمترین نمره : "+min);
		System.out.println("نمرات مرتب شده : "+Arrays.toString(scores));
		
		int[][] courseScores = {
				{17,16,14,13,19},
				{13,14,18,16,15},
				{19,16,12,17,20}
		};
		System.out.println("میانگین هر درس :");
		
		for(int i = 0; i < courseScores.length; i++) {
			int[] course = courseScores[i];
			double courseSum = 0;
			for(int c : course) {
				courseSum += c;
			}
			double courseAvg = courseSum / course.length;
			System.out.println("میانگین درس "+(i + 1)+": "+ courseAvg);
		}

	}

}
