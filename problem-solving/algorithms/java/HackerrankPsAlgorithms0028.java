import static java.util.stream.Collectors.toList;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.List;
import java.util.stream.Stream;

class Result {

	// Designer PDF Viewer
	// https://www.hackerrank.com/challenges/designer-pdf-viewer/problem?isFullScreen=true

	// --- You need to fill this method ---
	public static int designerPdfViewer(List<Integer> h, String word) {
		int maxHeight = word.chars().map(charItem -> h.get(charItem - 'a')).max().orElse(0);
		return maxHeight * word.length();
	}

}

public class HackerrankPsAlgorithms0028 {

	public static void main(String[] args) throws IOException {
		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

		List<Integer> h = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
				.map(Integer::parseInt)
				.collect(toList());

		String word = bufferedReader.readLine();

		int result = Result.designerPdfViewer(h, word);

		bufferedWriter.write(String.valueOf(result));
		bufferedWriter.newLine();

		bufferedReader.close();
		bufferedWriter.close();
	}

}