public class LocationDetails {
    private int locationId;
    private String locationName;
    private  String countyLocation;



    public LocationDetails(int locationId, String locationName, String countyLocation) {
        this.locationId = locationId;
        this.locationName = locationName;
        this.countyLocation = countyLocation;
    }

    public int getLocationId() {
        return locationId;
    }

    public void setLocationId(int locationId) {
        this.locationId = locationId;
    }

    public String getLocationName() {
        return locationName;
    }

    public void setLocationName(String locationName) {
        this.locationName = locationName;
    }

    public String getCountyLocation() {
        return countyLocation;
    }

    public void setCountyLocation(String countyLocation) {
        this.countyLocation = countyLocation;
    }


}
