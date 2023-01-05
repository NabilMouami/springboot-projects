package book.tuto.service;

import org.springframework.stereotype.Service;

import book.tuto.dto.requestDto.CategoryRequestDto;
import book.tuto.dto.responseDto.CategoryResponseDto;
import book.tuto.model.Category;

import java.util.List;

@Service
public interface CategoryService {
    public Category getCategory(Long categoryId);
    public CategoryResponseDto addCategory(CategoryRequestDto categoryRequestDto);
    public CategoryResponseDto getCategoryById(Long categoryId);
    public List<CategoryResponseDto> getCategories();
    public CategoryResponseDto deleteCategory(Long categoryId);
    public CategoryResponseDto editCategory(Long categoryId, CategoryRequestDto categoryRequestDto);
}
