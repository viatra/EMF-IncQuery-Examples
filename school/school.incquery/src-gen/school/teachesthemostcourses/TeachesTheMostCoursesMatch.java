package school.teachesthemostcourses;

import java.util.Arrays;
import org.eclipse.viatra2.emf.incquery.runtime.api.IPatternMatch;
import org.eclipse.viatra2.emf.incquery.runtime.api.impl.BasePatternMatch;
import org.eclipse.viatra2.emf.incquery.runtime.exception.IncQueryException;
import org.eclipse.viatra2.patternlanguage.core.patternLanguage.Pattern;
import school.Teacher;

/**
 * Pattern-specific match representation of the teachesTheMostCourses pattern, 
 * to be used in conjunction with TeachesTheMostCoursesMatcher.
 * 
 * <p>Class fields correspond to parameters of the pattern. Fields with value null are considered unassigned.
 * Each instance is a (possibly partial) substitution of pattern parameters, 
 * usable to represent a match of the pattern in the result of a query, 
 * or to specify the bound (fixed) input parameters when issuing a query.
 * 
 * @see TeachesTheMostCoursesMatcher
 * @see TeachesTheMostCoursesProcessor
 * 
 */
public final class TeachesTheMostCoursesMatch extends BasePatternMatch implements IPatternMatch {
  private Teacher fT;
  
  private static String[] parameterNames = {"T"};
  
  TeachesTheMostCoursesMatch(final Teacher pT) {
    this.fT = pT;
    
  }
  
  @Override
  public Object get(final String parameterName) {
    if ("T".equals(parameterName)) return this.fT;
    return null;
    
  }
  
  public Teacher getT() {
    return this.fT;
    
  }
  
  @Override
  public boolean set(final String parameterName, final Object newValue) {
    
    if ("T".equals(parameterName) 
    ) {
    	this.fT = (school.Teacher) newValue;
    	return true;
    }
    return false;
    
  }
  
  public void setT(final Teacher pT) {
    this.fT = pT;
    
  }
  
  @Override
  public String patternName() {
    return "teachesTheMostCourses";
    
  }
  
  @Override
  public String[] parameterNames() {
    return TeachesTheMostCoursesMatch.parameterNames;
    
  }
  
  @Override
  public Object[] toArray() {
    return new Object[]{fT};
    
  }
  
  @Override
  public String prettyPrint() {
    StringBuilder result = new StringBuilder();
    result.append("\"T\"=" + prettyPrintValue(fT));
    return result.toString();
    
  }
  
  @Override
  public int hashCode() {
    final int prime = 31;
    int result = 1;
    result = prime * result + ((fT == null) ? 0 : fT.hashCode()); 
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
    if (!TeachesTheMostCoursesMatch.class.equals(obj.getClass()))
    	return Arrays.deepEquals(toArray(), otherSig.toArray());
    TeachesTheMostCoursesMatch other = (TeachesTheMostCoursesMatch) obj;
    if (fT == null) {if (other.fT != null) return false;}
    else if (!fT.equals(other.fT)) return false;
    return true;
  }
  
  @Override
  public Pattern pattern() {
    try {
    	return TeachesTheMostCoursesMatcher.factory().getPattern();
    } catch (IncQueryException ex) {
     	// This cannot happen, as the match object can only be instantiated if the matcher factory exists
     	throw new IllegalStateException	(ex);
    }
    
  }
}
