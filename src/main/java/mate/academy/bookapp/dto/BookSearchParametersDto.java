package mate.academy.bookapp.dto;

import java.math.BigDecimal;

public record BookSearchParametersDto(String[] titles,
                                      String[] authors,
                                      String[] priceRanges,
                                      BigDecimal minPrice,
                                      BigDecimal maxPrice) {

}
