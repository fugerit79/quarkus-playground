package com.radcortez.quarkus.playground.services.book.model;

import com.radcortez.quarkus.playground.services.book.mapper.BookMapper;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.eclipse.microprofile.openapi.annotations.media.Schema;

@NoArgsConstructor
@AllArgsConstructor
@Getter(onMethod_ = {@Schema(hidden = true)})
@Data
@Builder(toBuilder = true)

@Schema(name = "bookRead")
public class BookRead {
    @Schema(
        description = "The id of the book",
        example = "1"
    )
    private Long id;

    @Schema(
        description = "The author of the book",
        example = "Roberto Cortez"
    )
    private String author;

    @Schema(
        description = "The title of the book",
        example = "Quarkus in Action"
    )
    private String title;

    @Schema(
        description = "The publishing year of the book",
        example = "2020"
    )
    private Integer publishYear;

    @Schema(
        description = "The genre of the book",
        example = "Tech"
    )
    private String genre;

    @Schema(
        description = "The ISBN of the book",
        example = "ISBN-123456789"
    )
    private String isbn;

    public BookCreate toBookCreate() {
        return BookMapper.INSTANCE.toBookCreate(this);
    }

    public BookUpdate toBookUpdate() {
        return BookMapper.INSTANCE.toBookUpdate(this);
    }
}
