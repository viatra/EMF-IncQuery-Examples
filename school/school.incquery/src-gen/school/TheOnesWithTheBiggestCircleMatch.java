package school;

import java.util.Arrays;
import java.util.List;
import org.eclipse.incquery.patternlanguage.patternLanguage.Pattern;
import org.eclipse.incquery.runtime.api.IPatternMatch;
import org.eclipse.incquery.runtime.api.impl.BasePatternMatch;
import org.eclipse.incquery.runtime.exception.IncQueryException;
import school.Student;

/**
 * Pattern-specific match representation of the school.theOnesWithTheBiggestCircle pattern, 
 * to be used in conjunction with {@link TheOnesWithTheBiggestCircleMatcher}.
 * 
 * <p>Class fields correspond to parameters of the pattern. Fields with value null are considered unassigned.
 * Each instance is a (possibly partial) substitution of pattern parameters, 
 * usable to represent a match of the pattern in the result of a query, 
 * or to specify the bound (fixed) input parameters when issuing a query.
 * 
 * @see TheOnesWithTheBiggestCircleMatcher
 * @see TheOnesWithTheBiggestCircleProcessor
 * 
 */
@SuppressWarnings("all")
public abstract class TheOnesWithTheBiggestCircleMatch extends BasePatternMatch {
  private Student fS;
  
  private static List<String> parameterNames = makeImmutableList("S");
  
  private TheOnesWithTheBiggestCircleMatch(final Student pS) {
    this.fS = pS;
    
  }
  
  @Override
  public Object get(final String parameterName) {
    if ("S".equals(parameterName)) return this.fS;
    return null;
    
  }
  
  public Student getS() {
    return this.fS;
    
  }
  
  @Override
  public boolean set(final String parameterName, final Object newValue) {
    if (!isMutable()) throw new java.lang.UnsupportedOperationException();
    if ("S".equals(parameterName) ) {
    	this.fS = (school.Student) newValue;
    	return true;
    }
    return false;
    
  }
  
  public void setS(final Student pS) {
    if (!isMutable()) throw new java.lang.UnsupportedOperationException();
    this.fS = pS;
    
  }
  
  @Override
  public String patternName() {
    return "school.theOnesWithTheBiggestCircle";
    
  }
  
  @Override
  public List<String> parameterNames() {
    return TheOnesWithTheBiggestCircleMatch.parameterNames;
    
  }
  
  @Override
  public Object[] toArray() {
    return new Object[]{fS};
    
  }
  
  @Override
  public String prettyPrint() {
    StringBuilder result = new StringBuilder();
    result.append("\"S\"=" + prettyPrintValue(fS));
    return result.toString();
    
  }
  
  @Override
  public int hashCode() {
    final int prime = 31;
    int result = 1;
    result = prime * result + ((fS == null) ? 0 : fS.hashCode()); 
    return result; 
    
  }
  
  @Override
  public boolean equals(final Object obj) {
    if (this == obj)
    	return true;
    if (!(obj instanceof TheOnesWithTheBiggestCircleMatch)) { // this should be infrequent				
    	if (obj == null)
    		return false;
    	if (!(obj instanceof IPatternMatch))
    		return false;
    	IPatternMatch otherSig  = (IPatternMatch) obj;
    	if (!pattern().equals(otherSig.pattern()))
    		return false;
    	return Arrays.deepEquals(toArray(), otherSig.toArray());
    }
    TheOnesWithTheBiggestCircleMatch other = (TheOnesWithTheBiggestCircleMatch) obj;
    if (fS == null) {if (other.fS != null) return false;}
    else if (!fS.equals(other.fS)) return false;
    return true;
  }
  
  @Override
  public Pattern pattern() {
    try {
    	return TheOnesWithTheBiggestCircleMatcher.querySpecification().getPattern();
    } catch (IncQueryException ex) {
     	// This cannot happen, as the match object can only be instantiated if the query specification exists
     	throw new IllegalStateException	(ex);
    }
    
  }
  
  @SuppressWarnings("all")
  static final class Mutable extends TheOnesWithTheBiggestCircleMatch {
    Mutable(final Student pS) {
      super(pS);
      
    }
    
    @Override
    public boolean isMutable() {
      return true;
    }
  }
  
  
  @SuppressWarnings("all")
  static final class Immutable extends TheOnesWithTheBiggestCircleMatch {
    Immutable(final Student pS) {
      super(pS);
      
    }
    
    @Override
    public boolean isMutable() {
      return false;
    }
  }
  
}
