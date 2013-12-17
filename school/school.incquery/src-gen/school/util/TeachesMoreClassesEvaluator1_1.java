package school.util;

import com.google.common.collect.ImmutableList;
import java.util.Map;
import org.eclipse.incquery.runtime.extensibility.IMatchChecker;
import org.eclipse.incquery.runtime.matchers.psystem.IValueProvider;
import org.eclipse.incquery.runtime.matchers.tuple.Tuple;

/**
 * A xbase xexpression evaluator tailored for the school.teachesMoreClasses pattern.
 */
@SuppressWarnings("all")
public class TeachesMoreClassesEvaluator1_1 implements IMatchChecker {
  private ImmutableList<String> parameterNames = ImmutableList.of(
    "M"	, 
    "N"	
    );
    ;
  
  /**
   * The raw java code generated from the xbase xexpression by xtext.
   */
  private Boolean evaluateGeneratedExpression(final Integer M, final Integer N) {
    boolean _greaterThan = (N.compareTo(M) > 0);
    return Boolean.valueOf(_greaterThan);
  }
  
  /**
   * A wrapper method for calling the generated java method with the correct attributes.
   */
  @Override
  @Deprecated
  public Boolean evaluateXExpression(final Tuple tuple, final Map<String,Integer> tupleNameMap) {
    int MPosition = tupleNameMap.get("M");
    java.lang.Integer M = (java.lang.Integer) tuple.get(MPosition);
    int NPosition = tupleNameMap.get("N");
    java.lang.Integer N = (java.lang.Integer) tuple.get(NPosition);
    return evaluateGeneratedExpression(M, N);
  }
  
  /**
   * A wrapper method for calling the generated java method with the correct attributes.
   */
  @Override
  public Boolean evaluateExpression(final IValueProvider provider) {
    java.lang.Integer M = (java.lang.Integer) provider.getValue("M");
    java.lang.Integer N = (java.lang.Integer) provider.getValue("N");
    return evaluateGeneratedExpression(M, N);
    
  }
  
  /**
   * A wrapper method for calling the generated java method with the correct attributes.
   */
  @Override
  public Iterable<String> getInputParameterNames() {
    return parameterNames;
    
  }
  
  /**
   * A wrapper method for calling the generated java method with the correct attributes.
   */
  @Override
  public String getShortDescription() {
    return "XExpression 1_1 from Pattern teachesMoreClasses";
    
  }
}
