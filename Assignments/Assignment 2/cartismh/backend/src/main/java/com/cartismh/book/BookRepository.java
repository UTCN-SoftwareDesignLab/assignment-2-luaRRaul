package com.cartismh.book;

import com.cartismh.book.model.Book;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface BookRepository extends JpaRepository<Book, Long> {
    List<Book> findBookByQuantity(int quantity);
    List<Book> findBooksByTitleAndAuthorAndGenre(String title, String Author, String genre);
}
