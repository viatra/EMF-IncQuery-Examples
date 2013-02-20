package school.teacherwithoutclassnames;

import java.util.Arrays;
import org.eclipse.incquery.patternlanguage.patternLanguage.Pattern;
import org.eclipse.incquery.runtime.api.IPatternMatch;
import org.eclipse.incquery.runtime.api.impl.BasePatternMatch;
import org.eclipse.incquery.runtime.exception.IncQueryException;

/**
 * Pattern-specific match representation of the school.teacherWithoutClassNames pattern, 
 * to be used in conjunction with {@link TeacherWithoutClassNamesMatcher}.
 * 
 * <p>Class fields correspond to parameters of the pattern. Fields with value null are considered unassigned.
 * Each instance is a (possibly partial) substitution of pattern parameters, 
 * usable to represent a match of the pattern in the result of a query, 
 * or to specify the bound (fixed) input parameters when issuing a query.
 * 
 * @see TeacherWithoutClassNamesMatcher
 * @see TeacherWithoutClassNamesProcessor
 * 
 */
public abstract class TeacherWithoutClassNamesMatch extends BasePatternMatch {
  private String fTNames;
  
  private static String[] parameterNames = {"TNames"};
  
  private TeacherWithoutClassNamesMatch(final String pTNames) {
    this.fTNames = pTNames;
    
  }
  
  @Override
  public Object get(final String parameterName) {
    if ("TNames".equals(parameterName)) return this.fTNames;
    return null;
    
  }
  
  public String getTNames() {
    return this.fTNames;
    
  }
  
  @Override
  public boolean set(final String parameterName, final Object newValue) {
    if (!isMutable()) throw new java.lang.UnsupportedOperationException();
    if ("TNames".equals(parameterName) ) {
    	this.fTNames = (java.lang.String) newValue;
    	return true;
    }
    return false;
    
  }
  
  public void setTNames(final String pTNames) {
    if (!isMutable()) throw new java.lang.UnsupportedOperationException();
    this.fTNames = pTNames;
    
  }
  
  @Override
  public String patternName() {
    return "school.teacherWithoutClassNames";
    
  }
  
  @Override
  public String[] parameterNames() {
    return TeacherWithoutClassNamesMatch.parameterNames;
    
  }
  
  @Override
  public Object[] toArray() {
    return new Object[]{fTNames};
    
  }
  
  @Override
  public String prettyPrint() {
    StringBuilder result = new StringBuilder();
    result.append("\"TNames\"=" + prettyPrintValue(fTNames));
    return result.toString();
    
  }
  
  @Override
  public int hashCode() {
    final int prime = 31;
    int result = 1;
    result = prime * result + ((fTNames == null) ? 0 : fTNames.hashCode()); 
    return result; 
    
  }
  
  @Override
  public boolean equals(final Object obj) {
    if (this == obj)
    	return true;
    if (obj == null)
    	return false;
    if (!(obj instanceof IPatternMatch))
    	return false;
    IPatternMatch otherSig  = (IPatternMatch) obj;
    if (!pattern().equals(otherSig.pattern()))
    	return false;
    if (!TeacherWithoutClassNamesMatch.class.equals(obj.getClass()))
    	return Arrays.deepEquals(toArray(), otherSig.toArray());
    TeacherWithoutClassNamesMatch other = (TeacherWithoutClassNamesMatch) obj;
    if (fTNames == null) {if (other.fTNames != null) return false;}
    else if (!fTNames.equals(other.fTNames)) return false;
    return true;
  }
  
  @Override
  public Pattern pattern() {
    try {
    	return TeacherWithoutClassNamesMatcher.factory().getPattern();
    } catch (IncQueryException ex) {
     	// This cannot happen, as the match object can only be instantiated if the matcher factory exists
     	throw new IllegalStateException	(ex);
    }
    
  }
  static final class Mutable extends TeacherWithoutClassNamesMatch {
    Mutable(final String pTNames) {
      super(pTNames);
      
    }
    
    @Override
    public boolean isMutable() {
      return true;
    }
  }
  
  static final class Immutable extends TeacherWithoutClassNamesMatch {
    Immutable(final String pTNames) {
      super(pTNames);
      
    }
    
    @Override
    public boolean isMutable() {
      return false;
    }
  }
  
}
