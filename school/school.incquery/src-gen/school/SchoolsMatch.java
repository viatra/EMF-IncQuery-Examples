package school;

import java.util.Arrays;
import java.util.List;
import org.eclipse.incquery.runtime.api.IPatternMatch;
import org.eclipse.incquery.runtime.api.impl.BasePatternMatch;
import org.eclipse.incquery.runtime.exception.IncQueryException;
import school.School;
import school.util.SchoolsQuerySpecification;

/**
 * Pattern-specific match representation of the school.schools pattern,
 * to be used in conjunction with {@link SchoolsMatcher}.
 * 
 * <p>Class fields correspond to parameters of the pattern. Fields with value null are considered unassigned.
 * Each instance is a (possibly partial) substitution of pattern parameters,
 * usable to represent a match of the pattern in the result of a query,
 * or to specify the bound (fixed) input parameters when issuing a query.
 * 
 * @see SchoolsMatcher
 * @see SchoolsProcessor
 * 
 */
@SuppressWarnings("all")
public abstract class SchoolsMatch extends BasePatternMatch {
  private School fSch;
  
  private static List<String> parameterNames = makeImmutableList("Sch");
  
  private SchoolsMatch(final School pSch) {
    this.fSch = pSch;
    
  }
  
  @Override
  public Object get(final String parameterName) {
    if ("Sch".equals(parameterName)) return this.fSch;
    return null;
    
  }
  
  public School getSch() {
    return this.fSch;
    
  }
  
  @Override
  public boolean set(final String parameterName, final Object newValue) {
    if (!isMutable()) throw new java.lang.UnsupportedOperationException();
    if ("Sch".equals(parameterName) ) {
    	this.fSch = (school.School) newValue;
    	return true;
    }
    return false;
    
  }
  
  public void setSch(final School pSch) {
    if (!isMutable()) throw new java.lang.UnsupportedOperationException();
    this.fSch = pSch;
    
  }
  
  @Override
  public String patternName() {
    return "school.schools";
    
  }
  
  @Override
  public List<String> parameterNames() {
    return SchoolsMatch.parameterNames;
    
  }
  
  @Override
  public Object[] toArray() {
    return new Object[]{fSch};
    
  }
  
  @Override
  public String prettyPrint() {
    StringBuilder result = new StringBuilder();
    result.append("\"Sch\"=" + prettyPrintValue(fSch));
    return result.toString();
    
  }
  
  @Override
  public int hashCode() {
    final int prime = 31;
    int result = 1;
    result = prime * result + ((fSch == null) ? 0 : fSch.hashCode());
    return result;
    
  }
  
  @Override
  public boolean equals(final Object obj) {
    if (this == obj)
    	return true;
    if (!(obj instanceof SchoolsMatch)) { // this should be infrequent
    	if (obj == null)
    		return false;
    	if (!(obj instanceof IPatternMatch))
    		return false;
    	IPatternMatch otherSig  = (IPatternMatch) obj;
    	if (!specification().equals(otherSig.specification()))
    		return false;
    	return Arrays.deepEquals(toArray(), otherSig.toArray());
    }
    SchoolsMatch other = (SchoolsMatch) obj;
    if (fSch == null) {if (other.fSch != null) return false;}
    else if (!fSch.equals(other.fSch)) return false;
    return true;
  }
  
  @Override
  public SchoolsQuerySpecification specification() {
    try {
    	return SchoolsQuerySpecification.instance();
    } catch (IncQueryException ex) {
     	// This cannot happen, as the match object can only be instantiated if the query specification exists
     	throw new IllegalStateException	(ex);
    }
    
  }
  
  @SuppressWarnings("all")
  static final class Mutable extends SchoolsMatch {
    Mutable(final School pSch) {
      super(pSch);
      
    }
    
    @Override
    public boolean isMutable() {
      return true;
    }
  }
  
  
  @SuppressWarnings("all")
  static final class Immutable extends SchoolsMatch {
    Immutable(final School pSch) {
      super(pSch);
      
    }
    
    @Override
    public boolean isMutable() {
      return false;
    }
  }
  
}
