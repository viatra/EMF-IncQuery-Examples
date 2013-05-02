package org.eclipse.incquery.runtime.base.test.util;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EcoreFactory;
import org.eclipse.emf.ecore.EcorePackage;

public class DynamicResourceMetamodel {

    public EClass SchoolEClass;
    public EAttribute SchoolNameEAttribute;
    public EAttribute SchoolAddressEAttribute;
    public EReference SchoolYearsEReference;
    public EReference SchoolTeachersEReference;
    public EReference SchoolCoursesEReference;
    public EClass YearEClass;
    public EAttribute YearStartingDateEAttribute;
    public EReference YearSchoolClassesEReference;
    public EClass SchoolClassEClass;
    public EAttribute SchoolClassNameEAttribute;
    public EAttribute SchoolClassCodeEAttribute;
    public EReference SchoolClassCoursesEReference;
    public EReference SchoolClassHomeroomTeacherEReference;
    public EReference SchoolClassStudentsEReference;
    public EClass StudentEClass;
    public EAttribute StudentNameEAttribute;
    public EReference StudentFriendsWithEReference;
    public EClass TeacherEClass;
    public EAttribute TeacherNameEAttribute;
    public EReference TeacherCoursesEReference;
    public EReference TeacherHomeroomedClassEReference;
    public EClass CourseEClass;
    public EClass SpecialisationCourseEClass;
    public EAttribute SpecialisationCourseSpecialisationEAttribute;
    public EAttribute CourseNameEAttribute;
    public EAttribute CourseWeightEAttribute;
    public EPackage schoolEPackage;
    public EReference SchoolClassYearEReference;
    
    public static DynamicResourceMetamodel eINSTANCE = new DynamicResourceMetamodel(); 
    
