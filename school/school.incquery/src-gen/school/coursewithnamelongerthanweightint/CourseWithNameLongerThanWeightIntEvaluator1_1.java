package school.coursewithnamelongerthanweightint;

import java.util.Map;
import org.eclipse.viatra2.emf.incquery.runtime.api.IMatchChecker;
import org.eclipse.viatra2.gtasm.patternmatcher.incremental.rete.tuple.Tuple;

/**
 * A xbase xexpression evaluator tailored for the courseWithNameLongerThanWeightInt pattern.
 */
public class CourseWithNameLongerThanWeightIntEvaluator1_1 implements IMatchChecker {
  /**
   * The raw java code generated from the xbase xexpression by xtext.
   */
  private Boolean evaluateXExpressionGenerated(final String CName, final Integer W) {
    String _CName = CName;
    int _length = ((String) _CName).length();
    Integer _W = W;
    boolean _greaterThan = (_length > (((Integer) _W)).intValue());
    return Boolean.valueOf(_greaterThan);
  }
  
  /**
   * A wrapper method for calling the generated java method with the correct attributes.
   */
  public Boolean evaluateXExpression(final Tuple tuple, final Map<String,Integer> tupleNameMap) {
    int CNamePosition = tupleNameMap.get("CName");
    java.lang.String CName = (java.lang.String) tuple.get(CNamePosition);
    int WPosition = tupleNameMap.get("W");
    java.lang.Integer W = (java.lang.Integer) tuple.get(WPosition);
    return evaluateXExpressionGenerated(CName, W);
  }
}
