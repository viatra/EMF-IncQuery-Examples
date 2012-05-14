package eclassnames;

import eclassnames.EClassNamesMatch;
import eclassnames.EClassNamesMatcher;
import org.eclipse.viatra2.emf.incquery.runtime.api.IncQueryEngine;
import org.eclipse.viatra2.emf.incquery.runtime.api.impl.BaseGeneratedMatcherFactory;
import org.eclipse.viatra2.emf.incquery.runtime.exception.IncQueryRuntimeException;

/**
 * A pattern-specific matcher factory that can instantiate EClassNamesMatcher in a type-safe way.
 * 
 * @see EClassNamesMatcher
 * @see EClassNamesMatch
 * 
 */
public class EClassNamesMatcherFactory extends BaseGeneratedMatcherFactory<EClassNamesMatch,EClassNamesMatcher> {
  @Override
  protected EClassNamesMatcher instantiate(final IncQueryEngine engine) throws IncQueryRuntimeException {
    return new EClassNamesMatcher(engine);
    
  }
  
  @Override
  protected String getBundleName() {
    return "headlessQueries.incquery";
    
  }
  
  @Override
  protected String patternName() {
    return "EClassNames";
    
  }
}