    private DynamicResourceMetamodel() {
        EcoreFactory coreFactory = EcoreFactory.eINSTANCE;
        EcorePackage corePackage = EcorePackage.eINSTANCE;

        schoolEPackage = coreFactory.createEPackage();
        schoolEPackage.setName("SchoolPackage");
        schoolEPackage.setNsPrefix("school");
        schoolEPackage.setNsURI("http:///org.example.incquery.school");

        SchoolEClass = coreFactory.createEClass();
        SchoolEClass.setName("School");
        schoolEPackage.getEClassifiers().add(SchoolEClass);
        YearEClass = coreFactory.createEClass();
        YearEClass.setName("Year");
        schoolEPackage.getEClassifiers().add(YearEClass);
        SchoolClassEClass = coreFactory.createEClass();
        SchoolClassEClass.setName("SchoolClass");
        schoolEPackage.getEClassifiers().add(SchoolClassEClass);
        StudentEClass = coreFactory.createEClass();
        StudentEClass.setName("Student");
        schoolEPackage.getEClassifiers().add(StudentEClass);
        TeacherEClass = coreFactory.createEClass();
        TeacherEClass.setName("Teacher");
        schoolEPackage.getEClassifiers().add(TeacherEClass);
        CourseEClass = coreFactory.createEClass();
        CourseEClass.setName("Course");
        schoolEPackage.getEClassifiers().add(CourseEClass);
        SpecialisationCourseEClass = coreFactory.createEClass();
        SpecialisationCourseEClass.setName("SpecialisationCourse");
        schoolEPackage.getEClassifiers().add(SpecialisationCourseEClass);
        
        SchoolNameEAttribute = coreFactory.createEAttribute();
        SchoolNameEAttribute.setName("name");
        SchoolNameEAttribute.setEType(corePackage.getEString());
        SchoolEClass.getEStructuralFeatures().add(SchoolNameEAttribute);
        
        SchoolAddressEAttribute = coreFactory.createEAttribute();
        SchoolAddressEAttribute.setName("address");
        SchoolAddressEAttribute.setEType(corePackage.getEString());
        SchoolEClass.getEStructuralFeatures().add(SchoolAddressEAttribute);
        
        SchoolYearsEReference = coreFactory.createEReference();
        SchoolYearsEReference.setName("years");
        SchoolYearsEReference.setLowerBound(0);
        SchoolYearsEReference.setUpperBound(-1);
        SchoolYearsEReference.setContainment(true);
        SchoolYearsEReference.setEType(YearEClass);
        SchoolEClass.getEStructuralFeatures().add(SchoolYearsEReference);
        
        SchoolTeachersEReference = coreFactory.createEReference();
        SchoolTeachersEReference.setName("teachers");
        SchoolTeachersEReference.setLowerBound(0);
        SchoolTeachersEReference.setUpperBound(-1);
        SchoolTeachersEReference.setContainment(true);
        SchoolTeachersEReference.setEType(TeacherEClass);
        SchoolEClass.getEStructuralFeatures().add(SchoolTeachersEReference);
        
        SchoolCoursesEReference = coreFactory.createEReference();
        SchoolCoursesEReference.setName("courses");
        SchoolCoursesEReference.setLowerBound(0);
        SchoolCoursesEReference.setUpperBound(-1);
        SchoolCoursesEReference.setContainment(true);
        SchoolCoursesEReference.setEType(CourseEClass);
        SchoolEClass.getEStructuralFeatures().add(SchoolCoursesEReference);
        
        YearStartingDateEAttribute = coreFactory.createEAttribute();
        YearStartingDateEAttribute.setName("startingDate");
        YearStartingDateEAttribute.setEType(corePackage.getEInt());
        YearEClass.getEStructuralFeatures().add(YearStartingDateEAttribute);
        
        YearSchoolClassesEReference = coreFactory.createEReference();
        YearSchoolClassesEReference.setName("schoolClasses");
        YearSchoolClassesEReference.setLowerBound(0);
        YearSchoolClassesEReference.setUpperBound(-1);
        YearSchoolClassesEReference.setContainment(true);
        YearSchoolClassesEReference.setEType(SchoolClassEClass);
        YearEClass.getEStructuralFeatures().add(YearSchoolClassesEReference);
        
        SchoolClassNameEAttribute = coreFactory.createEAttribute();
        SchoolClassNameEAttribute.setName("name");
        SchoolClassNameEAttribute.setEType(corePackage.getEString());
        SchoolClassEClass.getEStructuralFeatures().add(SchoolClassNameEAttribute);
        
        SchoolClassCodeEAttribute = coreFactory.createEAttribute();
        SchoolClassCodeEAttribute.setName("code");
        SchoolClassCodeEAttribute.setEType(corePackage.getEChar());
        SchoolClassEClass.getEStructuralFeatures().add(SchoolClassCodeEAttribute);
       
        SchoolClassYearEReference = coreFactory.createEReference();
        SchoolClassYearEReference.setName("year");
        SchoolClassYearEReference.setEType(YearEClass);
        SchoolClassYearEReference.setEOpposite(YearSchoolClassesEReference);
        SchoolClassYearEReference.setLowerBound(0);
        SchoolClassYearEReference.setUpperBound(1);
        SchoolClassYearEReference.setContainment(false);
        YearSchoolClassesEReference.setEOpposite(SchoolClassYearEReference);
        SchoolClassEClass.getEStructuralFeatures().add(SchoolClassYearEReference);
        
        SchoolClassCoursesEReference = coreFactory.createEReference();
        SchoolClassCoursesEReference.setName("courses");
        SchoolClassCoursesEReference.setLowerBound(0);
        SchoolClassCoursesEReference.setUpperBound(-1);
        SchoolClassCoursesEReference.setContainment(false);
        SchoolClassCoursesEReference.setEType(CourseEClass);
        SchoolClassEClass.getEStructuralFeatures().add(SchoolClassCoursesEReference);
        
        SchoolClassHomeroomTeacherEReference = coreFactory.createEReference();
        SchoolClassHomeroomTeacherEReference.setName("homeroomTeacher");
        SchoolClassHomeroomTeacherEReference.setLowerBound(0);
        SchoolClassHomeroomTeacherEReference.setUpperBound(1);
        SchoolClassHomeroomTeacherEReference.setContainment(false);
        SchoolClassHomeroomTeacherEReference.setEType(TeacherEClass);
        SchoolClassEClass.getEStructuralFeatures().add(SchoolClassHomeroomTeacherEReference);
        
        SchoolClassStudentsEReference = coreFactory.createEReference();
        SchoolClassStudentsEReference.setName("students");
        SchoolClassStudentsEReference.setLowerBound(0);
        SchoolClassStudentsEReference.setUpperBound(-1);
        SchoolClassStudentsEReference.setContainment(true);
        SchoolClassStudentsEReference.setEType(StudentEClass);
        SchoolClassEClass.getEStructuralFeatures().add(SchoolClassStudentsEReference);
       
        StudentNameEAttribute = coreFactory.createEAttribute();
        StudentNameEAttribute.setName("name");
        StudentNameEAttribute.setEType(corePackage.getEString());
        StudentEClass.getEStructuralFeatures().add(StudentNameEAttribute);
        
        StudentFriendsWithEReference = coreFactory.createEReference();
        StudentFriendsWithEReference.setName("friendsWith");
        StudentFriendsWithEReference.setLowerBound(0);
        StudentFriendsWithEReference.setUpperBound(-1);
        StudentFriendsWithEReference.setContainment(false);
        StudentFriendsWithEReference.setEType(StudentEClass);
        StudentEClass.getEStructuralFeatures().add(StudentFriendsWithEReference);
        
        TeacherNameEAttribute = coreFactory.createEAttribute();
        TeacherNameEAttribute.setName("name");
        TeacherNameEAttribute.setEType(corePackage.getEString());
        TeacherEClass.getEStructuralFeatures().add(TeacherNameEAttribute);
        
        TeacherCoursesEReference = coreFactory.createEReference();
        TeacherCoursesEReference.setName("courses");
        TeacherCoursesEReference.setLowerBound(0);
        TeacherCoursesEReference.setUpperBound(-1);
        TeacherCoursesEReference.setContainment(false);
        TeacherCoursesEReference.setEType(CourseEClass);
        TeacherEClass.getEStructuralFeatures().add(TeacherCoursesEReference);
        
        TeacherHomeroomedClassEReference = coreFactory.createEReference();
        TeacherHomeroomedClassEReference.setName("homeroomedClass");
        TeacherHomeroomedClassEReference.setLowerBound(0);
        TeacherHomeroomedClassEReference.setUpperBound(1);
        TeacherHomeroomedClassEReference.setContainment(false);
        TeacherHomeroomedClassEReference.setEType(SchoolClassEClass);
        TeacherEClass.getEStructuralFeatures().add(TeacherHomeroomedClassEReference);
        
        CourseNameEAttribute = coreFactory.createEAttribute();
        CourseNameEAttribute.setEType(corePackage.getEString());
        CourseNameEAttribute.setName("name");
        CourseEClass.getEStructuralFeatures().add(CourseNameEAttribute);
        
        CourseWeightEAttribute = coreFactory.createEAttribute();
        CourseWeightEAttribute.setName("weight");
        CourseWeightEAttribute.setEType(corePackage.getEInt());
        CourseEClass.getEStructuralFeatures().add(CourseWeightEAttribute);
        
        SpecialisationCourseSpecialisationEAttribute = coreFactory.createEAttribute();
        SpecialisationCourseSpecialisationEAttribute.setName("specialisation");
        SpecialisationCourseSpecialisationEAttribute.setEType(corePackage.getEString());
        SpecialisationCourseEClass.getEStructuralFeatures().add(SpecialisationCourseSpecialisationEAttribute);
        SpecialisationCourseEClass.getESuperTypes().add(CourseEClass);
    }
    
}
