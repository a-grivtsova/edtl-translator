package su.nsk.iae.edtl.helpers

import org.eclipse.emf.ecore.EObject
import su.nsk.iae.edtl.edtl.Expression
import su.nsk.iae.edtl.edtl.XorExpression
import su.nsk.iae.edtl.edtl.AndExpression
import su.nsk.iae.edtl.edtl.CompExpression
import su.nsk.iae.edtl.edtl.EquExpression
import su.nsk.iae.edtl.edtl.UnExpression
import su.nsk.iae.edtl.edtl.PrimaryExpression
import su.nsk.iae.edtl.utils.LiteralUtils
import org.eclipse.xtext.nodemodel.util.NodeModelUtils

class ExpressionGenerationHelper {
	
	static def boolean isConst(PrimaryExpression e) {
		return e.getConst !== null
	}
	
	static def boolean isVar(PrimaryExpression e) {
		return e.getVar !== null
	}
	
	static def boolean isTau(PrimaryExpression e) {
		return e.getTau !== null
	}
	
	static def boolean isNestExpr(PrimaryExpression e) {
		return e.getNestExpr !== null
	}
	
	static def boolean isCompOp(CompExpression e) {
		return e.getCompOp !== null
	}
	
	static def String translateCompExpression(CompExpression expr) { /*«expr.getCompOp().getName()» «expr.getCompOp().getLiteral()» «expr.getCompOp().getValue()»*/
		if(expr.isCompOp)
			return '''«expr.getCompOp.getLiteral»'''		
	}
	
	/*static def boolean isUnOp(UnExpression e) {
		return e.getUnOp !== null
	}
	
	static def String translateUnExpression(UnExpression expr) { 
		if(expr.isUnOp){
			if(expr.unOp == 'LOW')
				return '''???'''
			else if(expr.unOp == 'HIGH')
				return '''???'''
			else if(expr.unOp == 'FE')
				return '''???'''
			else if(expr.unOp == 'RE')
				return '''???'''
			if(expr.unOp == 'LOW')
				return '''???'''
		}
	}	*/
	
	def String translateExpr(EObject expr) {
		System.out.println(expr);
		switch (expr) {
			PrimaryExpression: {
				if(expr.isNestExpr) {
					return '''(«translateExpr(expr.getNestExpr)»)'''
				}
				if(expr.isConst) return '''«expr.getConst»'''			
				if(expr.isVar) {
					return '''«expr.getVar.getName»'''	
				}
				if(expr.isTau) {
					return '''tau(fsm->getTime(), «LiteralUtils.parseTime(expr.getTau.getTime.getInterval)»)'''	
				}
				//return NodeModelUtils.getNode(expr).text.trim
	    	}
			UnExpression:
				if(expr.unOp == 'NOT')
					return '''!«translateExpr(expr.right)»'''
				else 
					return '''«expr.unOp.toLowerCase»(v["«translateExpr(expr.right)»"])'''
			EquExpression:
				return '''«translateExpr(expr.left)» == «translateExpr(expr.right)»'''
			CompExpression: 
				return '''«translateExpr(expr.left)» «translateCompExpression(expr)» «translateExpr(expr.right)»'''
			AndExpression:
				return '''«translateExpr(expr.left)» && «translateExpr(expr.right)»'''
			XorExpression:
				return '''«translateExpr(expr.left)» ^ «translateExpr(expr.right)»'''
			Expression:
				return '''«translateExpr(expr.left)» || «translateExpr(expr.right)»'''
		}
	}
}