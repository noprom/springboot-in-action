package com.huntdreams.readinglist.repository;

import com.huntdreams.readinglist.domain.Reader;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Author: Tyeenoprom <tyee.noprom@qq.com>
 * Date: 20/9/2017 9:10 AM
 */
public interface ReaderRepository extends JpaRepository<Reader, String> {
}
