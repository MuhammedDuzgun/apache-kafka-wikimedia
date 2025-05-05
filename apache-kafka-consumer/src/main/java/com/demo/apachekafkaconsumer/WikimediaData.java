package com.demo.apachekafkaconsumer;

import jakarta.persistence.*;

@Entity
@Table(name = "wikimedia_recentchange")
public class WikimediaData {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Lob
    private String wikimediaEventData;

    public WikimediaData() {
    }

    public WikimediaData(Long id, String wikimediaEventData) {
        this.id = id;
        this.wikimediaEventData = wikimediaEventData;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getWikimediaEventData() {
        return wikimediaEventData;
    }

    public void setWikimediaEventData(String wikimediaEventData) {
        this.wikimediaEventData = wikimediaEventData;
    }
}
