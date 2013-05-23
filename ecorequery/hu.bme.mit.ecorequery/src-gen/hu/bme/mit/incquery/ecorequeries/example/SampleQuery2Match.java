package hu.bme.mit.incquery.ecorequeries.example;

import java.util.Arrays;
import java.util.List;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.incquery.patternlanguage.patternLanguage.Pattern;
import org.eclipse.incquery.runtime.api.IPatternMatch;
import org.eclipse.incquery.runtime.api.impl.BasePatternMatch;
import org.eclipse.incquery.runtime.exception.IncQueryException;

/**
 * Pattern-specific match representation of the hu.bme.mit.incquery.ecorequeries.example.SampleQuery2 pattern, 
 * to be used in conjunction with {@link SampleQuery2Matcher}.
 * 
 * <p>Class fields correspond to parameters of the pattern. Fields with value null are considered unassigned.
 * Each instance is a (possibly partial) substitution of pattern parameters, 
 * usable to represent a match of the pattern in the result of a query, 
 * or to specify the bound (fixed) input parameters when issuing a query.
 * 
 * @see SampleQuery2Matcher
 * @see SampleQuery2Processor
 * 
 */
public abstract class SampleQuery2Match extends BasePatternMatch {
  private EClass fXElement;
  
  private EClass fYElement;
  
  private EReference fRelates1;
  
  private EReference fRelates2;
  
  private EAttribute fLabel1;
  
  private EAttribute fLabel2;
  
  private static List<String> parameterNames = makeImmutableList("XElement", "YElement", "Relates1", "Relates2", "Label1", "Label2");
  
  private SampleQuery2Match(final EClass pXElement, final EClass pYElement, final EReference pRelates1, final EReference pRelates2, final EAttribute pLabel1, final EAttribute pLabel2) {
    this.fXElement = pXElement;
    this.fYElement = pYElement;
    this.fRelates1 = pRelates1;
    this.fRelates2 = pRelates2;
    this.fLabel1 = pLabel1;
    this.fLabel2 = pLabel2;
    
  }
  
  @Override
  public Object get(final String parameterName) {
    if ("XElement".equals(parameterName)) return this.fXElement;
    if ("YElement".equals(parameterName)) return this.fYElement;
    if ("Relates1".equals(parameterName)) return this.fRelates1;
    if ("Relates2".equals(parameterName)) return this.fRelates2;
    if ("Label1".equals(parameterName)) return this.fLabel1;
    if ("Label2".equals(parameterName)) return this.fLabel2;
    return null;
    
  }
  
  public EClass getXElement() {
    return this.fXElement;
    
  }
  
  public EClass getYElement() {
    return this.fYElement;
    
  }
  
  public EReference getRelates1() {
    return this.fRelates1;
    
  }
  
  public EReference getRelates2() {
    return this.fRelates2;
    
  }
  
  public EAttribute getLabel1() {
    return this.fLabel1;
    
  }
  
  public EAttribute getLabel2() {
    return this.fLabel2;
    
  }
  
  @Override
  public boolean set(final String parameterName, final Object newValue) {
    if (!isMutable()) throw new java.lang.UnsupportedOperationException();
    if ("XElement".equals(parameterName) ) {
    	this.fXElement = (org.eclipse.emf.ecore.EClass) newValue;
    	return true;
    }
    if ("YElement".equals(parameterName) ) {
    	this.fYElement = (org.eclipse.emf.ecore.EClass) newValue;
    	return true;
    }
    if ("Relates1".equals(parameterName) ) {
    	this.fRelates1 = (org.eclipse.emf.ecore.EReference) newValue;
    	return true;
    }
    if ("Relates2".equals(parameterName) ) {
    	this.fRelates2 = (org.eclipse.emf.ecore.EReference) newValue;
    	return true;
    }
    if ("Label1".equals(parameterName) ) {
    	this.fLabel1 = (org.eclipse.emf.ecore.EAttribute) newValue;
    	return true;
    }
    if ("Label2".equals(parameterName) ) {
    	this.fLabel2 = (org.eclipse.emf.ecore.EAttribute) newValue;
    	return true;
    }
    return false;
    
  }
  
  public void setXElement(final EClass pXElement) {
    if (!isMutable()) throw new java.lang.UnsupportedOperationException();
    this.fXElement = pXElement;
    
  }
  
  public void setYElement(final EClass pYElement) {
    if (!isMutable()) throw new java.lang.UnsupportedOperationException();
    this.fYElement = pYElement;
    
  }
  
  public void setRelates1(final EReference pRelates1) {
    if (!isMutable()) throw new java.lang.UnsupportedOperationException();
    this.fRelates1 = pRelates1;
    
  }
  
  public void setRelates2(final EReference pRelates2) {
    if (!isMutable()) throw new java.lang.UnsupportedOperationException();
    this.fRelates2 = pRelates2;
    
  }
  
