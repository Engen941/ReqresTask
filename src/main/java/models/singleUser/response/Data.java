package models.singleUser.response;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.NoArgsConstructor;

@lombok.Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Data{

	@JsonProperty("last_name")
	private String lastName;

	@JsonProperty("id")
	private Integer id;

	@JsonProperty("avatar")
	private String avatar;

	@JsonProperty("first_name")
	private String firstName;

	@JsonProperty("email")
	private String email;
}