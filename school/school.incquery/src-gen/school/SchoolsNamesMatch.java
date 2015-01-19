package school;

import java.util.Arrays;
import java.util.List;
import org.eclipse.incquery.runtime.api.IPatternMatch;
import org.eclipse.incquery.runtime.api.impl.BasePatternMatch;
import org.eclipse.incquery.runtime.exception.IncQueryException;
import school.util.SchoolsNamesQuerySpecification;

/**
 * Pattern-specific match representation of the school.schoolsNames pattern,
 * to be used in conjunction with {@link SchoolsNamesMatcher}.
 * 
 * <p>Class fields correspond to parameters of the pattern. Fields with value null are considered unassigned.
 * Each instance is a (possibly partial) substitution of pattern parameters,
 * usable to represent a match of the pattern in the result of a query,
 * or to specify the bound (fixed) input parameters when issuing a query.
 * 
 * @see SchoolsNamesMatcher
 * @see SchoolsNamesProcessor
 * 
 */
@SuppressWarnings("all")
public abstract class SchoolsNamesMatch extends BasePatternMatch {
  private String fSchName;
  
  private static List<String> parameterNames = makeImmutableList("SchName");
  
  private SchoolsNamesMatch(final String pSchName) {
    this.fSchName = pSchName;
  }
  
  @Override
  public Object get(final String parameterName) {
    if ("SchName".equals(parameterName)) return this.fSchName;
    return null;
  }
  
  public String getSchName() {
    return this.fSchName;
  }
  
  @Override
  public boolean set(final String parameterName, final Object newValue) {
    if (!isMutable()) throw new java.lang.UnsupportedOperationException();
    if ("SchName".equals(parameterName) ) {
    	this.fSchName = (java.lang.String) newValue;
    	return true;
    }
    return false;
  }
  
  public void setSchName(final String pSchName) {
    if (!isMutable()) throw new java.lang.UnsupportedOperationException();
    this.fSchName = pSchName;
  }
  
  @Override
  public String patternName() {
    return "school.schoolsNames";
  }
  
  @Override
  public List<String> parameterNames() {
    return SchoolsNamesMatch.parameterNames;
  }
  
  @Override
  public Object[] toArray() {
    return new Object[]{fSchName};
  }
  
  @Override
  public SchoolsNamesMatch toImmutable() {
    return isMutable() ? newMatch(fSchName) : this;
  }
  
  @Override
  public String prettyPrint() {
    StringBuilder result = new StringBuilder();
    result.append("\"SchName\"=" + prettyPrintValue(fSchName)
    );
    return result.toString();
  }
  
  @Override
  public int hashCode() {
    final int prime = 31;
    int result = 1;
    result = prime * result + ((fSchName == null) ? 0 : fSchName.hashCode());
    return result;
  }
  
  @Override
  public boolean equals(final Object obj) {
    if (this == obj)
    	return true;
    if (!(obj instanceof SchoolsNamesMatch)) { // this should be infrequent
    	if (obj == null) {
    		return false;
    	}
    	if (!(obj instanceof IPatternMatch)) {
    		return false;
    	}
    	IPatternMatch otherSig  = (IPatternMatch) obj;
    	if (!specification().equals(otherSig.specification()))
    		return false;
    	return Arrays.deepEquals(toArray(), otherSig.toArray());
    }
    SchoolsNamesMatch other = (SchoolsNamesMatch) obj;
    if (fSchName == null) {if (other.fSchName != null) return false;}
    else if (!fSchName.equals(other.fSchName)) return false;
    return true;
  }
  
  @Override
  public SchoolsNamesQuerySpecification specification() {
    try {
    	return SchoolsNamesQuerySpecification.instance();
    } catch (IncQueryException ex) {
     	// This cannot happen, as the match object can only be instantiated if the query specification exists
     	throw new IllegalStateException (ex);
    }
  }
  
  /**
   * Returns an empty, mutable match.
   * Fields of the mutable match can be filled to create a partial match, usable as matcher input.
   * 
   * @return the empty match.
   * 
   */
  public static SchoolsNamesMatch newEmptyMatch() {
    return new Mutable(null);
  }
  
  /**
   * Returns a mutable (partial) match.
   * Fields of the mutable match can be filled to create a partial match, usable as matcher input.
   * 
   * @param pSchName the fixed value of pattern parameter SchName, or null if not bound.
   * @return the new, mutable (partial) match object.
   * 
   */
  public static SchoolsNamesMatch newMutableMatch(final String pSchName) {
    return new Mutable(pSchName);
  }
  
  /**
   * Returns a new (partial) match.
   * This can be used e.g. to call the matcher with a partial match.
   * <p>The returned match will be immutable. Use {@link #newEmptyMatch()} to obtain a mutable match object.
   * @param pSchName the fixed value of pattern parameter SchName, or null if not bound.
   * @return the (partial) match object.
   * 
   */
  public static SchoolsNamesMatch newMatch(final String pSchName) {
    return new Immutable(pSchName);
  }
  
  private static final class Mutable extends SchoolsNamesMatch {
    Mutable(final String pSchName) {
      super(pSchName);
    }
    
    @Override
    public boolean isMutable() {
      return true;
    }
  }
  
  private static final class Immutable extends SchoolsNamesMatch {
    Immutable(final String pSchName) {
      super(pSchName);
    }
    
    @Override
    public boolean isMutable() {
      return false;
    }
  }
}
