package school;

import org.eclipse.incquery.runtime.api.impl.BaseGeneratedPatternGroup;
import org.eclipse.incquery.runtime.exception.IncQueryException;
import school.coursewithoutteacher.CourseWithoutTeacherMatcher;
import school.coursewithteacher.CourseWithTeacherMatcher;

public final class GroupOfFileSchoolvalidationrules extends BaseGeneratedPatternGroup {
  public GroupOfFileSchoolvalidationrules() throws IncQueryException {
    matcherFactories.add(CourseWithTeacherMatcher.factory());
    matcherFactories.add(CourseWithoutTeacherMatcher.factory());
    
  }
}
