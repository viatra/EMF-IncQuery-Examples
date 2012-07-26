package school.schools;

import java.util.Arrays;
import org.eclipse.viatra2.emf.incquery.runtime.api.IPatternMatch;
import org.eclipse.viatra2.emf.incquery.runtime.api.impl.BasePatternMatch;
import org.eclipse.viatra2.emf.incquery.runtime.exception.IncQueryException;
import org.eclipse.viatra2.patternlanguage.core.patternLanguage.Pattern;
import school.School;

/**
 * Pattern-specific match representation of the schools pattern, 
 * to be used in conjunction with SchoolsMatcher.
 * 
 * <p>Class fields correspond to parameters of the pattern. Fields with value null are considered unassigned.
 * Each instance is a (possibly partial) substitution of pattern parameters, 
 * usable to represent a match of the pattern in the result of a query, 
 * or to specify the bound (fixed) input parameters when issuing a query.
 * 
 * @see SchoolsMatcher
 * @see SchoolsProcessor
 * 
 */
public final class SchoolsMatch extends BasePatternMatch implements IPatternMatch {
  private School fSch;
  
  private static String[] parameterNames = {"Sch"};
  
  SchoolsMatch(final School pSch) {
    this.fSch = pSch;
    
  }
  
  @Override
  public Object get(final String parameterName) {
    if ("Sch".equals(parameterName)) return this.fSch;
    return null;
    
  }
  
  public School getSch() {
    return this.fSch;
    
  }
  
  @Override
  public boolean set(final String parameterName, final Object newValue) {
    if ("Sch".equals(parameterName) && newValue instanceof school.School) {
    	this.fSch = (school.School) newValue;
    	return true;
    }
    return false;
    
  }
  
  public void setSch(final School pSch) {
    this.fSch = pSch;
    
  }
  
  @Override
  public String patternName() {
    return "schools";
    
  }
  
  @Override
  public String[] parameterNames() {
    return SchoolsMatch.parameterNames;
    
  }
  
  @Override
  public Object[] toArray() {
    return new Object[]{fSch};
    
  }
  
  @Override
  public String prettyPrint() {
    StringBuilder result = new StringBuilder();
    result.append("\"Sch\"=" + prettyPrintValue(fSch));
    return result.toString();
    
  }
  
  @Override
  public int hashCode() {
    final int prime = 31;
    int result = 1;
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
    if (!SchoolsMatch.class.equals(obj.getClass()))
    	return Arrays.deepEquals(toArray(), otherSig.toArray());
    SchoolsMatch other = (SchoolsMatch) obj;
    if (fSch == null) {if (other.fSch != null) return false;}
    else if (!fSch.equals(other.fSch)) return false;
    return true;
  }
  
  @Override
  public Pattern pattern() {
    try {
    	return SchoolsMatcher.factory().getPattern();
    } catch (IncQueryException ex) {
     	// This cannot happen, as the match object can only be instantiated if the matcher factory exists
     	ex.printStackTrace();
     	throw new IllegalStateException	(ex);
    }
    
  }
}
