package su.nsk.iae.edtl.helpers;

import com.google.common.base.Objects;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtend2.lib.StringConcatenation;
import su.nsk.iae.edtl.edtl.AndExpression;
import su.nsk.iae.edtl.edtl.CompExpression;
import su.nsk.iae.edtl.edtl.CompOperator;
import su.nsk.iae.edtl.edtl.CrossVarAbbr;
import su.nsk.iae.edtl.edtl.EquExpression;
import su.nsk.iae.edtl.edtl.Expression;
import su.nsk.iae.edtl.edtl.PrimaryExpression;
import su.nsk.iae.edtl.edtl.TauExpression;
import su.nsk.iae.edtl.edtl.UnExpression;
import su.nsk.iae.edtl.edtl.XorExpression;
import su.nsk.iae.edtl.utils.LiteralUtils;

@SuppressWarnings("all")
public class ExpressionGenerationHelper {
  public static boolean isConst(final PrimaryExpression e) {
    String _const = e.getConst();
    return (_const != null);
  }
  
  public static boolean isVar(final PrimaryExpression e) {
    CrossVarAbbr _var = e.getVar();
    return (_var != null);
  }
  
  public static boolean isTau(final PrimaryExpression e) {
    TauExpression _tau = e.getTau();
    return (_tau != null);
  }
  
  public static boolean isNestExpr(final PrimaryExpression e) {
    Expression _nestExpr = e.getNestExpr();
    return (_nestExpr != null);
  }
  
  public static boolean isCompOp(final CompExpression e) {
    CompOperator _compOp = e.getCompOp();
    return (_compOp != null);
  }
  
  public static String translateCompExpression(final CompExpression expr) {
    boolean _isCompOp = ExpressionGenerationHelper.isCompOp(expr);
    if (_isCompOp) {
      StringConcatenation _builder = new StringConcatenation();
      String _literal = expr.getCompOp().getLiteral();
      _builder.append(_literal);
      return _builder.toString();
    }
    return null;
  }
  
