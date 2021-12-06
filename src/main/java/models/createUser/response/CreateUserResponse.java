package models.createUser.response;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.NoArgsConstructor;
import lombok.NonNull;

@lombok.Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class CreateUserResponse{

	@NonNull
	@JsonProperty("createdAt")
	private String createdAt;

	@NonNull
	@JsonProperty("name")
	private String name;

	@NonNull
	@JsonProperty("id")
	private String id;

	@NonNull
	@JsonProperty("job")
	private String job;
}