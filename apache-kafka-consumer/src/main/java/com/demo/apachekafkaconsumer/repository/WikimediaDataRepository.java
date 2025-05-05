package com.demo.apachekafkaconsumer.repository;

import com.demo.apachekafkaconsumer.WikimediaData;
import org.springframework.data.jpa.repository.JpaRepository;

public interface WikimediaDataRepository extends JpaRepository<WikimediaData, Long> {
}
