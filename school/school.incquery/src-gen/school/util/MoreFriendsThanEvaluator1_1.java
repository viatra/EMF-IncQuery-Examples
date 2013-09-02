package school.util;

import java.util.Map;
import org.eclipse.incquery.runtime.extensibility.IMatchChecker;
import org.eclipse.incquery.runtime.rete.tuple.Tuple;

/**
 * A xbase xexpression evaluator tailored for the school.moreFriendsThan pattern.
 */
@SuppressWarnings("all")
public class MoreFriendsThanEvaluator1_1 implements IMatchChecker {
  /**
   * The raw java code generated from the xbase xexpression by xtext.
   */
  private Boolean evaluateXExpressionGenerated(final Integer M, final Integer N) {
    boolean _greaterThan = (N.compareTo(M) > 0);
    return Boolean.valueOf(_greaterThan);
  }
  
  /**
   * A wrapper method for calling the generated java method with the correct attributes.
   */
  @Override
  public Boolean evaluateXExpression(final Tuple tuple, final Map<String,Integer> tupleNameMap) {
    int MPosition = tupleNameMap.get("M");
    java.lang.Integer M = (java.lang.Integer) tuple.get(MPosition);
    int NPosition = tupleNameMap.get("N");
    java.lang.Integer N = (java.lang.Integer) tuple.get(NPosition);
    return evaluateXExpressionGenerated(M, N);
  }
}
