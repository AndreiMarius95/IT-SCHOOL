package practice.session11.config_exemple;

public class ApiService implements Config {

    void fetchData() {
        System.out.println("Fetching data from: " + API_ENDPOINT);
    }
}