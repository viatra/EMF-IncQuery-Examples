package school;

import org.eclipse.incquery.runtime.api.IncQueryEngine;
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

@SuppressWarnings("all")
public final class SimpleSchoolQueriesMatchers {
  private IncQueryEngine engine;
  
  public SimpleSchoolQueriesMatchers(final IncQueryEngine engine) {
    this.engine = engine;
    
  }
  
  public CoursesMatcher getCoursesMatcher() throws IncQueryException {
    return CoursesMatcher.on(engine);
  }
  
  public InTheCircleOfFriendsNamesMatcher getInTheCircleOfFriendsNamesMatcher() throws IncQueryException {
    return InTheCircleOfFriendsNamesMatcher.on(engine);
  }
  
  public FriendlyToMatcher getFriendlyToMatcher() throws IncQueryException {
    return FriendlyToMatcher.on(engine);
  }
  
  public TeachersNamesMatcher getTeachersNamesMatcher() throws IncQueryException {
    return TeachersNamesMatcher.on(engine);
  }
  
  public CourseWithNameLongerThanWeightIntMatcher getCourseWithNameLongerThanWeightIntMatcher() throws IncQueryException {
    return CourseWithNameLongerThanWeightIntMatcher.on(engine);
  }
  
  public SchoolsNamesMatcher getSchoolsNamesMatcher() throws IncQueryException {
    return SchoolsNamesMatcher.on(engine);
  }
  
  public CoursesOfTeacherNamesMatcher getCoursesOfTeacherNamesMatcher() throws IncQueryException {
    return CoursesOfTeacherNamesMatcher.on(engine);
  }
  
  public StudentOfSchoolMatcher getStudentOfSchoolMatcher() throws IncQueryException {
    return StudentOfSchoolMatcher.on(engine);
  }
  
  public TeachersOfSchoolNamesMatcher getTeachersOfSchoolNamesMatcher() throws IncQueryException {
    return TeachersOfSchoolNamesMatcher.on(engine);
  }
  
  public FinalPattern2Matcher getFinalPattern2Matcher() throws IncQueryException {
    return FinalPattern2Matcher.on(engine);
  }
  
  public ClassesOfTeacherMatcher getClassesOfTeacherMatcher() throws IncQueryException {
    return ClassesOfTeacherMatcher.on(engine);
  }
  
  public TeachersMatcher getTeachersMatcher() throws IncQueryException {
    return TeachersMatcher.on(engine);
  }
  
  public TheOnesWithTheBiggestCircleNameMatcher getTheOnesWithTheBiggestCircleNameMatcher() throws IncQueryException {
    return TheOnesWithTheBiggestCircleNameMatcher.on(engine);
  }
  
  public SchoolsMatcher getSchoolsMatcher() throws IncQueryException {
    return SchoolsMatcher.on(engine);
  }
  
  public TeacherWithoutClassNamesMatcher getTeacherWithoutClassNamesMatcher() throws IncQueryException {
    return TeacherWithoutClassNamesMatcher.on(engine);
  }
  
  public ClassesOfTeacherNamesMatcher getClassesOfTeacherNamesMatcher() throws IncQueryException {
    return ClassesOfTeacherNamesMatcher.on(engine);
  }
  
  public CourseWithWeightThirtyMatcher getCourseWithWeightThirtyMatcher() throws IncQueryException {
    return CourseWithWeightThirtyMatcher.on(engine);
  }
  
  public TeacherWithoutClassMatcher getTeacherWithoutClassMatcher() throws IncQueryException {
    return TeacherWithoutClassMatcher.on(engine);
  }
  
  public CourseWithNameLongerThanWeightMatcher getCourseWithNameLongerThanWeightMatcher() throws IncQueryException {
    return CourseWithNameLongerThanWeightMatcher.on(engine);
  }
  
  public TeachesMoreClassesMatcher getTeachesMoreClassesMatcher() throws IncQueryException {
    return TeachesMoreClassesMatcher.on(engine);
  }
  
  public InTheCircleOfFriendsMatcher getInTheCircleOfFriendsMatcher() throws IncQueryException {
    return InTheCircleOfFriendsMatcher.on(engine);
  }
  
  public ClassesOfSchoolMatcher getClassesOfSchoolMatcher() throws IncQueryException {
    return ClassesOfSchoolMatcher.on(engine);
  }
  
  public CoursesOfTeacherMatcher getCoursesOfTeacherMatcher() throws IncQueryException {
    return CoursesOfTeacherMatcher.on(engine);
  }
  
  public SomeCourseMatcher getSomeCourseMatcher() throws IncQueryException {
    return SomeCourseMatcher.on(engine);
  }
  
  public MoreFriendsThanMatcher getMoreFriendsThanMatcher() throws IncQueryException {
    return MoreFriendsThanMatcher.on(engine);
  }
  
  public TheOnesWithTheBiggestCircleMatcher getTheOnesWithTheBiggestCircleMatcher() throws IncQueryException {
    return TheOnesWithTheBiggestCircleMatcher.on(engine);
  }
  
  public TeachesTheMostCoursesMatcher getTeachesTheMostCoursesMatcher() throws IncQueryException {
    return TeachesTheMostCoursesMatcher.on(engine);
  }
  
  public FinalPatternMatcher getFinalPatternMatcher() throws IncQueryException {
    return FinalPatternMatcher.on(engine);
  }
  
  public TeachersOfSchoolMatcher getTeachersOfSchoolMatcher() throws IncQueryException {
    return TeachersOfSchoolMatcher.on(engine);
  }
  
  public StudentOfSchoolNamesMatcher getStudentOfSchoolNamesMatcher() throws IncQueryException {
    return StudentOfSchoolNamesMatcher.on(engine);
  }
  
  public CourseWithPrimeWeightMatcher getCourseWithPrimeWeightMatcher() throws IncQueryException {
    return CourseWithPrimeWeightMatcher.on(engine);
  }
}
