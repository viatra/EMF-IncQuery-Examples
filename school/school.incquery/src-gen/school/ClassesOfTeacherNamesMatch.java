package school;

import java.util.Arrays;
import java.util.List;
import org.eclipse.incquery.patternlanguage.patternLanguage.Pattern;
import org.eclipse.incquery.runtime.api.IPatternMatch;
import org.eclipse.incquery.runtime.api.impl.BasePatternMatch;
import org.eclipse.incquery.runtime.exception.IncQueryException;

/**
 * Pattern-specific match representation of the school.classesOfTeacherNames pattern, 
 * to be used in conjunction with {@link ClassesOfTeacherNamesMatcher}.
 * 
 * <p>Class fields correspond to parameters of the pattern. Fields with value null are considered unassigned.
 * Each instance is a (possibly partial) substitution of pattern parameters, 
 * usable to represent a match of the pattern in the result of a query, 
 * or to specify the bound (fixed) input parameters when issuing a query.
 * 
 * @see ClassesOfTeacherNamesMatcher
 * @see ClassesOfTeacherNamesProcessor
 * 
 */
@SuppressWarnings("all")
public abstract class ClassesOfTeacherNamesMatch extends BasePatternMatch {
  private String fTName;
  
  private Character fSCName;
  
  private static List<String> parameterNames = makeImmutableList("TName", "SCName");
  
  private ClassesOfTeacherNamesMatch(final String pTName, final Character pSCName) {
    this.fTName = pTName;
    this.fSCName = pSCName;
    
  }
  
  @Override
  public Object get(final String parameterName) {
    if ("TName".equals(parameterName)) return this.fTName;
    if ("SCName".equals(parameterName)) return this.fSCName;
    return null;
    
  }
  
  public String getTName() {
    return this.fTName;
    
  }
  
  public Character getSCName() {
    return this.fSCName;
    
  }
  
  @Override
  public boolean set(final String parameterName, final Object newValue) {
    if (!isMutable()) throw new java.lang.UnsupportedOperationException();
    if ("TName".equals(parameterName) ) {
    	this.fTName = (java.lang.String) newValue;
    	return true;
    }
    if ("SCName".equals(parameterName) ) {
    	this.fSCName = (java.lang.Character) newValue;
    	return true;
    }
    return false;
    
  }
  
  public void setTName(final String pTName) {
    if (!isMutable()) throw new java.lang.UnsupportedOperationException();
    this.fTName = pTName;
    
  }
  
  public void setSCName(final Character pSCName) {
    if (!isMutable()) throw new java.lang.UnsupportedOperationException();
    this.fSCName = pSCName;
    
  }
  
  @Override
  public String patternName() {
    return "school.classesOfTeacherNames";
    
  }
  
  @Override
  public List<String> parameterNames() {
    return ClassesOfTeacherNamesMatch.parameterNames;
    
  }
  
  @Override
  public Object[] toArray() {
    return new Object[]{fTName, fSCName};
    
  }
  
  @Override
  public String prettyPrint() {
    StringBuilder result = new StringBuilder();
    result.append("\"TName\"=" + prettyPrintValue(fTName) + ", ");
    result.append("\"SCName\"=" + prettyPrintValue(fSCName));
    return result.toString();
    
  }
  
  @Override
  public int hashCode() {
    final int prime = 31;
    int result = 1;
    result = prime * result + ((fTName == null) ? 0 : fTName.hashCode()); 
    result = prime * result + ((fSCName == null) ? 0 : fSCName.hashCode()); 
    return result; 
    
  }
  
  @Override
  public boolean equals(final Object obj) {
    if (this == obj)
    	return true;
    if (!(obj instanceof ClassesOfTeacherNamesMatch)) { // this should be infrequent				
    	if (obj == null)
    		return false;
    	if (!(obj instanceof IPatternMatch))
    		return false;
    	IPatternMatch otherSig  = (IPatternMatch) obj;
    	if (!pattern().equals(otherSig.pattern()))
    		return false;
    	return Arrays.deepEquals(toArray(), otherSig.toArray());
    }
    ClassesOfTeacherNamesMatch other = (ClassesOfTeacherNamesMatch) obj;
    if (fTName == null) {if (other.fTName != null) return false;}
    else if (!fTName.equals(other.fTName)) return false;
    if (fSCName == null) {if (other.fSCName != null) return false;}
    else if (!fSCName.equals(other.fSCName)) return false;
    return true;
  }
  
  @Override
  public Pattern pattern() {
    try {
    	return ClassesOfTeacherNamesMatcher.querySpecification().getPattern();
    } catch (IncQueryException ex) {
     	// This cannot happen, as the match object can only be instantiated if the query specification exists
     	throw new IllegalStateException	(ex);
    }
    
  }
  
  @SuppressWarnings("all")
  static final class Mutable extends ClassesOfTeacherNamesMatch {
    Mutable(final String pTName, final Character pSCName) {
      super(pTName, pSCName);
      
    }
    
    @Override
    public boolean isMutable() {
      return true;
    }
  }
  
  
  @SuppressWarnings("all")
  static final class Immutable extends ClassesOfTeacherNamesMatch {
    Immutable(final String pTName, final Character pSCName) {
      super(pTName, pSCName);
      
    }
    
    @Override
    public boolean isMutable() {
      return false;
    }
  }
  
}
