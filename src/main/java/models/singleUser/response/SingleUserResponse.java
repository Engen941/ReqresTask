package models.singleUser.response;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.NoArgsConstructor;

@lombok.Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class SingleUserResponse{

	@JsonProperty("data")
	private Data data;

	@JsonProperty("support")
	private Support support;
}