package school.teacherwithoutclassnames;

import java.util.Arrays;
import org.eclipse.viatra2.emf.incquery.runtime.api.IPatternMatch;
import org.eclipse.viatra2.emf.incquery.runtime.api.impl.BasePatternMatch;
import org.eclipse.viatra2.emf.incquery.runtime.exception.IncQueryException;
import org.eclipse.viatra2.patternlanguage.core.patternLanguage.Pattern;

/**
 * Pattern-specific match representation of the teacherWithoutClassNames pattern, 
 * to be used in conjunction with TeacherWithoutClassNamesMatcher.
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
public final class TeacherWithoutClassNamesMatch extends BasePatternMatch implements IPatternMatch {
  private String fTNames;
  
  private static String[] parameterNames = {"TNames"};
  
  TeacherWithoutClassNamesMatch(final String pTNames) {
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
    if ("TNames".equals(parameterName) && newValue instanceof java.lang.String) {
    	this.fTNames = (java.lang.String) newValue;
    	return true;
    }
    return false;
    
  }
  
  public void setTNames(final String pTNames) {
    this.fTNames = pTNames;
    
  }
  
  @Override
  public String patternName() {
    return "teacherWithoutClassNames";
    
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
     	ex.printStackTrace();
     	throw new IllegalStateException	(ex);
    }
    
  }
}
