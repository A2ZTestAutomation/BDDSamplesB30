package runners;

import java.util.List;

import org.testng.annotations.BeforeTest;

import io.cucumber.core.options.RuntimeOptions;
import io.cucumber.core.options.RuntimeOptionsBuilder;
import io.cucumber.core.runtime.Runtime;
import io.cucumber.core.runtime.Runtime.Builder;
import io.cucumber.tagexpressions.Expression;
import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
		features = "src//test//resources//taggedFeatures//",
		glue= "stepdefs",
		monochrome=true,
//		tags="@SmokeTest"
//		tags="@RegressionTest"
//		tags="@SmokeTest and @RegressionTest"
//		tags="@SmokeTest or @RegressionTest"
//		tags = "not @RegressionTest"
//		tags = "@RegressionTest"
//		tags="@SmokeTest"
//		tags="@PhaseOne"
//		tags="@PhaseTwo and @SmokeTest"
//		tags="@PhaseTwo and not @SmokeTest"
		tags="@PhaseTwo"
		)
public class TaggedRunner extends AbstractTestNGCucumberTests{
	
	
	
	
	
	
//	@BeforeTest
//	public void setTags() {
//		 Runtime.Builder rb = Runtime.builder();
//		 RuntimeOptions ro =  RuntimeOptions.defaultOptions();
//		 
//		 List<Expression> tagEx = ro.getTagExpressions();
//		
//			
//		
//	}
	
	

}
