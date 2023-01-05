package book.tuto.dto.requestDto;

import lombok.Data;

@Data
public class AuthorRequestDto {
    public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Long getZipcodeId() {
		return zipcodeId;
	}
	public void setZipcodeId(Long zipcodeId) {
		this.zipcodeId = zipcodeId;
	}
	private String name;
    private Long zipcodeId;
}
