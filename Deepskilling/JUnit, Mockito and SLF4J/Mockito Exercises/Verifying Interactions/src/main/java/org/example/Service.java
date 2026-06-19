package org.example;
import org.example.ExternalAPI;
public class Service {
    private ExternalAPI api;
    public Service(ExternalAPI api){
        this.api = api;
    }
    public String fetchData(){
        return api.getData();
    }
}