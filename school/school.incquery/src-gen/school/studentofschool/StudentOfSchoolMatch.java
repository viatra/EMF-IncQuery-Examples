package school.studentofschool;

import java.util.Arrays;
import org.eclipse.viatra2.emf.incquery.runtime.api.IPatternMatch;
import org.eclipse.viatra2.emf.incquery.runtime.api.impl.BasePatternMatch;
import org.eclipse.viatra2.emf.incquery.runtime.exception.IncQueryException;
import org.eclipse.viatra2.patternlanguage.core.patternLanguage.Pattern;
import school.School;
import school.Student;

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
  private Student fS;
  
  private School fSch;
  
  private static String[] parameterNames = {"S", "Sch"};
  
  StudentOfSchoolMatch(final Student pS, final School pSch) {
    this.fS = pS;
    this.fSch = pSch;
    
  }
  
  @Override
  public Object get(final String parameterName) {
    if ("S".equals(parameterName)) return this.fS;
    if ("Sch".equals(parameterName)) return this.fSch;
    return null;
    
  }
  
  public Student getS() {
    return this.fS;
    
  }
  
  public School getSch() {
    return this.fSch;
    
  }
  
  @Override
  public boolean set(final String parameterName, final Object newValue) {
    if ("S".equals(parameterName) && newValue instanceof school.Student) {
    	this.fS = (school.Student) newValue;
    	return true;
    }
    if ("Sch".equals(parameterName) && newValue instanceof school.School) {
    	this.fSch = (school.School) newValue;
    	return true;
    }
    return false;
    
  }
  
  public void setS(final Student pS) {
    this.fS = pS;
    
  }
  
  public void setSch(final School pSch) {
    this.fSch = pSch;
    
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
    return new Object[]{fS, fSch};
    
  }
  
  @Override
  public String prettyPrint() {
    StringBuilder result = new StringBuilder();
    result.append("\"S\"=" + prettyPrintValue(fS) + ", ");
    result.append("\"Sch\"=" + prettyPrintValue(fSch));
    return result.toString();
    
  }
  
  @Override
  public int hashCode() {
    final int prime = 31;
    int result = 1;
    result = prime * result + ((fS == null) ? 0 : fS.hashCode()); 
    result = prime * result + ((fSch == null) ? 0 : fSch.hashCode()); 
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
    if (fS == null) {if (other.fS != null) return false;}
    else if (!fS.equals(other.fS)) return false;
    if (fSch == null) {if (other.fSch != null) return false;}
    else if (!fSch.equals(other.fSch)) return false;
    return true;
  }
  
  @Override
  public Pattern pattern() {
    try {
    	return StudentOfSchoolMatcher.factory().getPattern();
    } catch (IncQueryException ex) {
     	// This cannot happen, as the match object can only be instantiated if the matcher factory exists
     	ex.printStackTrace();
     	throw new IllegalStateException	(ex);
    }
    
  }
}