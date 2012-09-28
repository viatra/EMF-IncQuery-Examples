package school;

import org.eclipse.viatra2.emf.incquery.runtime.api.impl.BaseGeneratedPatternGroup;
import org.eclipse.viatra2.emf.incquery.runtime.exception.IncQueryException;
import school.coursewithoutteacher.CourseWithoutTeacherMatcher;
import school.coursewithteacher.CourseWithTeacherMatcher;

public final class GroupOfFileSchoolvalidationrules extends BaseGeneratedPatternGroup {
  public GroupOfFileSchoolvalidationrules() throws IncQueryException {
    matcherFactories.add(CourseWithTeacherMatcher.factory());
    matcherFactories.add(CourseWithoutTeacherMatcher.factory());
    
  }
}
