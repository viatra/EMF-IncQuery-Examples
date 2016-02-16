package school.tests

import org.eclipse.viatra.query.testing.snapshot.IncQuerySnapshot
import org.eclipse.viatra.query.testing.snapshot.RecordRole
import org.eclipse.viatra.query.testing.core.injector.EMFPatternLanguageInjectorProvider
import org.eclipse.xtext.junit4.InjectWith
import org.eclipse.xtext.junit4.XtextRunner
import org.junit.Assert
import org.junit.Test
import org.junit.runner.RunWith

@RunWith(typeof(XtextRunner))
@InjectWith(typeof(EMFPatternLanguageInjectorProvider))
class TestingFrameworkTest extends SchoolTestsBase {
  
  def testValues(IncQuerySnapshot sns){
    sns.matchSetRecords.forEach[
      Assert::assertTrue("Record role not set for filter", filter.role == RecordRole::FILTER)
      matches.forEach[
        Assert::assertTrue("Record role not set for match", role == RecordRole::MATCH)
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