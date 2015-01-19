package hu.bme.mit.incquery.ecorequeries.example;

import hu.bme.mit.incquery.ecorequeries.example.util.EClassWithEStringAttributeQuerySpecification;
import java.util.Arrays;
import java.util.List;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.incquery.runtime.api.IPatternMatch;
import org.eclipse.incquery.runtime.api.impl.BasePatternMatch;
import org.eclipse.incquery.runtime.exception.IncQueryException;

/**
 * Pattern-specific match representation of the hu.bme.mit.incquery.ecorequeries.example.EClassWithEStringAttribute pattern,
 * to be used in conjunction with {@link EClassWithEStringAttributeMatcher}.
 * 
 * <p>Class fields correspond to parameters of the pattern. Fields with value null are considered unassigned.
 * Each instance is a (possibly partial) substitution of pattern parameters,
 * usable to represent a match of the pattern in the result of a query,
 * or to specify the bound (fixed) input parameters when issuing a query.
 * 
 * @see EClassWithEStringAttributeMatcher
 * @see EClassWithEStringAttributeProcessor
 * 
 */
@SuppressWarnings("all")
public abstract class EClassWithEStringAttributeMatch extends BasePatternMatch {
  private EClass fE;
  
  private EAttribute fAttr;
  
  private static List<String> parameterNames = makeImmutableList("E", "Attr");
  
  private EClassWithEStringAttributeMatch(final EClass pE, final EAttribute pAttr) {
    this.fE = pE;
    this.fAttr = pAttr;
  }
  
  @Override
  public Object get(final String parameterName) {
    if ("E".equals(parameterName)) return this.fE;
    if ("Attr".equals(parameterName)) return this.fAttr;
    return null;
  }
  
  public EClass getE() {
    return this.fE;
  }
  
  public EAttribute getAttr() {
    return this.fAttr;
  }
  
  @Override
  public boolean set(final String parameterName, final Object newValue) {
    if (!isMutable()) throw new java.lang.UnsupportedOperationException();
    if ("E".equals(parameterName) ) {
    	this.fE = (org.eclipse.emf.ecore.EClass) newValue;
    	return true;
    }
    if ("Attr".equals(parameterName) ) {
    	this.fAttr = (org.eclipse.emf.ecore.EAttribute) newValue;
    	return true;
    }
    return false;
  }
  
  public void setE(final EClass pE) {
    if (!isMutable()) throw new java.lang.UnsupportedOperationException();
    this.fE = pE;
  }
  
  public void setAttr(final EAttribute pAttr) {
    if (!isMutable()) throw new java.lang.UnsupportedOperationException();
    this.fAttr = pAttr;
  }
  
  @Override
  public String patternName() {
    return "hu.bme.mit.incquery.ecorequeries.example.EClassWithEStringAttribute";
  }
  
  @Override
  public List<String> parameterNames() {
    return EClassWithEStringAttributeMatch.parameterNames;
  }
  
  @Override
  public Object[] toArray() {
    return new Object[]{fE, fAttr};
  }
  
  @Override
  public EClassWithEStringAttributeMatch toImmutable() {
    return isMutable() ? newMatch(fE, fAttr) : this;
  }
  
  @Override
  public String prettyPrint() {
    StringBuilder result = new StringBuilder();
    result.append("\"E\"=" + prettyPrintValue(fE) + ", ");
    
    result.append("\"Attr\"=" + prettyPrintValue(fAttr)
    );
    return result.toString();
  }
  
  @Override
  public int hashCode() {
    final int prime = 31;
    int result = 1;
    result = prime * result + ((fE == null) ? 0 : fE.hashCode());
    result = prime * result + ((fAttr == null) ? 0 : fAttr.hashCode());
    return result;
  }
  
  @Override
  public boolean equals(final Object obj) {
    if (this == obj)
    	return true;
    if (!(obj instanceof EClassWithEStringAttributeMatch)) { // this should be infrequent
    	if (obj == null) {
    		return false;
    	}
    	if (!(obj instanceof IPatternMatch)) {
    		return false;
    	}
    	IPatternMatch otherSig  = (IPatternMatch) obj;
    	if (!specification().equals(otherSig.specification()))
    		return false;
    	return Arrays.deepEquals(toArray(), otherSig.toArray());
    }
    EClassWithEStringAttributeMatch other = (EClassWithEStringAttributeMatch) obj;
    if (fE == null) {if (other.fE != null) return false;}
    else if (!fE.equals(other.fE)) return false;
    if (fAttr == null) {if (other.fAttr != null) return false;}
    else if (!fAttr.equals(other.fAttr)) return false;
    return true;
  }
  
  @Override
  public EClassWithEStringAttributeQuerySpecification specification() {
    try {
    	return EClassWithEStringAttributeQuerySpecification.instance();
    } catch (IncQueryException ex) {
     	// This cannot happen, as the match object can only be instantiated if the query specification exists
     	throw new IllegalStateException (ex);
    }
  }
  
  /**
   * Returns an empty, mutable match.
   * Fields of the mutable match can be filled to create a partial match, usable as matcher input.
   * 
   * @return the empty match.
   * 
   */
  public static EClassWithEStringAttributeMatch newEmptyMatch() {
    return new Mutable(null, null);
  }
  
  /**
   * Returns a mutable (partial) match.
   * Fields of the mutable match can be filled to create a partial match, usable as matcher input.
   * 
   * @param pE the fixed value of pattern parameter E, or null if not bound.
   * @param pAttr the fixed value of pattern parameter Attr, or null if not bound.
   * @return the new, mutable (partial) match object.
   * 
   */
  public static EClassWithEStringAttributeMatch newMutableMatch(final EClass pE, final EAttribute pAttr) {
    return new Mutable(pE, pAttr);
  }
  
  /**
   * Returns a new (partial) match.
   * This can be used e.g. to call the matcher with a partial match.
   * <p>The returned match will be immutable. Use {@link #newEmptyMatch()} to obtain a mutable match object.
   * @param pE the fixed value of pattern parameter E, or null if not bound.
   * @param pAttr the fixed value of pattern parameter Attr, or null if not bound.
   * @return the (partial) match object.
   * 
   */
  public static EClassWithEStringAttributeMatch newMatch(final EClass pE, final EAttribute pAttr) {
    return new Immutable(pE, pAttr);
  }
  
  private static final class Mutable extends EClassWithEStringAttributeMatch {
    Mutable(final EClass pE, final EAttribute pAttr) {
      super(pE, pAttr);
    }
    
    @Override
    public boolean isMutable() {
      return true;
    }
  }
  
  private static final class Immutable extends EClassWithEStringAttributeMatch {
    Immutable(final EClass pE, final EAttribute pAttr) {
      super(pE, pAttr);
    }
    
    @Override
    public boolean isMutable() {
      return false;
    }
  }
}
