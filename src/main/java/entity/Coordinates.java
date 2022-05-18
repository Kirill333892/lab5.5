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
    @Min(value = -193, message = "x ������ ���� ������ -193")
    private double x; //�������� ���� ������ ���� ������ -193
    @NotNull(message = "y ������������")
    @Max(value = 563, message = "y ������ ���� ������ 563")
    private Integer y; //������������ �������� ����: 563, ���� �� ����� ���� null
}