package school.classesofteachernames;

import java.util.Arrays;
import org.eclipse.incquery.patternlanguage.patternLanguage.Pattern;
import org.eclipse.incquery.runtime.api.IPatternMatch;
import org.eclipse.incquery.runtime.api.impl.BasePatternMatch;
import org.eclipse.incquery.runtime.exception.IncQueryException;

/**
 * Pattern-specific match representation of the classesOfTeacherNames pattern, 
 * to be used in conjunction with ClassesOfTeacherNamesMatcher.
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
public final class ClassesOfTeacherNamesMatch extends BasePatternMatch {
  private String fTName;
  
  private Character fSCName;
  
  private static String[] parameterNames = {"TName", "SCName"};
  
  ClassesOfTeacherNamesMatch(final String pTName, final Character pSCName) {
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
    this.fTName = pTName;
    
  }
  
  public void setSCName(final Character pSCName) {
    this.fSCName = pSCName;
    
  }
  
  @Override
  public String patternName() {
    return "classesOfTeacherNames";
    
  }
  
  @Override
  public String[] parameterNames() {
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
    if (obj == null)
    	return false;
    if (!(obj instanceof IPatternMatch))
    	return false;
    IPatternMatch otherSig  = (IPatternMatch) obj;
    if (!pattern().equals(otherSig.pattern()))
    	return false;
    if (!ClassesOfTeacherNamesMatch.class.equals(obj.getClass()))
    	return Arrays.deepEquals(toArray(), otherSig.toArray());
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
    	return ClassesOfTeacherNamesMatcher.factory().getPattern();
    } catch (IncQueryException ex) {
     	// This cannot happen, as the match object can only be instantiated if the matcher factory exists
     	throw new IllegalStateException	(ex);
    }
    
  }
}
