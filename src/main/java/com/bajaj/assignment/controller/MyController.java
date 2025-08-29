package com.bajaj.assignment.controller;

import com.bajaj.assignment.dto.InputData;
import com.bajaj.assignment.dto.OutputData;
import com.sun.tools.jconsole.JConsoleContext;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class MyController {

    @GetMapping("/hello")
    public String hello(){
        return "Hello";
    }

    @PostMapping("/bfhl")
    public ResponseEntity<OutputData> bfhl(@RequestBody InputData data){
        List<String> arr = data.getData();

        List<String> odd = new ArrayList<>();
        List<String> even = new ArrayList<>();
        List<String> characters = new ArrayList<>();
        List<String> special = new ArrayList<>();
        int sum = 0;
        StringBuilder concat = new StringBuilder();
        boolean flag = true;

        for(String x : arr){
            if(x.matches("-?\\d+")){
                int num = Integer.parseInt(x);
                sum += num;
                if(num % 2 == 0) even.add(x);
                else odd.add(x);
            }
            else if(x.matches("[a-zA-Z]+")){
                characters.add(x.toUpperCase());
                concat.append(x);
            }
            else special.add(x);
        }

        concat.reverse();

        StringBuilder st = new StringBuilder();
        for(int i = 0; i < concat.length(); i++){
            if(i % 2 == 0){
                st.append(Character.toUpperCase(concat.charAt(i)));
            } else{
                st.append(Character.toLowerCase(concat.charAt(i)));
            }
        }


        OutputData outputData = new OutputData();
        outputData.setIs_success(true);
        outputData.setUser_id("divyanshu_bharadwaj_11062003");
        outputData.setEmail("divyanshu.bharadwaj1@gmail.com");
        outputData.setRoll_number("22BIT0118");
        outputData.setOdd_numbers(odd);
        outputData.setEven_numbers(even);
        outputData.setAlphabets(characters);
        outputData.setSpecial_characters(special);
        outputData.setSum(Integer.toString(sum));
        outputData.setConcat_string(st.toString());

        return new ResponseEntity<>(outputData, HttpStatus.OK);

    }
}
