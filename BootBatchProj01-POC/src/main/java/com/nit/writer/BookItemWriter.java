package com.nit.writer;

import org.springframework.batch.item.Chunk;
import org.springframework.batch.item.ItemWriter;
import org.springframework.stereotype.Component;

@Component("biWriter")
public class BookItemWriter implements ItemWriter<String> {

	@Override
	public void write(Chunk<? extends String> chunk) throws Exception {
		System.out.println("BookItemWriter.write()");
		System.out.print("Processed Items::");
		chunk.forEach(item -> {
			System.out.print(item+" ");
		});
		System.out.println();
		
	}

}
