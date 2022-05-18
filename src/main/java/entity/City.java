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
    @NotNull(message = "id ������������")
    @Min(value = 0, message = "id ������ ���� ������ 0")
    private Long id; //���� �� ����� ���� null, �������� ���� ������ ���� ������ 0, �������� ����� ���� ������ ���� ����������, �������� ����� ���� ������ �������������� �������������
    @NotNull(message = "name ������������")
    @NotEmpty(message = "������ �� ����� ���� ������")
    private String name; //���� �� ����� ���� null, ������ �� ����� ���� ������
    @NotNull(message = "coordinates is required")
    private Coordinates coordinates; //���� �� ����� ���� null
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd HH:mm:ss")
    @JsonDeserialize(using = LocalDateTimeDeserializer.class)
    @JsonSerialize(using = LocalDateTimeSerializer.class)
    private java.time.LocalDateTime creationDate; //���� �� ����� ���� null, �������� ����� ���� ������ �������������� �������������
    @Min(value = 0, message = "area ������ ���� ������ 0")
    @NotNull(message = "area ������������")
    private Double area; //�������� ���� ������ ���� ������ 0, ���� �� ����� ���� null
    @Min(value = 0, message = "population ������ ���� ������ 0")
    private long population; //�������� ���� ������ ���� ������ 0
    private int metersAboveSeaLevel;
    @Min(value = 0, message = "populationDensity ������ ���� ������ 0")
    private double populationDensity; //�������� ���� ������ ���� ������ 0
    @Min(value = 0, message = "carCode ������ ���� ������ 0")
    @Max(value = 1000, message = "carCode ������ ���� ������ 1000")
    @NotNull(message = "carCode ������������")
    private Long carCode; //�������� ���� ������ ���� ������ 0, ������������ �������� ����: 1000, ���� �� ����� ���� null
    @NotNull(message = "standardOfLiving ������������")
    private StandardOfLiving standardOfLiving; //���� �� ����� ���� null
    @NotNull(message = "governor ������������")
    private Human governor; //���� ����� ���� null
}