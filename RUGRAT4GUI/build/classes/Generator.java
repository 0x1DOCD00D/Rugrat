import java.io.BufferedWriter;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.List;
import java.util.Map;
import java.util.Random;

public class Generator {
	// common folder in which the application will be created.
	private final String dirPath;
	private final int noOfPages;
	private final int pageWidth;
	private final int pageHeight;
	private final int minObjects;
	private final int maxObjects;
	private final String bgColor;
	private final Hashtable<Integer, List<Integer>> GraphVtoE;

	private Map<Integer, Map<String, ObjectType>> pageObjects = null;

	public Generator(String realPath, int noOfPages, int pageWidth,
			int pageHeight, int minObjects, int maxObjects, String bgColor)
			throws IOException {
		this.dirPath = realPath;
		this.noOfPages = noOfPages;
		this.pageWidth = pageWidth;
		this.pageHeight = pageHeight;
		this.minObjects = minObjects;
		this.maxObjects = maxObjects;
		this.bgColor = bgColor;

		ObjectType.init(realPath + "\\WEB-INF\\generator.cfg");

		GraphVtoE = createRandomTreeWalkGraph(noOfPages);

		// print graph
		for (Integer page : GraphVtoE.keySet()) {
			List<Integer> vals = GraphVtoE.get(page);
			System.out.println("page" + page);
			for (Integer val : vals) {

				System.out.print(" , link= " + val);
			}
			System.out.println();
		}
	}

	public void generateInitialJsps() {
		pageObjects = new HashMap<Integer, Map<String, ObjectType>>();

		// Jsp pages generation
		for (int pageNumber = 1; pageNumber <= noOfPages; pageNumber++) {

			// get list of objects to place on page
			Map<String, ObjectType> objects = findListOfObjectsThatWillFitInPage();

			pageObjects.put(pageNumber, objects);

			generateJsp(pageNumber, pageNumber + ".jsp", objects);
		}
		performPerturbation();
	}

