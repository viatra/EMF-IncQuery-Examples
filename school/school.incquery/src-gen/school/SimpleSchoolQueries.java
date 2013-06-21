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

/**
 * A pattern group formed of all patterns defined in simpleSchoolQueries.eiq.
 * 
 * <p>Use the static instance as any {@link org.eclipse.incquery.runtime.api.IPatternGroup}, to conveniently prepare 
 * an EMF-IncQuery engine for matching all patterns originally defined in file simpleSchoolQueries.eiq,
 * in order to achieve better performance than one-by-one on-demand matcher initialization.
 * 
 * <p> From package school, the group contains the definition of the following patterns: <ul>
 * <li>schools</li>
 * <li>courses</li>
 * <li>schoolsNames</li>
 * <li>teachers</li>
 * <li>teachersNames</li>
 * <li>teachersOfSchool</li>
 * <li>teachersOfSchoolNames</li>
 * <li>coursesOfTeacher</li>
 * <li>coursesOfTeacherNames</li>
 * <li>classesOfTeacher</li>
 * <li>classesOfSchool</li>
 * <li>classesOfTeacherNames</li>
 * <li>teacherWithoutClass</li>
 * <li>teacherWithoutClassNames</li>
 * <li>studentOfSchool</li>
 * <li>studentOfSchoolNames</li>
 * <li>courseWithWeightThirty</li>
 * <li>courseWithNameLongerThanWeight</li>
 * <li>courseWithNameLongerThanWeightInt</li>
 * <li>courseWithPrimeWeight</li>
 * <li>teachesMoreClasses</li>
 * <li>teachesTheMostCourses</li>
 * <li>friendlyTo</li>
 * <li>inTheCircleOfFriends</li>
 * <li>inTheCircleOfFriendsNames</li>
 * <li>moreFriendsThan</li>
 * <li>theOnesWithTheBiggestCircle</li>
 * <li>theOnesWithTheBiggestCircleName</li>
 * <li>finalPattern</li>
 * <li>finalPattern2</li>
 * <li>SomeCourse</li>
 * </ul>
 * 
 * @see IPatternGroup
 * 
 */
@SuppressWarnings("all")
public final class SimpleSchoolQueries extends BaseGeneratedPatternGroup {
  /**
   * Access the pattern group.
   * 
   * @return the singleton instance of the group
   * @throws IncQueryException if there was an error loading the generated code of pattern specifications
   * 
   */
  public static SimpleSchoolQueries instance() throws IncQueryException {
    if (INSTANCE == null) {
    	INSTANCE = new SimpleSchoolQueries();
    }
    return INSTANCE;
    
  }
  
  private static SimpleSchoolQueries INSTANCE;
  
  private SimpleSchoolQueries() throws IncQueryException {
    querySpecifications.add(FriendlyToMatcher.querySpecification());
    querySpecifications.add(TheOnesWithTheBiggestCircleMatcher.querySpecification());
    querySpecifications.add(TeachesMoreClassesMatcher.querySpecification());
    querySpecifications.add(TeacherWithoutClassMatcher.querySpecification());
    querySpecifications.add(FinalPattern2Matcher.querySpecification());
    querySpecifications.add(MoreFriendsThanMatcher.querySpecification());
    querySpecifications.add(CoursesOfTeacherMatcher.querySpecification());
    querySpecifications.add(TeacherWithoutClassNamesMatcher.querySpecification());
    querySpecifications.add(FinalPatternMatcher.querySpecification());
    querySpecifications.add(TheOnesWithTheBiggestCircleNameMatcher.querySpecification());
    querySpecifications.add(CoursesMatcher.querySpecification());
    querySpecifications.add(StudentOfSchoolMatcher.querySpecification());
    querySpecifications.add(CourseWithNameLongerThanWeightMatcher.querySpecification());
    querySpecifications.add(ClassesOfTeacherMatcher.querySpecification());
    querySpecifications.add(StudentOfSchoolNamesMatcher.querySpecification());
    querySpecifications.add(CourseWithNameLongerThanWeightIntMatcher.querySpecification());
    querySpecifications.add(InTheCircleOfFriendsNamesMatcher.querySpecification());
    querySpecifications.add(TeachersOfSchoolNamesMatcher.querySpecification());
    querySpecifications.add(CourseWithWeightThirtyMatcher.querySpecification());
    querySpecifications.add(SomeCourseMatcher.querySpecification());
    querySpecifications.add(CourseWithPrimeWeightMatcher.querySpecification());
    querySpecifications.add(TeachersMatcher.querySpecification());
    querySpecifications.add(ClassesOfTeacherNamesMatcher.querySpecification());
    querySpecifications.add(ClassesOfSchoolMatcher.querySpecification());
    querySpecifications.add(SchoolsMatcher.querySpecification());
    querySpecifications.add(InTheCircleOfFriendsMatcher.querySpecification());
    querySpecifications.add(TeachersNamesMatcher.querySpecification());
    querySpecifications.add(SchoolsNamesMatcher.querySpecification());
    querySpecifications.add(CoursesOfTeacherNamesMatcher.querySpecification());
    querySpecifications.add(TeachersOfSchoolMatcher.querySpecification());
    querySpecifications.add(TeachesTheMostCoursesMatcher.querySpecification());
    
  }
}
