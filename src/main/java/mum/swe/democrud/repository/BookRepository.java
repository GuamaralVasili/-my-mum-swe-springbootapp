package mum.swe.democrud.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import mum.swe.democrud.model.Book;

@Repository("studentRepository")
public interface BookRepository extends JpaRepository<Book, Long> {

	@Query("select s from Book s where s.bookId = ?1")
	Book findOne(Long id);

	@Modifying
	@Transactional
	@Query("delete from Book s where s.bookId = ?1")
	void delete(Long id);
}