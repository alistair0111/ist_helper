package com.ist_helper.pb.repository;

import com.ist_helper.model.book.Book;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PBRepository extends JpaRepository<Book, Integer>{

}
