import org.testng.annotations.Test;
import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;
import static org.hamcrest.MatcherAssert.*;

public class HamcrestExampleTests {

	@Test
	public void demoHamcrest() {
		
		boolean a= true;
		boolean b= true;
		
		assertThat(a,(equalTo(b)));
		assertThat(a,is(equalTo(b)));
		assertThat(a,is(b));
		
	}
}
