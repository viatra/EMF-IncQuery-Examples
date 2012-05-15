package hu.bme.mit.inf.gs.dsl.validators.collectiontypesinthearchitecture;

import hu.bme.mit.inf.gs.dsl.validators.collectiontypesinthearchitecture.CollectionTypesInTheArchitectureMatch;
import hu.bme.mit.inf.gs.dsl.validators.collectiontypesinthearchitecture.CollectionTypesInTheArchitectureMatcher;
import org.eclipse.viatra2.emf.incquery.runtime.api.IncQueryEngine;
import org.eclipse.viatra2.emf.incquery.runtime.api.impl.BaseGeneratedMatcherFactory;
import org.eclipse.viatra2.emf.incquery.runtime.exception.IncQueryRuntimeException;

/**
 * A pattern-specific matcher factory that can instantiate CollectionTypesInTheArchitectureMatcher in a type-safe way.
 * 
 * @see CollectionTypesInTheArchitectureMatcher
 * @see CollectionTypesInTheArchitectureMatch
 * 
 */
public class CollectionTypesInTheArchitectureMatcherFactory extends BaseGeneratedMatcherFactory<CollectionTypesInTheArchitectureMatch,CollectionTypesInTheArchitectureMatcher> {
  @Override
  protected CollectionTypesInTheArchitectureMatcher instantiate(final IncQueryEngine engine) throws IncQueryRuntimeException {
    return new CollectionTypesInTheArchitectureMatcher(engine);
    
  }
  
  @Override
  protected String getBundleName() {
    return "hu.bme.mit.inf.gs.dsl.validators";
    
  }
  
  @Override
  protected String patternName() {
    return "hu.bme.mit.inf.gs.dsl.validators.CollectionTypesInTheArchitecture";
    
  }
}
