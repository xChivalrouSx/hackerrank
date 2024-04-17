import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class HackerrankPsAlgorithms0057 {
	// Cavity Map
	// https://www.hackerrank.com/challenges/cavity-map/problem?isFullScreen=true

	// --- You need to fill this method ---
	public static List<String> cavityMap(List<String> grid) {
		List<String> resultGrid = new ArrayList<>();

		List<Integer> integerListToGetMax = new ArrayList<>();
		for (int i = 0; i < grid.size(); i++) {
			if (i == 0 || i == grid.size() - 1) {
				continue;
			}
			String rowString = grid.get(i).substring(1, grid.get(i).length() - 1);
			integerListToGetMax.addAll(Arrays.asList(rowString.split("")).stream().map(x -> Integer.parseInt(x.toString())).collect(Collectors.toList()));
		}

		int max = integerListToGetMax.stream().max(Integer::compare).orElse(0);
		if (integerListToGetMax.stream().allMatch(x -> x == max)) {
			return grid;
		}

		for (int i = 0; i < grid.size(); i++) {
			if (i == 0 || i == grid.size() - 1) {
				resultGrid.add(grid.get(i));
				continue;
			}
			String rowString = grid.get(i).substring(1, grid.get(i).length() - 1);
			List<String> tmpStringList = Arrays.asList(rowString.split(""))
					.stream().map(x -> {
						String xString = String.valueOf(x);
						if (Integer.parseInt(xString) == max) {
							return "X";
						}
						return xString;
					}).collect(Collectors.toList());

			String tmpString = grid.get(i).substring(0, 1);
			tmpString += String.join("", tmpStringList);
			tmpString += grid.get(i).substring(grid.get(i).length() - 1, grid.get(i).length());
			resultGrid.add(tmpString);
		}
		return resultGrid;
	}

	public static void main(String[] args) throws IOException {
		cavityMap(Arrays.asList("99999", "99999", "99999", "99999", "99999"));
		// BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
		// BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

		// int n = Integer.parseInt(bufferedReader.readLine().trim());

		// List<String> grid = IntStream.range(0, n).mapToObj(i -> {
		// try {
		// return bufferedReader.readLine();
		// } catch (IOException ex) {
		// throw new RuntimeException(ex);
		// }
		// })
		// .collect(Collectors.toList());

		// List<String> result = cavityMap(grid);

		// bufferedWriter.write(
		// result.stream()
		// .collect(Collectors.joining("\n"))
		// + "\n");

		// bufferedReader.close();
		// bufferedWriter.close();
	}

}
