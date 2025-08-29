package com.bajaj.assignment.dto;

import lombok.Data;

@Data
public class OutputData {
    boolean is_success;
    String userId;
    String email;
    String roll_number;
    String[] odd_numbers;
}
