import org.junit.Before; 
import org.junit.Test; 
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import static org.mockito.Mockito.*;

public class BookServiceTest {

@Mock 
private BookRepository bookRepository; 
private BookService bookService;

@Before
public void setup() { MockitoAnnotations.initMocks(this); 

bookService = new BookService(bookRepository); 

@Test 
public void testGetBookById() { Book book = new Book(1, "Test Book"); 


@Test
public void testAddBook() { Book book = new Book(2, "New Book");