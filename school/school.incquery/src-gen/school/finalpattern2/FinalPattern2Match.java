package school.finalpattern2;

import java.util.Arrays;
import org.eclipse.incquery.patternlanguage.patternLanguage.Pattern;
import org.eclipse.incquery.runtime.api.IPatternMatch;
import org.eclipse.incquery.runtime.api.impl.BasePatternMatch;
import org.eclipse.incquery.runtime.exception.IncQueryException;

/**
 * Pattern-specific match representation of the school.finalPattern2 pattern, 
 * to be used in conjunction with {@link FinalPattern2Matcher}.
 * 
 * <p>Class fields correspond to parameters of the pattern. Fields with value null are considered unassigned.
 * Each instance is a (possibly partial) substitution of pattern parameters, 
 * usable to represent a match of the pattern in the result of a query, 
 * or to specify the bound (fixed) input parameters when issuing a query.
 * 
 * @see FinalPattern2Matcher
 * @see FinalPattern2Processor
 * 
 */
public abstract class FinalPattern2Match extends BasePatternMatch {
  private Integer fYDate;
  
  private String fCSub;
  
  private String fTName;
  
  private String fSName;
  
  private static String[] parameterNames = {"YDate", "CSub", "TName", "SName"};
  
  private FinalPattern2Match(final Integer pYDate, final String pCSub, final String pTName, final String pSName) {
    this.fYDate = pYDate;
    this.fCSub = pCSub;
    this.fTName = pTName;
    this.fSName = pSName;
    
  }
  
  @Override
  public Object get(final String parameterName) {
    if ("YDate".equals(parameterName)) return this.fYDate;
    if ("CSub".equals(parameterName)) return this.fCSub;
    if ("TName".equals(parameterName)) return this.fTName;
    if ("SName".equals(parameterName)) return this.fSName;
    return null;
    
  }
  
  public Integer getYDate() {
    return this.fYDate;
    
  }
  
  public String getCSub() {
    return this.fCSub;
    
  }
  
  public String getTName() {
    return this.fTName;
    
  }
  
  public String getSName() {
    return this.fSName;
    
  }
  
  @Override
  public boolean set(final String parameterName, final Object newValue) {
    if (!isMutable()) throw new java.lang.UnsupportedOperationException();
    if ("YDate".equals(parameterName) ) {
    	this.fYDate = (java.lang.Integer) newValue;
    	return true;
    }
    if ("CSub".equals(parameterName) ) {
    	this.fCSub = (java.lang.String) newValue;
    	return true;
    }
    if ("TName".equals(parameterName) ) {
    	this.fTName = (java.lang.String) newValue;
    	return true;
    }
    if ("SName".equals(parameterName) ) {
    	this.fSName = (java.lang.String) newValue;
    	return true;
    }
    return false;
    
  }
  
  public void setYDate(final Integer pYDate) {
    if (!isMutable()) throw new java.lang.UnsupportedOperationException();
    this.fYDate = pYDate;
    
  }
  
  public void setCSub(final String pCSub) {
    if (!isMutable()) throw new java.lang.UnsupportedOperationException();
    this.fCSub = pCSub;
    
  }
  
  public void setTName(final String pTName) {
    if (!isMutable()) throw new java.lang.UnsupportedOperationException();
    this.fTName = pTName;
    
  }
  
  public void setSName(final String pSName) {
    if (!isMutable()) throw new java.lang.UnsupportedOperationException();
    this.fSName = pSName;
    
  }
  
  @Override
  public String patternName() {
    return "school.finalPattern2";
    
  }
  
  @Override
  public String[] parameterNames() {
    return FinalPattern2Match.parameterNames;
    
  }
  
  @Override
  public Object[] toArray() {
    return new Object[]{fYDate, fCSub, fTName, fSName};
    
  }
  
  @Override
  public String prettyPrint() {
    StringBuilder result = new StringBuilder();
    result.append("\"YDate\"=" + prettyPrintValue(fYDate) + ", ");
    result.append("\"CSub\"=" + prettyPrintValue(fCSub) + ", ");
    result.append("\"TName\"=" + prettyPrintValue(fTName) + ", ");
    result.append("\"SName\"=" + prettyPrintValue(fSName));
    return result.toString();
    
  }
  
  @Override
  public int hashCode() {
    final int prime = 31;
    int result = 1;
    result = prime * result + ((fYDate == null) ? 0 : fYDate.hashCode()); 
    result = prime * result + ((fCSub == null) ? 0 : fCSub.hashCode()); 
    result = prime * result + ((fTName == null) ? 0 : fTName.hashCode()); 
    result = prime * result + ((fSName == null) ? 0 : fSName.hashCode()); 
    return result; 
    
  }
  
  @Override
  public boolean equals(final Object obj) {
    if (this == obj)
    	return true;
    if (!(obj instanceof FinalPattern2Match)) { // this should be infrequent				
    	if (obj == null)
    		return false;
    	if (!(obj instanceof IPatternMatch))
    		return false;
    	IPatternMatch otherSig  = (IPatternMatch) obj;
    	if (!pattern().equals(otherSig.pattern()))
    		return false;
    	return Arrays.deepEquals(toArray(), otherSig.toArray());
    }
    FinalPattern2Match other = (FinalPattern2Match) obj;
    if (fYDate == null) {if (other.fYDate != null) return false;}
    else if (!fYDate.equals(other.fYDate)) return false;
    if (fCSub == null) {if (other.fCSub != null) return false;}
    else if (!fCSub.equals(other.fCSub)) return false;
    if (fTName == null) {if (other.fTName != null) return false;}
    else if (!fTName.equals(other.fTName)) return false;
    if (fSName == null) {if (other.fSName != null) return false;}
    else if (!fSName.equals(other.fSName)) return false;
    return true;
  }
  
  @Override
  public Pattern pattern() {
    try {
    	return FinalPattern2Matcher.querySpecification().getPattern();
    } catch (IncQueryException ex) {
     	// This cannot happen, as the match object can only be instantiated if the query specification exists
     	throw new IllegalStateException	(ex);
    }
    
  }
  static final class Mutable extends FinalPattern2Match {
    Mutable(final Integer pYDate, final String pCSub, final String pTName, final String pSName) {
      super(pYDate, pCSub, pTName, pSName);
      
    }
    
    @Override
    public boolean isMutable() {
      return true;
    }
  }
  
  static final class Immutable extends FinalPattern2Match {
    Immutable(final Integer pYDate, final String pCSub, final String pTName, final String pSName) {
      super(pYDate, pCSub, pTName, pSName);
      
    }
    
    @Override
    public boolean isMutable() {
      return false;
    }
  }
  
}
