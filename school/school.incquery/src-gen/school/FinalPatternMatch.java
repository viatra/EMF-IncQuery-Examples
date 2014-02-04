package school;

import java.util.Arrays;
import java.util.List;
import org.eclipse.incquery.runtime.api.IPatternMatch;
import org.eclipse.incquery.runtime.api.impl.BasePatternMatch;
import org.eclipse.incquery.runtime.exception.IncQueryException;
import school.Course;
import school.Student;
import school.Teacher;
import school.Year;
import school.util.FinalPatternQuerySpecification;

/**
 * Pattern-specific match representation of the school.finalPattern pattern,
 * to be used in conjunction with {@link FinalPatternMatcher}.
 * 
 * <p>Class fields correspond to parameters of the pattern. Fields with value null are considered unassigned.
 * Each instance is a (possibly partial) substitution of pattern parameters,
 * usable to represent a match of the pattern in the result of a query,
 * or to specify the bound (fixed) input parameters when issuing a query.
 * 
 * @see FinalPatternMatcher
 * @see FinalPatternProcessor
 * 
 */
@SuppressWarnings("all")
public abstract class FinalPatternMatch extends BasePatternMatch {
  private Year fY;
  
  private Course fC;
  
  private Teacher fT;
  
  private Student fS;
  
  private static List<String> parameterNames = makeImmutableList("Y", "C", "T", "S");
  
  private FinalPatternMatch(final Year pY, final Course pC, final Teacher pT, final Student pS) {
    this.fY = pY;
    this.fC = pC;
    this.fT = pT;
    this.fS = pS;
    
  }
  
  @Override
  public Object get(final String parameterName) {
    if ("Y".equals(parameterName)) return this.fY;
    if ("C".equals(parameterName)) return this.fC;
    if ("T".equals(parameterName)) return this.fT;
    if ("S".equals(parameterName)) return this.fS;
    return null;
    
  }
  
  public Year getY() {
    return this.fY;
    
  }
  
  public Course getC() {
    return this.fC;
    
  }
  
  public Teacher getT() {
    return this.fT;
    
  }
  
  public Student getS() {
    return this.fS;
    
  }
  
  @Override
  public boolean set(final String parameterName, final Object newValue) {
    if (!isMutable()) throw new java.lang.UnsupportedOperationException();
    if ("Y".equals(parameterName) ) {
    	this.fY = (school.Year) newValue;
    	return true;
    }
    if ("C".equals(parameterName) ) {
    	this.fC = (school.Course) newValue;
    	return true;
    }
    if ("T".equals(parameterName) ) {
    	this.fT = (school.Teacher) newValue;
    	return true;
    }
    if ("S".equals(parameterName) ) {
    	this.fS = (school.Student) newValue;
    	return true;
    }
    return false;
    
  }
  
  public void setY(final Year pY) {
    if (!isMutable()) throw new java.lang.UnsupportedOperationException();
    this.fY = pY;
    
  }
  
  public void setC(final Course pC) {
    if (!isMutable()) throw new java.lang.UnsupportedOperationException();
    this.fC = pC;
    
  }
  
  public void setT(final Teacher pT) {
    if (!isMutable()) throw new java.lang.UnsupportedOperationException();
    this.fT = pT;
    
  }
  
  public void setS(final Student pS) {
    if (!isMutable()) throw new java.lang.UnsupportedOperationException();
    this.fS = pS;
    
  }
  
  @Override
  public String patternName() {
    return "school.finalPattern";
    
  }
  
  @Override
  public List<String> parameterNames() {
    return FinalPatternMatch.parameterNames;
    
  }
  
  @Override
  public Object[] toArray() {
    return new Object[]{fY, fC, fT, fS};
    
  }
  
  @Override
  public String prettyPrint() {
    StringBuilder result = new StringBuilder();
    result.append("\"Y\"=" + prettyPrintValue(fY) + ", ");
    result.append("\"C\"=" + prettyPrintValue(fC) + ", ");
    result.append("\"T\"=" + prettyPrintValue(fT) + ", ");
    result.append("\"S\"=" + prettyPrintValue(fS));
    return result.toString();
    
  }
  
  @Override
  public int hashCode() {
    final int prime = 31;
    int result = 1;
    result = prime * result + ((fY == null) ? 0 : fY.hashCode());
    result = prime * result + ((fC == null) ? 0 : fC.hashCode());
    result = prime * result + ((fT == null) ? 0 : fT.hashCode());
    result = prime * result + ((fS == null) ? 0 : fS.hashCode());
    return result;
    
  }
  
  @Override
  public boolean equals(final Object obj) {
    if (this == obj)
    	return true;
    if (!(obj instanceof FinalPatternMatch)) { // this should be infrequent
    	if (obj == null)
    		return false;
    	if (!(obj instanceof IPatternMatch))
    		return false;
    	IPatternMatch otherSig  = (IPatternMatch) obj;
    	if (!specification().equals(otherSig.specification()))
    		return false;
    	return Arrays.deepEquals(toArray(), otherSig.toArray());
    }
    FinalPatternMatch other = (FinalPatternMatch) obj;
    if (fY == null) {if (other.fY != null) return false;}
    else if (!fY.equals(other.fY)) return false;
    if (fC == null) {if (other.fC != null) return false;}
    else if (!fC.equals(other.fC)) return false;
    if (fT == null) {if (other.fT != null) return false;}
    else if (!fT.equals(other.fT)) return false;
    if (fS == null) {if (other.fS != null) return false;}
    else if (!fS.equals(other.fS)) return false;
    return true;
  }
  
  @Override
  public FinalPatternQuerySpecification specification() {
    try {
    	return FinalPatternQuerySpecification.instance();
    } catch (IncQueryException ex) {
     	// This cannot happen, as the match object can only be instantiated if the query specification exists
     	throw new IllegalStateException	(ex);
    }
    
  }
  
  @SuppressWarnings("all")
  static final class Mutable extends FinalPatternMatch {
    Mutable(final Year pY, final Course pC, final Teacher pT, final Student pS) {
      super(pY, pC, pT, pS);
      
    }
    
    @Override
    public boolean isMutable() {
      return true;
    }
  }
  
  
  @SuppressWarnings("all")
  static final class Immutable extends FinalPatternMatch {
    Immutable(final Year pY, final Course pC, final Teacher pT, final Student pS) {
      super(pY, pC, pT, pS);
      
    }
    
    @Override
    public boolean isMutable() {
      return false;
    }
  }
  
}
