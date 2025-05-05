package com.demo.apache_kafka_producer;

import com.demo.apache_kafka_producer.service.WikimediaChangesProducer;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ApacheKafkaProducerApplication implements CommandLineRunner {

	private final WikimediaChangesProducer wikimediaChangesProducer;

	public ApacheKafkaProducerApplication(WikimediaChangesProducer wikimediaChangesProducer) {
		this.wikimediaChangesProducer = wikimediaChangesProducer;
	}

	public static void main(String[] args) {
		SpringApplication.run(ApacheKafkaProducerApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		wikimediaChangesProducer.sendMessage();
	}
}
