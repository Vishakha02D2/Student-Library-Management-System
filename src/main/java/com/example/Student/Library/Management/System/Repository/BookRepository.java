package com.example.Student.Library.Management.System.Repository;

import com.example.Student.Library.Management.System.Models.Book;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BookRepository extends JpaRepository<Book, Integer> {

}

