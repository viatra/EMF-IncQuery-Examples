package school;

import java.util.Arrays;
import java.util.List;
import org.eclipse.incquery.runtime.api.IPatternMatch;
import org.eclipse.incquery.runtime.api.impl.BasePatternMatch;
import org.eclipse.incquery.runtime.exception.IncQueryException;
import school.Teacher;
import school.util.AnonymousVariablesQuerySpecification;

/**
 * Pattern-specific match representation of the school.anonymousVariables pattern,
 * to be used in conjunction with {@link AnonymousVariablesMatcher}.
 * 
 * <p>Class fields correspond to parameters of the pattern. Fields with value null are considered unassigned.
 * Each instance is a (possibly partial) substitution of pattern parameters,
 * usable to represent a match of the pattern in the result of a query,
 * or to specify the bound (fixed) input parameters when issuing a query.
 * 
 * @see AnonymousVariablesMatcher
 * @see AnonymousVariablesProcessor
 * 
 */
@SuppressWarnings("all")
public abstract class AnonymousVariablesMatch extends BasePatternMatch {
  private Teacher fTeacher;
  
  private static List<String> parameterNames = makeImmutableList("teacher");
  
  private AnonymousVariablesMatch(final Teacher pTeacher) {
    this.fTeacher = pTeacher;
  }
  
  @Override
  public Object get(final String parameterName) {
    if ("teacher".equals(parameterName)) return this.fTeacher;
    return null;
  }
  
  public Teacher getTeacher() {
    return this.fTeacher;
  }
  
  @Override
  public boolean set(final String parameterName, final Object newValue) {
    if (!isMutable()) throw new java.lang.UnsupportedOperationException();
    if ("teacher".equals(parameterName) ) {
    	this.fTeacher = (school.Teacher) newValue;
    	return true;
    }
    return false;
  }
  
  public void setTeacher(final Teacher pTeacher) {
    if (!isMutable()) throw new java.lang.UnsupportedOperationException();
    this.fTeacher = pTeacher;
  }
  
  @Override
  public String patternName() {
    return "school.anonymousVariables";
  }
  
  @Override
  public List<String> parameterNames() {
    return AnonymousVariablesMatch.parameterNames;
  }
  
  @Override
  public Object[] toArray() {
    return new Object[]{fTeacher};
  }
  
  @Override
  public AnonymousVariablesMatch toImmutable() {
    return isMutable() ? newMatch(fTeacher) : this;
  }
  
  @Override
  public String prettyPrint() {
    StringBuilder result = new StringBuilder();
    result.append("\"teacher\"=" + prettyPrintValue(fTeacher)
    );
    return result.toString();
  }
  
  @Override
  public int hashCode() {
    final int prime = 31;
    int result = 1;
    result = prime * result + ((fTeacher == null) ? 0 : fTeacher.hashCode());
    return result;
  }
  
  @Override
  public boolean equals(final Object obj) {
    if (this == obj)
    	return true;
    if (!(obj instanceof AnonymousVariablesMatch)) { // this should be infrequent
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
    AnonymousVariablesMatch other = (AnonymousVariablesMatch) obj;
    if (fTeacher == null) {if (other.fTeacher != null) return false;}
    else if (!fTeacher.equals(other.fTeacher)) return false;
    return true;
  }
  
  @Override
  public AnonymousVariablesQuerySpecification specification() {
    try {
    	return AnonymousVariablesQuerySpecification.instance();
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
  public static AnonymousVariablesMatch newEmptyMatch() {
    return new Mutable(null);
  }
  
  /**
   * Returns a mutable (partial) match.
   * Fields of the mutable match can be filled to create a partial match, usable as matcher input.
   * 
   * @param pTeacher the fixed value of pattern parameter teacher, or null if not bound.
   * @return the new, mutable (partial) match object.
   * 
   */
  public static AnonymousVariablesMatch newMutableMatch(final Teacher pTeacher) {
    return new Mutable(pTeacher);
  }
  
  /**
   * Returns a new (partial) match.
   * This can be used e.g. to call the matcher with a partial match.
   * <p>The returned match will be immutable. Use {@link #newEmptyMatch()} to obtain a mutable match object.
   * @param pTeacher the fixed value of pattern parameter teacher, or null if not bound.
   * @return the (partial) match object.
   * 
   */
  public static AnonymousVariablesMatch newMatch(final Teacher pTeacher) {
    return new Immutable(pTeacher);
  }
  
  private static final class Mutable extends AnonymousVariablesMatch {
    Mutable(final Teacher pTeacher) {
      super(pTeacher);
    }
    
    @Override
    public boolean isMutable() {
      return true;
    }
  }
  
  private static final class Immutable extends AnonymousVariablesMatch {
    Immutable(final Teacher pTeacher) {
      super(pTeacher);
    }
    
    @Override
    public boolean isMutable() {
      return false;
    }
  }
}
