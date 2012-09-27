package org.eclipse.viatra2.emf.incquery.base.example;

import java.util.Collection;
import java.util.HashSet;

import library.Book;
import library.Library;
import library.LibraryPackage;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EStructuralFeature.Setting;
import org.eclipse.viatra2.emf.incquery.base.api.IncQueryBaseFactory;
import org.eclipse.viatra2.emf.incquery.base.api.NavigationHelper;
import org.eclipse.viatra2.emf.incquery.base.api.TransitiveClosureHelper;
import org.eclipse.viatra2.emf.incquery.base.exception.IncQueryBaseException;

public class TestModule1 {

	private Library lib;
	private NavigationHelper navigationHelper;
	private TransitiveClosureHelper tcHelper;

	public TestModule1(Library lib) throws IncQueryBaseException {
		this.lib = lib;

		// creating NavigationHelper instance
		navigationHelper = IncQueryBaseFactory.getInstance().createNavigationHelper(lib, true, null);

		// creating TransitiveClosureHelper instance
		HashSet<EReference> refs = new HashSet<EReference>();

		refs.add((EReference) LibraryPackage.eINSTANCE.getBook_Citation());
		refs.add((EReference) LibraryPackage.eINSTANCE.getWriter_Books());
		tcHelper = IncQueryBaseFactory.getInstance().createTransitiveClosureHelper(lib, refs);
	}

	public void executeQueries() throws IncQueryBaseException {

		// find all EObject instances which has an attribute with a value of 100
		System.out.println("query1 -> ");
		Collection<Setting> result = navigationHelper.findByAttributeValue(100);
		for (Setting s : result) {
			System.out.println(s.getEObject());
		}
		System.out.println();

		// find all EObject instances which have a 'pages' EAttribute with a
		// value of 100
		System.out.println("query2 -> ");
		Collection<EObject> result2 = navigationHelper.findByAttributeValue(100, LibraryPackage.eINSTANCE.getBook_Pages());
		for (EObject obj : result2) {
			System.out.println(obj);
		}
		System.out.println();

		// find all instances of Book EClass
		System.out.println("query3 -> ");
		result2 = navigationHelper.getAllInstances(LibraryPackage.eINSTANCE.getBook());
		for (EObject obj : result2) {
			System.out.println(obj);
		}
		System.out.println();

		// find all direct instances of Book EClass
		System.out.println("query4 -> ");
		result2 = navigationHelper.getDirectInstances(LibraryPackage.eINSTANCE.getBook());
		for (EObject obj : result2) {
			System.out.println(obj);
		}
		System.out.println();

		System.out.println("query5 -> ");
		Book b1 = null;
		if (lib.getBooks().size() > 0) {
			// Get the first book in the library
			b1 = (Book) lib.getBooks().get(0);
			System.out.println("the title of the first book is "+ b1.getTitle());
			// find the inverse references of the first book
			result = navigationHelper.getInverseReferences(b1);
			for (Setting s : result) {
				System.out.println(s);
			}
		}
		System.out.println();

		// find the inverse references of the first book but only the 'books'
		// references of library
		System.out.println("query6 -> ");
		if (b1 != null) {
			result2 = navigationHelper.getInverseReferences(b1, LibraryPackage.eINSTANCE.getLibrary_Books());
			for (EObject obj : result2) {
				System.out.println(obj);
			}
		}
		System.out.println();

		// find the inverse references of the first book but only the 'books'
		// references of library and the 'citation' references of book
		HashSet<EReference> refs = new HashSet<EReference>();
		refs.add(LibraryPackage.eINSTANCE.getLibrary_Books());
		refs.add(LibraryPackage.eINSTANCE.getBook_Citation());
		System.out.println("query7 -> ");
		if (b1 != null) {
			result = navigationHelper.getInverseReferences(b1, refs);
			for (Setting s : result) {
				System.out.println(s);
			}
		}
		System.out.println();

		System.out.println("query8 -> ");
		if (b1 != null) {
			result2 = tcHelper.getAllReachableTargets(b1);
			if (result2 != null) {
				for (EObject s : tcHelper.getAllReachableTargets(b1)) {
					System.out.println(s);
				}
			}
		}
		
		navigationHelper.dispose();
		tcHelper.dispose();
	}

	public void modifyModel() {

	}
}
