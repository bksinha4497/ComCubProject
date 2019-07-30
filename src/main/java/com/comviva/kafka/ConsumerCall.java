package com.comviva.kafka;
import java.io.IOException;

import com.comviva.kafka.Consumer;

public class ConsumerCall {

	public static void main(String[] args) throws IOException {
		Consumer call = new Consumer();
		for(;;)
			call.consumer();

	}

}
