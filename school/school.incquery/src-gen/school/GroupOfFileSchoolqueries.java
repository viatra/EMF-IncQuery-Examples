package school;

import org.eclipse.incquery.runtime.api.impl.BaseGeneratedPatternGroup;
import org.eclipse.incquery.runtime.exception.IncQueryException;
import school.classesofschool.ClassesOfSchoolMatcher;
import school.classesofteacher.ClassesOfTeacherMatcher;
import school.classesofteachernames.ClassesOfTeacherNamesMatcher;
import school.courses.CoursesMatcher;
import school.coursesofteacher.CoursesOfTeacherMatcher;
import school.coursesofteachernames.CoursesOfTeacherNamesMatcher;
import school.coursewithnamelongerthanweight.CourseWithNameLongerThanWeightMatcher;
import school.coursewithnamelongerthanweightint.CourseWithNameLongerThanWeightIntMatcher;
import school.coursewithprimeweight.CourseWithPrimeWeightMatcher;
import school.coursewithweightthirty.CourseWithWeightThirtyMatcher;
import school.finalpattern.FinalPatternMatcher;
import school.finalpattern2.FinalPattern2Matcher;
import school.friendlyto.FriendlyToMatcher;
import school.inthecircleoffriends.InTheCircleOfFriendsMatcher;
import school.inthecircleoffriendsnames.InTheCircleOfFriendsNamesMatcher;
import school.morefriendsthan.MoreFriendsThanMatcher;
import school.schools.SchoolsMatcher;
import school.schoolsnames.SchoolsNamesMatcher;
import school.somecourse.SomeCourseMatcher;
import school.studentofschool.StudentOfSchoolMatcher;
import school.studentofschoolnames.StudentOfSchoolNamesMatcher;
import school.teachers.TeachersMatcher;
import school.teachersnames.TeachersNamesMatcher;
import school.teachersofschool.TeachersOfSchoolMatcher;
import school.teachersofschoolnames.TeachersOfSchoolNamesMatcher;
import school.teacherwithoutclass.TeacherWithoutClassMatcher;
import school.teacherwithoutclassnames.TeacherWithoutClassNamesMatcher;
import school.teachesmoreclasses.TeachesMoreClassesMatcher;
import school.teachesthemostcourses.TeachesTheMostCoursesMatcher;
import school.theoneswiththebiggestcircle.TheOnesWithTheBiggestCircleMatcher;
import school.theoneswiththebiggestcirclename.TheOnesWithTheBiggestCircleNameMatcher;

public final class GroupOfFileSchoolqueries extends BaseGeneratedPatternGroup {
  public GroupOfFileSchoolqueries() throws IncQueryException {
    querySpecifications.add(TeacherWithoutClassMatcher.querySpecification());
    querySpecifications.add(StudentOfSchoolMatcher.querySpecification());
    querySpecifications.add(MoreFriendsThanMatcher.querySpecification());
    querySpecifications.add(TeachersOfSchoolNamesMatcher.querySpecification());
    querySpecifications.add(CourseWithPrimeWeightMatcher.querySpecification());
    querySpecifications.add(InTheCircleOfFriendsMatcher.querySpecification());
    querySpecifications.add(TheOnesWithTheBiggestCircleMatcher.querySpecification());
    querySpecifications.add(TeachersMatcher.querySpecification());
    querySpecifications.add(FriendlyToMatcher.querySpecification());
    querySpecifications.add(CourseWithNameLongerThanWeightIntMatcher.querySpecification());
    querySpecifications.add(SchoolsNamesMatcher.querySpecification());
    querySpecifications.add(ClassesOfTeacherMatcher.querySpecification());
    querySpecifications.add(CoursesMatcher.querySpecification());
    querySpecifications.add(FinalPattern2Matcher.querySpecification());
    querySpecifications.add(FinalPatternMatcher.querySpecification());
    querySpecifications.add(CoursesOfTeacherMatcher.querySpecification());
    querySpecifications.add(CourseWithNameLongerThanWeightMatcher.querySpecification());
    querySpecifications.add(SchoolsMatcher.querySpecification());
    querySpecifications.add(SomeCourseMatcher.querySpecification());
    querySpecifications.add(CoursesOfTeacherNamesMatcher.querySpecification());
    querySpecifications.add(ClassesOfSchoolMatcher.querySpecification());
    querySpecifications.add(TeachersNamesMatcher.querySpecification());
    querySpecifications.add(TeachersOfSchoolMatcher.querySpecification());
    querySpecifications.add(TeachesMoreClassesMatcher.querySpecification());
    querySpecifications.add(TeachesTheMostCoursesMatcher.querySpecification());
    querySpecifications.add(ClassesOfTeacherNamesMatcher.querySpecification());
    querySpecifications.add(StudentOfSchoolNamesMatcher.querySpecification());
    querySpecifications.add(TheOnesWithTheBiggestCircleNameMatcher.querySpecification());
    querySpecifications.add(CourseWithWeightThirtyMatcher.querySpecification());
    querySpecifications.add(InTheCircleOfFriendsNamesMatcher.querySpecification());
    querySpecifications.add(TeacherWithoutClassNamesMatcher.querySpecification());
    
  }
}
