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

		List<List<String>> gridList = new ArrayList<>();
		gridList.addAll(grid.stream().map(x -> Arrays.asList(x.split(""))).collect(Collectors.toList()));

		for (int i = 0; i < gridList.size(); i++) {
			if (i == 0 || i == gridList.size() - 1) {
				resultGrid.add(grid.get(i));
				continue;
			} else {
				List<String> gridListItem = gridList.get(i);
				StringBuilder tmpValue = new StringBuilder();
				for (int j = 0; j < gridListItem.size(); j++) {
					int currentValue = Integer.parseInt(gridListItem.get(j));
					if (j == 0 || j == gridListItem.size() - 1) {
						tmpValue.append(gridListItem.get(j));
					} else {
						int rightValue = Integer.parseInt(gridListItem.get(j + 1));
						int leftValue = Integer.parseInt(gridListItem.get(j - 1));
						int topValue = Integer.parseInt(gridList.get(i - 1).get(j));
						int bottomValue = Integer.parseInt(gridList.get(i + 1).get(j));
						if (currentValue > rightValue &&
								currentValue > leftValue &&
								currentValue > topValue &&
								currentValue > bottomValue) {
							tmpValue.append("X");
						} else {
							tmpValue.append(gridListItem.get(j));
						}
					}
				}
				resultGrid.add(tmpValue.toString());
			}
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
