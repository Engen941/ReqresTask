package models.singleUser.response;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.NoArgsConstructor;

@lombok.Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Support{

	@JsonProperty("text")
	private String text;

	@JsonProperty("url")
	private String url;
}