  /**
   * static def boolean isUnOp(UnExpression e) {
   * return e.getUnOp !== null
   * }
   * 
   * static def String translateUnExpression(UnExpression expr) {
   * if(expr.isUnOp){
   * if(expr.unOp == 'LOW')
   * return '''???'''
   * else if(expr.unOp == 'HIGH')
   * return '''???'''
   * else if(expr.unOp == 'FE')
   * return '''???'''
   * else if(expr.unOp == 'RE')
   * return '''???'''
   * if(expr.unOp == 'LOW')
   * return '''???'''
   * }
   * }
   */
  public String translateExpr(final EObject expr) {
    System.out.println(expr);
    boolean _matched = false;
    if (expr instanceof PrimaryExpression) {
      _matched=true;
      boolean _isNestExpr = ExpressionGenerationHelper.isNestExpr(((PrimaryExpression)expr));
      if (_isNestExpr) {
        StringConcatenation _builder = new StringConcatenation();
        _builder.append("(");
        String _translateExpr = this.translateExpr(((PrimaryExpression)expr).getNestExpr());
        _builder.append(_translateExpr);
        _builder.append(")");
        return _builder.toString();
      }
      boolean _isConst = ExpressionGenerationHelper.isConst(((PrimaryExpression)expr));
      if (_isConst) {
        StringConcatenation _builder_1 = new StringConcatenation();
        String _const = ((PrimaryExpression)expr).getConst();
        _builder_1.append(_const);
        return _builder_1.toString();
      }
      boolean _isVar = ExpressionGenerationHelper.isVar(((PrimaryExpression)expr));
      if (_isVar) {
        StringConcatenation _builder_2 = new StringConcatenation();
        String _name = ((PrimaryExpression)expr).getVar().getName();
        _builder_2.append(_name);
        return _builder_2.toString();
      }
      boolean _isTau = ExpressionGenerationHelper.isTau(((PrimaryExpression)expr));
      if (_isTau) {
        StringConcatenation _builder_3 = new StringConcatenation();
        _builder_3.append("tau(fsm->getTime(), ");
        long _parseTime = LiteralUtils.parseTime(((PrimaryExpression)expr).getTau().getTime().getInterval());
        _builder_3.append(_parseTime);
        _builder_3.append(")");
        return _builder_3.toString();
      }
    }
    if (!_matched) {
      if (expr instanceof UnExpression) {
        _matched=true;
        String _unOp = ((UnExpression)expr).getUnOp();
        boolean _equals = Objects.equal(_unOp, "NOT");
        if (_equals) {
          StringConcatenation _builder = new StringConcatenation();
          _builder.append("!");
          String _translateExpr = this.translateExpr(((UnExpression)expr).getRight());
          _builder.append(_translateExpr);
          return _builder.toString();
        } else {
          StringConcatenation _builder_1 = new StringConcatenation();
          String _lowerCase = ((UnExpression)expr).getUnOp().toLowerCase();
          _builder_1.append(_lowerCase);
          _builder_1.append("(v[\"");
          String _translateExpr_1 = this.translateExpr(((UnExpression)expr).getRight());
          _builder_1.append(_translateExpr_1);
          _builder_1.append("\"])");
          return _builder_1.toString();
        }
      }
    }
    if (!_matched) {
      if (expr instanceof EquExpression) {
        _matched=true;
        StringConcatenation _builder = new StringConcatenation();
        String _translateExpr = this.translateExpr(((EquExpression)expr).getLeft());
        _builder.append(_translateExpr);
        _builder.append(" == ");
        String _translateExpr_1 = this.translateExpr(((EquExpression)expr).getRight());
        _builder.append(_translateExpr_1);
        return _builder.toString();
      }
    }
    if (!_matched) {
      if (expr instanceof CompExpression) {
        _matched=true;
        StringConcatenation _builder = new StringConcatenation();
        String _translateExpr = this.translateExpr(((CompExpression)expr).getLeft());
        _builder.append(_translateExpr);
        _builder.append(" ");
        String _translateCompExpression = ExpressionGenerationHelper.translateCompExpression(((CompExpression)expr));
        _builder.append(_translateCompExpression);
        _builder.append(" ");
        String _translateExpr_1 = this.translateExpr(((CompExpression)expr).getRight());
        _builder.append(_translateExpr_1);
        return _builder.toString();
      }
    }
    if (!_matched) {
      if (expr instanceof AndExpression) {
        _matched=true;
        StringConcatenation _builder = new StringConcatenation();
        String _translateExpr = this.translateExpr(((AndExpression)expr).getLeft());
        _builder.append(_translateExpr);
        _builder.append(" && ");
        String _translateExpr_1 = this.translateExpr(((AndExpression)expr).getRight());
        _builder.append(_translateExpr_1);
        return _builder.toString();
      }
    }
    if (!_matched) {
      if (expr instanceof XorExpression) {
        _matched=true;
        StringConcatenation _builder = new StringConcatenation();
        String _translateExpr = this.translateExpr(((XorExpression)expr).getLeft());
        _builder.append(_translateExpr);
        _builder.append(" ^ ");
        String _translateExpr_1 = this.translateExpr(((XorExpression)expr).getRight());
        _builder.append(_translateExpr_1);
        return _builder.toString();
      }
    }
    if (!_matched) {
      if (expr instanceof Expression) {
        _matched=true;
        StringConcatenation _builder = new StringConcatenation();
        String _translateExpr = this.translateExpr(((Expression)expr).getLeft());
        _builder.append(_translateExpr);
        _builder.append(" || ");
        String _translateExpr_1 = this.translateExpr(((Expression)expr).getRight());
        _builder.append(_translateExpr_1);
        return _builder.toString();
      }
    }
    return null;
  }
}
