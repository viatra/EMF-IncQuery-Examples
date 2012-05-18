package school.studentofschool;

import java.util.Arrays;
import org.eclipse.viatra2.emf.incquery.runtime.api.IPatternMatch;
import org.eclipse.viatra2.emf.incquery.runtime.api.impl.BasePatternMatch;
import org.eclipse.viatra2.patternlanguage.core.patternLanguage.Pattern;

/**
 * Pattern-specific match representation of the studentOfSchool pattern, 
 * to be used in conjunction with StudentOfSchoolMatcher.
 * 
 * <p>Class fields correspond to parameters of the pattern. Fields with value null are considered unassigned.
 * Each instance is a (possibly partial) substitution of pattern parameters, 
 * usable to represent a match of the pattern in the result of a query, 
 * or to specify the bound (fixed) input parameters when issuing a query.
 * 
 * @see StudentOfSchoolMatcher
 * @see StudentOfSchoolProcessor
 * 
 */
public final class StudentOfSchoolMatch extends BasePatternMatch implements IPatternMatch {
  private Object fStudent;
  
  private Object fSchool;
  
  private Object fYear;
  
  private Object fSchoolClass;
  
  private static String[] parameterNames = {"Student", "School", "Year", "SchoolClass"};
  
  public StudentOfSchoolMatch(final Object pStudent, final Object pSchool, final Object pYear, final Object pSchoolClass) {
    this.fStudent = pStudent;
    this.fSchool = pSchool;
    this.fYear = pYear;
    this.fSchoolClass = pSchoolClass;
    
  }
  
  @Override
  public Object get(final String parameterName) {
    if ("Student".equals(parameterName)) return this.fStudent;
    if ("School".equals(parameterName)) return this.fSchool;
    if ("Year".equals(parameterName)) return this.fYear;
    if ("SchoolClass".equals(parameterName)) return this.fSchoolClass;
    return null;
    
  }
  
  public Object getStudent() {
    return this.fStudent;
    
  }
  
  public Object getSchool() {
    return this.fSchool;
    
  }
  
  public Object getYear() {
    return this.fYear;
    
  }
  
  public Object getSchoolClass() {
    return this.fSchoolClass;
    
  }
  
  @Override
  public boolean set(final String parameterName, final Object newValue) {
    if ("Student".equals(parameterName) && newValue instanceof java.lang.Object) {
    	this.fStudent = (java.lang.Object) newValue;
    	return true;
    }
    if ("School".equals(parameterName) && newValue instanceof java.lang.Object) {
    	this.fSchool = (java.lang.Object) newValue;
    	return true;
    }
    if ("Year".equals(parameterName) && newValue instanceof java.lang.Object) {
    	this.fYear = (java.lang.Object) newValue;
    	return true;
    }
    if ("SchoolClass".equals(parameterName) && newValue instanceof java.lang.Object) {
    	this.fSchoolClass = (java.lang.Object) newValue;
    	return true;
    }
    return false;
    
  }
  
  public void setStudent(final Object pStudent) {
    this.fStudent = pStudent;
    
  }
  
  public void setSchool(final Object pSchool) {
    this.fSchool = pSchool;
    
  }
  
  public void setYear(final Object pYear) {
    this.fYear = pYear;
    
  }
  
  public void setSchoolClass(final Object pSchoolClass) {
    this.fSchoolClass = pSchoolClass;
    
  }
  
  @Override
  public String patternName() {
    return "studentOfSchool";
    
  }
  
  @Override
  public String[] parameterNames() {
    return StudentOfSchoolMatch.parameterNames;
    
  }
  
  @Override
  public Object[] toArray() {
    return new Object[]{fStudent, fSchool, fYear, fSchoolClass};
    
  }
  
  @Override
  public String prettyPrint() {
    StringBuilder result = new StringBuilder();
    result.append("\"Student\"=" + prettyPrintValue(fStudent) + ", ");
    result.append("\"School\"=" + prettyPrintValue(fSchool) + ", ");
    result.append("\"Year\"=" + prettyPrintValue(fYear) + ", ");
    result.append("\"SchoolClass\"=" + prettyPrintValue(fSchoolClass));
    return result.toString();
    
  }
  
  @Override
  public int hashCode() {
    final int prime = 31;
    int result = 1;
    result = prime * result + ((fStudent == null) ? 0 : fStudent.hashCode()); 
    result = prime * result + ((fSchool == null) ? 0 : fSchool.hashCode()); 
    result = prime * result + ((fYear == null) ? 0 : fYear.hashCode()); 
    result = prime * result + ((fSchoolClass == null) ? 0 : fSchoolClass.hashCode()); 
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
    if (!StudentOfSchoolMatch.class.equals(obj.getClass()))
    	return Arrays.deepEquals(toArray(), otherSig.toArray());
    				StudentOfSchoolMatch other = (StudentOfSchoolMatch) obj;
    				if (fStudent == null) {if (other.fStudent != null) return false;}
    				else if (!fStudent.equals(other.fStudent)) return false;
    				if (fSchool == null) {if (other.fSchool != null) return false;}
    				else if (!fSchool.equals(other.fSchool)) return false;
    				if (fYear == null) {if (other.fYear != null) return false;}
    				else if (!fYear.equals(other.fYear)) return false;
    				if (fSchoolClass == null) {if (other.fSchoolClass != null) return false;}
    				else if (!fSchoolClass.equals(other.fSchoolClass)) return false;
    				return true;
    
  }
  
  @Override
  public Pattern pattern() {
    return StudentOfSchoolMatcher.FACTORY.getPattern();
  }
}
