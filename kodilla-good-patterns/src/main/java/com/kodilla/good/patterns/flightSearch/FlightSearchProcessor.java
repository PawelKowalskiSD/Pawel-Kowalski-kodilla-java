package com.kodilla.good.patterns.flightSearch;

public class FlightSearchProcessor {

    private final FlightService flightService;

    private final InformationFlightService informationFlightService;

    private final FlightRepository flightRepository;

    public FlightSearchProcessor(final FlightService flightService, final InformationFlightService informationFlightService, final FlightRepository flightRepository) {
        this.flightService = flightService;
        this.informationFlightService = informationFlightService;
        this.flightRepository = flightRepository;
    }

    public FlightDto process(final FlightRequest flightRequest) {
        boolean isArrivalCityFlight = flightService.search(flightRequest.arrivalSearch());
        boolean isDepartureCityFlight = flightService.search(flightRequest.departureSearch());

        if (isArrivalCityFlight) {
            informationFlightService.information();
            flightRepository.bookingFlight();
            return new FlightDto(flightRequest.arrivalSearch(), true);
        } else if (isDepartureCityFlight) {
            informationFlightService.information();
            flightRepository.bookingFlight();
            return new FlightDto(flightRequest.departureSearch(), true);
        } else {
            return new FlightDto(flightRequest.getFlight(), false);
        }
    }
}
