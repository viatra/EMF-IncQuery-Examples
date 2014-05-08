package school.util;

import com.google.common.collect.Sets;
import java.util.Arrays;
import java.util.List;
import java.util.Set;
import org.eclipse.incquery.runtime.api.IncQueryEngine;
import org.eclipse.incquery.runtime.api.impl.BaseGeneratedQuerySpecification;
import org.eclipse.incquery.runtime.exception.IncQueryException;
import org.eclipse.incquery.runtime.matchers.psystem.PBody;
import org.eclipse.incquery.runtime.matchers.psystem.PVariable;
import org.eclipse.incquery.runtime.matchers.psystem.basicdeferred.ExportedParameter;
import org.eclipse.incquery.runtime.matchers.psystem.basicenumerables.TypeUnary;
import org.eclipse.incquery.runtime.matchers.psystem.queries.PParameter;
import school.TeachersMatcher;

/**
 * A pattern-specific query specification that can instantiate TeachersMatcher in a type-safe way.
 * 
 * @see TeachersMatcher
 * @see TeachersMatch
 * 
 */
@SuppressWarnings("all")
public final class TeachersQuerySpecification extends BaseGeneratedQuerySpecification<TeachersMatcher> {
  /**
   * @return the singleton instance of the query specification
   * @throws IncQueryException if the pattern definition could not be loaded
   * 
   */
  public static TeachersQuerySpecification instance() throws IncQueryException {
    return LazyHolder.INSTANCE;
    
  }
  
  @Override
  protected TeachersMatcher instantiate(final IncQueryEngine engine) throws IncQueryException {
    return TeachersMatcher.on(engine);
  }
  
  @Override
  public String getFullyQualifiedName() {
    return "school.teachers";
    
  }
  
  @Override
  public List<String> getParameterNames() {
    return Arrays.asList("T");
  }
  
  @Override
  public List<PParameter> getParameters() {
    return Arrays.asList(new PParameter("T", "school.Teacher"));
  }
  
  @Override
  public Set<PBody> doGetContainedBodies() throws IncQueryException {
    Set<PBody> bodies = Sets.newLinkedHashSet();
    {
      PBody body = new PBody(this);
      PVariable var_T = body.getOrCreateVariableByName("T");
      body.setExportedParameters(Arrays.<ExportedParameter>asList(
        new ExportedParameter(body, var_T, "T")
      ));
      
      new TypeUnary(body, var_T, getClassifierLiteral("http://school.ecore", "Teacher"), "http://school.ecore/Teacher");
      bodies.add(body);
    }
    return bodies;
  }
  
  @SuppressWarnings("all")
  private static class LazyHolder {
    private final static TeachersQuerySpecification INSTANCE = make();
    
    public static TeachersQuerySpecification make() {
      return new TeachersQuerySpecification();					
      
    }
  }
  
}
