package school.coursewithprimeweight;

import java.util.Map;
import org.eclipse.viatra2.emf.incquery.runtime.api.IMatchChecker;
import org.eclipse.viatra2.gtasm.patternmatcher.incremental.rete.tuple.Tuple;

/**
 * A xbase xexpression evaluator tailored for the courseWithPrimeWeight pattern.
 */
public class CourseWithPrimeWeightEvaluator1_1 implements IMatchChecker {
  /**
   * The raw java code generated from the xbase xexpression by xtext.
   */
  private Boolean evaluateXExpressionGenerated(final Integer W) {
    boolean _xblockexpression = false;
    {
      Integer _W = W;
      Integer weight = ((Integer) _W);
      boolean _xifexpression = false;
      int _modulo = ((weight).intValue() % 2);
      boolean _equals = (_modulo == 0);
      if (_equals) {
        _xifexpression = false;
      } else {
        boolean _xblockexpression_1 = false;
        {
          double _sqrt = Math.sqrt((weight).intValue());
          Float _float = new Float(_sqrt);
          Integer maxValue = Integer.valueOf(Math.round((_float).floatValue()));
          Integer divisor = Integer.valueOf(3);
          boolean _lessEqualsThan = (divisor.compareTo(maxValue) <= 0);
          boolean _while = _lessEqualsThan;
          while (_while) {
            int _modulo_1 = ((weight).intValue() % (divisor).intValue());
            boolean _equals_1 = (_modulo_1 == 0);
            if (_equals_1) {
              return Boolean.valueOf(false);
            } else {
              int _plus = ((divisor).intValue() + 2);
              divisor = Integer.valueOf(_plus);
            }
            boolean _lessEqualsThan_1 = (divisor.compareTo(maxValue) <= 0);
            _while = _lessEqualsThan_1;
          }
          _xblockexpression_1 = (true);
        }
        _xifexpression = _xblockexpression_1;
      }
      _xblockexpression = (_xifexpression);
    }
    return Boolean.valueOf(_xblockexpression);
  }
  
  /**
   * A wrapper method for calling the generated java method with the correct attributes.
   */
  @Override
  public Boolean evaluateXExpression(final Tuple tuple, final Map<String,Integer> tupleNameMap) {
    int WPosition = tupleNameMap.get("W");
    java.lang.Integer W = (java.lang.Integer) tuple.get(WPosition);
    return evaluateXExpressionGenerated(W);
  }
}
