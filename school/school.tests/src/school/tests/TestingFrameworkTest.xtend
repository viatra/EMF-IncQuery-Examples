package school.tests

import school.tests.SchoolTestsBase
import org.junit.runner.RunWith
import org.eclipse.xtext.junit4.XtextRunner
import org.eclipse.xtext.junit4.InjectWith
import org.eclipse.incquery.testing.core.injector.EMFPatternLanguageInjectorProvider
import com.google.inject.Inject
import org.eclipse.incquery.testing.core.TestExecutor
import org.eclipse.incquery.testing.core.ModelLoadHelper
import org.eclipse.incquery.testing.core.SnapshotHelper
import org.eclipse.incquery.snapshot.EIQSnapshot.RecordRole
import org.junit.Assert
import org.junit.Test
import org.eclipse.incquery.runtime.api.EngineManager
import org.eclipse.incquery.snapshot.EIQSnapshot.IncQuerySnapshot

@RunWith(typeof(XtextRunner))
@InjectWith(typeof(EMFPatternLanguageInjectorProvider))
class TestingFrameworkTest extends SchoolTestsBase {
  
  @Inject extension TestExecutor
  @Inject extension ModelLoadHelper
  @Inject extension SnapshotHelper
  
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
  
  @Test
  def wildcardTest(){
    val sns = snapshot
    val engine = EngineManager::instance.getIncQueryEngine(sns.EMFRootForSnapshot)
    engine.setWildcardMode(true)
    testValues(sns)
  }
}