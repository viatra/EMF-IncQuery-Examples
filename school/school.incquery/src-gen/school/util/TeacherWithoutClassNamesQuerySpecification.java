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
import org.eclipse.incquery.runtime.matchers.psystem.basicdeferred.NegativePatternCall;
import org.eclipse.incquery.runtime.matchers.psystem.basicenumerables.TypeBinary;
import org.eclipse.incquery.runtime.matchers.psystem.queries.PParameter;
import org.eclipse.incquery.runtime.matchers.tuple.FlatTuple;
import school.TeacherWithoutClassNamesMatcher;
import school.util.ClassesOfTeacherQuerySpecification;

/**
 * A pattern-specific query specification that can instantiate TeacherWithoutClassNamesMatcher in a type-safe way.
 * 
 * @see TeacherWithoutClassNamesMatcher
 * @see TeacherWithoutClassNamesMatch
 * 
 */
@SuppressWarnings("all")
public final class TeacherWithoutClassNamesQuerySpecification extends BaseGeneratedQuerySpecification<TeacherWithoutClassNamesMatcher> {
  /**
   * @return the singleton instance of the query specification
   * @throws IncQueryException if the pattern definition could not be loaded
   * 
   */
  public static TeacherWithoutClassNamesQuerySpecification instance() throws IncQueryException {
    return LazyHolder.INSTANCE;
    
  }
  
  @Override
  protected TeacherWithoutClassNamesMatcher instantiate(final IncQueryEngine engine) throws IncQueryException {
    return TeacherWithoutClassNamesMatcher.on(engine);
  }
  
  @Override
  public String getFullyQualifiedName() {
    return "school.teacherWithoutClassNames";
    
  }
  
  @Override
  public List<String> getParameterNames() {
    return Arrays.asList("TNames");
  }
  
  @Override
  public List<PParameter> getParameters() {
    return Arrays.asList(new PParameter("TNames", "java.lang.String"));
  }
  
  @Override
  public Set<PBody> doGetContainedBodies() throws IncQueryException {
    Set<PBody> bodies = Sets.newLinkedHashSet();
    {
      PBody body = new PBody(this);
      PVariable var_TNames = body.getOrCreateVariableByName("TNames");
      PVariable var_T = body.getOrCreateVariableByName("T");
      PVariable var__SC = body.getOrCreateVariableByName("_SC");
      body.setExportedParameters(Arrays.<ExportedParameter>asList(
        new ExportedParameter(body, var_TNames, "TNames")
      ));
      
      new NegativePatternCall(body, new FlatTuple(var_T, var__SC), ClassesOfTeacherQuerySpecification.instance().instance());
      new TypeBinary(body, CONTEXT, var_T, var_TNames, getFeatureLiteral("http://school.ecore", "Teacher", "name"), "http://school.ecore/Teacher.name");
      bodies.add(body);
    }
    return bodies;
  }
  
  @SuppressWarnings("all")
  private static class LazyHolder {
    private final static TeacherWithoutClassNamesQuerySpecification INSTANCE = make();
    
    public static TeacherWithoutClassNamesQuerySpecification make() {
      return new TeacherWithoutClassNamesQuerySpecification();					
      
    }
  }
  
}
