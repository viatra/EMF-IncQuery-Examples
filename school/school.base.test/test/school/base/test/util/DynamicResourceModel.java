package school.base.test.util;

import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EFactory;
import org.eclipse.emf.ecore.EObject;

public class DynamicResourceModel {
    
    public EObject school;
    public EObject year2011;
    public EObject class1;
    public EObject ZoltanUjhelyi;
    public EObject class2;
    public EObject AbelHegedus;
    public EObject year2012;
    public EObject class3;
    public EObject IstvanRath;
    public EObject AkosHorvath;
    public EObject class4;
    public EObject GaborBergmann;
    public EObject AndrasPataricza;
    public EObject IstvanMajzik;
    public EObject PeterSzeredi;
    public EObject DanielVarro;
    public EObject Modeldrivensoftwaredevelopment;
    public EObject Formalmethods;
    public EObject Faulttolerantsafetycriticalcomputing;
    public EObject Prologprogramming;
    public EObject Graphtransformations;
    public EObject Eclipsebaseddevelopmentandintegration;
    
    DynamicResourceModel() {

        EFactory schoolFactoryInstance = DynamicResourceMetamodel.eINSTANCE.schoolEPackage.getEFactoryInstance();

        school = schoolFactoryInstance.create(DynamicResourceMetamodel.eINSTANCE.SchoolEClass);
        school.eSet(DynamicResourceMetamodel.eINSTANCE.SchoolNameEAttribute, "Budapest University of Technology and Economics");
        school.eSet(DynamicResourceMetamodel.eINSTANCE.SchoolAddressEAttribute, "1117 Budapest, Magyar Tudosok krt 2.");
        
        EList<EObject> years = new BasicEList<EObject>();
        EList<EObject> courses = new BasicEList<EObject>();
        EList<EObject> teachers = new BasicEList<EObject>();
        EList<EObject> year2011Classes = new BasicEList<EObject>();
        EList<EObject> year2012Classes = new BasicEList<EObject>();
        EList<EObject> year2011Class1Students = new BasicEList<EObject>();
        EList<EObject> year2011Class2Students = new BasicEList<EObject>();
        EList<EObject> year2012Class3Students = new BasicEList<EObject>();
        EList<EObject> year2012Class4Students = new BasicEList<EObject>();
        
        EObject year2011 = schoolFactoryInstance.create(DynamicResourceMetamodel.eINSTANCE.YearEClass);
        year2011.eSet(DynamicResourceMetamodel.eINSTANCE.YearStartingDateEAttribute, 2011);
        years.add(year2011);
        
        class1 = schoolFactoryInstance.create(DynamicResourceMetamodel.eINSTANCE.SchoolClassEClass);
        class1.eSet(DynamicResourceMetamodel.eINSTANCE.SchoolClassNameEAttribute, "1");
        class1.eSet(DynamicResourceMetamodel.eINSTANCE.SchoolClassCodeEAttribute, 'A');
        class1.eSet(DynamicResourceMetamodel.eINSTANCE.SchoolClassYearEReference, year2011);
        year2011Classes.add(class1);
        
        EObject ZoltanUjhelyi = schoolFactoryInstance.create(DynamicResourceMetamodel.eINSTANCE.StudentEClass);
        ZoltanUjhelyi.eSet(DynamicResourceMetamodel.eINSTANCE.StudentNameEAttribute, "Zoltan Ujhelyi");
        year2011Class1Students.add(ZoltanUjhelyi);
        
        class2 = schoolFactoryInstance.create(DynamicResourceMetamodel.eINSTANCE.SchoolClassEClass);
        class2.eSet(DynamicResourceMetamodel.eINSTANCE.SchoolClassNameEAttribute, "2");
        class2.eSet(DynamicResourceMetamodel.eINSTANCE.SchoolClassCodeEAttribute, 'B');
        class2.eSet(DynamicResourceMetamodel.eINSTANCE.SchoolClassYearEReference, year2011);
        year2011Classes.add(class2);
        
        EObject AbelHegedus = schoolFactoryInstance.create(DynamicResourceMetamodel.eINSTANCE.StudentEClass);
        AbelHegedus.eSet(DynamicResourceMetamodel.eINSTANCE.StudentNameEAttribute, "Abel Hegedus");
        year2011Class2Students.add(AbelHegedus);
        
        EObject year2012 = schoolFactoryInstance.create(DynamicResourceMetamodel.eINSTANCE.YearEClass);
        year2012.eSet(DynamicResourceMetamodel.eINSTANCE.YearStartingDateEAttribute, 2012);
        years.add(year2012);
        
        class3 = schoolFactoryInstance.create(DynamicResourceMetamodel.eINSTANCE.SchoolClassEClass);
        class3.eSet(DynamicResourceMetamodel.eINSTANCE.SchoolClassNameEAttribute, "3");
        class3.eSet(DynamicResourceMetamodel.eINSTANCE.SchoolClassCodeEAttribute, 'C');
        class3.eSet(DynamicResourceMetamodel.eINSTANCE.SchoolClassYearEReference, year2012);
        year2012Classes.add(class3);
        
        EObject IstvanRath = schoolFactoryInstance.create(DynamicResourceMetamodel.eINSTANCE.StudentEClass);
        IstvanRath.eSet(DynamicResourceMetamodel.eINSTANCE.StudentNameEAttribute, "Istvan Rath");
        year2012Class3Students.add(IstvanRath);
        
        EObject AkosHorvath = schoolFactoryInstance.create(DynamicResourceMetamodel.eINSTANCE.StudentEClass);
        AkosHorvath.eSet(DynamicResourceMetamodel.eINSTANCE.StudentNameEAttribute, "Akos Horvath");
        year2012Class3Students.add(AkosHorvath);
        
        class4 = schoolFactoryInstance.create(DynamicResourceMetamodel.eINSTANCE.SchoolClassEClass);
        class4.eSet(DynamicResourceMetamodel.eINSTANCE.SchoolClassNameEAttribute, "4");
        class4.eSet(DynamicResourceMetamodel.eINSTANCE.SchoolClassCodeEAttribute, 'D');
        class4.eSet(DynamicResourceMetamodel.eINSTANCE.SchoolClassYearEReference, year2012);
        year2012Classes.add(class3);
        
        EObject GaborBergmann = schoolFactoryInstance.create(DynamicResourceMetamodel.eINSTANCE.StudentEClass);
        GaborBergmann.eSet(DynamicResourceMetamodel.eINSTANCE.StudentNameEAttribute, "Gabor Bergmann");
        year2012Class4Students.add(GaborBergmann);
        
        class1.eSet(DynamicResourceMetamodel.eINSTANCE.SchoolClassStudentsEReference, year2011Class1Students);
        class2.eSet(DynamicResourceMetamodel.eINSTANCE.SchoolClassStudentsEReference, year2011Class2Students);
        class3.eSet(DynamicResourceMetamodel.eINSTANCE.SchoolClassStudentsEReference, year2012Class3Students);
        class4.eSet(DynamicResourceMetamodel.eINSTANCE.SchoolClassStudentsEReference, year2012Class4Students);
        
        //This is not required because of the eOpposite reference
        //year2011.eSet(DynamicResourceMetamodel.eINSTANCE.YearSchoolClassesEReference, year2011Classes);
        //year2012.eSet(DynamicResourceMetamodel.eINSTANCE.YearSchoolClassesEReference, year2012Classes);
        
        school.eSet(DynamicResourceMetamodel.eINSTANCE.SchoolYearsEReference, years);
        
        EObject AndrasPataricza = schoolFactoryInstance.create(DynamicResourceMetamodel.eINSTANCE.TeacherEClass);
        AndrasPataricza.eSet(DynamicResourceMetamodel.eINSTANCE.TeacherNameEAttribute, "Andras Pataricza");
        teachers.add(AndrasPataricza);
        
        EObject IstvanMajzik = schoolFactoryInstance.create(DynamicResourceMetamodel.eINSTANCE.TeacherEClass);
        IstvanMajzik.eSet(DynamicResourceMetamodel.eINSTANCE.TeacherNameEAttribute, "Istvan Majzik");
        teachers.add(IstvanMajzik);
        
        EObject PeterSzeredi = schoolFactoryInstance.create(DynamicResourceMetamodel.eINSTANCE.TeacherEClass);
        PeterSzeredi.eSet(DynamicResourceMetamodel.eINSTANCE.TeacherNameEAttribute, "Peter Szeredi");
        teachers.add(PeterSzeredi);
        
        EObject DanielVarro = schoolFactoryInstance.create(DynamicResourceMetamodel.eINSTANCE.TeacherEClass);
        DanielVarro.eSet(DynamicResourceMetamodel.eINSTANCE.TeacherNameEAttribute, "Daniel Varro");
        teachers.add(DanielVarro);
        
        school.eSet(DynamicResourceMetamodel.eINSTANCE.SchoolTeachersEReference, teachers);
        
        EObject Modeldrivensoftwaredevelopment = schoolFactoryInstance.create(DynamicResourceMetamodel.eINSTANCE.CourseEClass);
        Modeldrivensoftwaredevelopment.eSet(DynamicResourceMetamodel.eINSTANCE.CourseNameEAttribute, "Model-driven software development");
        Modeldrivensoftwaredevelopment.eSet(DynamicResourceMetamodel.eINSTANCE.CourseWeightEAttribute, 30);
        courses.add(Modeldrivensoftwaredevelopment);
        
        EObject Formalmethods = schoolFactoryInstance.create(DynamicResourceMetamodel.eINSTANCE.CourseEClass);
        Formalmethods.eSet(DynamicResourceMetamodel.eINSTANCE.CourseNameEAttribute, "Formal methods");
        Formalmethods.eSet(DynamicResourceMetamodel.eINSTANCE.CourseWeightEAttribute, 17);
        courses.add(Formalmethods);
        
        EObject Faulttolerantsafetycriticalcomputing = schoolFactoryInstance.create(DynamicResourceMetamodel.eINSTANCE.CourseEClass);
        Faulttolerantsafetycriticalcomputing.eSet(DynamicResourceMetamodel.eINSTANCE.CourseNameEAttribute, "Fault-tolerant safety-critical computing");
        Faulttolerantsafetycriticalcomputing.eSet(DynamicResourceMetamodel.eINSTANCE.CourseWeightEAttribute, 37);
        courses.add(Faulttolerantsafetycriticalcomputing);
        
        EObject Prologprogramming = schoolFactoryInstance.create(DynamicResourceMetamodel.eINSTANCE.CourseEClass);
        Prologprogramming.eSet(DynamicResourceMetamodel.eINSTANCE.CourseNameEAttribute, "Prolog programming");
        Prologprogramming.eSet(DynamicResourceMetamodel.eINSTANCE.CourseWeightEAttribute, 23);
        courses.add(Prologprogramming);
        
        EObject Graphtransformations = schoolFactoryInstance.create(DynamicResourceMetamodel.eINSTANCE.CourseEClass);
        Graphtransformations.eSet(DynamicResourceMetamodel.eINSTANCE.CourseNameEAttribute, "Graph transformations");
        Graphtransformations.eSet(DynamicResourceMetamodel.eINSTANCE.CourseWeightEAttribute, 20);
        courses.add(Graphtransformations);
        
        EObject Eclipsebaseddevelopmentandintegration = schoolFactoryInstance.create(DynamicResourceMetamodel.eINSTANCE.CourseEClass);
        Eclipsebaseddevelopmentandintegration.eSet(DynamicResourceMetamodel.eINSTANCE.CourseNameEAttribute, "Eclipse based development and integration");
        Eclipsebaseddevelopmentandintegration.eSet(DynamicResourceMetamodel.eINSTANCE.CourseWeightEAttribute, 0);
        courses.add(Eclipsebaseddevelopmentandintegration);
        
        school.eSet(DynamicResourceMetamodel.eINSTANCE.SchoolCoursesEReference, courses);
        
        //friendsWith relationships
        EList<EObject> friendsWith = new BasicEList<EObject>();
        friendsWith.add(AbelHegedus);
        ZoltanUjhelyi.eSet(DynamicResourceMetamodel.eINSTANCE.StudentFriendsWithEReference, friendsWith);
        
        friendsWith = new BasicEList<EObject>();
        friendsWith.add(AbelHegedus);
        GaborBergmann.eSet(DynamicResourceMetamodel.eINSTANCE.StudentFriendsWithEReference, friendsWith);
        
        friendsWith = new BasicEList<EObject>();
        friendsWith.add(AkosHorvath);
        IstvanRath.eSet(DynamicResourceMetamodel.eINSTANCE.StudentFriendsWithEReference, friendsWith);
    }
   
}
