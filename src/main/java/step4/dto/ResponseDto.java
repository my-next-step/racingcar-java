package step4.dto;

import step4.domain.racing.Cars;

public class ResponseDto {
    private final Cars cars;

    public ResponseDto(Cars cars) {
        this.cars = cars;
    }
}
