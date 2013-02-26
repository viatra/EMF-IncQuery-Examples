package school.coursewithoutteacher;

import java.util.Arrays;
import org.eclipse.incquery.patternlanguage.patternLanguage.Pattern;
import org.eclipse.incquery.runtime.api.IPatternMatch;
import org.eclipse.incquery.runtime.api.impl.BasePatternMatch;
import org.eclipse.incquery.runtime.exception.IncQueryException;
import school.Course;

/**
 * Pattern-specific match representation of the school.CourseWithoutTeacher pattern, 
 * to be used in conjunction with {@link CourseWithoutTeacherMatcher}.
 * 
 * <p>Class fields correspond to parameters of the pattern. Fields with value null are considered unassigned.
 * Each instance is a (possibly partial) substitution of pattern parameters, 
 * usable to represent a match of the pattern in the result of a query, 
 * or to specify the bound (fixed) input parameters when issuing a query.
 * 
 * @see CourseWithoutTeacherMatcher
 * @see CourseWithoutTeacherProcessor
 * 
 */
public abstract class CourseWithoutTeacherMatch extends BasePatternMatch {
  private Course fC;
  
  private static String[] parameterNames = {"C"};
  
  private CourseWithoutTeacherMatch(final Course pC) {
    this.fC = pC;
    
  }
  
  @Override
  public Object get(final String parameterName) {
    if ("C".equals(parameterName)) return this.fC;
    return null;
    
  }
  
  public Course getC() {
    return this.fC;
    
  }
  
  @Override
  public boolean set(final String parameterName, final Object newValue) {
    if (!isMutable()) throw new java.lang.UnsupportedOperationException();
    if ("C".equals(parameterName) ) {
    	this.fC = (school.Course) newValue;
    	return true;
    }
    return false;
    
  }
  
  public void setC(final Course pC) {
    if (!isMutable()) throw new java.lang.UnsupportedOperationException();
    this.fC = pC;
    
  }
  
  @Override
  public String patternName() {
    return "school.CourseWithoutTeacher";
    
  }
  
  @Override
  public String[] parameterNames() {
    return CourseWithoutTeacherMatch.parameterNames;
    
  }
  
  @Override
  public Object[] toArray() {
    return new Object[]{fC};
    
  }
  
  @Override
  public String prettyPrint() {
    StringBuilder result = new StringBuilder();
    result.append("\"C\"=" + prettyPrintValue(fC));
    return result.toString();
    
  }
  
  @Override
  public int hashCode() {
    final int prime = 31;
    int result = 1;
    result = prime * result + ((fC == null) ? 0 : fC.hashCode()); 
    return result; 
    
  }
  
  @Override
  public boolean equals(final Object obj) {
    if (this == obj)
    	return true;
    if (!(obj instanceof CourseWithoutTeacherMatch)) { // this should be infrequent				
    	if (obj == null)
    		return false;
    	if (!(obj instanceof IPatternMatch))
    		return false;
    	IPatternMatch otherSig  = (IPatternMatch) obj;
    	if (!pattern().equals(otherSig.pattern()))
    		return false;
    	return Arrays.deepEquals(toArray(), otherSig.toArray());
    }
    CourseWithoutTeacherMatch other = (CourseWithoutTeacherMatch) obj;
    if (fC == null) {if (other.fC != null) return false;}
    else if (!fC.equals(other.fC)) return false;
    return true;
  }
  
  @Override
  public Pattern pattern() {
    try {
    	return CourseWithoutTeacherMatcher.factory().getPattern();
    } catch (IncQueryException ex) {
     	// This cannot happen, as the match object can only be instantiated if the matcher factory exists
     	throw new IllegalStateException	(ex);
    }
    
  }
  static final class Mutable extends CourseWithoutTeacherMatch {
    Mutable(final Course pC) {
      super(pC);
      
    }
    
    @Override
    public boolean isMutable() {
      return true;
    }
  }
  
  static final class Immutable extends CourseWithoutTeacherMatch {
    Immutable(final Course pC) {
      super(pC);
      
    }
    
    @Override
    public boolean isMutable() {
      return false;
    }
  }
  
}