  public void setLabel1(final EAttribute pLabel1) {
    if (!isMutable()) throw new java.lang.UnsupportedOperationException();
    this.fLabel1 = pLabel1;
    
  }
  
  public void setLabel2(final EAttribute pLabel2) {
    if (!isMutable()) throw new java.lang.UnsupportedOperationException();
    this.fLabel2 = pLabel2;
    
  }
  
  @Override
  public String patternName() {
    return "hu.bme.mit.incquery.ecorequeries.example.SampleQuery2";
    
  }
  
  @Override
  public List<String> parameterNames() {
    return SampleQuery2Match.parameterNames;
    
  }
  
  @Override
  public Object[] toArray() {
    return new Object[]{fXElement, fYElement, fRelates1, fRelates2, fLabel1, fLabel2};
    
  }
  
  @Override
  public String prettyPrint() {
    StringBuilder result = new StringBuilder();
    result.append("\"XElement\"=" + prettyPrintValue(fXElement) + ", ");
    result.append("\"YElement\"=" + prettyPrintValue(fYElement) + ", ");
    result.append("\"Relates1\"=" + prettyPrintValue(fRelates1) + ", ");
    result.append("\"Relates2\"=" + prettyPrintValue(fRelates2) + ", ");
    result.append("\"Label1\"=" + prettyPrintValue(fLabel1) + ", ");
    result.append("\"Label2\"=" + prettyPrintValue(fLabel2));
    return result.toString();
    
  }
  
  @Override
  public int hashCode() {
    final int prime = 31;
    int result = 1;
    result = prime * result + ((fXElement == null) ? 0 : fXElement.hashCode()); 
    result = prime * result + ((fYElement == null) ? 0 : fYElement.hashCode()); 
    result = prime * result + ((fRelates1 == null) ? 0 : fRelates1.hashCode()); 
    result = prime * result + ((fRelates2 == null) ? 0 : fRelates2.hashCode()); 
    result = prime * result + ((fLabel1 == null) ? 0 : fLabel1.hashCode()); 
    result = prime * result + ((fLabel2 == null) ? 0 : fLabel2.hashCode()); 
    return result; 
    
  }
  
  @Override
  public boolean equals(final Object obj) {
    if (this == obj)
    	return true;
    if (!(obj instanceof SampleQuery2Match)) { // this should be infrequent				
    	if (obj == null)
    		return false;
    	if (!(obj instanceof IPatternMatch))
    		return false;
    	IPatternMatch otherSig  = (IPatternMatch) obj;
    	if (!pattern().equals(otherSig.pattern()))
    		return false;
    	return Arrays.deepEquals(toArray(), otherSig.toArray());
    }
    SampleQuery2Match other = (SampleQuery2Match) obj;
    if (fXElement == null) {if (other.fXElement != null) return false;}
    else if (!fXElement.equals(other.fXElement)) return false;
    if (fYElement == null) {if (other.fYElement != null) return false;}
    else if (!fYElement.equals(other.fYElement)) return false;
    if (fRelates1 == null) {if (other.fRelates1 != null) return false;}
    else if (!fRelates1.equals(other.fRelates1)) return false;
    if (fRelates2 == null) {if (other.fRelates2 != null) return false;}
    else if (!fRelates2.equals(other.fRelates2)) return false;
    if (fLabel1 == null) {if (other.fLabel1 != null) return false;}
    else if (!fLabel1.equals(other.fLabel1)) return false;
    if (fLabel2 == null) {if (other.fLabel2 != null) return false;}
    else if (!fLabel2.equals(other.fLabel2)) return false;
    return true;
  }
  
  @Override
  public Pattern pattern() {
    try {
    	return SampleQuery2Matcher.querySpecification().getPattern();
    } catch (IncQueryException ex) {
     	// This cannot happen, as the match object can only be instantiated if the query specification exists
     	throw new IllegalStateException	(ex);
    }
    
  }
  static final class Mutable extends SampleQuery2Match {
    Mutable(final EClass pXElement, final EClass pYElement, final EReference pRelates1, final EReference pRelates2, final EAttribute pLabel1, final EAttribute pLabel2) {
      super(pXElement, pYElement, pRelates1, pRelates2, pLabel1, pLabel2);
      
    }
    
    @Override
    public boolean isMutable() {
      return true;
    }
  }
  
  static final class Immutable extends SampleQuery2Match {
    Immutable(final EClass pXElement, final EClass pYElement, final EReference pRelates1, final EReference pRelates2, final EAttribute pLabel1, final EAttribute pLabel2) {
      super(pXElement, pYElement, pRelates1, pRelates2, pLabel1, pLabel2);
      
    }
    
    @Override
    public boolean isMutable() {
      return false;
    }
  }
  
}
