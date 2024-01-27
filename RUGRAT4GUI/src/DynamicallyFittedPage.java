import java.util.HashMap;
import java.util.Map;
import java.util.Random;

public class DynamicallyFittedPage {
	Map<String, ObjectType> objects;

	int pageHeight;
	int pageWidth;
	int noOfObjects;
	int sectionWidth = 100;
	int sectionHeight = 100;
	int i = 0, j = 0;

	private DynamicallyFittedPage(Map<String, ObjectType> objects,
			int pageHeight, int pageWidth) {
		this.objects = objects;
		this.noOfObjects = objects.size();
		this.pageHeight = pageHeight;
		this.pageWidth = pageWidth;
	}

	public Map<String, ObjectType> process() {
		int sections = (pageWidth / sectionWidth)
				* (pageHeight / sectionHeight);
		int actSections = 0;
		for (ObjectType obj : objects.values()) {
			int x = obj.getWidth() / sectionWidth;
			int y = obj.getHeight() / sectionHeight;
			actSections = actSections + x * y;
			obj.setSections(x, y);
			System.out.println(" Object " + obj.getObjectId() + " has " + x
					+ " and " + y + " sections");
		}
		if (actSections > sections) {
			System.out.println("Could not fit");
			return null;
		} else {
			int rem = sections - actSections;
			boolean found = true;
			while (found) {
				found = false;
				for (ObjectType obj : objects.values()) {
					int w = obj.getSectionsW();
					int h = obj.getSectionsH();
					int switcher = new Random().nextInt(2);
					if (switcher ==  0) {
						w = w + 1;
					} else {
						h = h + 1;
					}
					int x = (w * h - obj.getSectionsW() * obj.getSectionsH());
					if (x == 0 || rem - x < 0) {
						continue;
					}
					found = true;
					rem = rem - x;
					obj.setSections(w, h);
					System.out.println(" Setting Object " + obj.getObjectId()
							+ " to have " + w + " and " + h + " sections");
				}

			}
			return objects;
		}
	}

	public static Map<String, ObjectType> doesFit(
			Map<String, ObjectType> objects, int pageHeight, int pageWidth) {
		Map<String, ObjectType> adjusted = new HashMap<String, ObjectType>();
		for (Map.Entry<String, ObjectType> e : objects.entrySet()) {
			adjusted.put(e.getKey(), e.getValue());
		}

		DynamicallyFittedPage f = new DynamicallyFittedPage(adjusted,
				pageHeight, pageWidth);
		return f.process();
	}
}
