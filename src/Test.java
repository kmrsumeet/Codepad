import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.Map.Entry;
import java.util.OptionalDouble;

public class Test {

	private static Map<String, LinkedList<Integer>> db;

	public static void main(String[] args) {

		db = new HashMap<>();

		addStudent("sumeet", 49);
		addStudent("raghav", 10);
		addStudent("sadda", 70);
		addStudent("chadda", 90);
		addStudent("chadda", 20);
		addStudent("honey", 75);
		addStudent("raghav", 25);
		addStudent("sushil", 95);
		addStudent("raghav", 25);
		addStudent("sushil", 90);

		System.out.println(db);

		String maxAvg = findMaxAverage();

		System.out.println(maxAvg);
	}

	private static String findMaxAverage() {

		String name = "";

		double maxAvg = Integer.MIN_VALUE;

		for (Entry<String, LinkedList<Integer>> curr : db.entrySet()) {

			int sum = curr.getValue().stream().mapToInt(i -> i.intValue()).sum();
			int count = curr.getValue().size();

			
			double avg = sum / count;

			if (avg > maxAvg) {
				maxAvg = avg;
				name = curr.getKey();

				System.out.println(maxAvg);
			}

		}

		return name;
	}

	private static void addStudent(String name, int marks) {
		// TODO Auto-generated method stub

		if (db.containsKey(name)) {
			LinkedList<Integer> list = db.get(name);
			list.add(marks);
			db.put(name, list);
		} else {
			LinkedList<Integer> list = new LinkedList<>();
			list.add(marks);
			db.put(name, list);
		}

	}

}