	public void performPerturbation() {
		if (pageObjects == null || pageObjects.isEmpty()) {
			System.out
					.println("Perturbation cannot be performed. Initial Jsps not generated");
		}
		// Jsp pages perturbation
		BufferedWriter writer = null;
		try {
			writer = new BufferedWriter(new FileWriter(new File(dirPath
					+ "\\WEB-INF\\perturbation.txt")));

			Random rand = new Random();
			int numberOfRounds = 3;
			while (numberOfRounds-- > 0) {
				for (int pageNumber = 1; pageNumber <= noOfPages; pageNumber++) {

					// get list of objects to place on page
					Map<String, ObjectType> objects = pageObjects
							.get(pageNumber);

					int choice = rand.nextInt(3);
					int randIndex = rand.nextInt(objects.size());

					switch (choice) {
					case 0: // replace an object with another
					{
						boolean success = false;
						int retry = 5;
						String objId = (String) objects.keySet().toArray()[randIndex];
						ObjectType oldObj = objects.get(objId);
						ObjectType newObj = null;

						while (!success && retry-- > 0) {
							newObj = ObjectType.getObject(randIndex);
							if (newObj.getMinWidth() <= oldObj.getRealWidth()
									&& newObj.getMinHeight() <= oldObj
											.getRealHeight()) {
								newObj.setHeight(oldObj.getHeight());
								newObj.setWidth(oldObj.getWidth());
								objects.put(objId, newObj);
								success = true;
							} else {
								randIndex = rand.nextInt(objects.size());
							}
						}
						if (success) {
							writer.write("Replaced " + oldObj.getObjectName()
									+ " object having objectId " + objId
									+ " with object of type "
									+ newObj.getObjectName() + "\r\n");
						}
						break;
					}
					case 1: // add a random object
					{
						boolean success = false;
						int retry = 5;
						String objId = (String) objects.keySet().toArray()[randIndex];
						ObjectType oldObj = objects.get(objId);
						String newObjID = "object" + objects.size();
						ObjectType newObj = null;

						while (!success && retry-- > 0) {
							newObj = ObjectType.getObject(randIndex);
							objects.put(newObjID, newObj);
							success = willObjectsFitInPage(objects);
							randIndex = rand.nextInt(objects.size());
						}
						if (!success) {
							objects.remove(newObjID);
						} else {
							writer.write("Added new object "
									+ newObj.getObjectName()
									+ " having objectId " + newObjID + "\r\n");
						}
						break;
					}
					case 2: // remove a random object
					{
						String removedObjId = (String) objects.keySet()
								.toArray()[randIndex];

						ObjectType removedObj;
						boolean success = false;
						int retry = 5;

						do {
							removedObj = objects.remove(removedObjId);
							success = willObjectsFitInPage(objects);
							if (!success) {
								objects.put(removedObjId, removedObj);
							}
							randIndex = rand.nextInt(objects.size());
						} while (!success && retry-- > 0);
						if (success) {
							writer.write("Removed "
									+ removedObj.getObjectName()
									+ " object having objectId " + removedObjId
									+ "\r\n");
						}
						break;
					}
					}
					// add the updated objects back into the map
					pageObjects.put(pageNumber, objects);
				}
			}
		} catch (Exception e) {
			System.out.println("could not create perturbation file");
		} finally {
			if (writer != null) {
				try {
					writer.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
		// Regenerate Jsp pages
		for (int pageNumber = 1; pageNumber <= noOfPages; pageNumber++) {

			// get list of objects to place on page
			Map<String, ObjectType> objects = pageObjects.get(pageNumber);

			generateJsp(pageNumber, pageNumber + "_1.jsp", objects);
		}

	}

	private void generateJsp(int pageNumber, String pageName, Map<String, ObjectType> objects) {

		// create a file for the page
		try {
			File myFile = new File(dirPath, pageName);

			// start writing the JSP Page
			FileOutputStream fos = new FileOutputStream(myFile);
			PrintStream dos = new PrintStream(fos);

			// initial code for a JSP page with Sweet DEV ria Ajax Toolkit.
			dos.println("<!DOCTYPE html PUBLIC \"-//W3C//DTD XHTML 1.1 Transitional//EN\" \"http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd\">");
			// taglib include for sweet dev ria.
			dos.println("<%@ taglib prefix=\"ria\" uri=\"http://sweetdev-ria.ideotechnologies.com\" %>");
			dos.println("<%@ page language=\"java\" contentType=\"text/html; charset=UTF-8\"%>");
			dos.println("<%@ page import=\"com.ideo.sweetdevria.taglib.alert.AlertTag\" %>");
			dos.println("<%@ page import=\"com.ideo.sweetdevria.taglib.frame.FrameTag\" %>");
			dos.println("<html>");
			printHeader(pageNumber, dos);
			printPageBody(pageNumber, objects, dos);
			dos.println("</html>");
			// completion of code for a page.
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	private void printPageBody(int pageNumber, Map<String, ObjectType> objects,
			PrintStream dos) {
		dos.println("<body>");
		dos.println("<div id=\"wrapper\">");
		dos.println("<div id=\"pageSize\"></div>");
		dos.println("<div id=\"main_body\">");
		dos.println("<div id=\"side\"></div>");

		// print the objects
		if (objects.isEmpty()) {
			dos.println("Could not find any set of objects that can fit in this page");
		} else {
			for (String objID : objects.keySet()) {
				ObjectType c = objects.get(objID);
				String objCode = c.getCode();
				// write into the file
				dos.println(objCode);
			}
		}
		dos.println("</div>");
		dos.println("<div style=\"clear:both;\"/>");

		// print page links
		List<Integer> pageLinks = GraphVtoE.get(pageNumber);
		System.out.println("page=" + pageNumber + " link =" + pageLinks);

		String sPageLinks = "";
		if (pageLinks != null && !pageLinks.isEmpty()) {
			for (Integer pageLink : pageLinks) {
				sPageLinks += pageLink + ";";
			}
		}
		dos.println("<jsp:include page=\'/WEB-INF/includes/footer.jsp\' >");
		dos.println("<jsp:param name=\'pageLinks\' value=\'" + sPageLinks
				+ "' />");
		dos.println("</jsp:include>");

		dos.println("</div>");
		dos.println("</body>");
	}

	private void printHeader(int pageNumber, PrintStream dos) {
		dos.println("<head>");
		// Simple Java Script for connecting the pages.
		// Background color, width and height to user specifications
		dos.println("<jsp:include page=\'/WEB-INF/includes/header.jsp\'>");
		dos.println("<jsp:param name=\'currentPage\' value=\'" + pageNumber
				+ "' />");
		dos.println("<jsp:param name=\'width\' value=\'" + pageWidth + "' />");
		dos.println("<jsp:param name=\'height\' value=\'" + pageHeight + "' />");
		dos.println("<jsp:param name=\'bgColor\' value=\'" + bgColor + "' />");
		dos.println("</jsp:include>");
		dos.println("</head>");
	}

	/**
	 * try a couple of times to figure out what set of objects fit in the page
	 */
	private Map<String, ObjectType> findListOfObjectsThatWillFitInPage() {
		Map<String, ObjectType> objects;
		int retryCount = 15;
		// make retryCount number of attempts to randomly determine set of
		// objects
		boolean doObjectsFit = false;
		do {
			System.out.println("Attempting");
			int numObjects = selectRandomNumberOfObjects(minObjects, maxObjects);
			System.out.println("Number of objects randomly selected = "
					+ numObjects);
			objects = generateRandomListOfObjects(numObjects);
			doObjectsFit = willObjectsFitInPage(objects);
			retryCount--;
		} while (!doObjectsFit && retryCount > 0);

		if (!doObjectsFit) {
			// since our previous retries failed, lets start with max and
			// decrease count upto min value till we find the set of objects we
			// can put on the page
			for (int i = maxObjects; i >= minObjects && !doObjectsFit; i--) {
				System.out.println("Number of objects selected = " + i);
				objects = generateRandomListOfObjects(i);
				doObjectsFit = willObjectsFitInPage(objects);
			}
		}
		if (!doObjectsFit) {
			// return empty map of objects so that a blank page is generated
			return new HashMap<String, ObjectType>();
		}
		return objects;
	}

	private ArrayList<Integer> deduceFactors(int noOfObjects) {
		int value = noOfObjects;
		ArrayList<Integer> factors = new ArrayList<Integer>();
		// for each potential factor i
		for (int i = 2; i <= value / i; i++) {
			// if i is a factor of noOfobjects, repeatedly divide it out
			while (value % i == 0) {
				factors.add(i);
				value = value / i;
			}
		}

		factors.add(value);

		System.out.println("factors for " + noOfObjects + " is " + factors);
		return factors;
	}

	/*
	 * private boolean willObjectsFitInPage(Map<String, ObjectType> objects, int
	 * pageHeight, int pageWidth) { Map<String, ObjectType> bb =
	 * DynamicallyFittedPage.doesFit(objects, pageHeight, pageWidth); if(bb ==
	 * null) { return false; } else { objects = bb; return true; } }
	 */
	private boolean willObjectsFitInPage(Map<String, ObjectType> objects) {
		int noOfObjects = objects.size();
		int sectionWidth = pageWidth;
		int sectionHeight = pageHeight;
		if (noOfObjects == 0) {
			System.out.println("Not able to fit any objects");
			return false;
		}
		ArrayList<Integer> factors = deduceFactors(noOfObjects);
		for (int i = 0; i < factors.size(); i++) {
			if (i % 2 == 0) {
				sectionWidth = sectionWidth / factors.get(i);
			} else {
				sectionHeight = sectionHeight / factors.get(i);
			}
		}

		// check sizes
		for (ObjectType obj : objects.values()) {
			int objWidth = obj.getMinWidth();
			int objHeight = obj.getMinHeight();
			if (objWidth > sectionWidth || objHeight > sectionHeight) {
				return false;
			}
		}

		// dynamically adjust the height and weight of each object
		for (ObjectType obj : objects.values()) {
			obj.setWidth(sectionWidth - obj.getBoxPadding());
			obj.setHeight(sectionHeight - obj.getBoxPadding());
		}
		return true;
	}

	private Hashtable<Integer, List<Integer>> createRandomTreeWalkGraph(
			int noOfPages) {
		Hashtable<Integer, List<Integer>> GraphVtoE = new Hashtable<Integer, List<Integer>>();

		Random randomGenerator = new Random(new Date().getTime());

		for (int i = 0; i < noOfPages; i++) {
			int page = i + 1;
			int numberOfLinks = randomGenerator.nextInt(noOfPages);
			while (i == 0 && numberOfLinks == 0) {
				// first page should always have a few links
				numberOfLinks = randomGenerator.nextInt(noOfPages);
			}
			List<Integer> linkedPages = new ArrayList<Integer>();
			for (int j = 0; j < numberOfLinks; j++) {
				int pageLink = -1;
				do {
					pageLink = randomGenerator.nextInt(noOfPages) + 1;
				} while (pageLink == page || linkedPages.contains(pageLink));
				linkedPages.add(pageLink);
			}
			GraphVtoE.put(page, linkedPages);
		}
		return GraphVtoE;
	}

	private int selectRandomNumberOfObjects(int min, int max) {
		if (min > max) {
			throw new IllegalArgumentException(
					"Invalid values speified: Minimum number of objects "
							+ "displayable on page should be less than the maximum ");
		} else if (min == max) {
			return min;
		} else {
			Random r = new Random();
			int rand = r.nextInt(max - min + 1);
			return min + rand;
		}
	}

	// select n objects from objTypeMap. Returns a map of objectId to Object
	private Map<String, ObjectType> generateRandomListOfObjects(int noOfObj) {
		Map<String, ObjectType> objects = new HashMap<String, ObjectType>();
		for (int k = 1; k <= noOfObj; k++) {
			String objID = "object" + k;
			Random randomGenerator = new Random();
			int rand = randomGenerator.nextInt(ObjectType.size());
			// obtain the objectcode from the hashtable
			ObjectType c = ObjectType.getObject(rand);
			c.setObjectId(objID);
			objects.put(objID, c);
		}
		return objects;
	}
}
