package school;

import org.eclipse.incquery.runtime.api.impl.BaseGeneratedPatternGroup;
import org.eclipse.incquery.runtime.exception.IncQueryException;
import school.ClassesOfSchoolMatcher;
import school.ClassesOfTeacherMatcher;
import school.ClassesOfTeacherNamesMatcher;
import school.CourseWithNameLongerThanWeightIntMatcher;
import school.CourseWithNameLongerThanWeightMatcher;
import school.CourseWithPrimeWeightMatcher;
import school.CourseWithWeightThirtyMatcher;
import school.CoursesMatcher;
import school.CoursesOfTeacherMatcher;
import school.CoursesOfTeacherNamesMatcher;
import school.FinalPattern2Matcher;
import school.FinalPatternMatcher;
import school.FriendlyToMatcher;
import school.InTheCircleOfFriendsMatcher;
import school.InTheCircleOfFriendsNamesMatcher;
import school.MoreFriendsThanMatcher;
import school.SchoolsMatcher;
import school.SchoolsNamesMatcher;
import school.SomeCourseMatcher;
import school.StudentOfSchoolMatcher;
import school.StudentOfSchoolNamesMatcher;
import school.TeacherWithoutClassMatcher;
import school.TeacherWithoutClassNamesMatcher;
import school.TeachersMatcher;
import school.TeachersNamesMatcher;
import school.TeachersOfSchoolMatcher;
import school.TeachersOfSchoolNamesMatcher;
import school.TeachesMoreClassesMatcher;
import school.TeachesTheMostCoursesMatcher;
import school.TheOnesWithTheBiggestCircleMatcher;
import school.TheOnesWithTheBiggestCircleNameMatcher;

public final class SimpleSchoolQueries extends BaseGeneratedPatternGroup {
  public SimpleSchoolQueries() throws IncQueryException {
    querySpecifications.add(CourseWithNameLongerThanWeightMatcher.querySpecification());
    querySpecifications.add(SomeCourseMatcher.querySpecification());
    querySpecifications.add(TeachesTheMostCoursesMatcher.querySpecification());
    querySpecifications.add(ClassesOfTeacherMatcher.querySpecification());
    querySpecifications.add(TheOnesWithTheBiggestCircleNameMatcher.querySpecification());
    querySpecifications.add(TeachesMoreClassesMatcher.querySpecification());
    querySpecifications.add(TeacherWithoutClassMatcher.querySpecification());
    querySpecifications.add(CourseWithNameLongerThanWeightIntMatcher.querySpecification());
    querySpecifications.add(MoreFriendsThanMatcher.querySpecification());
    querySpecifications.add(FriendlyToMatcher.querySpecification());
    querySpecifications.add(CourseWithPrimeWeightMatcher.querySpecification());
    querySpecifications.add(StudentOfSchoolMatcher.querySpecification());
    querySpecifications.add(TeachersOfSchoolNamesMatcher.querySpecification());
    querySpecifications.add(CoursesOfTeacherMatcher.querySpecification());
    querySpecifications.add(ClassesOfSchoolMatcher.querySpecification());
    querySpecifications.add(TeachersMatcher.querySpecification());
    querySpecifications.add(SchoolsMatcher.querySpecification());
    querySpecifications.add(InTheCircleOfFriendsNamesMatcher.querySpecification());
    querySpecifications.add(TeacherWithoutClassNamesMatcher.querySpecification());
    querySpecifications.add(CourseWithWeightThirtyMatcher.querySpecification());
    querySpecifications.add(StudentOfSchoolNamesMatcher.querySpecification());
    querySpecifications.add(ClassesOfTeacherNamesMatcher.querySpecification());
    querySpecifications.add(TheOnesWithTheBiggestCircleMatcher.querySpecification());
    querySpecifications.add(CoursesOfTeacherNamesMatcher.querySpecification());
    querySpecifications.add(CoursesMatcher.querySpecification());
    querySpecifications.add(FinalPattern2Matcher.querySpecification());
    querySpecifications.add(TeachersOfSchoolMatcher.querySpecification());
    querySpecifications.add(InTheCircleOfFriendsMatcher.querySpecification());
    querySpecifications.add(TeachersNamesMatcher.querySpecification());
    querySpecifications.add(FinalPatternMatcher.querySpecification());
    querySpecifications.add(SchoolsNamesMatcher.querySpecification());
    
  }
}
