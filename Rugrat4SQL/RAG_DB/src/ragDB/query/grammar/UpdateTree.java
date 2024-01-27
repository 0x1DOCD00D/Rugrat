package ragDB.query.grammar;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Arthi
 * Update Query Grammar tree
 */
public class UpdateTree {

	// To form a tree with update query syntax using GenericTreeNode
	public GenericTreeNode<String> createUpdateTree() {
		GenericTreeNode<String> key_Update = new GenericTreeNode<String>(
				"update"); // For UPDATE keyword

		GenericTreeNode<String> tabref_expr = new GenericTreeNode<String>(
				"table_expr"); // For the table reference
		key_Update.addChild(tabref_expr);

		GenericTreeNode<String> key_Set = new GenericTreeNode<String>("set"); 
		tabref_expr.addChild(key_Set);

		GenericTreeNode<String> set_expr = new GenericTreeNode<String>(
				"set_expr"); // For SET keyword
		key_Set.addChild(set_expr);

		// set_expr can go to where, order by or ;
		List<GenericTreeNode<String>> listChildren = null;
		listChildren = new ArrayList<GenericTreeNode<String>>();
		GenericTreeNode<String> endQuery = new GenericTreeNode<String>(";");
		listChildren.add(endQuery);
		GenericTreeNode<String> key_Where = new GenericTreeNode<String>("where");
		listChildren.add(key_Where);
		GenericTreeNode<String> key_Orderby = new GenericTreeNode<String>(
				"order by");
		listChildren.add(key_Orderby);

		set_expr.setChildren(listChildren);

		GenericTreeNode<String> where_expr = new GenericTreeNode<String>(
				"where_expr"); // For the where condition
		key_Where.addChild(where_expr);

		GenericTreeNode<String> varSelect_expr = new GenericTreeNode<String>(
				"var_select_expr"); // for order by expr
		key_Orderby.addChild(varSelect_expr);

		GenericTreeNode<String> key_desc = new GenericTreeNode<String>("desc");
		key_desc.addChild(new GenericTreeNode<String>(";"));
		GenericTreeNode<String> key_asc = new GenericTreeNode<String>("asc");
		key_asc.addChild(new GenericTreeNode<String>(";"));
		listChildren = new ArrayList<GenericTreeNode<String>>();
		listChildren.add(key_asc);
		listChildren.add(key_desc);
		varSelect_expr.setChildren(listChildren);

		listChildren = new ArrayList<GenericTreeNode<String>>();
		listChildren.add(key_Orderby);
		listChildren.add(endQuery);
		where_expr.setChildren(listChildren);

		// return root
		return key_Update;
	}
}