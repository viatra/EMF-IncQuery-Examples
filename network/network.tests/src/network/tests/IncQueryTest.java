
package network.tests;


import java.util.Arrays;
import java.util.Collection;

import network.NetworkPackage;
import network.mutualfriends.MutualFriendsMatcher;
import network.mutualfriends.MutualFriendsMatcherFactory;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;
import org.eclipse.incquery.runtime.exception.IncQueryException;
import org.eclipse.incquery.runtime.rete.collections.CollectionsFactory;
import org.eclipse.incquery.runtime.rete.collections.CollectionsFactory.CollectionsFramework;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

/*
 * @author istvanrath
 * Based on the work of Bali Janos Daniel, AX9UV0
 */
@RunWith(value = Parameterized.class)
public class IncQueryTest {
	
    
    CollectionsFactory.CollectionsFramework cfw;
    
    public IncQueryTest(CollectionsFramework _cf) {
        cfw = _cf;
    }
    
    @Parameters
    public static Collection<Object[]> genData() {
        return Arrays.asList(new Object[][] {
 //               {CollectionsFramework.FastUtil},
 //               {CollectionsFramework.Javolution},
 //               {CollectionsFramework.Trove},
                {CollectionsFramework.Java},
 //               {CollectionsFramework.GS},
 //               {CollectionsFramework.Apache},
        });        
    }
    
    private void log(String s) {
        System.out.println("["+this.cfw.name()+"] "+s);
    }
    
	@Test
	public void test() {
		
	    // set up incquery internals
	    CollectionsFactory.mode = cfw;
	    
		// String uri = "res/Large.network";
		String uri = "models/Medium.network";
		// String uri = "res/Small.network";
		
		
		/**
		 * Register package
		 */
		NetworkPackage.eINSTANCE.eClass();

		// Register the XMI resource factory for the given extension
		Resource.Factory.Registry.INSTANCE.getExtensionToFactoryMap().put(
				"network", new XMIResourceFactoryImpl());
		// Obtain a new resource set
		ResourceSet resSet = new ResourceSetImpl();
		// Get the resource
		Resource resource = resSet.getResource(URI.createURI(uri), true);

		System.gc();
		System.gc();
		System.gc();
		long startMemory = Runtime.getRuntime().totalMemory() - Runtime.getRuntime().freeMemory();
        
		try {
			long startTime = System.nanoTime();
			
			MutualFriendsMatcher matcher = MutualFriendsMatcherFactory.instance().getMatcher(resource);
			//PersonFriendsMatcher matcher = PersonFriendsMatcherFactory.instance().getMatcher(resource);
			
			double elapsedSec = (double)(System.nanoTime() - startTime) / (1000*1000*1000);
			
			log("Matches: " + matcher.countMatches());
			log("Elapsed seconds: " + elapsedSec);
			//System.out.println(matcher.getAllMatches().iterator().next());
			
			System.gc();
            System.gc();
            System.gc();
            System.gc();
            System.gc();            
            try {
                   Thread.sleep(10000); // wait for the GC to settle
            } catch (InterruptedException e) { e.printStackTrace(); }
            
            long usedMemory = Runtime.getRuntime().totalMemory() - Runtime.getRuntime().freeMemory();   
            log("Used memory (approx):" + ((usedMemory-startMemory)/(1024*1024)) + " MB");
			
			// unload resource to ensure incquery is de-initialized
			resource.unload();
			
		} catch (IncQueryException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
