package school;

import org.eclipse.incquery.runtime.api.IncQueryEngine;
import org.eclipse.incquery.runtime.api.impl.BaseGeneratedPatternGroup;
import org.eclipse.incquery.runtime.exception.IncQueryException;
import school.A_translatedMatcher;
import school.A_translated_0Matcher;
import school.A_translated_1Matcher;
import school.B_translatedMatcher;
import school.C_translatedMatcher;
import school.C_translated_0Matcher;
import school.util.A_translatedQuerySpecification;
import school.util.A_translated_0QuerySpecification;
import school.util.A_translated_1QuerySpecification;
import school.util.B_translatedQuerySpecification;
import school.util.C_translatedQuerySpecification;
import school.util.C_translated_0QuerySpecification;

/**
 * A pattern group formed of all patterns defined in oclQueries.eiq.
 * 
 * <p>Use the static instance as any {@link org.eclipse.incquery.runtime.api.IPatternGroup}, to conveniently prepare
 * an EMF-IncQuery engine for matching all patterns originally defined in file oclQueries.eiq,
 * in order to achieve better performance than one-by-one on-demand matcher initialization.
 * 
 * <p> From package school, the group contains the definition of the following patterns: <ul>
 * <li>A_translated</li>
 * <li>A_translated_0</li>
 * <li>A_translated_1</li>
 * <li>B_translated</li>
 * <li>C_translated</li>
 * <li>C_translated_0</li>
 * </ul>
 * 
 * @see IPatternGroup
 * 
 */
@SuppressWarnings("all")
public final class OclQueries extends BaseGeneratedPatternGroup {
  /**
   * Access the pattern group.
   * 
   * @return the singleton instance of the group
   * @throws IncQueryException if there was an error loading the generated code of pattern specifications
   * 
   */
  public static OclQueries instance() throws IncQueryException {
    if (INSTANCE == null) {
    	INSTANCE = new OclQueries();
    }
    return INSTANCE;
    
  }
  
  private static OclQueries INSTANCE;
  
  private OclQueries() throws IncQueryException {
    querySpecifications.add(A_translatedQuerySpecification.instance());
    querySpecifications.add(A_translated_0QuerySpecification.instance());
    querySpecifications.add(A_translated_1QuerySpecification.instance());
    querySpecifications.add(B_translatedQuerySpecification.instance());
    querySpecifications.add(C_translatedQuerySpecification.instance());
    querySpecifications.add(C_translated_0QuerySpecification.instance());
    
  }
  
  public A_translatedQuerySpecification getA_translated() throws IncQueryException {
    return A_translatedQuerySpecification.instance();
  }
  
  public A_translatedMatcher getA_translated(final IncQueryEngine engine) throws IncQueryException {
    return A_translatedMatcher.on(engine);
  }
  
  public A_translated_0QuerySpecification getA_translated_0() throws IncQueryException {
    return A_translated_0QuerySpecification.instance();
  }
  
  public A_translated_0Matcher getA_translated_0(final IncQueryEngine engine) throws IncQueryException {
    return A_translated_0Matcher.on(engine);
  }
  
  public A_translated_1QuerySpecification getA_translated_1() throws IncQueryException {
    return A_translated_1QuerySpecification.instance();
  }
  
  public A_translated_1Matcher getA_translated_1(final IncQueryEngine engine) throws IncQueryException {
    return A_translated_1Matcher.on(engine);
  }
  
  public B_translatedQuerySpecification getB_translated() throws IncQueryException {
    return B_translatedQuerySpecification.instance();
  }
  
  public B_translatedMatcher getB_translated(final IncQueryEngine engine) throws IncQueryException {
    return B_translatedMatcher.on(engine);
  }
  
  public C_translatedQuerySpecification getC_translated() throws IncQueryException {
    return C_translatedQuerySpecification.instance();
  }
  
  public C_translatedMatcher getC_translated(final IncQueryEngine engine) throws IncQueryException {
    return C_translatedMatcher.on(engine);
  }
  
  public C_translated_0QuerySpecification getC_translated_0() throws IncQueryException {
    return C_translated_0QuerySpecification.instance();
  }
  
  public C_translated_0Matcher getC_translated_0(final IncQueryEngine engine) throws IncQueryException {
    return C_translated_0Matcher.on(engine);
  }
}
