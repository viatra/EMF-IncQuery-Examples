package school;

import org.eclipse.incquery.runtime.api.impl.BaseGeneratedPatternGroup;
import org.eclipse.incquery.runtime.exception.IncQueryException;
import school.CourseWithTeacherMatcher;
import school.CourseWithoutTeacherMatcher;

public final class SchoolValidationRules extends BaseGeneratedPatternGroup {
  public SchoolValidationRules() throws IncQueryException {
    querySpecifications.add(CourseWithTeacherMatcher.querySpecification());
    querySpecifications.add(CourseWithoutTeacherMatcher.querySpecification());
    
  }
}
