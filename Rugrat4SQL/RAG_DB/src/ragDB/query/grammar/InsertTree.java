package ragDB.query.grammar;

/**
 * @author Arthi
 * Insert Query Grammar tree
 */
public class InsertTree {

	// To form a tree with Insert query syntax using GenericTreeNode
	public GenericTreeNode<String> createInsertTree() {
		GenericTreeNode<String> key_Insert = new GenericTreeNode<String>(
				"insert"); // For INSERT keyword

		GenericTreeNode<String> priority_expr = new GenericTreeNode<String>(
				"priority_expr"); 
		key_Insert.addChild(priority_expr);

		GenericTreeNode<String> key_ignore = new GenericTreeNode<String>(
				"ignore"); 
		priority_expr.addChild(key_ignore);

		GenericTreeNode<String> key_Into = new GenericTreeNode<String>("into"); 
		key_ignore.addChild(key_Into);

		GenericTreeNode<String> table_expr = new GenericTreeNode<String>(
				"table_expr"); 
		key_Into.addChild(table_expr);

		GenericTreeNode<String> column_expr = new GenericTreeNode<String>(
				"column_expr"); 
		table_expr.addChild(column_expr);

		GenericTreeNode<String> key_values = new GenericTreeNode<String>(
				"values"); 
		column_expr.addChild(key_values);

		GenericTreeNode<String> columnvalues_expr = new GenericTreeNode<String>(
				"columnvalues_expr"); 
		key_values.addChild(columnvalues_expr);

		GenericTreeNode<String> endQuery = new GenericTreeNode<String>(";");
		columnvalues_expr.addChild(endQuery);

		return key_Insert;
	}
}