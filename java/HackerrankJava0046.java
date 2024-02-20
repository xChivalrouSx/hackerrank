import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Scanner;

import javax.xml.bind.DatatypeConverter;

public class HackerrankJava0046 {

	public static void main(String[] args) throws NoSuchAlgorithmException {
		// Java SHA-256
		// https://www.hackerrank.com/challenges/sha-256/problem?isFullScreen=true

		Scanner scanner = new Scanner(System.in);

		MessageDigest md = MessageDigest.getInstance("SHA-256");
		md.update(scanner.next().getBytes());
		String hash = DatatypeConverter.printHexBinary(md.digest()).toLowerCase();
		System.out.println(hash);

		scanner.close();
	}

}