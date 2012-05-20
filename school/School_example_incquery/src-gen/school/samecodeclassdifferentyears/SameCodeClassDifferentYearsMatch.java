package school.samecodeclassdifferentyears;

import java.util.Arrays;
import org.eclipse.viatra2.emf.incquery.runtime.api.IPatternMatch;
import org.eclipse.viatra2.emf.incquery.runtime.api.impl.BasePatternMatch;
import org.eclipse.viatra2.patternlanguage.core.patternLanguage.Pattern;

/**
 * Pattern-specific match representation of the sameCodeClassDifferentYears pattern, 
 * to be used in conjunction with SameCodeClassDifferentYearsMatcher.
 * 
 * <p>Class fields correspond to parameters of the pattern. Fields with value null are considered unassigned.
 * Each instance is a (possibly partial) substitution of pattern parameters, 
 * usable to represent a match of the pattern in the result of a query, 
 * or to specify the bound (fixed) input parameters when issuing a query.
 * 
 * @see SameCodeClassDifferentYearsMatcher
 * @see SameCodeClassDifferentYearsProcessor
 * 
 */
public final class SameCodeClassDifferentYearsMatch extends BasePatternMatch implements IPatternMatch {
  private Object fElderStudent;
  
  private Object fYoungerStudent;
  
  private static String[] parameterNames = {"ElderStudent", "YoungerStudent"};
  
  public SameCodeClassDifferentYearsMatch(final Object pElderStudent, final Object pYoungerStudent) {
    this.fElderStudent = pElderStudent;
    this.fYoungerStudent = pYoungerStudent;
    
  }
  
  @Override
  public Object get(final String parameterName) {
    if ("ElderStudent".equals(parameterName)) return this.fElderStudent;
    if ("YoungerStudent".equals(parameterName)) return this.fYoungerStudent;
    return null;
    
  }
  
  public Object getElderStudent() {
    return this.fElderStudent;
    
  }
  
  public Object getYoungerStudent() {
    return this.fYoungerStudent;
    
  }
  
  @Override
  public boolean set(final String parameterName, final Object newValue) {
    if ("ElderStudent".equals(parameterName) && newValue instanceof java.lang.Object) {
    	this.fElderStudent = (java.lang.Object) newValue;
    	return true;
    }
    if ("YoungerStudent".equals(parameterName) && newValue instanceof java.lang.Object) {
    	this.fYoungerStudent = (java.lang.Object) newValue;
    	return true;
    }
    return false;
    
  }
  
  public void setElderStudent(final Object pElderStudent) {
    this.fElderStudent = pElderStudent;
    
  }
  
  public void setYoungerStudent(final Object pYoungerStudent) {
    this.fYoungerStudent = pYoungerStudent;
    
  }
  
  @Override
  public String patternName() {
    return "sameCodeClassDifferentYears";
    
  }
  
  @Override
  public String[] parameterNames() {
    return SameCodeClassDifferentYearsMatch.parameterNames;
    
  }
  
  @Override
  public Object[] toArray() {
    return new Object[]{fElderStudent, fYoungerStudent};
    
  }
  
  @Override
  public String prettyPrint() {
    StringBuilder result = new StringBuilder();
    result.append("\"ElderStudent\"=" + prettyPrintValue(fElderStudent) + ", ");
    
    result.append("\"YoungerStudent\"=" + prettyPrintValue(fYoungerStudent)
    );return result.toString();
    
  }
  
  @Override
  public int hashCode() {
    final int prime = 31;
    int result = 1;
    result = prime * result + ((fElderStudent == null) ? 0 : fElderStudent.hashCode()); 
    result = prime * result + ((fYoungerStudent == null) ? 0 : fYoungerStudent.hashCode()); 
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
    if (!SameCodeClassDifferentYearsMatch.class.equals(obj.getClass()))
    	return Arrays.deepEquals(toArray(), otherSig.toArray());
    				SameCodeClassDifferentYearsMatch other = (SameCodeClassDifferentYearsMatch) obj;
    				if (fElderStudent == null) {if (other.fElderStudent != null) return false;}
    				else if (!fElderStudent.equals(other.fElderStudent)) return false;
    				if (fYoungerStudent == null) {if (other.fYoungerStudent != null) return false;}
    				else if (!fYoungerStudent.equals(other.fYoungerStudent)) return false;
    				return true;
    
  }
  
  @Override
  public Pattern pattern() {
    return SameCodeClassDifferentYearsMatcher.FACTORY.getPattern();
  }
}
