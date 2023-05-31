package org.lessons.java;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

/**
 * Scrivere un programma che chiede all'utente un numero N e
 * genera un array di interi contenente N numeri casuali.
 * 
 * Trovare all'interno dell'array qual è la lunghezza della
 * più lunga sequenza consecutiva dello stesso numero e qual è il numero.
 * Ad esempio nell'array:
 * 
 *  [1, 3, 4, 4, 4, 5, 1, 6, 6, 7, 7, 7, 7, 1]
 *  
 * La sequenza più lunga è del numero 7 ed è composta da 4 elementi.
 *
 */
public class LongestConsecutiveSequence {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Random random = new Random();
		
		System.out.print("Quanti numeri vuoi nell'array? ");
		int n = scanner.nextInt();
		scanner.close();
		
		int[] numbers = new int[n];
		
		for (int i = 0; i < numbers.length; i++) {
			int numeroRandom = random.nextInt(5);
			numbers[i] = numeroRandom;
		}
		
		System.out.println(Arrays.toString(numbers));
		
		int prec = numbers[0];
		int sequenceLength = 0;
		int longestSequence = 0;
		int longestSequenceNumber = 0;
		
		for (int i = 0; i < numbers.length; i++) {
			if (numbers[i] == prec) {
				sequenceLength++;
				
				if (sequenceLength >= longestSequence) {
					longestSequence = sequenceLength;
					longestSequenceNumber = prec;
				}
			} else {
				sequenceLength = 1;
				prec = numbers[i];
			}
		}
		
		System.out.println(longestSequence);
		System.out.println(longestSequenceNumber);
	}
}
