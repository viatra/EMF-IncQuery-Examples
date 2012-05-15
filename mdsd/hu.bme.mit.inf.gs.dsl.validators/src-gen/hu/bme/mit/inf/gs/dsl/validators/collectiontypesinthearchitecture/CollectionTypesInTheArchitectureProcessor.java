package hu.bme.mit.inf.gs.dsl.validators.collectiontypesinthearchitecture;

import hu.bme.mit.inf.gs.dsl.validators.collectiontypesinthearchitecture.CollectionTypesInTheArchitectureMatch;
import org.eclipse.viatra2.emf.incquery.runtime.api.IMatchProcessor;

/**
 * A match processor tailored for the CollectionTypesInTheArchitecture pattern.
 * 
 * Clients should derive an (anonymous) class that implements the abstract process().
 * 
 */
public abstract class CollectionTypesInTheArchitectureProcessor implements IMatchProcessor<CollectionTypesInTheArchitectureMatch> {
  /**
   * Defines the action that is to be executed on each match.
   * @param T the value of pattern parameter T in the currently processed match 
   * 
   */
  public abstract void process(final Object T);
  
  @Override
  public void process(final CollectionTypesInTheArchitectureMatch match) {
    process(match.getT());  				
    
  }
}
