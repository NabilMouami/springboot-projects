package book.tuto.dto.responseDto;

import lombok.Data;

import java.util.List;

@Data
public class CategoryResponseDto {
    private Long id;
    private String name;
    public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public List<String> getBookNames() {
		return bookNames;
	}
	public void setBookNames(List<String> bookNames) {
		this.bookNames = bookNames;
	}
	private List<String> bookNames;
}
