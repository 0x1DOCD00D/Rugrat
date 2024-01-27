package ragDB.query.grammar;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Arthi 
 * Generic Tree based DataStructure To Represent Queries
 */
public class GenericTreeNode<T> {

	public T data;
	public List<GenericTreeNode<T>> children;

	public GenericTreeNode() {
		super();
		children = new ArrayList<GenericTreeNode<T>>();
	}

	public GenericTreeNode(T data) {
		this();
		setData(data);
	}

	public List<GenericTreeNode<T>> getChildren() {
		return this.children;
	}

	public int getNumberOfChildren() {
		return getChildren().size();
	}

	public boolean hasChildren() {
		return getNumberOfChildren() > 0;
	}

	public void setChildren(List<GenericTreeNode<T>> children) {
		this.children = children;
	}

	public void addChild(GenericTreeNode<T> child) {
		children.add(child);
	}

	public GenericTreeNode<String> getChild(GenericTreeNode<String> parent,
			String childData) {
		List<GenericTreeNode<String>> listChildren = parent.getChildren();
		for (int i = 0; i < listChildren.size(); i++) {
			if (listChildren.get(i).data == childData)
				return listChildren.get(i);
		}
		return null;
	}

	public T getData() {
		return this.data;
	}

	public void setData(T data) {
		this.data = data;
	}

	public String toString() {
		return getData().toString();
	}
}
