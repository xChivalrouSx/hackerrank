import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Scanner;

import javax.xml.bind.DatatypeConverter;

public class HackerrankJava0045 {

	public static void main(String[] args) throws NoSuchAlgorithmException {
		// Java MD5
		// https://www.hackerrank.com/challenges/java-md5/problem?isFullScreen=true

		Scanner scanner = new Scanner(System.in);

		MessageDigest md = MessageDigest.getInstance("MD5");
		md.update(scanner.next().getBytes());
		String hash = DatatypeConverter.printHexBinary(md.digest()).toLowerCase();
		System.out.println(hash);

		scanner.close();
	}

}