package school.finalpattern2;

import java.util.Arrays;
import org.eclipse.viatra2.emf.incquery.runtime.api.IPatternMatch;
import org.eclipse.viatra2.emf.incquery.runtime.api.impl.BasePatternMatch;
import org.eclipse.viatra2.emf.incquery.runtime.exception.IncQueryException;
import org.eclipse.viatra2.patternlanguage.core.patternLanguage.Pattern;

/**
 * Pattern-specific match representation of the finalPattern2 pattern, 
 * to be used in conjunction with FinalPattern2Matcher.
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
public final class FinalPattern2Match extends BasePatternMatch implements IPatternMatch {
  private Integer fYDate;
  
  private String fCSub;
  
  private String fTName;
  
  private String fSName;
  
  private static String[] parameterNames = {"YDate", "CSub", "TName", "SName"};
  
  FinalPattern2Match(final Integer pYDate, final String pCSub, final String pTName, final String pSName) {
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
    if ("YDate".equals(parameterName) && newValue instanceof java.lang.Integer) {
    	this.fYDate = (java.lang.Integer) newValue;
    	return true;
    }
    if ("CSub".equals(parameterName) && newValue instanceof java.lang.String) {
    	this.fCSub = (java.lang.String) newValue;
    	return true;
    }
    if ("TName".equals(parameterName) && newValue instanceof java.lang.String) {
    	this.fTName = (java.lang.String) newValue;
    	return true;
    }
    if ("SName".equals(parameterName) && newValue instanceof java.lang.String) {
    	this.fSName = (java.lang.String) newValue;
    	return true;
    }
    return false;
    
  }
  
  public void setYDate(final Integer pYDate) {
    this.fYDate = pYDate;
    
  }
  
  public void setCSub(final String pCSub) {
    this.fCSub = pCSub;
    
  }
  
  public void setTName(final String pTName) {
    this.fTName = pTName;
    
  }
  
  public void setSName(final String pSName) {
    this.fSName = pSName;
    
  }
  
  @Override
  public String patternName() {
    return "finalPattern2";
    
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
    if (obj == null)
    	return false;
    if (!(obj instanceof IPatternMatch))
    	return false;
    IPatternMatch otherSig  = (IPatternMatch) obj;
    if (!pattern().equals(otherSig.pattern()))
    	return false;
    if (!FinalPattern2Match.class.equals(obj.getClass()))
    	return Arrays.deepEquals(toArray(), otherSig.toArray());
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
    	return FinalPattern2Matcher.factory().getPattern();
    } catch (IncQueryException ex) {
     	// This cannot happen, as the match object can only be instantiated if the matcher factory exists
     	ex.printStackTrace();
     	throw new IllegalStateException	(ex);
    }
    
  }
}
