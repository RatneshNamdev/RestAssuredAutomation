import java.util.Arrays;
import java.util.List;
import static org.hamcrest.Matchers.*;
import static org.hamcrest.MatcherAssert.*;
import static org.hamcrest.collection.IsCollectionWithSize.hasSize;
import static org.hamcrest.core.Every.everyItem;

import org.testng.annotations.Test;

public class HamcrestExample2Tets {

	@Test
	public void demo2Hamcrest() {
		
	        List<Integer> list = Arrays.asList(5, 2, 4);

	        assertThat(list, hasSize(3));

	        // ensure the order is correct
	        assertThat(list, contains(5, 2, 4));

	        assertThat(list, containsInAnyOrder(2, 4, 5));

	        assertThat(list, everyItem(greaterThan(1)));

	    }
	}
