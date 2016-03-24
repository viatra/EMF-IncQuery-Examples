package school.tests

import com.google.inject.Inject
import org.eclipse.viatra.query.testing.core.SnapshotHelper
import org.eclipse.viatra.query.testing.core.injector.EMFPatternLanguageInjectorProvider
import org.eclipse.viatra.query.testing.snapshot.QuerySnapshot
import org.eclipse.xtext.junit4.InjectWith
import org.eclipse.xtext.junit4.XtextRunner
import org.junit.Assert
import org.junit.Test
import org.junit.runner.RunWith

@RunWith(typeof(XtextRunner))
@InjectWith(typeof(EMFPatternLanguageInjectorProvider))
class TestingFrameworkTest extends SchoolTestsBase {
  
  @Inject extension SnapshotHelper 
  
  def testValues(QuerySnapshot sns){
    sns.matchSetRecords.forEach[
      matches.forEach[
        substitutions.forEach[
          Assert::assertTrue("Substitution is not correct", derivedValue != null)
        ]
      ]
    ]
  }
  
  @Test
  def queryBasedFeatureTest(){
    
    val sns = snapshot
    
    testValues(sns)
  }
  
}