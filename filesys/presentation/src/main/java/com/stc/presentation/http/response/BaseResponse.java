package com.stc.presentation.http.response;

import com.stc.application.item.dto.ItemDto;
import lombok.Data;

@Data
public class BaseResponse <T>{
    private T data;
    private String message;

}
