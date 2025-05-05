package com.demo.apachekafkaconsumer.service;

import com.demo.apachekafkaconsumer.WikimediaData;
import com.demo.apachekafkaconsumer.repository.WikimediaDataRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class KafkaConsumerService {

    private static final Logger LOGGER = LoggerFactory.getLogger(KafkaConsumerService.class);
    private final WikimediaDataRepository wikimediaDataRepository;

    public KafkaConsumerService(WikimediaDataRepository wikimediaDataRepository) {
        this.wikimediaDataRepository = wikimediaDataRepository;
    }

    @KafkaListener(
            topics = "${app.value.topic.name}",
            groupId = "${app.value.topic.groupid}"
    )
    public void consume(String message) {
        LOGGER.info("Event message received -> " +message);
        WikimediaData wikimediaData = new WikimediaData();
        wikimediaData.setWikimediaEventData(message);

        //save wikimedia to db
        wikimediaDataRepository.save(wikimediaData);
    }

}
