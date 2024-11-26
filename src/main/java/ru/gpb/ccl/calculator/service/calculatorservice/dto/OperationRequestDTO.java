package ru.gpb.ccl.calculator.service.calculatorservice.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@Data
@NoArgsConstructor
public class OperationRequestDTO {
    private double a;
    private double b;
}
