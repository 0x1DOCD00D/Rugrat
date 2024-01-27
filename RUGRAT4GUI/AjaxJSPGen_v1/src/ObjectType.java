import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class ObjectType {
	private static List<ObjectType> objectList = new ArrayList<ObjectType>();

	public static void init(String location) {

		boolean success = constructObjects(location);
		if (!success) {
			// default configurations
			objectList.add(new ObjectType("accordian", 100, 100));
			objectList.add(new ObjectType("alertBox", 100, 100));
			objectList.add(new ObjectType("clickToOpenLink", 100, 100));
			objectList.add(new ObjectType("collapse", 100, 100));
			objectList.add(new ObjectType("dockinglayout", 100, 100));
			objectList.add(new ObjectType("download", 100, 100));
			objectList.add(new ObjectType("fieldset", 100, 100));
			objectList.add(new ObjectType("frame", 100, 100));
			objectList.add(new ObjectType("limitedFrame", 100, 100));
			objectList.add(new ObjectType("menu", 100, 100));
			objectList.add(new ObjectType("modalPanel", 100, 100));
			objectList.add(new ObjectType("plainCalendar", 100, 100));
			objectList.add(new ObjectType("popupCalendar", 100, 100));
			objectList.add(new ObjectType("splitterlayout", 100, 100));
			objectList.add(new ObjectType("splitterTabBox", 100, 100));
			objectList.add(new ObjectType("window", 100, 100));
		}
	}

	private String objectName;
	private String objId;
	private int width = 100;
	private int height = 100;
	private int minWidth = 100;
	private int minHeight = 100;
	private int margin = 0;
	private int padding = 1;
	private int border = 0;
	private int sectionsW;
	private int sectionsH;

	private ObjectType(String name, int width, int height) {
		this.objectName = name;
		this.minWidth = this.width = width;
		this.minHeight = this.height = height;
	}

	public ObjectType(String name, int width, int height,
			int minWidth, int minHeight) {
		this.objectName = name;
		this.minWidth = minWidth;
		this.width = width;
		this.minHeight = minHeight;
		this.height = height;
	}

	private static boolean constructObjects(String location) {
		BufferedReader reader = null;
		try {
			reader = new BufferedReader(new FileReader(new File(
					location)));
			String line = null;
			while ((line = reader.readLine()) != null) {
				String[] vals = line.split(",");
				objectList.add(new ObjectType(vals[0], Integer
						.parseInt(vals[1].trim()), Integer.parseInt(vals[2].trim())));
			}
		} catch (IOException e) {
			System.out
					.println("Could not read object config file generator.cfg");
			System.out.println(e);
			return false;
		} finally {
			try {
				reader.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		return true;

	}

	// set methods
	public void setObjectId(String id) {
		this.objId = id;
	}

	public int getWidth() {
		return width;
	}
	
	public int getMinWidth() {
		return minWidth;
	}

	public void setWidth(int width) {
		this.width = width;
	}

	public int getHeight() {
		return height;
	}
	
	public int getMinHeight() {
		return minHeight;
	}

	public void setHeight(int height) {
		this.height = height;
	}

	public String getObjectName() {
		return this.objectName;
	}

	// get methods
	public String getObjectId() {
		return this.objId;
	}

	public int getRealWidth() {
		return width + getBoxPadding();
	}

	public int getRealHeight() {
		return height + getBoxPadding();
	}

	public int getBoxPadding() {
		return 4 * (border + margin + padding);
	}

	public void setSections(int sectionsW, int sectionsH) {
		this.sectionsW = sectionsW;
		this.sectionsH = sectionsH;
	}

	public int getSectionsW() {
		return sectionsW;
	}

	public int getSectionsH() {
		return sectionsH;
	}

	public String getCode() {
		StringBuilder result = new StringBuilder();
		result.append("<jsp:include page=\'/WEB-INF/objects/<objName>\'>\n"
				.replace("<objName>", objectName + ".jsp"));

		result.append("<jsp:param name=\'xxxx\' value=\'xxxxValue\' />\n"
				.replace("xxxxValue", String.valueOf(objId)));
		result.append("<jsp:param name=\'width\' value=\'xxxxValue\' />\n"
				.replace("xxxxValue", (width + "px")));
		result.append("<jsp:param name=\'height\' value=\'xxxxValue\' />\n"
				.replace("xxxxValue", (height + "px")));
		/*
		 * result.append("<jsp:param name=\'width\' value=\'xxxxValue\' />\n"
		 * .replace("xxxxValue", (sectionsW*100 + "px")));
		 * result.append("<jsp:param name=\'height\' value=\'xxxxValue\' />\n"
		 * .replace("xxxxValue", (sectionsH*100 + "px")));
		 */result.append("<jsp:param name=\'padding\' value=\'xxxxValue\' />\n"
				.replace("xxxxValue", (padding + "px")));
		result.append("<jsp:param name=\'border\' value=\'xxxxValue\' />\n"
				.replace("xxxxValue", (padding + "px solid black")));
		result.append("<jsp:param name=\'margin\' value=\'xxxxValue\' />\n"
				.replace("xxxxValue", (margin + "px")));

		result.append("</jsp:include>\n");

		return result.toString();
	}

	public static int size() {
		return objectList.size();
	}

	public static ObjectType getObject(int rand) {
		ObjectType object = objectList.get(rand);
		return new ObjectType(object.objectName, object.getWidth(),
				object.getHeight(), object.getMinWidth(),
				object.getMinHeight());
	}

	public ObjectType duplicate() {
		return new ObjectType(objectName, getWidth(), getHeight(),getMinWidth(),
				getMinHeight());
	}

}
