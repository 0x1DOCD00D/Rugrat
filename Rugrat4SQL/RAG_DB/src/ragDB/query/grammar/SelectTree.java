package ragDB.query.grammar;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Arthi
 * Select Query Grammar tree
 */
public class SelectTree {
	// To form a tree with select query syntax using GenericTreeNode
	public GenericTreeNode<String> createSelectTree() {
		GenericTreeNode<String> key_Select = new GenericTreeNode<String>(
				"select"); // For select node

		GenericTreeNode<String> joinStmt_True = new GenericTreeNode<String>(
				"joinStmt_True"); // It is a join statement
		key_Select.addChild(joinStmt_True);

		GenericTreeNode<String> selectJoin_expr = new GenericTreeNode<String>(
				"select_expr"); // For select expr in join statement
		joinStmt_True.addChild(selectJoin_expr);

		GenericTreeNode<String> select_expr = new GenericTreeNode<String>(
				"select_expr"); // For select_expr
		key_Select.addChild(select_expr);

		GenericTreeNode<String> keyJoin_From = new GenericTreeNode<String>(
				"from"); // For from keywork in join statement
		selectJoin_expr.addChild(keyJoin_From);
		
		//For From Keyword
		GenericTreeNode<String> key_From = new GenericTreeNode<String>("from");
		select_expr.addChild(key_From);

		GenericTreeNode<String> tabref_expr = new GenericTreeNode<String>(
				"table_expr"); // For the table reference
		key_From.addChild(tabref_expr);

		GenericTreeNode<String> joinStmt_expr = new GenericTreeNode<String>(
				"join_expr"); // For join statements
		keyJoin_From.addChild(joinStmt_expr);
		
		//For the On Keyword
		GenericTreeNode<String> key_On = new GenericTreeNode<String>("");
		GenericTreeNode<String> onStmt_expr = new GenericTreeNode<String>(
				"on_expr"); // For the on expression
		key_On.addChild(onStmt_expr);
		joinStmt_expr.addChild(key_On);

		// For tabref_expr
		List<GenericTreeNode<String>> listChildren = null;
		listChildren = new ArrayList<GenericTreeNode<String>>();
		GenericTreeNode<String> endQuery = new GenericTreeNode<String>(";");
		listChildren.add(endQuery);
		GenericTreeNode<String> key_Where = new GenericTreeNode<String>("where");
		listChildren.add(key_Where);
		GenericTreeNode<String> key_Orderby = new GenericTreeNode<String>(
				"order by");
		listChildren.add(key_Orderby);
		GenericTreeNode<String> key_Groupby = new GenericTreeNode<String>(
				"group by");
		listChildren.add(key_Groupby);
		tabref_expr.setChildren(listChildren);

		// For onStmt_expr
		onStmt_expr.setChildren(listChildren);

		GenericTreeNode<String> where_expr = new GenericTreeNode<String>(
				"where_expr"); // For the where condition
		key_Where.addChild(where_expr);

		listChildren = new ArrayList<GenericTreeNode<String>>();
		listChildren.add(endQuery);
		listChildren.add(key_Orderby);
		listChildren.add(key_Groupby);
		where_expr.setChildren(listChildren);

		GenericTreeNode<String> varSelectNoAgg_expr = new GenericTreeNode<String>(
				"var_select_no_agg_expr");
		key_Groupby.addChild(varSelectNoAgg_expr);
		varSelectNoAgg_expr.addChild(new GenericTreeNode<String>(";"));

		GenericTreeNode<String> varSelect_expr = new GenericTreeNode<String>(
				"var_select_expr");
		key_Orderby.addChild(varSelect_expr);

		GenericTreeNode<String> varSelect_desc = new GenericTreeNode<String>(
				"desc_expr");
		varSelect_desc.addChild(new GenericTreeNode<String>(";"));
		varSelect_expr.addChild(varSelect_desc);

		GenericTreeNode<String> varSelect_asc = new GenericTreeNode<String>(
				"asc_expr");
		varSelect_asc.addChild(new GenericTreeNode<String>(";"));
		varSelect_expr.addChild(varSelect_asc);

		return key_Select;
	}
}