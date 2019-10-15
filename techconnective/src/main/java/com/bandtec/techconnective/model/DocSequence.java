package com.bandtec.techconnective.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Document(collection = "sequence_dados")
@Getter @Setter
@NoArgsConstructor
public class DocSequence {

    @Id
    private String id;
 
    private long seq;

	public long getSeq() {
		return seq;
	}
}
