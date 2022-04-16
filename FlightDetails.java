package TravelAPI;

import java.sql.Date;

public class FlightDetails {

	private String _flightName;
	private int _flightNumber;
	private String _flightStatus;
	private String _airportName;
	private Date _flightDeparture;
	private Date _flightArrival;
	
	public FlightDetails(String flightName, int flightNumber, String flightStatus, String airportName, Date flightDep, Date flightArrivals) {
		set_flightName(flightName);
		set_flightNumber(flightNumber);
		set_flightStatus(flightStatus);
		set_airportName(airportName);
		set_flightDeparture(flightDep);
		set_flightArrival(flightArrivals);
	}
	
	public String get_flightName() {
		return _flightName;
	}
	public void set_flightName(String _flightName) {
		this._flightName = _flightName;
	}

	public int get_flightNumber() {
		return _flightNumber;
	}

	public void set_flightNumber(int _flightNumber) {
		this._flightNumber = _flightNumber;
	}

	public String get_flightStatus() {
		return _flightStatus;
	}

	public void set_flightStatus(String _flightStatus) {
		this._flightStatus = _flightStatus;
	}

	public String get_airportName() {
		return _airportName;
	}

	public void set_airportName(String _airportName) {
		this._airportName = _airportName;
	}

	public Date get_flightDeparture() {
		return _flightDeparture;
	}

	public void set_flightDeparture(Date _flightDeparture) {
		this._flightDeparture = _flightDeparture;
	}

	public Date get_flightArrival() {
		return _flightArrival;
	}

	public void set_flightArrival(Date _flightArrival) {
		this._flightArrival = _flightArrival;
	}
	
	
}
