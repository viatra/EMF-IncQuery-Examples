package school.util;

import java.util.Map;
import org.eclipse.incquery.runtime.extensibility.IMatchChecker;
import org.eclipse.incquery.runtime.rete.tuple.Tuple;

/**
 * A xbase xexpression evaluator tailored for the school.courseWithNameLongerThanWeightInt pattern.
 */
public class CourseWithNameLongerThanWeightIntEvaluator1_1 implements IMatchChecker {
  /**
   * The raw java code generated from the xbase xexpression by xtext.
   */
  private Boolean evaluateXExpressionGenerated(final Integer W, final String CName) {
    String _CName = CName;
    int _length = _CName.length();
    Integer _W = W;
    boolean _greaterThan = (_length > (_W).intValue());
    return Boolean.valueOf(_greaterThan);
  }
  
  /**
   * A wrapper method for calling the generated java method with the correct attributes.
   */
  @Override
  public Boolean evaluateXExpression(final Tuple tuple, final Map<String,Integer> tupleNameMap) {
    int WPosition = tupleNameMap.get("W");
    java.lang.Integer W = (java.lang.Integer) tuple.get(WPosition);
    int CNamePosition = tupleNameMap.get("CName");
    java.lang.String CName = (java.lang.String) tuple.get(CNamePosition);
    return evaluateXExpressionGenerated(W, CName);
  }
}
