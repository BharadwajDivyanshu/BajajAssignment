package com.bajaj.assignment.dto;

import lombok.Data;

import java.util.List;

@Data
public class OutputData {
    Boolean is_success;
    String user_id;
    String email;
    String roll_number;
    List<String> odd_numbers;
    List<String> even_numbers;
    List<String> alphabets;
    List<String> special_characters;
    String sum;
    String concat_string;

}
