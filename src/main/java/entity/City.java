package entity;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.fasterxml.jackson.datatype.jsr310.deser.LocalDateTimeDeserializer;
import com.fasterxml.jackson.datatype.jsr310.ser.LocalDateTimeSerializer;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;


import javax.validation.constraints.*;

@Data
@Getter
@Setter
public class City {
    @NotNull(message = "id об€зательный")
    @Min(value = 0, message = "id должен быть больше 0")
    private Long id; //ѕоле не может быть null, «начение пол€ должно быть больше 0, «начение этого пол€ должно быть уникальным, «начение этого пол€ должно генерироватьс€ автоматически
    @NotNull(message = "name об€зательный")
    @NotEmpty(message = "строка не может быть пустой")
    private String name; //ѕоле не может быть null, —трока не может быть пустой
    @NotNull(message = "coordinates is required")
    private Coordinates coordinates; //ѕоле не может быть null
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd HH:mm:ss")
    @JsonDeserialize(using = LocalDateTimeDeserializer.class)
    @JsonSerialize(using = LocalDateTimeSerializer.class)
    private java.time.LocalDateTime creationDate; //ѕоле не может быть null, «начение этого пол€ должно генерироватьс€ автоматически
    @Min(value = 0, message = "area должен быть больше 0")
    @NotNull(message = "area об€зательный")
    private Double area; //«начение пол€ должно быть больше 0, ѕоле не может быть null
    @Min(value = 0, message = "population должен быть больше 0")
    private long population; //«начение пол€ должно быть больше 0
    private int metersAboveSeaLevel;
    @Min(value = 0, message = "populationDensity должен быть больше 0")
    private double populationDensity; //«начение пол€ должно быть больше 0
    @Min(value = 0, message = "carCode должен быть больше 0")
    @Max(value = 1000, message = "carCode должен быть меньше 1000")
    @NotNull(message = "carCode об€зательный")
    private Long carCode; //«начение пол€ должно быть больше 0, ћаксимальное значение пол€: 1000, ѕоле не может быть null
    @NotNull(message = "standardOfLiving об€зательный")
    private StandardOfLiving standardOfLiving; //ѕоле не может быть null
    @NotNull(message = "governor об€зательный")
    private Human governor; //ѕоле может быть null
}