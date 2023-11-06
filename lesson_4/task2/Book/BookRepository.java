package lessonHome4.task2.Book;

import java.util.List;

public interface BookRepository {
    Book findById(String id);
    List<Book> findAll();
}
