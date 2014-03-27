package school;

import org.eclipse.incquery.runtime.api.IncQueryEngine;
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
import school.util.ClassesOfSchoolQuerySpecification;
import school.util.ClassesOfTeacherNamesQuerySpecification;
import school.util.ClassesOfTeacherQuerySpecification;
import school.util.CourseWithNameLongerThanWeightIntQuerySpecification;
import school.util.CourseWithNameLongerThanWeightQuerySpecification;
import school.util.CourseWithPrimeWeightQuerySpecification;
import school.util.CourseWithWeightThirtyQuerySpecification;
import school.util.CoursesOfTeacherNamesQuerySpecification;
import school.util.CoursesOfTeacherQuerySpecification;
import school.util.CoursesQuerySpecification;
import school.util.FinalPattern2QuerySpecification;
import school.util.FinalPatternQuerySpecification;
import school.util.FriendlyToQuerySpecification;
import school.util.InTheCircleOfFriendsNamesQuerySpecification;
import school.util.InTheCircleOfFriendsQuerySpecification;
import school.util.MoreFriendsThanQuerySpecification;
import school.util.SchoolsNamesQuerySpecification;
import school.util.SchoolsQuerySpecification;
import school.util.SomeCourseQuerySpecification;
import school.util.StudentOfSchoolNamesQuerySpecification;
import school.util.StudentOfSchoolQuerySpecification;
import school.util.TeacherWithoutClassNamesQuerySpecification;
import school.util.TeacherWithoutClassQuerySpecification;
import school.util.TeachersNamesQuerySpecification;
import school.util.TeachersOfSchoolNamesQuerySpecification;
import school.util.TeachersOfSchoolQuerySpecification;
import school.util.TeachersQuerySpecification;
import school.util.TeachesMoreClassesQuerySpecification;
import school.util.TeachesTheMostCoursesQuerySpecification;
import school.util.TheOnesWithTheBiggestCircleNameQuerySpecification;
import school.util.TheOnesWithTheBiggestCircleQuerySpecification;

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
    querySpecifications.add(SchoolsQuerySpecification.instance());
    querySpecifications.add(CoursesQuerySpecification.instance());
    querySpecifications.add(SchoolsNamesQuerySpecification.instance());
    querySpecifications.add(TeachersQuerySpecification.instance());
    querySpecifications.add(TeachersNamesQuerySpecification.instance());
    querySpecifications.add(TeachersOfSchoolQuerySpecification.instance());
    querySpecifications.add(TeachersOfSchoolNamesQuerySpecification.instance());
    querySpecifications.add(CoursesOfTeacherQuerySpecification.instance());
    querySpecifications.add(CoursesOfTeacherNamesQuerySpecification.instance());
    querySpecifications.add(ClassesOfTeacherQuerySpecification.instance());
    querySpecifications.add(ClassesOfSchoolQuerySpecification.instance());
    querySpecifications.add(ClassesOfTeacherNamesQuerySpecification.instance());
    querySpecifications.add(TeacherWithoutClassQuerySpecification.instance());
    querySpecifications.add(TeacherWithoutClassNamesQuerySpecification.instance());
    querySpecifications.add(StudentOfSchoolQuerySpecification.instance());
    querySpecifications.add(StudentOfSchoolNamesQuerySpecification.instance());
    querySpecifications.add(CourseWithWeightThirtyQuerySpecification.instance());
    querySpecifications.add(CourseWithNameLongerThanWeightQuerySpecification.instance());
    querySpecifications.add(CourseWithNameLongerThanWeightIntQuerySpecification.instance());
    querySpecifications.add(CourseWithPrimeWeightQuerySpecification.instance());
    querySpecifications.add(TeachesMoreClassesQuerySpecification.instance());
    querySpecifications.add(TeachesTheMostCoursesQuerySpecification.instance());
    querySpecifications.add(FriendlyToQuerySpecification.instance());
    querySpecifications.add(InTheCircleOfFriendsQuerySpecification.instance());
    querySpecifications.add(InTheCircleOfFriendsNamesQuerySpecification.instance());
    querySpecifications.add(MoreFriendsThanQuerySpecification.instance());
    querySpecifications.add(TheOnesWithTheBiggestCircleQuerySpecification.instance());
    querySpecifications.add(TheOnesWithTheBiggestCircleNameQuerySpecification.instance());
    querySpecifications.add(FinalPatternQuerySpecification.instance());
    querySpecifications.add(FinalPattern2QuerySpecification.instance());
    querySpecifications.add(SomeCourseQuerySpecification.instance());
    
  }
  
  public SchoolsQuerySpecification getSchools() throws IncQueryException {
    return SchoolsQuerySpecification.instance();
  }
  
  public SchoolsMatcher getSchools(final IncQueryEngine engine) throws IncQueryException {
    return SchoolsMatcher.on(engine);
  }
  
  public CoursesQuerySpecification getCourses() throws IncQueryException {
    return CoursesQuerySpecification.instance();
  }
  
  public CoursesMatcher getCourses(final IncQueryEngine engine) throws IncQueryException {
    return CoursesMatcher.on(engine);
  }
  
  public SchoolsNamesQuerySpecification getSchoolsNames() throws IncQueryException {
    return SchoolsNamesQuerySpecification.instance();
  }
  
  public SchoolsNamesMatcher getSchoolsNames(final IncQueryEngine engine) throws IncQueryException {
    return SchoolsNamesMatcher.on(engine);
  }
  
  public TeachersQuerySpecification getTeachers() throws IncQueryException {
    return TeachersQuerySpecification.instance();
  }
  
  public TeachersMatcher getTeachers(final IncQueryEngine engine) throws IncQueryException {
    return TeachersMatcher.on(engine);
  }
  
  public TeachersNamesQuerySpecification getTeachersNames() throws IncQueryException {
    return TeachersNamesQuerySpecification.instance();
  }
  
  public TeachersNamesMatcher getTeachersNames(final IncQueryEngine engine) throws IncQueryException {
    return TeachersNamesMatcher.on(engine);
  }
  
  public TeachersOfSchoolQuerySpecification getTeachersOfSchool() throws IncQueryException {
    return TeachersOfSchoolQuerySpecification.instance();
  }
  
  public TeachersOfSchoolMatcher getTeachersOfSchool(final IncQueryEngine engine) throws IncQueryException {
    return TeachersOfSchoolMatcher.on(engine);
  }
  
  public TeachersOfSchoolNamesQuerySpecification getTeachersOfSchoolNames() throws IncQueryException {
    return TeachersOfSchoolNamesQuerySpecification.instance();
  }
  
  public TeachersOfSchoolNamesMatcher getTeachersOfSchoolNames(final IncQueryEngine engine) throws IncQueryException {
    return TeachersOfSchoolNamesMatcher.on(engine);
  }
  
  public CoursesOfTeacherQuerySpecification getCoursesOfTeacher() throws IncQueryException {
    return CoursesOfTeacherQuerySpecification.instance();
  }
  
  public CoursesOfTeacherMatcher getCoursesOfTeacher(final IncQueryEngine engine) throws IncQueryException {
    return CoursesOfTeacherMatcher.on(engine);
  }
  
  public CoursesOfTeacherNamesQuerySpecification getCoursesOfTeacherNames() throws IncQueryException {
    return CoursesOfTeacherNamesQuerySpecification.instance();
  }
  
  public CoursesOfTeacherNamesMatcher getCoursesOfTeacherNames(final IncQueryEngine engine) throws IncQueryException {
    return CoursesOfTeacherNamesMatcher.on(engine);
  }
  
  public ClassesOfTeacherQuerySpecification getClassesOfTeacher() throws IncQueryException {
    return ClassesOfTeacherQuerySpecification.instance();
  }
  
  public ClassesOfTeacherMatcher getClassesOfTeacher(final IncQueryEngine engine) throws IncQueryException {
    return ClassesOfTeacherMatcher.on(engine);
  }
  
  public ClassesOfSchoolQuerySpecification getClassesOfSchool() throws IncQueryException {
    return ClassesOfSchoolQuerySpecification.instance();
  }
  
  public ClassesOfSchoolMatcher getClassesOfSchool(final IncQueryEngine engine) throws IncQueryException {
    return ClassesOfSchoolMatcher.on(engine);
  }
  
  public ClassesOfTeacherNamesQuerySpecification getClassesOfTeacherNames() throws IncQueryException {
    return ClassesOfTeacherNamesQuerySpecification.instance();
  }
  
  public ClassesOfTeacherNamesMatcher getClassesOfTeacherNames(final IncQueryEngine engine) throws IncQueryException {
    return ClassesOfTeacherNamesMatcher.on(engine);
  }
  
  public TeacherWithoutClassQuerySpecification getTeacherWithoutClass() throws IncQueryException {
    return TeacherWithoutClassQuerySpecification.instance();
  }
  
  public TeacherWithoutClassMatcher getTeacherWithoutClass(final IncQueryEngine engine) throws IncQueryException {
    return TeacherWithoutClassMatcher.on(engine);
  }
  
  public TeacherWithoutClassNamesQuerySpecification getTeacherWithoutClassNames() throws IncQueryException {
    return TeacherWithoutClassNamesQuerySpecification.instance();
  }
  
  public TeacherWithoutClassNamesMatcher getTeacherWithoutClassNames(final IncQueryEngine engine) throws IncQueryException {
    return TeacherWithoutClassNamesMatcher.on(engine);
  }
  
  public StudentOfSchoolQuerySpecification getStudentOfSchool() throws IncQueryException {
    return StudentOfSchoolQuerySpecification.instance();
  }
  
  public StudentOfSchoolMatcher getStudentOfSchool(final IncQueryEngine engine) throws IncQueryException {
    return StudentOfSchoolMatcher.on(engine);
  }
  
  public StudentOfSchoolNamesQuerySpecification getStudentOfSchoolNames() throws IncQueryException {
    return StudentOfSchoolNamesQuerySpecification.instance();
  }
  
  public StudentOfSchoolNamesMatcher getStudentOfSchoolNames(final IncQueryEngine engine) throws IncQueryException {
    return StudentOfSchoolNamesMatcher.on(engine);
  }
  
  public CourseWithWeightThirtyQuerySpecification getCourseWithWeightThirty() throws IncQueryException {
    return CourseWithWeightThirtyQuerySpecification.instance();
  }
  
  public CourseWithWeightThirtyMatcher getCourseWithWeightThirty(final IncQueryEngine engine) throws IncQueryException {
    return CourseWithWeightThirtyMatcher.on(engine);
  }
  
  public CourseWithNameLongerThanWeightQuerySpecification getCourseWithNameLongerThanWeight() throws IncQueryException {
    return CourseWithNameLongerThanWeightQuerySpecification.instance();
  }
  
  public CourseWithNameLongerThanWeightMatcher getCourseWithNameLongerThanWeight(final IncQueryEngine engine) throws IncQueryException {
    return CourseWithNameLongerThanWeightMatcher.on(engine);
  }
  
  public CourseWithNameLongerThanWeightIntQuerySpecification getCourseWithNameLongerThanWeightInt() throws IncQueryException {
    return CourseWithNameLongerThanWeightIntQuerySpecification.instance();
  }
  
  public CourseWithNameLongerThanWeightIntMatcher getCourseWithNameLongerThanWeightInt(final IncQueryEngine engine) throws IncQueryException {
    return CourseWithNameLongerThanWeightIntMatcher.on(engine);
  }
  
  public CourseWithPrimeWeightQuerySpecification getCourseWithPrimeWeight() throws IncQueryException {
    return CourseWithPrimeWeightQuerySpecification.instance();
  }
  
  public CourseWithPrimeWeightMatcher getCourseWithPrimeWeight(final IncQueryEngine engine) throws IncQueryException {
    return CourseWithPrimeWeightMatcher.on(engine);
  }
  
  public TeachesMoreClassesQuerySpecification getTeachesMoreClasses() throws IncQueryException {
    return TeachesMoreClassesQuerySpecification.instance();
  }
  
  public TeachesMoreClassesMatcher getTeachesMoreClasses(final IncQueryEngine engine) throws IncQueryException {
    return TeachesMoreClassesMatcher.on(engine);
  }
  
  public TeachesTheMostCoursesQuerySpecification getTeachesTheMostCourses() throws IncQueryException {
    return TeachesTheMostCoursesQuerySpecification.instance();
  }
  
  public TeachesTheMostCoursesMatcher getTeachesTheMostCourses(final IncQueryEngine engine) throws IncQueryException {
    return TeachesTheMostCoursesMatcher.on(engine);
  }
  
  public FriendlyToQuerySpecification getFriendlyTo() throws IncQueryException {
    return FriendlyToQuerySpecification.instance();
  }
  
  public FriendlyToMatcher getFriendlyTo(final IncQueryEngine engine) throws IncQueryException {
    return FriendlyToMatcher.on(engine);
  }
  
  public InTheCircleOfFriendsQuerySpecification getInTheCircleOfFriends() throws IncQueryException {
    return InTheCircleOfFriendsQuerySpecification.instance();
  }
  
  public InTheCircleOfFriendsMatcher getInTheCircleOfFriends(final IncQueryEngine engine) throws IncQueryException {
    return InTheCircleOfFriendsMatcher.on(engine);
  }
  
  public InTheCircleOfFriendsNamesQuerySpecification getInTheCircleOfFriendsNames() throws IncQueryException {
    return InTheCircleOfFriendsNamesQuerySpecification.instance();
  }
  
  public InTheCircleOfFriendsNamesMatcher getInTheCircleOfFriendsNames(final IncQueryEngine engine) throws IncQueryException {
    return InTheCircleOfFriendsNamesMatcher.on(engine);
  }
  
  public MoreFriendsThanQuerySpecification getMoreFriendsThan() throws IncQueryException {
    return MoreFriendsThanQuerySpecification.instance();
  }
  
  public MoreFriendsThanMatcher getMoreFriendsThan(final IncQueryEngine engine) throws IncQueryException {
    return MoreFriendsThanMatcher.on(engine);
  }
  
  public TheOnesWithTheBiggestCircleQuerySpecification getTheOnesWithTheBiggestCircle() throws IncQueryException {
    return TheOnesWithTheBiggestCircleQuerySpecification.instance();
  }
  
  public TheOnesWithTheBiggestCircleMatcher getTheOnesWithTheBiggestCircle(final IncQueryEngine engine) throws IncQueryException {
    return TheOnesWithTheBiggestCircleMatcher.on(engine);
  }
  
  public TheOnesWithTheBiggestCircleNameQuerySpecification getTheOnesWithTheBiggestCircleName() throws IncQueryException {
    return TheOnesWithTheBiggestCircleNameQuerySpecification.instance();
  }
  
  public TheOnesWithTheBiggestCircleNameMatcher getTheOnesWithTheBiggestCircleName(final IncQueryEngine engine) throws IncQueryException {
    return TheOnesWithTheBiggestCircleNameMatcher.on(engine);
  }
  
  public FinalPatternQuerySpecification getFinalPattern() throws IncQueryException {
    return FinalPatternQuerySpecification.instance();
  }
  
  public FinalPatternMatcher getFinalPattern(final IncQueryEngine engine) throws IncQueryException {
    return FinalPatternMatcher.on(engine);
  }
  
  public FinalPattern2QuerySpecification getFinalPattern2() throws IncQueryException {
    return FinalPattern2QuerySpecification.instance();
  }
  
  public FinalPattern2Matcher getFinalPattern2(final IncQueryEngine engine) throws IncQueryException {
    return FinalPattern2Matcher.on(engine);
  }
  
  public SomeCourseQuerySpecification getSomeCourse() throws IncQueryException {
    return SomeCourseQuerySpecification.instance();
  }
  
  public SomeCourseMatcher getSomeCourse(final IncQueryEngine engine) throws IncQueryException {
    return SomeCourseMatcher.on(engine);
  }
}
