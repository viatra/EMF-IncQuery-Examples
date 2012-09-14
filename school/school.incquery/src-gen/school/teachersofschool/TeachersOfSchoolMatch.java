package school.teachersofschool;

import java.util.Arrays;
import org.eclipse.viatra2.emf.incquery.runtime.api.IPatternMatch;
import org.eclipse.viatra2.emf.incquery.runtime.api.impl.BasePatternMatch;
import org.eclipse.viatra2.emf.incquery.runtime.exception.IncQueryException;
import org.eclipse.viatra2.patternlanguage.core.patternLanguage.Pattern;
import school.School;
import school.Teacher;

/**
 * Pattern-specific match representation of the teachersOfSchool pattern, 
 * to be used in conjunction with TeachersOfSchoolMatcher.
 * 
 * <p>Class fields correspond to parameters of the pattern. Fields with value null are considered unassigned.
 * Each instance is a (possibly partial) substitution of pattern parameters, 
 * usable to represent a match of the pattern in the result of a query, 
 * or to specify the bound (fixed) input parameters when issuing a query.
 * 
 * @see TeachersOfSchoolMatcher
 * @see TeachersOfSchoolProcessor
 * 
 */
public final class TeachersOfSchoolMatch extends BasePatternMatch {
  private Teacher fT;
  
  private School fSch;
  
  private static String[] parameterNames = {"T", "Sch"};
  
  TeachersOfSchoolMatch(final Teacher pT, final School pSch) {
    this.fT = pT;
    this.fSch = pSch;
    
  }
  
  @Override
  public Object get(final String parameterName) {
    if ("T".equals(parameterName)) return this.fT;
    if ("Sch".equals(parameterName)) return this.fSch;
    return null;
    
  }
  
  public Teacher getT() {
    return this.fT;
    
  }
  
  public School getSch() {
    return this.fSch;
    
  }
  
  @Override
  public boolean set(final String parameterName, final Object newValue) {
    if ("T".equals(parameterName) ) {
    	this.fT = (school.Teacher) newValue;
    	return true;
    }
    if ("Sch".equals(parameterName) ) {
    	this.fSch = (school.School) newValue;
    	return true;
    }
    return false;
    
  }
  
  public void setT(final Teacher pT) {
    this.fT = pT;
    
  }
  
  public void setSch(final School pSch) {
    this.fSch = pSch;
    
  }
  
  @Override
  public String patternName() {
    return "teachersOfSchool";
    
  }
  
  @Override
  public String[] parameterNames() {
    return TeachersOfSchoolMatch.parameterNames;
    
  }
  
  @Override
  public Object[] toArray() {
    return new Object[]{fT, fSch};
    
  }
  
  @Override
  public String prettyPrint() {
    StringBuilder result = new StringBuilder();
    result.append("\"T\"=" + prettyPrintValue(fT) + ", ");
    result.append("\"Sch\"=" + prettyPrintValue(fSch));
    return result.toString();
    
  }
  
  @Override
  public int hashCode() {
    final int prime = 31;
    int result = 1;
    result = prime * result + ((fT == null) ? 0 : fT.hashCode()); 
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
    if (!TeachersOfSchoolMatch.class.equals(obj.getClass()))
    	return Arrays.deepEquals(toArray(), otherSig.toArray());
    TeachersOfSchoolMatch other = (TeachersOfSchoolMatch) obj;
    if (fT == null) {if (other.fT != null) return false;}
    else if (!fT.equals(other.fT)) return false;
    if (fSch == null) {if (other.fSch != null) return false;}
    else if (!fSch.equals(other.fSch)) return false;
    return true;
  }
  
  @Override
  public Pattern pattern() {
    try {
    	return TeachersOfSchoolMatcher.factory().getPattern();
    } catch (IncQueryException ex) {
     	// This cannot happen, as the match object can only be instantiated if the matcher factory exists
     	throw new IllegalStateException	(ex);
    }
    
  }
}
