package school;

import java.util.Arrays;
import java.util.List;
import org.eclipse.incquery.runtime.api.IPatternMatch;
import org.eclipse.incquery.runtime.api.impl.BasePatternMatch;
import org.eclipse.incquery.runtime.exception.IncQueryException;
import school.SchoolClass;
import school.Student;
import school.util.A_translatedQuerySpecification;

/**
 * Pattern-specific match representation of the school.A_translated pattern,
 * to be used in conjunction with {@link A_translatedMatcher}.
 * 
 * <p>Class fields correspond to parameters of the pattern. Fields with value null are considered unassigned.
 * Each instance is a (possibly partial) substitution of pattern parameters,
 * usable to represent a match of the pattern in the result of a query,
 * or to specify the bound (fixed) input parameters when issuing a query.
 * 
 * @see A_translatedMatcher
 * @see A_translatedProcessor
 * 
 */
@SuppressWarnings("all")
public abstract class A_translatedMatch extends BasePatternMatch {
  private SchoolClass fSelf;
  
  private Student fStudent2;
  
  private Student fStudent1;
  
  private String fName;
  
  private static List<String> parameterNames = makeImmutableList("self", "student2", "student1", "name");
  
  private A_translatedMatch(final SchoolClass pSelf, final Student pStudent2, final Student pStudent1, final String pName) {
    this.fSelf = pSelf;
    this.fStudent2 = pStudent2;
    this.fStudent1 = pStudent1;
    this.fName = pName;
    
  }
  
  @Override
  public Object get(final String parameterName) {
    if ("self".equals(parameterName)) return this.fSelf;
    if ("student2".equals(parameterName)) return this.fStudent2;
    if ("student1".equals(parameterName)) return this.fStudent1;
    if ("name".equals(parameterName)) return this.fName;
    return null;
    
  }
  
  public SchoolClass getSelf() {
    return this.fSelf;
    
  }
  
  public Student getStudent2() {
    return this.fStudent2;
    
  }
  
  public Student getStudent1() {
    return this.fStudent1;
    
  }
  
  public String getName() {
    return this.fName;
    
  }
  
  @Override
  public boolean set(final String parameterName, final Object newValue) {
    if (!isMutable()) throw new java.lang.UnsupportedOperationException();
    if ("self".equals(parameterName) ) {
    	this.fSelf = (school.SchoolClass) newValue;
    	return true;
    }
    if ("student2".equals(parameterName) ) {
    	this.fStudent2 = (school.Student) newValue;
    	return true;
    }
    if ("student1".equals(parameterName) ) {
    	this.fStudent1 = (school.Student) newValue;
    	return true;
    }
    if ("name".equals(parameterName) ) {
    	this.fName = (java.lang.String) newValue;
    	return true;
    }
    return false;
    
  }
  
  public void setSelf(final SchoolClass pSelf) {
    if (!isMutable()) throw new java.lang.UnsupportedOperationException();
    this.fSelf = pSelf;
    
  }
  
  public void setStudent2(final Student pStudent2) {
    if (!isMutable()) throw new java.lang.UnsupportedOperationException();
    this.fStudent2 = pStudent2;
    
  }
  
  public void setStudent1(final Student pStudent1) {
    if (!isMutable()) throw new java.lang.UnsupportedOperationException();
    this.fStudent1 = pStudent1;
    
  }
  
  public void setName(final String pName) {
    if (!isMutable()) throw new java.lang.UnsupportedOperationException();
    this.fName = pName;
    
  }
  
  @Override
  public String patternName() {
    return "school.A_translated";
    
  }
  
  @Override
  public List<String> parameterNames() {
    return A_translatedMatch.parameterNames;
    
  }
  
  @Override
  public Object[] toArray() {
    return new Object[]{fSelf, fStudent2, fStudent1, fName};
    
  }
  
  @Override
  public String prettyPrint() {
    StringBuilder result = new StringBuilder();
    result.append("\"self\"=" + prettyPrintValue(fSelf) + ", ");
    result.append("\"student2\"=" + prettyPrintValue(fStudent2) + ", ");
    result.append("\"student1\"=" + prettyPrintValue(fStudent1) + ", ");
    result.append("\"name\"=" + prettyPrintValue(fName));
    return result.toString();
    
  }
  
  @Override
  public int hashCode() {
    final int prime = 31;
    int result = 1;
    result = prime * result + ((fSelf == null) ? 0 : fSelf.hashCode());
    result = prime * result + ((fStudent2 == null) ? 0 : fStudent2.hashCode());
    result = prime * result + ((fStudent1 == null) ? 0 : fStudent1.hashCode());
    result = prime * result + ((fName == null) ? 0 : fName.hashCode());
    return result;
    
  }
  
  @Override
  public boolean equals(final Object obj) {
    if (this == obj)
    	return true;
    if (!(obj instanceof A_translatedMatch)) { // this should be infrequent
    	if (obj == null)
    		return false;
    	if (!(obj instanceof IPatternMatch))
    		return false;
    	IPatternMatch otherSig  = (IPatternMatch) obj;
    	if (!specification().equals(otherSig.specification()))
    		return false;
    	return Arrays.deepEquals(toArray(), otherSig.toArray());
    }
    A_translatedMatch other = (A_translatedMatch) obj;
    if (fSelf == null) {if (other.fSelf != null) return false;}
    else if (!fSelf.equals(other.fSelf)) return false;
    if (fStudent2 == null) {if (other.fStudent2 != null) return false;}
    else if (!fStudent2.equals(other.fStudent2)) return false;
    if (fStudent1 == null) {if (other.fStudent1 != null) return false;}
    else if (!fStudent1.equals(other.fStudent1)) return false;
    if (fName == null) {if (other.fName != null) return false;}
    else if (!fName.equals(other.fName)) return false;
    return true;
  }
  
  @Override
  public A_translatedQuerySpecification specification() {
    try {
    	return A_translatedQuerySpecification.instance();
    } catch (IncQueryException ex) {
     	// This cannot happen, as the match object can only be instantiated if the query specification exists
     	throw new IllegalStateException	(ex);
    }
    
  }
  
  @SuppressWarnings("all")
  static final class Mutable extends A_translatedMatch {
    Mutable(final SchoolClass pSelf, final Student pStudent2, final Student pStudent1, final String pName) {
      super(pSelf, pStudent2, pStudent1, pName);
      
    }
    
    @Override
    public boolean isMutable() {
      return true;
    }
  }
  
  
  @SuppressWarnings("all")
  static final class Immutable extends A_translatedMatch {
    Immutable(final SchoolClass pSelf, final Student pStudent2, final Student pStudent1, final String pName) {
      super(pSelf, pStudent2, pStudent1, pName);
      
    }
    
    @Override
    public boolean isMutable() {
      return false;
    }
  }
  
}
