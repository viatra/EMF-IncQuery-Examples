package hu.bme.mit.incquery.ecorequeries.example;

import java.util.Arrays;
import java.util.List;
import org.eclipse.incquery.patternlanguage.patternLanguage.Pattern;
import org.eclipse.incquery.runtime.api.IPatternMatch;
import org.eclipse.incquery.runtime.api.impl.BasePatternMatch;
import org.eclipse.incquery.runtime.exception.IncQueryException;

/**
 * Pattern-specific match representation of the hu.bme.mit.incquery.ecorequeries.example.EReferenceWithStarMultiplicityName pattern, 
 * to be used in conjunction with {@link EReferenceWithStarMultiplicityNameMatcher}.
 * 
 * <p>Class fields correspond to parameters of the pattern. Fields with value null are considered unassigned.
 * Each instance is a (possibly partial) substitution of pattern parameters, 
 * usable to represent a match of the pattern in the result of a query, 
 * or to specify the bound (fixed) input parameters when issuing a query.
 * 
 * @see EReferenceWithStarMultiplicityNameMatcher
 * @see EReferenceWithStarMultiplicityNameProcessor
 * 
 */
@SuppressWarnings("all")
public abstract class EReferenceWithStarMultiplicityNameMatch extends BasePatternMatch {
  private String fERefName;
  
  private static List<String> parameterNames = makeImmutableList("ERefName");
  
  private EReferenceWithStarMultiplicityNameMatch(final String pERefName) {
    this.fERefName = pERefName;
    
  }
  
  @Override
  public Object get(final String parameterName) {
    if ("ERefName".equals(parameterName)) return this.fERefName;
    return null;
    
  }
  
  public String getERefName() {
    return this.fERefName;
    
  }
  
  @Override
  public boolean set(final String parameterName, final Object newValue) {
    if (!isMutable()) throw new java.lang.UnsupportedOperationException();
    if ("ERefName".equals(parameterName) ) {
    	this.fERefName = (java.lang.String) newValue;
    	return true;
    }
    return false;
    
  }
  
  public void setERefName(final String pERefName) {
    if (!isMutable()) throw new java.lang.UnsupportedOperationException();
    this.fERefName = pERefName;
    
  }
  
  @Override
  public String patternName() {
    return "hu.bme.mit.incquery.ecorequeries.example.EReferenceWithStarMultiplicityName";
    
  }
  
  @Override
  public List<String> parameterNames() {
    return EReferenceWithStarMultiplicityNameMatch.parameterNames;
    
  }
  
  @Override
  public Object[] toArray() {
    return new Object[]{fERefName};
    
  }
  
  @Override
  public String prettyPrint() {
    StringBuilder result = new StringBuilder();
    result.append("\"ERefName\"=" + prettyPrintValue(fERefName));
    return result.toString();
    
  }
  
  @Override
  public int hashCode() {
    final int prime = 31;
    int result = 1;
    result = prime * result + ((fERefName == null) ? 0 : fERefName.hashCode()); 
    return result; 
    
  }
  
  @Override
  public boolean equals(final Object obj) {
    if (this == obj)
    	return true;
    if (!(obj instanceof EReferenceWithStarMultiplicityNameMatch)) { // this should be infrequent				
    	if (obj == null)
    		return false;
    	if (!(obj instanceof IPatternMatch))
    		return false;
    	IPatternMatch otherSig  = (IPatternMatch) obj;
    	if (!pattern().equals(otherSig.pattern()))
    		return false;
    	return Arrays.deepEquals(toArray(), otherSig.toArray());
    }
    EReferenceWithStarMultiplicityNameMatch other = (EReferenceWithStarMultiplicityNameMatch) obj;
    if (fERefName == null) {if (other.fERefName != null) return false;}
    else if (!fERefName.equals(other.fERefName)) return false;
    return true;
  }
  
  @Override
  public Pattern pattern() {
    try {
    	return EReferenceWithStarMultiplicityNameMatcher.querySpecification().getPattern();
    } catch (IncQueryException ex) {
     	// This cannot happen, as the match object can only be instantiated if the query specification exists
     	throw new IllegalStateException	(ex);
    }
    
  }
  
  @SuppressWarnings("all")
  static final class Mutable extends EReferenceWithStarMultiplicityNameMatch {
    Mutable(final String pERefName) {
      super(pERefName);
      
    }
    
    @Override
    public boolean isMutable() {
      return true;
    }
  }
  
  
  @SuppressWarnings("all")
  static final class Immutable extends EReferenceWithStarMultiplicityNameMatch {
    Immutable(final String pERefName) {
      super(pERefName);
      
    }
    
    @Override
    public boolean isMutable() {
      return false;
    }
  }
  
}
