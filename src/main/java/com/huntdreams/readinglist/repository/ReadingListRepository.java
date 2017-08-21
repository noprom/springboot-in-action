package com.huntdreams.readinglist.repository;

import com.huntdreams.readinglist.domain.Book;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

/**
 * Author: Tyeenoprom <tyee.noprom@qq.com>
 * Date: 21/8/2017 10:47 AM
 */
public interface ReadingListRepository extends JpaRepository<Book, Long> {
    List<Book> findByReader(String reader);
}