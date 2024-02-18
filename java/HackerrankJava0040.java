import java.util.ArrayDeque;
import java.util.BitSet;
import java.util.Deque;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class HackerrankJava0040 {

	public static void main(String[] args) {
		// Java BitSet
		// https://www.hackerrank.com/challenges/java-bitset/problem?isFullScreen=true

		Scanner scanner = new Scanner(System.in);
		int sizeOfSets = scanner.nextInt();
		int numberOfOperations = scanner.nextInt();

		BitSet bitSet1 = new BitSet(sizeOfSets);
		BitSet bitSet2 = new BitSet(sizeOfSets);
		for (int i = 0; i < numberOfOperations; i++) {
			String operation = scanner.next();
			int set1 = scanner.nextInt();
			int set2 = scanner.nextInt();
			switch (operation) {
			case "AND":
				if (set1 == 1) {
					bitSet1.and(bitSet2);
				} else {
					bitSet2.and(bitSet1);
				}
				break;
			case "OR":
				if (set1 == 1) {
					bitSet1.or(bitSet2);
				} else {
					bitSet2.or(bitSet1);
				}
				break;
			case "XOR":
				if (set1 == 1) {
					bitSet1.xor(bitSet2);
				} else {
					bitSet2.xor(bitSet1);
				}
				break;
			case "FLIP":
				if (set1 == 1) {
					bitSet1.flip(set2);
				} else {
					bitSet2.flip(set2);
				}
				break;
			case "SET":
				if (set1 == 1) {
					bitSet1.set(set2);
				} else {
					bitSet2.set(set2);
				}
				break;
			}
			System.out.println(bitSet1.cardinality() + " " + bitSet2.cardinality());
		}

		scanner.close();
	}

}