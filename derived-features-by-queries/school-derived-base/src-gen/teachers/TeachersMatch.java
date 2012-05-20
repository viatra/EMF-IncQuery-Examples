package teachers;

import java.util.Arrays;
import org.eclipse.viatra2.emf.incquery.runtime.api.IPatternMatch;
import org.eclipse.viatra2.emf.incquery.runtime.api.impl.BasePatternMatch;
import org.eclipse.viatra2.patternlanguage.core.patternLanguage.Pattern;

/**
 * Pattern-specific match representation of the teachers pattern, 
 * to be used in conjunction with TeachersMatcher.
 * 
 * <p>Class fields correspond to parameters of the pattern. Fields with value null are considered unassigned.
 * Each instance is a (possibly partial) substitution of pattern parameters, 
 * usable to represent a match of the pattern in the result of a query, 
 * or to specify the bound (fixed) input parameters when issuing a query.
 * 
 * @see TeachersMatcher
 * @see TeachersProcessor
 * 
 */
public final class TeachersMatch extends BasePatternMatch implements IPatternMatch {
  private Object fSchool;
  
  private Object fTeacher;
  
  private static String[] parameterNames = {"School", "Teacher"};
  
  public TeachersMatch(final Object pSchool, final Object pTeacher) {
    this.fSchool = pSchool;
    this.fTeacher = pTeacher;
    
  }
  
  @Override
  public Object get(final String parameterName) {
    if ("School".equals(parameterName)) return this.fSchool;
    if ("Teacher".equals(parameterName)) return this.fTeacher;
    return null;
    
  }
  
  public Object getSchool() {
    return this.fSchool;
    
  }
  
  public Object getTeacher() {
    return this.fTeacher;
    
  }
  
  @Override
  public boolean set(final String parameterName, final Object newValue) {
    if ("School".equals(parameterName) && newValue instanceof java.lang.Object) {
    	this.fSchool = (java.lang.Object) newValue;
    	return true;
    }
    if ("Teacher".equals(parameterName) && newValue instanceof java.lang.Object) {
    	this.fTeacher = (java.lang.Object) newValue;
    	return true;
    }
    return false;
    
  }
  
  public void setSchool(final Object pSchool) {
    this.fSchool = pSchool;
    
  }
  
  public void setTeacher(final Object pTeacher) {
    this.fTeacher = pTeacher;
    
  }
  
  @Override
  public String patternName() {
    return "teachers";
    
  }
  
  @Override
  public String[] parameterNames() {
    return TeachersMatch.parameterNames;
    
  }
  
  @Override
  public Object[] toArray() {
    return new Object[]{fSchool, fTeacher};
    
  }
  
  @Override
  public String prettyPrint() {
    StringBuilder result = new StringBuilder();
    result.append("\"School\"=" + prettyPrintValue(fSchool) + ", ");
    
    result.append("\"Teacher\"=" + prettyPrintValue(fTeacher)
    );return result.toString();
    
  }
  
  @Override
  public int hashCode() {
    final int prime = 31;
    int result = 1;
    result = prime * result + ((fSchool == null) ? 0 : fSchool.hashCode()); 
    result = prime * result + ((fTeacher == null) ? 0 : fTeacher.hashCode()); 
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
    if (!TeachersMatch.class.equals(obj.getClass()))
    	return Arrays.deepEquals(toArray(), otherSig.toArray());
    				TeachersMatch other = (TeachersMatch) obj;
    				if (fSchool == null) {if (other.fSchool != null) return false;}
    				else if (!fSchool.equals(other.fSchool)) return false;
    				if (fTeacher == null) {if (other.fTeacher != null) return false;}
    				else if (!fTeacher.equals(other.fTeacher)) return false;
    				return true;
    
  }
  
  @Override
  public Pattern pattern() {
    return TeachersMatcher.FACTORY.getPattern();
  }
}
