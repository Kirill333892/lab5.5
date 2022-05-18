package entity;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;

@Data
@Getter
@Setter
public class Coordinates {
    @Min(value = -193, message = "x должен быть больше -193")
    private double x; //«начение пол€ должно быть больше -193
    @NotNull(message = "y об€зательный")
    @Max(value = 563, message = "y должен быть меньше 563")
    private Integer y; //ћаксимальное значение пол€: 563, ѕоле не может быть null
}