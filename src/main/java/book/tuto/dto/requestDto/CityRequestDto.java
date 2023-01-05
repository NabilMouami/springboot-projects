package book.tuto.dto.requestDto;

import lombok.Data;

@Data
public class CityRequestDto {
    private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}
