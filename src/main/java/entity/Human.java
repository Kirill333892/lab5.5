package entity;


import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import javax.validation.constraints.Min;

@Data
@Getter
@Setter
public class Human {
    @Min(value = 0, message = "height ������ ���� ������ 0")
    private float height; //�������� ���� ������ ���� ������ 0
}