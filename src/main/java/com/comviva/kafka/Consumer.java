package com.comviva.kafka;

import org.apache.kafka.clients.consumer.ConsumerRecord;
import org.apache.kafka.clients.consumer.ConsumerRecords;
import org.apache.kafka.clients.consumer.KafkaConsumer;

import com.comviva.constants.Constants;
import com.comviva.service.PostService;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Properties;

public class Consumer {
	public void consumer() throws IOException{

		PostService p= new PostService();
		Properties properties = new Properties();
		FileInputStream property= new FileInputStream(Constants.PROPERTIES_PATH);
		properties.load(property);

		@SuppressWarnings("resource")
		KafkaConsumer<String, String> kafkaConsumer = new KafkaConsumer<String, String>(properties);
		List<String> topics = new ArrayList<String>();
		topics.add(Constants.TOPIC);
		kafkaConsumer.subscribe(topics);

		try (KafkaConsumer<String, String> consumer = new KafkaConsumer<String, String>(properties)) {
			consumer.subscribe(Collections.singletonList(Constants.TOPIC));
			while (true) {
				ConsumerRecords<String,String> messages = consumer.poll(100);
				for (ConsumerRecord<String, String> message : messages) {
					System.out.println("Message received " + message.value().toString());
					p.post(message.value().toString());
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		}



	}

}