package school;

import java.util.Arrays;
import org.eclipse.incquery.patternlanguage.patternLanguage.Pattern;
import org.eclipse.incquery.runtime.api.IPatternMatch;
import org.eclipse.incquery.runtime.api.impl.BasePatternMatch;
import org.eclipse.incquery.runtime.exception.IncQueryException;
import school.SchoolClass;
import school.Teacher;

/**
 * Pattern-specific match representation of the school.classesOfTeacher pattern, 
 * to be used in conjunction with {@link ClassesOfTeacherMatcher}.
 * 
 * <p>Class fields correspond to parameters of the pattern. Fields with value null are considered unassigned.
 * Each instance is a (possibly partial) substitution of pattern parameters, 
 * usable to represent a match of the pattern in the result of a query, 
 * or to specify the bound (fixed) input parameters when issuing a query.
 * 
 * @see ClassesOfTeacherMatcher
 * @see ClassesOfTeacherProcessor
 * 
 */
public abstract class ClassesOfTeacherMatch extends BasePatternMatch {
  private Teacher fT;
  
  private SchoolClass fSC;
  
  private static String[] parameterNames = {"T", "SC"};
  
  private ClassesOfTeacherMatch(final Teacher pT, final SchoolClass pSC) {
    this.fT = pT;
    this.fSC = pSC;
    
  }
  
  @Override
  public Object get(final String parameterName) {
    if ("T".equals(parameterName)) return this.fT;
    if ("SC".equals(parameterName)) return this.fSC;
    return null;
    
  }
  
  public Teacher getT() {
    return this.fT;
    
  }
  
  public SchoolClass getSC() {
    return this.fSC;
    
  }
  
  @Override
  public boolean set(final String parameterName, final Object newValue) {
    if (!isMutable()) throw new java.lang.UnsupportedOperationException();
    if ("T".equals(parameterName) ) {
    	this.fT = (school.Teacher) newValue;
    	return true;
    }
    if ("SC".equals(parameterName) ) {
    	this.fSC = (school.SchoolClass) newValue;
    	return true;
    }
    return false;
    
  }
  
  public void setT(final Teacher pT) {
    if (!isMutable()) throw new java.lang.UnsupportedOperationException();
    this.fT = pT;
    
  }
  
  public void setSC(final SchoolClass pSC) {
    if (!isMutable()) throw new java.lang.UnsupportedOperationException();
    this.fSC = pSC;
    
  }
  
  @Override
  public String patternName() {
    return "school.classesOfTeacher";
    
  }
  
  @Override
  public String[] parameterNames() {
    return ClassesOfTeacherMatch.parameterNames;
    
  }
  
  @Override
  public Object[] toArray() {
    return new Object[]{fT, fSC};
    
  }
  
  @Override
  public String prettyPrint() {
    StringBuilder result = new StringBuilder();
    result.append("\"T\"=" + prettyPrintValue(fT) + ", ");
    result.append("\"SC\"=" + prettyPrintValue(fSC));
    return result.toString();
    
  }
  
  @Override
  public int hashCode() {
    final int prime = 31;
    int result = 1;
    result = prime * result + ((fT == null) ? 0 : fT.hashCode()); 
    result = prime * result + ((fSC == null) ? 0 : fSC.hashCode()); 
    return result; 
    
  }
  
  @Override
  public boolean equals(final Object obj) {
    if (this == obj)
    	return true;
    if (!(obj instanceof ClassesOfTeacherMatch)) { // this should be infrequent				
    	if (obj == null)
    		return false;
    	if (!(obj instanceof IPatternMatch))
    		return false;
    	IPatternMatch otherSig  = (IPatternMatch) obj;
    	if (!pattern().equals(otherSig.pattern()))
    		return false;
    	return Arrays.deepEquals(toArray(), otherSig.toArray());
    }
    ClassesOfTeacherMatch other = (ClassesOfTeacherMatch) obj;
    if (fT == null) {if (other.fT != null) return false;}
    else if (!fT.equals(other.fT)) return false;
    if (fSC == null) {if (other.fSC != null) return false;}
    else if (!fSC.equals(other.fSC)) return false;
    return true;
  }
  
  @Override
  public Pattern pattern() {
    try {
    	return ClassesOfTeacherMatcher.querySpecification().getPattern();
    } catch (IncQueryException ex) {
     	// This cannot happen, as the match object can only be instantiated if the query specification exists
     	throw new IllegalStateException	(ex);
    }
    
  }
  static final class Mutable extends ClassesOfTeacherMatch {
    Mutable(final Teacher pT, final SchoolClass pSC) {
      super(pT, pSC);
      
    }
    
    @Override
    public boolean isMutable() {
      return true;
    }
  }
  
  static final class Immutable extends ClassesOfTeacherMatch {
    Immutable(final Teacher pT, final SchoolClass pSC) {
      super(pT, pSC);
      
    }
    
    @Override
    public boolean isMutable() {
      return false;
    }
  }
  
}
