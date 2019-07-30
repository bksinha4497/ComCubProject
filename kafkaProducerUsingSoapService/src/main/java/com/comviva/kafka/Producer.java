package com.comviva.kafka;

import org.apache.kafka.clients.producer.KafkaProducer;
import java.util.Properties;
import org.apache.kafka.clients.producer.ProducerRecord;
import org.apache.kafka.clients.producer.RecordMetadata;

import java.util.concurrent.Future;

public class Producer {

	public boolean sendMessage(String employeeData) {

		System.out.println(employeeData.toString());

		Properties properties = new Properties();
		properties.put("bootstrap.servers", "localhost:9092");
		properties.put("key.serializer", "org.apache.kafka.common.serialization.StringSerializer");
		properties.put("value.serializer", "org.apache.kafka.common.serialization.StringSerializer");

		KafkaProducer<String, String> kafkaProducer = new KafkaProducer<String, String>(properties);

		try {
			Future<RecordMetadata> metaData = kafkaProducer
					.send(new ProducerRecord<String, String>("Comviva_Employee_Data", "test message - ", employeeData));
			String strMetaData = metaData.toString();
			int index = strMetaData.indexOf("Failure");
			if (index == -1) {
				System.out.println("Employee data Successfully sent to kafka Producer");
				return true;
			}
			else System.out.println("\n Check Kafka Server is running or not .");

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			kafkaProducer.close();
		}
		return false;
	}

}
