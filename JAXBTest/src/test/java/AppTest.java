import java.io.File;
import java.nio.file.Path;

import org.junit.After;
import org.junit.Before;
import org.junit.Ignore;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

import com.jxb.App;
import com.jxb.Customer;

import junit.framework.TestCase;


public class AppTest extends TestCase{
	
	@Rule
	public final ExpectedException exception = ExpectedException.none();
	
	@Before
	protected void setUp(){
	}
	
	@Test
	public void testWrite(){
		
		Customer customer = new Customer();
		customer.setId(1);
		customer.setName("Adnan");
		
		App.write(customer);
		File file = new File("file.xml");
		assertTrue("writes the xml in file", file.exists());
		
		exception.expect(NullPointerException.class);
		App.write(null);
		
		
	}
	
	@Ignore("Not Ready")
	@Test
	public void testRead(){
		
	}

	@After
	protected void tearDown(){
	}
	
	
}
