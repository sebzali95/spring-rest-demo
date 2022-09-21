package az.spring.rest.demo.springrestdemo.exception;

import az.spring.rest.demo.springrestdemo.enums.ErrorCodeEnum;

public class CustomRestException extends RuntimeException {
    public CustomRestException(String message) {
        super(message);
    }

    public CustomRestException(ErrorCodeEnum errorCodeEnum) {
        super(errorCodeEnum.getMessage());
    }
}
