package models.createUser.request;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.NoArgsConstructor;

@lombok.Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class CreateUserRequest{

	@JsonProperty("name")
	private String name;

	@JsonProperty("job")
	private String job;
}